package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646760PYk {
    public final String LIZ;
    public final boolean LIZIZ;

    public final void LIZ(C0PZI c0pzi) throws JSONException {
        if (c0pzi != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("poi_id", this.LIZ);
            jSONObject.put("is_collected", this.LIZIZ ? 1 : 0);
            c0pzi.sendEvent("poiCollectStatusChange", jSONObject);
        }
    }

    public C646760PYk(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
