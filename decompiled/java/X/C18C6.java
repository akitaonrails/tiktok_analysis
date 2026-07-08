package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18C6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C18C6 {
    public List<C1766940w56> LIZ = new ArrayList();

    public JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(!this.LIZ.isEmpty())) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("sdk_init_prerequisites", C18G7.LIZ());
                    jSONObject2.put("sdk_init_result", C18G7.LIZIZ());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                jSONObject.put("bcm_chain_debug", jSONObject2);
                return jSONObject;
            }
            JSONArray jSONArray = new JSONArray();
            try {
                Iterator<C1766940w56> it2 = this.LIZ.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next().LIZ());
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            jSONObject.put("chain", jSONArray);
            return jSONObject;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            return jSONObject;
        }
        TryCatchGuardChecker.doCheck(th3);
        return jSONObject;
    }
}
