package X;

import Y.ARunnableS42S0110000_23;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oHY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467140oHY {
    public C1468180oJE LIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJFF;
    public ArrayList<String> LJI;
    public ArrayList<String> LJII;
    public long LJ = -2147483648L;
    public C1467130oHX LIZIZ = new C1467130oHX();

    public C1467140oHY(C1468180oJE c1468180oJE) {
        this.LIZ = c1468180oJE;
    }

    public final void LIZ(String str) {
        String strJ3;
        InterfaceC1468020oIy interfaceC1468020oIy;
        if (!this.LIZJ) {
            return;
        }
        this.LIZJ = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1467130oHX c1467130oHX = this.LIZIZ;
        long j = c1467130oHX.LJIIIIZZ;
        if (j > 0) {
            c1467130oHX.LJIIIZ = jCurrentTimeMillis - j;
        }
        c1467130oHX.LJIIZILJ = str;
        c1467130oHX.LJIILLIIL = 0;
        c1467130oHX.LJIIJJI = jCurrentTimeMillis;
        C1468180oJE c1468180oJE = this.LIZ;
        if (c1468180oJE != null && (interfaceC1468020oIy = c1468180oJE.LIZ) != null) {
            c1467130oHX.LJJIIJZLJL = ((C1467030oHN) interfaceC1468020oIy).LIZJ(113);
            C1467130oHX c1467130oHX2 = this.LIZIZ;
            if (c1467130oHX2.LIZ == 0) {
                c1467130oHX2.LJJIZ = ((C1467030oHN) this.LIZ.LIZ).LIZLLL(152);
                this.LIZIZ.LJJJ = ((C1467030oHN) this.LIZ.LIZ).LIZLLL(153);
                this.LIZIZ.LJJJI = ((C1467030oHN) this.LIZ.LIZ).LIZJ(154);
            }
        }
        C1467130oHX c1467130oHX3 = this.LIZIZ;
        HashMap map = new HashMap();
        map.put("st", Long.valueOf(c1467130oHX3.LJIIIIZZ));
        map.put("c", Long.valueOf(c1467130oHX3.LJIIIZ));
        map.put("reason", Integer.valueOf(c1467130oHX3.LIZIZ));
        try {
            strJ3 = C786410Ut5.J3(new JSONObject(map));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strJ3 = null;
        }
        if (!TextUtils.isEmpty(strJ3)) {
            int i = this.LIZIZ.LIZ;
            if (i == 0) {
                if (this.LJII == null) {
                    this.LJII = new ArrayList<>();
                }
                this.LJII.add(strJ3);
            } else if (i == 1) {
                if (this.LJI == null) {
                    this.LJI = new ArrayList<>();
                }
                this.LJI.add(strJ3);
            }
        }
        if (this.LIZIZ.LJIIIZ < 1000) {
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("VideoEventOneNoRender", "duration less than threshold, abort event");
        } else {
            this.LIZLLL++;
            this.LIZ.LJIILJJIL();
            final C1468180oJE c1468180oJE2 = this.LIZ;
            final C1467130oHX c1467130oHX4 = this.LIZIZ;
            EngineThreadPool.addExecuteTask(new Runnable(this, c1468180oJE2, c1467130oHX4) { // from class: X.0oJH
                public final C1467140oHY LL;
                public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
                public final C1468180oJE LLILLL;
                public final C1467130oHX LLILZ;

                public final void LIZ() {
                    C1467140oHY c1467140oHY = this.LL;
                    if (c1467140oHY == null) {
                        return;
                    }
                    C1468180oJE c1468180oJE3 = this.LLILLL;
                    boolean z = c1468180oJE3 != null && c1468180oJE3.LJJLIL;
                    C1467130oHX c1467130oHX5 = this.LLILZ;
                    HashMap map2 = new HashMap();
                    C799510VXx.LJ("event_type", "av_norender", map2);
                    if (c1468180oJE3 != null) {
                        C799510VXx.LJ("player_sessionid", c1468180oJE3.LJIILL, map2);
                        C799510VXx.LJ("sdk_version", c1468180oJE3.LJIIIIZZ, map2);
                    }
                    C799510VXx.LJ("r_stage_errcs", c1467130oHX5.LJIIJ, map2);
                    C799510VXx.LIZJ(c1467130oHX5.LIZJ, "video_len_before", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LIZLLL, "audio_len_before", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJ, "vlen_dec_before", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJFF, "alen_dec_before", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJI, "vlen_base_before", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJII, "alen_base_before", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJIIIZ, "cost_time", map2);
                    C799510VXx.LIZIZ(c1467140oHY.LIZLLL, "index", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LIZ, "norender_type", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LIZIZ, "reason", map2);
                    if (c1468180oJE3 != null) {
                        String str2 = c1468180oJE3.LJIJ;
                        if (str2 == null || str2.isEmpty()) {
                            C799510VXx.LJ("cdn_url", c1468180oJE3.LJIILLIIL, map2);
                        } else {
                            C799510VXx.LJ("cdn_url", c1468180oJE3.LJIJ, map2);
                        }
                        C799510VXx.LJ("source_type", c1468180oJE3.LJJII, map2);
                        C799510VXx.LJ("v", c1468180oJE3.LJJI, map2);
                        C799510VXx.LJ("vtype", c1468180oJE3.LJJIJLIJ, map2);
                        C799510VXx.LJ("tag", c1468180oJE3.LJJJIL, map2);
                        C799510VXx.LJ("subtag", c1468180oJE3.LJJJJ, map2);
                        C799510VXx.LJ("codec", c1468180oJE3.LJJIJ, map2);
                        C799510VXx.LIZIZ(c1468180oJE3.LJJIJIL, "video_codec_nameid", map2);
                        C799510VXx.LIZIZ(c1468180oJE3.LJJIJIIJIL, "audio_codec_nameid", map2);
                        C799510VXx.LIZIZ(c1468180oJE3.LJJIJL, "format_type", map2);
                        C799510VXx.LIZIZ(c1468180oJE3.LJJJJI, "drm_type", map2);
                        C799510VXx.LIZLLL("play_speed", c1468180oJE3.LJJJJJ, map2);
                        C799510VXx.LIZIZ(c1468180oJE3.LJJLIIJ, "enable_mdl", map2);
                        C799510VXx.LIZIZ(c1468180oJE3.LJJIII, "video_hw", map2);
                        C799510VXx.LIZIZ(c1468180oJE3.LJJIIJ, "user_hw", map2);
                    }
                    C799510VXx.LIZJ(c1467130oHX5.LJIIIIZZ, "st", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJIIJJI, "et", map2);
                    C799510VXx.LJ("end_type", c1467130oHX5.LJIIZILJ, map2);
                    C799510VXx.LJ("resolution_before", c1467130oHX5.LJIIL, map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJIJJ, "radio_mode", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJJIIJZLJL, "setvalidsurface_timeout", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJIJJLI, "last_av_switch_interval", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJIL, "last_res_switch_interval", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJJ, "headset", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJJI, "bt", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJJIFFI, "last_headset_switch_interval", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJJII, "is_background", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJJIII, "last_foreback_switch_interval", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJJIIJ, "last_setsurfacenull_interval", map2);
                    long j2 = c1467140oHY.LJ;
                    C799510VXx.LIZJ(j2 > 0 ? c1467130oHX5.LJIIIIZZ - j2 : -1L, "first_frame_interval", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJIILL, "begin_pos", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJIILLIIL, "end_pos", map2);
                    long j3 = c1467130oHX5.LJIILIIL;
                    if (j3 > 0) {
                        C799510VXx.LIZJ(c1467130oHX5.LJIIIIZZ - j3, "last_rebuf_interval", map2);
                    }
                    long j4 = c1467130oHX5.LJIILJJIL;
                    if (j4 > 0) {
                        C799510VXx.LIZJ(c1467130oHX5.LJIIIIZZ - j4, "last_seek_interval", map2);
                    }
                    C799510VXx.LIZIZ(c1467130oHX5.LJIJ, "is_abr", map2);
                    C799510VXx.LJ("quality_desc_before", c1467130oHX5.LJIJI, map2);
                    C799510VXx.LIZIZ(c1467140oHY.LJFF, "bad_interlaced", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJJIIZ, "enable_global_mute_feature", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJJIIZI, "global_mute", map2);
                    C799510VXx.LIZLLL("cpu_rate", (float) c1467130oHX5.LJJIJ, map2);
                    C799510VXx.LIZLLL("cpu_speed", (float) c1467130oHX5.LJJIJIIJI, map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJJIJIIJIL, "power_save_mode", map2);
                    C799510VXx.LIZLLL("battery_current", c1467130oHX5.LJJIJIL, map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJJIJL, "queue_input_buffer_in_start", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJJIZ, "queue_input_buffer_in_end", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJJIJLIJ, "dequeue_output_buffer_in_start", map2);
                    C799510VXx.LIZJ(c1467130oHX5.LJJJ, "dequeue_output_buffer_in_end", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJJIL, "mc_monitor_queue_in_start", map2);
                    C799510VXx.LIZIZ(c1467130oHX5.LJJJI, "mc_monitor_queue_in_end", map2);
                    C799510VXx.LIZIZ(0, "first_av_sync", map2);
                    C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS42S0110000_23(z, new JSONObject(map2), 5));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoEventOneNoRender$AsyncGetLogDataRunnable@b13c.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoEventOneNoRender$AsyncGetLogDataRunnable@b13c.run");
                }

                {
                    this.LL = this;
                    this.LLILLL = c1468180oJE2;
                    this.LLILZ = c1467130oHX4;
                }
            });
        }
        this.LIZIZ = new C1467130oHX();
    }
}
