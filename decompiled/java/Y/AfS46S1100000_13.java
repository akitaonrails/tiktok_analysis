package Y;

import X.C09JN;
import X.C0WIE;
import X.C0WIS;
import X.C0XO2;
import X.C0XPY;
import X.C0XQ5;
import X.C0XT7;
import X.C0XYD;
import X.C0XYO;
import X.C0XZ2;
import X.C0XZJ;
import X.C1233040iBy;
import X.C1239130iLn;
import X.C19285410ce;
import X.C1C7U;
import X.C2188811AlT;
import X.C282240B4k;
import X.C786410Ut5;
import X.C849450XTz;
import X.C849580XUm;
import X.C850850XZj;
import X.C851050Xa3;
import X.C851100Xa8;
import X.C851140XaC;
import X.C851430Xaf;
import X.C851830XbJ;
import X.C852170Xbr;
import X.C852810Xct;
import X.C853660XeG;
import X.C854460XfY;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC586170Myt;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.account.verify.ConfirmEmailFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS162S1100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class AfS46S1100000_13 implements C09JN {
    public final int $t;
    public Object l1;
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
            case 14:
                accept$14(this, obj);
                break;
        }
    }

    public AfS46S1100000_13(C0XYD c0xyd, int i) {
        this.$t = i;
        this.l1 = c0xyd;
        this.s0 = "";
    }

    public static final void accept$0(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("EmailSignUpHandler@7826.handle$2");
        C851140XaC c851140XaC = (C851140XaC) afS46S1100000_13.l1;
        C0XYD c0xyd = c851140XaC.LIZIZ;
        Bundle arguments = c851140XaC.LIZ.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        String str = afS46S1100000_13.s0;
        arguments.putBoolean("code_sent", true);
        arguments.putInt("next_page", EnumC852910Xd3.EMAIL_SMS_SIGN_UP.getValue());
        C786410Ut5.LJJJI("password", str, arguments);
        c0xyd.fo(arguments);
        C1C7U.LIZIZ("EmailSignUpHandler@7826.handle$2");
    }

    public static final void accept$1(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.quickLoginContinueForSignup$1");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        int errorCode = ((C0XZJ) ((Throwable) obj)).getErrorCode();
        String str = afS46S1100000_13.s0;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS46S1100000_13.l1).getMobParams();
        c852170Xbr.getClass();
        C852170Xbr.LJIIIIZZ(true, errorCode, str, mobParams, null);
        C1C7U.LIZIZ("NetworkHelper@8b8f.quickLoginContinueForSignup$1");
    }

    public static final void accept$10(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("BaseUpdatePasswordFragment@1cae.onSubmit$3");
        C0XQ5.LJIIJJI(8, 1, ((C851050Xa3) ((C0XT7) obj).LJIIIZ).LJII);
        C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
        c1233040iBy.LIZJ(afS46S1100000_13.s0);
        c1233040iBy.LIZLLL();
        ((BaseUpdatePasswordFragment) afS46S1100000_13.l1).getActivity().finish();
        C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.onSubmit$3");
    }

    public static final void accept$11(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("ConfirmEmailFragment@caf6.sendCode$1");
        ConfirmEmailFragment confirmEmailFragment = (ConfirmEmailFragment) afS46S1100000_13.l1;
        String str = afS46S1100000_13.s0;
        confirmEmailFragment.getClass();
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIIZILJ(confirmEmailFragment, str);
        C852810Xct.LJIILJJIL(confirmEmailFragment, true);
        Bundle arguments = confirmEmailFragment.getArguments();
        arguments.putInt("next_page", EnumC852910Xd3.EMAIL_SMS_VERIFY.getValue());
        confirmEmailFragment.fo(arguments);
        C1C7U.LIZIZ("ConfirmEmailFragment@caf6.sendCode$1");
    }

    public static final void accept$12(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("SamsungSearchTikTokBrowserService@d2ae.onSearch$2");
        C0WIE c0wie = C0WIE.LIZ;
        String str = afS46S1100000_13.s0;
        c0wie.getClass();
        C0WIE.LIZ(str, "request_error");
        ((C0WIS) afS46S1100000_13.l1).LIZLLL(null);
        C1C7U.LIZIZ("SamsungSearchTikTokBrowserService@d2ae.onSearch$2");
    }

    public static final void accept$13(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("InputEmailFragment@5254.startSendCode$1");
        ((InputEmailFragment) afS46S1100000_13.l1).PS(afS46S1100000_13.s0, true);
        C1C7U.LIZIZ("InputEmailFragment@5254.startSendCode$1");
    }

    public static final void accept$14(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("EmailLoginFragment@e10f.navigateToEmailOtpLoginNextPage$1");
        C0XT7 c0xt7 = (C0XT7) obj;
        C0XZ2.LIZJ(afS46S1100000_13.s0, (C849450XTz) c0xt7.LJIIIZ);
        String strLIZ = C0XZ2.LIZ((C849450XTz) c0xt7.LJIIIZ);
        if (strLIZ != null) {
            EmailLoginFragment emailLoginFragment = (EmailLoginFragment) afS46S1100000_13.l1;
            String str = afS46S1100000_13.s0;
            C854460XfY c854460XfY = C854460XfY.LIZ;
            Bundle arguments = emailLoginFragment.getArguments();
            c854460XfY.getClass();
            if (arguments != null) {
                C786410Ut5.LJJJI("passport_ticket", strLIZ, arguments);
            }
            ((AvailableWaysViewModel) emailLoginFragment.LLLLIILL.getValue()).wQ2(str, strLIZ, emailLoginFragment.getEnterFrom(), emailLoginFragment.getEnterMethod(), emailLoginFragment.PR(), emailLoginFragment.RR());
        }
        ((EmailLoginFragment) afS46S1100000_13.l1).fo(((EmailLoginFragment) afS46S1100000_13.l1).QS(afS46S1100000_13.s0, true));
        C1C7U.LIZIZ("EmailLoginFragment@e10f.navigateToEmailOtpLoginNextPage$1");
    }

    public static final void accept$2(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.bindEmailWithoutVerify$2");
        C851430Xaf.LJI(0, ((C0XYD) afS46S1100000_13.l1).getMobParams().LJJLIIIJJI(), null, ((C0XYD) afS46S1100000_13.l1).getMobParams().LLIIJI(), afS46S1100000_13.s0);
        C1C7U.LIZIZ("NetworkHelper@8b8f.bindEmailWithoutVerify$2");
    }

    public static final void accept$3(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.bindEmailWithoutVerify$3");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        C851430Xaf.LJI(c0xzj.getErrorCode(), ((C0XYD) afS46S1100000_13.l1).getMobParams().LJJLIIIJJI(), c0xzj.getErrorMsg(), ((C0XYD) afS46S1100000_13.l1).getMobParams().LLIIJI(), afS46S1100000_13.s0);
        C1C7U.LIZIZ("NetworkHelper@8b8f.bindEmailWithoutVerify$3");
    }

    public static final void accept$4(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.loginTicketByPwd$3");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        int errorCode = ((C0XZJ) ((Throwable) obj)).getErrorCode();
        String str = afS46S1100000_13.s0;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS46S1100000_13.l1).getMobParams();
        c852170Xbr.getClass();
        C852170Xbr.LJIIIIZZ(false, errorCode, str, mobParams, null);
        C1C7U.LIZIZ("NetworkHelper@8b8f.loginTicketByPwd$3");
    }

    public static final void accept$5(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("EmailOTPSignupCodeVerifyFragment$Companion@6e1c.sendEmailCodeForOTPSignup$1");
        C0XZ2.LIZJ(afS46S1100000_13.s0, (C849450XTz) ((C0XT7) obj).LJIIIZ);
        ((Function0) afS46S1100000_13.l1).invoke();
        C1C7U.LIZIZ("EmailOTPSignupCodeVerifyFragment$Companion@6e1c.sendEmailCodeForOTPSignup$1");
    }

    public static final void accept$6(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        String str;
        boolean z;
        boolean zIsChecked;
        View view;
        CompoundButton compoundButton;
        C1C7U.LIZ("EmailSignUpFragment@d30.checkEmail$1");
        C849580XUm c849580XUm = (C849580XUm) obj;
        C852810Xct c852810Xct = C852810Xct.LIZ;
        EmailSignUpFragment emailSignUpFragment = (EmailSignUpFragment) afS46S1100000_13.l1;
        String str2 = afS46S1100000_13.s0;
        c852810Xct.getClass();
        C852810Xct.LJIIZILJ(emailSignUpFragment, str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(afS46S1100000_13.s0);
        sbLIZ.append(" is ");
        boolean z2 = false;
        if (c849580XUm.LJIIIIZZ == 1) {
            str = "not available";
        } else {
            str = "available";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c849580XUm.LJIIIIZZ == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            EmailSignUpFragment emailSignUpFragment2 = (EmailSignUpFragment) afS46S1100000_13.l1;
            Bundle arguments = emailSignUpFragment2.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            EmailSignUpFragment emailSignUpFragment3 = (EmailSignUpFragment) afS46S1100000_13.l1;
            arguments.putInt("next_page", EnumC852910Xd3.EMAIL_PASSWORD_LOGIN.getValue());
            emailSignUpFragment3.JS(arguments);
            emailSignUpFragment2.fo(arguments);
        } else {
            if (!C19285410ce.LIZ() && c849580XUm.LJIIIZ != 1 && !((Boolean) C282240B4k.LIZ.getValue()).booleanValue()) {
                EmailSignUpFragment emailSignUpFragment4 = (EmailSignUpFragment) afS46S1100000_13.l1;
                Bundle arguments2 = emailSignUpFragment4.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                EmailSignUpFragment emailSignUpFragment5 = (EmailSignUpFragment) afS46S1100000_13.l1;
                arguments2.putInt("next_page", EnumC852910Xd3.CREATE_PASSWORD_FOR_EMAIL.getValue());
                emailSignUpFragment5.JS(arguments2);
                emailSignUpFragment4.fo(arguments2);
            } else {
                EmailSignUpFragment emailSignUpFragment6 = (EmailSignUpFragment) afS46S1100000_13.l1;
                String str3 = afS46S1100000_13.s0;
                C851830XbJ.LIZ(emailSignUpFragment6, emailSignUpFragment6, str3, "user_click", new AwS162S1100000_13(emailSignUpFragment6, str3, 8));
            }
            C1239130iLn c1239130iLn = C1239130iLn.LIZ;
            EmailSignUpFragment emailSignUpFragment7 = (EmailSignUpFragment) afS46S1100000_13.l1;
            if (emailSignUpFragment7.LLLL && (view = emailSignUpFragment7.LLLLIIL) != null && (compoundButton = (CompoundButton) view.findViewById(R.id.gyi)) != null) {
                zIsChecked = compoundButton.isChecked();
            } else {
                zIsChecked = false;
            }
            c1239130iLn.getClass();
            C1239130iLn.LIZIZ = zIsChecked;
        }
        C853660XeG c853660XeG = C853660XeG.LIZ;
        String enterMethod = ((EmailSignUpFragment) afS46S1100000_13.l1).getEnterMethod();
        String enterFrom = ((EmailSignUpFragment) afS46S1100000_13.l1).getEnterFrom();
        String strPR = ((EmailSignUpFragment) afS46S1100000_13.l1).PR();
        if (c849580XUm.LJIIIIZZ == 1) {
            z2 = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z2);
        c853660XeG.getClass();
        C853660XeG.LJII(enterMethod, 0, enterFrom, "email", boolValueOf, strPR, null);
        C1C7U.LIZIZ("EmailSignUpFragment@d30.checkEmail$1");
    }

    public static final void accept$7(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        EnumC852910Xd3 enumC852910Xd3;
        C1C7U.LIZ("BaseUpdatePasswordFragment@1cae.forceChangePassword$1");
        C850850XZj c850850XZj = (C850850XZj) obj;
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
        c1233040iBy.LIZJ(((BaseUpdatePasswordFragment) afS46S1100000_13.l1).requireActivity().getString(2131828514));
        c1233040iBy.LIZLLL();
        C0XYO c0xyo = C0XYO.LIZ;
        BaseUpdatePasswordFragment baseUpdatePasswordFragment = (BaseUpdatePasswordFragment) afS46S1100000_13.l1;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
        if (Intrinsics.LJFF(afS46S1100000_13.s0, "phone")) {
            enumC852910Xd3 = EnumC852910Xd3.RESET_PASSWORD_FOR_PHONE;
        } else {
            enumC852910Xd3 = EnumC852910Xd3.RESET_PASSWORD_FOR_EMAIL;
        }
        C0XO2 c0xo2 = c850850XZj.LJIILL;
        c0xyo.getClass();
        C0XYO.LIZJ(baseUpdatePasswordFragment, baseUpdatePasswordFragment, enumC852660Xce, enumC852910Xd3, null, c0xo2);
        C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.forceChangePassword$1");
    }

    public static final void accept$8(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("BaseUpdatePasswordFragment@1cae.handleConditionalTicket$1");
        ((BaseUpdatePasswordFragment) afS46S1100000_13.l1).NS(afS46S1100000_13.s0);
        C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.handleConditionalTicket$1");
    }

    public static final void accept$9(AfS46S1100000_13 afS46S1100000_13, Object obj) {
        C1C7U.LIZ("BaseUpdatePasswordFragment@1cae.onSubmit$2");
        C0XQ5.LJIIJJI(8, 1, ((C851100Xa8) ((C0XT7) obj).LJIIIZ).LJII);
        C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
        c1233040iBy.LIZJ(afS46S1100000_13.s0);
        c1233040iBy.LIZLLL();
        ((BaseUpdatePasswordFragment) afS46S1100000_13.l1).getActivity().finish();
        C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.onSubmit$2");
    }

    public AfS46S1100000_13(InputPasswordFragment inputPasswordFragment, int i) {
        this.$t = i;
        this.s0 = "phone";
        this.l1 = inputPasswordFragment;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS46S1100000_13(com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 7: goto Le;
                case 8: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS46S1100000_13.<init>(com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, java.lang.String, int):void");
    }

    public AfS46S1100000_13(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
