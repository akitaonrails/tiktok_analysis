package X;

/* JADX INFO: renamed from: X.11Hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19474611Hc<T> implements InterfaceC19474811He<T>, InterfaceC420801kM {
    public final InterfaceC19474811He<? super T> LL;
    public InterfaceC420801kM LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLJJLI.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI.isDisposed();
    }

    public C19474611Hc(InterfaceC19474811He<? super T> interfaceC19474811He) {
        this.LL = interfaceC19474811He;
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLJJLI, interfaceC420801kM)) {
            this.LLILLJJLI = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        this.LL.onSuccess(t);
    }
}
