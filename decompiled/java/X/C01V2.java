package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.01V2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01V2 {
    public static int LIZ = 1;
    public static int LIZIZ;

    public static void LIZ(int i, String str, long j, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", str);
        jSONObject.put("tag", str2);
        jSONObject.put("hit_cache", i);
        jSONObject.put("cost", j);
        jSONObject.put("is_first_search", LIZ);
        jSONObject.put("had_scroll", LIZIZ);
        C01V3 c01v3 = new C01V3(jSONObject);
        if (((Boolean) C0BDE.LIZIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(C1324505Gh.LIZ, null, null, new C01MA(c01v3, null), 3);
        } else {
            C823050WQl.LIZIZ().execute(new RunnableC514801zW(c01v3, 147));
        }
    }
}
