package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Jzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510400Jzy {
    public final JSONObject LIZ;
    public final double LIZIZ;

    public C510400Jzy(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(str);
        }
        this.LIZ = jSONObject;
        jSONObject.optDouble("sub/privilege/get_sub_info", 0.05d);
        jSONObject.optDouble("sub/user/price_change_notification/appb_app_launch", 0.01d);
        jSONObject.optDouble("sub/privilege/get_sub_privilege_detail", 0.05d);
        jSONObject.optDouble("sub/privilege/get_sub_emote_detail", 0.05d);
        jSONObject.optDouble("sub/contract/tpl_list", 0.05d);
        jSONObject.optDouble("sub/smb/preview", 0.05d);
        this.LIZIZ = jSONObject.optDouble("default", 1.0d);
    }
}
