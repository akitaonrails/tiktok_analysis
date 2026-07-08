package X;

import com.ss.android.ugc.aweme.ml.infra.FeatureTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509070pNB extends C1509180pNM {
    public static final C1509070pNB LIZ = new C1509070pNB();

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeatureTypeConfig fTypeGAction;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeGAction = features.getFTypeGAction()) == null || !fTypeGAction.getEnable()) {
            return;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_g_action", 0, 2, null);
        if (producer$default != null) {
            producer$default.enableProducer((List<FeatureItem>) null);
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureTypeConfig fTypeGAction;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        Object feature$default = null;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeGAction = features.getFTypeGAction()) == null || !fTypeGAction.getEnable()) {
            return;
        }
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_g_action", 0, 2, null);
        if (producer$default != null) {
            feature$default = FeatureProducer.getFeature$default(producer$default, "global_action", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null);
        }
        for (Map.Entry entry : C19719512Dh.LIZJ(feature$default).entrySet()) {
            String str = (String) entry.getKey();
            Integer numValueOf = Integer.valueOf(((Number) entry.getValue()).intValue());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("g_");
            sbLIZ.append(str);
            sbLIZ.append("_cnt");
            mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), numValueOf);
        }
    }
}
