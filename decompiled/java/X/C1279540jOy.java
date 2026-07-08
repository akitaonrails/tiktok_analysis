package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.engine.ILyraxEngineListener;
import com.ss.lyrax.engine.LyraxConnectionState;
import com.ss.lyrax.engine.LyraxNativeLibraryLoadStatus;
import com.ss.lyrax.engine.LyraxNetworkType;
import com.ss.lyrax.engine.LyraxSysStats;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279540jOy implements ILyraxEngineListener {
    public C1278260jMu LIZ;
    public InterfaceC1279760jPK LIZIZ;
    public InterfaceC1279380jOi LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public final String LJII;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;
    public long LJJI;
    public long LJJIFFI;
    public long LJJII;
    public long LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public long LJJIJIIJI;
    public long LJJIJIIJIL;
    public long LJJIJIL;
    public int LJJIJL;
    public int LJJIJLIJ;
    public long LJJIL;
    public long LJJIZ;
    public int LJJJ;
    public long LJJJI;
    public int LJJJIL;
    public long LJJJJ;
    public long LJJJJI;
    public long LJJJJIZL;
    public C1339170kx9 LJJJJJL;
    public int LJJJJL;
    public long LJJJJLI;
    public long LJJJJLL;
    public long LJJJJZ;
    public long LJJJJZI;
    public long LJJJLIIL;
    public int LJJJZ;
    public long LJJL;
    public long LJJLI;
    public long LJJLIIIIJ;
    public long LJJLIIIJ;
    public long LJJLIIIJILLIZJL;
    public long LJJLIIIJJI;
    public boolean LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public long LJJLL;
    public long LJJZ;
    public int LJJZZI;
    public int LJJZZIII;
    public int LJL;
    public int LJLI;
    public boolean LIZLLL = true;
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public int LJIIL = -1;
    public final PthreadTimer LJJJJJ = new PthreadTimer("LyraxPlayerLogEventProcesser");
    public final C1279630jP7 LJJJLL = new C1279630jP7();
    public final C1279720jPG LJJJLZIJ = new Object() { // from class: X.0jPG
    };
    public String LJJLIIIJJIZ = "";
    public final String LJJLIIIJL = "";
    public int LJJLIIJ = -1;
    public int LJJLIL = -1;
    public final Map<String, JSONObject> LJJLJ = new ConcurrentHashMap();
    public int LJJLJLI = -1;
    public String LJLIIIL = "none";

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onCreateRoomStateChanged(String str, LyraxErrorCode lyraxErrorCode) {
        C1277670jLx.LIZIZ(this, str, lyraxErrorCode);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onDisposed() {
        C1277670jLx.LIZJ(this);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onExtensionAccessError(String str, String str2) {
        C1277670jLx.LIZLLL(this, str, str2);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onInitializedEngineEGL(GLESVersion gLESVersion) {
        C1277670jLx.LJ(this, gLESVersion);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onLogReport(String str, String str2) {
        C1277670jLx.LJFF(this, str, str2);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onNativeLibraryLoadInfo(LyraxNativeLibraryLoadStatus lyraxNativeLibraryLoadStatus, String str) {
        C1277670jLx.LJI(this, lyraxNativeLibraryLoadStatus, str);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onSysStats(LyraxSysStats lyraxSysStats) {
        C1277670jLx.LJIIIIZZ(this, lyraxSysStats);
    }

    public final void LJIIIIZZ() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("event_key", "player_switch");
        C1278260jMu c1278260jMu = this.LIZ;
        JSONObject jSONObjectPut2 = jSONObjectPut.put("start", c1278260jMu != null ? c1278260jMu.LIZIZ : 0L).put("switch_direction", "normal_to_low").put("new_player_render_success", this.LJJIIJ ? 1 : 0);
        C1278260jMu c1278260jMu2 = this.LIZ;
        boolean z = false;
        if (c1278260jMu2 != null && c1278260jMu2.LIZLLL == 0) {
            z = true;
        }
        LJII(jSONObjectPut2.put("stop_to_play_cost", !z ? Long.valueOf(this.LJIILIIL - c1278260jMu2.LIZLLL) : -1).put("play_to_first_render_cost", this.LJJIIJ ? Long.valueOf(this.LJIILJJIL - this.LJIILIIL) : -1).put("play_to_first_frame_fail_cost", !this.LJJIIJ ? Long.valueOf(System.currentTimeMillis() - this.LJIILIIL) : -1));
    }

    public final void LJIIJ() {
        if (this.LJJJJJL != null) {
            return;
        }
        this.LJJJJJL = new C1339170kx9(this, 1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJJJJZI = jCurrentTimeMillis;
        this.LJJJLIIL = jCurrentTimeMillis;
        this.LJJJJJ.schedule(this.LJJJJJL, 60000L, 60000L);
    }

    public final void LJIIIZ() throws JSONException {
        long j;
        long j2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j3 = jCurrentTimeMillis - this.LJJJJZI;
        if (this.LJJIIZI) {
            this.LJJIL += jCurrentTimeMillis - this.LJJIJIIJIL;
            this.LJJIJIIJIL = jCurrentTimeMillis;
        }
        if (this.LJJIJ) {
            this.LJJIZ += jCurrentTimeMillis - this.LJJIJIL;
            this.LJJIJIL = jCurrentTimeMillis;
        }
        int i = this.LJJJJL;
        if (i > 0) {
            j = this.LJJJJLI / ((long) i);
            j2 = this.LJJJJLL / ((long) i);
        } else {
            j = 0;
            j2 = 0;
        }
        long j4 = j3 > 0 ? (this.LJJJJZ * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / j3 : 0L;
        JSONObject jSONObject = new JSONObject();
        int i2 = this.LJJJZ;
        JSONObject jSONObjectPut = jSONObject.put("e2e_camera_delay", i2 > 0 ? Long.valueOf(this.LJJL / ((long) i2)) : -1);
        int i3 = this.LJJJZ;
        JSONObject jSONObjectPut2 = jSONObjectPut.put("cap_to_encode_delay", i3 > 0 ? Long.valueOf(this.LJJLI / ((long) i3)) : -1);
        int i4 = this.LJJJZ;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("transmission_total_delay", i4 > 0 ? Long.valueOf(this.LJJLIIIIJ / ((long) i4)) : -1);
        int i5 = this.LJJJZ;
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("audience_decode_delay", i5 > 0 ? Long.valueOf(this.LJJLIIIJ / ((long) i5)) : -1);
        int i6 = this.LJJJZ;
        JSONObject jSONObjectPut5 = new JSONObject().put("event_key", "playing").put("new_video_render_stall_time", this.LJJIL).put("new_video_render_stall_count", this.LJJIJL).put("new_video_demux_stall_count", this.LJJJ).put("new_video_demux_stall_time", this.LJJJI).put("new_video_decode_stall_count", this.LJJJIL).put("new_video_decode_stall_time", this.LJJJJ).put("new_audio_render_stall_time", this.LJJIZ).put("new_audio_render_stall_count", this.LJJIJLIJ).put("download_speed", j).put("render_fps", j4).put("play_real_bitrate", j2).put("play_time", j3).put("is_low_latency", 1).put("e2e_delay", jSONObjectPut4.put("audience_render_delay", i6 > 0 ? Long.valueOf(this.LJJLIIIJILLIZJL / ((long) i6)) : -1));
        C1279630jP7 c1279630jP7 = this.LJJJLL;
        c1279630jP7.getClass();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) c1279630jP7.LIZIZ).entrySet()) {
            jSONObject3.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
        }
        for (Map.Entry entry2 : ((LinkedHashMap) c1279630jP7.LIZ).entrySet()) {
            jSONObject2.put((String) entry2.getKey(), ((Number) entry2.getValue()).longValue());
        }
        jSONObjectPut5.put("decode_resolution_level_dur", jSONObject3);
        jSONObjectPut5.put("decode_resolution_wxh_dur", jSONObject2);
        LJII(jSONObjectPut5);
        C1279630jP7 c1279630jP72 = this.LJJJLL;
        ((LinkedHashMap) c1279630jP72.LIZ).clear();
        ((LinkedHashMap) c1279630jP72.LIZIZ).clear();
        getClass();
        this.LJJJJZI = jCurrentTimeMillis;
        this.LJJIL = 0L;
        this.LJJIZ = 0L;
        this.LJJIJL = 0;
        this.LJJIJLIJ = 0;
        this.LJJJ = 0;
        this.LJJJIL = 0;
        this.LJJJI = 0L;
        this.LJJJJ = 0L;
        this.LJJJJLI = 0L;
        this.LJJJJLL = 0L;
        this.LJJJJZ = 0L;
        this.LJJJJL = 0;
        this.LJJJZ = 0;
        this.LJJL = 0L;
        this.LJJLI = 0L;
        this.LJJLIIIIJ = 0L;
        this.LJJLIIIJ = 0L;
        this.LJJLIIIJILLIZJL = 0L;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0jPG] */
    public C1279540jOy(C1277700jM0 c1277700jM0) {
        this.LJII = c1277700jM0.LIZJ;
    }

    public final void LJ(String str) {
        long j;
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ts")) {
                    long jOptLong = jSONObject.optLong("ts");
                    if (jSONObject.has("tt_ntp") && jSONObject.optInt("tt_ntp") == 1) {
                        j = this.LJJZ;
                    } else {
                        j = 0;
                    }
                    this.LJJLL = (System.currentTimeMillis() - jOptLong) + j;
                }
                if (jSONObject.has("real_video_framerate")) {
                    this.LJJLIIIJLLLLLLLZ = jSONObject.optInt("real_video_framerate");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJII(JSONObject jSONObject) {
        String str;
        boolean z;
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("biz_session_id", this.LJIIJ);
        C1278260jMu c1278260jMu = this.LIZ;
        if (c1278260jMu != null) {
            str = c1278260jMu.LIZ;
        } else {
            str = null;
        }
        jSONObject.put("live_stream_session_id", str);
        jSONObject.put("aid", this.LJII);
        jSONObject.put("room_id", this.LJIIIIZZ);
        jSONObject.put("is_background", this.LJJLJLI);
        String strOptString = jSONObject.optString("event_key", "");
        if (strOptString.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            JSONObject jSONObject2 = (JSONObject) ((ConcurrentHashMap) this.LJJLJ).get(strOptString);
            if (jSONObject2 != null) {
                jSONObject = LIZ(jSONObject, jSONObject2);
            }
            AppLogNewUtils.onEventV3("livesdk_live_client_applog_monitor_log", jSONObject);
            return;
        }
        AppLogNewUtils.onEventV3("livesdk_live_client_applog_monitor_log", jSONObject);
    }

    public final void LJIIJJI(long j) {
        if (!this.LJFF && this.LJ) {
            C1278260jMu c1278260jMu = this.LIZ;
            if (c1278260jMu == null || c1278260jMu.LIZLLL != 0) {
                long j2 = j - c1278260jMu.LIZLLL;
                this.LJJIL += j2;
                this.LJJIZ += j2;
                this.LJJJI += j2;
                this.LJJJJ += j2;
                this.LJJIJL++;
                this.LJJIJLIJ++;
                this.LJJJ++;
                this.LJJJIL++;
                c1278260jMu.LJFF += j2;
                c1278260jMu.LJ++;
            }
            this.LJFF = true;
        }
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final void onConnectionStateChanged(LyraxConnectionState lyraxConnectionState) {
        if (lyraxConnectionState == LyraxConnectionState.CONNECTED && this.LJJIII == 0) {
            this.LJJIII = System.currentTimeMillis();
            this.LJLIIIL = "network_connected";
        }
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final void onNetworkTypeChanged(LyraxNetworkType lyraxNetworkType) {
        int iValue;
        if (lyraxNetworkType != null) {
            iValue = lyraxNetworkType.value();
        } else {
            iValue = -1;
        }
        this.LJIIL = iValue;
    }

    public static JSONObject LIZ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject(C786410Ut5.J3(jSONObject));
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            if ((obj instanceof JSONObject) && jSONObject3.has(next) && (jSONObject3.get(next) instanceof JSONObject)) {
                jSONObject3.put(next, LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject3, next), (JSONObject) obj));
            } else {
                jSONObject3.put(next, obj);
            }
        }
        return jSONObject3;
    }

    public final void LIZIZ(EnumC1279610jP5 enumC1279610jP5, int i) {
        int i2 = C1279590jP3.LIZ[enumC1279610jP5.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        this.LJLI = i;
                        return;
                    }
                    return;
                }
                this.LJL = i;
                return;
            }
            this.LJJZZIII = i;
            return;
        }
        this.LJJZZI = i;
    }

    public final void LIZJ(EnumC1279610jP5 enumC1279610jP5, long j) {
        InterfaceC1279680jPC interfaceC1279680jPC;
        int i = C1279590jP3.LIZ[enumC1279610jP5.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i == 5 && this.LJIILL <= 0) {
                    this.LJIILL = j;
                    this.LJLIIIL = "first_frame_demuxed";
                    return;
                }
                return;
            }
            if (this.LJIJ > 0) {
                return;
            }
            this.LJIILJJIL = j;
            this.LJJIIJ = true;
            this.LJIJ = j;
            this.LJJIIJZLJL = true;
            this.LJLIIIL = "first_frame_rendered";
            LJIIJJI(j);
            C1278260jMu c1278260jMu = this.LIZ;
            if (c1278260jMu != null && c1278260jMu.LIZJ == 0) {
                c1278260jMu.LIZJ = j;
                LJIIJ();
                JSONObject jSONObjectPut = new JSONObject().put("event_key", "first_frame");
                InterfaceC1279760jPK interfaceC1279760jPK = this.LIZIZ;
                if (interfaceC1279760jPK != null && (interfaceC1279680jPC = ((C1279640jP8) interfaceC1279760jPK).LLILLJJLI) != null) {
                    interfaceC1279680jPC.tc("live_client_monitor_log", jSONObjectPut);
                }
            }
            if (this.LIZLLL) {
                return;
            }
            LJIIIIZZ();
            return;
        }
        if (this.LJIIZILJ > 0) {
            return;
        }
        this.LJIIZILJ = j;
        this.LJLIIIL = "first_frame_decoded";
    }

    public final void LIZLLL(EnumC1279610jP5 enumC1279610jP5, long j) {
        int i = C1279590jP3.LIZ[enumC1279610jP5.ordinal()];
        if (i != 3) {
            if (i == 5) {
                this.LJJJ++;
                this.LJJJI += j;
                return;
            }
            return;
        }
        this.LJJJIL++;
        this.LJJJJ += j;
    }

    public final void LJFF(EnumC1279620jP6 enumC1279620jP6, long j) {
        InterfaceC1279680jPC interfaceC1279680jPC;
        if (this.LJJIIZI && this.LJJIJ) {
            C1278260jMu c1278260jMu = this.LIZ;
            if (c1278260jMu != null) {
                c1278260jMu.LJ++;
                c1278260jMu.LJFF += j - this.LJJIJIIJI;
            }
            InterfaceC1279380jOi interfaceC1279380jOi = this.LIZJ;
            if (interfaceC1279380jOi != null && (interfaceC1279680jPC = ((C1279640jP8) interfaceC1279380jOi).LLILLJJLI) != null) {
                interfaceC1279680jPC.LJI();
            }
        }
        int i = C1279590jP3.LIZIZ[enumC1279620jP6.ordinal()];
        if (i != 1) {
            if (i != 2 || !this.LJJIJ) {
                return;
            }
            this.LJJIJ = false;
            this.LJJIZ += j - this.LJJIJIL;
            return;
        }
        if (!this.LJJIIZI) {
            return;
        }
        this.LJJIIZI = false;
        this.LJJIL += j - this.LJJIJIIJIL;
    }

    public final void LJI(EnumC1279620jP6 enumC1279620jP6, long j) {
        InterfaceC1279680jPC interfaceC1279680jPC;
        int i = C1279590jP3.LIZIZ[enumC1279620jP6.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LJJIJ = true;
                this.LJJIJLIJ++;
                this.LJJIJIL = j - ((long) 200);
            }
        } else {
            this.LJJIIZI = true;
            this.LJJIJL++;
            this.LJJIJIIJIL = j - ((long) 200);
        }
        if (this.LJJIIZI && this.LJJIJ) {
            this.LJJIJIIJI = j;
            InterfaceC1279380jOi interfaceC1279380jOi = this.LIZJ;
            if (interfaceC1279380jOi != null && (interfaceC1279680jPC = ((C1279640jP8) interfaceC1279380jOi).LLILLJJLI) != null) {
                interfaceC1279680jPC.LJIIJ();
            }
        }
    }
}
