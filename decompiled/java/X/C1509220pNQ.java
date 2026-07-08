package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.ml.infra.FeatureClientAiTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509220pNQ extends C1509180pNM {
    public static final C1509220pNQ LIZ = new C1509220pNQ();

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) throws JSONException {
        InputFeaturesConfig features;
        FeatureClientAiTypeConfig fTypeClientAi;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeClientAi = features.getFTypeClientAi()) == null || !fTypeClientAi.getEnable()) {
            return;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_client_ai", 0, 2, null);
        if (producer$default == null) {
            return;
        }
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        SmartHARService.Companion.getClass();
        if (C1511980pRs.LIZ().enable()) {
            mapLIZIZ.put("cur_har", FeatureProducer.getFeature$default(producer$default, "cur_har_last_status", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            int range = fTypeClientAi.getRange();
            if (range > 0) {
                JSONObject jSONObjectPut = new JSONObject().put("range", range);
                mapLIZIZ.put("last_n_har", FeatureProducer.getFeature$default(producer$default, "last_range_most_status", jSONObjectPut, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null));
                Object feature$default = FeatureProducer.getFeature$default(producer$default, "last_range_status", jSONObjectPut, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null);
                if (feature$default instanceof List) {
                    int i = 1;
                    while (true) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("har_");
                        sbLIZ.append(i);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        Object obj = ListProtector.get((List) feature$default, i - 1);
                        if (obj == null) {
                            obj = 0;
                        }
                        mapLIZIZ.put(strLIZIZ, obj);
                        if (i == range) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        Object feature$default2 = FeatureProducer.getFeature$default(producer$default, "cur_ohr_last_result", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null);
        if (feature$default2 instanceof Map) {
            for (Map.Entry entry : ((Map) feature$default2).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ohr_");
                sbLIZ2.append((String) key);
                mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ2), value);
            }
        }
    }
}
