package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11RR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11RR implements InterfaceC420801kM, Runnable {
    public final Runnable LL;
    public final C11RN LLILLJJLI;
    public Thread LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLILLL == C786410Ut5.u3()) {
            C11RN c11rn = this.LLILLJJLI;
            if (c11rn instanceof C19502111Rr) {
                C19502111Rr c19502111Rr = (C19502111Rr) c11rn;
                if (c19502111Rr.LLILLJJLI) {
                    return;
                }
                c19502111Rr.LLILLJJLI = true;
                c19502111Rr.LL.shutdown();
                return;
            }
        }
        this.LLILLJJLI.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI.isDisposed();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LLILLL = C786410Ut5.u3();
            try {
                this.LL.run();
                dispose();
                this.LLILLL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                dispose();
                this.LLILLL = null;
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (!C2179971ATj.LIZ(th2)) {
                throw th2;
            }
        }
    }

    public C11RR(Runnable runnable, C11RN c11rn) {
        this.LL = runnable;
        this.LLILLJJLI = c11rn;
    }
}
