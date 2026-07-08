package X;

/* JADX INFO: renamed from: X.11M4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11M4<T> extends C11M7<T> implements InterfaceC19474811He<T> {
    public static final long serialVersionUID = 187782011903685568L;
    public InterfaceC420801kM LLILLL;

    @Override // X.C11M7, X.C11NT, X.C11LR
    public final void cancel() {
        super.cancel();
        this.LLILLL.dispose();
    }

    public C11M4(C11M9<? super T> c11m9) {
        super(c11m9);
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        complete(t);
    }
}
