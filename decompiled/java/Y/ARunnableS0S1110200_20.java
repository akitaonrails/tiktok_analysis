package Y;

import X.C1274830jHN;
import X.C1C7U;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S1110200_20 implements Runnable {
    public final int $t;
    public long j3;
    public long j4;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        JSONObject jSONObjectLIZIZ;
        C1274830jHN c1274830jHN = (C1274830jHN) this.l1;
        if (c1274830jHN.LJJI != null) {
            jSONObjectLIZIZ = c1274830jHN.LIZIZ(this.j3, "rtc_engine_api_callback");
        } else {
            jSONObjectLIZIZ = c1274830jHN.LIZIZ(this.j3, this.z2 ? "rtc_first_remote_audio" : "rtc_first_remote_video");
        }
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            ConcurrentHashMap<String, Boolean> concurrentHashMap = this.z2 ? ((C1274830jHN) this.l1).LJIIIIZZ : ((C1274830jHN) this.l1).LJIIIZ;
            Boolean bool = Boolean.TRUE;
            if (concurrentHashMap.containsKey(this.s0)) {
                bool = concurrentHashMap.get(this.s0);
            }
            jSONObjectLIZIZ.put("remote_rtc_user_id", this.s0).put("elapsed", this.j4).put("first_joined", bool);
            if (((C1274830jHN) this.l1).LJJI != null) {
                jSONObjectLIZIZ.put("api", this.z2 ? "rtc_first_remote_audio" : "rtc_first_remote_video");
            }
            concurrentHashMap.put(this.s0, Boolean.FALSE);
            ((C1274830jHN) this.l1).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public final void LIZ$1() {
        JSONObject jSONObjectLIZIZ;
        C1274830jHN c1274830jHN = (C1274830jHN) this.l1;
        if (c1274830jHN.LJJI != null) {
            jSONObjectLIZIZ = c1274830jHN.LIZIZ(this.j3, "rtc_engine_api_callback");
        } else {
            jSONObjectLIZIZ = c1274830jHN.LIZIZ(this.j3, this.z2 ? "rtc_remote_user_joined" : "rtc_remote_user_offline");
        }
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("remote_rtc_user_id", this.s0).put("elapsed", this.j4);
            if (((C1274830jHN) this.l1).LJJI != null) {
                jSONObjectLIZIZ.put("api", this.z2 ? "rtc_remote_user_joined" : "rtc_remote_user_offline");
            }
            ((C1274830jHN) this.l1).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public static final void run$0(ARunnableS0S1110200_20 aRunnableS0S1110200_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onFirstRemoteFrame$1");
        try {
            aRunnableS0S1110200_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onFirstRemoteFrame$1");
    }

    public static final void run$1(ARunnableS0S1110200_20 aRunnableS0S1110200_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onRemoteUserOnlineOffline$1");
        try {
            aRunnableS0S1110200_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onRemoteUserOnlineOffline$1");
    }

    public ARunnableS0S1110200_20(C1274830jHN c1274830jHN, long j, boolean z, String str, long j2, int i) {
        this.$t = i;
        this.l1 = c1274830jHN;
        this.j3 = j;
        this.z2 = z;
        this.s0 = str;
        this.j4 = j2;
    }
}
