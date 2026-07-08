package X;

import android.os.CancellationSignal;

/* JADX INFO: renamed from: X.090p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23029090p implements InterfaceC420801kM {
    public final InterfaceC420801kM LL;
    public final CancellationSignal LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        CancellationSignal cancellationSignal = this.LLILLJJLI;
        if (cancellationSignal != null && !cancellationSignal.isCanceled()) {
            this.LLILLJJLI.cancel();
        }
        if (this.LL.isDisposed()) {
            return;
        }
        this.LL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        if (!this.LL.isDisposed()) {
            return false;
        }
        CancellationSignal cancellationSignal = this.LLILLJJLI;
        return cancellationSignal == null || cancellationSignal.isCanceled();
    }

    public C23029090p(C11JF c11jf, CancellationSignal cancellationSignal) {
        this.LL = c11jf;
        this.LLILLJJLI = cancellationSignal;
    }
}
