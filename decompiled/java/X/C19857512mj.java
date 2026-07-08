package X;

/* JADX INFO: renamed from: X.12mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19857512mj {
    public static boolean LIZ(double d, double d2) {
        if (Double.isNaN(d) || Double.isInfinite(d) || Double.isNaN(d2) || Double.isInfinite(d2) || d < -90.0d || d > 90.0d || d2 < -180.0d || d2 > 180.0d) {
            return false;
        }
        if (Math.abs(d) <= 1.0E-6d && Math.abs(d2) <= 1.0E-6d) {
            return false;
        }
        return true;
    }
}
