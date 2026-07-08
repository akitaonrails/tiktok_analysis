package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793510VAv {
    public SharedPreferences LIZ;
    public JSONArray LIZIZ = new JSONArray();
    public volatile boolean LIZJ;
    public String LIZLLL;
    public long LJ;

    public final synchronized void LIZ() {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        Application application = C792190V5t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C792420V6q.LJ());
        sbLIZ.append("_");
        sbLIZ.append("drop_message");
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(application, 0, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = sharedPreferencesLIZJ;
        String string = sharedPreferencesLIZJ.getString("drop_data_items", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.LIZIZ = new JSONArray(string);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final JSONArray LIZIZ() {
        LIZ();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < this.LIZIZ.length(); i++) {
            try {
                if (i < 10) {
                    jSONArray.put(this.LIZIZ.get(i));
                } else {
                    jSONArray2.put(this.LIZIZ.get(i));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LIZIZ = jSONArray2;
        this.LIZ.edit().putString("drop_data_items", this.LIZIZ.toString()).commit();
        return jSONArray;
    }

    public final void LIZJ(long j, long j2, long j3) {
        EnumC571870Mbp enumC571870Mbp = EnumC571870Mbp.SERVER_DROP;
        LIZ();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log_type", "server_drop_data");
            jSONObject.put("timestamp", j3);
            jSONObject.put("drop_data_count", j);
            jSONObject.put("drop_data_bytes", j2);
            jSONObject.put("x-tt-logid", this.LIZLLL);
            jSONObject.put("drop_timestamp", this.LJ);
            jSONObject.put("drop_reason", enumC571870Mbp);
            this.LIZIZ.put(jSONObject);
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("monitorDropLog:");
                sbLIZ.append(this.LIZIZ.toString());
                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LIZ.edit().putString("drop_data_items", this.LIZIZ.toString()).commit();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C792910V8n.LIZJ("APM-Slardar", "monitorDropLog:", e);
        }
    }
}
