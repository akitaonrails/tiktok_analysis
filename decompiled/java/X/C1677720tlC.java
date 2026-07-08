package X;

/* JADX INFO: renamed from: X.0tlC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677720tlC {
    public static final float LIZIZ(float f, float f2, float f3) {
        return ((1 - f3) * f) + (f3 * f2);
    }

    public static final float LIZ(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / ((long) 3))) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final int LIZJ(float f, int i, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }
}
