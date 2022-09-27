package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonElvon;
    private Button buttonHozzaad;
    private TextView szamKimenet;
    public int szam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        buttonHozzaad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam++;
                if (szam>0){
                    szamKimenet.setText(String.valueOf(szam));
                    szamKimenet.setTextColor(Color.parseColor("#00ff00"));
                } else if (szam < 0){
                    szamKimenet.setText(String.valueOf(szam));
                    szamKimenet.setTextColor(Color.parseColor("#ff0000"));
                } else {
                    szamKimenet.setText(String.valueOf(szam));
                    szamKimenet.setTextColor(Color.parseColor("#0317fc"));
                }
            }
        });
        buttonElvon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam--;
                if (szam>0){
                    szamKimenet.setText(String.valueOf(szam));
                    szamKimenet.setTextColor(Color.parseColor("#00ff00"));
                } else if (szam < 0){
                    szamKimenet.setText(String.valueOf(szam));
                    szamKimenet.setTextColor(Color.parseColor("#ff0000"));
                } else {
                    szamKimenet.setText(String.valueOf(szam));
                    szamKimenet.setTextColor(Color.parseColor("#0317fc"));
                }

            }
        });
        szamKimenet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam = 0;
                szamKimenet.setText(String.valueOf(szam));
                szamKimenet.setTextColor(Color.parseColor("#0317fc"));
            }
        });

        };


        private void init(){
            buttonHozzaad = findViewById(R.id.buttonHozzaad);
            buttonElvon = findViewById(R.id.buttonElvon);
            szamKimenet = findViewById(R.id.szamText);

    }
}