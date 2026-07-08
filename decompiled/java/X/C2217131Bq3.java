package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217131Bq3 {
    public final C0LAB LIZ;
    public final Map<String, String> LIZIZ;
    public Effect LIZJ;
    public volatile boolean LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public JSONObject LJIIIZ;

    public final void LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJFF = jCurrentTimeMillis;
        this.LJI = jCurrentTimeMillis;
        this.LJII = jCurrentTimeMillis;
        this.LJ = jCurrentTimeMillis;
    }

    public final void LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJII;
        this.LJII = jCurrentTimeMillis;
        this.LIZ.LIZIZ(jCurrentTimeMillis, "first_packet_cost");
    }

    public final void LJ() {
        this.LIZ.LIZIZ(System.currentTimeMillis() - this.LJFF, "audiosdk_vcserver_duration");
    }

    public final void LJFF() {
        this.LIZ.LIZIZ(System.currentTimeMillis() - this.LJ, "audiosdk_vc_duration");
    }

    public final void LJI() {
        this.LIZ.LIZIZ(System.currentTimeMillis() - this.LJI, "audiosdk_websocket_duration");
    }

    public C2217131Bq3(ShortVideoContext shortVideoContext) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("content_source", shortVideoContext.LJ().getContentSource());
        c0lab.LJ("content_type", shortVideoContext.LJ().getContentType());
        this.LIZ = c0lab;
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIZ = new JSONObject();
    }

    public final void LIZ(int i) {
        String str;
        if (this.LIZLLL) {
            return;
        }
        this.LIZ.LIZ(i, "calling_event_index");
        C0LAB c0lab = this.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "undefined";
                } else {
                    str = "shoot_vc";
                }
            } else {
                str = "preview_record";
            }
        } else {
            str = "preview_play";
        }
        c0lab.LJ("debug_vc_scene", str);
    }

    public final void LIZJ(String str) {
        if (!this.LIZLLL && !C123100dR.LIZ((String) ((LinkedHashMap) this.LIZIZ).get("task_id"))) {
            this.LIZIZ.put("task_id", str);
        }
    }

    public final void LJII(String str, String str2, boolean z) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        C0LAB c0lab = this.LIZ;
        if (z) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("error_code", str);
        c0lab.LJ("error_msg", str2);
        c0lab.LJ("effect_name", this.LIZJ.getName());
        c0lab.LJ("speaker_id", C1664460tPo.LJIIIIZZ(this.LIZJ));
        c0lab.LIZIZ(this.LJIIIZ.optLong("vc_connect_server_cost", -1L), "vc_connect_server_cost");
        c0lab.LIZIZ(this.LJIIIZ.optLong("vc_play_delay", -1L), "vc_play_delay");
        c0lab.LIZIZ(this.LJIIIZ.optLong("vc_play_latency", -1L), "vc_play_latency");
        c0lab.LIZIZ(this.LJIIIZ.optLong("vc_play_latency_delay", -1L), "vc_play_latency_delay");
        c0lab.LIZIZ(this.LJIIIZ.optLong("vc_play_latency_delay_max", -1L), "vc_play_latency_delay_max");
        c0lab.LIZIZ(this.LJIIIZ.optLong("net_error_code", -1L), "net_error_code");
        c0lab.LJ("net_error_msg", this.LJIIIZ.optString("net_error_msg", ""));
        c0lab.LIZIZ(this.LJIIIIZZ, "send_data_length");
        C1663660tOW.LIZ.getClass();
        c0lab.LJ("voice_play_type", C1663660tOW.LIZ());
        if (!c0lab.LIZ.containsKey("is_change_vc")) {
            c0lab.LIZ(0, "is_change_vc");
        }
        if (!c0lab.LIZ.containsKey("is_force_stop")) {
            c0lab.LIZ(0, "is_force_stop");
        }
        if (!c0lab.LIZ.containsKey("calling_event_index")) {
            c0lab.LIZ(-1, "calling_event_index");
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
            c0lab.LJ((String) entry.getKey(), (String) entry.getValue());
        }
        C20684815ws.LJIILLIIL("audio_vc_stream_event", c0lab.LIZ);
        try {
            JSONObject jSONObject = new JSONObject();
            Map<String, String> map = c0lab.LIZ;
            if (map != null) {
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    jSONObject.put(entry2.getKey(), entry2.getValue());
                }
            }
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("creative_tool_stream_vc_preview", 0, jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
