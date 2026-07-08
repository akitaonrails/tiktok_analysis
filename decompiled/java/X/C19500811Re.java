package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19500811Re<T> extends C11NZ<T> {
    public final AnonymousClass0984<T> LL;
    public final int LLILLJJLI;
    public RunnableC19501011Rg LLILLL;

    public C19500811Re(C11R4 c11r4) {
        C11RO c11ro = C11S5.LIZ;
        this.LL = c11r4;
        this.LLILLJJLI = 1;
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        RunnableC19501011Rg runnableC19501011Rg;
        boolean z;
        synchronized (this) {
            try {
                runnableC19501011Rg = this.LLILLL;
                if (runnableC19501011Rg == null) {
                    runnableC19501011Rg = new RunnableC19501011Rg(this);
                    this.LLILLL = runnableC19501011Rg;
                }
                long j = runnableC19501011Rg.LLILLJJLI + 1;
                runnableC19501011Rg.LLILLJJLI = j;
                if (!runnableC19501011Rg.LLILLL && j == this.LLILLJJLI) {
                    z = true;
                    runnableC19501011Rg.LLILLL = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LL.LIZIZ(new C19500911Rf(interfaceC626120Oh8, this, runnableC19501011Rg));
        if (z) {
            this.LL.LJLLLLLL(runnableC19501011Rg);
        }
    }

    public final void LJLLLL(RunnableC19501011Rg runnableC19501011Rg) {
        synchronized (this) {
            try {
                RunnableC19501011Rg runnableC19501011Rg2 = this.LLILLL;
                if (runnableC19501011Rg2 != null && runnableC19501011Rg2 == runnableC19501011Rg) {
                    this.LLILLL = null;
                    runnableC19501011Rg.getClass();
                }
                long j = runnableC19501011Rg.LLILLJJLI - 1;
                runnableC19501011Rg.LLILLJJLI = j;
                if (j == 0) {
                    AnonymousClass0984<T> anonymousClass0984 = this.LL;
                    if (anonymousClass0984 instanceof InterfaceC420801kM) {
                        ((InterfaceC420801kM) anonymousClass0984).dispose();
                    } else if (anonymousClass0984 instanceof InterfaceC19501111Rh) {
                        ((InterfaceC19501111Rh) anonymousClass0984).LIZ(runnableC19501011Rg.get());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJLLLLLL(RunnableC19501011Rg runnableC19501011Rg) {
        synchronized (this) {
            try {
                if (runnableC19501011Rg.LLILLJJLI == 0 && runnableC19501011Rg == this.LLILLL) {
                    this.LLILLL = null;
                    InterfaceC420801kM interfaceC420801kM = runnableC19501011Rg.get();
                    C11JE.dispose(runnableC19501011Rg);
                    AnonymousClass0984<T> anonymousClass0984 = this.LL;
                    if (anonymousClass0984 instanceof InterfaceC420801kM) {
                        ((InterfaceC420801kM) anonymousClass0984).dispose();
                    } else if (anonymousClass0984 instanceof InterfaceC19501111Rh) {
                        if (interfaceC420801kM == null) {
                            runnableC19501011Rg.LLILZ = true;
                        } else {
                            ((InterfaceC19501111Rh) anonymousClass0984).LIZ(interfaceC420801kM);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
