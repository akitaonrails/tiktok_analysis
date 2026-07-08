package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0Xaf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851430Xaf {
    public static void LIZJ(String str, String str2, String str3, String str4) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str3);
        c0xgr.LIZLLL("profile_bind_from", str2);
        c0xgr.LIZLLL("bind_type", str4);
        c0xgr.LIZLLL("params_for_special", "uc_login");
        C20684815ws.LJIILLIIL("uc_bind_click_exit", c0xgr.LIZ);
    }

    public static void LJ(String str, String str2, String str3, String str4) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("bind_type", str2);
        c0xgr.LIZLLL("profile_bind_from", str3);
        c0xgr.LIZLLL("enter_method", str4);
        c0xgr.LIZLLL("params_for_special", "uc_login");
        C20684815ws.LJIILLIIL("uc_bind_notify", c0xgr.LIZ);
    }

    public static void LIZ(int i, String str, String str2, String str3, String str4) {
        int i2;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("platform", str3);
        c0xgr.LIZLLL("profile_bind_from", str4);
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        c0xgr.LIZ(i2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("bind_status", c0xgr.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str2);
        c0xgr.LIZLLL("enter_method", str3);
        c0xgr.LIZLLL("page", str4);
        c0xgr.LIZLLL("bind_status", str5);
        C20684815ws.LJIILLIIL(str, c0xgr.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("page", str2);
        c0xgr.LIZLLL("enter_method", str3);
        c0xgr.LIZLLL("3p_platform", str4);
        c0xgr.LIZLLL("config_key", str5);
        C20684815ws.LJIILLIIL("email_binding_show", c0xgr.LIZ);
    }

    public static void LJFF(String str, String str2, String str3, String str4, String str5) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("bind_type", str2);
        c0xgr.LIZLLL("profile_bind_from", str3);
        c0xgr.LIZLLL("enter_method", str4);
        c0xgr.LIZLLL("platform", str5);
        c0xgr.LIZLLL("params_for_special", "uc_login");
        C20684815ws.LJIILLIIL("uc_bind_submit", c0xgr.LIZ);
    }

    public static void LJI(int i, String str, String str2, String str3, String str4) {
        LJII(str, i, "email", str2, null, null, str3, str4, null);
    }

    public static void LJII(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("bind_type", str2);
        if (i == 0) {
            str9 = "success";
        } else {
            str9 = "fail";
        }
        c0xgr.LIZLLL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str9);
        c0xgr.LIZ(i, "error_code");
        c0xgr.LIZLLL("fail_info", str3);
        c0xgr.LIZLLL("profile_bind_from", str5);
        c0xgr.LIZLLL("enter_method", str6);
        c0xgr.LIZLLL("platform", str7);
        c0xgr.LIZLLL("params_for_special", "uc_login");
        c0xgr.LIZLLL("enter_position", str8);
        if (str4 != null) {
            try {
                c0xgr.LIZ(C2218571BsN.LIZJ().LJIIZILJ(str4, null).getCountryCode(), "phone_country");
            } catch (C1722250uv1 e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C20684815ws.LJIILLIIL("uc_bind_result", c0xgr.LIZ);
    }
}
