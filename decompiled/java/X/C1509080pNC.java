package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.infra.FeatureSceneTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509080pNC extends C1509180pNM {
    public static final C1509080pNC LIZ = new C1509080pNC();

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeatureSceneTypeConfig fTypeSocialRecommend;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig != null && smartSceneConfig != null && (features = smartSceneConfig.getFeatures()) != null && (fTypeSocialRecommend = features.getFTypeSocialRecommend()) != null && fTypeSocialRecommend.getEnable()) {
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_social_recommend", 0, 2, null);
            if (producer$default != null) {
                producer$default.enableProducer((List<FeatureItem>) null);
            }
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureSceneTypeConfig fTypeSocialRecommend;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeSocialRecommend = features.getFTypeSocialRecommend()) == null || !fTypeSocialRecommend.getEnable()) {
            return;
        }
        try {
            Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_social_recommend", 0, 2, null);
            if (producer$default == null) {
                return;
            }
            mapLIZIZ.put("big_card_positive_actions", FeatureProducer.getFeature$default(producer$default, "big_card_positive_actions", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("big_card_passive_positive_actions", FeatureProducer.getFeature$default(producer$default, "big_card_passive_positive_actions", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("big_card_passive_neutral_actions", FeatureProducer.getFeature$default(producer$default, "big_card_passive_neutral_actions", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("big_card_long_press_fewer_accounts", FeatureProducer.getFeature$default(producer$default, "big_card_long_press_fewer_accounts", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("big_card_passive_no_reactions", FeatureProducer.getFeature$default(producer$default, "big_card_passive_no_reactions", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("u_clk_follow_has_MuF_cnt", FeatureProducer.getFeature$default(producer$default, "u_clk_follow_has_MuF_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("u_duration_recommend_popup", FeatureProducer.getFeature$default(producer$default, "u_duration_recommend_popup", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }
}
