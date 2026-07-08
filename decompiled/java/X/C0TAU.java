package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.request.payment.MinisPaymentApi;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0TAU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TAU {
    public static MinisPaymentApi.PaymentApi LIZIZ() {
        if (MinisPaymentApi.LIZ == null) {
            MinisPaymentApi.LIZ = (MinisPaymentApi.PaymentApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(MinisPaymentApi.PaymentApi.class);
        }
        return MinisPaymentApi.LIZ;
    }

    public static Map LIZ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (MinisPaymentApi.LIZIZ.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
