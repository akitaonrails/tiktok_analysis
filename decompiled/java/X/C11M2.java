package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.11M2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11M2<T> extends C11M7<T> implements C11PF<T> {
    public static final long serialVersionUID = -5526049321428043809L;
    public final T LLILLL;
    public final boolean LLILZ;
    public C11LR LLILZIL;
    public boolean LLILZLL;

    @Override // X.C11M9
    public final void onComplete() {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        T t = this.LLILLJJLI;
        this.LLILLJJLI = null;
        if (t != null || (t = this.LLILLL) != null) {
            complete(t);
        } else if (this.LLILZ) {
            this.LL.onError(new NoSuchElementException());
        } else {
            this.LL.onComplete();
        }
    }

    @Override // X.C11M7, X.C11NT, X.C11LR
    public final void cancel() {
        super.cancel();
        this.LLILZIL.cancel();
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        if (this.LLILZLL) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILZLL = true;
            this.LL.onError(th);
        }
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        if (this.LLILZLL) {
            return;
        }
        if (this.LLILLJJLI != null) {
            this.LLILZLL = true;
            this.LLILZIL.cancel();
            this.LL.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.LLILLJJLI = t;
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILZIL, c11lr)) {
            this.LLILZIL = c11lr;
            this.LL.onSubscribe(this);
            c11lr.request(Long.MAX_VALUE);
        }
    }

    public C11M2(C11M9<? super T> c11m9, T t, boolean z) {
        super(c11m9);
        this.LLILLL = t;
        this.LLILZ = z;
    }
}
