package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590080NCk {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C269250Agt());

    public static int LIZ() {
        Integer num;
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer = C1510050pOl.LIZ().getProducer("f_client_ai", 0);
        Object feature$default = producer != null ? FeatureProducer.getFeature$default(producer, "cur_ohr_last_status", (JSONObject) null, "in_feed", (ReturnCode) null, 10, (Object) null) : null;
        if (!(feature$default instanceof Integer) || (num = (Integer) feature$default) == null) {
            return 0;
        }
        return num.intValue();
    }
}
