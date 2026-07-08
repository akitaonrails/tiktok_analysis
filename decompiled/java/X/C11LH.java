package X;

/* JADX INFO: renamed from: X.11LH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11LH<T> implements C11PF<T>, InterfaceC420801kM {
    public final C11IH<? super T> LL;
    public C11LR LLILLJJLI;
    public boolean LLILLL;
    public T LLILZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLJJLI.cancel();
        this.LLILLJJLI = C11NC.CANCELLED;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI == C11NC.CANCELLED;
    }

    @Override // X.C11M9
    public final void onComplete() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        this.LLILLJJLI = C11NC.CANCELLED;
        T t = this.LLILZ;
        this.LLILZ = null;
        if (t == null) {
            this.LL.onComplete();
        } else {
            this.LL.onSuccess(t);
        }
    }

    public C11LH(C11IH<? super T> c11ih) {
        this.LL = c11ih;
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        if (this.LLILLL) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        this.LLILLL = true;
        this.LLILLJJLI = C11NC.CANCELLED;
        this.LL.onError(th);
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        if (this.LLILLL) {
            return;
        }
        if (this.LLILZ != null) {
            this.LLILLL = true;
            this.LLILLJJLI.cancel();
            this.LLILLJJLI = C11NC.CANCELLED;
            this.LL.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.LLILZ = t;
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILLJJLI, c11lr)) {
            this.LLILLJJLI = c11lr;
            this.LL.onSubscribe(this);
            c11lr.request(Long.MAX_VALUE);
        }
    }
}
