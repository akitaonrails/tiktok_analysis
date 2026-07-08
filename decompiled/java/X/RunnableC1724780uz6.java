package X;

import com.bytedance.scene.Scene;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class RunnableC1724780uz6 implements Runnable {
    public final /* synthetic */ long LL;

    public RunnableC1724780uz6(long j) {
        this.LL = j;
    }

    public final void LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("entrance", "rap_main");
        jSONObject.put("enter_from", "rap_main_na");
        jSONObject.put("pathname", "rap_main_list_na");
        jSONObject.put(Scene.SCENE_SERVICE, "offline");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", this.LL);
        C793770VBv.LJII("csp_page_init_success_na", jSONObject, jSONObject2, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackTopicPageSuccess$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackTopicPageSuccess$1");
    }
}
