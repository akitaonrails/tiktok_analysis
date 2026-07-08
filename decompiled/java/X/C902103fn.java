package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.03fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C902103fn {
    public final String LIZ;
    public final String LIZIZ;

    public C902103fn() {
    }

    public C902103fn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.LIZ = jSONObject.optString("param_name");
        this.LIZIZ = jSONObject.optString("error_content");
    }
}
