package Y;

import X.C09JN;
import X.C0XO3;
import X.C0XPY;
import X.C0XQ5;
import X.C0XT7;
import X.C0XYD;
import X.C0XYO;
import X.C0XZ4;
import X.C0XZP;
import X.C0XZV;
import X.C1233040iBy;
import X.C1237910iJp;
import X.C1237940iJs;
import X.C19EG;
import X.C1C7U;
import X.C2187451AjH;
import X.C786410Ut5;
import X.C849670XUv;
import X.C850330XXj;
import X.C851430Xaf;
import X.C852170Xbr;
import X.C852810Xct;
import X.C853080XdK;
import X.C853090XdL;
import X.C853150XdR;
import X.C853210XdX;
import X.C853280Xde;
import X.C853300Xdg;
import X.C853430Xdt;
import X.C853490Xdz;
import X.C853570Xe7;
import X.C853580Xe8;
import X.C853590Xe9;
import X.C853660XeG;
import X.C853970Xel;
import X.C853980Xem;
import X.C854460XfY;
import X.EnumC1237100iIW;
import X.EnumC851410Xad;
import X.EnumC852910Xd3;
import X.EnumC854390XfR;
import X.InterfaceC851540Xaq;
import X.InterfaceC853780XeS;
import X.InterfaceC853790XeT;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.interceptor.ConditionalBindLoginParam;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AwS379S0200000_13;

