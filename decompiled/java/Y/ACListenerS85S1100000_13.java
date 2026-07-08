package Y;

import X.C0XGR;
import X.C1236890iIB;
import X.C1247510iZJ;
import X.C1390850mIV;
import X.C1907570zjv;
import X.C19EG;
import X.C20684815ws;
import X.C786410Ut5;
import X.C852810Xct;
import X.C854720Xfy;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.verify.VerifyEmailCodeFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class ACListenerS85S1100000_13 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS85S1100000_13 aCListenerS85S1100000_13, View view) {
        boolean z;
        C1236890iIB c1236890iIB = C1236890iIB.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) aCListenerS85S1100000_13.l1;
        String str = aCListenerS85S1100000_13.s0;
        c1236890iIB.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", baseAccountFlowFragment.LLIIJI());
        c0xgr.LIZLLL("enter_from", baseAccountFlowFragment.LJJLIIIJJI());
        c0xgr.LIZLLL("login_panel_type", baseAccountFlowFragment.PR());
        c0xgr.LIZLLL("page", baseAccountFlowFragment.RR());
        c0xgr.LIZLLL("click", "log_in_with_password");
        c0xgr.LIZLLL("platform", "phone");
        C20684815ws.LJIILLIIL("switch_to_password", c0xgr.LIZ);
        Bundle arguments = baseAccountFlowFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Bundle bundle = new Bundle(arguments);
        if (baseAccountFlowFragment.SR() == EnumC852660Xce.EMAIL_OTP_LOGIN) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(baseAccountFlowFragment.RR(), "failed_3p_login")) {
            C786410Ut5.LJJJI("passport_ticket", str, bundle);
            bundle.putInt("next_page", EnumC852910Xd3.FAILED_3P_PASSWORD_LOGIN.getValue());
        } else {
            C852810Xct c852810Xct = C852810Xct.LIZ;
            EnumC852660Xce enumC852660XceSR = baseAccountFlowFragment.SR();
            c852810Xct.getClass();
            if (enumC852660XceSR == EnumC852660Xce.HISTORY_LOGIN_WITH_PASSPORT_TICKET) {
                C786410Ut5.LJJJI("passport_ticket", str, bundle);
                bundle.putInt("next_page", EnumC852910Xd3.PHONE_HL_LOGIN_SWITCH_TO_PASSWORD.getValue());
            } else if (z) {
                bundle.putInt("next_page", EnumC852910Xd3.EMAIL_OTP_LOGIN_SWITCH_TO_PASSWORD.getValue());
                C786410Ut5.LJJJI("passport_ticket", null, bundle);
            } else {
                bundle.putInt("next_page", EnumC852910Xd3.PHONE_PASSWORD_LOGIN.getValue());
            }
        }
        bundle.putInt("current_scene", baseAccountFlowFragment.SR().getValue());
        bundle.putBoolean("recover_mobile_code", C1236890iIB.LIZLLL);
        C786410Ut5.LJJIZ(bundle, "recover_account_data", C1236890iIB.LJ);
        baseAccountFlowFragment.fo(bundle);
    }

    public static final void onClick$1(ACListenerS85S1100000_13 aCListenerS85S1100000_13, View view) {
        Bundle bundle;
        CommonFlowActivity commonFlowActivity;
        IBindService iBindServiceLJII = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJII();
        C19EG activity = ((VerifyEmailCodeFragment) aCListenerS85S1100000_13.l1).getActivity();
        if (!(activity instanceof CommonFlowActivity) || (commonFlowActivity = (CommonFlowActivity) activity) == null || (bundle = commonFlowActivity.LLLZZIL()) == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        String str = aCListenerS85S1100000_13.s0;
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIILLIIL(bundle2, "");
        C786410Ut5.LJJJI("passport_ticket", str, bundle2);
        C852810Xct.LJIILL(bundle2, "email_verification");
        iBindServiceLJII.changeUnverifiedEmail(((VerifyEmailCodeFragment) aCListenerS85S1100000_13.l1).getActivity(), ((VerifyEmailCodeFragment) aCListenerS85S1100000_13.l1).getEnterFrom(), "click_change", bundle2, true, new C854720Xfy((VerifyEmailCodeFragment) aCListenerS85S1100000_13.l1, 12));
        ((VerifyEmailCodeFragment) aCListenerS85S1100000_13.l1).AT("email_verify_safe_change_email_click");
    }

    public static final void onClick$2(ACListenerS85S1100000_13 aCListenerS85S1100000_13, View view) {
        VerifyEmailCodeFragment verifyEmailCodeFragment = (VerifyEmailCodeFragment) aCListenerS85S1100000_13.l1;
        String str = aCListenerS85S1100000_13.s0;
        verifyEmailCodeFragment.getClass();
        ArrayList arrayList = new ArrayList();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131850158);
        c1247510iZJ.LJ = new ACListenerS148S0100000_13(verifyEmailCodeFragment, 46);
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        c1247510iZJ2.LIZIZ(2131850157);
        c1247510iZJ2.LJ = new ACListenerS85S1100000_13(verifyEmailCodeFragment, str, 1);
        arrayList.add(c1247510iZJ);
        arrayList.add(c1247510iZJ2);
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ[] c1247510iZJArr = (C1247510iZJ[]) arrayList.toArray(new C1247510iZJ[0]);
        c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
        c1390850mIV.LIZJ().show(verifyEmailCodeFragment.getChildFragmentManager(), "MethodsSheet");
        ((VerifyEmailCodeFragment) aCListenerS85S1100000_13.l1).AT("email_verify_other_method_show");
    }

    public static final void onClick$3(ACListenerS85S1100000_13 aCListenerS85S1100000_13, View view) {
        SmartRouter.buildRoute(((C1907570zjv) aCListenerS85S1100000_13.l1).getContext(), aCListenerS85S1100000_13.s0).open();
    }

    public ACListenerS85S1100000_13(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
