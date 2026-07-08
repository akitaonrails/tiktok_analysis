package X;

/* JADX INFO: renamed from: X.19PB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PB {
    public static final C19PB LJIIJ;
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float[] LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;

    static {
        float f;
        float f2;
        float[] fArr = C19PC.LIZJ;
        float fLIZJ = (float) ((((double) C19PC.LIZJ()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C19PC.LIZ;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr3[0] * f3;
        float f5 = fArr[1];
        float f6 = f4 + (fArr3[1] * f5);
        float f7 = fArr[2];
        float f8 = f6 + (fArr3[2] * f7);
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[0] * f3) + (fArr4[1] * f5) + (fArr4[2] * f7);
        float[] fArr5 = fArr2[2];
        float f10 = (f3 * fArr5[0]) + (f5 * fArr5[1]) + (f7 * fArr5[2]);
        if (1.0f >= 0.9d) {
            f = 0.100000046f;
            f2 = 0.59f;
        } else {
            f = 0.12999998f;
            f2 = 0.525f;
        }
        float f11 = f2 + f;
        float fExp = (1.0f - (((float) Math.exp(((-fLIZJ) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * fExp) + 1.0f) - fExp, (((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp};
        float f12 = 1.0f / ((5.0f * fLIZJ) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float fCbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(((double) fLIZJ) * 5.0d))) + (f13 * fLIZJ);
        float fLIZJ2 = C19PC.LIZJ() / fArr[1];
        double d2 = fLIZJ2;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float fPow2 = (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f10)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f9)) / 100.0d, 0.42d), fPow2};
        float f15 = fArr7[0];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f18 = fArr7[1];
        LJIIJ = new C19PB(fLIZJ2, ((f16 * 2.0f) + ((f18 * 400.0f) / (f18 + 27.13f)) + (((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f)) * fPow, fPow, fPow, f11, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C19PB(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.LJFF = f;
        this.LIZ = f2;
        this.LIZIZ = f3;
        this.LIZJ = f4;
        this.LIZLLL = f5;
        this.LJ = f6;
        this.LJI = fArr;
        this.LJII = f7;
        this.LJIIIIZZ = f8;
        this.LJIIIZ = f9;
    }
}
