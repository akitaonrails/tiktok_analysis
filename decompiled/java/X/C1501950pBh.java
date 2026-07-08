package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501950pBh {
    public static C1501950pBh LIZLLL;
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C1501950pBh(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strOptString);
        sbLIZ.append("monitor/collect/c/exception");
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZ = jSONObject.optInt("aid");
        jSONObject.optString("channel");
        this.LIZIZ = jSONObject.optString("device_id");
        jSONObject.optString("region");
        this.LIZJ = jSONObject.optString("packageName");
    }
}
