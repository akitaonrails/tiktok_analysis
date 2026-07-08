package X;

import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NBM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NBM {
    public boolean LIZ = true;
    public final Map<String, C2176401AFq> LIZIZ = new ConcurrentHashMap();

    public final Pair<Map<String, JSONObject>, Long> LIZ(long j) {
        if (this.LIZ && !((ConcurrentHashMap) this.LIZIZ).isEmpty()) {
            HashMap map = new HashMap();
            synchronized (this.LIZIZ) {
                try {
                    for (String str : ((ConcurrentHashMap) this.LIZIZ).keySet()) {
                        C2176401AFq c2176401AFq = (C2176401AFq) ((ConcurrentHashMap) this.LIZIZ).remove(str);
                        if (c2176401AFq != null) {
                            map.put(str, c2176401AFq.LIZ());
                            j -= 231;
                            if (j <= 0) {
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return new Pair<>(map, Long.valueOf(j));
        }
        return new Pair<>(null, Long.valueOf(j));
    }
}
