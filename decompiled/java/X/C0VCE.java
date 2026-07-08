package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VCE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VCE {
    public volatile C0VCL LIZ;
    public C08Q4 LIZIZ;

    public final void LIZ(C0VCL c0vcl, boolean z) {
        C08Q4 c08q4;
        if (c0vcl != null) {
            synchronized (this) {
                try {
                    this.LIZ = c0vcl;
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (z && (c08q4 = this.LIZIZ) != null && c08q4.LIZ != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("expire_time", c0vcl.LIZ);
                    for (Map.Entry entry : ((HashMap) c0vcl.LIZIZ).entrySet()) {
                        jSONObject.put(((C0VCN) entry.getKey()).logType, ((C122100dH) entry.getValue()).LIZIZ());
                    }
                    c08q4.LIZ.edit().putString("rule", C786410Ut5.J3(jSONObject)).apply();
                } catch (JSONException e) {
                }
            }
        }
    }

    public final boolean LIZIZ(int i, JSONObject jSONObject) {
        boolean z = true;
        if (this.LIZ == null || System.currentTimeMillis() > this.LIZ.LIZ) {
            return true;
        }
        String strValueOf = String.valueOf(i);
        String strOptString = jSONObject.optString("log_type");
        C0VCN c0vcn = C0VCN.SERVICE_MONITOR;
        if (c0vcn.logType.equals(strOptString)) {
            String strOptString2 = jSONObject.optString("service");
            synchronized (this) {
                try {
                    C122100dH c122100dH = (C122100dH) ((HashMap) this.LIZ.LIZIZ).get(c0vcn);
                    if (c122100dH == null) {
                        return true;
                    }
                    JSONObject jSONObject2 = (JSONObject) ((HashMap) c122100dH.LIZIZ).get(strValueOf);
                    if (jSONObject2 != null && jSONObject2.optInt(strOptString2, -1) != -1) {
                        if (jSONObject2.optInt(strOptString2, -1) != 1) {
                            z = false;
                        }
                        return z;
                    }
                    return c122100dH.LIZ;
                } finally {
                }
            }
        }
        synchronized (this) {
            try {
                C122100dH c122100dH2 = (C122100dH) ((HashMap) this.LIZ.LIZIZ).get(C0VCN.OTHER_LOG_TYPE);
                if (c122100dH2 == null) {
                    return true;
                }
                JSONObject jSONObject3 = (JSONObject) ((HashMap) c122100dH2.LIZIZ).get(strValueOf);
                if (jSONObject3 != null && jSONObject3.optInt(strOptString, -1) != -1) {
                    if (jSONObject3.optInt(strOptString, -1) != 1) {
                        z = false;
                    }
                    return z;
                }
                return c122100dH2.LIZ;
            } finally {
            }
        }
    }
}
