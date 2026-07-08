package X;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0IE8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IE8 extends C0K04 {
    public long LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public int LIZLLL;
    public C0IFR LJ;
    public final Map<String, Long> LJFF = new HashMap();
    public final Map<String, Long> LJI = new HashMap(6);

    public final void LJIILLIIL() {
        this.LIZLLL = 2;
        C0IFR c0ifr = this.LJ;
        if (c0ifr != null) {
            LJIIL(c0ifr.LIZ, c0ifr.LIZIZ, c0ifr.LIZLLL, c0ifr.LIZJ, c0ifr.LJ);
            this.LJ = null;
        }
    }

    public static Pair LJIIJJI() {
        w.LIZ.getClass();
        return new Pair(w.LJIIIZ(), w.LJIIL());
    }

    public final long LJIIJ() {
        long jUptimeMillis = this.LIZ > 0 ? SystemClock.uptimeMillis() - this.LIZ : 0L;
        this.LIZ = 0L;
        return jUptimeMillis;
    }

    public final void LJIILJJIL() {
        if (SlardarSampleSetting.INSTANCE.isReport("ttlive_audience_enter_room_full_new_api_all", 0.0d)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("n_time_start_room", LJIIZILJ("n_time_start_room"));
                jSONObject.put("n_time_api_start", LJIIZILJ("n_time_api_start"));
                jSONObject.put("n_time_api_finish", LJIIZILJ("n_time_api_finish"));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            long jLJIIZILJ = LJIIZILJ("n_time_api_finish") - LJIIZILJ("n_time_api_start");
            if (jLJIIZILJ < 0) {
                jLJIIZILJ = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("room enter api duration = ");
            sbLIZ.append(jLJIIZILJ);
            C827750WdZ.LIZ("LivePlayerMonitor", C2188811AlT.LIZIZ(sbLIZ));
            C1CC3 c1cc3 = C1CC2.LIZ;
            if (c1cc3 != null) {
                c1cc3.LJIJJLI(jLJIIZILJ, "ttlive_audience_enter_room_full_new_api_all", jSONObject);
            }
        }
    }

    public final void LJIILL(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((HashMap) this.LJFF).put(str, Long.valueOf(jCurrentTimeMillis));
    }

    public final long LJIIZILJ(String str) {
        Long l = (Long) ((HashMap) this.LJFF).get(str);
        if (l == null || l.longValue() <= 0) {
            return 0L;
        }
        return l.longValue();
    }

    public final void LJIILIIL(long j, String str) {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        long jLJIIJ = LJIIJ();
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("enter_room_type", "other", jSONObject);
        C0K04.LJ("room_id", j, jSONObject);
        C0K04.LJFF("pull_url", str, jSONObject);
        Pair pairLJIIJJI = LJIIJJI();
        C0K04.LJFF("enter_from_merge", (String) pairLJIIJJI.first, jSONObject);
        C0K04.LJFF("enter_method", (String) pairLJIIJJI.second, jSONObject);
        SlardarSampleSetting slardarSampleSetting = SlardarSampleSetting.INSTANCE;
        if (slardarSampleSetting.isReport("ttlive_audience_enter_room_all", 0.0d)) {
            C1CC2.LJIIJ(0, jLJIIJ, "ttlive_audience_enter_room_all", jSONObject);
        }
        if (slardarSampleSetting.isReport("ttlive_audience_minor_enter_room_all", 0.0d) && UserService.getInstance().user().LJIILJJIL()) {
            C1CC2.LJIIJ(0, jLJIIJ, "ttlive_audience_minor_enter_room_all", jSONObject);
        }
    }

    public final void LJIIL(int i, String str, String str2, long j, String str3) {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        LJIIJ();
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("enter_room_type", "other", jSONObject);
        C0K04.LJFF("room_type", str2, jSONObject);
        C0K04.LIZLLL(i, "error_code", jSONObject);
        C0K04.LJFF("error_msg", str, jSONObject);
        C0K04.LJ("room_id", j, jSONObject);
        C0K04.LJFF("pull_url", str3, jSONObject);
        Pair pairLJIIJJI = LJIIJJI();
        C0K04.LJFF("enter_from_merge", (String) pairLJIIJJI.first, jSONObject);
        C0K04.LJFF("enter_method", (String) pairLJIIJJI.second, jSONObject);
        SlardarSampleSetting slardarSampleSetting = SlardarSampleSetting.INSTANCE;
        if (slardarSampleSetting.isReport("ttlive_audience_enter_room_all", 0.0d)) {
            C1CC2.LJIIL(1, "ttlive_audience_enter_room_all", jSONObject);
        }
        if (slardarSampleSetting.isReport("ttlive_audience_enter_room_error", 0.0d)) {
            C1CC2.LJIILL(1, 1, "ttlive_audience_enter_room_error", jSONObject);
        }
        C466380IQq c466380IQqLIZIZ = C466380IQq.LIZIZ();
        String str4 = EnumC1143310frF.Room.info;
        c466380IQqLIZIZ.getClass();
        C466380IQq.LJ(str4, jSONObject, "ttlive_audience_enter_room", 1);
        if (UserService.getInstance().user().LJIILJJIL()) {
            if (slardarSampleSetting.isReport("ttlive_audience_minor_enter_room_all", 0.0d)) {
                C1CC2.LJIIL(1, "ttlive_audience_minor_enter_room_all", jSONObject);
            }
            C1CC2.LJIIIIZZ("ttlive_audience_minor_enter_room_error", 1, jSONObject);
        }
    }
}
