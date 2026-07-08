package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V7E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V7E implements C0V7H {
    public C0V7P LIZ;

    @Override // X.C0V7H
    public C0V7P getConfig() {
        throw null;
    }

    public C0V7E() {
        C0V70.LIZ().LIZIZ();
        C0V70.LIZ().LIZJ(new C0V73() { // from class: X.0V7F
            @Override // X.C0V73
            public final void LIZ(JSONObject jSONObject) {
                JSONObject jSONObjectOptJSONObject;
                boolean z;
                C0V7E c0v7e = this.LIZ;
                c0v7e.getClass();
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("performance_modules");
                if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("memory")) != null) {
                    long jOptLong = jSONObjectOptJSONObject.optLong("collect_interval", 120L);
                    double dOptDouble = jSONObjectOptJSONObject.optDouble("reach_top_memory_rate", 0.8d);
                    boolean z2 = true;
                    if (jSONObjectOptJSONObject.optInt("enable_upload", 0) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (jSONObjectOptJSONObject.optInt("close_memory_collect") == 1) {
                        z2 = false;
                    }
                    c0v7e.LIZ = new C0V7P(jOptLong, dOptDouble, z, z2);
                    if (C792190V5t.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("parsed MemoryConfig=");
                        sbLIZ.append(c0v7e.LIZ);
                        C792910V8n.LIZ("APM-Config", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C0V5G.LIZ.LIZJ(c0v7e.getConfig());
                }
            }
        });
    }
}
