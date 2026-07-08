package X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hU0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205780hU0 {
    public final long LIZ;
    public final LinkedHashMap<String, Long> LIZIZ;
    public final LinkedHashMap<String, Object> LIZJ;
    public final LinkedHashMap<String, Long> LIZLLL;

    public final Map<String, Object> LIZJ() {
        LinkedHashMap<String, Long> linkedHashMap = this.LIZIZ;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        Iterator<T> it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue() - this.LIZ;
            if (jLongValue < 0) {
                jLongValue = 0;
            }
            linkedHashMap2.put(key, Long.valueOf(jLongValue));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LIZIZ("activity_create_ms", "activity_on_create_start", "activity_set_content_view_end", linkedHashMap3);
        LIZIZ("lynx_init_to_load_finish_ms", "lynx_init_start", "lynx_load_finish", linkedHashMap3);
        LIZIZ("lynx_load_to_first_screen_ms", "lynx_load_start", "lynx_first_screen", linkedHashMap3);
        LIZIZ("total_to_first_screen_ms", "activity_on_create_start", "lynx_first_screen", linkedHashMap3);
        LIZIZ("request_to_first_chunk_main_ms", "net_request_start", "net_first_chunk_main", linkedHashMap3);
        LIZIZ("first_chunk_io_to_main_ms", "net_first_chunk_upstream", "net_first_chunk_main", linkedHashMap3);
        return C2097608Jq.LJIIIIZZ(new Pair("base_elapsed_ms", Long.valueOf(this.LIZ)), new Pair("points_ms", linkedHashMap2), new Pair("durations_ms", linkedHashMap3), new Pair("extras", C2097608Jq.LJIIZILJ(this.LIZJ)), new Pair("counters", C2097608Jq.LJIIZILJ(this.LIZLLL)));
    }

    public C1205780hU0(long j, Map<String, Long> map) {
        this.LIZ = j;
        LinkedHashMap<String, Long> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.putAll(map);
        this.LIZIZ = linkedHashMap;
        this.LIZJ = new LinkedHashMap<>();
        this.LIZLLL = new LinkedHashMap<>();
    }

    public static void LIZ(C1205780hU0 c1205780hU0, String str) {
        c1205780hU0.LIZIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void LIZIZ(String str, String str2, String str3, Map map) {
        Long l = this.LIZIZ.get(str2);
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = this.LIZIZ.get(str3);
            if (l2 != null) {
                long jLongValue2 = l2.longValue() - jLongValue;
                if (jLongValue2 < 0) {
                    jLongValue2 = 0;
                }
                map.put(str, Long.valueOf(jLongValue2));
            }
        }
    }
}
