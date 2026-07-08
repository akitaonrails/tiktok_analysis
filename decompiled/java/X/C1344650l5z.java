package X;

import android.util.LruCache;
import com.bytedance.scene.Scene;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0l5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344650l5z {
    public static final C1344650l5z LIZ = new C1344650l5z();
    public static final LruCache<String, Long> LIZIZ = new LruCache<>(200);

    public static void LIZ(EnumC1341600l14 enumC1341600l14, boolean z, boolean z2, long j, int i, String str, String str2, C1344660l60 c1344660l60) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, enumC1341600l14.getCallerId());
        jSONObject.put("is_success", z ? 1 : 0);
        jSONObject.put("cost_ms", j);
        jSONObject.put("from_cache", z2 ? 1 : 0);
        jSONObject.put("preload_hit", i);
        if (str == null) {
            str = "";
        }
        jSONObject.put("err_code", str);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("err_msg", str2);
        jSONObject.put("decode_ms", c1344660l60.LIZ);
        jSONObject.put("download_ms", c1344660l60.LIZIZ);
        jSONObject.put("queue_ms", c1344660l60.LIZJ);
        jSONObject.put("file_size_bytes", c1344660l60.LIZLLL);
        jSONObject.put("image_type", c1344660l60.LJ);
        C20684815ws.LJIJ("comment_media_load", jSONObject);
    }
}
