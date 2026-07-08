package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiDetails;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185430gxB {
    public static final C1185430gxB LIZ = new C1185430gxB();

    static {
        new ConcurrentHashMap();
    }

    public static void LJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "video_post_page");
        linkedHashMap.put("anchor_type", "poi");
        linkedHashMap.put("anchor_name", "Location");
        C20684815ws.LJIILLIIL("add_label", linkedHashMap);
    }

    public static void LIZIZ(PoiData poiData, Map map) {
        String strPoiTypeName;
        if (poiData == null) {
            return;
        }
        try {
            String str = poiData.details;
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                if (!C1189060h32.LJIILJJIL(Boolean.valueOf(poiData.isUgcPoi()))) {
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "collect_info");
                    LIZ.getClass();
                    LIZJ(string, map);
                }
                map.put("poi_city", jSONObject.optString("city_code"));
                map.put("poi_region_code", jSONObject.optString("country_code"));
                PoiDetails poiDetails = poiData.getPoiDetails();
                if (poiDetails == null || (strPoiTypeName = poiDetails.poiTypeName()) == null) {
                    strPoiTypeName = "";
                }
                map.put("poi_detail_type", strPoiTypeName);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZJ(String str, Map map) {
        JSONObject jSONObject;
        Object objOpt;
        if (str != null) {
            try {
                map.put("collect_info", str);
                jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        map.put(next, objOpt.toString());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        } else {
            jSONObject = null;
        }
        C189200o6.m2constructorimpl(jSONObject);
    }

    public static void LIZLLL(PoiData poiData, Map map) {
        String str;
        String str2;
        String string;
        String str3;
        Integer numIsDisplayDistance;
        if (poiData == null) {
            return;
        }
        LIZIZ(poiData, map);
        String str4 = poiData.logId;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        map.put("poi_log_id", str4);
        PoiMobParam poiMobParam = poiData.mobParam;
        Integer numValueOf = null;
        if (poiMobParam == null || (str = poiMobParam.enterMethod) == null) {
            str = "";
        }
        map.put("poi_enter_method", str);
        PoiMobParam poiMobParam2 = poiData.mobParam;
        if (poiMobParam2 == null || (str2 = poiMobParam2.searchId) == null) {
            str2 = "";
        }
        map.put("poi_search_id", str2);
        PoiMobParam poiMobParam3 = poiData.mobParam;
        if (poiMobParam3 == null || (numIsDisplayDistance = poiMobParam3.isDisplayDistance()) == null || (string = numIsDisplayDistance.toString()) == null) {
            string = "";
        }
        map.put("is_display_distance", string);
        PoiMobParam poiMobParam4 = poiData.mobParam;
        if (poiMobParam4 != null) {
            numValueOf = Integer.valueOf(poiMobParam4.useSessionCache);
        }
        C1189060h32.LJIJI(map, "use_session_cache", String.valueOf(numValueOf));
        PoiMobParam poiMobParam5 = poiData.mobParam;
        if (poiMobParam5 != null && (str3 = poiMobParam5.enterFrom) != null) {
            str5 = str3;
        }
        C1189060h32.LJIJI(map, "poi_enter_from", str5);
        map.putAll(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LIZ());
    }

    public static void LJIJ(boolean z, Integer num) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_grey_status", str);
        if (num != null) {
            linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
        }
        C20684815ws.LJIILLIIL("location_entrance_show", linkedHashMap);
    }

    public static void LJJII(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("ttls_btn_name", str, linkedHashMap);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_bottom_operate_btn_click", linkedHashMap, null);
    }

    public static void LJJIII(String str, boolean z) {
        String str2;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("poi_id", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("enable_location", str2);
        pairArr[2] = new Pair("previous_page", "collection_places");
        C20684815ws.LJIILLIIL("poi_collection_show", C2097608Jq.LJIIJ(pairArr));
    }

    public static void LJJIIZ(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("ttls_btn_name", str, linkedHashMap);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_header_operate_btn_click", linkedHashMap, null);
    }

    public static void LJJIJIIJI(Map map, boolean z) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("enable", str);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        C20684815ws.LJIJ("rd_ttls_poi_jato", jSONObject);
    }

    public static void LJJJJ(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("ttls_btn_name", str, linkedHashMap);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_top_operate_btn_click", linkedHashMap, null);
    }

    public static void LJJJJI(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("ttls_btn_name", str, linkedHashMap);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_top_operate_btn_show", linkedHashMap, null);
    }

    public static void LJJJLIIL(PageFinder pageFinder, Map map) {
        map.putAll(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LIZ());
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_favourite_poi_button", map, c1185050gwZ);
    }

    public static void LJJLIIIJILLIZJL(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", "industry_characteristic_information");
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_poi_struct_module", map, c1185050gwZ);
    }

    public static void LJJLIIIJL(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", "industry_characteristic_information");
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("slide_poi_struct_module", map, c1185050gwZ);
    }

    public static void LJFF(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("dimension_key", str, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_ai_line_click", linkedHashMap, c1185050gwZ);
    }

    public static void LJIILL(String str, String str2, boolean z) {
        String str3;
        int iHashCode;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_publish", str3);
        C1189060h32.LJJ("retag_enter_method", str, linkedHashMap);
        if (str != null && ((iHashCode = str.hashCode()) == -1866131019 ? str.equals("edit_post") : iHashCode == 100344454 ? str.equals("inbox") : !(iHashCode != 112202875 || !str.equals("video")))) {
            C1189060h32.LJJ("after_post_days", str2, linkedHashMap);
        }
        C20684815ws.LJIILLIIL("confirm_location_popup_result", linkedHashMap);
    }

    public static void LJIIZILJ(boolean z, Integer num, boolean z2) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_grey_status", obj);
        if (!z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_have_poi", str);
        if (num != null) {
            linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
        }
        C20684815ws.LJIILLIIL("click_location_button", linkedHashMap);
    }

    public static void LJIL(PageFinder pageFinder, String str, String str2) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("poi_id", str2);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_rd_google_maps_not_installed_show", linkedHashMap, c1185050gwZ);
    }

    public static void LJJI(PageFinder pageFinder, String str, String str2) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("poi_id", str2);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("open_in_google_maps", linkedHashMap, c1185050gwZ);
    }

    public static void LJJIIJ(String str, String str2, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C123100dR.LIZ(str)) {
            linkedHashMap.put("enter_from", str);
        }
        if (C123100dR.LIZ(str2)) {
            linkedHashMap.put("enter_method", str2);
        }
        C1189060h32.LJIJJ(linkedHashMap, map);
        linkedHashMap.putAll(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LIZ());
        C20684815ws.LJIILLIIL("poi_fallback_button_click", linkedHashMap);
    }

    public static void LJJIIJZLJL(String str, String str2, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C123100dR.LIZ(str)) {
            linkedHashMap.put("enter_from", str);
        }
        if (C123100dR.LIZ(str2)) {
            linkedHashMap.put("enter_method", str2);
        }
        C1189060h32.LJIJJ(linkedHashMap, map);
        linkedHashMap.putAll(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LIZ());
        C20684815ws.LJIILLIIL("poi_fallback_button_show", linkedHashMap);
    }

    public static void LJJIJIIJIL(PageFinder pageFinder, String str, String str2) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("poi_id", str2);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("poi_map_action", linkedHashMap, c1185050gwZ);
    }

    public static void LJJJJZI(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        C1189060h32.LJJIFFI(c2344009Gk, "enter_method", str);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_share_button_show", map, c1185050gwZ);
    }

    public static void LJJLIIIJLJLI(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, C1184710gw1 c1184710gw1) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("phone_num_type", "icon", linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJII("ttls_poi_phone_number_show", linkedHashMap, c1185050gwZ, c1184710gw1);
    }

    public static HashMap LIZ(String str, String str2, C1188440h22 c1188440h22, InterfaceC665370Q7z interfaceC665370Q7z) {
        String poiRegionCode;
        String poiCityCode;
        HashMap map = new HashMap();
        map.putAll(C1182380gsG.LIZLLL(interfaceC665370Q7z, EnumC1182400gsI.PAGE));
        String collectInfo = null;
        if (c1188440h22 != null) {
            collectInfo = c1188440h22.getCollectInfo();
        }
        LIZJ(collectInfo, map);
        if (!map.containsKey("poi_city") && c1188440h22 != null && (poiCityCode = c1188440h22.getPoiCityCode()) != null && C123100dR.LIZ(poiCityCode)) {
            map.put("poi_city", poiCityCode);
        }
        if (!map.containsKey("poi_detail_type") && c1188440h22 != null) {
            C1188460h24.LIZ.getClass();
            String strLIZJ = C1188460h24.LIZJ(c1188440h22);
            if (strLIZJ != null && C123100dR.LIZ(strLIZJ)) {
                map.put("poi_detail_type", strLIZJ);
            }
        }
        if (!map.containsKey("poi_region_code") && c1188440h22 != null && (poiRegionCode = c1188440h22.getPoiRegionCode()) != null && C123100dR.LIZ(poiRegionCode)) {
            map.put("poi_region_code", poiRegionCode);
        }
        map.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        map.put("poi_id", str2);
        return map;
    }

    public static void LJI(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, C1184710gw1 c1184710gw1, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("dimension_key", str, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJI("ttls_ai_line_show", linkedHashMap, c1185050gwZ, c1184710gw1);
    }

    public static void LJII(Map map, PageFinder pageFinder, Integer num, InterfaceC665370Q7z interfaceC665370Q7z) {
        if (C19719512Dh.LJII(map) && map != null) {
            Map mapLJFF = C1182380gsG.LJFF(interfaceC665370Q7z);
            if (!mapLJFF.isEmpty()) {
                for (Map.Entry entry : ((LinkedHashMap) mapLJFF).entrySet()) {
                    C1083110eI9.LIZ(map, entry.getKey(), entry.getValue());
                }
            }
        }
        for (Map.Entry<String, String> entry2 : ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ().entrySet()) {
            C19719512Dh.LIZJ(map).put(entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry entry3 : ((LinkedHashMap) C308370C6x.LIZ(num)).entrySet()) {
            if (!Intrinsics.LJFF(entry3.getKey(), "enter_from") && !Intrinsics.LJFF(entry3.getKey(), "enter_method") && C19719512Dh.LJII(map) && map != null) {
                map.put(entry3.getKey(), entry3.getValue());
            }
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("cancel_favourite_poi", map, c1185050gwZ);
    }

    public static void LJIILJJIL(PageFinder pageFinder, String str, String str2, String str3) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "poi_detail");
        linkedHashMap.put("enter_method", str2);
        linkedHashMap.put("poi_id", str);
        linkedHashMap.put("page_model", str3);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("close_detail_page", linkedHashMap, c1185050gwZ);
    }

    public static void LJIILLIIL(PageFinder pageFinder, String str, String str2, String str3) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("poi_id", str3);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("copy_address", linkedHashMap, c1185050gwZ);
    }

    public static void LJIJJ(Map map, PageFinder pageFinder, Integer num, InterfaceC665370Q7z interfaceC665370Q7z) {
        Map mapLJFF = C1182380gsG.LJFF(interfaceC665370Q7z);
        if (!mapLJFF.isEmpty()) {
            for (Map.Entry entry : ((LinkedHashMap) mapLJFF).entrySet()) {
                if (C19719512Dh.LJII(map) && map != null) {
                    C1083110eI9.LIZ(map, entry.getKey(), entry.getValue());
                }
            }
        }
        for (Map.Entry<String, String> entry2 : ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ().entrySet()) {
            C19719512Dh.LIZJ(map).put(entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry entry3 : ((LinkedHashMap) C308370C6x.LIZ(num)).entrySet()) {
            if (!Intrinsics.LJFF(entry3.getKey(), "enter_from") && !Intrinsics.LJFF(entry3.getKey(), "enter_method") && C19719512Dh.LJII(map) && map != null) {
                map.put(entry3.getKey(), entry3.getValue());
            }
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("favourite_poi", map, c1185050gwZ);
    }

    public static void LJJJIL(PageFinder pageFinder, String str, String str2, String str3) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("poi_id", str2);
        linkedHashMap.put("target_app_type", str3);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_rd_poi_third_app_open_fail", linkedHashMap, c1185050gwZ);
    }

    public static void LJJJJIZL(String str, long j, String str2, boolean z, boolean z2) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", String.valueOf(j));
        if (z2) {
            str3 = "1";
        } else if (z) {
            str3 = "3";
        } else {
            str3 = "2";
        }
        linkedHashMap.put("load_status", str3);
        linkedHashMap.put("channel_name", str);
        linkedHashMap.put(Scene.SCENE_SERVICE, str2);
        C20684815ws.LJIILLIIL("poi_preload_gecko_result", linkedHashMap);
    }

    public static void LJJJJL(PageFinder pageFinder, String str, String str2, String str3, String str4) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJJ("enter_from", "poi_reviews", linkedHashMap);
        C1189060h32.LJJ("poi_id", str, linkedHashMap);
        C1189060h32.LJJ("exit_type", str3, linkedHashMap);
        C1189060h32.LJJ("has_submit", str4, linkedHashMap);
        C1189060h32.LIZ(str2, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_reviews_csat_exit", linkedHashMap, c1185050gwZ);
    }

    public static void LJIIL(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str, String str2, String str3) {
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", "industry_characteristic_information");
        C1189060h32.LJJIFFI(c2344009Gk, "entity_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "ai_collect_info", str2);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "order", string);
        C1189060h32.LJJIFFI(c2344009Gk, "uri", str3);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("click_poi_struct_content", map, c1185050gwZ);
    }

    public static void LJJIJIL(C1185430gxB c1185430gxB, InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2, C1185050gwZ c1185050gwZ, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        c1185430gxB.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("ttls_module_name", str, linkedHashMap);
        C1189060h32.LJJ("instance_id", str2, linkedHashMap);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_module_show", linkedHashMap, c1185050gwZ);
    }

    public static void LJJJJLI(String str, String str2, String str3, String str4, String str5, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJJ("enter_from", "poi_reviews", linkedHashMap);
        C1189060h32.LJJ("poi_id", str, linkedHashMap);
        C1189060h32.LJJ("reviews_id", str3, linkedHashMap);
        C1189060h32.LJJ("star_level", str4, linkedHashMap);
        C1189060h32.LJJ("exit_type", str5, linkedHashMap);
        C1189060h32.LIZ(str2, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_reviews_csat_unsatisfacted_feedback_exit", linkedHashMap, c1185050gwZ);
    }

    public static void LJJJLZIJ(String str, String str2, String str3, String str4, PageFinder pageFinder, C1184710gw1 c1184710gw1) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        c2344009Gk.LJIIIIZZ("enter_method", "phone_button");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_from", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_method", str4);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJII("show_phone_button", map, c1185050gwZ, c1184710gw1);
    }

    public static void LJJLIIIIJ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str, String str2, String str3) {
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", "industry_characteristic_information");
        C1189060h32.LJJIFFI(c2344009Gk, "entity_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "ai_collect_info", str2);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "order", string);
        C1189060h32.LJJIFFI(c2344009Gk, "uri", str3);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_poi_struct_content", map, c1185050gwZ);
    }

    public static void LJJLIIIJ(String str, String str2, String str3, boolean z, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String str4;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", str3);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "has_image", str4);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_poi_struct_module", map, c1185050gwZ);
    }

    public static void LJJLIIIJJI(String str, String str2, String str3, String str4, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", str, linkedHashMap);
        C1189060h32.LJJ("poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("icon_type", str3, linkedHashMap);
        C1189060h32.LJJ("collect_info", str4, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_view_reserved_button", linkedHashMap, c1185050gwZ);
    }

    public static void LJJLIIIJJIZ(String str, String str2, String str3, boolean z, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String str4;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", str3);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "has_image", str4);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("slide_poi_struct_module", map, c1185050gwZ);
    }

    public static void LJIIIZ(String str, String str2, String str3, boolean z, String str4, Map map, PageFinder pageFinder) {
        String str5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            c2344009Gk.LJFF("enter_from", "inner_poi_detail");
        } else {
            c2344009Gk.LJFF("enter_from", "poi_detail");
        }
        for (Map.Entry entry : map.entrySet()) {
            C1189060h32.LJJIFFI(c2344009Gk, (String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", str3);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "has_image", str5);
        C1189060h32.LJJIFFI(c2344009Gk, "content_id", str4);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map2 = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("cancel_like_poi_struct_content", map2, c1185050gwZ);
    }

    public static void LJIILIIL(String str, String str2, String str3, String str4, String str5, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", str, linkedHashMap);
        C1189060h32.LJJ("poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("icon_type", str3, linkedHashMap);
        C1189060h32.LJJ("collect_info", str4, linkedHashMap);
        C1189060h32.LJJ("tag_type", str5, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("click_view_reserved_button", linkedHashMap, c1185050gwZ);
    }

    public static void LJJ(String str, String str2, String str3, boolean z, String str4, Map map, PageFinder pageFinder) {
        String str5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            c2344009Gk.LJFF("enter_from", "inner_poi_detail");
        } else {
            c2344009Gk.LJFF("enter_from", "poi_detail");
        }
        for (Map.Entry entry : map.entrySet()) {
            C1189060h32.LJJIFFI(c2344009Gk, (String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", str3);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "has_image", str5);
        C1189060h32.LJJIFFI(c2344009Gk, "content_id", str4);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map2 = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("like_poi_struct_content", map2, c1185050gwZ);
    }

    public static void LJJIJL(C1185430gxB c1185430gxB, String str, String str2, InterfaceC665370Q7z interfaceC665370Q7z, String str3, String str4, PageFinder pageFinder) {
        c1185430gxB.getClass();
        if (C1203104nF.LIZ()) {
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) C1182380gsG.LJI(interfaceC665370Q7z)).entrySet()) {
                C1189060h32.LJJ(entry.getKey(), (String) entry.getValue(), linkedHashMap);
            }
            C1189060h32.LJJ("operation_type", str2, linkedHashMap);
            C1189060h32.LJJ("current_page", str3, linkedHashMap);
            C1189060h32.LJJ("enter_from", str, linkedHashMap);
            C1189060h32.LJJ("ttls_module_name", str4, linkedHashMap);
            C1189060h32.LJJ("ttls_component_name", null, linkedHashMap);
            C1189060h32.LJJ("is_longpress_operation", null, linkedHashMap);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("ttls_operation_on_poi", linkedHashMap, c1185050gwZ);
        }
    }

    public static void LJJIJLIJ(String str, String str2, String str3, String str4, String str5, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String str6;
        if (((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJII(0, C1BWL.LIZ())) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        c2344009Gk.LJIIIIZZ("enter_method", "phone_button");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_from", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_method", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "enable_location", str6);
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_enter_from", str5);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("phone_number_action", map, c1185050gwZ);
    }

    public static void LJJIZ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "is_highlight_tag", str5);
        if (str == null) {
            str = str2;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "poi_tag_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_pic_mode", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_tag_type", str4);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_tag_click", map, c1185050gwZ);
    }

    public static void LJJLI(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", str3);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "has_image", str5);
        C1189060h32.LJJIFFI(c2344009Gk, "content_id", str4);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_poi_struct_content", map, c1185050gwZ);
    }

    public static void LJIIJ(InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2, String str3, String str4, int i, Integer num, PageFinder pageFinder) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_from", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_method", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "distance_type", C1183800guY.LIZ(i));
        if (num != null) {
            C1189060h32.LJJIFFI(c2344009Gk, "user_location", C1183800guY.LIZIZ(num.intValue()));
        }
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("click_location_info", map, c1185050gwZ);
    }

    public static void LJIIJJI(String str, String str2, String str3, String str4, String str5, String str6, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        c2344009Gk.LJIIIIZZ("enter_method", str6);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_from", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_method", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_pic_mode", str5);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("poi_pic_operation", map, c1185050gwZ);
    }

    public static void LJJIL(C1185430gxB c1185430gxB, String str, String str2, String str3, String str4, Map map, PageFinder pageFinder, int i) {
        if ((i & 8) != 0) {
            str4 = "poi_detail";
        }
        if ((i & 16) != 0) {
            map = new LinkedHashMap();
        }
        c1185430gxB.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", str3);
        for (Map.Entry entry : map.entrySet()) {
            C1189060h32.LJJIFFI(c2344009Gk, (String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map2 = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("poi_slide_multi_photo", map2, c1185050gwZ);
    }

    public static void LJJJ(InterfaceC665370Q7z interfaceC665370Q7z, boolean z, String str, String str2, String str3, String str4, PageFinder pageFinder, C1184710gw1 c1184710gw1) {
        String str5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "is_highlight_tag", str5);
        if (str == null) {
            str = str2;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "poi_tag_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_pic_mode", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_tag_type", str4);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJII("ttls_poi_tag_show", map, c1185050gwZ, c1184710gw1);
    }

    public static void LJJJZ(String str, String str2, String str3, String str4, String str5, PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, C1184710gw1 c1184710gw1) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_from", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_method", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_pic_mode", str5);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJII("show_poi_pic", map, c1185050gwZ, c1184710gw1);
    }

    public static void LJIJI(C1185430gxB c1185430gxB, String str, String str2, String str3, String str4, Map map, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder, int i) {
        if ((i & 8) != 0) {
            str4 = "poi_detail";
        }
        if ((i & 16) != 0) {
            map = new LinkedHashMap();
        }
        if ((i & 32) != 0) {
            interfaceC665370Q7z = null;
        }
        c1185430gxB.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        c2344009Gk.LJFF("enter_from", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "module_name", str3);
        for (Map.Entry entry : map.entrySet()) {
            C1189060h32.LJJIFFI(c2344009Gk, (String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map2 = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("enter_inner_detail_page", map2, c1185050gwZ);
    }

    public static void LJJJLL(InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2, String str3, String str4, int i, Integer num, PageFinder pageFinder, C1184710gw1 c1184710gw1) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_from", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_method", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "distance_type", C1183800guY.LIZ(i));
        if (num != null) {
            C1189060h32.LJJIFFI(c2344009Gk, "user_location", C1183800guY.LIZIZ(num.intValue()));
        }
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJII("show_location_info", map, c1185050gwZ, c1184710gw1);
    }

    public static void LJJLIIIJLLLLLLLZ(String str, String str2, boolean z, Integer num, PoiData poiData, String str3, String str4, Map map, String str5) {
        String str6;
        int iHashCode;
        PoiDetails poiDetails;
        String str7;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str8 = null;
        if (poiData != null) {
            str8 = poiData.poiId;
        }
        String str9 = "";
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("poi_id", str8);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("author_id", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("group_id", str2);
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_success", str6);
        if (num != null) {
            linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
        }
        if (poiData != null && (poiDetails = poiData.getPoiDetails()) != null && (str7 = poiDetails.typeLevel) != null) {
            str9 = str7;
        }
        linkedHashMap.put("poi_type", str9);
        C1189060h32.LJJ("retag_enter_method", str3, linkedHashMap);
        if (str3 != null && ((iHashCode = str3.hashCode()) == -1866131019 ? str3.equals("edit_post") : iHashCode == 100344454 ? str3.equals("inbox") : !(iHashCode != 112202875 || !str3.equals("video")))) {
            C1189060h32.LJJ("after_post_days", str4, linkedHashMap);
        }
        C1189060h32.LJIJI(linkedHashMap, "has_model_identify_res", str5);
        LIZ.getClass();
        LIZLLL(poiData, linkedHashMap);
        linkedHashMap.put("is_new_add", "1");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (!linkedHashMap.containsKey(key)) {
                    linkedHashMap.put(key, value);
                }
            }
        }
        C20684815ws.LJIILLIIL("republish", linkedHashMap);
    }

    public static void LJJIIZI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        C1189060h32.LJJIFFI(c2344009Gk, "entity_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "ai_collect_info", str2);
        C1189060h32.LJJIFFI(c2344009Gk, "source_type", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "media_type", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "group_id", str5);
        C1189060h32.LJJIFFI(c2344009Gk, "review_id", str6);
        C1189060h32.LJJIFFI(c2344009Gk, "uri", str7);
        C1189060h32.LJJIFFI(c2344009Gk, "order", str8);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_industry_info_card_click", map, c1185050gwZ);
    }

    public static void LJJIJ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        C1189060h32.LJJIFFI(c2344009Gk, "entity_id", str);
        C1189060h32.LJJIFFI(c2344009Gk, "ai_collect_info", str2);
        C1189060h32.LJJIFFI(c2344009Gk, "source_type", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "media_type", str4);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "order", string);
        C1189060h32.LJJIFFI(c2344009Gk, "group_id", str5);
        C1189060h32.LJJIFFI(c2344009Gk, "review_id", str6);
        C1189060h32.LJJIFFI(c2344009Gk, "uri", str7);
        C1189060h32.LIZJ(c2344009Gk, str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_industry_info_card_show", map, c1185050gwZ);
    }

    public static void LJJIFFI(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, String str8, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String strLIZ;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", "poi_detail", linkedHashMap);
        C1189060h32.LJJ("enter_method", str5, linkedHashMap);
        C1189060h32.LJJ("poi_id", str, linkedHashMap);
        C1189060h32.LIZ(str2, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str3, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str4, linkedHashMap);
        String strLIZIZ = null;
        if (num != null) {
            strLIZ = C1183800guY.LIZ(num.intValue());
        } else {
            strLIZ = null;
        }
        C1189060h32.LJJ("distance_type", strLIZ, linkedHashMap);
        if (num2 != null) {
            strLIZIZ = C1183800guY.LIZIZ(num2.intValue());
        }
        C1189060h32.LJJ("user_location", strLIZIZ, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str6, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str7, linkedHashMap);
        C1189060h32.LJJ("initial_poi_from_group_id", str8, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("open_navigation", linkedHashMap, c1185050gwZ);
    }

    public static void LJJJJLL(String str, String str2, String str3, int i, int i2, long j, List list, String str4, List list2, String str5, Long l, Integer num, Integer num2, PoiMobParam poiMobParam, Boolean bool, int i3, String str6, String str7, int i4) {
        String str8;
        int iHashCode;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        linkedHashMap.put("key_word", str3);
        linkedHashMap.put("is_success", String.valueOf(i));
        linkedHashMap.put("page_order", String.valueOf(i2));
        linkedHashMap.put("duration", String.valueOf(j));
        linkedHashMap.put("poi_id", list.toString());
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_cache_search", str8);
        linkedHashMap.put("use_prefix_cache", String.valueOf(i4));
        if (str4 != null) {
            linkedHashMap.put("log_id", str4);
        }
        linkedHashMap.put("index", list2.toString());
        if (str5 != null) {
            linkedHashMap.put("impr_id", str5);
        }
        if (C123100dR.LIZ(str3)) {
            linkedHashMap.put("search_session_id", String.valueOf(l));
        }
        if (num != null) {
            linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            linkedHashMap.put("deduplication_num", String.valueOf(num2.intValue()));
        }
        C1189060h32.LJIJI(linkedHashMap, "use_session_cache", String.valueOf(i3));
        C1189060h32.LJJ("retag_enter_method", str6, linkedHashMap);
        if (str6 != null && ((iHashCode = str6.hashCode()) == -1866131019 ? str6.equals("edit_post") : iHashCode == 100344454 ? str6.equals("inbox") : !(iHashCode != 112202875 || !str6.equals("video")))) {
            C1189060h32.LJJ("after_post_days", str7, linkedHashMap);
        }
        C1197910hHJ.LIZ(linkedHashMap, poiMobParam);
        linkedHashMap.putAll(C1200530hLX.LIZIZ(null, "search_poi_result"));
        C20684815ws.LJIILLIIL("search_poi_result", linkedHashMap);
    }

    public static void LJJJJJL(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, String str14, String str15, String str16, String str17, String str18, String str19, PageFinder pageFinder) {
        String string = null;
        Map mapLIZ = C308370C6x.LIZ(null);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(mapLIZ);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        c2344009Gk.LJIIIIZZ("enter_method", str);
        if (num != null) {
            string = num.toString();
        }
        C1189060h32.LJJIFFI(c2344009Gk, "provider", string);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str2);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_city", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_region_code", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "tt_type_code", str5);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_from", str12);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_method", str13);
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_enter_from", str8);
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_enter_method", str9);
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_from_group_id", str10);
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_id", str11);
        C1189060h32.LJJIFFI(c2344009Gk, "is_multi_partner", String.valueOf(i));
        C1189060h32.LJJIFFI(c2344009Gk, "click_id", str14);
        C1189060h32.LJJIFFI(c2344009Gk, "activity_source", str15);
        C1189060h32.LJJIFFI(c2344009Gk, "activity_page_id", str16);
        C1189060h32.LJJIFFI(c2344009Gk, "request_id", str17);
        C1189060h32.LJJIFFI(c2344009Gk, "bcm_chain", str18);
        C1189060h32.LJJIFFI(c2344009Gk, "icon_type", str19);
        C1189060h32.LIZJ(c2344009Gk, str6);
        C1189060h32.LJIIIIZZ(c2344009Gk, str7);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("show_reserve_button", map, c1185050gwZ);
    }

    public static void LJJJJJ(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, String str14, String str15, String str16, String str17, String str18, String str19, PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z) {
        String str20;
        String string = null;
        Map mapLIZ = C308370C6x.LIZ(null);
        if (((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJII(0, C1BWL.LIZ())) {
            str20 = "1";
        } else {
            str20 = CardStruct.IStatusCode.DEFAULT;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        c2344009Gk.LJII(mapLIZ);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        c2344009Gk.LJIIIIZZ("enter_method", str);
        if (num != null) {
            string = num.toString();
        }
        C1189060h32.LJJIFFI(c2344009Gk, "provider", string);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str2);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_city", str3);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_region_code", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "tt_type_code", str5);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_from", str12);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_method", str13);
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_enter_from", str8);
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_enter_method", str9);
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_from_group_id", str10);
        C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_id", str11);
        C1189060h32.LJJIFFI(c2344009Gk, "is_multi_partner", String.valueOf(i));
        C1189060h32.LJJIFFI(c2344009Gk, "click_id", str14);
        C1189060h32.LJJIFFI(c2344009Gk, "activity_source", str15);
        C1189060h32.LJJIFFI(c2344009Gk, "activity_page_id", str16);
        C1189060h32.LJJIFFI(c2344009Gk, "request_id", str17);
        C1189060h32.LJJIFFI(c2344009Gk, "bcm_chain", str18);
        C1189060h32.LJJIFFI(c2344009Gk, "enable_location", str20);
        C1189060h32.LJJIFFI(c2344009Gk, "icon_type", str19);
        C1189060h32.LIZJ(c2344009Gk, str6);
        C1189060h32.LJIIIIZZ(c2344009Gk, str7);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("click_reserve_button", map, c1185050gwZ);
    }
}
