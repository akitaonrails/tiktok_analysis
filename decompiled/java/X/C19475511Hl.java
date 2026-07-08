package X;

/* JADX INFO: renamed from: X.11Hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19475511Hl<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public InterfaceC420801kM LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLJJLI.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LL.onComplete();
    }

    public C19475511Hl(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LL = interfaceC626120Oh8;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LL.onNext(t);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLJJLI, interfaceC420801kM)) {
            this.LLILLJJLI = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }
}
