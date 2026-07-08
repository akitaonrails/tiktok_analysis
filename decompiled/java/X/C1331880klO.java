package X;

/* JADX INFO: renamed from: X.0klO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331880klO implements InterfaceC469401sC {
    public final InterfaceC1320200kSY LL;

    @Override // X.InterfaceC469401sC
    public final void cancel() {
        if (this.LL != null) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LIZIZ("DataSourceCancellable", "cancel");
            this.LL.close();
        }
    }

    public C1331880klO(InterfaceC1320200kSY interfaceC1320200kSY) {
        this.LL = interfaceC1320200kSY;
    }
}
