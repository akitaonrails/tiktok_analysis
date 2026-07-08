package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.api.CashierApi;
import com.ss.android.ugc.aweme.pipo.cashier.network.ProbeInterceptor;
import com.ss.android.ugc.aweme.pipo.common.network.partener.PipoNetworkMonitor;
import com.ss.android.ugc.aweme.service.IPipoOfflineService;

/* JADX INFO: renamed from: X.0uZJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708790uZJ {
    public static final /* synthetic */ C1708790uZJ LIZ = new C1708790uZJ();

    public static CashierApi LIZ(String str) {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
        c1499850p8JCreateBuilder.LIZIZ(new PipoNetworkMonitor("CASHIER"));
        c1499850p8JCreateBuilder.LIZ(new ProbeInterceptor());
        ((IPipoOfflineService) ServiceManager.get().getService(IPipoOfflineService.class)).getNetworkInterceptor();
        return (CashierApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(CashierApi.class);
    }
}
