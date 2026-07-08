package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11MZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MZ extends AtomicReference<InterfaceC420801kM> implements C11IY, InterfaceC420801kM {
    public static final long serialVersionUID = 8606673141535671828L;
    public final /* synthetic */ C11MX LL;

    @Override // X.C11IY
    public final void onComplete() {
        C11MX c11mx = this.LL;
        c11mx.LLILZIL.LIZIZ(this);
        c11mx.onComplete();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    public C11MZ(C11MX c11mx) {
        this.LL = c11mx;
    }

    @Override // X.C11IY
    public final void onError(Throwable th) {
        C11MX c11mx = this.LL;
        c11mx.LLILZIL.LIZIZ(this);
        c11mx.onError(th);
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }
}
