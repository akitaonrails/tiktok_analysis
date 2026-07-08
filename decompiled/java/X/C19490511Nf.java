package X;

/* JADX INFO: renamed from: X.11Nf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19490511Nf<T> implements InterfaceC626120Oh8<T> {
    public final InterfaceC626120Oh8<? super T> LL;
    public final C098D<? extends T> LLILLJJLI;
    public boolean LLILZ = true;
    public final C19484811La LLILLL = new C19484811La();

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (!this.LLILZ) {
            this.LL.onComplete();
        } else {
            this.LLILZ = false;
            this.LLILLJJLI.LIZIZ(this);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLILZ) {
            this.LLILZ = false;
        }
        this.LL.onNext(t);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        this.LLILLL.update(interfaceC420801kM);
    }

    public C19490511Nf(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, C098D<? extends T> c098d) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = c098d;
    }
}
