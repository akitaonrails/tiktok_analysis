package X;

/* JADX INFO: renamed from: X.0GQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415470GQv {
    public static final float LIZ(double d, float f) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        if (d <= 0.0d) {
            return fLIZLLL;
        }
        float f2 = (float) d;
        if (f2 <= 0.0f) {
            return fLIZLLL;
        }
        return C13LZ.LIZLLL(((float) Math.ceil(fLIZLLL / f2)) * f2, 0.0f, 1.0f);
    }
}
