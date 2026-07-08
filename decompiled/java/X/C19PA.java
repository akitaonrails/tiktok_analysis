package X;

import android.graphics.Color;

/* JADX INFO: renamed from: X.19PA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PA {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;

    public static C19PA LIZ(int i) {
        float f;
        C19PB c19pb = C19PB.LJIIJ;
        float fLIZIZ = C19PC.LIZIZ(Color.red(i));
        float fLIZIZ2 = C19PC.LIZIZ(Color.green(i));
        float fLIZIZ3 = C19PC.LIZIZ(Color.blue(i));
        float[][] fArr = C19PC.LIZLLL;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[0] * fLIZIZ) + (fArr2[1] * fLIZIZ2) + (fArr2[2] * fLIZIZ3);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[0] * fLIZIZ) + (fArr3[1] * fLIZIZ2) + (fArr3[2] * fLIZIZ3);
        float[] fArr4 = fArr[2];
        float f4 = (fLIZIZ * fArr4[0]) + (fLIZIZ2 * fArr4[1]) + (fLIZIZ3 * fArr4[2]);
        float[][] fArr5 = C19PC.LIZ;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[0] * f2) + (fArr6[1] * f3) + (fArr6[2] * f4);
        float[] fArr7 = fArr5[1];
        float f6 = (fArr7[0] * f2) + (fArr7[1] * f3) + (fArr7[2] * f4);
        float[] fArr8 = fArr5[2];
        float f7 = (f2 * fArr8[0]) + (f3 * fArr8[1]) + (f4 * fArr8[2]);
        float[] fArr9 = c19pb.LJI;
        float f8 = fArr9[0] * f5;
        float f9 = fArr9[1] * f6;
        float f10 = fArr9[2] * f7;
        float fPow = (float) Math.pow(((double) (c19pb.LJII * Math.abs(f8))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (c19pb.LJII * Math.abs(f9))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (c19pb.LJII * Math.abs(f10))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f8) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f9) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f10) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f11 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d)) / 11.0f;
        float f12 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f13 = fSignum2 * 20.0f;
        float f14 = (((fSignum * 20.0f) + f13) + (21.0f * fSignum3)) / 20.0f;
        float f15 = (((fSignum * 40.0f) + f13) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f16 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f15 * c19pb.LIZIZ) / c19pb.LIZ, c19pb.LIZLLL * c19pb.LJIIIZ)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        if (fAtan2 < 20.14d) {
            f = 360.0f + fAtan2;
        } else {
            f = fAtan2;
        }
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, c19pb.LJFF), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) f) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c19pb.LJ) * c19pb.LIZJ) * ((float) Math.sqrt((f11 * f11) + (f12 * f12)))) / (f14 + 0.305f), 0.9d));
        float f18 = c19pb.LJIIIIZZ * fSqrt;
        Math.sqrt((r7 * c19pb.LIZLLL) / (c19pb.LIZ + 4.0f));
        float f19 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f18 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f16;
        return new C19PA(fAtan2, fSqrt, fPow4, f19, ((float) Math.cos(d2)) * fLog, fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ(X.C19PB r18) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19PA.LIZJ(X.19PB):int");
    }

    public static C19PA LIZIZ(float f, float f2, float f3) {
        C19PB c19pb = C19PB.LJIIJ;
        Math.sqrt(((double) f) / 100.0d);
        float f4 = c19pb.LJIIIIZZ * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r3))) * c19pb.LIZLLL) / (c19pb.LIZ + 4.0f));
        float f5 = (3.1415927f * f3) / 180.0f;
        float fLog = ((float) Math.log((((double) f4) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = f5;
        return new C19PA(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    public C19PA(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
        this.LJFF = f6;
    }
}
