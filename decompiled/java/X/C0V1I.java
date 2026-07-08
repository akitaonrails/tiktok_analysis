package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V1I, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V1I implements InterfaceC792320V6g {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public boolean LIZJ;
    public final long LIZLLL;

    @Override // X.InterfaceC792320V6g
    public final boolean LIZIZ() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e A[Catch: JSONException -> 0x0058, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0058, blocks: (B:4:0x0004, B:7:0x0040, B:9:0x0048, B:10:0x004e), top: B:18:0x0004 }] */
    @Override // X.InterfaceC792320V6g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZ() {
        /*
            r6 = this;
            org.json.JSONObject r3 = r6.LIZIZ
            if (r3 == 0) goto L5f
            java.lang.String r2 = "timestamp"
            long r0 = r6.LIZLLL     // Catch: org.json.JSONException -> L58
            r3.put(r2, r0)     // Catch: org.json.JSONException -> L58
            org.json.JSONObject r3 = r6.LIZIZ     // Catch: org.json.JSONException -> L58
            java.lang.String r2 = "crash_time"
            long r0 = r6.LIZLLL     // Catch: org.json.JSONException -> L58
            r3.put(r2, r0)     // Catch: org.json.JSONException -> L58
            org.json.JSONObject r2 = r6.LIZIZ     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = "is_main_process"
            boolean r0 = X.C792400V6o.LJIIIZ()     // Catch: org.json.JSONException -> L58
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L58
            org.json.JSONObject r2 = r6.LIZIZ     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = "process_name"
            java.lang.String r0 = X.C792400V6o.LIZIZ()     // Catch: org.json.JSONException -> L58
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L58
            org.json.JSONObject r2 = r6.LIZIZ     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = "log_type"
            java.lang.String r0 = r6.LIZ     // Catch: org.json.JSONException -> L58
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L58
            long r3 = X.C792400V6o.LJIILIIL     // Catch: org.json.JSONException -> L58
            long r1 = X.C792400V6o.LJI()     // Catch: org.json.JSONException -> L58
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            java.lang.String r5 = "app_launch_start_time"
            if (r0 > 0) goto L4e
            long r3 = X.C792400V6o.LJIILIIL     // Catch: org.json.JSONException -> L58
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L4e
            org.json.JSONObject r0 = r6.LIZIZ     // Catch: org.json.JSONException -> L58
            r0.put(r5, r3)     // Catch: org.json.JSONException -> L58
            goto L5c
        L4e:
            org.json.JSONObject r2 = r6.LIZIZ     // Catch: org.json.JSONException -> L58
            long r0 = X.C792400V6o.LJI()     // Catch: org.json.JSONException -> L58
            r2.put(r5, r0)     // Catch: org.json.JSONException -> L58
            goto L5c
        L58:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5c:
            org.json.JSONObject r0 = r6.LIZIZ
            return r0
        L5f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0V1I.LIZ():org.json.JSONObject");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExceptionLogData{eventType='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", logJson=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", forceSampled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", time=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC792320V6g
    public final String LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC792320V6g
    public final String LJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC792320V6g
    public final boolean LIZJ(JSONObject jSONObject) {
        if (!this.LIZJ && !C790620Uzs.LIZJ(this.LIZ)) {
            return false;
        }
        return true;
    }

    public C0V1I(String str, JSONObject jSONObject) {
        this(str, System.currentTimeMillis(), jSONObject);
    }

    public C0V1I(String str, long j, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
        this.LIZLLL = j;
    }
}
