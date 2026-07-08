package Y;

import X.C1274830jHN;
import X.C1C7U;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS2S0100200_20 implements Runnable {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l0;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j1, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(this.j1, "rtc_leave_channel_callback");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("elapsed", this.j2);
            if (((C1274830jHN) this.l0).LJJI != null) {
                jSONObjectLIZIZ.put("api", "rtc_leave_channel_callback");
            }
            ((C1274830jHN) this.l0).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public final void LIZ$1() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l0;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j1, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(this.j1, "rtc_first_local_video");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("elapsed", this.j2);
            if (((C1274830jHN) this.l0).LJJI != null) {
                jSONObjectLIZIZ.put("api", "rtc_first_local_video");
            }
            ((C1274830jHN) this.l0).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public final void LIZ$2() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l0;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j1, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(this.j1, "rtc_join_channel_success");
        if (jSONObjectLIZIZ != null) {
            try {
                JSONObject jSONObjectPut = jSONObjectLIZIZ.put("elapsed", this.j2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
                sbLIZ.append(((C1274830jHN) this.l0).LIZ.LJ);
                jSONObjectPut.put("account", C2188811AlT.LIZIZ(sbLIZ)).put("first_joined", ((C1274830jHN) this.l0).LJIIJ);
                if (((C1274830jHN) this.l0).LJJI != null) {
                    jSONObjectLIZIZ.put("api", "rtc_join_channel_success");
                }
                ((C1274830jHN) this.l0).LJJ(jSONObjectLIZIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public static final void run$0(ARunnableS2S0100200_20 aRunnableS2S0100200_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onLeaveChannelReturn$1");
        try {
            aRunnableS2S0100200_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onLeaveChannelReturn$1");
    }

    public static final void run$1(ARunnableS2S0100200_20 aRunnableS2S0100200_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onFirstLocalExternalVideoFrame$1");
        try {
            aRunnableS2S0100200_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onFirstLocalExternalVideoFrame$1");
    }

    public static final void run$2(ARunnableS2S0100200_20 aRunnableS2S0100200_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onJoinChannelSuccess$1");
        try {
            aRunnableS2S0100200_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onJoinChannelSuccess$1");
    }

    public ARunnableS2S0100200_20(C1274830jHN c1274830jHN, long j, long j2, int i) {
        this.$t = i;
        this.l0 = c1274830jHN;
        this.j1 = j;
        this.j2 = j2;
    }
}
