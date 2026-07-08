package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065390dpZ extends FeatureProducer {
    public static final C1065390dpZ LIZIZ = new C1065390dpZ();
    public static String LIZJ = "f_lemon8";

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        boolean z;
        long jCurrentTimeMillis;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (returnCode != null) {
                returnCode.code = 1;
            }
            return null;
        }
        if (Intrinsics.LJFF(str, "last_publish_interval")) {
            C1065220dpI.LIZ.getClass();
            Long l = C1065220dpI.LIZIZ;
            if (l != null && l.longValue() > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            } else {
                jCurrentTimeMillis = -1;
            }
            return Long.valueOf(jCurrentTimeMillis);
        }
        return C1065220dpI.LIZ.getFeature(str);
    }
}
