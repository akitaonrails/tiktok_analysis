package X;

import com.bytedance.android.livesdk.userservice.UserService;
import java.util.Map;

/* JADX INFO: renamed from: X.0xTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820640xTi {
    public static Map<String, String> LIZ = C2097608Jq.LJ();

    public static String LIZ() {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static void LIZIZ(Boolean bool, String str, String str2) {
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_dm_privacy_confirm_popup");
        c474500IjALIZ.LJJII(LIZ(), "anchor_id");
        c474500IjALIZ.LJJII("one_stop_shop", "event_page");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "enter_from");
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str3 = "confirm";
            } else {
                str3 = "cancel";
            }
            c474500IjALIZ.LJJII(str3, "click_type");
        }
        c474500IjALIZ.LJJIIZI(LIZ);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(C1820630xTh c1820630xTh, String str, String str2, Map map) {
        boolean z;
        if (c1820630xTh == null) {
            return;
        }
        boolean z2 = true;
        if (c1820630xTh.LIZ == 0) {
            z = true;
            z2 = false;
        } else {
            z = false;
        }
        boolean z3 = c1820630xTh.LIZJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_one_stop_shop_main_page");
        c474500IjALIZ.LJJII(LIZ(), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "has_dm_module");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "has_go_live_module");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0), "has_post_live_module");
        c474500IjALIZ.LJJIIZI(LIZ);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(String str, String str2, String str3, C1820650xTj c1820650xTj) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_one_stop_shop_module");
        c474500IjALIZ.LJJII(LIZ(), "anchor_id");
        c474500IjALIZ.LJJII(str, "module_name");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LJJII(str3, "enter_from");
        c474500IjALIZ.LJJII(c1820650xTj.LIZ, "challenge_status");
        c474500IjALIZ.LJJII(c1820650xTj.LIZIZ, "click_position");
        c474500IjALIZ.LJJII(c1820650xTj.LIZJ, "feature_name");
        c474500IjALIZ.LJJII(c1820650xTj.LIZLLL, "industry_type");
        c474500IjALIZ.LJJII(c1820650xTj.LJ, "optin_challenge_status");
        c474500IjALIZ.LJJIIZI(LIZ);
        c474500IjALIZ.LIZ();
    }
}
