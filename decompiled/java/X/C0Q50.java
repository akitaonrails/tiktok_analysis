package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q50, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q50 {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static void LIZ(C666110QAv c666110QAv, JSONObject jSONObject) {
        c666110QAv.LIZ("http_status", String.valueOf(jSONObject.optInt("http_status", -1)));
        c666110QAv.LIZ("scene_tag", jSONObject.optString("scene_tag"));
        c666110QAv.LIZ("uri", jSONObject.optString("uri"));
        c666110QAv.LIZ("biz_tag", jSONObject.optString("biz_tag"));
        c666110QAv.LIZ("server_ip", jSONObject.optString("server_ip"));
        c666110QAv.LIZ("hit_cdn_cache", jSONObject.optString("hit_cdn_cache"));
        c666110QAv.LIZ("image_type", jSONObject.optString("image_type"));
        c666110QAv.LIZ("load_status", jSONObject.optString("load_status"));
        c666110QAv.LIZ("isCrop", jSONObject.optString("isCrop"));
        c666110QAv.LIZ("imagex_want_fmt", jSONObject.optString("imagex_want_fmt"));
        c666110QAv.LIZ("imagex_true_fmt", jSONObject.optString("imagex_true_fmt"));
        c666110QAv.LIZ("applied_image_size", jSONObject.optString("applied_image_size"));
        C0QO8.LIZ.LJII(c666110QAv);
    }

    public static void LIZIZ(int i, JSONObject jSONObject, boolean z) {
        if (C07HN.LIZ == 1 && i >= 0 && i < 5 && jSONObject != null) {
            int iOptInt = jSONObject.optInt("from");
            if (z && iOptInt != -1) {
                int iOptInt2 = jSONObject.optInt("duration");
                if (iOptInt2 > C664470Q4n.LIZ().imageLoadDurationMs) {
                    C666110QAv c666110QAv = new C666110QAv(202, "duration long sensible");
                    c666110QAv.LIZIZ(Integer.valueOf(iOptInt2), "duration");
                    c666110QAv.LIZ("scene_tag", jSONObject.optString("scene_tag"));
                    c666110QAv.LIZ("uri", jSONObject.optString("uri"));
                    c666110QAv.LIZ("biz_tag", jSONObject.optString("biz_tag"));
                    c666110QAv.LIZ("duration", String.valueOf(iOptInt2));
                    C0QO8.LIZ.LJII(c666110QAv);
                    return;
                }
                return;
            }
            if (LIZ.addAndGet(1) <= C664470Q4n.LIZ().imageLoadFailedCount || !LIZIZ.compareAndSet(false, true)) {
                return;
            }
            C0QO8.LIZ.LJII(new C666110QAv(201, "failed sensible"));
        }
    }
}
