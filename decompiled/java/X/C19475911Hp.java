package X;

/* JADX INFO: renamed from: X.11Hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19475911Hp<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public long LLILLJJLI;
    public InterfaceC420801kM LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LL.onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        long j = this.LLILLJJLI;
        if (j != 0) {
            this.LLILLJJLI = j - 1;
        } else {
            this.LL.onNext(t);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19475911Hp(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, long j) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = j;
    }
}
