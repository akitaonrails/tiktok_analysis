package X;

import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WSJ {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static final ConcurrentHashMap<String, C0WSK> LIZIZ = new ConcurrentHashMap<>();
    public static ScheduledFuture<?> LIZJ;

    public static void LIZIZ(boolean z) {
        try {
            if (!PumbaaPerformanceTrackManager.LJI()) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("total_count", LIZ.get());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("trigger_by_first_frame_show", z);
            PumbaaPerformanceTrackManager.LIZ("frequency", jSONObject, jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it2 = LIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("api_id", entry.getKey());
                JSONArray jSONArray2 = new JSONArray();
                Iterator<T> it3 = ((C0WSK) entry.getValue()).LIZIZ.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it3.next();
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("name", entry2.getKey());
                    jSONObject5.put("count", ((AtomicInteger) entry2.getValue()).get());
                    jSONArray2.put(jSONObject5);
                }
                jSONObject4.put("total_count", ((C0WSK) entry.getValue()).LIZ.get());
                jSONObject4.put("invoker_list", jSONArray2);
                jSONArray.put(jSONObject4);
            }
            jSONObject3.put("api_list", jSONArray);
            C823280WRi.LJI("pumbaa_performance", jSONObject2, jSONObject, jSONObject3);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("metric", jSONObject);
            jSONObject6.put("category", jSONObject2);
            jSONObject6.put("extra", jSONObject3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0WS5.LIZIZ("InvokeCountRecorder_report_error", th);
        }
    }

    public static void LIZ(String str, List list) {
        try {
            if (PumbaaPerformanceTrackManager.LJI() && list != null && !list.isEmpty()) {
                LIZ.incrementAndGet();
                ConcurrentHashMap<String, C0WSK> concurrentHashMap = LIZIZ;
                C0WSK c0wsk = concurrentHashMap.get(str);
                if (c0wsk == null) {
                    c0wsk = new C0WSK(new AtomicInteger(1), new ConcurrentHashMap());
                    concurrentHashMap.put(str, c0wsk);
                } else {
                    c0wsk.LIZ.incrementAndGet();
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    AtomicInteger atomicInteger = c0wsk.LIZIZ.get(str2);
                    if (atomicInteger == null) {
                        c0wsk.LIZIZ.put(str2, new AtomicInteger(1));
                    } else {
                        atomicInteger.incrementAndGet();
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0WS5.LIZIZ("InvokeCountRecorder_record_error", th);
        }
    }
}
