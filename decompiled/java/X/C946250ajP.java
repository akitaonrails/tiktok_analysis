package X;

import android.os.SystemClock;
import android.util.Pair;

/* JADX INFO: renamed from: X.0ajP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946250ajP {
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static boolean LJII;
    public static int LJIIJ;
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static Pair<Long, Long> LJIIIIZZ = new Pair<>(0L, -1L);
    public static Pair<Long, Long> LJIIIZ = new Pair<>(0L, -1L);

    public static void LIZIZ() {
        LJIIIZ = new Pair<>(0L, -1L);
        LJIIIIZZ = new Pair<>(0L, -1L);
        LIZ = -1L;
        LIZIZ = -1L;
        LIZJ = -1L;
        LIZLLL = 0L;
        LJ = 0L;
        LJIIJ = 0;
        LJII = false;
        LJFF = 0L;
        LJI = 0L;
    }

    public static void LIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Number) LJIIIIZZ.second).longValue() > 0) {
            LJIIIIZZ = new Pair<>(Long.valueOf(((Number) LJIIIIZZ.first).longValue() + (jElapsedRealtime - ((Number) LJIIIIZZ.second).longValue())), 0L);
        }
        if (((Number) LJIIIZ.second).longValue() > 0) {
            LJIIIZ = new Pair<>(Long.valueOf(((Number) LJIIIZ.first).longValue() + (jElapsedRealtime - ((Number) LJIIIZ.second).longValue())), 0L);
        }
    }

    public static void LIZJ(int i, long j) {
        if (i > 2) {
            LJIIIIZZ = new Pair<>(LJIIIIZZ.first, 0L);
            LJIIIZ = new Pair<>(LJIIIZ.first, Long.valueOf(j));
        } else {
            LJIIIIZZ = new Pair<>(LJIIIIZZ.first, Long.valueOf(j));
            LJIIIZ = new Pair<>(LJIIIZ.first, 0L);
        }
    }
}
