package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509340pNc {
    public static volatile int LIZ = -999;

    public static boolean LIZ() {
        if (LIZ == -999) {
            ReturnCode returnCode = new ReturnCode(-1, -1);
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_client_ai", 0, 2, null);
            Object feature$default = producer$default != null ? FeatureProducer.getFeature$default(producer$default, "dynamic_stable_perf_level", (JSONObject) null, "poi_top_videos", returnCode, 2, (Object) null) : null;
            if (returnCode.code == 200 && (feature$default instanceof Integer)) {
                LIZ = ((Number) feature$default).intValue();
            }
        }
        return LIZ != -999 && LIZ <= 0;
    }
}
