package X;

import Y.ARunnableS22S0400000_13;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WSB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WSB extends C0WS7 {
    public final String LJIIIIZZ;
    public final long LJIIIZ;
    public Map<String, String> LJIIJ;
    public boolean LJIIJJI;

    public final void LJIILJJIL() {
        stop();
        if (this.LJIIJJI) {
            return;
        }
        C01GW c01gw = PumbaaPerformanceTrackManager.LJIIJ;
        c01gw.getValue();
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            PumbaaPerformanceTrackManager.LIZ(this.LIZ, jSONObject, jSONObject2);
            ((ScheduledExecutorService) c01gw.getValue()).schedule(new ARunnableS22S0400000_13(jSONObject3, this, jSONObject, jSONObject2, 4), this.LJIIIZ, TimeUnit.SECONDS);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0WS5.LIZIZ("PerformanceTracker_prepareRealTimeData_error", th);
        }
    }

    public static JSONObject LJIIJJI(C0WSC c0wsc) {
        C0WS7 c0ws7;
        C0WS6 timeStamp = c0wsc.getTimeStamp();
        JSONArray jSONArray = new JSONArray();
        List<C0WSC> list = null;
        if ((c0wsc instanceof C0WS7) && (c0ws7 = (C0WS7) c0wsc) != null) {
            list = c0ws7.LJII;
        }
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        if (list != null && !list.isEmpty()) {
            for (C0WSC c0wsc2 : list) {
                String name = c0wsc2.getName();
                C0WS6 timeStamp2 = c0wsc2.getTimeStamp();
                jSONArray.put(LJIILIIL(name, timeStamp2.LIZIZ, timeStamp2.LIZLLL, c0wsc2.getStatus(), c0wsc2.LJI()));
                if (c0wsc2.LJI() == C0WSF.EXCEEDED) {
                    jSONArray2.put(c0wsc2.getName());
                } else if (c0wsc2.LJI() == C0WSF.DROPPED) {
                    jSONArray3.put(c0wsc2.getName());
                }
            }
            long j = timeStamp.LIZIZ;
            long j2 = timeStamp.LIZLLL;
            for (C0WSC c0wsc3 : list) {
                j -= c0wsc3.getTimeStamp().LIZIZ;
                j2 -= c0wsc3.getTimeStamp().LIZLLL;
            }
            jSONArray.put(LJIILIIL("unmeasured_cost", j, j2, null, null));
        }
        return LJIIL(c0wsc.getName(), timeStamp.LIZIZ, timeStamp.LIZLLL, c0wsc.getStatus(), c0wsc.LJI(), jSONArray, jSONArray2, jSONArray3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WSB(String str, String str2, int i) {
        super(str, 0, false);
        str2 = (i & 2) != 0 ? null : str2;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = 5L;
    }

    public static JSONObject LJIILIIL(String str, long j, long j2, String str2, C0WSF c0wsf) throws JSONException {
        long j3;
        if (PumbaaPerformanceTrackManager.LJIIIIZZ) {
            j3 = j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        } else {
            j3 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("step_name", str);
        jSONObject.put("cost", j3);
        jSONObject.put("cpu_cost", j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        jSONObject.put("execute_status", c0wsf);
        return jSONObject;
    }

    public static JSONObject LJIIL(String str, long j, long j2, String str2, C0WSF c0wsf, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3) throws JSONException {
        long j3;
        if (PumbaaPerformanceTrackManager.LJIIIIZZ) {
            j3 = j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        } else {
            j3 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        long j4 = j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("node_name", str);
        jSONObject.put("total_cost", j3);
        jSONObject.put("total_cpu_cost", j4);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        jSONObject.put("execute_status", c0wsf);
        if (jSONArray2 != null && jSONArray2.length() > 0) {
            jSONObject.put("exceeded_list", jSONArray2);
        }
        if (jSONArray3 != null && jSONArray3.length() > 0) {
            jSONObject.put("dropped_list", jSONArray3);
        }
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("step_list", jSONArray);
        }
        return jSONObject;
    }
}
