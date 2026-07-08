package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sAY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616560sAY {
    public static final Map<String, Integer> LIZ = C2097608Jq.LJIIJ(new Pair("ITabletDiff.webView", 2), new Pair("ITabletFeed.isOptShareDialog", 2), new Pair("ITabletSearch.getDiscoverCoverViewSize", 2), new Pair("ITabletSearch.getDiscoverBannerHeight", 2), new Pair("ITabletSearch.setDiscoverBannerPadding", 2), new Pair("ITabletSearch.getDiscoverBannerMaxCountAndIndex", 2));

    public static boolean LIZ(String str) {
        Integer num = (Integer) ((LinkedHashMap) LIZ).get(str);
        if (num == null || 2 != num.intValue()) {
            return false;
        }
        C20593115i5.LIZ.getClass();
        return !C20593115i5.LJIIL(null);
    }
}
