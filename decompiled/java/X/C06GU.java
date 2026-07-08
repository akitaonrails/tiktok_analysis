package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06GU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06GU {
    public static volatile C1578606Ga LIZIZ;
    public static C1578606Ga LIZJ;
    public static final C06GU LIZ = new C06GU();
    public static C06GV LIZLLL = new C06GV(new C1603206Pm(), new C06K6(), null);

    public final C1578606Ga LIZ() {
        synchronized (this) {
            try {
                C1578606Ga c1578606Ga = LIZJ;
                if (c1578606Ga != null) {
                    return c1578606Ga;
                }
                C1590906Kt.LIZ("StreakResProviderFactory, ensureUnlockAnimProviderDelegate");
                C06GV c06gv = LIZLLL;
                C1578606Ga c1578606Ga2 = new C1578606Ga(new C06GV(c06gv.LIZ, c06gv.LIZIZ, null));
                LIZJ = c1578606Ga2;
                return c1578606Ga2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C1578606Ga LIZJ() {
        synchronized (this) {
            try {
                C1578606Ga c1578606Ga = LIZIZ;
                if (c1578606Ga != null) {
                    return c1578606Ga;
                }
                C1590906Kt.LIZ("StreakResProviderFactory, ensureResProviderDelegate");
                C1578606Ga c1578606Ga2 = new C1578606Ga(LIZIZ());
                LIZIZ = c1578606Ga2;
                return c1578606Ga2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL() {
        synchronized (this) {
            try {
                LIZIZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZLLL = new C06GV(new C1603206Pm(), new C06K6(), null);
    }

    public static C06GV LIZIZ() {
        if (C1603906Pt.LIZIZ().enableTuxSmallIcon) {
            C06GV c06gv = LIZLLL;
            return new C06GV(c06gv.LIZ, c06gv.LIZIZ, null);
        }
        int iIsAvailable = LIZLLL.LIZ.isAvailable();
        if (iIsAvailable == 0) {
            C06GV c06gv2 = LIZLLL;
            return new C06GV(c06gv2.LIZ, c06gv2.LIZIZ, null);
        }
        C06GZ c06k6 = LIZLLL.LIZIZ;
        if (c06k6 == null) {
            c06k6 = new C06K6();
        }
        return new C06GV(c06k6, null, Integer.valueOf(iIsAvailable));
    }
}
