package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0iG6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235600iG6 {
    public static void LIZ(String str, String str2, String str3, boolean z) {
        String str4;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("page_name", "user_setting");
        c0xgr.LIZLLL("trigger", str);
        c0xgr.LIZLLL("show_type", "fullpage");
        c0xgr.LIZLLL("mobile", "1");
        if (z) {
            str4 = "confirm";
        } else {
            str4 = "not_now";
        }
        c0xgr.LIZLLL("action_type", str4);
        c0xgr.LIZLLL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        if (!TextUtils.isEmpty(str3)) {
            c0xgr.LIZJ("fail_reason", str3);
        }
        C20684815ws.LJIILLIIL("tiktok_sms_popup_click", c0xgr.LIZ);
    }
}
