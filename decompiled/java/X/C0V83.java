package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V83, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V83 {
    public final String LIZ;
    public final Map<String, Long> LIZIZ = new HashMap();
    public long LIZJ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("biz", this.LIZ);
            jSONObject.put("usage", this.LIZJ);
            JSONArray jSONArray = new JSONArray();
            Map<String, Long> map = this.LIZIZ;
            if (map != null && ((HashMap) map).size() > 0) {
                for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("source_id", entry.getKey());
                    jSONObject2.put("usage", entry.getValue());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("detail", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public C0V83(String str) {
        this.LIZ = str;
    }

    public final JSONObject LIZIZ(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("biz", this.LIZ);
            jSONObject.put("usage", this.LIZJ);
            JSONArray jSONArray = new JSONArray();
            Map<String, Long> map = this.LIZIZ;
            if (map != null && ((HashMap) map).size() > 0) {
                for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                    if (((Long) entry.getValue()).longValue() >= j) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("source_id", entry.getKey());
                        jSONObject2.put("usage", entry.getValue());
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("detail", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }
}
