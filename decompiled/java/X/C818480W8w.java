package X;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818480W8w {
    public static final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public static final C818470W8v LIZJ = new C818470W8v();

    public static final void LIZ(String str) {
        C0VWW.LJFF(str, new C0VWZ("metric_type_latency_common", str));
        LIZIZ.put(str, Boolean.TRUE);
        if (C818490W8x.LIZ() && !TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, Long> concurrentHashMap = LIZ;
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
            }
            concurrentHashMap.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static final void LIZIZ(String str) {
        LIZJ(str, C0W93.SUCCESS, null, C2097608Jq.LJ());
    }

    public static final boolean LJ(String str) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.containsKey(str) && Intrinsics.LJFF(concurrentHashMap.get(str), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(String str, C0W93 c0w93, String str2, Map<String, ? extends Object> map) {
        Map mapLIZJ;
        Map<String, ? extends Object> mapLJIIL = map;
        C0VWW.LJFF(str, new C0VWY("metric_type_latency_common", str));
        LIZIZ.put(str, Boolean.FALSE);
        if (C818490W8x.LIZ() && !TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, Long> concurrentHashMap = LIZ;
            if (concurrentHashMap.containsKey(str)) {
                long jCurrentTimeMillis = 0;
                if (c0w93 == C0W93.SUCCESS) {
                    Long l = concurrentHashMap.get(str);
                    if (l != null && l.longValue() > 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                    } else {
                        return;
                    }
                }
                if (str2 != null && (mapLIZJ = C2097908Jt.LIZJ(new Pair("from_scene", str2))) != null) {
                    mapLJIIL = C2097608Jq.LJIIL(mapLIZJ, mapLJIIL);
                }
                C818470W8v c818470W8v = LIZJ;
                if (c818470W8v != null) {
                    C823050WQl.LIZIZ().execute(new RunnableC818500W8y(c818470W8v, str, c0w93, jCurrentTimeMillis, mapLJIIL));
                }
                concurrentHashMap.remove(str);
            }
        }
    }
}
