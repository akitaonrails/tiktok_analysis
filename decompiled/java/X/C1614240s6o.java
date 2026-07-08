package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.series.payment.api.SeriesPaymentApi;

/* JADX INFO: renamed from: X.0s6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614240s6o {
    public static SeriesPaymentApi.CreateOrderApi LIZ() {
        if (SeriesPaymentApi.LIZ == null) {
            SeriesPaymentApi.LIZ = (SeriesPaymentApi.CreateOrderApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(SeriesPaymentApi.CreateOrderApi.class);
        }
        return SeriesPaymentApi.LIZ;
    }
}
