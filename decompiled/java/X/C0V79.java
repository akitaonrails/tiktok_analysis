package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V79, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V79 implements C0V7B {
    public C0V7C LIZ;

    public C0V79() {
        if (C792190V5t.LIZ()) {
            C792910V8n.LIZ("APM-FD", "FdConfigManager:");
        }
        C0V70.LIZ().LIZIZ();
        C0V70.LIZ().LIZJ(new C0V73() { // from class: X.0V7A
            @Override // X.C0V73
            public final void LIZ(JSONObject jSONObject) {
                JSONObject jSONObjectOptJSONObject;
                boolean z;
                C0V79 c0v79 = this.LIZ;
                c0v79.getClass();
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("performance_modules");
                if (C792190V5t.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parseConfig:");
                    sbLIZ.append(jSONObjectOptJSONObject2);
                    C792910V8n.LIZ("APM-FD", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("fd")) != null) {
                    if (C792190V5t.LIZ()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("parseConfig:");
                        sbLIZ2.append(jSONObjectOptJSONObject);
                        C792910V8n.LIZ("APM-FD", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (jSONObjectOptJSONObject.optInt("enable_upload", 0) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long jOptInt = jSONObjectOptJSONObject.optInt("fd_count_threshold", 800);
                    long jOptLong = jSONObjectOptJSONObject.optLong("collect_interval", 10L) * 60000;
                    if (jOptLong < 10) {
                        jOptLong = 600000;
                    }
                    C0V7C c0v7c = new C0V7C(jOptInt, jOptLong, z);
                    if (C792190V5t.LIZ()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("parseConfig:");
                        sbLIZ3.append(c0v7c);
                        C792910V8n.LIZ("APM-FD", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    c0v79.LIZ = c0v7c;
                    C0V7K.LJI.LIZIZ(c0v7c);
                }
            }
        });
    }

    @Override // X.C0V7B
    public final C0V7C getConfig() {
        return this.LIZ;
    }
}
