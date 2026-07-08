package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.config.ECWeakNetworkConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07Ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1850107Ml {
    public static final C1850107Ml LIZ = new C1850107Ml();
    public static final ECWeakNetworkConfig LIZIZ = new ECWeakNetworkConfig(0, null, 3, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(874));

    public static boolean LIZ() {
        EnumC325100Com networkStatus;
        try {
            C01GW c01gw = LIZJ;
            int i = ((ECWeakNetworkConfig) c01gw.getValue()).networkMode;
            if (i == 1) {
                INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
                return iNetworkStateService != null && iNetworkStateService.isWeakNetwork();
            }
            if (i != 2) {
                return false;
            }
            List<String> list = ((ECWeakNetworkConfig) c01gw.getValue()).weakNetworkScope;
            INetworkStateService iNetworkStateService2 = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
            return C13LP.LJJJJ((iNetworkStateService2 == null || (networkStatus = iNetworkStateService2.getNetworkStatus()) == null) ? null : networkStatus.name(), list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
