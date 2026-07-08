package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11IT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IT<T> extends AtomicReference<InterfaceC420801kM> implements C11IY, InterfaceC420801kM {
    public static final long serialVersionUID = -8565274649390031272L;
    public final InterfaceC19474811He<? super T> LL;
    public final InterfaceC19473011Gm<T> LLILLJJLI;

    @Override // X.C11IY
    public final void onComplete() {
        this.LLILLJJLI.LIZ(new C11I4(this.LL, this));
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.C11IY
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            this.LL.onSubscribe(this);
        }
    }

    public C11IT(InterfaceC19474811He<? super T> interfaceC19474811He, InterfaceC19473011Gm<T> interfaceC19473011Gm) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = interfaceC19473011Gm;
    }
}
