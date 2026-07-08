package X;

import com.ss.android.ugc.aweme.experiment.pythia.PythiaLowDeviceConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DCh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251971DCh {
    public static boolean LIZ() {
        Object feature$default;
        Float f;
        C01GW c01gw = C2251981DCi.LIZIZ;
        if (!((PythiaLowDeviceConfig) c01gw.getValue()).open) {
            return true;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_client_ai", 0, 2, null);
        if (producer$default == null || (feature$default = FeatureProducer.getFeature$default(producer$default, "dynamic_perf_stable_score", (JSONObject) null, "pythia_low_device_downgrade", (ReturnCode) null, 10, (Object) null)) == null || !(feature$default instanceof Float) || (f = (Float) feature$default) == null) {
            return false;
        }
        float fFloatValue = f.floatValue();
        return fFloatValue > ((PythiaLowDeviceConfig) c01gw.getValue()).minEffectScoce && fFloatValue < ((PythiaLowDeviceConfig) c01gw.getValue()).maxEffectScoce;
    }
}
