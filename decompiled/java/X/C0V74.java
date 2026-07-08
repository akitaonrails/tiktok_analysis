package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V74, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V74 implements InterfaceC792570V7f {
    public C792560V7e LIZ;

    public C0V74() {
        C792400V6o.LJIIIIZZ();
        C0V70.LIZ().LIZIZ();
        C0V70.LIZ().LIZJ(new C0V73() { // from class: X.0V7d
            @Override // X.C0V73
            public final void LIZ(JSONObject jSONObject) {
                JSONObject jSONObjectOptJSONObject;
                C0V74 c0v74 = this.LIZ;
                c0v74.getClass();
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("performance_modules");
                if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("traffic")) != null) {
                    if (C792400V6o.LJIIIIZZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("parseConfig: ");
                        sbLIZ.append(jSONObjectOptJSONObject);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    C792560V7e c792560V7e = new C792560V7e();
                    c792560V7e.LIZ = jSONObjectOptJSONObject;
                    boolean z = false;
                    if (jSONObjectOptJSONObject.optInt("cause_analysis", 0) == 1) {
                        z = true;
                    }
                    c792560V7e.LIZIZ = z;
                    if (z) {
                        long jOptInt = jSONObjectOptJSONObject.optInt("exception_threshold_mb", 500);
                        C0V98 c0v98 = C0V98.MB;
                        c792560V7e.LIZJ = jOptInt * c0v98.getBytes();
                        c792560V7e.LIZLLL = ((long) jSONObjectOptJSONObject.optInt("exception_threshold_bg_mb", 500)) * c0v98.getBytes();
                        c792560V7e.LJ = jSONObjectOptJSONObject.optInt("high_freq_threshold", 200);
                        c792560V7e.LJFF = jSONObjectOptJSONObject.optDouble("large_usage_threshold_mb", 10.0d) * c0v98.getBytes();
                        c792560V7e.LJI = jSONObjectOptJSONObject.optDouble("alog_record_threshold", 100.0d) * C0V98.KB.getBytes();
                    }
                    c792560V7e.LJII = jSONObjectOptJSONObject.optLong("record_usage_kb", 1L) * C0V98.KB.getBytes();
                    c0v74.LIZ = c792560V7e;
                    C0V5I.LIZ.LIZ(c792560V7e);
                }
            }
        });
    }

    @Override // X.InterfaceC792570V7f
    public final C792560V7e getConfig() {
        return this.LIZ;
    }
}
