package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YKS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YKS implements InterfaceC864380XvY {
    public final C872370YKd LIZ;
    public AbstractC2252651DEx LIZIZ;
    public final Object LIZJ = new Object();
    public final Object LIZLLL = new Object();

    @Override // X.InterfaceC864380XvY
    public final void LIZ() {
        synchronized (this.LIZJ) {
            try {
                this.LIZIZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        synchronized (this.LIZLLL) {
        }
    }

    @Override // X.InterfaceC864380XvY
    public final AbstractC2252651DEx LIZIZ() {
        AbstractC2252651DEx abstractC2252651DExLIZIZ;
        AbstractC2252651DEx abstractC2252651DEx = this.LIZIZ;
        if (abstractC2252651DEx != null && C23118094a.LJIIIIZZ(abstractC2252651DEx)) {
            C872370YKd c872370YKd = this.LIZ;
            if (!(c872370YKd.LIZIZ == null ? Boolean.TRUE : Boolean.valueOf(c872370YKd.LIZIZ.isShutdown())).booleanValue()) {
                return abstractC2252651DEx;
            }
        }
        synchronized (this.LIZJ) {
            try {
                abstractC2252651DExLIZIZ = C2182901Abw.LIZIZ(this.LIZ.LIZJ());
                this.LIZIZ = abstractC2252651DExLIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return abstractC2252651DExLIZIZ;
    }

    @Override // X.InterfaceC864380XvY
    public final AbstractC2252651DEx LIZJ() {
        return LIZIZ();
    }

    public C0YKS(C872370YKd c872370YKd) {
        this.LIZ = c872370YKd;
    }
}
