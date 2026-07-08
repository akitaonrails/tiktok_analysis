package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0of8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481760of8 {
    public C1481850ofH LIZ;

    public final void LIZ() {
        C1481850ofH c1481850ofH = this.LIZ;
        if (c1481850ofH != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", (Object) null);
                jSONObject.put("play_url", (Object) null);
                jSONObject.put("play_sess", (Object) null);
                jSONObject.put("video_size", c1481850ofH.LIZIZ);
                jSONObject.put("player_type", (Object) null);
                jSONObject.put("vduration", c1481850ofH.LIZJ);
                jSONObject.put("pre_cache_size", c1481850ofH.LIZ);
                jSONObject.put("internet_speed", (Object) null);
                for (String str : c1481850ofH.LIZLLL.keySet()) {
                    jSONObject.put(str, c1481850ofH.LIZLLL.get(str));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            IEvent iEventLIZJ = C1475000oUE.LIZJ();
            if (iEventLIZJ != null) {
                iEventLIZJ.onEvent("play_time", jSONObject);
            }
            C625790Ogb.LIZ();
        }
    }
}
