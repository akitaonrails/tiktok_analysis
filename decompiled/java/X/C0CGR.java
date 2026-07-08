package X;

import com.ss.android.ugc.aweme.ecommerce.sec.captcha.EcomSecurityEventMatchersModel;
import com.ss.android.ugc.aweme.ecommerce.sec.captcha.EcomSecurityVerifySdkModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0CGR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CGR {
    public static final EcomSecurityVerifySdkModel LIZ;
    public static final List<String> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    static {
        ?? arrayList;
        EcomSecurityVerifySdkModel ecomSecurityVerifySdkModel = new EcomSecurityVerifySdkModel(0, 0, null, null, 15, null);
        EcomSecurityVerifySdkModel ecomSecurityVerifySdkModel2 = (EcomSecurityVerifySdkModel) C0C64.LJIILLIIL().LJJII(EcomSecurityVerifySdkModel.class, ecomSecurityVerifySdkModel, "ecom_security_verify_sdk_config", true);
        if (ecomSecurityVerifySdkModel2 != null) {
            ecomSecurityVerifySdkModel = ecomSecurityVerifySdkModel2;
        }
        LIZ = ecomSecurityVerifySdkModel;
        List<EcomSecurityEventMatchersModel> list = ecomSecurityVerifySdkModel.eventMatchers;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (EcomSecurityEventMatchersModel ecomSecurityEventMatchersModel : list) {
                if (ecomSecurityEventMatchersModel instanceof EcomSecurityEventMatchersModel) {
                    arrayList2.add(ecomSecurityEventMatchersModel);
                }
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = ((EcomSecurityEventMatchersModel) it2.next()).hookEvent;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        LIZIZ = arrayList;
    }

    public static HashMap LIZ() {
        HashMap map = new HashMap();
        for (Map.Entry<String, Double> entry : LIZ.samplingRates.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }
}
