package X;

import com.ss.android.ugc.aweme.ml.infra.FeatureUserTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510090pOp extends C1509180pNM {
    public static final C1510090pOp LIZ = new C1510090pOp();

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeatureUserTypeConfig fTypeUser;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig != null && (features = smartSceneConfig.getFeatures()) != null && (fTypeUser = features.getFTypeUser()) != null && fTypeUser.getEnable()) {
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_user", 0, 2, null);
            if (producer$default != null) {
                producer$default.enableProducer((List<FeatureItem>) null);
            }
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureUserTypeConfig fTypeUser;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeUser = features.getFTypeUser()) == null || !fTypeUser.getEnable()) {
            return;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_user", 0, 2, null);
        if (producer$default == null) {
            return;
        }
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        mapLIZIZ.put("u_vv_cnt", FeatureProducer.getFeature$default(producer$default, "u_vv_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_comment_cnt", FeatureProducer.getFeature$default(producer$default, "u_comment_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_profile_cnt", FeatureProducer.getFeature$default(producer$default, "u_profile_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_skip_cnt", FeatureProducer.getFeature$default(producer$default, "u_skip_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_e_comment_cnt", FeatureProducer.getFeature$default(producer$default, "u_e_comment_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_live_cnt", FeatureProducer.getFeature$default(producer$default, "u_live_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_live_dur", FeatureProducer.getFeature$default(producer$default, "u_live_dur", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_clk_like_cnt", FeatureProducer.getFeature$default(producer$default, "u_clk_like_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_finish_cnt", FeatureProducer.getFeature$default(producer$default, "u_finish_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_clk_follow_cnt", FeatureProducer.getFeature$default(producer$default, "u_clk_follow_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_clk_fav_cnt", FeatureProducer.getFeature$default(producer$default, "u_clk_fav_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_clk_poi_cnt", FeatureProducer.getFeature$default(producer$default, "u_clk_poi_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_clk_music_cnt", FeatureProducer.getFeature$default(producer$default, "u_clk_music_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_clk_share_cnt", FeatureProducer.getFeature$default(producer$default, "u_clk_share_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_frd_cnt", FeatureProducer.getFeature$default(producer$default, "u_frd_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_follower_cnt", FeatureProducer.getFeature$default(producer$default, "u_follower_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_following_cnt", FeatureProducer.getFeature$default(producer$default, "u_following_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_aweme_cnt", FeatureProducer.getFeature$default(producer$default, "u_aweme_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_fav_cnt", FeatureProducer.getFeature$default(producer$default, "u_fav_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_be_fav", FeatureProducer.getFeature$default(producer$default, "u_be_fav", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_continue_skip", FeatureProducer.getFeature$default(producer$default, "u_continue_skip", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_app_stay_duration", FeatureProducer.getFeature$default(producer$default, "u_app_stay_duration", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        mapLIZIZ.put("u_clk_report", FeatureProducer.getFeature$default(producer$default, "u_clk_report", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
    }
}
