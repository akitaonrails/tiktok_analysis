package X;

/* JADX INFO: renamed from: X.13KM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13KM {
    public static boolean LIZ(long j, String str) {
        if (j > 0 && j <= 10000 && (C13KN.LIZJ(str).longValue() >>> 32) % (10000 / j) != 0) {
            return false;
        }
        return true;
    }
}
