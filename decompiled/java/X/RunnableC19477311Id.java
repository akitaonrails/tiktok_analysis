package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Id, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19477311Id extends AtomicReference<InterfaceC420801kM> implements InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = 3167244060586201109L;
    public final C11IY LL;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LL.onComplete();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    public RunnableC19477311Id(C11IY c11iy) {
        this.LL = c11iy;
    }
}
