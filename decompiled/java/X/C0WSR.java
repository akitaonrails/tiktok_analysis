package X;

import android.util.Log;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfig;
import com.bytedance.pumbaa.base2.performance.sla.PerfSlaConfigs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WSR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WSR {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(AbstractC1247804uS abstractC1247804uS, PerfSlaConfigs perfSlaConfigs, C0WSC c0wsc) {
        PerfSlaConfig perfSlaConfig;
        if (abstractC1247804uS instanceof C1247704uR) {
            PerfSlaConfig perfSlaConfig2 = perfSlaConfigs.init;
            if (perfSlaConfig2 == null) {
                return;
            }
            LIZ(perfSlaConfig2.dropSampleRate, perfSlaConfig2.thresholdMs, c0wsc, C0WSF.DROPPED, "init", null, perfSlaConfig2.tag);
            return;
        }
        if (!(abstractC1247804uS instanceof C1247604uQ) || (perfSlaConfig = perfSlaConfigs.controlExecution) == null) {
            return;
        }
        LIZ(perfSlaConfig.dropSampleRate, perfSlaConfig.thresholdMs, c0wsc, C0WSF.DROPPED, "execution", ((C1247604uQ) abstractC1247804uS).LIZ, perfSlaConfig.tag);
    }

    public static void LIZ(final float f, final long j, final C0WSC c0wsc, final C0WSF c0wsf, final String str, final String str2, final String str3) {
        if (!C0WSN.LIZ(f)) {
            return;
        }
        ((ScheduledExecutorService) PumbaaPerformanceTrackManager.LJIIJ.getValue()).schedule(new Runnable() { // from class: X.0WSA
            @Override // java.lang.Runnable
            public final void run() {
                Object c098200Yq;
                ArrayList arrayList;
                ArrayList arrayList2;
                C0WS7 c0ws7;
                C0WSC c0wsc2 = c0wsc;
                String str4 = str;
                C0WSF c0wsf2 = c0wsf;
                String str5 = str2;
                float f2 = f;
                long j2 = j;
                String str6 = str3;
                C1C7U.LIZ("PerfSlaReporter@7031.report$1L");
                try {
                    List<C0WSC> list = (!(c0wsc2 instanceof C0WS7) || (c0ws7 = (C0WS7) c0wsc2) == null) ? null : c0ws7.LJII;
                    if (list != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (C0WSC c0wsc3 : list) {
                            if (c0wsc3.LJI() == C0WSF.EXCEEDED) {
                                arrayList3.add(c0wsc3);
                            }
                        }
                        arrayList = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((C0WSC) it2.next()).getName());
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (C0WSC c0wsc4 : list) {
                            if (c0wsc4.LJI() == C0WSF.DROPPED) {
                                arrayList4.add(c0wsc4);
                            }
                        }
                        arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((C0WSC) it3.next()).getName());
                        }
                    } else {
                        arrayList = null;
                        arrayList2 = null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_type", "perf_sla");
                    jSONObject.put("process_type", str4);
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c0wsf2.toString());
                    if (str5 != null) {
                        jSONObject.put("api_id", str5);
                    }
                    jSONObject.put("sample_rate", Float.valueOf(f2));
                    jSONObject.put("threshold", j2);
                    jSONObject.put("tag", str6);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        jSONObject.put("exceeded_list", new JSONArray((Collection) arrayList));
                    }
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        jSONObject.put("dropped_list", new JSONArray((Collection) arrayList2));
                    }
                    C823280WRi.LJI("pumbaa_performance", jSONObject, null, null);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PerfSlaReporter report >> ");
                    sbLIZ.append(jSONObject);
                    c098200Yq = Integer.valueOf(Log.d("PumbaaPerf_SLA", C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                C1C7U.LIZIZ("PerfSlaReporter@7031.report$1L");
            }
        }, 3L, TimeUnit.SECONDS);
    }
}
