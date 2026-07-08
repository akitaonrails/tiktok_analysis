package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11I9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11I9 extends AtomicReference<InterfaceC420801kM> implements InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = 1891866368734007884L;
    public final InterfaceC626120Oh8<? super Long> LL;
    public final long LLILLJJLI;
    public long LLILLL;

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
            long j = this.LLILLL;
            this.LL.onNext(Long.valueOf(j));
            if (j != this.LLILLJJLI) {
                this.LLILLL = j + 1;
            } else {
                C11JE.dispose(this);
                this.LL.onComplete();
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

    public C11I9(InterfaceC626120Oh8<? super Long> interfaceC626120Oh8, long j, long j2) {
        this.LL = interfaceC626120Oh8;
        this.LLILLL = j;
        this.LLILLJJLI = j2;
    }
}
