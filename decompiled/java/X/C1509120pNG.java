package X;

import com.ss.android.ugc.aweme.ml.infra.FeatureSceneTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509120pNG extends C1509180pNM {
    public static final C1509120pNG LIZ = new C1509120pNG();

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeatureSceneTypeConfig fTypeScene;
        SmartSceneConfig smartSceneConfigLIZJ = C1511360pQs.LIZJ(c1510230pP3);
        if (smartSceneConfigLIZJ != null && (features = smartSceneConfigLIZJ.getFeatures()) != null && (fTypeScene = features.getFTypeScene()) != null) {
            fTypeScene.getEnable();
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureSceneTypeConfig fTypeScene;
        Object feature$default;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeScene = features.getFTypeScene()) == null || !fTypeScene.getEnable()) {
            return;
        }
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        List<String> subTypeList = fTypeScene.getSubTypeList();
        if (subTypeList != null) {
            for (String str : subTypeList) {
                FeatureServiceManager.Companion.getClass();
                FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_scene", 0, 2, null);
                if (producer$default != null) {
                    feature$default = FeatureProducer.getFeature$default(producer$default, str, (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null);
                } else {
                    feature$default = null;
                }
                mapLIZIZ.put(str, feature$default);
            }
        }
    }
}
