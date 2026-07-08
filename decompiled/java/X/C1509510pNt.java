package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.FeatureAdPlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509510pNt extends C1509180pNM {
    public static final C1509510pNt LIZ = new C1509510pNt();
    public static int LIZIZ;

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeatureAdPlayTypeConfig fTypeAdPlay;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeAdPlay = features.getFTypeAdPlay()) == null || !fTypeAdPlay.getEnable()) {
            return;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_ad_play", 0, 2, null);
        if (producer$default != null) {
            producer$default.enableProducer((List<FeatureItem>) null);
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureAdPlayTypeConfig fTypeAdPlay;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeAdPlay = features.getFTypeAdPlay()) == null || !fTypeAdPlay.getEnable() || fTypeAdPlay.getRange() <= 0) {
            return;
        }
        LIZIZ = fTypeAdPlay.getRange();
        Aweme awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
        if (awemeLIZ == null) {
            return;
        }
        boolean z = c1509310pNZ.LIZLLL;
        try {
            JSONObject jSONObjectLIZ = C1509400pNi.LIZ(fTypeAdPlay.getRange(), awemeLIZ.getAid(), fTypeAdPlay.getRangeExcludeThis(), true, false);
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_ad_play", 0, 2, null);
            if (producer$default == null) {
                return;
            }
            Object objLJ = LJ(producer$default, c1509310pNZ, "a_head", "head", jSONObjectLIZ, c1510230pP3.LIZ);
            Object objLJ2 = LJ(producer$default, c1509310pNZ, "a_comment", "comment", jSONObjectLIZ, c1510230pP3.LIZ);
            Object objLJ3 = LJ(producer$default, c1509310pNZ, "a_play_time", "play_time", jSONObjectLIZ, c1510230pP3.LIZ);
            Object objLJ4 = LJ(producer$default, c1509310pNZ, "a_skip", "skip", jSONObjectLIZ, c1510230pP3.LIZ);
            LJ(producer$default, c1509310pNZ, "a_p_comment", "all_comment", jSONObjectLIZ, c1510230pP3.LIZ);
            LJ(producer$default, c1509310pNZ, "a_p_duration", "duration", jSONObjectLIZ, c1510230pP3.LIZ);
            LJ(producer$default, c1509310pNZ, "a_p_like", "all_like", jSONObjectLIZ, c1510230pP3.LIZ);
            LJ(producer$default, c1509310pNZ, "a_p_share", "all_share", jSONObjectLIZ, c1510230pP3.LIZ);
            LJ(producer$default, c1509310pNZ, "a_p_play", "all_play", jSONObjectLIZ, c1510230pP3.LIZ);
            LJ(producer$default, c1509310pNZ, "a_p_download", "all_download", jSONObjectLIZ, c1510230pP3.LIZ);
            LJ(producer$default, c1509310pNZ, "a_p_forward", "all_forward", jSONObjectLIZ, c1510230pP3.LIZ);
            if (z) {
                LJ(producer$default, c1509310pNZ, "a_aid", "aid", jSONObjectLIZ, c1510230pP3.LIZ);
            }
            Object feature$default = FeatureProducer.getFeature$default(producer$default, "like", jSONObjectLIZ, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null);
            EnumC1509550pNx enumC1509550pNx = EnumC1509550pNx.INT;
            LIZJ(c1509310pNZ, "a_like_cnt", feature$default, enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_finish_cnt", FeatureProducer.getFeature$default(producer$default, "finish", jSONObjectLIZ, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null), enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_music_cnt", FeatureProducer.getFeature$default(producer$default, "music", jSONObjectLIZ, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null), enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_follow_cnt", FeatureProducer.getFeature$default(producer$default, "follow", jSONObjectLIZ, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null), enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_share_cnt", FeatureProducer.getFeature$default(producer$default, "share", jSONObjectLIZ, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null), enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_dislike_cnt", FeatureProducer.getFeature$default(producer$default, "dislike", jSONObjectLIZ, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null), enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_click_pause_cnt", FeatureProducer.getFeature$default(producer$default, "pause", jSONObjectLIZ, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null), enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_favourite_cnt", FeatureProducer.getFeature$default(producer$default, "favorite", jSONObjectLIZ, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null), enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_enter_tag_cnt", FeatureProducer.getFeature$default(producer$default, "enter_tag", jSONObjectLIZ, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null), enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_clk_poi_cnt", FeatureProducer.getFeature$default(producer$default, "clk_poi", jSONObjectLIZ, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null), enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_head_cnt", objLJ, enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_comment_cnt", objLJ2, enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_skip_cnt", objLJ4, enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_play_time_total", objLJ3, enumC1509550pNx, C1509570pNz.LIZ);
            LIZJ(c1509310pNZ, "a_play_time_avg", objLJ3, enumC1509550pNx, C1509590pO1.LIZ);
            LIZJ(c1509310pNZ, "a_play_time_min", objLJ3, enumC1509550pNx, C1509650pO7.LIZ);
            LIZJ(c1509310pNZ, "a_play_time_max", objLJ3, enumC1509550pNx, C1509600pO2.LIZ);
            LIZJ(c1509310pNZ, "a_play_time_mid", objLJ3, enumC1509550pNx, C1509580pO0.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    public static final void LIZJ(C1509310pNZ c1509310pNZ, String str, Object obj, EnumC1509550pNx enumC1509550pNx, InterfaceC1509660pO8 interfaceC1509660pO8) {
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        if (obj instanceof ArrayList) {
            int i = C1509530pNv.LIZ[enumC1509550pNx.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    mapLIZIZ.put(str, Long.valueOf(interfaceC1509660pO8.LIZ((ArrayList) obj)));
                    return;
                }
                return;
            }
            mapLIZIZ.put(str, Integer.valueOf((int) interfaceC1509660pO8.LIZ((ArrayList) obj)));
        }
    }

    public static final Object LJ(FeatureProducer featureProducer, C1509310pNZ c1509310pNZ, String str, String str2, JSONObject jSONObject, String str3) {
        Object feature$default = FeatureProducer.getFeature$default(featureProducer, str2, jSONObject, str3, (ReturnCode) null, 8, (Object) null);
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        if (feature$default instanceof ArrayList) {
            int i = LIZIZ;
            for (Object obj : (Iterable) feature$default) {
                i--;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(i);
                mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), obj);
            }
            return feature$default;
        }
        if (feature$default == null) {
            return null;
        }
        mapLIZIZ.put(str, feature$default);
        return feature$default;
    }
}
