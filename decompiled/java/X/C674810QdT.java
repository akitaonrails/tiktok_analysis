package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674810QdT {
    public static final C674810QdT LIZ = new C674810QdT();
    public static final ConcurrentHashMap<String, C674990Qdl> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C674980Qdk> LIZJ = new ConcurrentHashMap<>();

    public static C674990Qdl LIZJ(String str) {
        ConcurrentHashMap<String, C674990Qdl> concurrentHashMap = LIZIZ;
        C674990Qdl c674990Qdl = concurrentHashMap.get(str);
        if (c674990Qdl == null) {
            return null;
        }
        C674790QdR.LIZ.getClass();
        if (System.currentTimeMillis() - c674990Qdl.LIZJ > C1208504o7.LIZ) {
            concurrentHashMap.remove(str, c674990Qdl);
            return null;
        }
        if (!concurrentHashMap.remove(str, c674990Qdl)) {
            return null;
        }
        return c674990Qdl;
    }

    public static Map LIZ(C674940Qdg c674940Qdg, C674940Qdg c674940Qdg2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!Intrinsics.LJFF(c674940Qdg.LIZ, c674940Qdg2.LIZ)) {
            linkedHashMap.put("imageTosUri", new Pair(c674940Qdg.LIZ, c674940Qdg2.LIZ));
        }
        if (!Intrinsics.LJFF(c674940Qdg.LIZIZ, c674940Qdg2.LIZIZ)) {
            linkedHashMap.put("detection", new Pair(c674940Qdg.LIZIZ, c674940Qdg2.LIZIZ));
        }
        if (!Intrinsics.LJFF(c674940Qdg.LIZJ, c674940Qdg2.LIZJ)) {
            linkedHashMap.put("detectionIdx", new Pair(c674940Qdg.LIZJ, c674940Qdg2.LIZJ));
        }
        if (!Intrinsics.LJFF(c674940Qdg.LIZLLL, c674940Qdg2.LIZLLL)) {
            linkedHashMap.put("cursor", new Pair(c674940Qdg.LIZLLL, c674940Qdg2.LIZLLL));
        }
        if (!Intrinsics.LJFF(c674940Qdg.LJ, c674940Qdg2.LJ)) {
            linkedHashMap.put("enterFrom", new Pair(c674940Qdg.LJ, c674940Qdg2.LJ));
        }
        if (!Intrinsics.LJFF(c674940Qdg.LJFF, c674940Qdg2.LJFF)) {
            linkedHashMap.put("source", new Pair(c674940Qdg.LJFF, c674940Qdg2.LJFF));
        }
        if (!Intrinsics.LJFF(c674940Qdg.LJI, c674940Qdg2.LJI)) {
            linkedHashMap.put("searchSource", new Pair(c674940Qdg.LJI, c674940Qdg2.LJI));
        }
        int i = c674940Qdg.LJII;
        if (i != c674940Qdg2.LJII) {
            linkedHashMap.put("userInteractionType", new Pair(Integer.valueOf(i), Integer.valueOf(c674940Qdg2.LJII)));
        }
        if (!Intrinsics.LJFF(c674940Qdg.LJIIIIZZ, c674940Qdg2.LJIIIIZZ)) {
            linkedHashMap.put("imageHash", new Pair(c674940Qdg.LJIIIIZZ, c674940Qdg2.LJIIIIZZ));
        }
        return linkedHashMap;
    }

    public static Map LIZIZ(C674800QdS c674800QdS, C674800QdS c674800QdS2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!Intrinsics.LJFF(c674800QdS.keyword, c674800QdS2.keyword)) {
            linkedHashMap.put("keyword", new Pair(c674800QdS.keyword, c674800QdS2.keyword));
        }
        if (!Intrinsics.LJFF(c674800QdS.searchSource, c674800QdS2.searchSource)) {
            linkedHashMap.put("searchSource", new Pair(c674800QdS.searchSource, c674800QdS2.searchSource));
        }
        if (!Intrinsics.LJFF(c674800QdS.source, c674800QdS2.source)) {
            linkedHashMap.put("source", new Pair(c674800QdS.source, c674800QdS2.source));
        }
        int i = c674800QdS.hotSearch;
        if (i != c674800QdS2.hotSearch) {
            linkedHashMap.put("hotSearch", new Pair(Integer.valueOf(i), Integer.valueOf(c674800QdS2.hotSearch)));
        }
        int i2 = c674800QdS.correctType;
        if (i2 != c674800QdS2.correctType) {
            linkedHashMap.put("correctType", new Pair(Integer.valueOf(i2), Integer.valueOf(c674800QdS2.correctType)));
        }
        if (!Intrinsics.LJFF(c674800QdS.searchId, c674800QdS2.searchId)) {
            linkedHashMap.put("searchId", new Pair(c674800QdS.searchId, c674800QdS2.searchId));
        }
        if (!Intrinsics.LJFF(c674800QdS.lastSearchId, c674800QdS2.lastSearchId)) {
            linkedHashMap.put("lastSearchId", new Pair(c674800QdS.lastSearchId, c674800QdS2.lastSearchId));
        }
        long j = c674800QdS.cursor;
        if (j != c674800QdS2.cursor) {
            linkedHashMap.put("cursor", new Pair(Long.valueOf(j), Long.valueOf(c674800QdS2.cursor)));
        }
        int i3 = c674800QdS.count;
        if (i3 != c674800QdS2.count) {
            linkedHashMap.put("count", new Pair(Integer.valueOf(i3), Integer.valueOf(c674800QdS2.count)));
        }
        if (!Intrinsics.LJFF(c674800QdS.enterFrom, c674800QdS2.enterFrom)) {
            linkedHashMap.put("enterFrom", new Pair(c674800QdS.enterFrom, c674800QdS2.enterFrom));
        }
        if (!Intrinsics.LJFF(c674800QdS.searchChannel, c674800QdS2.searchChannel)) {
            linkedHashMap.put("searchChannel", new Pair(c674800QdS.searchChannel, c674800QdS2.searchChannel));
        }
        if (!Intrinsics.LJFF(c674800QdS.sugTagText, c674800QdS2.sugTagText)) {
            linkedHashMap.put("sugTagText", new Pair(c674800QdS.sugTagText, c674800QdS2.sugTagText));
        }
        if (!Intrinsics.LJFF(c674800QdS.sugType, c674800QdS2.sugType)) {
            linkedHashMap.put("sugType", new Pair(c674800QdS.sugType, c674800QdS2.sugType));
        }
        if (!Intrinsics.LJFF(c674800QdS.sugQueryState, c674800QdS2.sugQueryState)) {
            linkedHashMap.put("sugQueryState", new Pair(c674800QdS.sugQueryState, c674800QdS2.sugQueryState));
        }
        if (!Intrinsics.LJFF(c674800QdS.sugCreatorId, c674800QdS2.sugCreatorId)) {
            linkedHashMap.put("sugCreatorId", new Pair(c674800QdS.sugCreatorId, c674800QdS2.sugCreatorId));
        }
        if (!Intrinsics.LJFF(c674800QdS.attachProducts, c674800QdS2.attachProducts)) {
            linkedHashMap.put("attachProducts", new Pair(c674800QdS.attachProducts, c674800QdS2.attachProducts));
        }
        if (!Intrinsics.LJFF(c674800QdS.trafficSourceList, c674800QdS2.trafficSourceList)) {
            linkedHashMap.put("trafficSourceList", new Pair(c674800QdS.trafficSourceList, c674800QdS2.trafficSourceList));
        }
        if (!Intrinsics.LJFF(c674800QdS.sugShopId, c674800QdS2.sugShopId)) {
            linkedHashMap.put("sugShopId", new Pair(c674800QdS.sugShopId, c674800QdS2.sugShopId));
        }
        if (!Intrinsics.LJFF(c674800QdS.ecSearchSessionId, c674800QdS2.ecSearchSessionId)) {
            linkedHashMap.put("ecSearchSessionId", new Pair(c674800QdS.ecSearchSessionId, c674800QdS2.ecSearchSessionId));
        }
        if (!Intrinsics.LJFF(c674800QdS.chunkSizeList, c674800QdS2.chunkSizeList)) {
            linkedHashMap.put("chunkSizeList", new Pair(c674800QdS.chunkSizeList, c674800QdS2.chunkSizeList));
        }
        if (c674800QdS.isFilterSearch() != c674800QdS2.isFilterSearch()) {
            linkedHashMap.put("isFilterSearch", new Pair(Integer.valueOf(c674800QdS.isFilterSearch()), Integer.valueOf(c674800QdS2.isFilterSearch())));
        }
        if (!Intrinsics.LJFF(c674800QdS.pageType, c674800QdS2.pageType)) {
            linkedHashMap.put("pageType", new Pair(c674800QdS.pageType, c674800QdS2.pageType));
        }
        if (!Intrinsics.LJFF(c674800QdS.apiVersion, c674800QdS2.apiVersion)) {
            linkedHashMap.put("apiVersion", new Pair(c674800QdS.apiVersion, c674800QdS2.apiVersion));
        }
        if (!Intrinsics.LJFF(c674800QdS.searchSessionId, c674800QdS2.searchSessionId)) {
            linkedHashMap.put("searchSessionId", new Pair(c674800QdS.searchSessionId, c674800QdS2.searchSessionId));
        }
        if (!Intrinsics.LJFF(c674800QdS.filtersData, c674800QdS2.filtersData)) {
            linkedHashMap.put("filtersData", new Pair(c674800QdS.filtersData, c674800QdS2.filtersData));
        }
        if (!Intrinsics.LJFF(c674800QdS.lastSearchPidList, c674800QdS2.lastSearchPidList)) {
            linkedHashMap.put("lastSearchPidList", new Pair(c674800QdS.lastSearchPidList, c674800QdS2.lastSearchPidList));
        }
        if (!Intrinsics.LJFF(c674800QdS.endToEndSearchSessionId, c674800QdS2.endToEndSearchSessionId)) {
            linkedHashMap.put("endToEndSearchSessionId", new Pair(c674800QdS.endToEndSearchSessionId, c674800QdS2.endToEndSearchSessionId));
        }
        if (!Intrinsics.LJFF(c674800QdS.useNewFilterArch, c674800QdS2.useNewFilterArch)) {
            linkedHashMap.put("useNewFilterArch", new Pair(c674800QdS.useNewFilterArch, c674800QdS2.useNewFilterArch));
        }
        if (!Intrinsics.LJFF(c674800QdS.isNonPersonalizedSearch(), c674800QdS2.isNonPersonalizedSearch())) {
            linkedHashMap.put("isNonPersonalizedSearch", new Pair(c674800QdS.isNonPersonalizedSearch(), c674800QdS2.isNonPersonalizedSearch()));
        }
        if (!Intrinsics.LJFF(c674800QdS.dmaConsentStatus, c674800QdS2.dmaConsentStatus)) {
            linkedHashMap.put("dmaConsentStatus", new Pair(c674800QdS.dmaConsentStatus, c674800QdS2.dmaConsentStatus));
        }
        if (!Intrinsics.LJFF(c674800QdS.edmConsentStatus, c674800QdS2.edmConsentStatus)) {
            linkedHashMap.put("edmConsentStatus", new Pair(c674800QdS.edmConsentStatus, c674800QdS2.edmConsentStatus));
        }
        if (!Intrinsics.LJFF(c674800QdS.newUserExtraInfo, c674800QdS2.newUserExtraInfo)) {
            linkedHashMap.put("newUserExtraInfo", new Pair(c674800QdS.newUserExtraInfo, c674800QdS2.newUserExtraInfo));
        }
        if (!Intrinsics.LJFF(c674800QdS.nineSearchProductId, c674800QdS2.nineSearchProductId)) {
            linkedHashMap.put("nineSearchProductId", new Pair(c674800QdS.nineSearchProductId, c674800QdS2.nineSearchProductId));
        }
        if (!Intrinsics.LJFF(c674800QdS.searchKeywordStrategy, c674800QdS2.searchKeywordStrategy)) {
            linkedHashMap.put("searchKeywordStrategy", new Pair(c674800QdS.searchKeywordStrategy, c674800QdS2.searchKeywordStrategy));
        }
        if (!Intrinsics.LJFF(c674800QdS.enterFromSecond, c674800QdS2.enterFromSecond)) {
            linkedHashMap.put("enterFromSecond", new Pair(c674800QdS.enterFromSecond, c674800QdS2.enterFromSecond));
        }
        if (!Intrinsics.LJFF(c674800QdS.searchPromotionParams, c674800QdS2.searchPromotionParams)) {
            linkedHashMap.put("searchPromotionParams", new Pair(c674800QdS.searchPromotionParams, c674800QdS2.searchPromotionParams));
        }
        return linkedHashMap;
    }

    public static void LJ(String str, C674800QdS c674800QdS) {
        try {
            C674800QdS c674800QdSCopy = c674800QdS.copy(c674800QdS.keyword, c674800QdS.searchSource, c674800QdS.source, c674800QdS.hotSearch, c674800QdS.correctType, c674800QdS.searchId, c674800QdS.lastSearchId, c674800QdS.cursor, c674800QdS.count, c674800QdS.enterFrom, c674800QdS.searchChannel, c674800QdS.sugTagText, c674800QdS.sugType, c674800QdS.sugQueryState, c674800QdS.sugCreatorId, c674800QdS.attachProducts, c674800QdS.mockAttachProducts, c674800QdS.trafficSourceList, c674800QdS.sugShopId, c674800QdS.chunkSizeList, c674800QdS.isFilterSearch, c674800QdS.pageType, c674800QdS.apiVersion, c674800QdS.filtersData, c674800QdS.lastSearchPidList, c674800QdS.endToEndSearchSessionId, c674800QdS.useNewFilterArch, c674800QdS.isNonPersonalizedSearch, c674800QdS.dmaConsentStatus, c674800QdS.edmConsentStatus, c674800QdS.newUserExtraInfo, c674800QdS.nineSearchProductId, c674800QdS.searchKeywordStrategy, c674800QdS.enterFromSecond, c674800QdS.searchPromotionParams);
            c674800QdSCopy.setRootEnterFromType(c674800QdS.rootEnterFromType);
            long jCurrentTimeMillis = System.currentTimeMillis();
            LIZIZ.put("/aweme/v1/search/stream/bff/ecom/", new C674990Qdl(str, c674800QdSCopy, jCurrentTimeMillis));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recordPreloadRequest: preloadKey=");
            sbLIZ.append(str);
            sbLIZ.append(", path=");
            sbLIZ.append("/aweme/v1/search/stream/bff/ecom/");
            sbLIZ.append(", keyword=");
            sbLIZ.append(c674800QdSCopy.keyword);
            sbLIZ.append(", searchId=");
            sbLIZ.append(c674800QdSCopy.searchId);
            sbLIZ.append(", startTime=");
            sbLIZ.append(jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZLLL(final C674880Qda c674880Qda, final String str, final Integer num, final String str2, final String str3, final String str4, C15O7<?> c15o7) {
        try {
            if (c674880Qda.LIZ && c15o7 != null) {
                c15o7.LIZLLL(new InterfaceC2385309Wh() { // from class: X.0Qdd
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o72) {
                        C1C7U.LIZ("PreloadCacheHitRateTracker@5e37.recordActualRequestByMonitor$1");
                        C674810QdT.LJFF(c674880Qda, str, num, str2, str3, str4, System.currentTimeMillis(), null);
                        C1C7U.LIZIZ("PreloadCacheHitRateTracker@5e37.recordActualRequestByMonitor$1");
                        return c15o72;
                    }
                });
            } else {
                LJFF(c674880Qda, str, num, str2, str3, str4, c674880Qda.LJI, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJFF(C674880Qda c674880Qda, String str, Integer num, String str2, String str3, String str4, long j, Long l) {
        long jLongValue;
        String strName;
        if (l == null) {
            l = c674880Qda.LJFF;
        }
        long j2 = -1;
        if (l != null) {
            jLongValue = j - l.longValue();
        } else {
            jLongValue = -1;
        }
        long j3 = j - c674880Qda.LJI;
        if (jLongValue >= 0) {
            j2 = jLongValue - j3;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_hit", c674880Qda.LIZ);
        jSONObject.put("path", str);
        jSONObject.put("actual_network_time", jLongValue);
        jSONObject.put("cache_time", j3);
        jSONObject.put("saved_time", j2);
        jSONObject.put("root_enter_from_type", num);
        jSONObject.put("enter_from", str2);
        jSONObject.put("enter_method", str3);
        jSONObject.put("page", str4);
        EnumC1158510gFl enumC1158510gFl = c674880Qda.LJIIIIZZ;
        String strName2 = null;
        if (enumC1158510gFl != null) {
            strName = enumC1158510gFl.name();
        } else {
            strName = null;
        }
        jSONObject.put("miss_reason", strName);
        jSONObject.put("key_type", c674880Qda.LIZLLL);
        EnumC994770bzf enumC994770bzf = c674880Qda.LJ;
        if (enumC994770bzf != null) {
            strName2 = enumC994770bzf.name();
        }
        jSONObject.put("cache_mode", strName2);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_search_prefetch_hit", jSONObject);
    }

    public static void LJI(String str, Map map, long j, long j2, long j3, Integer num, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_hit", true);
        jSONObject.put("path", str);
        jSONObject.put("actual_network_time", j);
        jSONObject.put("cache_time", j2);
        jSONObject.put("saved_time", j3);
        jSONObject.put("root_enter_from_type", num);
        jSONObject.put("enter_from", str2);
        jSONObject.put("enter_method", str3);
        jSONObject.put("page", str4);
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            jSONObject.put("diff_key", linkedHashMap.keySet().toString());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_search_prefetch_hit", jSONObject);
    }

    public static void LJII(String str, Map map, long j, long j2, long j3, Integer num, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_hit", false);
        jSONObject.put("path", str);
        jSONObject.put("actual_network_time", j);
        jSONObject.put("cache_time", j2);
        jSONObject.put("saved_time", j3);
        jSONObject.put("root_enter_from_type", num);
        jSONObject.put("enter_from", str2);
        jSONObject.put("enter_method", str3);
        jSONObject.put("page", str4);
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            jSONObject.put("diff_key", linkedHashMap.keySet().toString());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_search_prefetch_hit", jSONObject);
    }
}
