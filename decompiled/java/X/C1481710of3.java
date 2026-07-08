package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0of3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481710of3 {
    public VideoInfo LIZ;
    public C1481720of4 LIZIZ;

    public final void LIZ() {
        VideoInfo videoInfo;
        Map<String, ? extends Object> map;
        Set<String> setKeySet;
        C1481720of4 c1481720of4 = this.LIZIZ;
        if (c1481720of4 == null || (videoInfo = this.LIZ) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("access", videoInfo.getAccess2());
            jSONObject.put("is_dash", c1481720of4.LJII);
            jSONObject.put("group_id", c1481720of4.LJ);
            jSONObject.put("video_id", c1481720of4.LJFF);
            jSONObject.put("play_sess", c1481720of4.LJIILJJIL);
            jSONObject.put("video_size", c1481720of4.LJIIJ);
            jSONObject.put("vduration", c1481720of4.LJIIJJI);
            jSONObject.put("play_url", c1481720of4.LJIIL);
            jSONObject.put("is_bytevc1", c1481720of4.LJI);
            jSONObject.put("player_type", c1481720of4.LJIILIIL);
            jSONObject.put("cache_size", c1481720of4.LJIIIZ);
            jSONObject.put("pre_cache_size", videoInfo.getPreCacheSize());
            jSONObject.put("internet_speed", c1481720of4.LJIIIIZZ);
            jSONObject.put("speed_mode", Float.valueOf(c1481720of4.LJIIZILJ));
            jSONObject.put("error_code", c1481720of4.LIZ);
            jSONObject.put("error_info", c1481720of4.LIZJ);
            jSONObject.put("error_internal_code", c1481720of4.LIZIZ);
            jSONObject.put("session_cnt", c1481720of4.LJIILLIIL);
            jSONObject.put("enable_hdr", videoInfo.getEnableHdr());
            jSONObject.put("mdl_err_code", CardStruct.IStatusCode.DEFAULT);
            Map<String, ? extends Object> map2 = c1481720of4.LIZLLL;
            if (map2 != null && !map2.isEmpty() && (map = c1481720of4.LIZLLL) != null && (setKeySet = map.keySet()) != null && (r2 = setKeySet.iterator()) != null) {
                for (String str : setKeySet) {
                    try {
                        Object obj = c1481720of4.LIZLLL.get(str);
                        if (obj != null) {
                            jSONObject.put(str, obj.toString());
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            for (String str2 : c1481720of4.LJIILL.keySet()) {
                Object obj2 = c1481720of4.LJIILL.get(str2);
                if (obj2 != null) {
                    if (Intrinsics.LJFF(str2, "is_playing_translated_video") && (obj2 instanceof Boolean)) {
                        jSONObject.put(str2, ((Boolean) obj2).booleanValue() ? 1 : 0);
                    } else {
                        jSONObject.put(str2, obj2);
                    }
                }
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        IEvent iEventLIZJ = C1475000oUE.LIZJ();
        if (iEventLIZJ != null) {
            iEventLIZJ.onEvent("video_play_failed", jSONObject);
        }
        C625790Ogb.LIZ();
    }
}
