package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0koh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333930koh {
    public static final void LIZ(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uri", jSONObject.optString("uri"));
            jSONObject2.put("err_code", jSONObject.optString("err_code"));
            jSONObject2.put("err_desc", jSONObject.optString("err_desc"));
            jSONObject2.put("http_status", jSONObject.optString("http_status"));
            jSONObject2.put("net_timing_detail", jSONObject.optString("net_timing_detail"));
            jSONObject2.put("download_duration", jSONObject.optString("download_duration"));
            jSONObject2.put("decode_duration", jSONObject.optString("decode_duration"));
            jSONObject2.put("duration", jSONObject.optString("duration"));
            jSONObject2.put("fail_phase", jSONObject.optString("fail_phase"));
            jSONObject2.put("image_sdk_version", jSONObject.optString("image_sdk_version"));
            jSONObject2.put("headers", jSONObject.optString("headers"));
            jSONObject2.put("is_prefetch_image", jSONObject.optString("is_prefetch_image"));
            jSONObject2.put("sr_type", jSONObject.optString("sr_type"));
            jSONObject2.put("sr_status", jSONObject.optString("sr_status"));
            jSONObject2.put("sr_err", jSONObject.optString("sr_err"));
            C1475000oUE.LIZIZ().setExtraBusinessLog(jSONObject2, str, 4);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
