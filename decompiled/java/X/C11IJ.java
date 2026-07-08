package X;

/* JADX INFO: renamed from: X.11IJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IJ<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final C11IH<? super T> LL;
    public InterfaceC420801kM LLILLJJLI;
    public T LLILLL;
    public boolean LLILZ;

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
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        T t = this.LLILLL;
        this.LLILLL = null;
        if (t == null) {
            this.LL.onComplete();
        } else {
            this.LL.onSuccess(t);
        }
    }

    public C11IJ(C11IH<? super T> c11ih) {
        this.LL = c11ih;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZ) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILZ = true;
            this.LL.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLILZ) {
            return;
        }
        if (this.LLILLL != null) {
            this.LLILZ = true;
            this.LLILLJJLI.dispose();
            this.LL.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.LLILLL = t;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLJJLI, interfaceC420801kM)) {
            this.LLILLJJLI = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }
}
