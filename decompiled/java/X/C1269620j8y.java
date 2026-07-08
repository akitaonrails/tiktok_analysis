package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269620j8y extends C1269610j8x {
    public final String LJII;
    public boolean LJIIIIZZ;

    @Override // X.C1269610j8x
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJII);
        sbLIZ.append(" sequenceNumber:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" eventType:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" nodeMask:");
        sbLIZ.append(C1269570j8t.LIZ(this.LJFF));
        sbLIZ.append(" mEffectEnable:");
        sbLIZ.append(this.LJIIIIZZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1269610j8x
    public final JSONObject LIZJ(int i) {
        JSONObject jSONObjectLIZ = LIZ();
        if (jSONObjectLIZ != null) {
            try {
                jSONObjectLIZ.put("event_action_node", C1269570j8t.LIZ(i));
                jSONObjectLIZ.put("event_action_type", "event_generate");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mEffectEnable", this.LJIIIIZZ);
                jSONObject.put("event_type", this.LIZLLL);
                String str = this.LJ;
                if (str != null) {
                    jSONObject.put("extraInfo", str);
                }
                jSONObjectLIZ.put("event_info", jSONObject);
                return jSONObjectLIZ;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObjectLIZ;
    }

    @Override // X.C1269610j8x
    public final JSONObject LIZLLL(int i) {
        JSONObject jSONObjectLIZ = LIZ();
        if (jSONObjectLIZ != null) {
            try {
                jSONObjectLIZ.put("event_action_node", C1269570j8t.LIZ(i));
                jSONObjectLIZ.put("event_action_type", "event_handle");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mEffectEnable", this.LJIIIIZZ);
                jSONObject.put("event_type", this.LIZLLL);
                String str = this.LJ;
                if (str != null) {
                    jSONObject.put("extraInfo", str);
                }
                jSONObjectLIZ.put("event_info", jSONObject);
                return jSONObjectLIZ;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObjectLIZ;
    }

    public C1269620j8y(int i, EnumC1269590j8v enumC1269590j8v, int i2) {
        super(i, enumC1269590j8v, i2, null);
        this.LJII = "TTLHEffectEnableSwitchEvent";
        this.LJIIIIZZ = true;
    }
}
