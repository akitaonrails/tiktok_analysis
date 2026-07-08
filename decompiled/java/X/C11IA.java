package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11IA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IA extends AtomicReference<InterfaceC420801kM> implements InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = -2809475196591179431L;
    public final InterfaceC626120Oh8<? super Long> LL;

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get() == C11JE.DISPOSED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        try {
            if (isDisposed()) {
                return;
            }
            this.LL.onNext(0L);
            lazySet(C11JT.INSTANCE);
            this.LL.onComplete();
        } finally {
            if (!zLIZ) {
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    public C11IA(InterfaceC626120Oh8<? super Long> interfaceC626120Oh8) {
        this.LL = interfaceC626120Oh8;
    }
}
