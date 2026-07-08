package X;

import Y.ARunnableS42S0110000_23;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468230oJJ {
    public C1468180oJE LIZ;
    public long LJFF;
    public boolean LJII;
    public long LIZLLL = -2147483648L;
    public long LJ = -2147483648L;
    public ArrayList<String> LJI = new ArrayList<>();
    public HashMap LIZIZ = new HashMap();
    public C1468340oJU LIZJ = new C1468340oJU();

    public final long LIZIZ() {
        if (this.LIZJ.LJFF > 0) {
            return 0L;
        }
        synchronized (this.LIZIZ) {
            try {
                if (!this.LIZIZ.containsKey("seek")) {
                    return -1L;
                }
                return ((Long) this.LIZIZ.get("seek")).longValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ() {
        synchronized (this.LIZIZ) {
            try {
                this.LIZIZ = new HashMap();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJFF = 0L;
        this.LJI = new ArrayList<>();
    }

    public C1468230oJJ(C1468180oJE c1468180oJE) {
        this.LIZ = c1468180oJE;
    }

    public final void LIZ(int i, String str) {
        InterfaceC1468020oIy interfaceC1468020oIy;
        String[] strArrSplit;
        C1468340oJU c1468340oJU = this.LIZJ;
        if (c1468340oJU.LJFF > 0 && !c1468340oJU.LIZ.isEmpty()) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("endSeek, from ");
            sbLIZ.append(this.LIZJ.LIZIZ);
            sbLIZ.append(" to ");
            sbLIZ.append(this.LIZJ.LIZJ);
            TTVideoEngineLog.d("VideoEventOneOpera", C2188811AlT.LIZIZ(sbLIZ));
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1468340oJU c1468340oJU2 = this.LIZJ;
            c1468340oJU2.LJI = jCurrentTimeMillis;
            long j = jCurrentTimeMillis - c1468340oJU2.LJFF;
            c1468340oJU2.LIZLLL = j;
            if (j > 0) {
                this.LJFF += j;
            }
            c1468340oJU2.LJ = str;
            c1468340oJU2.LJIIIIZZ = i;
            C1468180oJE c1468180oJE = this.LIZ;
            if (c1468180oJE != null && (interfaceC1468020oIy = c1468180oJE.LIZ) != null) {
                String strLJ = ((C1467030oHN) interfaceC1468020oIy).LJ(151);
                HashMap map = new HashMap();
                if (!TextUtils.isEmpty(strLJ) && (strArrSplit = strLJ.split(";|=")) != null && strArrSplit.length != 0) {
                    for (int i3 = 0; i3 < strArrSplit.length - 1; i3 += 2) {
                        try {
                            map.put(strArrSplit[i3], Long.valueOf(CastLongProtector.parseLong(strArrSplit[i3 + 1])));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                if (map.get("s_looper_t") != null) {
                    this.LIZJ.LJJ = ((Long) map.get("s_looper_t")).longValue();
                }
                if (map.get("s_operate_t") != null) {
                    this.LIZJ.LJJI = ((Long) map.get("s_operate_t")).longValue();
                }
                if (map.get("s_exe_begin_t") != null) {
                    this.LIZJ.LJJIFFI = ((Long) map.get("s_exe_begin_t")).longValue();
                }
                if (map.get("s_avformat_seek_t") != null) {
                    this.LIZJ.LJJII = ((Long) map.get("s_avformat_seek_t")).longValue();
                }
                if (map.get("s_c_complete_t") != null) {
                    this.LIZJ.LJJIII = ((Long) map.get("s_c_complete_t")).longValue();
                }
                if (map.get("s_re_f_packet_t") != null) {
                    this.LIZJ.LJJIIJ = ((Long) map.get("s_re_f_packet_t")).longValue();
                }
                if (map.get("s_de_f_audiopacket_t") != null) {
                    this.LIZJ.LJJIIJZLJL = ((Long) map.get("s_de_f_audiopacket_t")).longValue();
                }
                if (map.get("s_de_f_audioframe_t") != null) {
                    this.LIZJ.LJJIIZ = ((Long) map.get("s_de_f_audioframe_t")).longValue();
                }
                if (map.get("s_render_f_t") != null) {
                    this.LIZJ.LJJIIZI = ((Long) map.get("s_render_f_t")).longValue();
                }
                C1468340oJU c1468340oJU3 = this.LIZJ;
                C1468180oJE c1468180oJE2 = this.LIZ;
                c1468340oJU3.LJIILL = c1468180oJE2.LJJJ;
                c1468340oJU3.LJIIZILJ = c1468180oJE2.LJJJI;
                Map<String, Long> mapLIZ = ((C1467030oHN) c1468180oJE2.LIZ).LIZ();
                if (mapLIZ != null) {
                    C1468340oJU c1468340oJU4 = this.LIZJ;
                    HashMap map2 = (HashMap) mapLIZ;
                    Long l = (Long) map2.get("vlen");
                    Long lValueOf = Long.valueOf(this.LIZJ.LJIIIZ);
                    if (l == null) {
                        l = lValueOf;
                    }
                    c1468340oJU4.LJIIIZ = l.longValue();
                    C1468340oJU c1468340oJU5 = this.LIZJ;
                    Long l2 = (Long) map2.get("alen");
                    Long lValueOf2 = Long.valueOf(this.LIZJ.LJIIJ);
                    if (l2 == null) {
                        l2 = lValueOf2;
                    }
                    c1468340oJU5.LJIIJ = l2.longValue();
                }
            }
            HashMap map3 = new HashMap();
            map3.put("fr", this.LIZJ.LIZIZ);
            map3.put("to", this.LIZJ.LIZJ);
            map3.put("t", Long.valueOf(this.LIZJ.LJI));
            map3.put("c", Long.valueOf(this.LIZJ.LIZLLL));
            this.LJI.add(C786410Ut5.J3(new JSONObject(map3)));
            this.LIZ.LJIILJJIL();
            synchronized (this.LIZIZ) {
                try {
                    if (this.LIZIZ.containsKey(this.LIZJ.LIZ)) {
                        long jLongValue = ((Long) this.LIZIZ.get(this.LIZJ.LIZ)).longValue();
                        if (jLongValue > 0) {
                            C1468340oJU c1468340oJU6 = this.LIZJ;
                            c1468340oJU6.LJIJ = c1468340oJU6.LJFF - jLongValue;
                        }
                    }
                    this.LIZIZ.remove(this.LIZJ.LIZ);
                    HashMap map4 = this.LIZIZ;
                    C1468340oJU c1468340oJU7 = this.LIZJ;
                    map4.put(c1468340oJU7.LIZ, Long.valueOf(c1468340oJU7.LJI));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LIZLLL = -2147483648L;
            this.LJ = -2147483648L;
            if (this.LJII) {
                int i4 = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("VideoEventOneOpera", "report async");
                final C1468180oJE c1468180oJE3 = this.LIZ;
                final C1468340oJU c1468340oJU8 = this.LIZJ;
                EngineThreadPool.addExecuteTask(new Runnable(this, c1468180oJE3, c1468340oJU8) { // from class: X.0oJI
                    public final C1468230oJJ LL;
                    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
                    public final C1468180oJE LLILLL;
                    public final C1468340oJU LLILZ;

                    public final void LIZ() {
                        if (this.LL == null) {
                            return;
                        }
                        C1468180oJE c1468180oJE4 = this.LLILLL;
                        if (c1468180oJE4 != null) {
                            c1468180oJE4.LJIIL();
                            this.LLILLL.LJJJJZI = C1468180oJE.LJIIIZ();
                        }
                        C1468180oJE c1468180oJE5 = this.LLILLL;
                        boolean z = c1468180oJE5 != null && c1468180oJE5.LJJLIL;
                        C1468230oJJ c1468230oJJ = this.LL;
                        C1468340oJU c1468340oJU9 = this.LLILZ;
                        c1468230oJJ.getClass();
                        HashMap map5 = new HashMap();
                        if (c1468180oJE5 != null) {
                            C799510VXx.LJ("player_sessionid", c1468180oJE5.LJIILL, map5);
                            String str2 = c1468180oJE5.LJIJ;
                            if (str2 == null || str2.isEmpty()) {
                                C799510VXx.LJ("cdn_url", c1468180oJE5.LJIILLIIL, map5);
                            } else {
                                C799510VXx.LJ("cdn_url", c1468180oJE5.LJIJ, map5);
                            }
                            String str3 = c1468180oJE5.LJIJI;
                            if (str3 == null || str3.isEmpty()) {
                                C799510VXx.LJ("cdn_ip", c1468180oJE5.LJIIZILJ, map5);
                            } else {
                                C799510VXx.LJ("cdn_ip", c1468180oJE5.LJIJI, map5);
                            }
                            C799510VXx.LJ("source_type", c1468180oJE5.LJJII, map5);
                            C799510VXx.LJ("v", c1468180oJE5.LJJI, map5);
                            C799510VXx.LJ("pv", c1468180oJE5.LJ, map5);
                            C799510VXx.LJ("pc", c1468180oJE5.LJFF, map5);
                            C799510VXx.LJ("sv", c1468180oJE5.LJI, map5);
                            C799510VXx.LJ("sdk_version", c1468180oJE5.LJIIIIZZ, map5);
                            C799510VXx.LJ("vtype", c1468180oJE5.LJJIJLIJ, map5);
                            C799510VXx.LJ("tag", c1468180oJE5.LJJJIL, map5);
                            C799510VXx.LJ("subtag", c1468180oJE5.LJJJJ, map5);
                            C799510VXx.LIZIZ(Integer.MIN_VALUE, "p2p_cdn_type", map5);
                            C799510VXx.LJ("codec", c1468180oJE5.LJJIJ, map5);
                            C799510VXx.LIZIZ(c1468180oJE5.LJJIJIL, "video_codec_nameid", map5);
                            C799510VXx.LIZIZ(c1468180oJE5.LJJIJIIJIL, "audio_codec_nameid", map5);
                            C799510VXx.LIZIZ(c1468180oJE5.LJJIJL, "format_type", map5);
                            C799510VXx.LIZIZ(c1468180oJE5.LJJJJI, "drm_type", map5);
                            C799510VXx.LIZIZ(c1468180oJE5.LJJLIIIJILLIZJL.LJFF, "mdl_speed", map5);
                            C799510VXx.LJ("net_type", c1468180oJE5.LJJJJZI, map5);
                            C799510VXx.LIZIZ(Integer.MIN_VALUE, "reuse_socket", map5);
                            C799510VXx.LJ("mdl_version", c1468180oJE5.LJJJLL, map5);
                            C799510VXx.LIZIZ(c1468180oJE5.LJJLIIJ, "enable_mdl", map5);
                            c1468180oJE5.LJJLIIIJILLIZJL.getClass();
                            C799510VXx.LIZJ(-2147483648L, "mdl_req_t", map5);
                            C799510VXx.LIZJ(c1468180oJE5.LJJLIIIJILLIZJL.LJIIIIZZ, "mdl_end_t", map5);
                            C799510VXx.LIZJ(c1468180oJE5.LJJLIIIJILLIZJL.LJIIIZ, "mdl_dns_t", map5);
                            c1468180oJE5.LJJLIIIJILLIZJL.getClass();
                            C799510VXx.LIZJ(-2147483648L, "mdl_tcp_start_t", map5);
                            c1468180oJE5.LJJLIIIJILLIZJL.getClass();
                            C799510VXx.LIZJ(-2147483648L, "mdl_tcp_end_t", map5);
                            c1468180oJE5.LJJLIIIJILLIZJL.getClass();
                            C799510VXx.LIZJ(-2147483648L, "mdl_ttfp", map5);
                            c1468180oJE5.LJJLIIIJILLIZJL.getClass();
                            C799510VXx.LIZJ(-2147483648L, "mdl_httpfb", map5);
                            C799510VXx.LIZIZ(c1468180oJE5.LJJLIIIJILLIZJL.LIZ, "mdl_cache_type", map5);
                            C799510VXx.LIZJ(c1468180oJE5.LJJLIIIJILLIZJL.LIZLLL, "mdl_reply_size", map5);
                            C799510VXx.LIZIZ(c1468180oJE5.LJJLIIIJILLIZJL.LJ, "mdl_error_code", map5);
                            c1468180oJE5.LJJLIIIJILLIZJL.getClass();
                            C799510VXx.LIZIZ(Integer.MIN_VALUE, "mdl_http_code", map5);
                            C799510VXx.LJ("mdl_blocked_ips", c1468180oJE5.LJJLIIIJILLIZJL.LJIILIIL, map5);
                            c1468180oJE5.LJJLIIIJJI.getClass();
                            C799510VXx.LIZJ(-2147483648L, "a_mdl_req_t", map5);
                            C799510VXx.LIZJ(c1468180oJE5.LJJLIIIJJI.LJIIIIZZ, "a_mdl_end_t", map5);
                            C799510VXx.LIZJ(c1468180oJE5.LJJLIIIJJI.LJIIIZ, "a_mdl_dns_t", map5);
                            c1468180oJE5.LJJLIIIJJI.getClass();
                            C799510VXx.LIZJ(-2147483648L, "a_mdl_tcp_start_t", map5);
                            c1468180oJE5.LJJLIIIJJI.getClass();
                            C799510VXx.LIZJ(-2147483648L, "a_mdl_tcp_end_t", map5);
                            c1468180oJE5.LJJLIIIJJI.getClass();
                            C799510VXx.LIZJ(-2147483648L, "a_mdl_ttfp", map5);
                            c1468180oJE5.LJJLIIIJJI.getClass();
                            C799510VXx.LIZJ(-2147483648L, "a_mdl_httpfb", map5);
                            C799510VXx.LIZIZ(c1468180oJE5.LJJLIIIJJI.LIZ, "a_mdl_cache_type", map5);
                            C799510VXx.LIZJ(c1468180oJE5.LJJLIIIJJI.LIZLLL, "a_mdl_reply_size", map5);
                            C799510VXx.LIZIZ(c1468180oJE5.LJJLIIIJJI.LJ, "a_mdl_error_code", map5);
                            c1468180oJE5.LJJLIIIJJI.getClass();
                            C799510VXx.LIZIZ(Integer.MIN_VALUE, "a_mdl_http_code", map5);
                        }
                        C799510VXx.LJ("opera_type", c1468340oJU9.LIZ, map5);
                        C799510VXx.LJ("state_before", c1468340oJU9.LIZIZ, map5);
                        C799510VXx.LJ("state_after", c1468340oJU9.LIZJ, map5);
                        C799510VXx.LIZJ(c1468340oJU9.LIZLLL, "cost_time", map5);
                        C799510VXx.LJ("end_type", c1468340oJU9.LJ, map5);
                        C799510VXx.LIZIZ(c1468340oJU9.LJIILIIL, "index", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJIJ, "last_interval", map5);
                        C799510VXx.LIZIZ(c1468340oJU9.LJII, "retry_count", map5);
                        C799510VXx.LIZIZ(c1468340oJU9.LJIIIIZZ, "is_seek_in_buffer", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJIIIZ, "video_len_after", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJIIJ, "audio_len_after", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJIIJJI, "video_len_before", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJIIL, "audio_len_before", map5);
                        C799510VXx.LIZIZ(c1468340oJU9.LJIJI, "loadtype_when_seek", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJFF, "st", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJI, "et", map5);
                        C799510VXx.LJ("resolution_before", c1468340oJU9.LJIILJJIL, map5);
                        C799510VXx.LJ("resolution_after", c1468340oJU9.LJIILL, map5);
                        C799510VXx.LIZIZ(c1468340oJU9.LJIILLIIL, "bitrate_before", map5);
                        C799510VXx.LIZIZ(c1468340oJU9.LJIIZILJ, "bitrate_after", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJJ, "s_looper_t", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJJI, "s_operate_t", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJJIFFI, "s_exe_begin_t", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJJII, "s_avformat_seek_t", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJJIII, "s_c_complete_t", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJIJJ, "s_complete_t", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJJIIJ, "s_re_f_packet_t", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJJIIJZLJL, "s_de_f_audiopacket_t", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJJIIZ, "s_de_f_audioframe_t", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJIJJLI, "s_loading_begin_t", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJIL, "s_loading_end_t", map5);
                        C799510VXx.LIZJ(c1468340oJU9.LJJIIZI, "s_render_f_t", map5);
                        C799510VXx.LIZJ(c1468230oJJ.LIZLLL, "last_buf_start_t", map5);
                        C799510VXx.LIZJ(c1468230oJJ.LJ, "last_buf_end_t", map5);
                        if (TTVideoEngine.LJIIL == 0) {
                            C799510VXx.LJ("a_mdl_blocked_ips", c1468180oJE5.LJJLIIIJJI.LJIILIIL, map5);
                            c1468180oJE5.LJJLIIIJILLIZJL.getClass();
                            C799510VXx.LIZJ(-2147483648L, "mdl_cur_req_pos", map5);
                            c1468180oJE5.LJJLIIIJILLIZJL.getClass();
                            C799510VXx.LIZJ(-2147483648L, "mdl_cur_end_pos", map5);
                            c1468180oJE5.LJJLIIIJJI.getClass();
                            C799510VXx.LIZJ(-2147483648L, "a_mdl_cur_req_pos", map5);
                            c1468180oJE5.LJJLIIIJJI.getClass();
                            C799510VXx.LIZJ(-2147483648L, "a_mdl_cur_end_pos", map5);
                            c1468180oJE5.LJJLIIIJILLIZJL.getClass();
                            C799510VXx.LIZJ(-2147483648L, "mdl_cur_cache_pos", map5);
                            c1468180oJE5.LJJLIIIJJI.getClass();
                            C799510VXx.LIZJ(-2147483648L, "a_mdl_cur_cache_pos", map5);
                            c1468180oJE5.LJJLIIIJILLIZJL.getClass();
                            C799510VXx.LIZJ(-2147483648L, "mdl_down_pos", map5);
                            c1468180oJE5.LJJLIIIJJI.getClass();
                            C799510VXx.LIZJ(-2147483648L, "a_mdl_down_pos", map5);
                        }
                        JSONObject jSONObject = new JSONObject(map5);
                        BPEAHandler bPEAHandler = this.LLILLJJLI;
                        if (bPEAHandler == null) {
                            C0WPS.instance.addEventV2(z, jSONObject, "videoplayer_oneopera");
                        } else {
                            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS42S0110000_23(z, jSONObject, 6));
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("VideoEventOneOpera$AsyncGetLogDataRunnable@7394.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("VideoEventOneOpera$AsyncGetLogDataRunnable@7394.run");
                    }

                    {
                        this.LL = this;
                        this.LLILLL = c1468180oJE3;
                        this.LLILZ = c1468340oJU8;
                    }
                });
            }
            this.LIZJ = new C1468340oJU();
            return;
        }
        int i5 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("VideoEventOneOpera", "endSeek without beginSeek, return.");
    }
}
