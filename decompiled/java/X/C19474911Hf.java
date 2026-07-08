package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.11Hf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19474911Hf<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC19474811He<? super T> LL;
    public final T LLILLJJLI;
    public InterfaceC420801kM LLILLL;
    public T LLILZ;
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
        T t = this.LLILZ;
        this.LLILZ = null;
        if (t == null && (t = this.LLILLJJLI) == null) {
            this.LL.onError(new NoSuchElementException());
        } else {
            this.LL.onSuccess(t);
        }
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
        if (this.LLILZ != null) {
            this.LLILZIL = true;
            this.LLILLL.dispose();
            this.LL.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.LLILZ = t;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19474911Hf(InterfaceC19474811He<? super T> interfaceC19474811He, T t) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = t;
    }
}
