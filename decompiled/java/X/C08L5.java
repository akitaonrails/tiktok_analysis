package X;

import com.ss.android.ugc.aweme.ecommerce.trace.EcomTraceConfigHippoModel;

/* JADX INFO: renamed from: X.08L5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08L5 {
    public static final C08L5 LIZ = new C08L5();

    public static float LIZ(String str) {
        EcomTraceConfigHippoModel ecomTraceConfigHippoModel = C08L4.LIZ.hippo;
        if (ecomTraceConfigHippoModel != null) {
            Float f = ecomTraceConfigHippoModel.rates.get(str);
            if (f != null) {
                return f.floatValue();
            }
            return ecomTraceConfigHippoModel.defaultRate;
        }
        return 0.0f;
    }
}
