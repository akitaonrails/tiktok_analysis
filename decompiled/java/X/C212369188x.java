package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.188x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212369188x {
    public static final C212368188w LJ = new C212368188w();
    public final Map<String, ? extends BcmParams> LIZ;
    public Map<String, ? extends BcmParams> LIZIZ;
    public final Map<String, ? extends BcmParams> LIZJ;
    public String LIZLLL;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                Map<String, ? extends BcmParams> map = this.LIZ;
                if (map != null) {
                    for (Map.Entry<String, ? extends BcmParams> entry : map.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().toJSONObject());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            jSONObject.put("page", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            try {
                Map<String, ? extends BcmParams> map2 = this.LIZIZ;
                if (map2 != null) {
                    for (Map.Entry<String, ? extends BcmParams> entry2 : map2.entrySet()) {
                        jSONObject3.put(entry2.getKey(), entry2.getValue().toJSONObject());
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            jSONObject.put("unit", jSONObject3);
            Map<String, ? extends BcmParams> map3 = this.LIZJ;
            if (map3 != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    for (Map.Entry<String, ? extends BcmParams> entry3 : map3.entrySet()) {
                        jSONObject4.put(entry3.getKey(), entry3.getValue().toJSONObject());
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                jSONObject.put("unit_v1", jSONObject4);
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C212369188x(Map<String, ? extends BcmParams> map, Map<String, ? extends BcmParams> map2, Map<String, ? extends BcmParams> map3) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
    }
}
