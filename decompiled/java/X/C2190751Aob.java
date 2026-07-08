package X;

/* JADX INFO: renamed from: X.1Aob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190751Aob<T> implements C01GW<T> {
    public final InterfaceC2190741Aoa<T> LL;
    public T LLILLJJLI;

    @Override // X.C01GW
    public final T getValue() {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = this.LL.load();
        }
        return this.LLILLJJLI;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLILLJJLI != null;
    }

    public C2190751Aob(InterfaceC2190741Aoa<T> interfaceC2190741Aoa) {
        this.LL = interfaceC2190741Aoa;
    }
}
