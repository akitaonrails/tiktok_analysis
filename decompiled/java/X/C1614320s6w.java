package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.payment.MarketplacePaymentApi;

/* JADX INFO: renamed from: X.0s6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614320s6w {
    public static MarketplacePaymentApi.CreateOrderApi LIZ() {
        if (MarketplacePaymentApi.LIZIZ == null) {
            MarketplacePaymentApi.LIZIZ = (MarketplacePaymentApi.CreateOrderApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(MarketplacePaymentApi.LIZ).create(MarketplacePaymentApi.CreateOrderApi.class);
        }
        return MarketplacePaymentApi.LIZIZ;
    }
}
