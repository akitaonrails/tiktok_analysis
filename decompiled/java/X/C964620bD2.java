package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bD2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964620bD2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", str);
        jSONObject.put("size", i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("multi-tag truncated source=");
        sbLIZ.append(str);
        sbLIZ.append(" size=");
        sbLIZ.append(i);
        C20441214yg.LJIIL("PreferencePanelMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C1CC2.LJIIIIZZ("livesdk_match_preference_multi_tag_truncated", 1, jSONObject);
    }
}
