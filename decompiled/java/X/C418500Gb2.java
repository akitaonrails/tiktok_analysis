package X;

/* JADX INFO: renamed from: X.0Gb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418500Gb2 {
    public static final int LIZ(float f, float[] fArr, int i) {
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = f;
            if (f > 1.0f) {
                f2 = 1.0f;
            }
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }
}
