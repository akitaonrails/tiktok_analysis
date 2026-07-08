package X;

import com.ss.android.ugc.aweme.poi_api.experiment.PoiGeckoSyncChannels;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202010hNv {
    public static boolean LJ;
    public static final C1202010hNv LIZ = new C1202010hNv();
    public static final Map<EnumC1201990hNt, InterfaceC1631630sYr<EnumC1201990hNt, Function1<? super String, Unit>, Function1<? super String, Unit>, Function1<? super String, Unit>, Unit>> LIZIZ = new LinkedHashMap();
    public static final Map<EnumC1201990hNt, List<String>> LIZJ = new LinkedHashMap();
    public static final Map<EnumC1201990hNt, List<String>> LIZLLL = new LinkedHashMap();
    public static final C1209050hZH LJFF = C1209050hZH.get$arr$(3);
    public static final C1209050hZH LJI = C1209050hZH.get$arr$(4);

    static {
        List<String> list;
        for (EnumC1201990hNt enumC1201990hNt : EnumC1201990hNt.values()) {
            Map<EnumC1201990hNt, List<String>> map = LIZJ;
            int i = C1202000hNu.LIZ[enumC1201990hNt.ordinal()];
            if (i == 1) {
                PoiGeckoSyncChannels poiGeckoSyncChannels = C1202020hNw.LIZ().geckoSyncChannels;
                if (poiGeckoSyncChannels == null || (list = poiGeckoSyncChannels.nearbyGeckoChannels) == null) {
                    list = C13BV.INSTANCE;
                }
            } else if (i == 2) {
                PoiGeckoSyncChannels poiGeckoSyncChannels2 = C1202020hNw.LIZ().geckoSyncChannels;
                if (poiGeckoSyncChannels2 == null || (list = poiGeckoSyncChannels2.poiDetailGeckoChannels) == null) {
                    list = C13BV.INSTANCE;
                }
            } else {
                if (i != 3) {
                    throw new C1954807lC();
                }
                PoiGeckoSyncChannels poiGeckoSyncChannels3 = C1202020hNw.LIZ().geckoSyncChannels;
                if (poiGeckoSyncChannels3 == null || (list = poiGeckoSyncChannels3.poiReviewBannerGeckoChannels) == null) {
                    list = C13BV.INSTANCE;
                }
            }
            map.put(enumC1201990hNt, list);
        }
        LIZ.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        linkedHashMap.clear();
        EnumC1201990hNt enumC1201990hNt2 = EnumC1201990hNt.POI_DETAIL;
        C1209050hZH c1209050hZH = LJI;
        linkedHashMap.put(enumC1201990hNt2, c1209050hZH);
        linkedHashMap.put(EnumC1201990hNt.REVIEW_BANNER, c1209050hZH);
        linkedHashMap.put(EnumC1201990hNt.NEARBY, LJFF);
    }
}
