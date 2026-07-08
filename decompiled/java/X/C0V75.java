package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V75, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V75 implements C0V76 {
    public C792540V7c LIZ;

    public C0V75() {
        C0V70.LIZ().LIZIZ();
        C0V70.LIZ().LIZJ(new C0V73() { // from class: X.0V7b
            @Override // X.C0V73
            public final void LIZ(JSONObject jSONObject) {
                JSONObject jSONObjectOptJSONObject;
                C0V75 c0v75 = this.LIZ;
                c0v75.getClass();
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("performance_modules");
                if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("disk")) != null) {
                    if (C792190V5t.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("parseConfig:");
                        sbLIZ.append(jSONObjectOptJSONObject);
                        C792910V8n.LIZ("APM-Disk", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C792540V7c c792540V7c = new C792540V7c();
                    boolean z = false;
                    c792540V7c.LIZ = jSONObjectOptJSONObject.optBoolean("enable_collect_apm6", false);
                    if (jSONObjectOptJSONObject.optInt("enable_upload", 0) == 1) {
                        z = true;
                    }
                    c792540V7c.LJIIL = z;
                    if (jSONObjectOptJSONObject.optInt("dump_threshold") > 0) {
                        c792540V7c.LIZIZ = ((long) jSONObjectOptJSONObject.optInt("dump_threshold")) * 1024 * 1024;
                    }
                    if (jSONObjectOptJSONObject.optInt("abnormal_folder_size") > 0) {
                        c792540V7c.LIZJ = ((long) jSONObjectOptJSONObject.optInt("abnormal_folder_size")) * 1024 * 1024;
                    }
                    c792540V7c.LIZLLL = ((long) jSONObjectOptJSONObject.optInt("abnormal_file_size", 100)) * 1024;
                    if (jSONObjectOptJSONObject.optInt("dump_top_count") > 0) {
                        c792540V7c.LJ = jSONObjectOptJSONObject.optInt("dump_top_count");
                    }
                    c792540V7c.LJFF = jSONObjectOptJSONObject.optInt("dump_outdated_count", 50);
                    c792540V7c.LJI = jSONObjectOptJSONObject.optInt("dump_top_file_count", 20);
                    c792540V7c.LJII = jSONObjectOptJSONObject.optInt("dump_exception_dir_count", 50);
                    if (jSONObjectOptJSONObject.optInt("outdated_days") > 0) {
                        c792540V7c.LJIIIIZZ = ((long) jSONObjectOptJSONObject.optInt("outdated_days")) * 86400000;
                    }
                    c792540V7c.LJIIIZ = C792730V7v.LIZLLL("disk_customed_paths", jSONObjectOptJSONObject);
                    c792540V7c.LJIIJ = C792730V7v.LIZJ("ignored_relative_paths", jSONObjectOptJSONObject);
                    c792540V7c.LJIIJJI = C792730V7v.LIZJ("compliance_relative_paths", jSONObjectOptJSONObject);
                    c0v75.LIZ = c792540V7c;
                    if (C792190V5t.LIZ()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("parseConfig:");
                        sbLIZ2.append(jSONObjectOptJSONObject);
                        C792910V8n.LIZ("APM-Disk", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    C0V7V.LJ.LIZIZ(c0v75.LIZ);
                }
            }
        });
    }

    @Override // X.C0V76
    public final C792540V7c getConfig() {
        return this.LIZ;
    }
}
