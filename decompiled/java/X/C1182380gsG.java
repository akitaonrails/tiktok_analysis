package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiGeneralCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0gsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182380gsG {
    public static final /* synthetic */ int LIZ = 0;

    public static PoiCommonMobParams LJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (interfaceC665370Q7z == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", PoiCommonMobParams.class, null)) == null) {
            return null;
        }
        return (PoiCommonMobParams) interfaceC1555100qZQLIZIZ.getSource();
    }

    public static Map LJFF(InterfaceC665370Q7z interfaceC665370Q7z) {
        PoiCommonMobParams poiCommonMobParams;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Unit unit = null;
        if (interfaceC665370Q7z != null) {
            try {
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", PoiCommonMobParams.class, null);
                if (interfaceC1555100qZQLIZIZ != null && (poiCommonMobParams = (PoiCommonMobParams) interfaceC1555100qZQLIZIZ.getSource()) != null) {
                    LIZ(poiCommonMobParams, linkedHashMap);
                    unit = Unit.LIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return linkedHashMap;
            }
        }
        C189200o6.m2constructorimpl(unit);
        return linkedHashMap;
    }

    public static Map LJI(InterfaceC665370Q7z interfaceC665370Q7z) {
        PoiCommonMobParams poiCommonMobParams;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Unit unit = null;
        if (interfaceC665370Q7z != null) {
            try {
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", PoiCommonMobParams.class, null);
                if (interfaceC1555100qZQLIZIZ != null && (poiCommonMobParams = (PoiCommonMobParams) interfaceC1555100qZQLIZIZ.getSource()) != null) {
                    LIZIZ(poiCommonMobParams, linkedHashMap);
                    unit = Unit.LIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return linkedHashMap;
            }
        }
        C189200o6.m2constructorimpl(unit);
        return linkedHashMap;
    }

    public static Map LJII(InterfaceC665370Q7z interfaceC665370Q7z) {
        PoiCommonMobParams poiCommonMobParams;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Unit unit = null;
        if (interfaceC665370Q7z != null) {
            try {
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", PoiCommonMobParams.class, null);
                if (interfaceC1555100qZQLIZIZ != null && (poiCommonMobParams = (PoiCommonMobParams) interfaceC1555100qZQLIZIZ.getSource()) != null) {
                    LIZJ(poiCommonMobParams, linkedHashMap, false);
                    unit = Unit.LIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return linkedHashMap;
            }
        }
        C189200o6.m2constructorimpl(unit);
        return linkedHashMap;
    }

    public static void LIZ(PoiCommonMobParams poiCommonMobParams, Map map) {
        LIZJ(poiCommonMobParams, map, false);
        PoiModuleMobCommonParams poiModuleMobCommonParams = poiCommonMobParams.getPoiModuleMobCommonParams();
        if (poiModuleMobCommonParams != null) {
            C1189060h32.LJJ("current_page", poiModuleMobCommonParams.currentPage, map);
            C1189060h32.LJJ("enter_from", poiModuleMobCommonParams.enterFrom, map);
            C1189060h32.LJJ("ttls_rd_poi_data_source", poiModuleMobCommonParams.ttlsRdDataSource, map);
            Map<String, String> map2 = poiModuleMobCommonParams.btmReportParams;
            if (map2 != null) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    if (C123100dR.LIZ(entry.getKey())) {
                        C1189060h32.LJJ(entry.getKey(), entry.getValue(), map);
                    }
                }
            }
        }
    }

    public static void LIZIZ(PoiCommonMobParams poiCommonMobParams, Map map) {
        PoiPageMobCommonParams poiPageMobCommonParams;
        LIZJ(poiCommonMobParams, map, false);
        if (poiCommonMobParams != null && (poiPageMobCommonParams = poiCommonMobParams.getPoiPageMobCommonParams()) != null) {
            C1189060h32.LJJ("current_page", poiPageMobCommonParams.currentPage, map);
            C1189060h32.LJJ("enter_from", poiPageMobCommonParams.enterFrom, map);
            C1189060h32.LJJ("ttls_rd_poi_data_source", poiPageMobCommonParams.ttlsRdDataSource, map);
            Map<String, String> map2 = poiPageMobCommonParams.btmReportParams;
            if (map2 != null) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    if (C123100dR.LIZ(entry.getKey())) {
                        C1189060h32.LJJ(entry.getKey(), entry.getValue(), map);
                    }
                }
            }
        }
    }

    public static Map LIZLLL(InterfaceC665370Q7z interfaceC665370Q7z, EnumC1182400gsI enumC1182400gsI) {
        int i = C1182390gsH.LIZ[enumC1182400gsI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LJII(interfaceC665370Q7z);
                }
                throw new C1954807lC();
            }
            return LJI(interfaceC665370Q7z);
        }
        return LJFF(interfaceC665370Q7z);
    }

    public static void LIZJ(PoiCommonMobParams poiCommonMobParams, Map map, boolean z) {
        PoiGeneralCommonParams poiGeneralCommonParams;
        if (poiCommonMobParams != null && (poiGeneralCommonParams = poiCommonMobParams.getPoiGeneralCommonParams()) != null) {
            Map<String, String> mapLJ = poiGeneralCommonParams.poiRouterParams;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            map.putAll(mapLJ);
            Map<String, String> map2 = poiGeneralCommonParams.collectInfoMap;
            if (map2 != null) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    if (C123100dR.LIZ(entry.getKey())) {
                        if (z) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("page_");
                            sbLIZ.append(entry.getKey());
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            String value = entry.getValue();
                            value.toString();
                            C1189060h32.LJJ(strLIZIZ, value, map);
                        } else {
                            String key = entry.getKey();
                            String value2 = entry.getValue();
                            value2.toString();
                            C1189060h32.LJJ(key, value2, map);
                        }
                    }
                }
            }
            if (z) {
                C1189060h32.LJJ("page_poi_id", poiGeneralCommonParams.poiId, map);
                C1189060h32.LJJ("page_collect_info", poiGeneralCommonParams.collectInfo, map);
            } else {
                C1189060h32.LJJ("poi_id", poiGeneralCommonParams.poiId, map);
                C1189060h32.LJJ("collect_info", poiGeneralCommonParams.collectInfo, map);
            }
            C1189060h32.LJJ("initial_poi_enter_from", poiGeneralCommonParams.initialPoiEnterFrom, map);
            C1189060h32.LJJ("initial_poi_enter_method", poiGeneralCommonParams.initialPoiEnterMethod, map);
            C1189060h32.LJJ("initial_poi_from_group_id", poiGeneralCommonParams.initialPoiFromGroupId, map);
            C1189060h32.LJJ("poi_session_id", poiGeneralCommonParams.poiSessionId, map);
            C1189060h32.LJJ("local_service_key_category", poiGeneralCommonParams.localServiceKeyCateGory, map);
            C1189060h32.LJJ("initial_poi_id", poiGeneralCommonParams.initialPoiId, map);
            C1189060h32.LJJ("group_id", poiGeneralCommonParams.groupId, map);
            C1189060h32.LJJ("from_group_id", poiGeneralCommonParams.fromGroupId, map);
            C1189060h32.LJJ("poi_detail_enter_from", poiGeneralCommonParams.poiDetailEnterFrom, map);
            C1189060h32.LJJ("poi_detail_enter_method", poiGeneralCommonParams.poiDetailEnterMethod, map);
            C1189060h32.LJJ("enable_location", poiGeneralCommonParams.enableLocation, map);
            C1189060h32.LJJ("utm_source", poiGeneralCommonParams.utmSource, map);
        }
    }
}
