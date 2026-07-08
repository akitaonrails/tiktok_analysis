package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jGJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274170jGJ {
    public static final Object LIZ = new Object();
    public static double LIZIZ = 0.0d;
    public static int LIZJ = 0;
    public static double LIZLLL = 0.0d;
    public static int LJ = 0;
    public static final Object LJFF = new Object();
    public static double LJI = 0.0d;
    public static int LJII = 0;

    public static void LIZLLL() {
        synchronized (LJFF) {
            try {
                LJI = 0.0d;
                LJII = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static long LJ() {
        long j;
        if (LJII <= 0) {
            return 0L;
        }
        synchronized (LJFF) {
            try {
                j = (long) (LJI / ((double) LJII));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return j;
    }

    public static double LJFF() {
        double d;
        if (LJ <= 0) {
            return 0.0d;
        }
        synchronized (LIZ) {
            try {
                d = LIZLLL / ((double) LJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return d;
    }

    public static void LIZ(long j) {
        synchronized (LJFF) {
            try {
                double d = LJI + j;
                LJI = d;
                int i = LJII + 1;
                LJII = i;
                if (i > 50) {
                    LJI = d / ((double) i);
                    LJII = 1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(double d) {
        synchronized (LIZ) {
            try {
                double d2 = LIZIZ + d;
                LIZIZ = d2;
                int i = LIZJ + 1;
                LIZJ = i;
                if (i > 100) {
                    LIZIZ = d2 / ((double) i);
                    LIZJ = 1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ(double d) {
        synchronized (LIZ) {
            try {
                double d2 = LIZLLL + d;
                LIZLLL = d2;
                int i = LJ + 1;
                LJ = i;
                if (i > 100) {
                    LIZLLL = d2 / ((double) i);
                    LJ = 1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
