package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0of7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481750of7 {
    public C1481840ofG LIZ;

    public final void LIZ() {
        C1481840ofG c1481840ofG = this.LIZ;
        if (c1481840ofG != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", (Object) null);
                jSONObject.put("play_url", (Object) null);
                jSONObject.put("play_sess", (Object) null);
                jSONObject.put("video_size", c1481840ofG.LIZIZ);
                jSONObject.put("player_type", (Object) null);
                jSONObject.put("vduration", c1481840ofG.LIZJ);
                jSONObject.put("pre_cache_size", c1481840ofG.LIZ);
                jSONObject.put("internet_speed", (Object) null);
                for (String str : c1481840ofG.LIZLLL.keySet()) {
                    jSONObject.put(str, c1481840ofG.LIZLLL.get(str));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            IEvent iEventLIZJ = C1475000oUE.LIZJ();
            if (iEventLIZJ != null) {
                iEventLIZJ.onEvent("video_play_finish", jSONObject);
            }
            C625790Ogb.LIZ();
        }
    }
}
