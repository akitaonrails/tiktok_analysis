package X;

import java.util.Collection;

/* JADX INFO: renamed from: X.11MM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MM<T, U extends Collection<? super T>> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super U> LL;
    public InterfaceC420801kM LLILLJJLI;
    public U LLILLL;

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
        U u = this.LLILLL;
        this.LLILLL = null;
        this.LL.onNext(u);
        this.LL.onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LLILLL = null;
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LLILLL.add(t);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLJJLI, interfaceC420801kM)) {
            this.LLILLJJLI = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11MM(InterfaceC626120Oh8<? super U> interfaceC626120Oh8, U u) {
        this.LL = interfaceC626120Oh8;
        this.LLILLL = u;
    }
}
