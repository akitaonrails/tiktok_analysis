package X;

/* JADX INFO: renamed from: X.11M0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11M0<T> implements C11IY, C11LR {
    public final C11M9<? super T> LL;
    public InterfaceC420801kM LLILLJJLI;

    @Override // X.C11LR
    public final void request(long j) {
    }

    @Override // X.C11LR
    public final void cancel() {
        this.LLILLJJLI.dispose();
    }

    @Override // X.C11IY
    public final void onComplete() {
        this.LL.onComplete();
    }

    public C11M0(C11M9<? super T> c11m9) {
        this.LL = c11m9;
    }

    @Override // X.C11IY
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLJJLI, interfaceC420801kM)) {
            this.LLILLJJLI = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }
}
