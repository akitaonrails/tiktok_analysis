package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0JT7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JT7 {
    public static final C0JT7 LIZ = new C0JT7();
    public static final C0JT6<Object> LIZIZ = new C0JT6<>("live_coin_incentive_task_data_cache", Object.class);
    public static final C0JT6<Boolean> LIZJ = new C0JT6<>("force_mem_cache", new TypeToken<Boolean>() { // from class: X.0JT8
    }.getType());
    public static final ConcurrentHashMap<String, Object> LIZLLL = new ConcurrentHashMap<>();

    public static Map LIZIZ() {
        Map map = (Map) LIZ(new LinkedHashMap(), "watch_live_duration_map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Number) {
                linkedHashMap.put(key, Long.valueOf(((Number) value).longValue()));
            }
        }
        return linkedHashMap;
    }

    public static Object LIZ(Object obj, String str) {
        Object c098200Yq;
        try {
            if (C176600m4.LIZIZ(LIZJ.LIZ())) {
                c098200Yq = LIZLLL.get(str);
            } else {
                c098200Yq = LIZIZ.LIZIZ(str);
            }
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            if (c098200Yq == null) {
                c098200Yq = obj;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            return c098200Yq;
        }
        return obj;
    }

    public static void LIZJ(Object obj, String str) {
        if (C176600m4.LIZIZ(LIZJ.LIZ())) {
            LIZLLL.put(str, obj);
        } else {
            LIZIZ.LIZLLL(obj, str);
        }
    }
}
