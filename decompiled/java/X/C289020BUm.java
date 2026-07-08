package X;

/* JADX INFO: renamed from: X.0BUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C289020BUm {
    public static long LIZ = -1;

    public static boolean LIZ() {
        if (!((Boolean) C289010BUl.LIZIZ.getValue()).booleanValue()) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LIZ;
        if (j != -1 && jCurrentTimeMillis - j <= 400) {
            return false;
        }
        LIZ = jCurrentTimeMillis;
        return true;
    }
}
