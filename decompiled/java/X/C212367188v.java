package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.188v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212367188v {
    public static BcmParams LIZ(String str) {
        BcmParams bcmParams = new BcmParams();
        bcmParams.merge(str);
        return bcmParams;
    }

    public static BcmParams LIZIZ(JSONObject jSONObject) {
        BcmParams bcmParams = new BcmParams();
        bcmParams.merge(jSONObject);
        return bcmParams;
    }

    public static BcmParams LIZJ(Map map) {
        BcmParams bcmParams = new BcmParams();
        bcmParams.merge((Map<String, ? extends Object>) map);
        return bcmParams;
    }
}
