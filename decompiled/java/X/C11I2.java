package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11I2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11I2 extends AtomicReference<InterfaceC420801kM> implements InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = 346773832286157679L;
    public final InterfaceC626120Oh8<? super Long> LL;
    public long LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get() == C11JE.DISPOSED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        try {
            if (get() != C11JE.DISPOSED) {
                InterfaceC626120Oh8<? super Long> interfaceC626120Oh8 = this.LL;
                long j = this.LLILLJJLI;
                this.LLILLJJLI = 1 + j;
                interfaceC626120Oh8.onNext(Long.valueOf(j));
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    public C11I2(InterfaceC626120Oh8<? super Long> interfaceC626120Oh8) {
        this.LL = interfaceC626120Oh8;
    }
}
