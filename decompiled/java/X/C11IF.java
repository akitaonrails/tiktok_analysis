package X;

/* JADX INFO: renamed from: X.11IF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IF<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final C11IH<? super T> LL;
    public final long LLILLJJLI;
    public InterfaceC420801kM LLILLL;
    public long LLILZ;
    public boolean LLILZIL;

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
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        this.LL.onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZIL) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILZIL = true;
            this.LL.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLILZIL) {
            return;
        }
        long j = this.LLILZ;
        if (j == this.LLILLJJLI) {
            this.LLILZIL = true;
            this.LLILLL.dispose();
            this.LL.onSuccess(t);
            return;
        }
        this.LLILZ = j + 1;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11IF(C11IH<? super T> c11ih, long j) {
        this.LL = c11ih;
        this.LLILLJJLI = j;
    }
}
