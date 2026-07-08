package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VBG {
    public volatile C0VBH LIZ;
    public C08Q5 LIZIZ;

    public final void LIZ(Context context) {
        C08Q5 c08q5 = new C08Q5(context);
        this.LIZIZ = c08q5;
        C0VBH c0vbh = null;
        String string = c08q5.LIZ.getString("rule", null);
        if (string != null) {
            try {
                if (C792190V5t.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DowngradeData-load-");
                    sbLIZ.append(string);
                    C792910V8n.LIZLLL("APM-Downgrade", C2188811AlT.LIZIZ(sbLIZ));
                }
                C0VBH c0vbhLIZ = C0VBH.LIZ(new JSONObject(string));
                if (System.currentTimeMillis() < c0vbhLIZ.LIZ) {
                    c0vbh = c0vbhLIZ;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LIZIZ(c0vbh, false);
    }

    public final void LIZIZ(C0VBH c0vbh, boolean z) {
        C08Q5 c08q5;
        if (c0vbh != null) {
            synchronized (this) {
                try {
                    this.LIZ = c0vbh;
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (z && (c08q5 = this.LIZIZ) != null && c08q5.LIZ != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("expire_time", c0vbh.LIZ);
                    for (Map.Entry entry : ((HashMap) c0vbh.LIZIZ).entrySet()) {
                        jSONObject.put(((C0VBI) entry.getKey()).logType, ((C122000dG) entry.getValue()).LIZIZ());
                    }
                    String strJ3 = C786410Ut5.J3(jSONObject);
                    if (C792190V5t.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DowngradeData-save-");
                        sbLIZ.append(strJ3);
                        C792910V8n.LIZLLL("APM-Downgrade", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    c08q5.LIZ.edit().putString("rule", C786410Ut5.J3(jSONObject)).apply();
                } catch (JSONException e) {
                }
            }
        }
    }

    public final boolean LIZJ(int i, JSONObject jSONObject) {
        boolean z = true;
        if (this.LIZ == null || System.currentTimeMillis() > this.LIZ.LIZ) {
            return true;
        }
        String strValueOf = String.valueOf(i);
        String strOptString = jSONObject.optString("log_type");
        synchronized (this) {
            try {
                C0VBI c0vbi = C0VBI.SERVICE_MONITOR;
                if (c0vbi.logType.equals(strOptString)) {
                    String strOptString2 = jSONObject.optString("service");
                    C122000dG c122000dG = (C122000dG) ((HashMap) this.LIZ.LIZIZ).get(c0vbi);
                    if (c122000dG != null) {
                        JSONObject jSONObject2 = (JSONObject) ((HashMap) c122000dG.LIZIZ).get(strValueOf);
                        if (jSONObject2 != null && jSONObject2.optInt(strOptString2, -1) != -1) {
                            if (jSONObject2.optInt(strOptString2, -1) != 1) {
                                z = false;
                            }
                            return z;
                        }
                        return c122000dG.LIZ;
                    }
                } else {
                    C122000dG c122000dG2 = (C122000dG) ((HashMap) this.LIZ.LIZIZ).get(C0VBI.OTHER_LOG_TYPE);
                    if (c122000dG2 != null) {
                        JSONObject jSONObject3 = (JSONObject) ((HashMap) c122000dG2.LIZIZ).get(strValueOf);
                        if (jSONObject3 != null && jSONObject3.optInt(strOptString, -1) != -1) {
                            if (jSONObject3.optInt(strOptString, -1) != 1) {
                                z = false;
                            }
                            return z;
                        }
                        return c122000dG2.LIZ;
                    }
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
