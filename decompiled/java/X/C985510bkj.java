package X;

import android.view.View;

/* JADX INFO: renamed from: X.0bkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985510bkj implements InterfaceC985590bkr {
    public final /* synthetic */ C985380bkW LIZ;
    public final /* synthetic */ View LIZIZ;
    public final /* synthetic */ C1295960jpS LIZJ;
    public final /* synthetic */ InterfaceC985590bkr LIZLLL;

    @Override // X.InterfaceC985590bkr
    public final void LIZ() {
        C985380bkW c985380bkW = this.LIZ;
        View view = this.LIZIZ;
        final C1295960jpS c1295960jpS = this.LIZJ;
        final InterfaceC985590bkr interfaceC985590bkr = this.LIZLLL;
        c985380bkW.LIZJ(view, false, new InterfaceC985590bkr() { // from class: X.0bki
            @Override // X.InterfaceC985590bkr
            public final void LIZ() {
                C500260Jjc.LJIILIIL(c1295960jpS);
                C962250b9D.LJIIJ(c1295960jpS);
                InterfaceC985590bkr interfaceC985590bkr2 = interfaceC985590bkr;
                if (interfaceC985590bkr2 != null) {
                    interfaceC985590bkr2.LIZ();
                }
            }
        });
    }

    public C985510bkj(C985380bkW c985380bkW, View view, C1295960jpS c1295960jpS, InterfaceC985590bkr interfaceC985590bkr) {
        this.LIZ = c985380bkW;
        this.LIZIZ = view;
        this.LIZJ = c1295960jpS;
        this.LIZLLL = interfaceC985590bkr;
    }
}
