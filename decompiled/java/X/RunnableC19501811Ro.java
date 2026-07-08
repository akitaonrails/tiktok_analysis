package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.11Ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19501811Ro extends AtomicBoolean implements Runnable, InterfaceC420801kM {
    public static final long serialVersionUID = -2421395018820541164L;
    public final Runnable LL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        lazySet(true);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        try {
            if (get()) {
                return;
            }
            try {
                this.LL.run();
                lazySet(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lazySet(true);
                throw th;
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public RunnableC19501811Ro(Runnable runnable) {
        this.LL = runnable;
    }
}
