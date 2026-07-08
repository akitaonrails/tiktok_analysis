package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QGD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGD {
    public static C0QGC LIZ(JSONObject jSONObject) {
        return new C0QGC(jSONObject.optString("search_session_id"), jSONObject.optString("search_id"), "", jSONObject.optInt("unit_session_order"), jSONObject.optInt("unit_session_type"));
    }
}
