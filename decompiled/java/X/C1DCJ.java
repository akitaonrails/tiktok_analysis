package X;

import com.ss.android.ugc.aweme.feed.features.model.SessionFeatureItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DCJ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCJ<I> implements InterfaceC2251961DCg {
    public static final C1DCJ<I> LIZ = new C1DCJ<>();

    @Override // X.InterfaceC2251961DCg
    public final void LIZIZ(C204535151p c204535151p) throws JSONException {
        InterfaceC582850MtX interfaceC582850MtX = c204535151p.LIZIZ;
        if (interfaceC582850MtX instanceof C2183781AdM) {
            SessionFeatureItem sessionFeatureItem = c204535151p.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("group_id", sessionFeatureItem.awemeId);
            jSONObject.putOpt("session_v_num", Integer.valueOf(sessionFeatureItem.sessionVNum));
            jSONObject.putOpt("session_r_num", Integer.valueOf(sessionFeatureItem.sessionRNum));
            jSONObject.putOpt("day_v_num", Integer.valueOf(sessionFeatureItem.dayVNum));
            jSONObject.putOpt("day_r_num", Integer.valueOf(sessionFeatureItem.dayRNum));
            if (C300580BqK.LIZ()) {
                if (sessionFeatureItem.isAdClick) {
                    jSONObject.putOpt("is_ad_click", Boolean.TRUE);
                }
                if (!sessionFeatureItem.LIZIZ.isEmpty()) {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    List<C558502Fr> list = sessionFeatureItem.LIZIZ;
                    c1227904rF.getClass();
                    jSONObject.putOpt("post_search_info", C1227904rF.LJI(list));
                }
                long j = ((C2183781AdM) interfaceC582850MtX).LIZJ;
                sessionFeatureItem.playTimeSumV2 += j;
                long jMax = Math.max(sessionFeatureItem.playTimeMaxV2, j);
                sessionFeatureItem.playTimeMaxV2 = jMax;
                jSONObject.putOpt("playtime_max", Long.valueOf(jMax));
                jSONObject.putOpt("playtime", Long.valueOf(sessionFeatureItem.playTimeSumV2));
                jSONObject.putOpt("playtime_live", Long.valueOf(sessionFeatureItem.playTimeLiveRoom));
                if (C0BTE.LIZ() && Intrinsics.LJFF(sessionFeatureItem.isLive, Boolean.TRUE)) {
                    jSONObject.putOpt("is_live", sessionFeatureItem.isLive);
                    jSONObject.putOpt("live_hot_refresh_info", sessionFeatureItem.LIZJ);
                }
            }
            C1513180pTo.LIZ("video_session_info", jSONObject);
            return;
        }
        if (!(interfaceC582850MtX instanceof C603460Nlg) || !C300580BqK.LIZ() || !Intrinsics.LJFF(((C603460Nlg) interfaceC582850MtX).LIZ, "play_time")) {
            return;
        }
        SessionFeatureItem sessionFeatureItem2 = c204535151p.LIZ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("group_id", sessionFeatureItem2.awemeId);
        C1DCC c1dcc = C1DC5.LIZ;
        String str = sessionFeatureItem2.awemeId;
        c1dcc.getClass();
        C1DC3 c1dc3LJI = C1DCC.LJI(str);
        if (c1dc3LJI != null) {
            C1227904rF.LIZ.getClass();
            jSONObject2.putOpt("poi", C1227904rF.LJI(c1dc3LJI));
        }
        C1513180pTo.LIZ("video_session_info", jSONObject2);
    }
}
