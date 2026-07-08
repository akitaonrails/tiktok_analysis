package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.config.ECSearchVerticalChunkSizeListSettings;
import com.ss.android.ugc.aweme.config.EcSearchShopResultPreloadConfigModel;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS95S1000000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674790QdR {
    public static C804450Vh5<String, C674960Qdi> LIZJ;
    public static ConcurrentHashMap<String, C675030Qdp> LIZLLL;
    public static final C674790QdR LIZ = new C674790QdR();
    public static final ConcurrentHashMap<String, Pair<Boolean, Long>> LIZIZ = new ConcurrentHashMap<>();
    public static final List<Integer> LJ = C1697810uHb.LJIIJJI(Integer.valueOf(C0QXR.ORDER.getValue()), Integer.valueOf(C0QXR.LIVE_PRODUCT_LIST_MAGNIFIER.getValue()), Integer.valueOf(C0QXR.LIVE_PRODUCT_LIST_GUESS_WORDS.getValue()));

    public static void LIZ(SearchResultParam searchResultParam) {
        String string;
        if (searchResultParam == null) {
            return;
        }
        String enterMethod = searchResultParam.getEnterMethod();
        C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
        String str = "";
        if (searchEnterParam == null || (string = Integer.valueOf(searchEnterParam.getEcSearchEntranceValue()).toString()) == null) {
            string = "";
        }
        String keyword = searchResultParam.getKeyword();
        if (keyword != null) {
            str = keyword;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enterMethod);
        sbLIZ.append(string);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if ((!a0.LJJJIL(strLIZIZ)) && strLIZIZ != null) {
            if (LIZLLL == null) {
                LIZLLL = new ConcurrentHashMap<>();
            }
            ConcurrentHashMap<String, C675030Qdp> concurrentHashMap = LIZLLL;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(strLIZIZ, (C675030Qdp) new Object() { // from class: X.0Qdp
                });
            }
        }
    }

    public static C674800QdS LIZIZ(SearchResultParam searchResultParam, boolean z, C672630QZx c672630QZx) {
        String strLIZ;
        C1ER1 c1er1 = C1ER1.LIZIZ;
        String latestSearchId = c1er1.getLatestSearchId();
        String strLJLIL = null;
        if (z) {
            C01GW<C669750QOv> c01gw = C669750QOv.LIZLLL;
            strLIZ = C669590QOf.LIZ().LIZJ();
        } else {
            InterfaceC676470Qg9 interfaceC676470Qg9Y0 = c1er1.y0();
            if (interfaceC676470Qg9Y0 != null) {
                strLIZ = interfaceC676470Qg9Y0.LIZ();
            } else {
                strLIZ = null;
            }
        }
        IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
        if (iEcomSearchService != null) {
            strLJLIL = iEcomSearchService.LJLIL(null, "");
        }
        C672620QZw.LIZ.getClass();
        return C672620QZw.LIZIZ(searchResultParam, latestSearchId, strLIZ, c672630QZx, strLJLIL);
    }

    public static boolean LIZLLL(SearchResultParam searchResultParam, int i, Boolean bool) {
        String tabName;
        EnumC669620QOi targetTab;
        if (searchResultParam.getSearchEnterParam() == null) {
            return false;
        }
        if (C650500PfM.LIZJ(searchResultParam.getSearchEnterParam())) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                return true;
            }
            C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
            if (searchEnterParam != null && (targetTab = searchEnterParam.getTargetTab()) != null) {
                tabName = targetTab.getTabName();
            } else {
                tabName = null;
            }
            if (i < 0 && Intrinsics.LJFF(tabName, EnumC669620QOi.SHOP.getTabName()) && !LJ.contains(Integer.valueOf(searchResultParam.getSearchEnterParam().getEcSearchEntranceValue()))) {
                return true;
            }
        } else {
            if (!((List) C299440BoU.LIZLLL.getValue()).contains(searchResultParam.getEnterMethod()) || C299440BoU.LIZ) {
                return false;
            }
            C299440BoU.LIZ = true;
            searchResultParam.setIsFromProductsCardClick(true);
            return true;
        }
        return false;
    }

    public static void LJ(SearchResultParam searchResultParam, C00AO c00ao, EnumC667200QFa enumC667200QFa) throws JSONException {
        String enterSearchFrom;
        String enterMethod;
        Integer numValueOf;
        String strName;
        String value;
        C0QER searchEnterParam;
        C0QER searchEnterParam2;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "do_preload");
        String str = "";
        if (searchResultParam == null || (searchEnterParam2 = searchResultParam.getSearchEnterParam()) == null || (enterSearchFrom = searchEnterParam2.getEnterSearchFrom()) == null) {
            enterSearchFrom = "";
        }
        jSONObject.put("enter_from", enterSearchFrom);
        if (searchResultParam == null || (enterMethod = searchResultParam.getEnterMethod()) == null) {
            enterMethod = "";
        }
        jSONObject.put("ec_search_enter_method", enterMethod);
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
            numValueOf = Integer.valueOf(searchEnterParam.getEcSearchEntranceValue());
        } else {
            numValueOf = null;
        }
        jSONObject.put("root_enter_from_type", numValueOf);
        if (c00ao == null || (strName = c00ao.name()) == null) {
            strName = "";
        }
        jSONObject.put("preload_type", strName);
        if (enumC667200QFa != null && (value = enumC667200QFa.getValue()) != null) {
            str = value;
        }
        jSONObject.put("preload_manner", str);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_ec_search_preload_result_hit_check", jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(C674800QdS c674800QdS, boolean z, C03W6 c03w6) {
        boolean zIsDefaultOption;
        int filterBy;
        LinkedHashMap<String, Integer> linkedHashMap;
        Integer num;
        int i;
        String string = ECSearchVerticalChunkSizeListSettings.LIZ().chunkSizeList.toString();
        String str = EcSearchApi.LIZIZ;
        String str2 = c674800QdS.searchChannel;
        if (str2 == null) {
            str2 = "tiktok_ecom";
        }
        long j = c674800QdS.cursor;
        String str3 = c674800QdS.keyword;
        String str4 = c674800QdS.enterFrom;
        int i2 = c674800QdS.count;
        int i3 = c674800QdS.hotSearch;
        String str5 = c674800QdS.searchId;
        String str6 = c674800QdS.lastSearchId;
        String str7 = c674800QdS.source;
        String str8 = c674800QdS.searchSource;
        int i4 = c674800QdS.correctType;
        C0PSG c0psg = c674800QdS.filterOption;
        if (c0psg != null) {
            zIsDefaultOption = c0psg.isDefaultOption();
        } else {
            zIsDefaultOption = 1;
        }
        int i5 = !zIsDefaultOption;
        C0PSG c0psg2 = c674800QdS.filterOption;
        int sortType = 0;
        if (c0psg2 != null) {
            filterBy = c0psg2.getFilterBy();
        } else {
            filterBy = 0;
        }
        C0PSG c0psg3 = c674800QdS.filterOption;
        if (c0psg3 != null) {
            sortType = c0psg3.getSortType();
        }
        C0PSG c0psg4 = c674800QdS.filterOption;
        if (c0psg4 == null || (linkedHashMap = c0psg4.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        String str9 = c674800QdS.searchContext;
        String str10 = c674800QdS.sugTagText;
        String str11 = c674800QdS.sugType;
        String str12 = c674800QdS.sugQueryState;
        String str13 = c674800QdS.sugCreatorId;
        String str14 = c674800QdS.attachProducts;
        String str15 = c674800QdS.mockAttachProducts;
        String str16 = c674800QdS.trafficSourceList;
        String str17 = c674800QdS.cmplEnc;
        String str18 = c674800QdS.originIsMallTab;
        String str19 = c674800QdS.ecSearchSessionId;
        String str20 = c674800QdS.sugShopId;
        String str21 = c674800QdS.userRtActs;
        String str22 = c674800QdS.userActions;
        String str23 = c674800QdS.searchSessionId;
        String str24 = c674800QdS.apiVersion;
        String str25 = c674800QdS.lastSearchPidList;
        String str26 = c674800QdS.passThroughParams;
        Map<String, String> mapLJ = c674800QdS.searchExtraRequestParams;
        Long l = c674800QdS.endToEndSearchSessionId;
        String str27 = c674800QdS.filtersData;
        Integer numIsLowDevice = c674800QdS.isLowDevice();
        Integer numIsWeakNetwork = c674800QdS.isWeakNetwork();
        Integer num2 = c674800QdS.useNewFilterArch;
        String str28 = c674800QdS.newUserExtraInfo;
        Integer numIsNonPersonalizedSearch = c674800QdS.isNonPersonalizedSearch();
        Integer num3 = c674800QdS.dmaConsentStatus;
        Integer num4 = c674800QdS.edmConsentStatus;
        String str29 = c674800QdS.nineSearchProductId;
        Integer num5 = c674800QdS.searchKeywordStrategy;
        String str30 = c674800QdS.enterFromSecond;
        C15O7<C1515820pY4<n>> c15o7SearchDynamicShopListByChunkPost = null;
        if (z) {
            num = 1;
        } else {
            num = null;
        }
        String str31 = c674800QdS.searchPromotionParams;
        String str32 = c674800QdS.trafficDiversionInfo;
        String str33 = c674800QdS.bcmChain;
        Map<String, String> mapLJ2 = c674800QdS.apiParamsInCurrentSearch;
        Integer num6 = c674800QdS.rootEnterFromType;
        String str34 = c674800QdS.clientRequestId;
        EcSearchApi.RealApi realApi = (EcSearchApi.RealApi) ((InterfaceC2661011f) C452501pT.LIZIZ(new AwS95S1000000_10(str, 12)).getValue()).create(EcSearchApi.RealApi.class);
        if (realApi != null) {
            if (!C04WU.LIZ() || mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            if (mapLJ2 == null) {
                mapLJ2 = C2097608Jq.LJ();
            }
            c15o7SearchDynamicShopListByChunkPost = realApi.searchDynamicShopListByChunkPost(string, str2, j, str3, str4, i2, i3, str5, str6, str7, str8, i4, i5, filterBy, sortType, linkedHashMap, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str24, str23, str22, str25, str26, mapLJ, null, l, str27, numIsLowDevice, numIsWeakNetwork, num2, numIsNonPersonalizedSearch, num3, num4, str28, str29, num5, str30, num, str31, str32, str33, mapLJ2, num6, str34);
        }
        if (z) {
            if (c15o7SearchDynamicShopListByChunkPost != null) {
                c15o7SearchDynamicShopListByChunkPost.LIZLLL(new C0R4M(c03w6, 5));
            } else {
                return;
            }
        } else if (c15o7SearchDynamicShopListByChunkPost == null) {
            return;
        }
        LIZ.getClass();
        if (LIZJ == null) {
            LIZJ = new C804450Vh5<>(5);
        }
        String strValueOf = String.valueOf(c674800QdS.hashCode());
        if (z) {
            i = 30000;
        } else {
            i = 8000;
        }
        C804450Vh5<String, C674960Qdi> c804450Vh5 = LIZJ;
        if (c804450Vh5 != null) {
            c804450Vh5.LIZIZ(strValueOf, new C674960Qdi(c15o7SearchDynamicShopListByChunkPost, System.currentTimeMillis() + ((long) i)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x010e, code lost:
    
        if (r19 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.search.model.SearchResultParam r16, final X.C674800QdS r17, java.lang.String r18, final boolean r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C674790QdR.LJI(com.ss.android.ugc.aweme.search.model.SearchResultParam, X.0QdS, java.lang.String, boolean):void");
    }

    public static void LIZJ(C674790QdR c674790QdR, SearchResultParam searchResultParam, boolean z, boolean z2, int i, int i2, Boolean bool, C672630QZx c672630QZx, String str, boolean z3, int i3) {
        C674960Qdi c674960QdiLIZ;
        ECSearchEntranceData ecSearchEntranceData;
        if ((i3 & 32) != 0) {
            bool = Boolean.FALSE;
        }
        String enterSearchFrom = null;
        if ((i3 & 64) != 0) {
            c672630QZx = null;
        }
        if ((i3 & 128) != 0) {
            str = EnumC667200QFa.POWER_PRELOAD.getValue();
        }
        if ((i3 & 256) != 0) {
            z3 = false;
        }
        c674790QdR.getClass();
        try {
            if (LIZLLL(searchResultParam, i2, bool)) {
                C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
                if (searchEnterParam != null && (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) != null && ecSearchEntranceData.getBooleanStrategy("disable_chunk")) {
                    return;
                }
                C844470XAv.LIZ.getClass();
                if (C0XF1.LIZLLL(C844470XAv.LIZ())) {
                    EcSearchShopResultPreloadConfigModel ecSearchShopResultPreloadConfigModel = (EcSearchShopResultPreloadConfigModel) C672850QaJ.LIZIZ.getValue();
                    if (!searchResultParam.getDoShopResultPreload() && !searchResultParam.getIsFromProductsCardClick()) {
                        if (z2) {
                            C0QER searchEnterParam2 = searchResultParam.getSearchEnterParam();
                            if (searchEnterParam2 != null) {
                                enterSearchFrom = searchEnterParam2.getEnterSearchFrom();
                            }
                            if (!Intrinsics.LJFF(enterSearchFrom, "homepage_mall") && ecSearchShopResultPreloadConfigModel.outsideEnterMethodList.contains(searchResultParam.getEnterMethod())) {
                                if (Intrinsics.LJFF(searchResultParam.getEnterMethod(), "feed_click_recom_words")) {
                                    if (!((Boolean) C1105104Tx.LIZ.getValue()).booleanValue()) {
                                        return;
                                    }
                                } else if (!((Boolean) C1105204Ty.LIZ.getValue()).booleanValue()) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (!ecSearchShopResultPreloadConfigModel.insideEnterMethodList.contains(searchResultParam.getEnterMethod()) || !((Boolean) C1104904Tv.LIZ.getValue()).booleanValue()) {
                            return;
                        }
                    }
                    C674800QdS c674800QdSLIZIZ = LIZIZ(searchResultParam, z, c672630QZx);
                    if (c674800QdSLIZIZ.keyword.length() != 0) {
                        C804450Vh5<String, C674960Qdi> c804450Vh5 = LIZJ;
                        if (c804450Vh5 != null && (c674960QdiLIZ = c804450Vh5.LIZ(String.valueOf(c674800QdSLIZIZ.hashCode()))) != null && c674960QdiLIZ.LIZ != null && System.currentTimeMillis() < c674960QdiLIZ.LIZIZ) {
                            return;
                        }
                        LJI(searchResultParam, c674800QdSLIZIZ, str, z3);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }
}
