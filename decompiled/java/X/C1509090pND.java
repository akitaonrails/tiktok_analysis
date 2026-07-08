package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.infra.FeatureSceneTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pND, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509090pND extends C1509180pNM {
    public static final C1509090pND LIZ = new C1509090pND();

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureSceneTypeConfig fAudio;
        Object feature$default;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fAudio = features.getFAudio()) == null || !fAudio.getEnable()) {
            return;
        }
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        try {
            JSONObject jSONObjectPut = new JSONObject().put("aweme", C1511360pQs.LIZ(c1509310pNZ));
            List<String> subTypeList = fAudio.getSubTypeList();
            if (subTypeList != null) {
                for (String str : subTypeList) {
                    FeatureServiceManager.Companion.getClass();
                    FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_audio", 0, 2, null);
                    if (producer$default != null) {
                        feature$default = FeatureProducer.getFeature$default(producer$default, str, jSONObjectPut, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null);
                    } else {
                        feature$default = null;
                    }
                    mapLIZIZ.put(str, feature$default);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }
}
