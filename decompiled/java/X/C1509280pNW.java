package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.TTMFeatureConfig;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509280pNW extends C1509180pNM {
    public static final C1509280pNW LIZ = new C1509280pNW();

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        TTMFeatureConfig fttm;
        List<FeatureGroup> groups;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig != null && (features = smartSceneConfig.getFeatures()) != null && (fttm = features.getFTTM()) != null && fttm.getEnable() && (groups = fttm.getGroups()) != null) {
            FeatureServiceManager.Companion.getClass();
            C1510050pOl.LIZ().enableBatchProducer(groups);
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        TTMFeatureConfig fttm;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fttm = features.getFTTM()) == null || !fttm.getEnable()) {
            return;
        }
        try {
            List<FeatureGroup> groups = fttm.getGroups();
            if (groups != null) {
                FeatureServiceManager.Companion.getClass();
                JSONObject batchFeatures$default = FeatureServiceManager.getBatchFeatures$default(C1510050pOl.LIZ(), groups, fttm.getFlattenConfig(), C1509290pNX.LIZ(c1509310pNZ), c1510230pP3.LIZ, false, 16, null);
                Iterator<String> itKeys = batchFeatures$default.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c1509310pNZ.LIZIZ().put(next, batchFeatures$default.get(next));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }
}
