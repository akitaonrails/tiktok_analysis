package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0rIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583220rIm {
    public static volatile boolean LIZ;
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static long LJ = -1;
    public static long LJFF = -1;

    public static void LIZ(int i) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        if (!LIZ) {
            return;
        }
        LIZ = false;
        if (i != 0) {
            j = -1;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    j5 = -1;
                    j3 = -1;
                    j2 = -1;
                    j4 = -1;
                } else {
                    j6 = LIZJ - LIZIZ;
                    j7 = LJ;
                    if (j7 != -1) {
                        j2 = j7 - LIZLLL;
                    } else {
                        j2 = -1;
                    }
                    j8 = LJFF;
                    if (j8 == -1) {
                        j3 = -1;
                    }
                    j4 = -1;
                    j = j6;
                    j5 = -1;
                }
            } else {
                j6 = LIZJ - LIZIZ;
                j7 = LJ;
                j2 = j7 - LIZLLL;
                j8 = LJFF;
            }
            j3 = j8 - j7;
            j4 = -1;
            j = j6;
            j5 = -1;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            j = LIZJ - LIZIZ;
            long j9 = LJ;
            long j10 = LIZLLL;
            j2 = j9 - j10;
            long j11 = LJFF;
            j3 = j11 - j9;
            j4 = jCurrentTimeMillis - j11;
            j5 = jCurrentTimeMillis - j10;
        }
        C1593850rZv.LIZ.getClass();
        C20684815ws.LJIJI("repost_feed_load_time", new Pair(Integer.valueOf(i), "result"), new Pair(Long.valueOf(j), "duration_touch_down"), new Pair(Long.valueOf(j2), "duration_before_network"), new Pair(Long.valueOf(j3), "duration_network"), new Pair(Long.valueOf(j4), "duration_after_network"), new Pair(Long.valueOf(j5), "duration"));
    }
}
