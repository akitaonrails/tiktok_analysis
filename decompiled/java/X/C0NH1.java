package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NH1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NH1 {
    public static final C0NH1 LIZ = new C0NH1();

    public static void LIZLLL(String str) {
        LIZ("offline_video_useout", C591500NHw.LIZ(new Pair("enter_from", str)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C0NH5 r8) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NH1.LJFF(X.0NH5):void");
    }

    public static void LIZ(final String str, final JSONObject jSONObject) {
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0NH3
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GoldenHouseTrace@f41c.asyncReportEvent$1");
                try {
                    C20684815ws.LJIJ(str, jSONObject);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GoldenHouseTrace@f41c.asyncReportEvent$1");
            }
        });
    }

    public static void LIZJ(int i, C0NHJ c0nhj) {
        Integer numValueOf;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("cache_type", 2);
        pairArr[1] = new Pair("is_background", Integer.valueOf(C1906580ziK.LJI() ? 1 : 0));
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        if (iNetworkStateService != null) {
            numValueOf = Integer.valueOf(iNetworkStateService.getEffectiveConnectionType());
        } else {
            numValueOf = null;
        }
        pairArr[2] = new Pair("network_status", numValueOf);
        pairArr[3] = new Pair("internet_speed", String.valueOf(C1479130oat.LJII()));
        C0S4J c0s4j = C0NH6.LJIILLIIL;
        pairArr[4] = new Pair("remaining_cache_cnt", Integer.valueOf(C591300NHc.LIZ().getSize()));
        pairArr[5] = new Pair("cache_cnt", Integer.valueOf(i));
        pairArr[6] = new Pair("request_reason", Integer.valueOf(c0nhj.getReasonInt()));
        LIZ("cache_feed_request", C591500NHw.LIZ(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(com.ss.android.ugc.aweme.feed.ghouse.CacheEntry r13, boolean r14, long r15, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NH1.LJ(com.ss.android.ugc.aweme.feed.ghouse.CacheEntry, boolean, long, java.lang.String):void");
    }

    public static void LIZIZ(boolean z, int i, long j, int i2, String str, Integer num) {
        Integer numValueOf;
        String str2;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("cache_type", 2);
        pairArr[1] = new Pair("is_background", Integer.valueOf(C1906580ziK.LJI() ? 1 : 0));
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        if (iNetworkStateService != null) {
            numValueOf = Integer.valueOf(iNetworkStateService.getEffectiveConnectionType());
        } else {
            numValueOf = null;
        }
        pairArr[2] = new Pair("network_status", numValueOf);
        pairArr[3] = new Pair("internet_speed", String.valueOf(C1479130oat.LJII()));
        pairArr[4] = new Pair("added_cache_cnt", Integer.valueOf(i));
        pairArr[5] = new Pair("duration", Long.valueOf(j));
        pairArr[6] = new Pair("cache_cnt", Integer.valueOf(i2));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[7] = new Pair("is_success", str2);
        pairArr[8] = new Pair("error_msg", str);
        pairArr[9] = new Pair("error_code", num);
        LIZ("cache_feed_request_response", C591500NHw.LIZ(pairArr));
    }
}
