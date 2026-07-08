package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V6X, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V6X extends C0V6S {
    public final String LIZIZ;
    public final int LIZJ;
    public JSONObject LIZLLL;
    public JSONObject LJ;
    public JSONObject LJFF;
    public JSONObject LJI;

    @Override // X.C0VB5
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.C0VB5
    public final String getLogType() {
        return "service_monitor";
    }

    @Override // X.C0VB5
    public final JSONObject LIZ() {
        InterfaceC792920V8o interfaceC792920V8o;
        try {
            JSONObject jSONObject = this.LJI;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", "service_monitor");
            jSONObject.put("service", this.LIZIZ);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LIZJ);
            JSONObject jSONObject2 = this.LIZLLL;
            if (jSONObject2 != null) {
                jSONObject.put("value", jSONObject2);
            }
            JSONObject jSONObject3 = this.LJ;
            if (jSONObject3 != null) {
                jSONObject.put("category", jSONObject3);
            }
            JSONObject jSONObject4 = this.LJFF;
            if (jSONObject4 != null) {
                jSONObject.put("metric", jSONObject4);
            }
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!C792190V5t.LIZ() || (interfaceC792920V8o = C792910V8n.LIZ) == null) {
                return null;
            }
            interfaceC792920V8o.LIZ();
            return null;
        }
    }

    public final void LIZJ() {
        this.LIZLLL = C792450V6t.LJII(this.LIZLLL);
        this.LJ = C792450V6t.LJII(this.LJ);
        this.LJFF = C792450V6t.LJII(this.LJFF);
        this.LJI = C792450V6t.LJII(this.LJI);
    }

    @Override // X.C0VB5
    public final boolean isValid() {
        return !TextUtils.isEmpty(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonEvent{serviceName='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V6X(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = jSONObject;
        this.LJ = jSONObject2;
        this.LJFF = jSONObject3;
        this.LJI = jSONObject4;
    }
}
