package X;

/* JADX INFO: renamed from: X.11Lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19486511Lr<T> implements C11PF<T>, InterfaceC420801kM {
    public final C11IY LL;
    public C11LR LLILLJJLI;

    @Override // X.C11M9
    public final void onNext(T t) {
    }

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
        this.LL.onComplete();
    }

    public C19486511Lr(C11IY c11iy) {
        this.LL = c11iy;
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILLJJLI, c11lr)) {
            this.LLILLJJLI = c11lr;
            this.LL.onSubscribe(this);
            c11lr.request(Long.MAX_VALUE);
        }
    }
}
