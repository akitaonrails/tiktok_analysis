package X;

import android.graphics.Path;

/* JADX INFO: renamed from: X.19Jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21518919Jj {
    public char LIZ;
    public final float[] LIZIZ;

    public C21518919Jj(C21518919Jj c21518919Jj) {
        this.LIZ = c21518919Jj.LIZ;
        float[] fArr = c21518919Jj.LIZIZ;
        this.LIZIZ = C21518819Ji.LIZIZ(fArr.length, fArr);
    }

    public C21518919Jj(char c, float[] fArr) {
        this.LIZ = c;
        this.LIZIZ = fArr;
    }

    public static void LIZ(float f, float f2, float f3, float f4, float f5, float f6, float f7, Path path, boolean z, boolean z2) {
        double d;
        double d2;
        boolean z3;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = f5;
        double d6 = ((d3 * dCos) + (d4 * dSin)) / d5;
        double d7 = f6;
        double d8 = ((((double) (-f)) * dSin) + (d4 * dCos)) / d7;
        double d9 = f4;
        double d10 = ((((double) f3) * dCos) + (d9 * dSin)) / d5;
        double d11 = ((((double) (-f3)) * dSin) + (d9 * dCos)) / d7;
        double d12 = d6 - d10;
        double d13 = d8 - d11;
        double d14 = (d6 + d10) / 2.0d;
        double d15 = (d8 + d11) / 2.0d;
        double d16 = (d12 * d12) + (d13 * d13);
        if (d16 == 0.0d) {
            return;
        }
        double d17 = (1.0d / d16) - 0.25d;
        if (d17 < 0.0d) {
            float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
            LIZ(f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, path, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d17);
        double d18 = d12 * dSqrt;
        double d19 = dSqrt * d13;
        if (z == z2) {
            d = d14 - d19;
            d2 = d15 + d18;
        } else {
            d = d14 + d19;
            d2 = d15 - d18;
        }
        double dAtan2 = Math.atan2(d8 - d2, d6 - d);
        double dAtan22 = Math.atan2(d11 - d2, d10 - d) - dAtan2;
        if (dAtan22 >= 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            if (dAtan22 > 0.0d) {
                dAtan22 -= 6.283185307179586d;
            } else {
                dAtan22 += 6.283185307179586d;
            }
        }
        double d20 = d * d5;
        double d21 = d2 * d7;
        double d22 = (d20 * dCos) - (d21 * dSin);
        double d23 = (d20 * dSin) + (d21 * dCos);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d24 = -d5;
        double d25 = d24 * dCos2;
        double d26 = d7 * dSin2;
        double d27 = (d25 * dSin3) - (d26 * dCos3);
        double d28 = d24 * dSin2;
        double d29 = d7 * dCos2;
        double d30 = (dSin3 * d28) + (dCos3 * d29);
        double d31 = dAtan22 / ((double) iCeil);
        int i = 0;
        while (i < iCeil) {
            double d32 = dAtan2 + d31;
            double dSin4 = Math.sin(d32);
            double dCos4 = Math.cos(d32);
            double d33 = (d22 + ((d5 * dCos2) * dCos4)) - (d26 * dSin4);
            double d34 = d23 + (d5 * dSin2 * dCos4) + (d29 * dSin4);
            double d35 = (d25 * dSin4) - (d26 * dCos4);
            double d36 = (dSin4 * d28) + (dCos4 * d29);
            double d37 = d32 - dAtan2;
            double dTan = Math.tan(d37 / 2.0d);
            double dSin5 = (Math.sin(d37) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) (d3 + (d27 * dSin5)), (float) (d4 + (d30 * dSin5)), (float) (d33 - (dSin5 * d35)), (float) (d34 - (dSin5 * d36)), (float) d33, (float) d34);
            i++;
            dAtan2 = d32;
            d30 = d36;
            d27 = d35;
            d3 = d33;
            d4 = d34;
        }
    }
}
