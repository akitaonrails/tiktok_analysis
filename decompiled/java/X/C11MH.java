package X;

import java.util.Collection;

/* JADX INFO: renamed from: X.11MH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MH<T, U extends Collection<? super T>> implements C11PF<T>, InterfaceC420801kM {
    public final InterfaceC19474811He<? super U> LL;
    public C11LR LLILLJJLI;
    public U LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLJJLI.cancel();
        this.LLILLJJLI = C11NC.CANCELLED;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI == C11NC.CANCELLED;
    }

    @Override // X.C11M9
    public final void onComplete() {
        this.LLILLJJLI = C11NC.CANCELLED;
        this.LL.onSuccess(this.LLILLL);
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        this.LLILLL = null;
        this.LLILLJJLI = C11NC.CANCELLED;
        this.LL.onError(th);
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        this.LLILLL.add(t);
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILLJJLI, c11lr)) {
            this.LLILLJJLI = c11lr;
            this.LL.onSubscribe(this);
            c11lr.request(Long.MAX_VALUE);
        }
    }

    public C11MH(InterfaceC19474811He<? super U> interfaceC19474811He, U u) {
        this.LL = interfaceC19474811He;
        this.LLILLL = u;
    }
}
