package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Qb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19497911Qb implements Runnable {
    public final InterfaceC19498011Qc LL;
    public final long LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LL.LIZ(this.LLILLJJLI);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC19497911Qb(long j, InterfaceC19498011Qc interfaceC19498011Qc) {
        this.LLILLJJLI = j;
        this.LL = interfaceC19498011Qc;
    }
}
