package X;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: X.19KH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19KH {
    public final Path LIZ = new Path();
    public float LIZIZ;
    public float LIZJ;

    public final void LIZIZ() {
        this.LIZ.close();
    }

    public C19KH(C2257271DWr c2257271DWr) {
        boolean z;
        boolean z2;
        if (c2257271DWr == null) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < c2257271DWr.LIZIZ; i2++) {
            byte b = c2257271DWr.LIZ[i2];
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 8) {
                                if ((b & 2) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if ((b & 1) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                float[] fArr = c2257271DWr.LIZJ;
                                int i3 = i + 1;
                                float f = fArr[i];
                                int i4 = i3 + 1;
                                float f2 = fArr[i3];
                                int i5 = i4 + 1;
                                float f3 = fArr[i4];
                                int i6 = i5 + 1;
                                i = i6 + 1;
                                LIZ(f, f2, z, z2, f3, fArr[i5], fArr[i6]);
                            } else {
                                LIZIZ();
                            }
                        } else {
                            float[] fArr2 = c2257271DWr.LIZJ;
                            int i7 = i + 1;
                            float f4 = fArr2[i];
                            int i8 = i7 + 1;
                            float f5 = fArr2[i7];
                            int i9 = i8 + 1;
                            i = i9 + 1;
                            LIZLLL(f4, f5, fArr2[i8], fArr2[i9]);
                        }
                    } else {
                        float[] fArr3 = c2257271DWr.LIZJ;
                        int i10 = i + 1;
                        float f6 = fArr3[i];
                        int i11 = i10 + 1;
                        float f7 = fArr3[i10];
                        int i12 = i11 + 1;
                        float f8 = fArr3[i11];
                        int i13 = i12 + 1;
                        float f9 = fArr3[i12];
                        int i14 = i13 + 1;
                        float f10 = fArr3[i13];
                        i = i14 + 1;
                        float f11 = fArr3[i14];
                        this.LIZ.cubicTo(f6, f7, f8, f9, f10, f11);
                        this.LIZIZ = f10;
                        this.LIZJ = f11;
                    }
                } else {
                    float[] fArr4 = c2257271DWr.LIZJ;
                    int i15 = i + 1;
                    float f12 = fArr4[i];
                    i = i15 + 1;
                    float f13 = fArr4[i15];
                    this.LIZ.lineTo(f12, f13);
                    this.LIZIZ = f12;
                    this.LIZJ = f13;
                }
            } else {
                float[] fArr5 = c2257271DWr.LIZJ;
                int i16 = i + 1;
                float f14 = fArr5[i];
                i = i16 + 1;
                LIZJ(f14, fArr5[i16]);
            }
        }
    }

    public final void LIZJ(float f, float f2) {
        this.LIZ.moveTo(f, f2);
        this.LIZIZ = f;
        this.LIZJ = f2;
    }

    public final void LIZLLL(float f, float f2, float f3, float f4) {
        this.LIZ.quadTo(f, f2, f3, f4);
        this.LIZIZ = f3;
        this.LIZJ = f4;
    }

    public final void LIZ(float f, float f2, boolean z, boolean z2, float f3, float f4, float f5) {
        double d;
        double d2;
        double d3;
        double dAcos;
        float f6 = this.LIZIZ;
        float f7 = this.LIZJ;
        if (f6 != f4 || f7 != f5) {
            if (f != 0.0f && f2 != 0.0f) {
                float fAbs = Math.abs(f);
                float fAbs2 = Math.abs(f2);
                double radians = Math.toRadians(((double) f3) % 360.0d);
                double dCos = Math.cos(radians);
                double dSin = Math.sin(radians);
                double d4 = ((double) (f6 - f4)) / 2.0d;
                double d5 = ((double) (f7 - f5)) / 2.0d;
                double d6 = (dCos * d4) + (dSin * d5);
                double d7 = ((-dSin) * d4) + (d5 * dCos);
                double d8 = fAbs * fAbs;
                double d9 = fAbs2 * fAbs2;
                double d10 = d6 * d6;
                double d11 = d7 * d7;
                double d12 = (d10 / d8) + (d11 / d9);
                if (d12 > 0.99999d) {
                    double dSqrt = Math.sqrt(d12) * 1.00001d;
                    fAbs = (float) (((double) fAbs) * dSqrt);
                    fAbs2 = (float) (dSqrt * ((double) fAbs2));
                    d8 = fAbs * fAbs;
                    d9 = fAbs2 * fAbs2;
                }
                if (z == z2) {
                    d = -1.0d;
                } else {
                    d = 1.0d;
                }
                double d13 = d8 * d9;
                double d14 = d8 * d11;
                double d15 = d9 * d10;
                double d16 = ((d13 - d14) - d15) / (d14 + d15);
                if (d16 < 0.0d) {
                    d16 = 0.0d;
                }
                double dSqrt2 = d * Math.sqrt(d16);
                double d17 = fAbs;
                double d18 = fAbs2;
                double d19 = ((d17 * d7) / d18) * dSqrt2;
                double d20 = dSqrt2 * (-((d18 * d6) / d17));
                double d21 = (((double) (f6 + f4)) / 2.0d) + ((dCos * d19) - (dSin * d20));
                double d22 = (((double) (f7 + f5)) / 2.0d) + (dSin * d19) + (dCos * d20);
                double d23 = (d6 - d19) / d17;
                double d24 = (d7 - d20) / d18;
                double d25 = ((-d6) - d19) / d17;
                double d26 = ((-d7) - d20) / d18;
                double d27 = (d23 * d23) + (d24 * d24);
                double dSqrt3 = Math.sqrt(d27);
                if (d24 < 0.0d) {
                    d2 = -1.0d;
                } else {
                    d2 = 1.0d;
                }
                double dAcos2 = d2 * Math.acos(d23 / dSqrt3);
                double dSqrt4 = Math.sqrt(d27 * ((d25 * d25) + (d26 * d26)));
                double d28 = (d23 * d25) + (d24 * d26);
                if ((d23 * d26) - (d24 * d25) < 0.0d) {
                    d3 = -1.0d;
                } else {
                    d3 = 1.0d;
                }
                double d29 = d28 / dSqrt4;
                if (d29 < -1.0d) {
                    dAcos = 3.141592653589793d;
                } else if (d29 > 1.0d) {
                    dAcos = 0.0d;
                } else {
                    dAcos = Math.acos(d29);
                }
                double d30 = d3 * dAcos;
                if (d30 == 0.0d) {
                    this.LIZ.lineTo(f4, f5);
                    this.LIZIZ = f4;
                    this.LIZJ = f5;
                } else {
                    if (!z2) {
                        if (d30 > 0.0d) {
                            d30 -= 6.283185307179586d;
                        }
                    } else if (d30 < 0.0d) {
                        d30 += 6.283185307179586d;
                    }
                    double d31 = d30 % 6.283185307179586d;
                    double d32 = dAcos2 % 6.283185307179586d;
                    int iCeil = (int) Math.ceil((Math.abs(d31) * 2.0d) / 3.141592653589793d);
                    double d33 = d31 / ((double) iCeil);
                    double d34 = d33 / 2.0d;
                    double dSin2 = (Math.sin(d34) * 1.3333333333333333d) / (Math.cos(d34) + 1.0d);
                    int i = iCeil * 6;
                    float[] fArr = new float[i];
                    int i2 = 0;
                    for (int i3 = 0; i3 < iCeil; i3++) {
                        double d35 = (((double) i3) * d33) + d32;
                        double dCos2 = Math.cos(d35);
                        double dSin3 = Math.sin(d35);
                        int i4 = i2 + 1;
                        fArr[i2] = (float) (dCos2 - (dSin2 * dSin3));
                        int i5 = i4 + 1;
                        fArr[i4] = (float) (dSin3 + (dCos2 * dSin2));
                        double d36 = d35 + d33;
                        double dCos3 = Math.cos(d36);
                        double dSin4 = Math.sin(d36);
                        int i6 = i5 + 1;
                        fArr[i5] = (float) ((dSin2 * dSin4) + dCos3);
                        int i7 = i6 + 1;
                        fArr[i6] = (float) (dSin4 - (dSin2 * dCos3));
                        int i8 = i7 + 1;
                        fArr[i7] = (float) dCos3;
                        i2 = i8 + 1;
                        fArr[i8] = (float) dSin4;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postScale(fAbs, fAbs2);
                    matrix.postRotate(f3);
                    matrix.postTranslate((float) d21, (float) d22);
                    matrix.mapPoints(fArr);
                    fArr[i - 2] = f4;
                    fArr[i - 1] = f5;
                    for (int i9 = 0; i9 < i; i9 += 6) {
                        float f8 = fArr[i9];
                        float f9 = fArr[i9 + 1];
                        float f10 = fArr[i9 + 2];
                        float f11 = fArr[i9 + 3];
                        float f12 = fArr[i9 + 4];
                        float f13 = fArr[i9 + 5];
                        this.LIZ.cubicTo(f8, f9, f10, f11, f12, f13);
                        this.LIZIZ = f12;
                        this.LIZJ = f13;
                    }
                }
            } else {
                this.LIZ.lineTo(f4, f5);
                this.LIZIZ = f4;
                this.LIZJ = f5;
            }
        }
        this.LIZIZ = f4;
        this.LIZJ = f5;
    }
}
