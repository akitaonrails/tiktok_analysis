package X;

import Y.ARunnableS0S1110200_20;
import Y.ARunnableS1S2100100_20;
import Y.ARunnableS2S0100200_20;
import Y.ARunnableS4S0101100_20;
import Y.ARunnableS4S1101100_20;
import Y.ARunnableS5S1100100_20;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jHN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274830jHN {
    public final C1275140jHs LIZ;
    public final C1274970jHb LIZIZ;
    public final InterfaceC1274800jHK LIZJ;
    public long LJFF;
    public long LJI;
    public final ConcurrentHashMap<String, Boolean> LJIIIIZZ;
    public final ConcurrentHashMap<String, Boolean> LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final AtomicLong LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public C1269340j8W LJJ;
    public VPassInteractCfg LJJI;
    public final AtomicInteger LJJIFFI;
    public final AtomicInteger LJJII;
    public AbstractC1273900jFs LJJIII;
    public C1268130j6Z LJJIIJ;
    public String LIZLLL = "";
    public String LJ = "";
    public final ConcurrentHashMap<String, C1275570jIZ> LJII = new ConcurrentHashMap<>();

    public final void LJIIJJI() {
        if (this.LJFF <= 0 || !this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = false;
        C1274690jH9.LJ(new ARunnableS2S0100200_20(this, System.currentTimeMillis(), System.currentTimeMillis() - this.LJFF, 1));
    }

    public final JSONObject LJI() {
        int i = this.LJIJJLI;
        int i2 = this.LJIJI;
        int i3 = this.LJIL;
        int i4 = this.LJIJJ;
        this.LJIJJLI = 0;
        this.LJIJI = 0;
        this.LJIL = 0;
        this.LJIJJ = 0;
        if (this.LJJI != null) {
            i3 = this.LJJII.get();
            i4 = this.LJJIFFI.get();
            this.LJJII.set(0);
            this.LJJIFFI.set(0);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(i4);
            sbLIZ.append(",");
            sbLIZ.append(i3);
            sbLIZ.append(",");
            sbLIZ.append(i2);
            sbLIZ.append(",");
            sbLIZ.append(i);
            jSONObject.put("statics", C2188811AlT.LIZIZ(sbLIZ));
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final void LJIIZILJ() {
        if (this.LJIIL) {
            return;
        }
        this.LJIIL = true;
        C1274690jH9.LJ(new ARunnableS4S0101100_20(this, System.currentTimeMillis(), 1));
    }

    public static String LIZJ(C1274930jHX c1274930jHX) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("audio_sample_rate", c1274930jHX.LIZ());
            jSONObject.put("audio_channel", c1274930jHX.LJIIL);
            jSONObject.put("audio_profile", c1274930jHX.LJIILJJIL.toString());
            jSONObject.put("audio_bitrate", c1274930jHX.LJIILIIL);
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LIZLLL(C1274930jHX c1274930jHX) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", c1274930jHX.LIZ);
            jSONObject.put("height", c1274930jHX.LIZIZ);
            jSONObject.put("fps", c1274930jHX.LJ);
            jSONObject.put("codec", c1274930jHX.LJII);
            if (c1274930jHX.LJII == EnumC1275320jIA.BYTEVC1) {
                c1274930jHX.LJIIIIZZ = EnumC1275350jID.MAIN;
            }
            jSONObject.put("video_profile", c1274930jHX.LJIIIIZZ.toString().toLowerCase());
            jSONObject.put("video_bitrate", c1274930jHX.LIZLLL);
            jSONObject.put("gop", c1274930jHX.LJI);
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LJ(Map map) {
        String string = "";
        if (map == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Object obj : map.keySet()) {
                C1275340jIC c1275340jIC = (C1275340jIC) map.get(obj);
                if (c1275340jIC != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("stream_id", obj).put("real_bitrate", c1275340jIC.LIZ).put("real_fps", c1275340jIC.LIZIZ).put("width", c1275340jIC.LIZJ).put("height", c1275340jIC.LIZLLL).put("isHwCodec", c1275340jIC.LJ).put("codecType", c1275340jIC.LJFF).put("set_width", c1275340jIC.LJI).put("set_height", c1275340jIC.LJII).put("set_fps", c1275340jIC.LJIIIIZZ).put("set_bitrate", c1275340jIC.LJIIIZ);
                    jSONArray.put(jSONObject);
                }
            }
            string = jSONArray.toString();
            return string;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return string;
        }
    }

    public static String LJII(C1275560jIY c1275560jIY) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1275560jIY.LIZJ);
        sbLIZ.append("x");
        sbLIZ.append(c1275560jIY.LIZLLL);
        sbLIZ.append("x");
        sbLIZ.append(c1275560jIY.LJ);
        sbLIZ.append("x");
        sbLIZ.append(c1275560jIY.LJFF);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(boolean z) {
        if (z) {
            this.LJJIFFI.incrementAndGet();
        } else {
            this.LJJII.incrementAndGet();
        }
    }

    public final String LJFF(Map<String, C1275040jHi> map) {
        int i;
        String string = "";
        if (map == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str : map.keySet()) {
                C1275040jHi c1275040jHi = map.get(str);
                if (c1275040jHi != null) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObjectPut = jSONObject.put("user_id", str).put("recv_video_bitrate", c1275040jHi.LIZJ).put("recv_vdecode_fps", c1275040jHi.LIZLLL).put("recv_vrender_fps", c1275040jHi.LJ).put("recv_video_loss", c1275040jHi.LJFF).put("recv_audio_bitrate", c1275040jHi.LJI).put("recv_audio_delay", c1275040jHi.LJII).put("recv_audio_loss", c1275040jHi.LJIIIIZZ).put("recv_audio_volume", c1275040jHi.LJIIIZ);
                    if (c1275040jHi.LJIILJJIL) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    jSONObjectPut.put("remote_is_hw", i).put("remote_codec_type", c1275040jHi.LJIILL);
                    if (this.LIZIZ.LJJIJIIJI) {
                        jSONObject.put("recv_video_width", c1275040jHi.LIZ).put("recv_video_height", c1275040jHi.LIZIZ);
                    }
                    jSONArray.put(jSONObject);
                }
            }
            string = jSONArray.toString();
            return string;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return string;
        }
    }

    public final void LJIIJ(String str) {
        C1274690jH9.LJ(new ARunnableS4S1101100_20(this, System.currentTimeMillis(), str, 4));
    }

    public final void LJIILIIL(String str) {
        C1275570jIZ c1275570jIZ;
        synchronized (this.LJII) {
            try {
                if (!this.LJII.containsKey(str)) {
                    c1275570jIZ = new C1275570jIZ();
                    c1275570jIZ.LIZ = str;
                } else {
                    c1275570jIZ = this.LJII.get(str);
                }
                c1275570jIZ.LIZLLL = System.currentTimeMillis();
                c1275570jIZ.LJ = TimeUtils.getServerTimeMSec();
                this.LJII.put(str, c1275570jIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILJJIL(String str) {
        C1275570jIZ c1275570jIZ;
        synchronized (this.LJII) {
            try {
                if (!this.LJII.containsKey(str)) {
                    c1275570jIZ = new C1275570jIZ();
                    c1275570jIZ.LIZ = str;
                } else {
                    c1275570jIZ = this.LJII.get(str);
                }
                c1275570jIZ.LJFF = System.currentTimeMillis();
                c1275570jIZ.LJI = TimeUtils.getServerTimeMSec();
                this.LJII.put(str, c1275570jIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1274690jH9.LJ(new ARunnableS5S1100100_20(str, System.currentTimeMillis(), this, 3));
    }

    public final void LJIL(C1275570jIZ c1275570jIZ) {
        JSONObject jSONObjectLIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = c1275570jIZ.LIZ;
        long j = c1275570jIZ.LIZIZ;
        long j2 = c1275570jIZ.LIZJ;
        long j3 = c1275570jIZ.LIZLLL;
        long j4 = c1275570jIZ.LJ;
        long j5 = c1275570jIZ.LJFF;
        long j6 = c1275570jIZ.LJI;
        long j7 = j3 - j;
        long j8 = j5 - j3;
        long j9 = j5 - j;
        if (this.LJJI != null) {
            jSONObjectLIZIZ = LIZIZ(jCurrentTimeMillis, "rtc_engine_api_callback");
        } else {
            jSONObjectLIZIZ = LIZIZ(jCurrentTimeMillis, "first_remote_frame_success");
        }
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("linkmic_id", this.LIZ.LJFF).put("remote_linkmic_id", str).put("remote_user_id", str).put("innder_channel_id", this.LIZ.LIZLLL).put("decode_client_time", j).put("decode_server_time", j2).put("receive_client_time", j3).put("receive_server_time", j4).put("render_client_time", j5).put("render_server_time；", j6).put("decode_to_receive_duration", j7).put("receive_to_render_duration", j8).put("decode_to_render_duration", j9);
            if (this.LJJI != null) {
                jSONObjectLIZIZ.put("api", "first_remote_frame_success");
            }
            LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public final void LJJ(JSONObject jSONObject) {
        AbstractC1273900jFs abstractC1273900jFs;
        AVLog.debugTrace(jSONObject);
        C1269340j8W c1269340j8W = this.LJJ;
        if (c1269340j8W != null && c1269340j8W.LJJJJI && (abstractC1273900jFs = this.LJJIII) != null) {
            abstractC1273900jFs.LLJJIJI(jSONObject);
        }
        InterfaceC1274800jHK interfaceC1274800jHK = this.LIZJ;
        if (interfaceC1274800jHK != null) {
            try {
                if (C1268530j7D.LIZ() && !"rtc_push_stream".equals(JSONObjectProtectorUtils.getString(jSONObject, "event_key"))) {
                    AVLog.ioi("live_client_monitor_log", C786410Ut5.J3(jSONObject));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
            ((C1274850jHP) interfaceC1274800jHK).LJIILJJIL("live_client_monitor_log", jSONObject);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:176:0x0175
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final org.json.JSONObject LIZIZ(long r8, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274830jHN.LIZIZ(long, java.lang.String):org.json.JSONObject");
    }

    public final void LJIIIIZZ(String str, String str2) {
        C1274690jH9.LJ(new ARunnableS1S2100100_20(this, str, System.currentTimeMillis(), str2, 3));
    }

    public final void LJIIIZ(int i, String str) {
        C1274690jH9.LJ(new ARunnableS4S1101100_20(this, System.currentTimeMillis(), str, i, 2));
    }

    public final void LJIIL(String str, boolean z) {
        C1275570jIZ c1275570jIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LJFF;
        long j2 = 0;
        if (j != 0) {
            j2 = jCurrentTimeMillis - j;
        }
        if (z) {
            this.LJIILLIIL = jCurrentTimeMillis - this.LJI;
            this.LJIJ = jCurrentTimeMillis - j;
        } else {
            this.LJIILL = jCurrentTimeMillis - this.LJI;
            this.LJIIZILJ = jCurrentTimeMillis - j;
            synchronized (this.LJII) {
                try {
                    if (!this.LJII.containsKey(str)) {
                        c1275570jIZ = new C1275570jIZ();
                        c1275570jIZ.LIZ = str;
                    } else {
                        c1275570jIZ = this.LJII.get(str);
                    }
                    c1275570jIZ.LIZIZ = System.currentTimeMillis();
                    c1275570jIZ.LIZJ = TimeUtils.getServerTimeMSec();
                    this.LJII.put(str, c1275570jIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1274690jH9.LJ(new ARunnableS0S1110200_20(this, System.currentTimeMillis(), z, str, j2, 0));
    }

    public final void LJIJI(String str, boolean z) {
        long jCurrentTimeMillis;
        if (this.LJFF != 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
        } else {
            jCurrentTimeMillis = 0;
        }
        if (z) {
            this.LJI = System.currentTimeMillis();
            this.LJIILL = 0L;
            this.LJIILLIIL = 0L;
        }
        C1274690jH9.LJ(new ARunnableS0S1110200_20(this, System.currentTimeMillis(), z, str, jCurrentTimeMillis, 1));
        if (z) {
            if (!this.LJIIIZ.containsKey(str)) {
                this.LJIIIZ.put(str, Boolean.TRUE);
            }
            if (!this.LJIIIIZZ.containsKey(str)) {
                this.LJIIIIZZ.put(str, Boolean.TRUE);
            }
        }
    }

    public final void LJIJJ(final long j, final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1274690jH9.LJ(new Runnable() { // from class: X.0jH5
            public final void LIZ() {
                JSONObject jSONObjectLIZIZ = this.LLILZ.LIZIZ(jCurrentTimeMillis, str);
                if (jSONObjectLIZIZ == null) {
                    return;
                }
                try {
                    jSONObjectLIZIZ.put("result", j > 0 ? "success" : "failed");
                    jSONObjectLIZIZ.put("stat_elapsed", j);
                    this.LLILZ.LJJ(jSONObjectLIZIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AVLog.iow("live_client_monitor_log", String.valueOf(e));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InteractLogService@7e74.onReportRtcStat$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InteractLogService@7e74.onReportRtcStat$1");
            }
        });
    }

    public final void LJIJJLI(JSONObject jSONObject, C1274280jGU c1274280jGU) {
        EnumC1275210jHz enumC1275210jHz;
        C1274970jHb c1274970jHb = this.LIZIZ;
        if (c1274970jHb != null && c1274280jGU != null && c1274970jHb.LJJIJ && (enumC1275210jHz = c1274970jHb.LJJIFFI) != null) {
            if (enumC1275210jHz == EnumC1275210jHz.SERVER_MIX || enumC1275210jHz == EnumC1275210jHz.NONE) {
                try {
                    jSONObject.put("video_frame_elapse_v2", c1274280jGU.LJIL).put("averageExposureTime", c1274280jGU.LJJ).put("averageCameraFps", c1274280jGU.LJJI).put("cameraISOInfo", c1274280jGU.LJJIFFI).put("filter_nobuffer_cnt", c1274280jGU.LJJIJ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public C1274830jHN(C1275140jHs c1275140jHs, C1274970jHb c1274970jHb, InterfaceC1274800jHK interfaceC1274800jHK) {
        new ConcurrentHashMap();
        this.LJIIJ = true;
        this.LJIIJJI = true;
        this.LJIIL = false;
        this.LJIILIIL = new AtomicLong(0L);
        this.LJIILJJIL = 0L;
        this.LJIILL = 0L;
        this.LJIILLIIL = 0L;
        this.LJIIZILJ = 0L;
        this.LJIJ = 0L;
        this.LJIJI = 0;
        this.LJIJJ = 0;
        this.LJIJJLI = 0;
        this.LJIL = 0;
        this.LJJIFFI = new AtomicInteger(0);
        this.LJJII = new AtomicInteger(0);
        this.LIZ = c1275140jHs;
        this.LIZIZ = c1274970jHb;
        this.LIZJ = interfaceC1274800jHK;
        this.LJIIIIZZ = new ConcurrentHashMap<>();
        this.LJIIIZ = new ConcurrentHashMap<>();
    }

    public final void LJIILL(final long j, final String str, final String str2) {
        final long jCurrentTimeMillis;
        if (this.LJFF != 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
        } else {
            jCurrentTimeMillis = 0;
        }
        LJIJJ(this.LJIILJJIL, "rtc_join_channel_stat");
        LJIJJ(this.LJIILLIIL, "rtc_subscribe_audio_stat");
        LJIJJ(this.LJIILL, "rtc_subscribe_video_stat");
        LJIJJ(this.LJIIZILJ, "rtc_video_first_frame_stat");
        LJIJJ(this.LJIJ, "rtc_audio_first_frame_stat");
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        C1274690jH9.LJ(new Runnable() { // from class: X.0jH7
            public final void LIZ() {
                C1274830jHN c1274830jHN = this.LLILZLL;
                JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(jCurrentTimeMillis2, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(jCurrentTimeMillis2, "rtc_leave_channel");
                if (jSONObjectLIZIZ == null) {
                    return;
                }
                try {
                    jSONObjectLIZIZ.put("elapsed", jCurrentTimeMillis).put("pull_streams_video_duration", j).put("remote_video_color_range", str).put("transform_color_range", str2);
                    if (this.LLILZLL.LJJI != null) {
                        jSONObjectLIZIZ.put("api", "rtc_leave_channel");
                    }
                    this.LLILZLL.LJJ(jSONObjectLIZIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InteractLogService@7e74.onLeavingChannel$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InteractLogService@7e74.onLeavingChannel$1");
            }
        });
    }

    public final void LJIILLIIL(final int i, final String str, final String str2) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1274690jH9.LJ(new Runnable() { // from class: X.0jH6
            public final void LIZ() {
                C1274830jHN c1274830jHN = this.LLILZIL;
                JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(jCurrentTimeMillis, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(jCurrentTimeMillis, "rtc_media_state_changed");
                if (jSONObjectLIZIZ == null) {
                    return;
                }
                try {
                    jSONObjectLIZIZ.put("message", str).put("state", i).put("remote_rtc_user_id", str2);
                    if (this.LLILZIL.LJJI != null) {
                        jSONObjectLIZIZ.put("api", "rtc_media_state_changed");
                    }
                    this.LLILZIL.LJJ(jSONObjectLIZIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InteractLogService@7e74.onMediaStateChanged$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InteractLogService@7e74.onMediaStateChanged$1");
            }
        });
    }

    public final void LJIJ(final String str, final String str2, final String str3) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1274690jH9.LJ(new Runnable() { // from class: X.0jH8
            public final void LIZ() {
                C1274830jHN c1274830jHN = this.LLILZIL;
                JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(jCurrentTimeMillis, "rtc_engine_api_call") : c1274830jHN.LIZIZ(jCurrentTimeMillis, "rtc_media_api_call");
                if (jSONObjectLIZIZ == null) {
                    return;
                }
                try {
                    jSONObjectLIZIZ.put("engine_api_name", str).put("api_parameter_info", str2).put("message", str3);
                    if (this.LLILZIL.LJJI != null) {
                        jSONObjectLIZIZ.put("api", str);
                    }
                    this.LLILZIL.LJJ(jSONObjectLIZIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InteractLogService@7e74.onRTCEngineMediaAPICall$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InteractLogService@7e74.onRTCEngineMediaAPICall$1");
            }
        });
    }
}
