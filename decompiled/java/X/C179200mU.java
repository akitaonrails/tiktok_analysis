package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00mU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C179200mU {
    public final Map<String, Object> LIZ = new ConcurrentHashMap();

    public final String LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final void LIZ(Object obj, String str) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            ((ConcurrentHashMap) this.LIZ).put(str, obj);
        }
    }
}
