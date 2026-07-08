package com.bef.effectsdk.view;

/* JADX INFO: loaded from: classes26.dex */
public class BEFView$Color {
    public float a;
    public float b;
    public float g;
    public float r;

    public BEFView$Color() {
        setColor(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float alpha() {
        return this.a;
    }

    public float blue() {
        return this.b;
    }

    public float green() {
        return this.g;
    }

    public float red() {
        return this.r;
    }

    public BEFView$Color(float f, float f2, float f3, float f4) {
        setColor(f, f2, f3, f4);
    }

    public void setColor(float f, float f2, float f3, float f4) {
        this.r = f;
        this.g = f2;
        this.b = f3;
        this.a = f4;
    }
}
