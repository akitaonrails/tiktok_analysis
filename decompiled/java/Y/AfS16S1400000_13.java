package Y;

import X.C09JN;
import X.C0XO3;
import X.C0XT7;
import X.C0XX7;
import X.C0XYO;
import X.C0XZJ;
import X.C1C7U;
import X.C786410Ut5;
import X.C850350XXl;
import X.C851520Xao;
import X.C851660Xb2;
import X.C852170Xbr;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC851540Xaq;
import X.InterfaceC851560Xas;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;

/* JADX INFO: loaded from: classes14.dex */
public class AfS16S1400000_13 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS16S1400000_13 afS16S1400000_13, Object obj) {
        C1C7U.LIZ("AgeGateQuickLoginEntryPoint@27bb.onAgeGateSuccessForPhoneSignUp$1$1");
        C0XT7 c0xt7 = (C0XT7) obj;
        C786410Ut5.LJJJI("platform_profile", "sms_verification", (Bundle) afS16S1400000_13.l1);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        String str = afS16S1400000_13.s0;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS16S1400000_13.l2;
        C0XO3 c0xo3 = ((C850350XXl) c0xt7.LJIIIZ).LJIIIIZZ;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(true, str, baseAccountFlowFragment, c0xo3, null);
        C0XYO c0xyo = C0XYO.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment2 = (BaseAccountFlowFragment) afS16S1400000_13.l2;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
        EnumC852910Xd3 enumC852910Xd3VR = baseAccountFlowFragment2.VR();
        C0XO3 c0xo32 = ((C850350XXl) c0xt7.LJIIIZ).LJIIIIZZ;
        c0xyo.getClass();
        C0XYO.LIZJ(baseAccountFlowFragment2, baseAccountFlowFragment2, enumC852660Xce, enumC852910Xd3VR, null, c0xo32);
        if (C0XX7.LIZ()) {
            C0XX7.LIZ = null;
        }
        InterfaceC851540Xaq interfaceC851540Xaq = (InterfaceC851540Xaq) afS16S1400000_13.l3;
        Bundle bundle = (Bundle) afS16S1400000_13.l1;
        bundle.putInt("previous_page", EnumC852910Xd3.AGE_GATE_POST_PHONE_SIGNUP.getValue());
        interfaceC851540Xaq.LIZ(bundle);
        ((InterfaceC851540Xaq) afS16S1400000_13.l3).LIZJ((BaseAccountFlowFragment) afS16S1400000_13.l2, (EnumC852910Xd3) afS16S1400000_13.l4);
        C1C7U.LIZIZ("AgeGateQuickLoginEntryPoint@27bb.onAgeGateSuccessForPhoneSignUp$1$1");
    }

    public static final void accept$1(AfS16S1400000_13 afS16S1400000_13, Object obj) {
        C1C7U.LIZ("AgeGateSignupCreatePasswordEntryPoint@bd9e.emailRegister$1$2");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        ((SetPasswordMobHelper) afS16S1400000_13.l1).LIZ(false, "email", ((BaseAccountFlowFragment) afS16S1400000_13.l2).getEnterFrom(), ((BaseAccountFlowFragment) afS16S1400000_13.l2).getEnterMethod(), ((BaseAccountFlowFragment) afS16S1400000_13.l2).PR(), c0xzj.getErrorCode(), (BaseAccountFlowFragment) afS16S1400000_13.l2, afS16S1400000_13.s0);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        int errorCode = c0xzj.getErrorCode();
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS16S1400000_13.l2;
        c852170Xbr.getClass();
        C852170Xbr.LJIIIIZZ(true, errorCode, "email", baseAccountFlowFragment, null);
        C851520Xao.LIZ((EnumC852910Xd3) afS16S1400000_13.l3, c0xzj, (BaseAccountFlowFragment) afS16S1400000_13.l2, (InterfaceC851540Xaq) afS16S1400000_13.l4);
        C1C7U.LIZIZ("AgeGateSignupCreatePasswordEntryPoint@bd9e.emailRegister$1$2");
    }

    public AfS16S1400000_13(Bundle bundle, String str, BaseAccountFlowFragment baseAccountFlowFragment, C851660Xb2 c851660Xb2, EnumC852910Xd3 enumC852910Xd3, int i) {
        this.$t = i;
        this.l1 = bundle;
        this.s0 = str;
        this.l2 = baseAccountFlowFragment;
        this.l3 = c851660Xb2;
        this.l4 = enumC852910Xd3;
    }

    public AfS16S1400000_13(SetPasswordMobHelper setPasswordMobHelper, BaseAccountFlowFragment baseAccountFlowFragment, String str, InterfaceC851560Xas interfaceC851560Xas, EnumC852910Xd3 enumC852910Xd3, C851660Xb2 c851660Xb2, int i) {
        this.$t = i;
        this.l1 = setPasswordMobHelper;
        this.l2 = baseAccountFlowFragment;
        this.s0 = str;
        this.l3 = enumC852910Xd3;
        this.l4 = c851660Xb2;
    }
}
