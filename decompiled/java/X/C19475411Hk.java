package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.11Hk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19475411Hk<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public final long LLILLJJLI;
    public final T LLILLL;
    public final boolean LLILZ;
    public InterfaceC420801kM LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZIL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZIL.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        T t = this.LLILLL;
        if (t != null) {
            this.LL.onNext(t);
        } else if (this.LLILZ) {
            this.LL.onError(new NoSuchElementException());
            return;
        }
        this.LL.onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLIZ) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLIZ = true;
            this.LL.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLIZ) {
            return;
        }
        long j = this.LLILZLL;
        if (j == this.LLILLJJLI) {
            this.LLIZ = true;
            this.LLILZIL.dispose();
            this.LL.onNext(t);
            this.LL.onComplete();
            return;
        }
        this.LLILZLL = j + 1;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZIL, interfaceC420801kM)) {
            this.LLILZIL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19475411Hk(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, long j, T t, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = j;
        this.LLILLL = t;
        this.LLILZ = z;
    }
}