/* JADX INFO: loaded from: classes14.dex */
public class AfS108S0300000_13 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        C1C7U.LIZ("AgeGateQuickLoginEntryPoint@27bb.onAgeGateSuccessForLogin$1$2");
        ((InterfaceC851540Xaq) afS108S0300000_13.l0).LIZJ((BaseAccountFlowFragment) afS108S0300000_13.l1, (EnumC852910Xd3) afS108S0300000_13.l2);
        C1C7U.LIZIZ("AgeGateQuickLoginEntryPoint@27bb.onAgeGateSuccessForLogin$1$2");
    }

    public static final void accept$1(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        String string;
        C1C7U.LIZ("NetworkHelper@8b8f.requestValidateSMSCode$2");
        C851430Xaf.LIZ(0, ((C0XYD) afS108S0300000_13.l0).getMobParams().LJJLIIIJJI(), "change_bind_phone_click", "phone", ((C0XYD) afS108S0300000_13.l0).Qm());
        String strLJJLIIIJJI = ((C0XYD) afS108S0300000_13.l0).getMobParams().LJJLIIIJJI();
        String strLLIIJI = ((C0XYD) afS108S0300000_13.l0).getMobParams().LLIIJI();
        Bundle arguments = ((Fragment) afS108S0300000_13.l1).getArguments();
        if (arguments != null) {
            string = arguments.getString("page");
        } else {
            string = null;
        }
        C851430Xaf.LIZIZ("phone_bind_status", strLJJLIIIJJI, strLLIIJI, string, "verified_old_phone");
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS108S0300000_13.l0).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS108S0300000_13.l0).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.SUCCESS.getValue());
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS108S0300000_13.l2;
        c0xz4.getClass();
        clientSmsVerificationResultEvent.LJIIL(C0XZ4.LJJII(enumC852910Xd3));
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJIIIIZZ();
        C1C7U.LIZIZ("NetworkHelper@8b8f.requestValidateSMSCode$2");
    }

    public static final void accept$10(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        C1C7U.LIZ("PIIInputPhoneFlowStep@1a48.handleAction$1");
        C852810Xct c852810Xct = C852810Xct.LIZ;
        Bundle data = ((C1237940iJs) afS108S0300000_13.l0).LIZ().getData();
        String str = ((C1237910iJp) afS108S0300000_13.l1).LIZ;
        c852810Xct.getClass();
        C852810Xct.LJIJI(data, str);
        ((C1237940iJs) afS108S0300000_13.l0).LIZ().getData().putBoolean("code_sent", true);
        C853590Xe9 c853590Xe9 = C853590Xe9.LIZ;
        String string = ((C1237940iJs) afS108S0300000_13.l0).LIZ().getData().getString("enter_from");
        c853590Xe9.getClass();
        C853590Xe9.LIZ(string, "1", CardStruct.IStatusCode.DEFAULT);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS108S0300000_13.l2;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, true);
        }
        C1C7U.LIZIZ("PIIInputPhoneFlowStep@1a48.handleAction$1");
    }

    public static final void accept$11(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        C1C7U.LIZ("VerifyPIIEmailForBindFlowStep@cca5.handleAction$1");
        ((InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) ((InterfaceC853790XeT) afS108S0300000_13.l0)).getFragment().oT();
        C786410Ut5.LJJJI("args_email", ((InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) ((InterfaceC853790XeT) afS108S0300000_13.l0)).mo153getParams().LIZ, ((C853430Xdt) afS108S0300000_13.l1).LIZLLL.getData());
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS108S0300000_13.l2;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, false);
        }
        C1C7U.LIZIZ("VerifyPIIEmailForBindFlowStep@cca5.handleAction$1");
    }

    public static final void accept$12(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        String str;
        C1C7U.LIZ("VerifyPasswordForUnbindEmailFlowStep@fc56.handleAction$1");
        ((C853970Xel) afS108S0300000_13.l0).LJIIIIZZ(true, 0, EnumC854390XfR.PASSWORD);
        C854460XfY c854460XfY = C854460XfY.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS108S0300000_13.l1;
        AwS379S0200000_13 awS379S0200000_13 = new AwS379S0200000_13((C853970Xel) afS108S0300000_13.l0, (InterfaceC853780XeS) afS108S0300000_13.l2, 14);
        c854460XfY.getClass();
        C854460XfY.LIZIZ(baseAccountFlowFragment, awS379S0200000_13);
        Bundle bundle = new Bundle();
        C0XZP c0xzp = (C0XZP) ((C0XT7) obj).LJIIIZ;
        if (c0xzp == null || (str = c0xzp.LJIIIIZZ) == null) {
            str = "";
        }
        C786410Ut5.LJJJI("ticket", str, bundle);
        C0XQ5.LJIIJJI(17, 1, bundle);
        C1C7U.LIZIZ("VerifyPasswordForUnbindEmailFlowStep@fc56.handleAction$1");
    }

    public static final void accept$13(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        String str;
        C1C7U.LIZ("VerifyPasswordForUnbindPhoneFlowStep@f163.handleAction$1");
        ((C853980Xem) afS108S0300000_13.l0).LJIIIIZZ(true, 0, EnumC854390XfR.PASSWORD);
        C854460XfY c854460XfY = C854460XfY.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS108S0300000_13.l1;
        AwS379S0200000_13 awS379S0200000_13 = new AwS379S0200000_13((C853980Xem) afS108S0300000_13.l0, (InterfaceC853780XeS) afS108S0300000_13.l2, 15);
        c854460XfY.getClass();
        C854460XfY.LIZJ(baseAccountFlowFragment, awS379S0200000_13);
        Bundle bundle = new Bundle();
        C0XZP c0xzp = (C0XZP) ((C0XT7) obj).LJIIIZ;
        if (c0xzp == null || (str = c0xzp.LJIIIIZZ) == null) {
            str = "";
        }
        C786410Ut5.LJJJI("ticket", str, bundle);
        C0XQ5.LJIIJJI(17, 1, bundle);
        C1C7U.LIZIZ("VerifyPasswordForUnbindPhoneFlowStep@f163.handleAction$1");
    }

    public static final void accept$2(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.conditionalBindLogin$5");
        C0XZV c0xzv = (C0XZV) obj;
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        boolean zIsRegister = ((ConditionalBindLoginParam) afS108S0300000_13.l0).isRegister();
        BaseAccountFlowFragment mobParams = ((C0XYD) afS108S0300000_13.l1).getMobParams();
        C0XO3 c0xo3 = c0xzv.LJIIIZ;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(zIsRegister, "phone", mobParams, c0xo3, null);
        C19EG activity = ((Fragment) afS108S0300000_13.l2).getActivity();
        if (activity != null) {
            C0XYO.LIZLLL(C0XYO.LIZ, activity, null, c0xzv.LJIIIZ, false, null, false, 112);
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.conditionalBindLogin$5");
    }

    public static final void accept$3(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        C1C7U.LIZ("InputEmailForBindFlowStep@dc9b.handleAction$1");
        ((C853210XdX) afS108S0300000_13.l0).LIZ().getData().putBoolean("code_sent", true);
        C786410Ut5.LJJJI("args_email", ((CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction) ((InterfaceC853790XeT) afS108S0300000_13.l1)).mo151getParams().LIZ, ((C853210XdX) afS108S0300000_13.l0).LIZ().getData());
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS108S0300000_13.l2;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, true);
        }
        C1C7U.LIZIZ("InputEmailForBindFlowStep@dc9b.handleAction$1");
    }

    public static final void accept$4(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        C1C7U.LIZ("InputEmailForChangeFlowStep@e0.sendCode$1");
        ((C853150XdR) afS108S0300000_13.l0).LJIILL((BaseAccountFlowFragment) afS108S0300000_13.l1, true, (InterfaceC853780XeS) afS108S0300000_13.l2);
        C1C7U.LIZIZ("InputEmailForChangeFlowStep@e0.sendCode$1");
    }

    public static final void accept$5(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailBeforeChangeFlowStep@123.handleAction$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        C853090XdL c853090XdL = (C853090XdL) afS108S0300000_13.l0;
        EnumC1237100iIW enumC1237100iIW = c853090XdL.LJFF;
        boolean z = c853090XdL.LJ;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        C852810Xct c852810Xct = C852810Xct.LIZ;
        Bundle data = ((C853490Xdz) afS108S0300000_13.l1).LIZ.getData();
        c852810Xct.getClass();
        C852810Xct.LJIILLIIL(data, "");
        C852810Xct.LJIJI(((C853490Xdz) afS108S0300000_13.l1).LIZ.getData(), "");
        C852810Xct.LJIJJ(((C853490Xdz) afS108S0300000_13.l1).LIZ.getData(), ((C849670XUv) obj).LJIIIZ);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS108S0300000_13.l2;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, true);
        }
        C1C7U.LIZIZ("VerifyEmailBeforeChangeFlowStep@123.handleAction$1");
    }

    public static final void accept$6(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailCodeForBindFlowStep@1a06.handleAction$1");
        ((InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) ((InterfaceC853790XeT) afS108S0300000_13.l0)).getFragment().oT();
        C786410Ut5.LJJJI("args_email", ((InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) ((InterfaceC853790XeT) afS108S0300000_13.l0)).mo153getParams().LIZ, ((C853280Xde) afS108S0300000_13.l1).LIZ().getData());
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS108S0300000_13.l2;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, false);
        }
        C1C7U.LIZIZ("VerifyEmailCodeForBindFlowStep@1a06.handleAction$1");
    }

    public static final void accept$7(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        C1C7U.LIZ("InputPhoneForBindFlowStep@e270.handleAction$1");
        C852810Xct c852810Xct = C852810Xct.LIZ;
        Bundle data = ((C853580Xe8) afS108S0300000_13.l0).LIZ.getData();
        String str = ((C853570Xe7) afS108S0300000_13.l1).LIZ;
        c852810Xct.getClass();
        C852810Xct.LJIJI(data, str);
        ((C853580Xe8) afS108S0300000_13.l0).LIZ.getData().putBoolean("code_sent", true);
        C853590Xe9 c853590Xe9 = C853590Xe9.LIZ;
        String string = ((C853580Xe8) afS108S0300000_13.l0).LIZ.getData().getString("enter_from");
        c853590Xe9.getClass();
        C853590Xe9.LIZ(string, "1", CardStruct.IStatusCode.DEFAULT);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS108S0300000_13.l2;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, true);
        }
        C1C7U.LIZIZ("InputPhoneForBindFlowStep@e270.handleAction$1");
    }

    public static final void accept$8(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        C1C7U.LIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$1");
        ((C853300Xdg) afS108S0300000_13.l0).LIZ().getData().putBoolean("code_sent", true);
        ((InputCodeFragmentV2.VerifyCodeActions.ClickResendPhoneCodeAction) ((InterfaceC853790XeT) afS108S0300000_13.l1)).getFragment().oT();
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS108S0300000_13.l2;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, false);
        }
        C1C7U.LIZIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$1");
    }

    public static final void accept$9(AfS108S0300000_13 afS108S0300000_13, Object obj) {
        C1C7U.LIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$3");
        C0XT7 c0xt7 = (C0XT7) obj;
        C853660XeG c853660XeG = C853660XeG.LIZ;
        C853080XdK c853080XdK = (C853080XdK) afS108S0300000_13.l0;
        EnumC1237100iIW enumC1237100iIW = c853080XdK.LIZLLL;
        boolean z = c853080XdK.LIZJ;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        C854460XfY c854460XfY = C854460XfY.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS108S0300000_13.l1;
        String strLJJLIIIJJI = baseAccountFlowFragment.LJJLIIIJJI();
        String strLLIIJI = ((BaseAccountFlowFragment) afS108S0300000_13.l1).LLIIJI();
        String strValueOf = String.valueOf(c0xt7.LJIIIZ.LIZIZ);
        String strRR = ((BaseAccountFlowFragment) afS108S0300000_13.l1).RR();
        c854460XfY.getClass();
        C854460XfY.LJIILLIIL(baseAccountFlowFragment, true, strLJJLIIIJJI, strLLIIJI, strValueOf, 1, false, strRR);
        C0XYO c0xyo = C0XYO.LIZ;
        PhoneNumberUtil.PhoneNumber phoneNumberLIZLLL = PhoneNumberUtil.LIZLLL(((C853080XdK) afS108S0300000_13.l0).LIZ);
        BaseAccountFlowFragment baseAccountFlowFragment2 = (BaseAccountFlowFragment) afS108S0300000_13.l1;
        C850330XXj c850330XXj = (C850330XXj) c0xt7.LJIIIZ;
        c0xyo.getClass();
        C0XYO.LJ(phoneNumberLIZLLL, baseAccountFlowFragment2, c850330XXj);
        int i = C2187451AjH.LIZ;
        C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
        c1233040iBy.LIZJ(((BaseAccountFlowFragment) afS108S0300000_13.l1).getString(2131827404));
        c1233040iBy.LIZLLL();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ocl_checkbox_checked", ((C853080XdK) afS108S0300000_13.l0).LJ);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS108S0300000_13.l2;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(bundle, true);
        }
        C1C7U.LIZIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$3");
    }

    public AfS108S0300000_13(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj2;
        this.l2 = obj;
    }
}
