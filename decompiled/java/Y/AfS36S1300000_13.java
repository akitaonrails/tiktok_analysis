package Y;

import X.C09JN;
import X.C0XO3;
import X.C0XT7;
import X.C0XX7;
import X.C0XYD;
import X.C0XYO;
import X.C0XZJ;
import X.C0XZV;
import X.C1C7U;
import X.C849560XUk;
import X.C852170Xbr;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC851540Xaq;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;

/* JADX INFO: loaded from: classes14.dex */
public class AfS36S1300000_13 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
        }
    }

    public static final void accept$0(AfS36S1300000_13 afS36S1300000_13, Object obj) {
        C1C7U.LIZ("AgeGateQuickLoginEntryPoint@27bb.onAgeGateSuccessForPhoneSignUp$1$2");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        int errorCode = c0xzj.getErrorCode();
        String str = afS36S1300000_13.s0;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS36S1300000_13.l1;
        c852170Xbr.getClass();
        C852170Xbr.LJIIIIZZ(true, errorCode, str, baseAccountFlowFragment, null);
        int errorCode2 = c0xzj.getErrorCode();
        if (SignUpOrLoginActivity.LLJJJJ.contains(Integer.valueOf(errorCode2))) {
            ((InterfaceC851540Xaq) afS36S1300000_13.l2).LIZJ((BaseAccountFlowFragment) afS36S1300000_13.l1, (EnumC852910Xd3) afS36S1300000_13.l3);
        } else {
            boolean zContains = SignUpOrLoginActivity.LLJJJJJIL.contains(Integer.valueOf(errorCode2));
            String string = null;
            if (zContains) {
                InterfaceC851540Xaq interfaceC851540Xaq = (InterfaceC851540Xaq) afS36S1300000_13.l2;
                String message = c0xzj.getMessage();
                if (message == null) {
                    BaseAccountFlowFragment currentFragment = ((InterfaceC851540Xaq) afS36S1300000_13.l2).getCurrentFragment();
                    if (currentFragment != null) {
                        string = currentFragment.getString(2131834217);
                    }
                } else {
                    string = message;
                }
                interfaceC851540Xaq.LIZIZ(1, string);
            } else {
                InterfaceC851540Xaq interfaceC851540Xaq2 = (InterfaceC851540Xaq) afS36S1300000_13.l2;
                String message2 = c0xzj.getMessage();
                if (message2 == null) {
                    BaseAccountFlowFragment currentFragment2 = ((InterfaceC851540Xaq) afS36S1300000_13.l2).getCurrentFragment();
                    if (currentFragment2 != null) {
                        string = currentFragment2.getString(2131834217);
                    }
                } else {
                    string = message2;
                }
                interfaceC851540Xaq2.LIZIZ(0, string);
            }
        }
        C1C7U.LIZIZ("AgeGateQuickLoginEntryPoint@27bb.onAgeGateSuccessForPhoneSignUp$1$2");
    }

    public static final void accept$1(AfS36S1300000_13 afS36S1300000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.emailRegister$1");
        C0XT7 c0xt7 = (C0XT7) obj;
        ((SetPasswordMobHelper) afS36S1300000_13.l1).LIZ(true, "email", ((C0XYD) afS36S1300000_13.l2).getMobParams().LJJLIIIJJI(), ((C0XYD) afS36S1300000_13.l2).getMobParams().LLIIJI(), ((C0XYD) afS36S1300000_13.l2).getMobParams().PR(), 0, ((C0XYD) afS36S1300000_13.l2).getMobParams(), afS36S1300000_13.s0);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS36S1300000_13.l2).getMobParams();
        C0XO3 c0xo3 = ((C849560XUk) c0xt7.LJIIIZ).LJIIJ;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(true, "email", mobParams, c0xo3, null);
        C0XYO c0xyo = C0XYO.LIZ;
        Fragment fragment = (Fragment) afS36S1300000_13.l3;
        C0XYD c0xyd = (C0XYD) afS36S1300000_13.l2;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
        C0XO3 c0xo32 = ((C849560XUk) c0xt7.LJIIIZ).LJIIJ;
        c0xyo.getClass();
        C0XYO.LIZJ(fragment, c0xyd, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo32);
        if (C0XX7.LIZ()) {
            C0XX7.LIZ = null;
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.emailRegister$1");
    }

    public static final void accept$2(AfS36S1300000_13 afS36S1300000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.setPwdByFindEmailPass$2");
        C0XZV c0xzv = (C0XZV) obj;
        ((SetPasswordMobHelper) afS36S1300000_13.l1).LIZ(true, "email", ((C0XYD) afS36S1300000_13.l2).getMobParams().LJJLIIIJJI(), ((C0XYD) afS36S1300000_13.l2).getMobParams().LLIIJI(), ((C0XYD) afS36S1300000_13.l2).getMobParams().PR(), 0, ((C0XYD) afS36S1300000_13.l2).getMobParams(), afS36S1300000_13.s0);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS36S1300000_13.l2).getMobParams();
        C0XO3 c0xo3 = c0xzv.LJIIIZ;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(false, "email", mobParams, c0xo3, null);
        C0XYO c0xyo = C0XYO.LIZ;
        Fragment fragment = (Fragment) afS36S1300000_13.l3;
        C0XYD c0xyd = (C0XYD) afS36S1300000_13.l2;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.SET_OR_RESET_PASSWORD;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
        C0XO3 c0xo32 = c0xzv.LJIIIZ;
        c0xyo.getClass();
        C0XYO.LIZJ(fragment, c0xyd, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo32);
        C1C7U.LIZIZ("NetworkHelper@8b8f.setPwdByFindEmailPass$2");
    }

    public static final void accept$3(AfS36S1300000_13 afS36S1300000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.resetPwdForPhone$2");
        C0XZV c0xzv = (C0XZV) obj;
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS36S1300000_13.l1).getMobParams();
        C0XO3 c0xo3 = c0xzv.LJIIIZ;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(false, "sms_verification", mobParams, c0xo3, null);
        ((SetPasswordMobHelper) afS36S1300000_13.l2).LIZ(true, "phone", ((C0XYD) afS36S1300000_13.l1).getMobParams().LJJLIIIJJI(), ((C0XYD) afS36S1300000_13.l1).getMobParams().LLIIJI(), ((C0XYD) afS36S1300000_13.l1).getMobParams().PR(), 0, ((C0XYD) afS36S1300000_13.l1).getMobParams(), afS36S1300000_13.s0);
        C0XYO c0xyo = C0XYO.LIZ;
        Fragment fragment = (Fragment) afS36S1300000_13.l3;
        C0XYD c0xyd = (C0XYD) afS36S1300000_13.l1;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.SET_OR_RESET_PASSWORD;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
        C0XO3 c0xo32 = c0xzv.LJIIIZ;
        c0xyo.getClass();
        C0XYO.LIZJ(fragment, c0xyd, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo32);
        C1C7U.LIZIZ("NetworkHelper@8b8f.resetPwdForPhone$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS36S1300000_13(com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment r2, com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper r3, com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 2 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l1 = r4
            r0.l2 = r3
            r0.s0 = r5
            r0.l3 = r2
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r4
            r0.s0 = r5
            r0.l3 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS36S1300000_13.<init>(com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper, com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, java.lang.String, int):void");
    }

    public AfS36S1300000_13(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.l2 = obj3;
        this.s0 = str;
        this.l3 = obj;
    }
}
