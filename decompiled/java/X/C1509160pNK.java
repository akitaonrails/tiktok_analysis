package X;

import com.ss.android.ugc.aweme.ml.infra.FeaturePerformaceTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509160pNK extends C1509180pNM {
    public static final C1509160pNK LIZ = new C1509160pNK();

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeaturePerformaceTypeConfig fTypePerformance;
        Object feature$default;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypePerformance = features.getFTypePerformance()) == null || !fTypePerformance.getEnable()) {
            return;
        }
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        List<String> subTypeList = fTypePerformance.getSubTypeList();
        if (subTypeList != null) {
            for (String str : subTypeList) {
                FeatureServiceManager.Companion.getClass();
                FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_performance", 0, 2, null);
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
