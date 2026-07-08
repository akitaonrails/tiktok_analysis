package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Aqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192001Aqc {
    public final int LIZ;
    public final int LIZIZ;

    public C2192001Aqc(JSONObject jSONObject) {
        this.LIZ = jSONObject.optInt("backoff_ratio", 0);
        this.LIZIZ = jSONObject.optInt("max_request_frequency", 10);
    }
}
