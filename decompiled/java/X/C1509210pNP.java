package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.FeatureVodConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509210pNP extends C1509180pNM {
    public static final C1509210pNP LIZ = new C1509210pNP();

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeatureVodConfig fVod;
        SmartSceneConfig smartSceneConfigLIZJ = C1511360pQs.LIZJ(c1510230pP3);
        if (smartSceneConfigLIZJ == null || (features = smartSceneConfigLIZJ.getFeatures()) == null || (fVod = features.getFVod()) == null || !fVod.getEnable()) {
            return;
        }
        C1509440pNm.LIZIZ.getClass();
        C1509440pNm.LIZLLL = true;
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureVodConfig fVod;
        List<String> subTypeList;
        Object feature$default;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fVod = features.getFVod()) == null || !fVod.getEnable()) {
            return;
        }
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        Aweme awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
        if (awemeLIZ != null && (subTypeList = fVod.getSubTypeList()) != null) {
            for (String str : subTypeList) {
                FeatureServiceManager.Companion.getClass();
                FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_vod", 0, 2, null);
                if (producer$default != null) {
                    feature$default = FeatureProducer.getFeature$default(producer$default, str, new JSONObject().put("aid", awemeLIZ.getAid()), c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null);
                } else {
                    feature$default = null;
                }
                mapLIZIZ.put(str, feature$default);
            }
        }
    }
}
