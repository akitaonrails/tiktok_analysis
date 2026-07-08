package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1APl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178951APl {
    public static volatile C2178951APl LJ;
    public final C08U8 LIZ = new C08U8();
    public C2178971APn LIZIZ;
    public C2178991APp LIZJ;
    public boolean LIZLLL;

    public static C2178951APl LIZIZ() {
        if (LJ == null) {
            synchronized (C2178951APl.class) {
                try {
                    if (LJ == null) {
                        LJ = new C2178951APl();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public C2178951APl() {
        LIZ(new C2178941APk(new C2178931APj()));
    }

    public final void LIZ(C2178941APk c2178941APk) {
        C2178971APn c2178971APn = new C2178971APn(c2178941APk);
        this.LIZIZ = c2178971APn;
        this.LIZJ = new C2178991APp(this.LIZ, c2178971APn, 10000L, 5);
        this.LIZLLL = c2178941APk.LIZLLL;
    }
}
