package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.TTRetrofit;
import com.bytedance.retrofit2.Retrofit;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.CashierPayApi;
import com.ss.android.ugc.aweme.pipo.cashier.network.ProbeInterceptor;
import com.ss.android.ugc.aweme.pipo.common.network.partener.PipoNetworkMonitor;
import com.ss.android.ugc.aweme.service.IPipoOfflineService;

/* JADX INFO: renamed from: X.0uZH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708770uZH {
    public static final /* synthetic */ C1708770uZH LIZ = new C1708770uZH();

    public static CashierPayApi LIZ(String str) {
        Retrofit retrofitLIZ;
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
        c1499850p8JCreateBuilder.LIZIZ(new PipoNetworkMonitor("CASHIER"));
        c1499850p8JCreateBuilder.LIZ(new ProbeInterceptor());
        ((IPipoOfflineService) ServiceManager.get().getService(IPipoOfflineService.class)).getNetworkInterceptor();
        TTRetrofit tTRetrofitBuild = c1499850p8JCreateBuilder.build();
        INetwork iNetwork = (INetwork) PluggableExtentionKt.pluggableSpi$default(INetwork.class, false, false, false, 14, null);
        if (iNetwork != null && (retrofitLIZ = iNetwork.LIZ(tTRetrofitBuild)) != null) {
            C2175208fe.LIZ(retrofitLIZ);
            CashierPayApi cashierPayApi = (CashierPayApi) retrofitLIZ.LIZ(CashierPayApi.class);
            if (cashierPayApi != null) {
                return cashierPayApi;
            }
        }
        return (CashierPayApi) tTRetrofitBuild.retrofit.LIZ(CashierPayApi.class);
    }
}
