package X;

/* JADX INFO: renamed from: X.11IP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IP<T> implements C11IH<T>, InterfaceC420801kM {
    public final C11IH<? super T> LL;
    public InterfaceC420801kM LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLJJLI.dispose();
        this.LLILLJJLI = C11JE.DISPOSED;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI.isDisposed();
    }

    @Override // X.C11IH
    public final void onComplete() {
        this.LLILLJJLI = C11JE.DISPOSED;
        this.LL.onComplete();
    }

    public C11IP(C11IH<? super T> c11ih) {
        this.LL = c11ih;
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        this.LLILLJJLI = C11JE.DISPOSED;
        this.LL.onError(th);
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLJJLI, interfaceC420801kM)) {
            this.LLILLJJLI = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.C11IH
    public final void onSuccess(T t) {
        this.LLILLJJLI = C11JE.DISPOSED;
        this.LL.onComplete();
    }
}
