package X;

import com.ss.android.ugc.aweme.biz.wallet.network.WalletApi;
import com.ss.android.ugc.aweme.foundation.network.interceptor.CommonParamInterceptor;
import com.ss.android.ugc.aweme.foundation.network.interceptor.NetworkMonitorHandler;
import com.ss.android.ugc.aweme.foundation.network.interceptor.SessionExpiredHandler;
import com.ss.android.ugc.aweme.foundation.network.interceptor.SessionInterceptor;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0unT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717570unT {
    public static final /* synthetic */ C1717570unT LIZ = new C1717570unT();
    public static final HashMap<String, WalletApi> LIZIZ = new HashMap<>();

    public static WalletApi LIZ(String str) {
        HashMap<String, WalletApi> map = LIZIZ;
        WalletApi walletApi = map.get(str);
        if (walletApi == null) {
            InterfaceC1547640qNO interfaceC1547640qNOLJIIJ = C1717770unn.LJIIJ();
            C1716550ulp.LIZ.getClass();
            InterfaceC1717730unj interfaceC1717730unjCreateBuilder = interfaceC1547640qNOLJIIJ.createBuilder(C1716550ulp.LIZJ(str));
            interfaceC1717730unjCreateBuilder.LIZ(new SessionInterceptor(str));
            interfaceC1717730unjCreateBuilder.LIZ(new CommonParamInterceptor());
            interfaceC1717730unjCreateBuilder.LIZIZ(new SessionExpiredHandler(str));
            interfaceC1717730unjCreateBuilder.LIZIZ(new NetworkMonitorHandler());
            WalletApi walletApi2 = (WalletApi) interfaceC1717730unjCreateBuilder.build().create(WalletApi.class);
            map.put(str, walletApi2);
            return walletApi2;
        }
        return walletApi;
    }
}
