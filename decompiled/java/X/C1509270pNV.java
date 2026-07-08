package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.infra.FeaturePitayaConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509270pNV extends C1509180pNM {
    public static final C1509270pNV LIZ = new C1509270pNV();

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeaturePitayaConfig fPitaya;
        List<FeatureGroup> groups;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig != null && (features = smartSceneConfig.getFeatures()) != null && (fPitaya = features.getFPitaya()) != null && fPitaya.getEnable() && (groups = fPitaya.getGroups()) != null) {
            Iterator<FeatureGroup> it2 = groups.iterator();
            while (it2.hasNext()) {
                String str = it2.next().groupName;
                if (str != null) {
                    FeatureServiceManager.Companion.getClass();
                    if (FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), str, 0, 2, null) == null) {
                        C148D.LIZ(str);
                    }
                }
            }
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeaturePitayaConfig fPitaya;
        JSONObject jSONObject;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fPitaya = features.getFPitaya()) == null || !fPitaya.getEnable()) {
            return;
        }
        try {
            List<FeatureGroup> groups = fPitaya.getGroups();
            if (groups != null) {
                FeatureServiceManager.Companion.getClass();
                JSONObject batchFeatures$default = FeatureServiceManager.getBatchFeatures$default(C1510050pOl.LIZ(), groups, null, null, c1510230pP3.LIZ, false, 22, null);
                Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
                Iterator<FeatureGroup> it2 = groups.iterator();
                while (it2.hasNext()) {
                    String str = it2.next().groupName;
                    if (str != null) {
                        Object objOpt = batchFeatures$default.opt(str);
                        if ((objOpt instanceof JSONObject) && (jSONObject = (JSONObject) objOpt) != null) {
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                Object obj = jSONObject.get(next);
                                if (obj instanceof List) {
                                    int i = 0;
                                    for (Object obj2 : (Iterable) obj) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(next);
                                        sbLIZ.append('_');
                                        sbLIZ.append(i);
                                        mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), obj2);
                                        i++;
                                    }
                                } else {
                                    mapLIZIZ.put(next, obj);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }
}
