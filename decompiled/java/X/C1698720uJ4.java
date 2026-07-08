package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uJ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1698720uJ4 {
    public int LIZ = 0;
    public int LIZIZ = 0;
    public int LIZJ = 0;
    public int LIZLLL = 0;
    public long LJ = 0;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("total_audio_duration", this.LIZ);
        jSONObject.put("input_silence_duration", this.LIZIZ);
        jSONObject.put("output_silence_duration", this.LIZJ);
        jSONObject.put("audio_render_duration", this.LIZLLL);
        jSONObject.put("start_time", this.LJ);
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("total_audio_duration: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", input_silence_duration: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", output_silence_duration: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", audio_render_duration: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", start_time: ");
        sbLIZ.append(this.LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
