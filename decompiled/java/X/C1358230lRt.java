package X;

/* JADX INFO: renamed from: X.0lRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358230lRt {
    public static volatile long LIZ;
    public static volatile long LIZIZ;
    public static volatile long LIZJ;
    public static volatile long LIZLLL;
    public static volatile long LJ;
    public static volatile long LJFF;
    public static volatile long LJI;
    public static volatile boolean LJII = true;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static String LJIIJ;

    public static void LIZ() {
        if (LIZ == 0 || LJI != 0) {
            return;
        }
        LJI = System.currentTimeMillis();
    }

    public static void LIZIZ() {
        if (LIZ == 0 || LJFF != 0) {
            return;
        }
        LJFF = System.currentTimeMillis();
    }

    public static Long LIZJ(long j, long j2) {
        if (j != 0 && j2 != 0 && j2 >= j) {
            return Long.valueOf(j2 - j);
        }
        return null;
    }
}
