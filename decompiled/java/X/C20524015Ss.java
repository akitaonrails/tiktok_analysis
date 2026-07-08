package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15Ss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20524015Ss {
    public static final C20524015Ss LIZ = new C20524015Ss();

    public static void LIZ(String str) {
        Integer numValueOf;
        Pair[] pairArr = new Pair[5];
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        if (iNetworkStateService != null) {
            numValueOf = Integer.valueOf(iNetworkStateService.getEffectiveConnectionType());
        } else {
            numValueOf = null;
        }
        pairArr[0] = new Pair("network_status", numValueOf);
        pairArr[1] = new Pair("is_background", Integer.valueOf(C1906580ziK.LJI() ? 1 : 0));
        pairArr[2] = new Pair("cancel_reason", str);
        pairArr[3] = new Pair("is_success", "2");
        pairArr[4] = new Pair("duration", 0L);
        C0NJJ.LIZ("explore_hot_cache_request", C0NJJ.LIZIZ(pairArr));
    }

    public static void LIZIZ(String str) {
        Integer numValueOf;
        Pair[] pairArr = new Pair[5];
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        if (iNetworkStateService != null) {
            numValueOf = Integer.valueOf(iNetworkStateService.getEffectiveConnectionType());
        } else {
            numValueOf = null;
        }
        pairArr[0] = new Pair("network_status", numValueOf);
        pairArr[1] = new Pair("is_background", Integer.valueOf(C1906580ziK.LJI() ? 1 : 0));
        pairArr[2] = new Pair("is_success", CardStruct.IStatusCode.DEFAULT);
        pairArr[3] = new Pair("fail_reason", str);
        pairArr[4] = new Pair("duration", 0L);
        C0NJJ.LIZ("explore_hot_cache_request", C0NJJ.LIZIZ(pairArr));
    }

    public static void LIZJ(String str) {
        C0NJJ.LIZ("explore_hot_cache_read", C0NJJ.LIZIZ(new Pair("is_background", Integer.valueOf(C1906580ziK.LJI() ? 1 : 0)), new Pair("is_success", CardStruct.IStatusCode.DEFAULT), new Pair("fail_reason", str)));
    }
}
