package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Whg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830300Whg {
    public final List<C830310Whh> LIZ = new CopyOnWriteArrayList();
    public int LIZIZ = 10000;

    public final Pair<Map<String, JSONObject>, Long> LIZ(long j) {
        int length;
        if (this.LIZIZ <= 0) {
            return new Pair<>(null, Long.valueOf(j));
        }
        HashMap map = new HashMap();
        int i = 0;
        for (C830310Whh c830310Whh : (CopyOnWriteArrayList) this.LIZ) {
            int i2 = i + 1;
            String strValueOf = String.valueOf(i);
            c830310Whh.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event", "sdk_fatal");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", c830310Whh.LIZ);
                if (!TextUtils.isEmpty(c830310Whh.LIZIZ)) {
                    jSONObject2.put("class", c830310Whh.LIZIZ);
                    jSONObject2.put("stack", c830310Whh.LIZJ);
                }
                jSONObject.put("params", jSONObject2);
                jSONObject.put("local_time_ms", System.currentTimeMillis());
                jSONObject.put("event_id", C830270Whd.LIZIZ.incrementAndGet());
                jSONObject.put("datetime", C830270Whd.LIZ());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            map.put(strValueOf, jSONObject);
            ((CopyOnWriteArrayList) this.LIZ).remove(c830310Whh);
            if (TextUtils.isEmpty(c830310Whh.LIZIZ)) {
                length = c830310Whh.LIZ.length() + 43;
            } else {
                length = c830310Whh.LIZ.length() + 65 + c830310Whh.LIZIZ.length() + c830310Whh.LIZJ.length();
            }
            j -= (long) length;
            if (j <= 0) {
                break;
            }
            i = i2;
        }
        return new Pair<>(map, Long.valueOf(j));
    }
}
