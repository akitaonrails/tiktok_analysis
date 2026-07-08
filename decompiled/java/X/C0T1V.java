package X;

import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.model.PreloadCommentMLModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0T1V, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T1V {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Map<String, C0T1X> LIZ;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0T32] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0T33] */
    public C0T1V() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = linkedHashMap;
        ?? r2 = new Object() { // from class: X.0T32
            public final PreloadCommentMLModel LIZ = C740020T1c.LIZ();
            public final String LIZIZ = "smart_feed_preload_comment_ml";

            public final C0T1X LIZ() {
                PreloadCommentMLModel preloadCommentMLModel = this.LIZ;
                if (preloadCommentMLModel == null) {
                    return null;
                }
                C0T1X c0t1x = new C0T1X(preloadCommentMLModel);
                SmartSceneConfig smartSceneConfig = new SmartSceneConfig();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("real#");
                sbLIZ.append(this.LIZIZ);
                smartSceneConfig.setScene(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("real#");
                sbLIZ2.append(this.LIZIZ);
                C1510230pP3 c1510230pP3 = new C1510230pP3(C2188811AlT.LIZIZ(sbLIZ2));
                c1510230pP3.LIZIZ = smartSceneConfig;
                InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
                smartSceneConfig.setFeatures(inputFeaturesConfig);
                FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                featurePlayTypeConfig.setEnable(true);
                int[] iArr = preloadCommentMLModel.params;
                featurePlayTypeConfig.setRange((iArr == null || iArr.length <= 0) ? 5 : iArr[0]);
                featurePlayTypeConfig.setSubType("");
                inputFeaturesConfig.setFTypePlay(featurePlayTypeConfig);
                MLDataCenterService.Companion.getClass();
                C1349505Px.LIZ.addSceneModelConfig(c1510230pP3);
                return c0t1x;
            }
        };
        if (!linkedHashMap.containsKey("homepage_hot")) {
            linkedHashMap.put("homepage_hot", r2.LIZ());
        }
        ?? r22 = new Object() { // from class: X.0T33
            public final PreloadCommentMLModel LIZ = C740010T1b.LIZIZ();
            public final String LIZIZ = "SmartPreloadFriendExp";

            public final C0T1X LIZ() {
                PreloadCommentMLModel preloadCommentMLModel = this.LIZ;
                if (preloadCommentMLModel == null) {
                    return null;
                }
                C0T1X c0t1x = new C0T1X(preloadCommentMLModel);
                SmartSceneConfig smartSceneConfig = new SmartSceneConfig();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("real#");
                sbLIZ.append(this.LIZIZ);
                smartSceneConfig.setScene(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("real#");
                sbLIZ2.append(this.LIZIZ);
                C1510230pP3 c1510230pP3 = new C1510230pP3(C2188811AlT.LIZIZ(sbLIZ2));
                c1510230pP3.LIZIZ = smartSceneConfig;
                InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
                smartSceneConfig.setFeatures(inputFeaturesConfig);
                FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                featurePlayTypeConfig.setEnable(true);
                int[] iArr = preloadCommentMLModel.params;
                featurePlayTypeConfig.setRange((iArr == null || iArr.length <= 0) ? 5 : iArr[0]);
                featurePlayTypeConfig.setSubType("");
                inputFeaturesConfig.setFTypePlay(featurePlayTypeConfig);
                MLDataCenterService.Companion.getClass();
                C1349505Px.LIZ.addSceneModelConfig(c1510230pP3);
                return c0t1x;
            }
        };
        if (linkedHashMap.containsKey("homepage_friends")) {
            return;
        }
        linkedHashMap.put("homepage_friends", r22.LIZ());
    }
}
