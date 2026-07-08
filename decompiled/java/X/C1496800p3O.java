package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0p3O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496800p3O {
    public static C1496750p3J LIZ;
    public static long LIZIZ;
    public static final C1496800p3O LIZJ = new C1496800p3O();

    public static final C1496750p3J LIZIZ() {
        synchronized (LIZJ) {
            try {
                C1496750p3J c1496750p3J = LIZ;
                if (c1496750p3J == null) {
                    return new C1496750p3J();
                }
                LIZ = c1496750p3J.LJFF;
                c1496750p3J.LJFF = null;
                LIZIZ -= (long) 8192;
                return c1496750p3J;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LIZ(C1496750p3J c1496750p3J) {
        if (c1496750p3J.LJFF == null && c1496750p3J.LJI == null) {
            if (c1496750p3J.LIZLLL) {
                return;
            }
            synchronized (LIZJ) {
                try {
                    long j = LIZIZ + ((long) 8192);
                    if (j > 65536) {
                        return;
                    }
                    LIZIZ = j;
                    c1496750p3J.LJFF = LIZ;
                    c1496750p3J.LIZJ = 0;
                    c1496750p3J.LIZIZ = 0;
                    LIZ = c1496750p3J;
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
