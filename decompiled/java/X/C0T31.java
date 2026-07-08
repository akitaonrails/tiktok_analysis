package X;

import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment$PreloadProfileMLModel;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* JADX INFO: renamed from: X.0T31, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T31 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final SmartPreloadProfileV2Experiment$PreloadProfileMLModel LIZ;

    public C0T31() {
        SmartPreloadProfileV2Experiment$PreloadProfileMLModel smartPreloadProfileV2Experiment$PreloadProfileMLModelLIZ = C740150T1p.LIZ();
        this.LIZ = smartPreloadProfileV2Experiment$PreloadProfileMLModelLIZ;
        if (smartPreloadProfileV2Experiment$PreloadProfileMLModelLIZ != null) {
            SmartSceneConfig smartSceneConfig = new SmartSceneConfig();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("real#");
            sbLIZ.append("smart_feed_preload_profile_ml");
            smartSceneConfig.setScene(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("real#");
            sbLIZ2.append("smart_feed_preload_profile_ml");
            C1510230pP3 c1510230pP3 = new C1510230pP3(C2188811AlT.LIZIZ(sbLIZ2));
            InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
            smartSceneConfig.setFeatures(inputFeaturesConfig);
            FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
            featurePlayTypeConfig.setEnable(true);
            int[] iArr = smartPreloadProfileV2Experiment$PreloadProfileMLModelLIZ.params;
            featurePlayTypeConfig.setRange((iArr == null || iArr.length <= 0) ? 5 : iArr[0]);
            featurePlayTypeConfig.setSubType("");
            inputFeaturesConfig.setFTypePlay(featurePlayTypeConfig);
            MLDataCenterService.Companion.getClass();
            C1349505Px.LIZ.addSceneModelConfig(c1510230pP3);
        }
        SmartPreloadProfileV2Service.Companion.getClass();
    }
}
