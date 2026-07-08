package X;

/* JADX INFO: renamed from: X.139d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199635139d {
    public static final char[] LIZ = "0123456789ABCDEF".toCharArray();

    public static int LIZ(long j, long j2) {
        int i;
        if (j2 > 0) {
            i = (int) (((j * 1.0d) / j2) * 100.0d);
        } else {
            i = 0;
        }
        return Math.min(Math.max(0, i), 100);
    }
}
