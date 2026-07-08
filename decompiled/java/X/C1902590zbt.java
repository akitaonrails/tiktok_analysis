package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902590zbt {
    public static Long LIZ;

    public static void LIZ(int i, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("notice_group", i);
        jSONObject.put("notice_request_id", str);
        jSONObject.put("notice_error_reason", str2);
        C793770VBv.LJII("notice_monitor_list_abnormal", null, null, jSONObject);
    }
}
