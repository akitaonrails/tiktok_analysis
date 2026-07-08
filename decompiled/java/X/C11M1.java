package X;

/* JADX INFO: renamed from: X.11M1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11M1<T> extends C11M7<T> implements C11IH<T> {
    public static final long serialVersionUID = 7603343402964826922L;
    public InterfaceC420801kM LLILLL;

    @Override // X.C11IH
    public final void onComplete() {
        this.LL.onComplete();
    }

    @Override // X.C11M7, X.C11NT, X.C11LR
    public final void cancel() {
        super.cancel();
        this.LLILLL.dispose();
    }

    public C11M1(C11M9<? super T> c11m9) {
        super(c11m9);
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.C11IH
    public final void onSuccess(T t) {
        complete(t);
    }
}
