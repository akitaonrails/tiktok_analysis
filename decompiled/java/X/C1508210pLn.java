package X;

import com.ss.android.ugc.aweme.ecommerce.api.PDPNetworkControlConfig;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;

/* JADX INFO: renamed from: X.0pLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508210pLn {
    public static boolean LIZ;
    public static final PDPNetworkControlConfig LIZIZ;
    public static boolean LIZJ;
    public static final DispatchConfig LIZLLL;

    static {
        DispatchConfig dispatchConfig;
        PDPNetworkControlConfig pDPNetworkControlConfig = C1508200pLm.LIZ;
        LIZIZ = pDPNetworkControlConfig;
        if (pDPNetworkControlConfig != null) {
            int i = pDPNetworkControlConfig.maxDelay;
            dispatchConfig = new DispatchConfig("EC_PDP", i, null, C13LP.LLIIJI(pDPNetworkControlConfig.blackList), null, i, 0, C13LP.LLIIJI(pDPNetworkControlConfig.highPrioApis), null, null, null, null, null, 8020, null);
        } else {
            dispatchConfig = null;
        }
        LIZLLL = dispatchConfig;
    }

    public static void LIZ() {
        if (LIZJ && LIZLLL != null) {
            C1507890pLH c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ();
            if (c1507890pLHLIZ != null) {
                c1507890pLHLIZ.LIZIZ.LJI.LIZ = 0L;
            }
            C1490190osj.LIZIZ.LIZJ(EnumC2262571Dh9.EC_PDP);
            LIZJ = false;
        }
    }
}
