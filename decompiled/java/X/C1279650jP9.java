package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jP9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279650jP9 {
    public C1279660jPA LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final boolean LJFF() {
        C1279660jPA c1279660jPA = this.LIZ;
        return c1279660jPA != null && c1279660jPA.LIZIZ > 0;
    }

    public final void LIZ(JSONObject jSONObject) {
        C1279660jPA c1279660jPA;
        if (jSONObject.has("event_key") && jSONObject.optString("event_key").equals("playing") && (c1279660jPA = this.LIZ) != null && c1279660jPA.LIZJ > 0) {
            try {
                if (!TextUtils.isEmpty(c1279660jPA.LIZ)) {
                    jSONObject.put("live_stream_session_id", this.LIZ.LIZ);
                }
                long jCurrentTimeMillis = this.LIZJ;
                if (jCurrentTimeMillis <= 0) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                long j = jCurrentTimeMillis - this.LIZ.LIZLLL;
                jSONObject.put("play_time", j).put("new_video_render_stall_time", j).put("new_video_render_stall_count", 1).put("new_video_demux_stall_time", j).put("new_video_demux_stall_count", 1).put("new_video_decode_stall_time", j).put("new_video_decode_stall_count", 1).put("new_audio_render_stall_time", j).put("new_audio_render_stall_count", 1).put("download_speed", 0).put("render_fps", 0).put("play_real_bitrate", 0);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1698940uJQ.LIZIZ();
            }
        }
    }

    public final void LIZIZ(JSONObject jSONObject) {
        if (!jSONObject.has("event_key") || !TextUtils.equals(jSONObject.optString("event_key"), "first_frame") || !LJFF()) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.LIZ.LIZ)) {
                jSONObject.put("live_stream_session_id", this.LIZ.LIZ);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1698940uJQ.LIZIZ();
        }
    }

    public final void LIZJ(JSONObject jSONObject) {
        int i;
        if (!jSONObject.has("event_key") || !TextUtils.equals(jSONObject.optString("event_key"), "play_stop") || !LJFF()) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.LIZ.LIZ)) {
                jSONObject.put("live_stream_session_id", this.LIZ.LIZ);
            }
            if (this.LIZ.LIZIZ > 0) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_low_latency_used", i);
            jSONObject.put("start", this.LIZ.LIZIZ);
            if (this.LIZJ <= 0 && this.LIZ.LIZJ <= 0) {
                jSONObject.put("is_stream_received", 0);
                jSONObject.put("first_frame_render_end", 0);
                return;
            }
            jSONObject.put("is_stream_received", 1);
            long j = this.LIZ.LIZJ;
            if (j <= 0) {
                j = this.LIZJ;
            }
            jSONObject.put("first_frame_render_end", j);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1698940uJQ.LIZIZ();
        }
    }

    public final void LIZLLL(JSONObject jSONObject) {
        int i;
        if (!jSONObject.has("event_key") || !TextUtils.equals(jSONObject.optString("event_key"), "player_switch") || !LJFF()) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.LIZ.LIZ)) {
                jSONObject.put("live_stream_session_id", this.LIZ.LIZ);
            }
            JSONObject jSONObjectPut = jSONObject.put("switch_direction", "low_to_normal");
            if (this.LIZJ > 0) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObjectPut.put("new_player_render_success", i).put("stop_to_play_cost", this.LIZIZ - this.LIZ.LIZLLL).put("start", this.LIZIZ);
            long j = this.LIZJ;
            if (j > 0) {
                jSONObject.put("play_to_first_render_cost", j - this.LIZIZ);
                jSONObject.put("play_to_first_frame_fail_cost", -1);
            } else {
                jSONObject.put("play_to_first_frame_fail_cost", System.currentTimeMillis() - this.LIZIZ);
                jSONObject.put("play_to_first_render_cost", -1);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1698940uJQ.LIZIZ();
        }
        this.LIZLLL = true;
    }

    public final void LJ(JSONObject jSONObject) {
        if (!jSONObject.has("event_key") || !TextUtils.equals(jSONObject.optString("event_key"), "playing") || !LJFF()) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.LIZ.LIZ)) {
                jSONObject.put("live_stream_session_id", this.LIZ.LIZ);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1698940uJQ.LIZIZ();
        }
    }
}
