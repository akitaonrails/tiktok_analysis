package X;

/* JADX INFO: renamed from: X.0no2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448840no2 {
    public static volatile long LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile long LJ;
    public static final C1448840no2 LIZ = new C1448840no2();
    public static final C13E8<long[]> LIZLLL = new C13E8<>();

    public static long LIZJ(long j, long j2, long j3, long j4) {
        if (j <= j3) {
            j = j3;
        }
        if (j2 >= j4) {
            j2 = j4;
        }
        long j5 = j2 - j;
        if (j5 <= 0) {
            return 0L;
        }
        return j5;
    }

    public static final synchronized long LIZIZ(long j, long j2) {
        long jLIZJ;
        if (j2 <= j) {
            return 0L;
        }
        if (LIZIZ > 0 && j < LIZIZ) {
            jLIZJ = LIZJ(j, j2, j, LIZIZ) + 0;
        } else {
            jLIZJ = 0;
        }
        for (long[] jArr : LIZLLL) {
            jLIZJ += LIZJ(j, j2, jArr[0], jArr[1]);
        }
        long j3 = LJ;
        if (j3 > 0) {
            jLIZJ += LIZJ(j, j2, j3, System.currentTimeMillis());
        }
        long j4 = j2 - j;
        if (jLIZJ > j4) {
            jLIZJ = j4;
        }
        return jLIZJ;
    }

    public final synchronized void LIZ(long j, long j2) {
        if (j2 > j) {
            LIZLLL.addLast(new long[]{j, j2});
            while (true) {
                C13E8<long[]> c13e8 = LIZLLL;
                if (c13e8.size() <= 64) {
                    break;
                } else {
                    c13e8.removeFirst();
                }
            }
        }
    }
}
