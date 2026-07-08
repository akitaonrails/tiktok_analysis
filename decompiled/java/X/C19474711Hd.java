package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.11Hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19474711Hd<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC19474811He<? super T> LL;
    public final T LLILLJJLI;
    public InterfaceC420801kM LLILLL;
    public T LLILZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL.dispose();
        this.LLILLL = C11JE.DISPOSED;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL == C11JE.DISPOSED;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLILLL = C11JE.DISPOSED;
        T t = this.LLILZ;
        if (t != null) {
            this.LLILZ = null;
            this.LL.onSuccess(t);
            return;
        }
        T t2 = this.LLILLJJLI;
        if (t2 != null) {
            this.LL.onSuccess(t2);
        } else {
            this.LL.onError(new NoSuchElementException());
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LLILLL = C11JE.DISPOSED;
        this.LLILZ = null;
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LLILZ = t;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19474711Hd(InterfaceC19474811He<? super T> interfaceC19474811He, T t) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = t;
    }
}
