package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.series.vip.api.SeriesSubscriptionAPI;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$OrderStatusResponse;

/* JADX INFO: renamed from: X.0xAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808870xAj {
    public static SeriesSubscriptionAPI.SubscriptionRetrofitApi LIZ() {
        InterfaceC2661011f interfaceC2661011fLIZ;
        if (SeriesSubscriptionAPI.LIZIZ == null) {
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
            SeriesSubscriptionAPI.LIZIZ = (iRetrofitFactory == null || (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) == null) ? null : (SeriesSubscriptionAPI.SubscriptionRetrofitApi) interfaceC2661011fLIZ.create(SeriesSubscriptionAPI.SubscriptionRetrofitApi.class);
        }
        return SeriesSubscriptionAPI.LIZIZ;
    }

    public static AbstractC19484711Kz LIZIZ(C1808870xAj c1808870xAj, String str, String str2, int i) {
        AbstractC19484711Kz<n> orderStatus;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        c1808870xAj.getClass();
        SeriesSubscriptionAPI.SubscriptionRetrofitApi subscriptionRetrofitApiLIZ = LIZ();
        if (subscriptionRetrofitApiLIZ != null && (orderStatus = subscriptionRetrofitApiLIZ.getOrderStatus(str, str2)) != null) {
            return orderStatus.LJIL(new InterfaceC1487280oo2() { // from class: X.0xAi
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    Object c098200Yq;
                    k kVar = (k) obj;
                    C150700ht.LIZ.getClass();
                    try {
                        c098200Yq = (SeriesSubscriptionModels$OrderStatusResponse) C150700ht.LIZ().LIZJ(kVar, SeriesSubscriptionModels$OrderStatusResponse.class);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) {
                        return new SeriesSubscriptionModels$OrderStatusResponse(0, null, null, null);
                    }
                    return c098200Yq;
                }
            });
        }
        return AbstractC19484711Kz.LJIJJLI(new SeriesSubscriptionModels$OrderStatusResponse(0, null, null, null));
    }
}
