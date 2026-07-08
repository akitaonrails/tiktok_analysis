package X;

import com.bytedance.scene.Scene;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class RunnableC1724790uz7 implements Runnable {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;

    public RunnableC1724790uz7(boolean z, long j) {
        this.LL = z;
        this.LLILLJJLI = j;
    }

    public final void LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        boolean z = this.LL;
        jSONObject.put("entrance", "rap_main");
        jSONObject.put("enter_from", "rap_main_na");
        jSONObject.put("pathname", "rap_main_na");
        jSONObject.put(Scene.SCENE_SERVICE, "offline");
        jSONObject.put("start_type", z ? "warm" : "cold");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", this.LLILLJJLI);
        C793770VBv.LJII("csp_page_init_success_na", jSONObject, jSONObject2, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackPageSuccess$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackPageSuccess$1");
    }
}
