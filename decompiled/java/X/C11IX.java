package X;

/* JADX INFO: renamed from: X.11IX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IX<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final C11IY LL;
    public InterfaceC420801kM LLILLJJLI;

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
    }

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

    public C11IX(C11IY c11iy) {
        this.LL = c11iy;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        this.LLILLJJLI = interfaceC420801kM;
        this.LL.onSubscribe(this);
    }
}
