package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ncC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441500ncC {
    public static final JSONArray LIZ(C1441410nc3 c1441410nc3) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (C1441520ncE c1441520ncE : (ArrayList) c1441410nc3.LIZ) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aweme_id", c1441520ncE.LIZ);
            jSONObject.put("video_id", c1441520ncE.LIZLLL);
            jSONObject.put("vframe_uri", c1441520ncE.LJ);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
