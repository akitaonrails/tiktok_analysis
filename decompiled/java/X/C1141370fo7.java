package X;

/* JADX INFO: renamed from: X.0fo7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141370fo7 implements InterfaceC1059280dfi {
    public final InterfaceC1059280dfi LL;
    public boolean LLILLJJLI;

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LL.close();
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LL.refresh();
    }

    public C1141370fo7(C1141170fnn c1141170fnn) {
        this.LL = c1141170fnn;
    }
}
