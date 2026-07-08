package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1269610j8x {
    public final int LIZIZ;
    public final EnumC1269590j8v LIZLLL;
    public final String LJ;
    public int LJFF;
    public InterfaceC1269480j8k LJI;
    public final String LIZ = "TTLHSerializedEvent";
    public final long LIZJ = System.currentTimeMillis();

    public final JSONObject LIZ() {
        try {
            return new JSONObject().put("event_key", "ttlh_eventization_event").put("event_type", this.LIZLLL.value()).put("event_sequence_number", this.LIZIZ).put("event_timestamp", this.LIZJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" sequenceNumber:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" eventType:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" nodeMask:");
        sbLIZ.append(C1269570j8t.LIZ(this.LJFF));
        sbLIZ.append(" extraInfo:");
        sbLIZ.append(this.LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final JSONObject LIZIZ(int i) {
        JSONObject jSONObjectLIZ = LIZ();
        if (jSONObjectLIZ != null) {
            try {
                jSONObjectLIZ.put("event_action_node", C1269570j8t.LIZ(i));
                jSONObjectLIZ.put("event_action_type", "event_deliver");
                JSONObject jSONObject = new JSONObject();
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

    public JSONObject LIZJ(int i) {
        JSONObject jSONObjectLIZ = LIZ();
        if (jSONObjectLIZ != null) {
            try {
                jSONObjectLIZ.put("event_action_node", C1269570j8t.LIZ(i));
                jSONObjectLIZ.put("event_action_type", "event_generate");
                JSONObject jSONObject = new JSONObject();
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

    public JSONObject LIZLLL(int i) {
        JSONObject jSONObjectLIZ = LIZ();
        if (jSONObjectLIZ != null) {
            try {
                jSONObjectLIZ.put("event_action_node", C1269570j8t.LIZ(i));
                jSONObjectLIZ.put("event_action_type", "event_handle");
                JSONObject jSONObject = new JSONObject();
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

    public C1269610j8x(int i, EnumC1269590j8v enumC1269590j8v, int i2, String str) {
        this.LIZIZ = i;
        this.LIZLLL = enumC1269590j8v;
        this.LJFF = i2;
        this.LJ = str;
    }
}
