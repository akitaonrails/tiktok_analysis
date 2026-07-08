package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.11LN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11LN<T> implements C11PF<T>, InterfaceC420801kM {
    public final InterfaceC19474811He<? super T> LL;
    public final T LLILLJJLI;
    public C11LR LLILLL;
    public boolean LLILZ;
    public T LLILZIL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL.cancel();
        this.LLILLL = C11NC.CANCELLED;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL == C11NC.CANCELLED;
    }

    @Override // X.C11M9
    public final void onComplete() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LLILLL = C11NC.CANCELLED;
        T t = this.LLILZIL;
        this.LLILZIL = null;
        if (t == null && (t = this.LLILLJJLI) == null) {
            this.LL.onError(new NoSuchElementException());
        } else {
            this.LL.onSuccess(t);
        }
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        if (this.LLILZ) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        this.LLILZ = true;
        this.LLILLL = C11NC.CANCELLED;
        this.LL.onError(th);
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        if (this.LLILZ) {
            return;
        }
        if (this.LLILZIL != null) {
            this.LLILZ = true;
            this.LLILLL.cancel();
            this.LLILLL = C11NC.CANCELLED;
            this.LL.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.LLILZIL = t;
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILLL, c11lr)) {
            this.LLILLL = c11lr;
            this.LL.onSubscribe(this);
            c11lr.request(Long.MAX_VALUE);
        }
    }

    public C11LN(InterfaceC19474811He<? super T> interfaceC19474811He, T t) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = t;
    }
}
