package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0smF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639930smF {
    public static final C1639930smF LIZ = new C1639930smF();
    public static volatile C1639940smG LIZIZ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0smG] */
    public final InterfaceC1642310sq5 LIZIZ() {
        if (LIZIZ == null) {
            synchronized (this) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1639710slt() { // from class: X.0smG
                            public final C1639950smH LJII = C1639950smH.LL;

                            @Override // X.C1639710slt, X.InterfaceC1642310sq5
                            public final InterfaceC1456340o08<String> LIZJ() {
                                return this.LJII;
                            }
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1639940smG c1639940smG = LIZIZ;
        return c1639940smG == null ? new C1639710slt() { // from class: X.0smG
            public final C1639950smH LJII = C1639950smH.LL;

            @Override // X.C1639710slt, X.InterfaceC1642310sq5
            public final InterfaceC1456340o08<String> LIZJ() {
                return this.LJII;
            }
        } : c1639940smG;
    }

    public final void LIZ() {
        ((C1639710slt) LIZIZ()).LIZIZ().LJIILIIL();
        ((C1639710slt) LIZIZ()).LIZLLL().LIZJ();
        synchronized (this) {
            try {
                C1639940smG c1639940smG = LIZIZ;
                if (c1639940smG != null) {
                    c1639940smG.LJFF();
                }
                LIZIZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
