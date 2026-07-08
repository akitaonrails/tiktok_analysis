package X;

import Y.ARunnableS107S0000000_34;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.1BCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201111BCr {
    public static boolean LIZIZ;
    public static C1BDF LJ;
    public static final Set<C1BDD> LIZ = new LinkedHashSet();
    public static final ARunnableS107S0000000_34 LIZJ = new ARunnableS107S0000000_34(5);
    public static final List<C1BDE> LIZLLL = new ArrayList();

    public static void LIZ() {
        try {
            if (LIZIZ) {
                return;
            }
            List<C1BDE> list = LIZLLL;
            if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
                return;
            }
            for (C1BDE c1bde : (ArrayList) list) {
                if (c1bde != null && c1bde.LIZLLL()) {
                    LIZIZ = true;
                    ARunnableS107S0000000_34 aRunnableS107S0000000_34 = LIZJ;
                    C1BDF c1bdf = LJ;
                    long j = 3000;
                    if (c1bdf != null) {
                        long jLJ = c1bdf.LJ();
                        if (jLJ > 0) {
                            j = jLJ;
                        }
                    }
                    C0NBO.LIZJ(j, aRunnableS107S0000000_34);
                    return;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C2200821BBo.LIZIZ) {
                throw th;
            }
        }
    }

    public static void LIZIZ() {
        try {
            if (LIZIZ) {
                List<C1BDE> list = LIZLLL;
                if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
                    for (C1BDE c1bde : (ArrayList) list) {
                        if (c1bde != null && c1bde.LIZLLL()) {
                            return;
                        }
                    }
                }
                C0NBO.LIZIZ().removeCallbacks(LIZJ);
                LIZIZ = false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C2200821BBo.LIZIZ) {
                throw th;
            }
        }
    }
}
