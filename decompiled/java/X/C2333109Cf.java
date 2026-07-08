package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.09Cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2333109Cf {
    public static final C2333109Cf LIZ = new C2333109Cf();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2333209Cg());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C2333309Ch());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(450));
    public static final C01GW LJ = C452501pT.LIZIZ(new C2333509Cj());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C2333409Ci());
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(449));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(448));
    public static final C2332909Cd LJIIIIZZ = new ThreadLocal<Boolean>() { // from class: X.09Cd
        @Override // java.lang.ThreadLocal
        public final Boolean initialValue() {
            return Boolean.FALSE;
        }
    };

    public static void LIZ(final Runnable runnable) {
        long j = C2333609Ck.LIZ;
        if (j != -1) {
            C0CN5.LIZIZ(Long.valueOf(j), new Runnable() { // from class: X.09Ce
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GsonReflectExperiment@d46e.forcePreloadAdapter$1");
                    try {
                        try {
                            C2332909Cd c2332909Cd = C2333109Cf.LJIIIIZZ;
                            c2332909Cd.set(Boolean.TRUE);
                            runnable.run();
                            c2332909Cd.set(Boolean.FALSE);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C2333109Cf.LJIIIIZZ.set(Boolean.FALSE);
                            throw th;
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GsonReflectExperiment@d46e.forcePreloadAdapter$1");
                }
            });
            return;
        }
        try {
            C2332909Cd c2332909Cd = LJIIIIZZ;
            c2332909Cd.set(Boolean.TRUE);
            runnable.run();
            c2332909Cd.set(Boolean.FALSE);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIIIZZ.set(Boolean.FALSE);
            throw th;
        }
    }

    public static boolean LIZIZ(int i) {
        if ((((Number) LIZIZ.getValue()).intValue() & i) == i) {
            return true;
        }
        return false;
    }
}
