package Y;

import X.C09JN;
import X.C0XO2;
import X.C0XO3;
import X.C0XQ5;
import X.C0XT7;
import X.C0XX6;
import X.C0XX7;
import X.C0XYD;
import X.C0XYO;
import X.C0XZJ;
import X.C19EG;
import X.C1C7U;
import X.C2097908Jt;
import X.C850350XXl;
import X.C852170Xbr;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.PassportTicketLoginQueryObj;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AfS40S1200000_13 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
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

    public static final void accept$0(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.quickLoginContinueForSignup$2");
        C0XT7 c0xt7 = (C0XT7) obj;
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        String str = afS40S1200000_13.s0;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS40S1200000_13.l1).getMobParams();
        C0XO3 c0xo3 = ((C850350XXl) c0xt7.LJIIIZ).LJIIIIZZ;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(true, str, mobParams, c0xo3, null);
        C0XYO c0xyo = C0XYO.LIZ;
        Fragment fragment = (Fragment) afS40S1200000_13.l2;
        C0XYD c0xyd = (C0XYD) afS40S1200000_13.l1;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
        C0XO3 c0xo32 = ((C850350XXl) c0xt7.LJIIIZ).LJIIIIZZ;
        c0xyo.getClass();
        C0XYO.LIZJ(fragment, c0xyd, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo32);
        if (C0XX7.LIZ()) {
            C0XX7.LIZ = null;
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.quickLoginContinueForSignup$2");
    }

    public static final void accept$1(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.emailRegister$2");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        ((SetPasswordMobHelper) afS40S1200000_13.l1).LIZ(false, "email", ((C0XYD) afS40S1200000_13.l2).getMobParams().LJJLIIIJJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().LLIIJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().PR(), c0xzj.getErrorCode(), ((C0XYD) afS40S1200000_13.l2).getMobParams(), afS40S1200000_13.s0);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        int errorCode = c0xzj.getErrorCode();
        BaseAccountFlowFragment mobParams = ((C0XYD) afS40S1200000_13.l2).getMobParams();
        c852170Xbr.getClass();
        C852170Xbr.LJIIIIZZ(true, errorCode, "email", mobParams, null);
        C1C7U.LIZIZ("NetworkHelper@8b8f.emailRegister$2");
    }

    public static final void accept$10(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.changePwdForEmail$3");
        ((SetPasswordMobHelper) afS40S1200000_13.l1).LIZ(false, "email", ((C0XYD) afS40S1200000_13.l2).getMobParams().LJJLIIIJJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().LLIIJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().PR(), ((C0XZJ) ((Throwable) obj)).getErrorCode(), ((C0XYD) afS40S1200000_13.l2).getMobParams(), afS40S1200000_13.s0);
        C1C7U.LIZIZ("NetworkHelper@8b8f.changePwdForEmail$3");
    }

    public static final void accept$11(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.changePwdForPhone$2");
        ((SetPasswordMobHelper) afS40S1200000_13.l1).LIZ(true, "phone", ((C0XYD) afS40S1200000_13.l2).getMobParams().LJJLIIIJJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().LLIIJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().PR(), 0, ((C0XYD) afS40S1200000_13.l2).getMobParams(), afS40S1200000_13.s0);
        C1C7U.LIZIZ("NetworkHelper@8b8f.changePwdForPhone$2");
    }

    public static final void accept$12(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.changePwdForPhone$3");
        ((SetPasswordMobHelper) afS40S1200000_13.l1).LIZ(false, "phone", ((C0XYD) afS40S1200000_13.l2).getMobParams().LJJLIIIJJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().LLIIJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().PR(), ((C0XZJ) ((Throwable) obj)).getErrorCode(), ((C0XYD) afS40S1200000_13.l2).getMobParams(), afS40S1200000_13.s0);
        C1C7U.LIZIZ("NetworkHelper@8b8f.changePwdForPhone$3");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$13(Y.AfS40S1200000_13 r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS40S1200000_13.accept$13(Y.AfS40S1200000_13, java.lang.Object):void");
    }

    public static final void accept$2(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.setPassword$2");
        ((SetPasswordMobHelper) afS40S1200000_13.l1).LIZ(true, "phone", ((C0XYD) afS40S1200000_13.l2).getMobParams().LJJLIIIJJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().LLIIJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().PR(), 0, ((C0XYD) afS40S1200000_13.l2).getMobParams(), afS40S1200000_13.s0);
        C1C7U.LIZIZ("NetworkHelper@8b8f.setPassword$2");
    }

    public static final void accept$3(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.setPassword$3");
        ((SetPasswordMobHelper) afS40S1200000_13.l1).LIZ(false, "phone", ((C0XYD) afS40S1200000_13.l2).getMobParams().LJJLIIIJJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().LLIIJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().PR(), ((C0XZJ) ((Throwable) obj)).getErrorCode(), ((C0XYD) afS40S1200000_13.l2).getMobParams(), afS40S1200000_13.s0);
        C1C7U.LIZIZ("NetworkHelper@8b8f.setPassword$3");
    }

    public static final void accept$4(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.loginTicketByPwd$2");
        C0XT7 c0xt7 = (C0XT7) obj;
        C0XYO c0xyo = C0XYO.LIZ;
        Fragment fragment = (Fragment) afS40S1200000_13.l1;
        C0XYD c0xyd = (C0XYD) afS40S1200000_13.l2;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
        C0XO3 c0xo3 = ((C0XX6) c0xt7.LJIIIZ).LJIILJJIL;
        c0xyo.getClass();
        C0XYO.LIZJ(fragment, c0xyd, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo3);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        String str = afS40S1200000_13.s0;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS40S1200000_13.l2).getMobParams();
        C0XO3 c0xo32 = ((C0XX6) c0xt7.LJIIIZ).LJIILJJIL;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(false, str, mobParams, c0xo32, null);
        C1C7U.LIZIZ("NetworkHelper@8b8f.loginTicketByPwd$2");
    }

    public static final void accept$5(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.setPwdByFindEmailPass$3");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        ((SetPasswordMobHelper) afS40S1200000_13.l1).LIZ(false, "email", ((C0XYD) afS40S1200000_13.l2).getMobParams().LJJLIIIJJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().LLIIJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().PR(), c0xzj.getErrorCode(), ((C0XYD) afS40S1200000_13.l2).getMobParams(), afS40S1200000_13.s0);
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        int errorCode = c0xzj.getErrorCode();
        BaseAccountFlowFragment mobParams = ((C0XYD) afS40S1200000_13.l2).getMobParams();
        c852170Xbr.getClass();
        C852170Xbr.LJIIIIZZ(false, errorCode, "email", mobParams, null);
        C1C7U.LIZIZ("NetworkHelper@8b8f.setPwdByFindEmailPass$3");
    }

    public static final void accept$6(AfS40S1200000_13 afS40S1200000_13, Object obj) throws JSONException {
        String string;
        Map mapLIZJ;
        C1C7U.LIZ("NetworkHelper@8b8f.passportTicketLogin$2");
        C0XT7 c0xt7 = (C0XT7) obj;
        Bundle arguments = ((Fragment) afS40S1200000_13.l1).getArguments();
        if (arguments == null) {
            string = "";
        } else {
            string = arguments.getString("oauth_platform", "");
        }
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        String str = afS40S1200000_13.s0;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS40S1200000_13.l2).getMobParams();
        C0XO2 c0xo2 = ((PassportTicketLoginQueryObj) c0xt7.LJIIIZ).LJI;
        if (!Intrinsics.LJFF(string, "")) {
            mapLIZJ = C2097908Jt.LIZJ(new Pair("oauth_platform", string));
        } else {
            mapLIZJ = null;
        }
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(false, str, mobParams, c0xo2, mapLIZJ);
        C19EG activity = ((Fragment) afS40S1200000_13.l1).getActivity();
        if (activity != null) {
            C0XYD c0xyd = (C0XYD) afS40S1200000_13.l2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("arguments", c0xyd.getMobParams().getArguments());
            C0XYO.LIZLLL(C0XYO.LIZ, activity, jSONObject, ((PassportTicketLoginQueryObj) c0xt7.LJIIIZ).LJI, false, null, false, 112);
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.passportTicketLogin$2");
    }

    public static final void accept$7(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.passportTicketLogin$3");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        int errorCode = ((C0XZJ) ((Throwable) obj)).getErrorCode();
        String str = afS40S1200000_13.s0;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS40S1200000_13.l1).getMobParams();
        c852170Xbr.getClass();
        C852170Xbr.LJIIIIZZ(false, errorCode, str, mobParams, null);
        Function1 function1 = (Function1) afS40S1200000_13.l2;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.passportTicketLogin$3");
    }

    public static final void accept$8(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.resetPwdForPhone$3");
        Throwable th = (Throwable) obj;
        if (th instanceof C0XZJ) {
            C852170Xbr c852170Xbr = C852170Xbr.LIZ;
            C0XZJ c0xzj = (C0XZJ) th;
            int errorCode = c0xzj.getErrorCode();
            BaseAccountFlowFragment mobParams = ((C0XYD) afS40S1200000_13.l1).getMobParams();
            c852170Xbr.getClass();
            C852170Xbr.LJIIIIZZ(false, errorCode, "sms_verification", mobParams, null);
            ((SetPasswordMobHelper) afS40S1200000_13.l2).LIZ(false, "phone", ((C0XYD) afS40S1200000_13.l1).getMobParams().LJJLIIIJJI(), ((C0XYD) afS40S1200000_13.l1).getMobParams().LLIIJI(), ((C0XYD) afS40S1200000_13.l1).getMobParams().PR(), c0xzj.getErrorCode(), ((C0XYD) afS40S1200000_13.l1).getMobParams(), afS40S1200000_13.s0);
            if (((C0XYD) afS40S1200000_13.l1).LLJJLIIIJLLLLLLLZ() == EnumC852910Xd3.RESET_PASSWORD_FOR_PHONE) {
                C0XQ5.LJIIJJI(8, 3, c0xzj.getErrorMsg());
            }
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.resetPwdForPhone$3");
    }

    public static final void accept$9(AfS40S1200000_13 afS40S1200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.changePwdForEmail$2");
        ((SetPasswordMobHelper) afS40S1200000_13.l1).LIZ(true, "email", ((C0XYD) afS40S1200000_13.l2).getMobParams().LJJLIIIJJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().LLIIJI(), ((C0XYD) afS40S1200000_13.l2).getMobParams().PR(), 0, ((C0XYD) afS40S1200000_13.l2).getMobParams(), afS40S1200000_13.s0);
        C1C7U.LIZIZ("NetworkHelper@8b8f.changePwdForEmail$2");
    }

    public AfS40S1200000_13(InputPasswordFragment inputPasswordFragment, InputPasswordFragment inputPasswordFragment2, int i) {
        this.$t = i;
        this.l1 = inputPasswordFragment;
        this.l2 = inputPasswordFragment2;
        this.s0 = "phone";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS40S1200000_13(com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper r2, com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 5: goto L10;
                case 6: goto L5;
                case 7: goto L5;
                case 8: goto L5;
                case 9: goto L10;
                case 10: goto L10;
                case 11: goto L10;
                case 12: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r2
            r0.s0 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r2
            r0.l2 = r3
            r0.s0 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS40S1200000_13.<init>(com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper, com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, java.lang.String, int):void");
    }

    public AfS40S1200000_13(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj2;
        this.l2 = obj;
    }
}
