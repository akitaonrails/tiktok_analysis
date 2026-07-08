package X;

import com.bytedance.android.live.wallet.IWalletService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0x4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805070x4b implements InterfaceC1804670x3x, InterfaceC1141530foN {
    public final InterfaceC1804710x41 LL;
    public final C054G LLILLJJLI = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C2252331DDr LLILLL;
    public final C2252331DDr LLILZ;
    public final C2252331DDr LLILZIL;

    @Override // X.InterfaceC1804670x3x
    public final void LIZ() {
        C1548820qPI.LIZLLL("live_js_event_fe_update_notification_and_abs", this);
        LJII();
        LJII();
    }

    @Override // X.InterfaceC1804790x49
    public final void LJI() {
        C1548820qPI.LJIIIIZZ("live_js_event_fe_update_notification_and_abs", this);
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isValidForRechargeV3()) {
            C1548820qPI.LJIIIIZZ("cus_panel_recharge_click", this);
            C1548820qPI.LJIIIIZZ("recharge_cashier_cancel", this);
            C1548820qPI.LJIIIIZZ("live_js_event_fe_recharge_finish", this);
        }
    }

    public final void LJII() {
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isValidForRechargeV3()) {
            C1548820qPI.LIZLLL("cus_panel_recharge_click", this);
            C1548820qPI.LIZLLL("recharge_cashier_cancel", this);
            C1548820qPI.LIZLLL("live_js_event_fe_recharge_finish", this);
        }
    }

    @Override // X.InterfaceC1804700x40
    public final C2252331DDr LJ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1804700x40
    public final C2252331DDr LJFF() {
        return this.LLILZIL;
    }

    public C1805070x4b(C1804400x3W c1804400x3W) {
        this.LL = c1804400x3W;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILLL = c2252331DDrLIZIZ;
        C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLILZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILZIL = C09IR.LIZIZ(0, 0, null, 7);
    }

    @Override // X.InterfaceC1804670x3x
    public final Object LIZIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJII = C09IC.LJII(C098C.LIZ(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().l22()), interfaceC1364105Vn, new C01VG(this, null));
        if (objLJII == C099R.LJFF()) {
            return objLJII;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1804670x3x
    public final Object LIZJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJII = C09IC.LJII(C098C.LIZ(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().EU()), interfaceC1364105Vn, new C1805090x4d(this, null));
        if (objLJII == C099R.LJFF()) {
            return objLJII;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1804670x3x
    public final Object LIZLLL(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJII = C09IC.LJII(C098C.LIZ(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().XF()), interfaceC1364105Vn, new C1805080x4c(this, null));
        if (objLJII == C099R.LJFF()) {
            return objLJII;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C1805060x4a(this, c262100zr, null), 3);
    }
}
