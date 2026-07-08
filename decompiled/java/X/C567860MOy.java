package X;

/* JADX INFO: renamed from: X.0MOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567860MOy {
    public static final boolean LIZIZ(int i, int i2) {
        return i2 <= 0 || i <= 0 || ((float) i) / ((float) i2) > 0.75f;
    }

    public static final float LIZ(int i, int i2) {
        if (i <= 0 || i2 <= 0 || LIZIZ(i, i2)) {
            return 1.0f;
        }
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        if (0.5625f <= f3 && f3 <= 0.75f) {
            return f3 / 0.5625f;
        }
        return (f2 / f) * 0.5625f;
    }
}
