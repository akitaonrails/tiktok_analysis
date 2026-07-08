package X;

/* JADX INFO: renamed from: X.0jrb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297290jrb {
    public static final String LIZ(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            if (f < 0.0f) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        if (iMax > 0) {
            return String.valueOf(f3);
        }
        return String.valueOf((int) f3);
    }
}
