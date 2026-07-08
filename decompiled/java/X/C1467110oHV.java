package X;

import Y.ARunnableS42S0110000_23;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oHV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467110oHV {
    public C1468180oJE LIZ;
    public ArrayList<String> LIZJ = new ArrayList<>();
    public int LIZLLL = 0;
    public int LJ = 0;
    public long LJFF = -2147483648L;
    public long LJI = -2147483648L;
    public long LJII = -2147483648L;
    public long LJIIIIZZ = -2147483648L;
    public int LJIIIZ = 0;
    public C1467100oHU LIZIZ = new C1467100oHU();

    public final void LIZIZ() {
        C1468180oJE c1468180oJE = this.LIZ;
        if (c1468180oJE == null || c1468180oJE.LIZ == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("begin_pos", Integer.valueOf(this.LIZIZ.LJIIZILJ));
        map.put("end_pos", Integer.valueOf(this.LIZIZ.LJIJ));
        map.put("render_drop_cnt", Integer.valueOf(this.LIZIZ.LIZLLL));
        map.put("container_fps", Float.valueOf(((C1467030oHN) this.LIZ.LIZ).LIZIZ(82)));
        map.put("video_out_fps", Float.valueOf(((C1467030oHN) this.LIZ.LIZ).LIZIZ(83)));
        map.put("clock_diff", Long.valueOf(((C1467030oHN) this.LIZ.LIZ).LIZLLL(45)));
        map.put("decode_time", Long.valueOf(((C1467030oHN) this.LIZ.LIZ).LIZJ(84) > 0 ? LSPassThroughRecordSizeConfig.DEFAULT / r1 : 0L));
        ((C1467030oHN) this.LIZ.LIZ).LJFF(4, map);
    }

    public C1467110oHV(C1468180oJE c1468180oJE) {
        this.LIZ = c1468180oJE;
    }

    public final void LIZ(int i, String str) {
        if (this.LIZIZ.LIZ <= 0) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid start time, return.");
            sbLIZ.append(this.LIZIZ.LIZ);
            TTVideoEngineLog.w("VideoEventOneOutSync", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1467100oHU c1467100oHU = this.LIZIZ;
        long j = jCurrentTimeMillis - c1467100oHU.LIZ;
        if (j <= 200) {
            LIZIZ();
            this.LIZIZ = new C1467100oHU();
            return;
        }
        c1467100oHU.LJIJJ = str;
        c1467100oHU.LJIJ = i;
        c1467100oHU.LIZIZ = jCurrentTimeMillis;
        c1467100oHU.LJIJI = j;
        this.LJ++;
        this.LIZLLL++;
        C1468180oJE c1468180oJE = this.LIZ;
        if (c1468180oJE != null) {
            c1467100oHU.LJIIJJI = c1468180oJE.LJJJ;
            c1467100oHU.LJIILIIL = c1468180oJE.LJJJI;
            c1467100oHU.LJJ = c1468180oJE.LJJJZ;
            InterfaceC1468020oIy interfaceC1468020oIy = c1468180oJE.LIZ;
            if (interfaceC1468020oIy != null) {
                c1467100oHU.LIZLLL = ((C1467030oHN) interfaceC1468020oIy).LIZJ(79);
                if (TTVideoEngine.LJIIL == 0) {
                    this.LIZIZ.LIZJ = ((C1467030oHN) this.LIZ.LIZ).LJ(78);
                    this.LIZIZ.LJIILJJIL = ((C1467030oHN) this.LIZ.LIZ).LJ(80);
                }
                this.LIZIZ.LJJIJ = ((C1467030oHN) this.LIZ.LIZ).LIZLLL(96);
            }
        }
        HashMap map = new HashMap();
        map.put("ps", Integer.valueOf(this.LIZIZ.LJIIZILJ));
        map.put("pe", Integer.valueOf(this.LIZIZ.LJIJ));
        map.put("st", Long.valueOf(this.LIZIZ.LIZ));
        map.put("c", Long.valueOf(this.LIZIZ.LJIJI));
        this.LIZJ.add(C786410Ut5.J3(new JSONObject(map)));
        int i3 = C2187451AjH.LIZ;
        C1471660oOq.LIZJ("VideoEventOneOutSync", "report oussync event");
        this.LIZ.LJIILJJIL();
        final C1468180oJE c1468180oJE2 = this.LIZ;
        final C1467100oHU c1467100oHU2 = this.LIZIZ;
        EngineThreadPool.addExecuteTask(new Runnable(this, c1468180oJE2, c1467100oHU2) { // from class: X.0oJG
            public final C1467110oHV LL;
            public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
            public final C1468180oJE LLILLL;
            public final C1467100oHU LLILZ;

            public final void LIZ() {
                C1467110oHV c1467110oHV = this.LL;
                if (c1467110oHV == null) {
                    return;
                }
                C1468180oJE c1468180oJE3 = this.LLILLL;
                boolean z = c1468180oJE3 != null && c1468180oJE3.LJJLIL;
                C1467100oHU c1467100oHU3 = this.LLILZ;
                HashMap map2 = new HashMap();
                if (c1468180oJE3 != null) {
                    C799510VXx.LJ("player_sessionid", c1467110oHV.LIZ.LJIILL, map2);
                    String str2 = c1468180oJE3.LJIJ;
                    if (str2 == null || str2.isEmpty()) {
                        C799510VXx.LJ("cdn_url", c1468180oJE3.LJIILLIIL, map2);
                    } else {
                        C799510VXx.LJ("cdn_url", c1468180oJE3.LJIJ, map2);
                    }
                    String str3 = c1468180oJE3.LJIJI;
                    if (str3 == null || str3.isEmpty()) {
                        C799510VXx.LJ("cdn_ip", c1468180oJE3.LJIIZILJ, map2);
                    } else {
                        C799510VXx.LJ("cdn_ip", c1468180oJE3.LJIJI, map2);
                    }
                    C799510VXx.LJ("source_type", c1468180oJE3.LJJII, map2);
                    C799510VXx.LJ("v", c1468180oJE3.LJJI, map2);
                    C799510VXx.LJ("pv", c1468180oJE3.LJ, map2);
                    C799510VXx.LJ("pc", c1468180oJE3.LJFF, map2);
                    C799510VXx.LJ("sv", c1468180oJE3.LJI, map2);
                    C799510VXx.LJ("sdk_version", c1468180oJE3.LJIIIIZZ, map2);
                    C799510VXx.LJ("vtype", c1468180oJE3.LJJIJLIJ, map2);
                    C799510VXx.LJ("tag", c1468180oJE3.LJJJIL, map2);
                    C799510VXx.LJ("subtag", c1468180oJE3.LJJJJ, map2);
                    C799510VXx.LIZIZ(Integer.MIN_VALUE, "p2p_cdn_type", map2);
                    C799510VXx.LJ("codec", c1468180oJE3.LJJIJ, map2);
                    C799510VXx.LIZIZ(c1468180oJE3.LJJIJIL, "video_codec_nameid", map2);
                    C799510VXx.LIZIZ(c1468180oJE3.LJJIJIIJIL, "audio_codec_nameid", map2);
                    C799510VXx.LIZIZ(c1468180oJE3.LJJIJL, "format_type", map2);
                    C799510VXx.LIZIZ(c1468180oJE3.LJJJJI, "drm_type", map2);
                    C799510VXx.LIZLLL("play_speed", c1468180oJE3.LJJJJJ, map2);
                    C799510VXx.LJ("net_type", c1468180oJE3.LJJJJZI, map2);
                    C799510VXx.LJ("mdl_version", c1468180oJE3.LJJJLL, map2);
                    C799510VXx.LIZIZ(c1468180oJE3.LJJLIIJ, "enable_mdl", map2);
                    C799510VXx.LIZIZ(c1468180oJE3.LJJIII, "video_hw", map2);
                    C799510VXx.LIZIZ(c1468180oJE3.LJJIIJ, "user_hw", map2);
                }
                C799510VXx.LJ("event_type", "av_outsync", map2);
                C799510VXx.LIZJ(c1467100oHU3.LIZ, "st", map2);
                C799510VXx.LIZJ(c1467100oHU3.LIZIZ, "et", map2);
                C799510VXx.LIZJ(c1467100oHU3.LJIJI, "cost_time", map2);
                C799510VXx.LJ("end_type", c1467100oHU3.LJIJJ, map2);
                C799510VXx.LIZJ(c1467100oHU3.LJ, "audio_len_before", map2);
                C799510VXx.LIZJ(c1467100oHU3.LJFF, "video_len_before", map2);
                C799510VXx.LIZJ(c1467100oHU3.LJI, "alen_dec_before", map2);
                C799510VXx.LIZJ(c1467100oHU3.LJII, "vlen_dec_before", map2);
                C799510VXx.LIZJ(c1467100oHU3.LJIIIIZZ, "alen_base_before", map2);
                C799510VXx.LIZJ(c1467100oHU3.LJIIIZ, "vlen_base_before", map2);
                C799510VXx.LJ("resolution_before", c1467100oHU3.LJIIJ, map2);
                C799510VXx.LJ("resolution_after", c1467100oHU3.LJIIJJI, map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJIIL, "bitrate_before", map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJIILIIL, "bitrate_after", map2);
                C799510VXx.LIZIZ(c1467110oHV.LJ, "index", map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJJI, "radio_mode", map2);
                C799510VXx.LIZJ(c1467100oHU3.LJJIFFI, "last_av_switch_interval", map2);
                C799510VXx.LIZJ(c1467100oHU3.LJJII, "last_res_switch_interval", map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJJIII, "headset", map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJJIIJ, "bt", map2);
                C799510VXx.LIZJ(c1467100oHU3.LJJIIJZLJL, "last_headset_switch_interval", map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJJIIZ, "power", map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJJIIZI, "is_charging", map2);
                C799510VXx.LIZJ(c1467100oHU3.LJJIJ, "max_av_diff", map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJJIJIIJI, "is_background", map2);
                C799510VXx.LIZJ(c1467100oHU3.LJJIJIIJIL, "last_foreback_switch_interval", map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJJJ, "last_decoder_dc", map2);
                long j2 = c1467110oHV.LJFF;
                C799510VXx.LIZJ(j2 > 0 ? c1467100oHU3.LIZ - j2 : -1L, "first_frame_interval", map2);
                long j3 = c1467110oHV.LJI;
                C799510VXx.LIZJ(j3 > 0 ? c1467100oHU3.LIZ - j3 : -1L, "last_event_interval", map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJIIZILJ, "begin_pos", map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJIJ, "end_pos", map2);
                C799510VXx.LIZIZ(c1467100oHU3.LIZLLL, "drop_cnt", map2);
                long j4 = c1467100oHU3.LJIILL;
                if (j4 > 0) {
                    C799510VXx.LIZJ(c1467100oHU3.LIZ - j4, "last_rebuf_interval", map2);
                }
                long j5 = c1467100oHU3.LJIILLIIL;
                if (j5 > 0) {
                    C799510VXx.LIZJ(c1467100oHU3.LIZ - j5, "last_seek_interval", map2);
                }
                C799510VXx.LIZIZ(c1467100oHU3.LJIJJLI, "is_abr", map2);
                C799510VXx.LJ("quality_desc_before", c1467100oHU3.LJIL, map2);
                C799510VXx.LJ("quality_desc_after", c1467100oHU3.LJJ, map2);
                C799510VXx.LIZIZ(c1467110oHV.LJIIIZ, "bad_interlaced", map2);
                C799510VXx.LIZJ(c1467110oHV.LJII, "v_duration", map2);
                C799510VXx.LIZJ(c1467110oHV.LJIIIIZZ, "a_duration", map2);
                C799510VXx.LIZLLL("cpu_rate", (float) c1467100oHU3.LJJIJL, map2);
                C799510VXx.LIZLLL("cpu_speed", (float) c1467100oHU3.LJJIJLIJ, map2);
                C799510VXx.LIZIZ(c1467100oHU3.LJJIL, "power_save_mode", map2);
                C799510VXx.LIZLLL("battery_current", c1467100oHU3.LJJIZ, map2);
                C799510VXx.LIZIZ(0, "first_av_sync", map2);
                if (TTVideoEngine.LJIIL == 0) {
                    C799510VXx.LJ("v_dec_fps_list", c1467100oHU3.LJIILJJIL, map2);
                    C799510VXx.LJ("pts_list", c1467100oHU3.LIZJ, map2);
                    C799510VXx.LJFF("pause_time_list", c1467100oHU3.LJJIJIL, map2);
                }
                JSONObject jSONObject = new JSONObject(map2);
                BPEAHandler bPEAHandler = this.LLILLJJLI;
                if (bPEAHandler == null || bPEAHandler.getLooper() == null) {
                    C0WPS.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
                } else {
                    C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS42S0110000_23(z, jSONObject, 7));
                    this.LL.LJI = this.LLILZ.LIZIZ;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoEventOneOutSync$AsyncGetLogDataRunnable@6d48.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoEventOneOutSync$AsyncGetLogDataRunnable@6d48.run");
            }

            {
                this.LL = this;
                this.LLILLL = c1468180oJE2;
                this.LLILZ = c1467100oHU2;
            }
        });
        LIZIZ();
        this.LIZIZ = new C1467100oHU();
    }
}
