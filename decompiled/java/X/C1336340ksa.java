package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ksa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336340ksa {
    public static final Number LIZ(String str, JSONObject jSONObject) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof Number)) {
            return (Number) objOpt;
        }
        return null;
    }
}
