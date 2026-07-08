package X;

import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0XWJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XWJ {
    public static final C0XWJ LIZ = new C0XWJ();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(com.ss.android.ugc.aweme.account.model.BaseLoginMethod r3) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XWJ.LIZJ(com.ss.android.ugc.aweme.account.model.BaseLoginMethod):java.lang.String");
    }

    public static void LJ(String str) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("error_desc", str);
        C20684815ws.LJIILLIIL("init_ocl_data_fail", c0xgr.LIZ);
    }

    public static void LJFF(int i) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(i, "error_code");
        C20684815ws.LJIILLIIL("load_oidc_token_error", c0xgr.LIZ);
    }

    public static void LJIIIIZZ(String str) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("error_desc", str);
        C20684815ws.LJIILLIIL("save_oidc_token_error", c0xgr.LIZ);
    }

    public static void LIZ(boolean z, boolean z2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(z ? 1 : 0, "cloud_service_status");
        c0xgr.LIZ(z2 ? 1 : 0, "cloud_storage_status");
        C20684815ws.LJIILLIIL("check_ocl_status", c0xgr.LIZ);
    }

    public static void LIZLLL(String str, boolean z) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZ(z ? 1 : 0, "is_success");
        C20684815ws.LJIILLIIL("init_ocl_data_end", c0xgr.LIZ);
    }

    public static void LJI(boolean z, Integer num) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(z ? 1 : 0, "is_success");
        if (num != null) {
            c0xgr.LIZ(num.intValue(), "error_code");
        }
        C20684815ws.LJIILLIIL("oneclick_csrf_retry", c0xgr.LIZ);
    }

    public static void LJII(String str, String str2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("error_desc", str2);
        C20684815ws.LJIILLIIL("read_data_from_blockstore_fail", c0xgr.LIZ);
    }

    public static void LJIILJJIL(String str, String str2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("login_panel_type", str);
        c0xgr.LIZLLL("enter_method", "checkbox");
        c0xgr.LIZLLL("channel", str2);
        C20684815ws.LJIILLIIL("save_login_info_show", c0xgr.LIZ);
    }

    public static void LIZIZ(Integer num, String str, boolean z) {
        int i;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c0xgr.LIZ(i, "is_success");
        if (num != null) {
            c0xgr.LIZ(num.intValue(), "error_code");
        }
        C20684815ws.LJIILLIIL("check_save_login_popup", c0xgr.LIZ);
    }

    public static void LJIILL(int i, String str, boolean z) {
        int i2;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", "popup");
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0xgr.LIZ(i2, "is_saved");
        c0xgr.LIZ(i, "show_index");
        C20684815ws.LJIILLIIL("save_login_info_click", c0xgr.LIZ);
    }

    public static void LJIIJ(int i, String str, String str2, String str3) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(i, "acct_shown");
        c0xgr.LIZLLL("click_actions", str);
        c0xgr.LIZLLL("deleted_account_platform", str2);
        c0xgr.LIZLLL("enter_type", str3);
        C20684815ws.LJIILLIIL("manage_account_click", c0xgr.LIZ);
    }

    public static void LJIILIIL(Integer num, String str, boolean z, String str2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("login_panel_type", str);
        c0xgr.LIZLLL("enter_method", "checkbox");
        int i = 1;
        c0xgr.LIZ(1, "opt_in");
        c0xgr.LIZLLL("channel", str2);
        if (!z) {
            i = 0;
        }
        c0xgr.LIZ(i, "is_success");
        if (num != null) {
            c0xgr.LIZ(num.intValue(), "error_code");
        }
        C20684815ws.LJIILLIIL("save_login_info_result", c0xgr.LIZ);
    }

    public static void LJIIIZ(BaseLoginMethod baseLoginMethod, String str, String str2, String str3, String str4) {
        String strLJFF;
        C0XGR c0xgr = new C0XGR();
        String strLIZ = "";
        if (str == null) {
            str = "";
        }
        c0xgr.LIZLLL("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c0xgr.LIZLLL("enter_method", str2);
        if (str3 == null) {
            str3 = "";
        }
        c0xgr.LIZLLL("login_panel_type", str3);
        if (baseLoginMethod != null) {
            strLIZ = C849680XUw.LIZ(baseLoginMethod);
        }
        c0xgr.LIZLLL("account_type", strLIZ);
        if (baseLoginMethod != null && (strLJFF = C849680XUw.LJFF(baseLoginMethod)) != null) {
            str4 = strLJFF;
        }
        c0xgr.LIZLLL("platform", str4);
        C20684815ws.LJIILLIIL("select_oneclick_account", c0xgr.LIZ);
    }

    public static void LJIILLIIL(String str, String str2, boolean z, Boolean bool, Integer num) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZ(z ? 1 : 0, "is_success");
        if (bool != null) {
            c0xgr.LIZ(bool.booleanValue() ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        }
        if (num != null) {
            c0xgr.LIZ(num.intValue(), "error_code");
        }
        C20684815ws.LJIILLIIL("save_login_info_result", c0xgr.LIZ);
    }

    public static void LJIIJJI(int i, Boolean bool, Integer num, String str, String str2, String str3) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(i, "acct_shown");
        c0xgr.LIZLLL("click_actions", str);
        c0xgr.LIZLLL("clicked_account_platform", str2);
        c0xgr.LIZLLL("clicked_account_type", str3);
        if (num != null) {
            c0xgr.LIZ(num.intValue(), "clicked_account_rank");
        }
        if (bool != null) {
            bool.booleanValue();
            c0xgr.LIZ(bool.booleanValue() ? 1 : 0, "is_mark");
        }
        C20684815ws.LJIILLIIL("the_one_panel_click", c0xgr.LIZ);
    }
}
