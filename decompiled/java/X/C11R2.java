package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11R2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11R2 implements InterfaceC420801kM, Runnable {
    public final Runnable LL;
    public final C11RN LLILLJJLI;
    public volatile boolean LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL = true;
        this.LLILLJJLI.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        try {
            if (this.LLILLL) {
                return;
            }
            try {
                this.LL.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                this.LLILLJJLI.dispose();
                throw C11QG.LIZIZ(th);
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL;
    }

    public C11R2(Runnable runnable, C11RN c11rn) {
        this.LL = runnable;
        this.LLILLJJLI = c11rn;
    }
}
