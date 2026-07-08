package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import java.util.Map;

/* JADX INFO: renamed from: X.0Xbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852010Xbb extends C0XQW {
    public final String LIZJ;

    @Override // X.C0XQW
    public final boolean LIZ() {
        C19EG activity = this.LIZ.getActivity();
        if (activity == null) {
            return true;
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", this.LIZIZ.getMobParams().LLIIJI());
        c0xgr.LIZLLL("enter_from", this.LIZIZ.getMobParams().LJJLIIIJJI());
        c0xgr.LIZLLL("login_panel_type", this.LIZIZ.getMobParams().PR());
        C20684815ws.LJIILLIIL("create_new_phone_account_show", c0xgr.LIZ);
        if (C19293810e0.LJIIJ()) {
            if (C1915420zwa.LIZ.getValue() != null) {
                C1913910zu9 c1913910zu9 = new C1913910zu9();
                C844470XAv.LIZ.getClass();
                C1914170zuZ.LIZJ(c1913910zu9, C844470XAv.LIZ(), new InterfaceC1519250pdb() { // from class: X.0Xbd
                    @Override // X.InterfaceC1519250pdb
                    public final InterfaceC1519200pdW LIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC1519250pdb
                    public final InterfaceC1914220zue LIZJ() {
                        final C852010Xbb c852010Xbb = this.LIZ;
                        return new InterfaceC1914220zue() { // from class: X.0Xbe
                            @Override // X.InterfaceC1914220zue
                            public final void LIZ(C1519370pdn c1519370pdn) {
                            }

                            @Override // X.InterfaceC1914220zue
                            public final void LIZIZ(String str, C1519370pdn c1519370pdn) {
                            }

                            @Override // X.InterfaceC1914220zue
                            public final void LIZJ(Boolean bool, String str) {
                            }

                            @Override // X.InterfaceC1914220zue
                            public final void LIZLLL() {
                            }

                            @Override // X.InterfaceC1914220zue
                            public final void LJFF(C1519370pdn c1519370pdn) {
                            }

                            @Override // X.InterfaceC1914220zue
                            public final void LJ(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
                                C19EG activity2 = c852010Xbb.LIZ.getActivity();
                                if (activity2 != null) {
                                    activity2.finish();
                                }
                            }
                        };
                    }

                    @Override // X.InterfaceC1519250pdb
                    public final Map<String, String> LIZIZ() {
                        return C2097608Jq.LJ();
                    }
                });
            }
            return true;
        }
        C21566919al c21566919al = new C21566919al(activity);
        c21566919al.LIZJ = this.LIZ.getString(2131829326);
        c21566919al.LJIIJJI(new DialogInterfaceOnClickListenerC854600Xfm(this, 0), this.LIZ.getString(2131829324), false);
        c21566919al.LJIIIIZZ(new DialogInterfaceOnClickListenerC854600Xfm(this, 1), this.LIZ.getString(2131829325), false);
        c21566919al.LJII = false;
        new C21566519ah(c21566919al).LIZLLL();
        return true;
    }

    public final void LIZIZ(String str) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", this.LIZIZ.getMobParams().LLIIJI());
        c0xgr.LIZLLL("enter_from", this.LIZIZ.getMobParams().LJJLIIIJJI());
        c0xgr.LIZLLL("exit_method", str);
        c0xgr.LIZLLL("login_panel_type", this.LIZIZ.getMobParams().PR());
        C20684815ws.LJIILLIIL("create_new_phone_account_response", c0xgr.LIZ);
    }

    public C852010Xbb(Fragment fragment, C0XYD c0xyd, String str) {
        super(fragment, c0xyd);
        this.LIZJ = str;
    }
}
