package X;

/* JADX INFO: renamed from: X.11Ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19476311Ht<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public boolean LLILLJJLI;
    public InterfaceC420801kM LLILLL;
    public long LLILZ;

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
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        this.LLILLL.dispose();
        this.LL.onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILLJJLI) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        this.LLILLJJLI = true;
        this.LLILLL.dispose();
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        boolean z;
        if (!this.LLILLJJLI) {
            long j = this.LLILZ;
            long j2 = j - 1;
            this.LLILZ = j2;
            if (j > 0) {
                if (j2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LL.onNext(t);
                if (z) {
                    onComplete();
                }
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            if (this.LLILZ == 0) {
                this.LLILLJJLI = true;
                interfaceC420801kM.dispose();
                C11JT.complete(this.LL);
                return;
            }
            this.LL.onSubscribe(this);
        }
    }

    public C19476311Ht(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, long j) {
        this.LL = interfaceC626120Oh8;
        this.LLILZ = j;
    }
}
