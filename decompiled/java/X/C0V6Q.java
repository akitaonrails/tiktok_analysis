package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V6Q, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V6Q extends C0V6S {
    public final String LIZIZ;
    public final JSONObject LIZJ;

    @Override // X.C0VB5
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.C0VB5
    public final JSONObject LIZ() {
        InterfaceC792920V8o interfaceC792920V8o;
        try {
            JSONObject jSONObject = this.LIZJ;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", this.LIZIZ);
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

    @Override // X.C0VB5
    public final boolean isValid() {
        return !TextUtils.isEmpty(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Apm5LegacyEvent{logType='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0VB5
    public final String getLogType() {
        return this.LIZIZ;
    }

    public C0V6Q(String str, JSONObject jSONObject) {
        this.LIZIZ = str;
        this.LIZJ = jSONObject;
    }
}
