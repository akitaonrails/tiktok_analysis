package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yEB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849450yEB {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", this.LIZ);
        jSONObject.put("size", this.LIZIZ);
        jSONObject.put("mtime", this.LIZJ);
        jSONObject.put("isDirectory", this.LIZLLL);
        return jSONObject;
    }

    public C1849450yEB(long j, long j2, String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = z;
    }
}
