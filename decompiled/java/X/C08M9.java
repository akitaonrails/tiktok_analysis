package X;

/* JADX INFO: renamed from: X.08M9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08M9 {
    public static final int LIZ(long j, boolean z) {
        double d = j / 1024.0d;
        if (z) {
            d /= 1024.0d;
        }
        return C814420VxA.LIZ(d);
    }

    public static final double LIZIZ(double d, int i) {
        double dPow = Math.pow(10.0d, i);
        return ((double) C814420VxA.LIZ(d * dPow)) / dPow;
    }
}
