package X;

import p2.j1;

/* JADX INFO: renamed from: X.0uA9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693190uA9 extends AbstractC20055413dY implements InterfaceC1693210uAB, InterfaceC20051913cz, InterfaceC1694690uCZ {
    public AbstractC1693180uA8 LLJJ;
    public C1691930u87 LLJJI;
    public C1692140u8S LLJJIII;
    public final C05P0 LLJJIJI = C20028913Yh.LJI(null);

    @Override // X.InterfaceC1694690uCZ
    public final InterfaceC1692950u9l LJLIIL() {
        return (InterfaceC1692950u9l) this.LLJJIJI.getValue();
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        AbstractC1693180uA8 abstractC1693180uA8 = this.LLJJ;
        if (abstractC1693180uA8.LIZ != null) {
            C1691080u6k.LIZJ("Expected textInputModifierNode to be null");
        }
        abstractC1693180uA8.LIZ = this;
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        this.LLJJ.LJIIIZ(this);
    }

    @Override // X.InterfaceC1694690uCZ
    public final InterfaceC1679450tnz getSoftwareKeyboardController() {
        return (InterfaceC1679450tnz) C20061513eX.LIZ(this, C20055113dV.LJIILL);
    }

    @Override // X.InterfaceC1694690uCZ
    public final InterfaceC1374305Zl getViewConfiguration() {
        return (InterfaceC1374305Zl) C20061513eX.LIZ(this, C20055113dV.LJIJ);
    }

    @Override // X.InterfaceC1694690uCZ
    public final C1691930u87 LJJIJL() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1694690uCZ
    public final C1692140u8S LJLILLLLZI() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1694690uCZ
    public final AnonymousClass0956 LJLJJI(C1694950uCz c1694950uCz) {
        if (!this.LLJILLL) {
            return null;
        }
        return C23250099c.LIZLLL(LLILLIZIL(), null, C099V.UNDISPATCHED, new C860140Xoi(this, c1694950uCz, null), 1);
    }

    @Override // X.InterfaceC20051913cz
    public final void LLIIII(j1 j1Var) {
        ((C13FE) this.LLJJIJI).setValue(j1Var);
    }

    public C1693190uA9(AbstractC1693180uA8 abstractC1693180uA8, C1691930u87 c1691930u87, C1692140u8S c1692140u8S) {
        this.LLJJ = abstractC1693180uA8;
        this.LLJJI = c1691930u87;
        this.LLJJIII = c1692140u8S;
    }
}
