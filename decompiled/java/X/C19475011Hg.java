package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.11Hg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19475011Hg<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC19474811He<? super T> LL;
    public final long LLILLJJLI;
    public final T LLILLL;
    public InterfaceC420801kM LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        T t = this.LLILLL;
        if (t != null) {
            this.LL.onSuccess(t);
        } else {
            this.LL.onError(new NoSuchElementException());
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZLL) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILZLL = true;
            this.LL.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLILZLL) {
            return;
        }
        long j = this.LLILZIL;
        if (j == this.LLILLJJLI) {
            this.LLILZLL = true;
            this.LLILZ.dispose();
            this.LL.onSuccess(t);
            return;
        }
        this.LLILZIL = j + 1;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZ, interfaceC420801kM)) {
            this.LLILZ = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19475011Hg(InterfaceC19474811He<? super T> interfaceC19474811He, long j, T t) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = j;
        this.LLILLL = t;
    }
}
