package X;

import com.ss.android.ugc.aweme.main.TabChangeManager;

/* JADX INFO: renamed from: X.0ilr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("profile_login_sign_up")
public final class C1255290ilr extends AbstractC20660815t0 {
    public final C19EG LL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    public C1255290ilr(InterfaceC20660615sy interfaceC20660615sy, C19EG c19eg) {
        super(interfaceC20660615sy);
        this.LL = c19eg;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZIZ(this.LL, "personal_homepage", "click_mine", null, new InterfaceC849390XTt() { // from class: X.0ils
                @Override // X.InterfaceC849390XTt
                public final void LIZ() {
                    TabChangeManager.xQ2(C343710Ddh.LIZ(this.LIZ.LL), "HOME", false, null, 30);
                    c20656615sK.LIZ();
                }

                @Override // X.InterfaceC849390XTt
                public final void LIZIZ() {
                    c20656615sK.LIZ();
                }
            });
            C2018307vR.LIZ.getClass();
            C2018307vR.LIZ("personal_homepage", "click_mine");
        }
    }
}
