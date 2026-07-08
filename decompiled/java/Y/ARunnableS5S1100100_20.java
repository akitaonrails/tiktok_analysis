package Y;

import X.AbstractC1273900jFs;
import X.AbstractC827810Wdf;
import X.C0UQX;
import X.C1274830jHN;
import X.C1325710kbR;
import X.C1328570kg3;
import X.C1330620kjM;
import X.C1333830koX;
import X.C1333900koe;
import X.C1339000kws;
import X.C1C7U;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS5S1100100_20 implements Runnable {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        JSONObject jSONObjectLIZIZ = C0UQX.LIZIZ(this.j2);
        if (jSONObjectLIZIZ != null) {
            try {
                jSONObjectLIZIZ.put("event_key", "live_sdk_log");
                jSONObjectLIZIZ.put("engine_api_name", this.s0);
                JSONObject jSONObject = (JSONObject) this.l1;
                if (jSONObject != null) {
                    jSONObjectLIZIZ.put("message", C786410Ut5.J3(jSONObject));
                }
                jSONObjectLIZIZ.put("livecore_event_index", AbstractC1273900jFs.LL.incrementAndGet());
                jSONObjectLIZIZ.put("livecore_app_alive_uuid", AbstractC1273900jFs.LLILLJJLI);
                C0UQX.LJJIJIIJI(jSONObjectLIZIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZ$1() {
        C1333900koe c1333900koe = (C1333900koe) this.l1;
        String str = this.s0;
        long j = this.j2;
        C1333830koX c1333830koXRemove = c1333900koe.LIZ.remove(str);
        if (c1333830koXRemove != null) {
            if (C1330620kjM.LJI) {
                AbstractC827810Wdf.LIZ("Fresco", C786410Ut5.k4(null, "time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", new Object[]{Long.valueOf(j), str, Long.valueOf(C1333900koe.LJIIL(j, Long.valueOf(c1333830koXRemove.LIZ)))}));
            }
            JSONObject jSONObject = c1333830koXRemove.LIZJ;
            try {
                jSONObject.put("load_status", "cancel");
                jSONObject.put("duration", C1333900koe.LJIIL(j, Long.valueOf(c1333830koXRemove.LIZ)));
                jSONObject.put("timestamp", Long.valueOf(c1333830koXRemove.LIZ));
                synchronized (C1339000kws.LIZ()) {
                }
                jSONObject.put("retry_open", 0);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1328570kg3.LJIIIIZZ("FrescoTraceListener", e, "", new Object[0]);
            }
            C1333900koe.LJIILJJIL(null, str, c1333830koXRemove.LIZLLL, jSONObject, false, jSONObject.optBoolean("is_request_network", false), true);
            C1333900koe.LJIJJLI(null, jSONObject);
        }
    }

    public final void LIZ$2() {
        C1333900koe c1333900koe = (C1333900koe) this.l1;
        String str = this.s0;
        long j = this.j2;
        C1333830koX c1333830koX = c1333900koe.LIZ.get(str);
        if (c1333830koX == null || !c1333830koX.LJ) {
            return;
        }
        c1333830koX.LJ = false;
        JSONObject jSONObject = c1333830koX.LIZJ;
        if (jSONObject != null) {
            try {
                jSONObject.put("first_intermediate_result", C1333900koe.LJIIL(j, Long.valueOf(c1333830koX.LIZ)));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZ$3() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l1;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j2, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(this.j2, "rtc_first_remote_video_render");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("remote_rtc_user_id", this.s0);
            if (((C1274830jHN) this.l1).LJJI != null) {
                jSONObjectLIZIZ.put("api", "rtc_first_remote_video_render");
            }
            ((C1274830jHN) this.l1).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public final void LIZ$4() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l1;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j2, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(this.j2, "rtc_network_changed");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("access", this.s0);
            if (((C1274830jHN) this.l1).LJJI != null) {
                jSONObjectLIZIZ.put("api", "rtc_network_changed");
            }
            ((C1274830jHN) this.l1).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public static final void run$0(ARunnableS5S1100100_20 aRunnableS5S1100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewLogHelperKt@d15e.initLiveCoreLog$1$logApiCall$1");
        try {
            aRunnableS5S1100100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewLogHelperKt@d15e.initLiveCoreLog$1$logApiCall$1");
    }

    public static final void run$1(ARunnableS5S1100100_20 aRunnableS5S1100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("FrescoTraceListener@156d.onRequestCancellation$1");
        try {
            aRunnableS5S1100100_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FrescoTraceListener@156d.onRequestCancellation$1");
    }

    public static final void run$2(ARunnableS5S1100100_20 aRunnableS5S1100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("FrescoTraceListener@156d.onRequestIntermediateResult$1");
        try {
            aRunnableS5S1100100_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FrescoTraceListener@156d.onRequestIntermediateResult$1");
    }

    public static final void run$3(ARunnableS5S1100100_20 aRunnableS5S1100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onFirstRemoteVideoRender$1");
        try {
            aRunnableS5S1100100_20.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onFirstRemoteVideoRender$1");
    }

    public static final void run$4(ARunnableS5S1100100_20 aRunnableS5S1100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onNetworkChanged$1");
        try {
            aRunnableS5S1100100_20.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onNetworkChanged$1");
    }

    public ARunnableS5S1100100_20(String str, long j, Object obj, int i) {
        this.$t = i;
        this.j2 = j;
        this.s0 = str;
        this.l1 = obj;
    }

    public ARunnableS5S1100100_20(C1333900koe c1333900koe, C1325710kbR c1325710kbR, String str, boolean z, long j, int i) {
        this.$t = i;
        this.l1 = c1333900koe;
        this.s0 = str;
        this.j2 = j;
    }
}
