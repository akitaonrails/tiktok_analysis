package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481660oey {
    public int LIZ = -1;
    public UpdateCallback LIZIZ;
    public VideoInfo LIZJ;
    public C1482260ofw LIZLLL;

    public final void LIZ() {
        C1482260ofw c1482260ofw;
        VideoInfo videoInfo = this.LIZJ;
        if (videoInfo == null || (c1482260ofw = this.LIZLLL) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("group_id", videoInfo.getAid());
            jSONObject.put("duration", this.LIZ);
            jSONObject.put("is_cache", videoInfo.isHitCache());
            jSONObject.put("play_sess", c1482260ofw.LIZJ);
            jSONObject.put("is_success", c1482260ofw.LIZIZ);
            jSONObject.put("video_quality", videoInfo.getVideoQuality());
            jSONObject.put("internet_speed", videoInfo.getInternetSpeed());
            jSONObject.put("vrr_internet_speed", videoInfo.getInternetSpeed());
            jSONObject.put("vrr_timestamp", System.currentTimeMillis());
            for (String str : c1482260ofw.LIZLLL.keySet()) {
                Object obj = c1482260ofw.LIZLLL.get(str);
                if (obj != null) {
                    jSONObject.put(str, obj);
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((C1481640oew) C1481590oer.LIZ()).LJ(EnumC1481810ofD.VIDEO_REQUEST_RESPONSE, this.LIZLLL.LIZJ, C786410Ut5.J3(jSONObject));
        C1481590oer.LIZIZ();
        C1481630oev.LIZLLL(false);
        if (C1474810oTv.LJJIJLIJ()) {
            C1475000oUE.LIZJ().onEvent("video_request_response", jSONObject);
        }
        if (this.LIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("video_request_response", jSONObject);
            this.LIZIZ.update(2, linkedHashMap);
        }
        C625790Ogb.LIZ();
    }
}
