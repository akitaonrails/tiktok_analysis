package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BER, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BER extends C1699610uKV {
    public final boolean LIZIZ;
    public boolean LIZJ;
    public Map<String, JSONObject> LIZLLL;

    public C1BER(C2201631BEr c2201631BEr) {
        JSONObject jSONObjectOptJSONObject;
        c2201631BEr.getClass();
        this.LIZ = false;
        this.LIZIZ = c2201631BEr.LIZ;
        C08F0.LIZ(null);
        JSONObject jSONObject = c2201631BEr.LIZIZ;
        if (jSONObject != null) {
            try {
                this.LIZ = C1699610uKV.LIZ(jSONObject, "is_enable", true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                th.getMessage();
            }
            try {
                jSONObject.optString("appid", "");
                if (this.LIZLLL == null) {
                    this.LIZLLL = new HashMap();
                }
                C1699610uKV.LIZ(jSONObject, "is_enable_monitor", false);
                this.LIZJ = C1699610uKV.LIZ(jSONObject, "is_enable_net_opt", false);
                ((HashMap) this.LIZLLL).clear();
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("settings");
                if (jSONObjectOptJSONObject2 != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(next)) != null) {
                            ((HashMap) this.LIZLLL).put(next, jSONObjectOptJSONObject);
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                th2.getMessage();
            }
        }
    }
}
