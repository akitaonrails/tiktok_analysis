package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.09lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class BinderC2467709lj extends AbstractBinderC2468309lp {
    public final C835520Wq6 LL;
    public final /* synthetic */ C2459309kN LLILLJJLI;

    @Override // X.InterfaceC2468209lo
    public void LJJZ(Bundle bundle) {
        this.LLILLJJLI.LIZIZ.LIZLLL(this.LL);
        C2459309kN.LIZJ.LIZLLL("onDeferredInstall", new Object[0]);
    }

    @Override // X.InterfaceC2468209lo
    public void u0(Bundle bundle) {
        this.LLILLJJLI.LIZIZ.LIZLLL(this.LL);
        C2459309kN.LIZJ.LIZLLL("onDeferredUninstall", new Object[0]);
    }

    public BinderC2467709lj(C2459309kN c2459309kN, C835520Wq6 c835520Wq6) {
        this.LLILLJJLI = c2459309kN;
        this.LL = c835520Wq6;
    }

    @Override // X.InterfaceC2468209lo
    public void LJLJLLL(int i, Bundle bundle) {
        this.LLILLJJLI.LIZIZ.LIZLLL(this.LL);
        C2459309kN.LIZJ.LIZLLL("onCancelInstall(%d)", Integer.valueOf(i));
    }

    @Override // X.InterfaceC2468209lo
    public void LLIIIILZ(int i, Bundle bundle) {
        this.LLILLJJLI.LIZIZ.LIZLLL(this.LL);
        C2459309kN.LIZJ.LIZLLL("onStartInstall(%d)", Integer.valueOf(i));
    }
}
