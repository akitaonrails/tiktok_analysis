package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221871Bxh {
    public long LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public final C2221811Bxb LIZLLL;
    public boolean LJ = true;

    public final long LIZ() {
        long jUptimeMillis = this.LIZ > 0 ? SystemClock.uptimeMillis() - this.LIZ : 0L;
        this.LIZ = 0L;
        this.LIZIZ = false;
        return jUptimeMillis;
    }

    public C2221871Bxh(boolean z, C2221811Bxb c2221811Bxb) {
        this.LIZJ = z;
        this.LIZLLL = c2221811Bxb;
    }

    public final void LIZIZ(long j, String str, String str2, boolean z) {
        long j2;
        long j3;
        long jIntValue;
        long j4;
        long j5;
        long j6;
        long jLIZ = LIZ();
        int i = 0;
        if (this.LJ) {
            this.LJ = false;
            i = 1;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C486980J7w.LIZ("room_id", j, jSONObject);
        C486980J7w.LIZIZ("reason", str, jSONObject);
        C486980J7w.LIZIZ("push_server", str2, jSONObject);
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        C486980J7w.LIZ("has_interrupted", j2, jSONObject);
        if (this.LIZJ) {
            j3 = 1;
        } else {
            j3 = 0;
        }
        C486980J7w.LIZ("is_anchor", j3, jSONObject);
        Integer num = (Integer) DataChannelGlobal.LLILZ.gg0(C168P.class);
        if (num == null) {
            jIntValue = 0;
        } else {
            jIntValue = num.intValue();
        }
        C486980J7w.LIZ("room_count", jIntValue, jSONObject);
        if (jLIZ > 0) {
            j4 = 1;
        } else {
            j4 = 0;
        }
        C486980J7w.LIZ("is_connect", j4, jSONObject);
        C486980J7w.LIZ("duration", jLIZ, jSONObject);
        long j7 = i;
        C486980J7w.LIZ("is_first", j7, jSONObject);
        C486980J7w.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 2, jSONObject);
        C486980J7w.LIZ("duration", jLIZ, jSONObject3);
        C486980J7w.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 2L, jSONObject2);
        C486980J7w.LIZ("is_first", j7, jSONObject2);
        if (z) {
            j5 = 1;
        } else {
            j5 = 0;
        }
        C486980J7w.LIZ("has_interrupted", j5, jSONObject2);
        if (jLIZ > 0) {
            j6 = 1;
        } else {
            j6 = 0;
        }
        C486980J7w.LIZ("is_connect", j6, jSONObject2);
        this.LIZLLL.LIZIZ(jSONObject);
        this.LIZLLL.LIZJ(jSONObject2);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_ws_connect_status_all")) {
            C1CC2.LJI("ttlive_ws_connect_status_all", jSONObject2, jSONObject3, jSONObject);
        }
        C466380IQq c466380IQqLIZIZ = C466380IQq.LIZIZ();
        String str3 = EnumC1143310frF.Room.info;
        c466380IQqLIZIZ.getClass();
        C466380IQq.LJ(str3, jSONObject, "ttlive_ws_connect_status", 2);
    }

    public final void LIZJ(long j, int i, String str, String str2, HashMap<String, String> map, boolean z, boolean z2) {
        int i2;
        long j2;
        long j3;
        long j4;
        long j5;
        long jIntValue;
        long j6;
        long j7;
        long jIntValue2;
        long jLIZ = LIZ();
        if (this.LJ) {
            this.LJ = false;
            i2 = 1;
        } else {
            i2 = 0;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        long j8 = i2;
        C486980J7w.LIZ("is_first", j8, jSONObject);
        C486980J7w.LIZ("room_id", j, jSONObject);
        long j9 = i;
        C486980J7w.LIZ("error_code", j9, jSONObject);
        C486980J7w.LIZIZ("error_msg", str, jSONObject);
        C486980J7w.LIZIZ("push_server", str2, jSONObject);
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        C486980J7w.LIZ("is_suspend", j2, jSONObject);
        if (z2) {
            j3 = 1;
        } else {
            j3 = 0;
        }
        C486980J7w.LIZ("has_interrupted", j3, jSONObject);
        if (this.LIZJ) {
            j4 = 1;
        } else {
            j4 = 0;
        }
        C486980J7w.LIZ("is_anchor", j4, jSONObject);
        if (jLIZ > 0) {
            j5 = 1;
        } else {
            j5 = 0;
        }
        C486980J7w.LIZ("is_connect", j5, jSONObject);
        C486980J7w.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0, jSONObject);
        C486980J7w.LIZ("duration", jLIZ, jSONObject);
        if (map != null) {
            C486980J7w.LIZIZ("params", map.toString(), jSONObject);
        }
        Integer num = (Integer) DataChannelGlobal.LLILZ.gg0(C168P.class);
        if (num == null) {
            jIntValue = 0;
        } else {
            jIntValue = num.intValue();
        }
        C486980J7w.LIZ("room_count", jIntValue, jSONObject);
        this.LIZLLL.LIZIZ(jSONObject);
        this.LIZLLL.LIZJ(jSONObject2);
        long j10 = 1;
        C486980J7w.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1L, jSONObject2);
        if (jLIZ <= 0) {
            j10 = 0;
        }
        C486980J7w.LIZ("is_connect", j10, jSONObject2);
        C486980J7w.LIZ("error_code", j9, jSONObject2);
        C486980J7w.LIZIZ("error_msg", str, jSONObject2);
        C486980J7w.LIZ("is_first", j8, jSONObject2);
        if (z) {
            j6 = 1;
        } else {
            j6 = 0;
        }
        C486980J7w.LIZ("is_suspend", j6, jSONObject2);
        if (z2) {
            j7 = 1;
        } else {
            j7 = 0;
        }
        C486980J7w.LIZ("has_interrupted", j7, jSONObject2);
        if (num == null) {
            jIntValue2 = 0;
        } else {
            jIntValue2 = num.intValue();
        }
        C486980J7w.LIZ("room_count", jIntValue2, jSONObject3);
        C486980J7w.LIZ("duration", jLIZ, jSONObject3);
        LiveMonitorSampleSetting liveMonitorSampleSetting = LiveMonitorSampleSetting.INSTANCE;
        if (liveMonitorSampleSetting.isReportSlardar("ttlive_ws_connect_status_all")) {
            C1CC2.LJI("ttlive_ws_connect_status_all", jSONObject2, jSONObject3, jSONObject);
        }
        if (liveMonitorSampleSetting.isReportDolphin("ttlive_ws_connect_status_error", 0.2d)) {
            C1CC2.LJI("ttlive_ws_connect_status_error", jSONObject2, jSONObject3, jSONObject);
        }
        C466380IQq c466380IQqLIZIZ = C466380IQq.LIZIZ();
        String str3 = EnumC1143310frF.Room.info;
        c466380IQqLIZIZ.getClass();
        C466380IQq.LJ(str3, jSONObject, "ttlive_ws_connect_status", 1);
    }
}
