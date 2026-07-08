package X;

import com.ss.android.ugc.aweme.ml.infra.FeatureByteBenchTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509140pNI extends C1509180pNM {
    public static final C1509140pNI LIZ = new C1509140pNI();

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureByteBenchTypeConfig fByteBench;
        Object feature$default;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fByteBench = features.getFByteBench()) == null || !fByteBench.getEnable()) {
            return;
        }
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        List<String> subTypeList = fByteBench.getSubTypeList();
        if (subTypeList != null) {
            for (String str : subTypeList) {
                FeatureServiceManager.Companion.getClass();
                FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_bytebench", 0, 2, null);
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
