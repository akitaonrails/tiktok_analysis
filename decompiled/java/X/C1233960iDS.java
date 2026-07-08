package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyWay;
import com.ss.android.ugc.aweme.account.login.twostep.event.TwosvSetupShowEvent;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iDS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233960iDS {
    public static final C1233960iDS LIZ = new C1233960iDS();

    public static C2344009Gk LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C844470XAv.LIZ.getClass();
        c2344009Gk.LIZJ(C844470XAv.LJIIJ, "aid");
        c2344009Gk.LJIIIIZZ("user_id", C0XQ5.LIZLLL());
        c2344009Gk.LJIIIIZZ("params_for_special", "uc_login");
        return c2344009Gk;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZIZ(String str) {
        switch (str.hashCode()) {
            case -797498437:
                if (!str.equals("pwd_verify")) {
                    return "";
                }
                return "password";
            case 300626556:
                if (!str.equals("email_verify")) {
                    return "";
                }
                return "email";
            case 312290780:
                if (!str.equals("mobile_sms_verify")) {
                    return "";
                }
                return "sms";
            case 961294113:
                if (!str.equals("oauth_verify")) {
                    return "";
                }
                return "oauth";
            case 1972338561:
                if (!str.equals("totp_verify")) {
                    return "";
                }
                return "totp";
            default:
                return "";
        }
    }

    public static void LJII(String str, String str2) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("popup_type", "totp");
        c2344009GkLIZ.LJIIIIZZ("flow_type", str2);
        C20684815ws.LJIILLIIL("twosv_totp_code_submit", c2344009GkLIZ.LIZ);
    }

    public static void LJIIIIZZ(String str, String str2) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("popup_type", "totp");
        c2344009GkLIZ.LJIIIIZZ("flow_type", str2);
        C20684815ws.LJIILLIIL("twosv_totp_update_success", c2344009GkLIZ.LIZ);
    }

    public static void LJFF(String str, String str2, String str3) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("verification_method", str3);
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("identity_verification_typing", c2344009GkLIZ.LIZ);
    }

    public static void LJIIL(String str, String str2, boolean z) {
        String str3;
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("platform", str);
        c2344009GkLIZ.LJIIIIZZ("verification_method", str2);
        if (z) {
            str3 = "success";
        } else {
            str3 = "fail";
        }
        c2344009GkLIZ.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        C20684815ws.LJIILLIIL("login_two_step_verification_result", c2344009GkLIZ.LIZ);
    }

    public static void LJIILL(String str, String str2, String str3) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("enter_method", str2);
        c2344009GkLIZ.LJIIIIZZ("recovery_method", str3);
        C20684815ws.LJIILLIIL("skip_optional_recovery", c2344009GkLIZ.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, boolean z) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LIZJ(z ? 1 : 0, "is_success");
        c2344009GkLIZ.LJIIIIZZ("verification_method", str3);
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("identity_verification_result", c2344009GkLIZ.LIZ);
    }

    public static void LJ(C1233960iDS c1233960iDS, String str, String str2, String str3) {
        c1233960iDS.getClass();
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("page", "twosv_setup");
        c2344009GkLIZ.LJIIIIZZ("verification_method", str3);
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("identity_verification_show", c2344009GkLIZ.LIZ);
    }

    public static void LJIILIIL(Integer num, Integer num2, String str, String str2) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("action", str2);
        if (num != null) {
            c2344009GkLIZ.LIZJ(num.intValue(), "is_success");
        }
        if (num2 != null) {
            c2344009GkLIZ.LIZJ(num2.intValue(), "error_code");
        }
        C20684815ws.LJIILLIIL("adding_trusted_device_response", c2344009GkLIZ.LIZ);
    }

    public static void LJIILJJIL(int i, int i2, int i3, String str) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LIZJ(i, "trusted_device_cnt");
        c2344009GkLIZ.LIZJ(i2, "is_success");
        if (i2 == 0) {
            c2344009GkLIZ.LIZJ(i3, "error_code");
        }
        C20684815ws.LJIILLIIL("click_add_trusted_device_response", c2344009GkLIZ.LIZ);
    }

    public static void LJIIZILJ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("enter_method", str2);
        c2344009GkLIZ.LJIIIIZZ("verification_method", str3);
        c2344009GkLIZ.LJIIIIZZ("platform", str4);
        C20684815ws.LJIILLIIL("start_two_step_verification_typing", c2344009GkLIZ.LIZ);
    }

    public static void LJIJI(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("platform", str3);
        c2344009GkLIZ.LJIIIIZZ("verification_method", str4);
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("login_two_step_verification_notify", c2344009GkLIZ.LIZ);
    }

    public static void LIZJ(String str, String str2, boolean z, String str3, List list) {
        boolean zContains = list.contains("mobile_sms_verify");
        boolean zContains2 = list.contains("pwd_verify");
        boolean zContains3 = list.contains("email_verify");
        boolean zContains4 = list.contains("totp_verify");
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("page_type", str);
        c2344009GkLIZ.LJ(Boolean.valueOf(zContains), "is_sms_selected");
        c2344009GkLIZ.LJ(Boolean.valueOf(zContains3), "is_email_selected");
        c2344009GkLIZ.LJ(Boolean.valueOf(zContains2), "is_pw_selected");
        c2344009GkLIZ.LJ(Boolean.valueOf(zContains4), "is_totp_selected");
        c2344009GkLIZ.LJ(Boolean.valueOf(z), "is_trusted");
        c2344009GkLIZ.LJIIIIZZ("enter_from", str2);
        c2344009GkLIZ.LJIIIIZZ("action", str3);
        C20684815ws.LJIILLIIL("twosv_setup_method_add_submit", c2344009GkLIZ.LIZ);
    }

    public static void LJIIJJI(String str, String str2, String str3, String str4, boolean z) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("enter_method", str2);
        c2344009GkLIZ.LJIIIIZZ("platform", str3);
        c2344009GkLIZ.LJIIIIZZ("verification_method", str4);
        c2344009GkLIZ.LJIIIIZZ("verification_method", str4);
        c2344009GkLIZ.LJ(Boolean.valueOf(z), "is_trusted_environment_added");
        C20684815ws.LJIILLIIL("login_two_step_verification_code_submit", c2344009GkLIZ.LIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJI(AddVerificationResponse addVerificationResponse, String str, boolean z, boolean z2, boolean z3, boolean z4, Integer num) {
        String str2;
        boolean z5;
        boolean z6;
        boolean z7;
        List<VerifyWay> list;
        AddVerificationResponse.Data data = addVerificationResponse.data;
        if (data != null) {
            str2 = data.default_verify_way;
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            LJIILLIIL("off", str, false, false, false, false, z, z2, z3, z4, num);
            return;
        }
        AddVerificationResponse.Data data2 = addVerificationResponse.data;
        boolean z8 = false;
        if (data2 != null && (list = data2.two_step_verify_ways) != null) {
            z6 = false;
            z5 = false;
            z7 = false;
            for (VerifyWay verifyWay : list) {
                boolean zLJFF = Intrinsics.LJFF(verifyWay.is_available(), Boolean.TRUE);
                String str3 = verifyWay.verify_way;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -797498437:
                            if (str3.equals("pwd_verify")) {
                                z5 = zLJFF;
                            }
                            break;
                        case 300626556:
                            if (str3.equals("email_verify")) {
                                z6 = zLJFF;
                            }
                            break;
                        case 312290780:
                            if (str3.equals("mobile_sms_verify")) {
                                z8 = zLJFF;
                            }
                            break;
                        case 1972338561:
                            if (str3.equals("totp_verify")) {
                                z7 = zLJFF;
                            }
                            break;
                    }
                }
            }
        } else {
            z5 = false;
            z6 = false;
            z7 = false;
        }
        LJIILLIIL("on", str, z5, z8, z6, z7, z, z2, z3, z4, num);
    }

    public static void LJIIIZ(int i, Integer num, String str, String str2, String str3, String str4, boolean z) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("enter_method", str2);
        c2344009GkLIZ.LJIIIIZZ("platform", str3);
        c2344009GkLIZ.LJIIIIZZ("verification_method", str4);
        c2344009GkLIZ.LJIIIIZZ("verification_method", str4);
        c2344009GkLIZ.LJ(Boolean.valueOf(z), "is_trusted_environment_added");
        c2344009GkLIZ.LIZJ(i, "is_success");
        c2344009GkLIZ.LJ(num, "error_code");
        C20684815ws.LJIILLIIL("login_two_step_verification_code_result", c2344009GkLIZ.LIZ);
    }

    public static void LJIJ(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("enter_method", str2);
        c2344009GkLIZ.LJIIIIZZ("platform", str3);
        c2344009GkLIZ.LJ(Boolean.valueOf(z), "is_pw_show");
        c2344009GkLIZ.LJ(Boolean.valueOf(z2), "is_sms_show");
        c2344009GkLIZ.LJ(Boolean.valueOf(z3), "is_email_show");
        c2344009GkLIZ.LJ(Boolean.valueOf(z4), "is_totp_show");
        C20684815ws.LJIILLIIL("two_step_verification_list_show", c2344009GkLIZ.LIZ);
    }

    public static void LJIILLIIL(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Integer num) {
        TwosvSetupShowEvent twosvSetupShowEvent = new TwosvSetupShowEvent();
        twosvSetupShowEvent.LJI(str2, "enter_from");
        twosvSetupShowEvent.LJI(str, "page_type");
        twosvSetupShowEvent.LJI(String.valueOf(z), "is_pw_turned_on");
        twosvSetupShowEvent.LJI(String.valueOf(z2), "is_sms_turned_on");
        twosvSetupShowEvent.LJI(String.valueOf(z3), "is_email_turned_on");
        twosvSetupShowEvent.LJI(String.valueOf(z4), "is_totp_turned_on");
        twosvSetupShowEvent.LJI(String.valueOf(z5), "is_pw_selected");
        twosvSetupShowEvent.LJI(String.valueOf(z6), "is_sms_selected");
        twosvSetupShowEvent.LJI(String.valueOf(z7), "is_email_selected");
        twosvSetupShowEvent.LJI(String.valueOf(z8), "is_totp_selected");
        twosvSetupShowEvent.LJI(num, "popup_freq");
        twosvSetupShowEvent.LJIIIIZZ();
    }
}
