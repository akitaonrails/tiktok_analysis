package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19485011Lc extends AtomicReference<Runnable> implements Runnable, InterfaceC420801kM {
    public static final long serialVersionUID = -4101336210206799084L;
    public final C19484811La LL;
    public final C19484811La LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (getAndSet(null) != null) {
            this.LL.dispose();
            this.LLILLJJLI.dispose();
        }
    }

    public final void LIZ() {
        Runnable runnable = get();
        if (runnable != null) {
            try {
                runnable.run();
                lazySet(null);
                C19484811La c19484811La = this.LL;
                C11JE c11je = C11JE.DISPOSED;
                c19484811La.lazySet(c11je);
                this.LLILLJJLI.lazySet(c11je);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lazySet(null);
                this.LL.lazySet(C11JE.DISPOSED);
                this.LLILLJJLI.lazySet(C11JE.DISPOSED);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get() == null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC19485011Lc(Runnable runnable) {
        super(runnable);
        this.LL = new C19484811La();
        this.LLILLJJLI = new C19484811La();
    }
}
