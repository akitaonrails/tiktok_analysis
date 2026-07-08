package X;

import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148V, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C148V {
    public static final C148W LIZ = new InterfaceC846640XJe() { // from class: X.148W
        @Override // X.InterfaceC846640XJe
        public final void LIZ(int i, long j, String str) {
            int i2 = 1;
            try {
                if (i == 200) {
                    try {
                        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C1498550p6D.LIZ.LIZ.LJIIJJI, 0, "bd_turning_settings_init").edit();
                        editorEdit.putBoolean("inited", true);
                        editorEdit.commit();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    if (i == 200) {
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", j);
                    jSONObject.put("result", i2);
                    jSONObject.put("key", "setting");
                    C202179148z.LIZJ("turing_verify_sdk", jSONObject);
                    return;
                }
                jSONObject.put("duration", j);
                jSONObject.put("result", i2);
                jSONObject.put("key", "setting");
                C202179148z.LIZJ("turing_verify_sdk", jSONObject);
                return;
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20221514Aj.LIZIZ();
                return;
            }
            i2 = 0;
            JSONObject jSONObject2 = new JSONObject();
        }
    };
}
