package X;

/* JADX INFO: renamed from: X.11Ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19491811Ns<T> implements InterfaceC626120Oh8<T>, C11LR {
    public final C11M9<? super T> LL;
    public InterfaceC420801kM LLILLJJLI;

    @Override // X.C11LR
    public final void request(long j) {
    }

    @Override // X.C11LR
    public final void cancel() {
        this.LLILLJJLI.dispose();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LL.onComplete();
    }

    public C19491811Ns(C11M9<? super T> c11m9) {
        this.LL = c11m9;
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
        this.LLILLJJLI = interfaceC420801kM;
        this.LL.onSubscribe(this);
    }
}
