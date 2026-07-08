package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821420WKe {
    public static String LIZ(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }
}
