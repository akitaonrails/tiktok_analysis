package X;

/* JADX INFO: renamed from: X.0Dh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345800Dh4<T> extends AbstractC345820Dh6<T> {
    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LL = null;
        this.LLILLJJLI = th;
        countDown();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LL = t;
    }
}
