package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791160V1u implements InterfaceC792320V6g {
    public String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public JSONObject LIZLLL;
    public JSONObject LJ;
    public JSONObject LJFF;
    public JSONObject LJI;

    @Override // X.InterfaceC792320V6g
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC792320V6g
    public final String LIZLLL() {
        return "performance_monitor";
    }

    @Override // X.InterfaceC792320V6g
    public final JSONObject LIZ() {
        try {
            if (this.LJI == null) {
                this.LJI = new JSONObject();
            }
            this.LJI.put("log_type", "performance_monitor");
            this.LJI.put("service", this.LIZ);
            if (!C0V3O.LIZJ(this.LIZLLL)) {
                this.LJI.put("extra_values", this.LIZLLL);
            }
            if (TextUtils.equals("start", this.LIZ) && TextUtils.equals("from", this.LJI.optString("monitor-plugin"))) {
                if (this.LJ == null) {
                    this.LJ = new JSONObject();
                }
                this.LJ.put("start_mode", C792400V6o.LJIIJ);
            }
            if (!C0V3O.LIZJ(this.LJ)) {
                this.LJI.put("extra_status", this.LJ);
            }
            if (!C0V3O.LIZJ(this.LJFF)) {
                this.LJI.put("filters", this.LJFF);
            }
            return this.LJI;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C791160V1u() {
    }

    @Override // X.InterfaceC792320V6g
    public final String LJ() {
        return this.LIZ;
    }

    public C791160V1u(JSONObject jSONObject) {
        this("thread", "", null, null, jSONObject, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    @Override // X.InterfaceC792320V6g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(org.json.JSONObject r4) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C791160V1u.LIZJ(org.json.JSONObject):boolean");
    }

    public C791160V1u(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this(str, str2, jSONObject, jSONObject2, jSONObject3, 0);
    }

    public C791160V1u(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = false;
        this.LIZLLL = jSONObject;
        this.LJ = jSONObject2;
        this.LJI = jSONObject3;
    }
}
