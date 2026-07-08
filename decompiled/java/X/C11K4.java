package X;

/* JADX INFO: renamed from: X.11K4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11K4<T> extends C11K5<T> implements InterfaceC19474811He<T> {
    public static final long serialVersionUID = 3786543492451018833L;
    public InterfaceC420801kM LLILLL;

    @Override // X.C11K5, X.C11K7, X.InterfaceC420801kM
    public final void dispose() {
        super.dispose();
        this.LLILLL.dispose();
    }

    public C11K4(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        super(interfaceC626120Oh8);
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        error(th);
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
