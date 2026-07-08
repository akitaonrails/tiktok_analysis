package X;

import java.util.Collection;

/* JADX INFO: renamed from: X.11MG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MG<T, U extends Collection<? super T>> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC19474811He<? super U> LL;
    public U LLILLJJLI;
    public InterfaceC420801kM LLILLL;

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
        U u = this.LLILLJJLI;
        this.LLILLJJLI = null;
        this.LL.onSuccess(u);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LLILLJJLI = null;
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LLILLJJLI.add(t);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11MG(InterfaceC19474811He<? super U> interfaceC19474811He, U u) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = u;
    }
}
