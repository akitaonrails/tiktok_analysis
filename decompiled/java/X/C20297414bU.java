package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14bU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20297414bU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_kyc_form_camera_cancel");
        c474500IjALIZ.LJJII(str, "shoot_type");
        c474500IjALIZ.LJJII(str2, "page_name");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, String str2, JSONObject jSONObject) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_kyc_form_camera_page_show");
        c474500IjALIZ.LJJII(str, "shoot_type");
        c474500IjALIZ.LJJII(str2, "page_name");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
    }

    public static void LJ(String str, String str2, JSONObject jSONObject) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_kyc_form_popup_show");
        c474500IjALIZ.LJJII(str, "shoot_type");
        c474500IjALIZ.LJJII(str2, "popup_type");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str, String str2, String str3, JSONObject jSONObject) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_kyc_form_camera_process_complete");
        c474500IjALIZ.LJJII(str, "shoot_type");
        c474500IjALIZ.LJJII(str2, "page_name");
        c474500IjALIZ.LJJII(str3, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(String str, String str2, String str3, JSONObject jSONObject) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_kyc_form_popup_click");
        c474500IjALIZ.LJJII(str, "shoot_type");
        c474500IjALIZ.LJJII(str2, "popup_type");
        c474500IjALIZ.LJJII(str3, "click_type");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
    }
}
