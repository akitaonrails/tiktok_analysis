package Y;

import X.C1274830jHN;
import X.C1278740jNg;
import X.C1C7U;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.core.resource.LynxResourceLoader;
import com.ss.ttlivestreamer.core.utils.AVLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS4S1101100_20 implements Runnable {
    public final int $t;
    public int i2;
    public long j3;
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
        C1274830jHN c1274830jHN = (C1274830jHN) this.l1;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j3, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(this.j3, "rtc_occur_error");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("error_code", this.i2);
            jSONObjectLIZIZ.put("message", this.s0);
            jSONObjectLIZIZ.put("rtc_token", ((C1274830jHN) this.l1).LIZ.LIZ);
            if (((C1274830jHN) this.l1).LJJI != null) {
                jSONObjectLIZIZ.put("api", "rtc_occur_error");
            }
            ((C1274830jHN) this.l1).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public final void LIZ$1() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l1;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j3, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(this.j3, "rtc_occur_warning");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("error_code", this.i2);
            jSONObjectLIZIZ.put("message", this.s0);
            if (((C1274830jHN) this.l1).LJJI != null) {
                jSONObjectLIZIZ.put("api", "rtc_occur_warning");
            }
            ((C1274830jHN) this.l1).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public final void LIZ$2() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l1;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j3, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(this.j3, "ext_video_frame_changed");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("error_code", this.i2).put("message", this.s0);
            if (((C1274830jHN) this.l1).LJJI != null) {
                jSONObjectLIZIZ.put("api", "ext_video_frame_changed");
            }
            ((C1274830jHN) this.l1).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public static final void run$0(ARunnableS4S1101100_20 aRunnableS4S1101100_20) {
        C1278740jNg c1278740jNg = (C1278740jNg) aRunnableS4S1101100_20.l1;
        long j = aRunnableS4S1101100_20.j3;
        String str = aRunnableS4S1101100_20.s0;
        int i = aRunnableS4S1101100_20.i2;
        c1278740jNg.getClass();
        C1C7U.LIZ("VeLiveLogService@5388.onPushStreamFail$1L");
        JSONObject jSONObjectLIZIZ = c1278740jNg.LIZIZ(null, j);
        if (jSONObjectLIZIZ != null) {
            try {
                jSONObjectLIZIZ.put("event_key", "push_stream_fail").put("message", str).put("error_code", i);
                c1278740jNg.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C7U.LIZIZ("VeLiveLogService@5388.onPushStreamFail$1L");
    }

    public static final void run$1(ARunnableS4S1101100_20 aRunnableS4S1101100_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxResourceLoader@b53f.loadResource$1");
        try {
            ((LynxResourceLoader) aRunnableS4S1101100_20.l1).LJFF(aRunnableS4S1101100_20.i2, aRunnableS4S1101100_20.j3, aRunnableS4S1101100_20.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxResourceLoader@b53f.loadResource$1");
    }

    public static final void run$2(ARunnableS4S1101100_20 aRunnableS4S1101100_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onErrorOccurs$1");
        try {
            aRunnableS4S1101100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onErrorOccurs$1");
    }

    public static final void run$3(ARunnableS4S1101100_20 aRunnableS4S1101100_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onWarningOccurs$1");
        try {
            aRunnableS4S1101100_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onWarningOccurs$1");
    }

    public static final void run$4(ARunnableS4S1101100_20 aRunnableS4S1101100_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onExtVideoFrameChanged$1");
        try {
            aRunnableS4S1101100_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onExtVideoFrameChanged$1");
    }

    public ARunnableS4S1101100_20(C1274830jHN c1274830jHN, long j, int i, int i2) {
        this.$t = i2;
        this.l1 = c1274830jHN;
        this.j3 = j;
        this.i2 = i;
        this.s0 = "";
    }

    public ARunnableS4S1101100_20(C1274830jHN c1274830jHN, long j, String str, int i) {
        this.$t = i;
        this.l1 = c1274830jHN;
        this.j3 = j;
        this.i2 = 0;
        this.s0 = str;
    }

    public ARunnableS4S1101100_20(Object obj, long j, String str, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.j3 = j;
        this.s0 = str;
        this.i2 = i;
    }
}
