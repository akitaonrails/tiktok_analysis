package X;

import com.bytedance.scene.Scene;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720650SOp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final String str, final String str2, final JSONObject jSONObject) {
        AbstractC19486711Lt.LJIIJJI(new InterfaceC781210Ukh() { // from class: X.0kog
            @Override // X.InterfaceC781210Ukh
            public final void run() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject;
                String str3 = str2;
                jSONObject2.put("uri", jSONObject3 != null ? jSONObject3.optString("uri") : null);
                jSONObject2.put("err_code", jSONObject3 != null ? jSONObject3.optString("err_code") : null);
                jSONObject2.put("err_desc", jSONObject3 != null ? jSONObject3.optString("err_desc") : null);
                jSONObject2.put("http_status", jSONObject3 != null ? Integer.valueOf(jSONObject3.optInt("http_status")) : null);
                jSONObject2.put("net_timing_detail", jSONObject3 != null ? jSONObject3.optString("net_timing_detail") : null);
                jSONObject2.put("download_duration", jSONObject3 != null ? jSONObject3.optString("download_duration") : null);
                jSONObject2.put("decode_duration", jSONObject3 != null ? jSONObject3.optString("decode_duration") : null);
                jSONObject2.put("duration", jSONObject3 != null ? jSONObject3.optString("duration") : null);
                jSONObject2.put("fail_phase", jSONObject3 != null ? jSONObject3.optString("fail_phase") : null);
                jSONObject2.put("image_sdk_version", jSONObject3 != null ? jSONObject3.optString("image_sdk_version") : null);
                jSONObject2.put("headers", jSONObject3 != null ? jSONObject3.optString("headers") : null);
                jSONObject2.put("is_prefetch_image", jSONObject3 != null ? jSONObject3.optString("is_prefetch_image") : null);
                jSONObject2.put("sr_type", jSONObject3 != null ? jSONObject3.optString("sr_type") : null);
                jSONObject2.put("sr_status", jSONObject3 != null ? jSONObject3.optString("sr_status") : null);
                jSONObject2.put("sr_err", jSONObject3 != null ? jSONObject3.optString("sr_err") : null);
                jSONObject2.put("biz_tag", jSONObject3 != null ? jSONObject3.optString("biz_tag") : null);
                jSONObject2.put(Scene.SCENE_SERVICE, jSONObject3 != null ? jSONObject3.optString(Scene.SCENE_SERVICE) : null);
                jSONObject2.put("scene_category", jSONObject3 != null ? jSONObject3.optString("scene_category") : null);
                jSONObject2.put("netClientType", jSONObject3 != null ? jSONObject3.optString("netClientType") : null);
                jSONObject2.put("mio_trace_id", jSONObject3 != null ? jSONObject3.optString("mio_trace_id") : null);
                jSONObject2.put("type", str3);
                C1475000oUE.LIZIZ().setExtraBusinessLog(jSONObject2, str, 4);
            }
        }).LJIJJLI(C11S5.LIZ()).LJIIIIZZ(new C516901zr(19)).LJIIZILJ();
    }
}
