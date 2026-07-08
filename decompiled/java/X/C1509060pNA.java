package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.infra.FeatureSceneTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509060pNA extends C1509180pNM {
    public static final C1509060pNA LIZ = new C1509060pNA();

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeatureSceneTypeConfig fTypeLive;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig != null && smartSceneConfig != null && (features = smartSceneConfig.getFeatures()) != null && (fTypeLive = features.getFTypeLive()) != null && fTypeLive.getEnable()) {
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_live", 0, 2, null);
            if (producer$default != null) {
                producer$default.enableProducer((List<FeatureItem>) null);
            }
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureSceneTypeConfig fTypeLive;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeLive = features.getFTypeLive()) == null || !fTypeLive.getEnable()) {
            return;
        }
        int range = fTypeLive.getRange();
        try {
            JSONObject jSONObjectLIZ = C1509400pNi.LIZ(fTypeLive.getRange(), null, fTypeLive.getRangeExcludeThis(), false, false);
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_live", 0, 2, null);
            if (producer$default == null) {
                return;
            }
            if (c1509310pNZ.LIZLLL) {
                LIZJ(producer$default, c1509310pNZ, "live_room_id", jSONObjectLIZ, range, c1510230pP3.LIZ);
            }
            LIZJ(producer$default, c1509310pNZ, "live_volume_level", jSONObjectLIZ, range, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "live_volume_change", jSONObjectLIZ, range, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "live_volume_label", jSONObjectLIZ, range, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "live_volume_increase_cnt", jSONObjectLIZ, range, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "live_volume_decrease_cnt", jSONObjectLIZ, range, c1510230pP3.LIZ);
            Object feature$default = FeatureProducer.getFeature$default(producer$default, "live_dynamic_perf_score", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null);
            if (feature$default != null) {
                c1509310pNZ.LIZIZ().put("live_dynamic_perf_score", feature$default);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    public static void LIZJ(FeatureProducer featureProducer, C1509310pNZ c1509310pNZ, String str, JSONObject jSONObject, int i, String str2) {
        Object feature$default = FeatureProducer.getFeature$default(featureProducer, str, jSONObject, str2, (ReturnCode) null, 8, (Object) null);
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        if (feature$default instanceof ArrayList) {
            Iterator it2 = new C13EO((List) feature$default).iterator();
            while (true) {
                C13EN c13en = (C13EN) it2;
                if (c13en.hasNext()) {
                    Object next = c13en.next();
                    i--;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('_');
                    sbLIZ.append(i);
                    mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), next);
                } else {
                    return;
                }
            }
        }
    }
}
