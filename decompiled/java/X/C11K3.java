package X;

/* JADX INFO: renamed from: X.11K3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11K3<T> extends C11K5<T> implements C11IH<T> {
    public static final long serialVersionUID = 7603343402964826922L;
    public InterfaceC420801kM LLILLL;

    @Override // X.C11K5, X.C11K7, X.InterfaceC420801kM
    public final void dispose() {
        super.dispose();
        this.LLILLL.dispose();
    }

    @Override // X.C11IH
    public final void onComplete() {
        complete();
    }

    public C11K3(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        super(interfaceC626120Oh8);
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        error(th);
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
