package X;

import com.ss.android.ugc.aweme.search.abtest.SearchTop1PerformanceOptConfig;
import com.ss.android.ugc.aweme.search.performance.core.utils.cardpreload.CardPageLocalPreloader;
import com.ss.android.ugc.aweme.search.performance.core.utils.cardpreload.CardXmlPageLocalPreloader;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Pcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648950Pcr {
    public static final Map<EnumC648930Pcp, List<? extends InterfaceC342110Db7>> LIZ;

    static {
        int i = C0PT9.LIZ() ? R.layout.f2a : R.layout.f2_;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair(EnumC648930Pcp.SEARCH_FEATURED_ANSWER_LLM, C1697810uHb.LJIILJJIL(new CardPageLocalPreloader(AFwS196S0000000_10.get$arr$(30), C648980Pcu.LIZ())));
        pairArr[1] = new Pair(EnumC648930Pcp.SEARCH_IMAGE_ANSWER, C1697810uHb.LJIILJJIL(new CardPageLocalPreloader(AFwS196S0000000_10.get$arr$(31), C648980Pcu.LIZ())));
        EnumC648930Pcp enumC648930Pcp = EnumC648930Pcp.SEARCH_MULTI_SUMMARY_WITH_VIDEO;
        InterfaceC342110Db7[] interfaceC342110Db7Arr = new InterfaceC342110Db7[2];
        interfaceC342110Db7Arr[0] = new CardPageLocalPreloader(AFwS196S0000000_10.get$arr$(32), C648980Pcu.LIZ());
        C0PB8 c0pb8 = new C0PB8((C0BDI.LIZ() & 4) == 4 ? "snapboost_list_search_card_pov_v2.txt" : "snapboost_list_search_card_pov.txt");
        C01GW c01gw = C648980Pcu.LIZIZ;
        interfaceC342110Db7Arr[1] = new C202082145g(c0pb8, ((SearchTop1PerformanceOptConfig) c01gw.getValue()).optClassPreLoadRemain, 0, 4);
        pairArr[2] = new Pair(enumC648930Pcp, C1697810uHb.LJIILJJIL(interfaceC342110Db7Arr));
        EnumC648930Pcp enumC648930Pcp2 = EnumC648930Pcp.SEARCH_MULTI_SUMMARY_ONLINE;
        InterfaceC342110Db7[] interfaceC342110Db7Arr2 = new InterfaceC342110Db7[2];
        interfaceC342110Db7Arr2[0] = new CardPageLocalPreloader(AFwS196S0000000_10.get$arr$(33), C648980Pcu.LIZ());
        interfaceC342110Db7Arr2[1] = new C202082145g(new C0PB8((C0BDI.LIZ() & 4) != 4 ? "snapboost_list_search_card_pov.txt" : "snapboost_list_search_card_pov_v2.txt"), ((SearchTop1PerformanceOptConfig) c01gw.getValue()).optClassPreLoadRemain, 0, 4);
        pairArr[3] = new Pair(enumC648930Pcp2, C1697810uHb.LJIILJJIL(interfaceC342110Db7Arr2));
        pairArr[4] = new Pair(EnumC648930Pcp.SEARCH_HUB, C1697810uHb.LJIILJJIL(new CardPageLocalPreloader(AFwS196S0000000_10.get$arr$(34), C648980Pcu.LIZ()), new C202082145g(new C0PB8("snapboost_list_search_card_search_hub.txt"), ((SearchTop1PerformanceOptConfig) c01gw.getValue()).optClassPreLoad, 0, 4)));
        pairArr[5] = new Pair(EnumC648930Pcp.SEARCH_USER, C1697810uHb.LJIILJJIL(new CardXmlPageLocalPreloader(new C648970Pct(C2097608Jq.LJIIJ(new Pair(Integer.valueOf(R.layout.f1h), 1), new Pair(Integer.valueOf(R.layout.f0h), 3), new Pair(Integer.valueOf(R.layout.f3u), 1), new Pair(Integer.valueOf(R.layout.f3r), 3)))), new C202082145g(new C0PB8("snapboost_list_search_card_user.txt"), ((SearchTop1PerformanceOptConfig) c01gw.getValue()).optClassPreLoadRemain, 0, 4)));
        pairArr[6] = new Pair(EnumC648930Pcp.SEARCH_PHOTO, C1697810uHb.LJIILJJIL(new CardXmlPageLocalPreloader(new C648970Pct(C2097608Jq.LJIIJ(new Pair(Integer.valueOf(R.layout.f1e), 1), new Pair(Integer.valueOf(i), 1), new Pair(Integer.valueOf(R.layout.eaf), 1))))));
        LIZ = C2097608Jq.LJIIJ(pairArr);
    }

    public static Map LIZ() {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Integer.valueOf(R.layout.ev6), 1), new Pair(Integer.valueOf(R.layout.ev5), 1), new Pair(Integer.valueOf(R.layout.eyh), 2), new Pair(Integer.valueOf(R.layout.ez8), 2), new Pair(Integer.valueOf(R.layout.f0o), 4), new Pair(Integer.valueOf(R.layout.ez_), 1), new Pair(Integer.valueOf(R.layout.f0_), 2), new Pair(Integer.valueOf(R.layout.f0a), 1), new Pair(Integer.valueOf(R.layout.f07), 1), new Pair(Integer.valueOf(R.layout.f06), 6), new Pair(Integer.valueOf(R.layout.evb), 1), new Pair(Integer.valueOf(R.layout.f0c), 1));
        if ((C0BDI.LIZ() & 2) == 2) {
            mapLJIIJ.put(Integer.valueOf(R.layout.ev8), 1);
            mapLJIIJ.put(Integer.valueOf(R.layout.f2i), 1);
        }
        return mapLJIIJ;
    }
}
