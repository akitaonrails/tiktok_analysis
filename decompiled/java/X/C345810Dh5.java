package X;

/* JADX INFO: renamed from: X.0Dh5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345810Dh5<T> extends AbstractC345820Dh6<T> {
    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LL == null) {
            this.LLILLJJLI = th;
        }
        countDown();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LL == null) {
            this.LL = t;
            this.LLILLL.dispose();
            countDown();
        }
    }
}
