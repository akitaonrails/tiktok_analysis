package X;

import com.bytedance.apm6.cpu.ApmCpuManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0V9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793090V9f extends C0V7U {
    public volatile C793100V9g LIZ;
    public final C0V7R LIZIZ;

    @Override // X.C0V7U, X.InterfaceC792690V7r
    public final void LIZLLL() {
        C793100V9g c793100V9g = this.LIZ;
        synchronized (c793100V9g) {
            InterfaceC793220V9s interfaceC793220V9s = c793100V9g.LJFF;
            if (interfaceC793220V9s == null || !c793100V9g.LIZ) {
                return;
            }
            if (c793100V9g.LIZJ) {
                c793100V9g.LIZJ = false;
                interfaceC793220V9s.LIZJ(false);
            }
        }
    }

    public final void LJI() {
        C793100V9g c793100V9g = this.LIZ;
        synchronized (c793100V9g) {
            InterfaceC793220V9s interfaceC793220V9s = c793100V9g.LJFF;
            if (interfaceC793220V9s == null || !c793100V9g.LIZ) {
                return;
            }
            interfaceC793220V9s.LIZLLL();
            c793100V9g.LIZ = false;
        }
    }

    @Override // X.C0V7U, X.InterfaceC792690V7r
    public final void onBackground() {
        C793100V9g c793100V9g = this.LIZ;
        synchronized (c793100V9g) {
            InterfaceC793220V9s interfaceC793220V9s = c793100V9g.LJFF;
            if (interfaceC793220V9s == null || !c793100V9g.LIZ) {
                return;
            }
            if (c793100V9g.LIZJ) {
                return;
            }
            c793100V9g.LIZJ = true;
            interfaceC793220V9s.LIZJ(true);
        }
    }

    public C793090V9f() {
        C0V7R c0v7r = (C0V7R) C792590V7h.LIZ(C0V7R.class);
        this.LIZIZ = c0v7r;
        this.LIZ = new C793100V9g(c0v7r);
        final C793100V9g c793100V9g = this.LIZ;
        AbstractC793160V9m abstractC793160V9m = new AbstractC793160V9m(c793100V9g) { // from class: X.0V9o
            @Override // X.AbstractC793160V9m
            public final boolean LJII() {
                return false;
            }

            @Override // X.AbstractC793160V9m
            public final long LJFF() {
                return this.LIZLLL ? 600000L : 30000L;
            }

            @Override // X.InterfaceC793220V9s
            public final EnumC793190V9p LIZIZ() {
                return EnumC793190V9p.PROCESS_DETECT;
            }

            @Override // X.AbstractC793160V9m
            public final boolean LJI(boolean z) {
                if (z) {
                    C0V9Y.LIZ.getClass();
                    C793100V9g c793100V9g2 = this.LIZ;
                    synchronized (c793100V9g2) {
                        c793100V9g2.LIZ(c793100V9g2.LJIIIIZZ);
                    }
                }
                return z;
            }
        };
        final C793100V9g c793100V9g2 = this.LIZ;
        AbstractC793160V9m abstractC793160V9m2 = new AbstractC793160V9m(c793100V9g2) { // from class: X.0V9n
            public int LJ;

            @Override // X.AbstractC793160V9m
            public final boolean LJII() {
                this.LJ = 0;
                this.LIZ.LIZIZ();
                return true;
            }

            @Override // X.AbstractC793160V9m
            public final long LJFF() {
                if (this.LIZLLL) {
                    return 300000L;
                }
                return Mp4ScreenVideoLoadTimeout.CONTROL;
            }

            @Override // X.InterfaceC793220V9s
            public final EnumC793190V9p LIZIZ() {
                return EnumC793190V9p.PROCESS_DOUBLE_DETECT;
            }

            @Override // X.AbstractC793160V9m, X.AbstractC793120V9i, X.InterfaceC793220V9s
            public final void LIZJ(boolean z) {
                if (z) {
                    this.LJ = 0;
                }
                super.LIZJ(z);
            }

            @Override // X.AbstractC793160V9m
            public final boolean LJI(boolean z) {
                if (z) {
                    this.LJ++;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("over time: ");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append(" max over time: ");
                    sbLIZ.append(2);
                    LJ(C2188811AlT.LIZIZ(sbLIZ));
                    if (this.LJ < 2) {
                        return false;
                    }
                    this.LJ = 0;
                    C793100V9g c793100V9g3 = this.LIZ;
                    synchronized (c793100V9g3) {
                        c793100V9g3.LIZ(c793100V9g3.LJIIIZ);
                    }
                    return true;
                }
                this.LJ = 0;
                this.LIZ.LIZIZ();
                return true;
            }
        };
        C793080V9e c793080V9e = new C793080V9e(this.LIZ);
        C793130V9j c793130V9j = new C793130V9j(this.LIZ);
        final C793100V9g c793100V9g3 = this.LIZ;
        AbstractC793120V9i abstractC793120V9i = new AbstractC793120V9i(c793100V9g3) { // from class: X.0V9k
            @Override // X.InterfaceC793220V9s
            public final EnumC793190V9p LIZIZ() {
                return EnumC793190V9p.IDLE;
            }

            @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
            public final void LIZLLL() {
                super.LIZLLL();
            }

            @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
            public final void LIZJ(boolean z) {
                super.LIZJ(z);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("life cycle change when state is idle, lifecycle change to back?: ");
                sbLIZ.append(z);
                LJ(C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LIZIZ();
            }

            @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
            public final void LIZ(C0V9K c0v9k, boolean z) {
                super.LIZ(c0v9k, z);
                this.LIZ.LIZIZ();
            }
        };
        C793100V9g c793100V9g4 = this.LIZ;
        if (!c793100V9g4.LIZIZ) {
            c793100V9g4.LJII = abstractC793160V9m;
            c793100V9g4.LJIIIIZZ = abstractC793160V9m2;
            c793100V9g4.LJIIIZ = c793080V9e;
            c793100V9g4.LJIIJ = c793130V9j;
            c793100V9g4.LJIIJJI = abstractC793120V9i;
            try {
                c793100V9g4.LJ = C0VAA.LIZ(C792400V6o.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            c793100V9g4.LIZIZ = true;
        }
        this.LIZIZ.LIZ(this);
    }

    public final void LJFF(C0V9K c0v9k) {
        C793100V9g c793100V9g = this.LIZ;
        synchronized (c793100V9g) {
            if (!c793100V9g.LIZ && c793100V9g.LIZIZ) {
                c793100V9g.LJI = c0v9k;
                boolean z = true;
                c793100V9g.LIZ = true;
                C0V9N.LIZ = ApmCpuManager.getInstance().getCpuSceneString();
                if (c793100V9g.LIZLLL.isForeground()) {
                    z = false;
                }
                c793100V9g.LIZJ = z;
                c793100V9g.LIZIZ();
            }
        }
    }
}
