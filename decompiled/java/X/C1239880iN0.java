package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iN0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239880iN0 {
    public static String LIZ(String str, JSONObject jSONObject) {
        if (jSONObject == null || C2093608Ic.LJ(str) || !jSONObject.has(str)) {
            return "";
        }
        return jSONObject.optString(str, "");
    }
}
