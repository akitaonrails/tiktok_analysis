package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.home.repo.network.WalletHomeApi;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0cBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002400cBy {
    public static final /* synthetic */ C1002400cBy LIZ = new C1002400cBy();
    public static final Map<String, WalletHomeApi> LIZIZ = new LinkedHashMap();

    public final synchronized WalletHomeApi LIZ(String str) {
        WalletHomeApi walletHomeApi;
        if (!C123100dR.LIZ(str)) {
            str = "https://f-p.sgsnssdk.com";
        }
        Map<String, WalletHomeApi> map = LIZIZ;
        walletHomeApi = (WalletHomeApi) ((LinkedHashMap) map).get(str);
        if (walletHomeApi == null) {
            walletHomeApi = (WalletHomeApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str).build().retrofit.LIZ(WalletHomeApi.class);
            map.put(str, walletHomeApi);
        }
        return walletHomeApi;
    }
}
