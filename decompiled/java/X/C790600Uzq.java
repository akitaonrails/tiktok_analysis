package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790600Uzq implements InterfaceC792320V6g {
    public final String LIZ;
    public final int LIZIZ;
    public final JSONObject LIZJ;
    public final JSONObject LIZLLL;
    public final JSONObject LJ;
    public JSONObject LJFF;

    @Override // X.InterfaceC792320V6g
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC792320V6g
    public final String LIZLLL() {
        return "service_monitor";
    }

    @Override // X.InterfaceC792320V6g
    public final String LJ() {
        return "service_monitor";
    }

    @Override // X.InterfaceC792320V6g
    public final JSONObject LIZ() {
        if (this.LJFF == null) {
            this.LJFF = new JSONObject();
        }
        try {
            this.LJFF.put("log_type", "service_monitor");
            this.LJFF.put("service", this.LIZ);
            this.LJFF.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LIZIZ);
            JSONObject jSONObject = this.LIZJ;
            if (jSONObject != null) {
                this.LJFF.put("value", jSONObject);
            }
            JSONObject jSONObject2 = this.LIZLLL;
            if (jSONObject2 != null) {
                this.LJFF.put("category", jSONObject2);
            }
            JSONObject jSONObject3 = this.LJ;
            if (jSONObject3 != null) {
                this.LJFF.put("metric", jSONObject3);
            }
            return this.LJFF;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC792320V6g
    public final boolean LIZJ(JSONObject jSONObject) {
        return C790620Uzs.LIZ.getServiceSwitch(this.LIZ);
    }

    public C790600Uzq(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = null;
        this.LIZLLL = jSONObject;
        this.LJ = jSONObject2;
        this.LJFF = jSONObject3;
    }

    public C790600Uzq(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = jSONObject;
        this.LIZLLL = jSONObject2;
        this.LJ = jSONObject3;
        this.LJFF = jSONObject4;
    }
}
