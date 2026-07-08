package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0T98, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0T98 implements Runnable, InterfaceC770820ULo {
    public final AtomicBoolean LL = new AtomicBoolean(false);

    public abstract void LIZ();

    public abstract void LIZIZ();

    @Override // X.InterfaceC770820ULo
    public final void onInvalidate() {
        if (this.LL.compareAndSet(false, true)) {
            LIZ();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AbsInvalidationRunnable@ed3c.run");
        try {
            if (!this.LL.get()) {
                LIZIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsInvalidationRunnable@ed3c.run");
    }
}
