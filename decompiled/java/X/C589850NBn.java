package X;

/* JADX INFO: renamed from: X.0NBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C589850NBn<T> extends C11N2<T> {
    public final C0T0O LLILLJJLI;

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RxDisposableObserver{taskInfo='");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC626120Oh8
    public void onComplete() {
        dispose();
    }

    public C589850NBn(C0T0O c0t0o) {
        this.LLILLJJLI = c0t0o;
    }
}
