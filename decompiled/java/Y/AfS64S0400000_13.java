package Y;

import X.C09JN;
import X.C0XO3;
import X.C0XPY;
import X.C0XQ5;
import X.C0XT7;
import X.C0XUE;
import X.C0XX7;
import X.C0XYO;
import X.C1233040iBy;
import X.C19285410ce;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import X.C849550XUj;
import X.C851520Xao;
import X.C851660Xb2;
import X.C853080XdK;
import X.C853090XdL;
import X.C853660XeG;
import X.C853810XeV;
import X.C853820XeW;
import X.C853830XeX;
import X.C853840XeY;
import X.C854460XfY;
import X.EnumC1237100iIW;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.EnumC854390XfR;
import X.InterfaceC586170Myt;
import X.InterfaceC851540Xaq;
import X.InterfaceC851560Xas;
import X.InterfaceC851650Xb1;
import X.InterfaceC853780XeS;
import X.InterfaceC853790XeT;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AwS379S0200000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AfS64S0400000_13 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS64S0400000_13 afS64S0400000_13, Object obj) {
        C1C7U.LIZ("AgeGateSignupCreatePasswordEntryPoint@bd9e.verifyEmailCode$1$2");
        C851520Xao.LIZIZ((EnumC852910Xd3) afS64S0400000_13.l0, (BaseAccountFlowFragment) afS64S0400000_13.l1, (Bundle) afS64S0400000_13.l2, ((C849550XUj) obj).LJIIJ, (InterfaceC851540Xaq) afS64S0400000_13.l3);
        C1C7U.LIZIZ("AgeGateSignupCreatePasswordEntryPoint@bd9e.verifyEmailCode$1$2");
    }

    public static final void accept$1(AfS64S0400000_13 afS64S0400000_13, Object obj) {
        C1C7U.LIZ("AgeGateSignupVerifyEmailCodeEntryPoint@6db5.onAgeGateSuccess$1$2");
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS64S0400000_13.l0;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS64S0400000_13.l1;
        Bundle bundle = (Bundle) afS64S0400000_13.l2;
        C0XO3 c0xo3 = ((C849550XUj) obj).LJIIJ;
        InterfaceC851540Xaq interfaceC851540Xaq = (InterfaceC851540Xaq) afS64S0400000_13.l3;
        C786410Ut5.LJJJI("platform_profile", "email", bundle);
        bundle.putInt("previous_page", EnumC852910Xd3.AGE_GATE_POST_EMAIL_SIGNUP.getValue());
        C0XYO c0xyo = C0XYO.LIZ;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = baseAccountFlowFragment.LLJJLIIIJLLLLLLLZ();
        c0xyo.getClass();
        C0XYO.LIZJ(baseAccountFlowFragment, baseAccountFlowFragment, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo3);
        if (C0XX7.LIZ()) {
            C0XX7.LIZ = null;
        }
        if (!C19285410ce.LIZ() && !bundle.getBoolean("is_need_verify_email", false)) {
            interfaceC851540Xaq.LIZ(bundle);
        }
        interfaceC851540Xaq.LIZJ(baseAccountFlowFragment, enumC852910Xd3);
        C1C7U.LIZIZ("AgeGateSignupVerifyEmailCodeEntryPoint@6db5.onAgeGateSuccess$1$2");
    }

    public static final void accept$2(AfS64S0400000_13 afS64S0400000_13, Object obj) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        int i;
        JSONObject jSONObjectOptJSONObject2;
        C1C7U.LIZ("VerifyEmailCodeForBindFlowStep@1a06.handleAction$3");
        C0XT7 c0xt7 = (C0XT7) obj;
        C853660XeG c853660XeG = C853660XeG.LIZ;
        C853090XdL c853090XdL = (C853090XdL) afS64S0400000_13.l0;
        EnumC1237100iIW enumC1237100iIW = c853090XdL.LJFF;
        boolean z = c853090XdL.LJ;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        User userLIZJ = C0XQ5.LIZJ();
        JSONObject jSONObject = c0xt7.LJIIIZ.LJ;
        String str = "";
        if (jSONObject == null || (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data")) == null || (strOptString = jSONObjectOptJSONObject2.optString("email")) == null) {
            strOptString = "";
        }
        Bundle bundle = (Bundle) afS64S0400000_13.l1;
        boolean z2 = false;
        if (bundle != null) {
            z2 = bundle.getBoolean("is_mandatory_two_sv", false);
        }
        if (!z2) {
            userLIZJ.setEmail(strOptString);
            userLIZJ.setEmailVerified(true);
            userLIZJ.setHasEmail(true);
        }
        String string = ((Bundle) afS64S0400000_13.l1).getString("enter_method");
        if (string != null) {
            str = string;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "click_link_existing");
        boolean zLJFF2 = Intrinsics.LJFF(str, "click_try_email");
        if (((Bundle) afS64S0400000_13.l1).getBoolean("show_success_toast", true)) {
            if (zLJFF) {
                i = 2131850156;
            } else if (zLJFF2) {
                i = 2131850225;
            } else {
                i = 2131833852;
            }
            C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
            c1233040iBy.LIZJ(((InputCodeFragmentV2.VerifyCodeActions) ((InterfaceC853790XeT) afS64S0400000_13.l2)).getFragment().getString(i));
            c1233040iBy.LIZLLL();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "type");
        C20684815ws.LJIILLIIL("email_bundling_success", c2344009Gk.LIZ);
        JSONObject jSONObject2 = c0xt7.LJIIIZ.LJ;
        if (jSONObject2 != null && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) != null) {
            jSONObjectOptJSONObject.optString("ticket");
        }
        C0XQ5.LJIIJJI(7, 1, new Object() { // from class: X.0XdJ
        });
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("ocl_checkbox_checked", ((C853090XdL) afS64S0400000_13.l0).LJI);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS64S0400000_13.l3;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(bundle2, true);
        }
        C1C7U.LIZIZ("VerifyEmailCodeForBindFlowStep@1a06.handleAction$3");
    }

    public static final void accept$3(AfS64S0400000_13 afS64S0400000_13, Object obj) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        C1C7U.LIZ("VerifyEmailCodeForChangeFlowStep@8af6.handleAction$5");
        C0XT7 c0xt7 = (C0XT7) obj;
        C853660XeG c853660XeG = C853660XeG.LIZ;
        EnumC1237100iIW enumC1237100iIW = ((InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction) ((InterfaceC853790XeT) afS64S0400000_13.l0)).mo153getParams().LJFF;
        boolean z = ((InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction) ((InterfaceC853790XeT) afS64S0400000_13.l0)).mo153getParams().LJ;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        User userLIZJ = C0XQ5.LIZJ();
        C0XUE.LIZ.LJIIIZ(userLIZJ.getUid(), ((InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction) ((InterfaceC853790XeT) afS64S0400000_13.l0)).mo153getParams().LIZ);
        JSONObject jSONObject = c0xt7.LJIIIZ.LJ;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null || (strOptString = jSONObjectOptJSONObject.optString("email")) == null) {
            strOptString = "";
        }
        userLIZJ.setEmail(strOptString);
        userLIZJ.setEmailVerified(true);
        userLIZJ.setHasEmail(true);
        if (((Bundle) afS64S0400000_13.l1).getBoolean("show_3p_change_email_success_toast", false)) {
            C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
            c1233040iBy.LIZJ(((Context) afS64S0400000_13.l2).getString(2131850225));
            c1233040iBy.LIZLLL();
        } else if (((Bundle) afS64S0400000_13.l1).getBoolean("show_modify_email_success_toast", false)) {
            C1233040iBy c1233040iBy2 = new C1233040iBy(C0XPY.LIZIZ);
            c1233040iBy2.LIZJ(((Context) afS64S0400000_13.l2).getString(2131827398));
            c1233040iBy2.LIZLLL();
        } else if (((Bundle) afS64S0400000_13.l1).getBoolean("show_success_toast", true)) {
            C1233040iBy c1233040iBy3 = new C1233040iBy(C0XPY.LIZIZ);
            c1233040iBy3.LIZJ(((Context) afS64S0400000_13.l2).getString(2131833860));
            c1233040iBy3.LIZLLL();
        }
        if (((Bundle) afS64S0400000_13.l1).getBoolean("is_from_prompt", false)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", ((Bundle) afS64S0400000_13.l1).getString("enter_from", ""));
            c2344009Gk.LJIIIIZZ("enter_method", ((Bundle) afS64S0400000_13.l1).getString("enter_method", ""));
            c2344009Gk.LJIIIIZZ("page", ((Bundle) afS64S0400000_13.l1).getString("page", ""));
            c2344009Gk.LJIIIIZZ("bind_status", "changed_to_new_email");
            C20684815ws.LJIILLIIL("email_bind_status", c2344009Gk.LIZ);
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LIZJ(2, "type");
        C20684815ws.LJIILLIIL("email_bundling_success", c2344009Gk2.LIZ);
        C854460XfY c854460XfY = C854460XfY.LIZ;
        BaseAccountFlowFragment fragment = ((InputCodeFragmentV2.VerifyCodeActions) ((InterfaceC853790XeT) afS64S0400000_13.l0)).getFragment();
        String enterFrom = ((InputCodeFragmentV2.VerifyCodeActions) ((InterfaceC853790XeT) afS64S0400000_13.l0)).getFragment().getEnterFrom();
        String enterMethod = ((InputCodeFragmentV2.VerifyCodeActions) ((InterfaceC853790XeT) afS64S0400000_13.l0)).getFragment().getEnterMethod();
        String strValueOf = String.valueOf(c0xt7.LJIIIZ.LIZIZ);
        c854460XfY.getClass();
        C854460XfY.LJIILLIIL(fragment, false, enterFrom, enterMethod, strValueOf, 1, false, "");
        Bundle bundle = new Bundle();
        bundle.putBoolean("ocl_checkbox_checked", ((InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction) ((InterfaceC853790XeT) afS64S0400000_13.l0)).mo153getParams().LJI);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS64S0400000_13.l3;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(bundle, true);
        }
        C1C7U.LIZIZ("VerifyEmailCodeForChangeFlowStep@8af6.handleAction$5");
    }

    public static final void accept$4(AfS64S0400000_13 afS64S0400000_13, Object obj) {
        C1C7U.LIZ("VerifyPIIEmailForBindFlowStep@cca5.handleAction$3");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        C853090XdL c853090XdL = (C853090XdL) afS64S0400000_13.l0;
        EnumC1237100iIW enumC1237100iIW = c853090XdL.LJFF;
        boolean z = c853090XdL.LJ;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        if (((Bundle) afS64S0400000_13.l1).getBoolean("show_success_toast", true)) {
            List<InterfaceC586170Myt> list = C0XQ5.LIZ;
            C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
            c1233040iBy.LIZJ(((InputCodeFragmentV2.VerifyCodeActions) ((InterfaceC853790XeT) afS64S0400000_13.l2)).getFragment().getString(2131833852));
            c1233040iBy.LIZLLL();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "type");
        C20684815ws.LJIILLIIL("email_bundling_success", c2344009Gk.LIZ);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS64S0400000_13.l3;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, true);
        }
        C1C7U.LIZIZ("VerifyPIIEmailForBindFlowStep@cca5.handleAction$3");
    }

    public static final void accept$5(AfS64S0400000_13 afS64S0400000_13, Object obj) {
        C1C7U.LIZ("VerifyPhoneForUnbindEmailFlowStep@cd65.handleAction$2");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        C853080XdK c853080XdK = (C853080XdK) afS64S0400000_13.l0;
        EnumC1237100iIW enumC1237100iIW = c853080XdK.LIZLLL;
        boolean z = c853080XdK.LIZJ;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        ((C853840XeY) afS64S0400000_13.l1).LJIIIIZZ(true, 0, EnumC854390XfR.SMS);
        C854460XfY c854460XfY = C854460XfY.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS64S0400000_13.l2;
        AwS379S0200000_13 awS379S0200000_13 = new AwS379S0200000_13((C853840XeY) afS64S0400000_13.l1, (InterfaceC853780XeS) afS64S0400000_13.l3, 8);
        c854460XfY.getClass();
        C854460XfY.LIZIZ(baseAccountFlowFragment, awS379S0200000_13);
        C1C7U.LIZIZ("VerifyPhoneForUnbindEmailFlowStep@cd65.handleAction$2");
    }

    public static final void accept$6(AfS64S0400000_13 afS64S0400000_13, Object obj) {
        C1C7U.LIZ("VerifyPhoneForUnbindPhoneFlowStep@d858.handleAction$2");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        C853080XdK c853080XdK = (C853080XdK) afS64S0400000_13.l0;
        EnumC1237100iIW enumC1237100iIW = c853080XdK.LIZLLL;
        boolean z = c853080XdK.LIZJ;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        ((C853810XeV) afS64S0400000_13.l1).LJIIIIZZ(true, 0, EnumC854390XfR.SMS);
        C854460XfY c854460XfY = C854460XfY.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS64S0400000_13.l2;
        AwS379S0200000_13 awS379S0200000_13 = new AwS379S0200000_13((C853810XeV) afS64S0400000_13.l1, (InterfaceC853780XeS) afS64S0400000_13.l3, 11);
        c854460XfY.getClass();
        C854460XfY.LIZJ(baseAccountFlowFragment, awS379S0200000_13);
        C1C7U.LIZIZ("VerifyPhoneForUnbindPhoneFlowStep@d858.handleAction$2");
    }

    public static final void accept$7(AfS64S0400000_13 afS64S0400000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailForUnbindEmailFlowStep@bdba.handleAction$2");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        C853090XdL c853090XdL = (C853090XdL) afS64S0400000_13.l0;
        EnumC1237100iIW enumC1237100iIW = c853090XdL.LJFF;
        boolean z = c853090XdL.LJ;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        ((C853820XeW) afS64S0400000_13.l1).LJIIIIZZ(true, 0, EnumC854390XfR.EMAIL);
        C854460XfY c854460XfY = C854460XfY.LIZ;
        BaseAccountFlowFragment fragment = ((InputCodeFragmentV2.VerifyCodeActions) ((InterfaceC853790XeT) afS64S0400000_13.l2)).getFragment();
        AwS379S0200000_13 awS379S0200000_13 = new AwS379S0200000_13((C853820XeW) afS64S0400000_13.l1, (InterfaceC853780XeS) afS64S0400000_13.l3, 12);
        c854460XfY.getClass();
        C854460XfY.LIZIZ(fragment, awS379S0200000_13);
        C1C7U.LIZIZ("VerifyEmailForUnbindEmailFlowStep@bdba.handleAction$2");
    }

    public static final void accept$8(AfS64S0400000_13 afS64S0400000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailForUnbindPhoneFlowStep@b2c7.handleAction$2");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        C853090XdL c853090XdL = (C853090XdL) afS64S0400000_13.l0;
        EnumC1237100iIW enumC1237100iIW = c853090XdL.LJFF;
        boolean z = c853090XdL.LJ;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        ((C853830XeX) afS64S0400000_13.l1).LJIIIIZZ(true, 0, EnumC854390XfR.EMAIL);
        C854460XfY c854460XfY = C854460XfY.LIZ;
        BaseAccountFlowFragment fragment = ((InputCodeFragmentV2.VerifyCodeActions) ((InterfaceC853790XeT) afS64S0400000_13.l2)).getFragment();
        AwS379S0200000_13 awS379S0200000_13 = new AwS379S0200000_13((C853830XeX) afS64S0400000_13.l1, (InterfaceC853780XeS) afS64S0400000_13.l3, 13);
        c854460XfY.getClass();
        C854460XfY.LIZJ(fragment, awS379S0200000_13);
        C1C7U.LIZIZ("VerifyEmailForUnbindPhoneFlowStep@b2c7.handleAction$2");
    }

    public AfS64S0400000_13(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }

    public AfS64S0400000_13(InterfaceC851560Xas interfaceC851560Xas, EnumC852910Xd3 enumC852910Xd3, BaseAccountFlowFragment baseAccountFlowFragment, Bundle bundle, C851660Xb2 c851660Xb2, int i) {
        this.$t = i;
        this.l0 = enumC852910Xd3;
        this.l1 = baseAccountFlowFragment;
        this.l2 = bundle;
        this.l3 = c851660Xb2;
    }

    public AfS64S0400000_13(InterfaceC851650Xb1 interfaceC851650Xb1, EnumC852910Xd3 enumC852910Xd3, BaseAccountFlowFragment baseAccountFlowFragment, Bundle bundle, C851660Xb2 c851660Xb2, int i) {
        this.$t = i;
        this.l0 = enumC852910Xd3;
        this.l1 = baseAccountFlowFragment;
        this.l2 = bundle;
        this.l3 = c851660Xb2;
    }
}
