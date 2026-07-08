package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0tyi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686100tyi {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public final float[] LJIIIZ;
    public final float LJIIJ;
    public final float LJIIJJI;
    public final float LJIIL;
    public final float LJIILIIL;
    public final float LJIILJJIL;
    public final boolean LJIILL;
    public final float LJIILLIIL;
    public final float LJIIZILJ;

    public final void LIZ(float f) {
        float f2;
        if (this.LJIIL == -1.0f) {
            f2 = this.LIZIZ - f;
        } else {
            f2 = f - this.LIZ;
        }
        float f3 = f2 * this.LJIIJ;
        float f4 = 0.0f;
        if (f3 > 0.0f) {
            f4 = 1.0f;
            if (f3 < 1.0f) {
                float f5 = f3 * 100;
                int i = (int) f5;
                float[] fArr = this.LJIIIZ;
                float f6 = fArr[i];
                f4 = f6 + ((f5 - i) * (fArr[i + 1] - f6));
            }
        }
        double d = f4 * 1.5707964f;
        this.LJII = (float) Math.sin(d);
        this.LJIIIIZZ = (float) Math.cos(d);
    }

    public C1686100tyi(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        boolean z;
        float f7;
        float f8;
        float f9;
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
        this.LJFF = f6;
        float f10 = f5 - f3;
        float f11 = f6 - f4;
        boolean z2 = true;
        if (i == 1 || (i == 4 ? f11 > 0.0f : !(i != 5 || f11 >= 0.0f))) {
            z = true;
            f7 = -1.0f;
        } else {
            z = false;
            f7 = 1.0f;
        }
        this.LJIIL = f7;
        float f12 = 1 / (f2 - f);
        this.LJIIJ = f12;
        float[] fArr = new float[101];
        this.LJIIIZ = fArr;
        if (i != 3 && Math.abs(f10) >= 0.001f && Math.abs(f11) >= 0.001f) {
            this.LJIILIIL = f10 * f7;
            this.LJIILJJIL = f11 * (-f7);
            if (z) {
                f8 = f5;
            } else {
                f8 = f3;
            }
            this.LJIILLIIL = f8;
            if (z) {
                f9 = f4;
            } else {
                f9 = f6;
            }
            this.LJIIZILJ = f9;
            float f13 = f5 - f3;
            float f14 = f4 - f6;
            float[] fArr2 = C1686220tyu.LIZ;
            int i2 = 90;
            float f15 = 90;
            float f16 = f14;
            float f18 = 0.0f;
            float fHypot = 0.0f;
            int i3 = 1;
            while (true) {
                double radians = (float) Math.toRadians((((double) i3) * 90.0d) / ((double) i2));
                float fSin = ((float) Math.sin(radians)) * f13;
                float fCos = ((float) Math.cos(radians)) * f14;
                fHypot += (float) Math.hypot(fSin - f18, fCos - f16);
                fArr2[i3] = fHypot;
                if (i3 == 90) {
                    break;
                }
                i3++;
                i2 = 90;
                f16 = fCos;
                f18 = fSin;
            }
            this.LJI = fHypot;
            int i4 = 1;
            while (true) {
                fArr2[i4] = fArr2[i4] / fHypot;
                if (i4 == 90) {
                    break;
                } else {
                    i4++;
                }
            }
            int length = fArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                float f19 = i5 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f19);
                if (iBinarySearch >= 0) {
                    fArr[i5] = iBinarySearch / f15;
                } else if (iBinarySearch == -1) {
                    fArr[i5] = 0.0f;
                } else {
                    int i6 = -iBinarySearch;
                    int i7 = i6 - 2;
                    float f20 = i7;
                    float f21 = fArr2[i7];
                    fArr[i5] = (f20 + ((f19 - f21) / (fArr2[i6 - 1] - f21))) / f15;
                }
            }
            this.LJIIJJI = this.LJI * this.LJIIJ;
            z2 = false;
        } else {
            float fHypot2 = (float) Math.hypot(f11, f10);
            this.LJI = fHypot2;
            this.LJIIJJI = fHypot2 * f12;
            this.LJIILLIIL = f10 * f12;
            this.LJIIZILJ = f11 * f12;
            this.LJIILIIL = Float.NaN;
            this.LJIILJJIL = Float.NaN;
        }
        this.LJIILL = z2;
    }
}
