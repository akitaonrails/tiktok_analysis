package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0hJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199020hJ6 {
    public static final C1199020hJ6 LIZ = new C1199020hJ6();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    public static void LIZ(int i, C1199100hJE c1199100hJE, List list, String str, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper) {
        Long l;
        String str2;
        String str3;
        Integer num;
        String str4;
        ?? arrayList;
        String str5;
        Integer num2;
        List<PoiData> list2;
        String str6;
        String str7;
        Integer num3;
        C1197690hGx c1197690hGx;
        List list3 = list;
        long jCurrentTimeMillis = System.currentTimeMillis() - c1199100hJE.LJFF;
        C1197720hH0 c1197720hH0 = c1199100hJE.LJIIIIZZ;
        Boolean boolIsCacheForSearch = null;
        if (c1197720hH0 != null && (c1197690hGx = c1197720hH0.LJFF) != null) {
            l = c1197690hGx.LIZIZ;
        } else {
            l = null;
        }
        C1197650hGt c1197650hGt = c1199100hJE.LIZ;
        String str8 = c1197650hGt.LIZIZ;
        if (str8 == null) {
            str2 = "promote_store_poi";
        } else {
            str2 = "promote_store_poi_search";
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 || poiSearchResultWrapper == null) {
                    return;
                }
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                PoiMobParam poiMobParam = c1199100hJE.LJIILL;
                if (poiMobParam != null) {
                    str6 = poiMobParam.enterFrom;
                } else {
                    str6 = null;
                }
                if (str8 == null) {
                    str8 = "";
                }
                int i2 = c1197650hGt.LIZ - 1;
                C13BV c13bv = C13BV.INSTANCE;
                PoiSearchApi.PoiSearchResult poiSearchResult = poiSearchResultWrapper.poiSearchResult;
                if (poiSearchResult != null) {
                    str7 = poiSearchResult.logId;
                } else {
                    str7 = null;
                }
                if (poiMobParam != null) {
                    num3 = poiMobParam.awemeType;
                } else {
                    num3 = null;
                }
                PoiMobParam poiMobParam2 = c1199100hJE.LJIILL;
                PoiSearchApi.PoiSearchResult poiSearchResult2 = poiSearchResultWrapper.poiSearchResult;
                if (poiSearchResult2 != null) {
                    boolIsCacheForSearch = poiSearchResult2.isCacheForSearch();
                }
                int i3 = poiSearchResultWrapper.useSessionCache;
                c1185430gxB.getClass();
                C1185430gxB.LJJJJLL(str6, str2, str8, 0, i2, jCurrentTimeMillis, c13bv, str7, c13bv, str, l, num3, 0, poiMobParam2, boolIsCacheForSearch, i3, "", "", 0);
                return;
            }
            if (poiSearchResultWrapper == null) {
                return;
            }
            C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
            PoiMobParam poiMobParam3 = c1199100hJE.LJIILL;
            if (poiMobParam3 != null) {
                str4 = poiMobParam3.enterFrom;
            } else {
                str4 = null;
            }
            if (str8 == null) {
                str8 = "";
            }
            int i4 = c1197650hGt.LIZ - 1;
            PoiSearchApi.PoiSearchResult poiSearchResult3 = poiSearchResultWrapper.poiSearchResult;
            if (poiSearchResult3 != null && (list2 = poiSearchResult3.poiList) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<PoiData> it2 = list2.iterator();
                while (it2.hasNext()) {
                    String str9 = it2.next().poiId;
                    if (str9 == null) {
                        str9 = "";
                    }
                    arrayList.add(str9);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            PoiSearchApi.PoiSearchResult poiSearchResult4 = poiSearchResultWrapper.poiSearchResult;
            if (poiSearchResult4 != null) {
                str5 = poiSearchResult4.logId;
            } else {
                str5 = null;
            }
            if (list3 == null) {
                list3 = C13BV.INSTANCE;
            }
            PoiMobParam poiMobParam4 = c1199100hJE.LJIILL;
            if (poiMobParam4 != null) {
                num2 = poiMobParam4.awemeType;
            } else {
                num2 = null;
            }
            PoiMobParam poiMobParam5 = c1199100hJE.LJIILL;
            PoiSearchApi.PoiSearchResult poiSearchResult5 = poiSearchResultWrapper.poiSearchResult;
            if (poiSearchResult5 != null) {
                boolIsCacheForSearch = poiSearchResult5.isCacheForSearch();
            }
            int i5 = poiSearchResultWrapper.useSessionCache;
            c1185430gxB2.getClass();
            C1185430gxB.LJJJJLL(str4, str2, str8, 1, i4, jCurrentTimeMillis, arrayList, str5, list3, str, l, num2, 0, poiMobParam5, boolIsCacheForSearch, i5, "", "", 0);
            return;
        }
        C1185430gxB c1185430gxB3 = C1185430gxB.LIZ;
        PoiMobParam poiMobParam6 = c1199100hJE.LJIILL;
        if (poiMobParam6 != null) {
            str3 = poiMobParam6.enterFrom;
        } else {
            str3 = null;
        }
        if (str8 == null) {
            str8 = "";
        }
        int i6 = c1197650hGt.LIZ - 1;
        C13BV c13bv2 = C13BV.INSTANCE;
        if (poiMobParam6 != null) {
            num = poiMobParam6.awemeType;
        } else {
            num = null;
        }
        PoiMobParam poiMobParam7 = c1199100hJE.LJIILL;
        c1185430gxB3.getClass();
        C1185430gxB.LJJJJLL(str3, str2, str8, 0, i6, jCurrentTimeMillis, c13bv2, null, c13bv2, null, l, num, 0, poiMobParam7, null, 0, "", "", 0);
    }
}
