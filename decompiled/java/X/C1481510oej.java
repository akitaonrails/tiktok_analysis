package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481510oej {
    public static boolean LIZLLL = true;
    public VideoInfo LIZ;
    public UpdateCallback LIZIZ;
    public C1481560oeo LIZJ;

    public final void LIZ() {
        boolean z;
        IMonitor iMonitorLJIIIIZZ;
        IEvent iEventLIZJ;
        C1481560oeo c1481560oeo = this.LIZJ;
        if (c1481560oeo != null) {
            VideoInfo videoInfo = this.LIZ;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("qprf", c1481560oeo.LIZLLL);
                jSONObject.put("access", c1481560oeo.LJJIFFI);
                jSONObject.put("group_id", c1481560oeo.LIZ);
                jSONObject.put("play_sess", c1481560oeo.LJJIJIIJI);
                jSONObject.put("duration", c1481560oeo.LJ);
                jSONObject.put("vduration", Float.valueOf(c1481560oeo.LJIILJJIL));
                jSONObject.put("video_quality", c1481560oeo.LJIIJ);
                jSONObject.put("pre_cache_size", c1481560oeo.LJJII);
                jSONObject.put("preload_speed", c1481560oeo.LJJIII);
                jSONObject.put("internet_speed", c1481560oeo.LJIIIZ);
                jSONObject.put("video_fps", c1481560oeo.LJJ);
                jSONObject.put("is_bytevc1", c1481560oeo.LJJIJ);
                jSONObject.put("pt_predictL", c1481560oeo.LJJIIJZLJL);
                jSONObject.put("format", c1481560oeo.LJJIJLIJ);
                jSONObject.put("codec_id", c1481560oeo.LJJIIZ);
                jSONObject.put("codec_name", c1481560oeo.LJIJJLI);
                jSONObject.put("hw_failed_reason", c1481560oeo.LJJJ);
                jSONObject.put("bitrate_set", c1481560oeo.LJIIL);
                jSONObject.put("calc_bitrate", c1481560oeo.LJIJ);
                if (!C1474810oTv.LJIILL()) {
                    try {
                        jSONObject.put("sdk_select_time_float", c1481560oeo.LJIJI);
                        jSONObject.put("sdk_select_diff_str", c1481560oeo.LJIJJ);
                    } catch (JSONException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                jSONObject.put("play_bitrate", c1481560oeo.LJIILL);
                jSONObject.put("video_bitrate", c1481560oeo.LJFF);
                jSONObject.put("audio_bitrate", c1481560oeo.LJI);
                jSONObject.put("audio_quality", c1481560oeo.LJIIJJI);
                jSONObject.put("bitrate_values", c1481560oeo.LJIILIIL);
                jSONObject.put("is_super_resolution", c1481560oeo.LJJIJIIJIL);
                jSONObject.put("is_async", c1481560oeo.LJJJIL ? 1 : 0);
                jSONObject.put("session_cnt", c1481560oeo.LJJJJJ);
                jSONObject.put("enable_hdr", videoInfo != null ? Integer.valueOf(videoInfo.getEnableHdr()) : null);
                jSONObject.put("is_surfaceview", c1481560oeo.LJIILLIIL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preloader_type=");
                sbLIZ.append(c1481560oeo.LJIIZILJ);
                sbLIZ.append("&inner_type=");
                sbLIZ.append(c1481560oeo.LJJIIJ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                jSONObject.put("cpu_rate", c1481560oeo.LJJI);
                jSONObject.put("inner_type", strLIZIZ);
                jSONObject.put("had_prepare", c1481560oeo.LJJIL);
                jSONObject.put("engine_state", c1481560oeo.LJJIZ);
                jSONObject.put("dimension_bitrate_curve", c1481560oeo.LJJJJI);
                jSONObject.put("dimension_bitrate_filter", c1481560oeo.LJJJJIZL);
                jSONObject.put("bitrate_curve", c1481560oeo.LJJJI);
                if (!TextUtils.isEmpty(c1481560oeo.LIZIZ)) {
                    jSONObject.put("action_type", c1481560oeo.LIZIZ);
                }
                if (!TextUtils.isEmpty(c1481560oeo.LJIL)) {
                    jSONObject.put("hw_codec_name", c1481560oeo.LJIL);
                }
                int i = c1481560oeo.LJIIIIZZ;
                if (i >= 0) {
                    jSONObject.put("is_same_bitrate", i);
                }
                jSONObject.put("preload_bitrate", c1481560oeo.LJII);
                jSONObject.put("vpq_internet_speed", c1481560oeo.LJIIIZ);
                jSONObject.put("vpq_timestamp", System.currentTimeMillis());
                int i2 = c1481560oeo.LJII;
                int i3 = c1481560oeo.LJFF;
                if (i2 != i3 && i2 > 0 && i3 > 0) {
                    jSONObject.put("preload_select_reason", c1481560oeo.LJJJJJL);
                    jSONObject.put("select_reason", c1481560oeo.LJJJJL);
                }
                String str = c1481560oeo.LJJJJLI;
                if (str != null) {
                    jSONObject.put("preload_add_miss_reason", str);
                }
                for (String str2 : c1481560oeo.LJJJJ.keySet()) {
                    Object obj = c1481560oeo.LJJJJ.get(str2);
                    if (obj != null) {
                        if (Intrinsics.LJFF(str2, "is_playing_translated_video") && (obj instanceof Boolean)) {
                            jSONObject.put(str2, ((Boolean) obj).booleanValue() ? 1 : 0);
                        } else {
                            jSONObject.put(str2, obj);
                        }
                    }
                }
            } catch (JSONException e2) {
                e = e2;
            }
            if (TextUtils.equals(jSONObject.optString("format"), "dash")) {
                int iOptInt = jSONObject.optInt("codec_id");
                if (iOptInt != 0 && iOptInt != 1) {
                    iOptInt = iOptInt == 33 ? 2 : 0;
                }
                jSONObject.put("is_bytevc1", iOptInt);
            }
            if (C1474810oTv.LJJLI()) {
                InterfaceC1482100ofg interfaceC1482100ofgLIZ = C1481590oer.LIZ();
                String str3 = this.LIZJ.LJJIJIIJI;
                EnumC1481810ofD enumC1481810ofD = EnumC1481810ofD.VIDEO_PLAY_QUALITY;
                HashMap<String, String> mapLIZ = ((C1481640oew) interfaceC1482100ofgLIZ).LIZ(str3);
                if ((mapLIZ == null ? Boolean.FALSE : Boolean.valueOf(mapLIZ.containsKey(enumC1481810ofD.name()))).booleanValue()) {
                    JSONObject jSONObject2 = new JSONObject();
                    C1481630oev.LIZJ(this.LIZJ.LJJIJIIJI, jSONObject2);
                    C1482340og4.LIZIZ().getClass();
                    try {
                        jSONObject2.put("has_playsessionevents", 1);
                        jSONObject2.put("has_oneplay", 0);
                    } catch (JSONException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                    C1482340og4.LIZLLL(jSONObject2);
                    C1482340og4.LJ(jSONObject2);
                }
            }
            if (((Boolean) C1474810oTv.t0.getValue()).booleanValue() && LIZLLL) {
                z = false;
                LIZLLL = false;
                IEvent iEventLIZJ2 = C1475000oUE.LIZJ();
                if (iEventLIZJ2 != null) {
                    iEventLIZJ2.onEvent("video_play_quality", jSONObject);
                }
            } else {
                C1481590oer.LIZIZ();
                ((C1481640oew) C1481590oer.LIZ()).LJ(EnumC1481810ofD.VIDEO_PLAY_QUALITY, this.LIZJ.LJJIJIIJI, C786410Ut5.J3(jSONObject));
                z = false;
            }
            C1481630oev.LIZLLL(z);
            if (C1474810oTv.LJJIJLIJ() && (iEventLIZJ = C1475000oUE.LIZJ()) != null) {
                iEventLIZJ.onEvent("video_play_quality", jSONObject);
            }
            if (this.LIZIZ != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1481560oeo c1481560oeo2 = this.LIZJ;
                JSONObject jSONObject3 = new JSONObject();
                if (c1481560oeo2 != null) {
                    try {
                        jSONObject3.put("group_id", c1481560oeo2.LIZ);
                        jSONObject3.put("bitrate_set", c1481560oeo2.LJIIL);
                        jSONObject3.put("calc_bitrate", c1481560oeo2.LJIJ);
                        jSONObject3.put("play_bitrate", c1481560oeo2.LJIILL);
                        jSONObject3.put("video_bitrate", c1481560oeo2.LJFF);
                        jSONObject3.put("audio_bitrate", c1481560oeo2.LJI);
                        jSONObject3.put("is_surfaceview", c1481560oeo2.LJIILLIIL);
                        jSONObject3.put("internet_speed", c1481560oeo2.LJIIIZ);
                    } catch (JSONException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                }
                linkedHashMap.put("external_log", jSONObject3);
                linkedHashMap.put("video_play_quality", jSONObject);
                this.LIZIZ.update(1, linkedHashMap);
            }
            String str4 = this.LIZJ.LIZ;
            if (C1476920oXK.LIZJ && str4 != null) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1481390oeX.LIZ;
                concurrentHashMap.remove(str4);
                if (C1476920oXK.LIZJ && !C1476920oXK.LIZ) {
                    C1476920oXK.LIZJ();
                }
                concurrentHashMap.put(str4, new C1481430oeb(new C1481410oeZ(C1476920oXK.LIZIZ.LL, C1476920oXK.LIZIZ(), C1476920oXK.LIZ())));
            }
            if (!C1474810oTv.LJJIIJZLJL() && (iMonitorLJIIIIZZ = C1475000oUE.LJIIIIZZ()) != null) {
                iMonitorLJIIIIZZ.monitorCommonLog("aweme_video_bitrate_first_frame_log", jSONObject);
            }
            C625790Ogb.LIZ();
        }
    }
}
