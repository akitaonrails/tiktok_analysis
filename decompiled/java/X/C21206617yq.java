package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@InterfaceC1294060jmO
public final class C21206617yq {
    public static final C21206617yq LIZ = new C21206617yq();

    public static Map LIZLLL() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("room_id");
            arrayList.add("anchor_id");
            arrayList.add("live_lineup_type");
            arrayList.add("live_lineup_user_type");
            arrayList.add("live_lineup_change_type");
            arrayList.add("is_commerce_inner_flow");
            arrayList.add("commerce_inner_flow_id");
            arrayList.add("commerce_inner_source");
            interfaceC20673515v3K4.LLIZ(arrayList, linkedHashMap);
        }
        Object obj = linkedHashMap.get("room_id");
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("lineup_room_id", obj);
        linkedHashMap.remove("room_id");
        Object obj2 = linkedHashMap.get("anchor_id");
        linkedHashMap.put("lineup_author_id", obj2 != null ? obj2 : "");
        linkedHashMap.remove("anchor_id");
        return linkedHashMap;
    }

    public static void LIZ(C2344009Gk c2344009Gk) {
        String strLIZ;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1766280w42 interfaceC1766280w42LLIILZL;
        InterfaceC20673515v3 interfaceC20673515v3K42;
        InterfaceC1766280w42 interfaceC1766280w42LLIILZL2;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        String strLIZIZ = null;
        if (iLiveOuterService != null && (interfaceC20673515v3K42 = iLiveOuterService.k4()) != null && (interfaceC1766280w42LLIILZL2 = interfaceC20673515v3K42.LLIILZL()) != null) {
            strLIZ = interfaceC1766280w42LLIILZL2.LIZ();
        } else {
            strLIZ = null;
        }
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService2 != null && (interfaceC20673515v3K4 = iLiveOuterService2.k4()) != null && (interfaceC1766280w42LLIILZL = interfaceC20673515v3K4.LLIILZL()) != null) {
            strLIZIZ = interfaceC1766280w42LLIILZL.LIZIZ();
        }
        if (!TextUtils.isEmpty(strLIZ)) {
            c2344009Gk.LJFF("rec_content_id", strLIZ);
            c2344009Gk.LJFF("rec_content_type", strLIZIZ);
        }
    }

    public static C2344009Gk LJ(C1743900vTw c1743900vTw) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        String strLIZJ = c1743900vTw.LIZJ("author_id");
        String str = "";
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        c2344009Gk.LJFF("author_id", strLIZJ);
        c2344009Gk.LJFF("EVENT_ORIGIN_FEATURE", "TEMAI");
        String strLIZJ2 = c1743900vTw.LIZJ("product_id");
        if (strLIZJ2 == null) {
            strLIZJ2 = "";
        }
        c2344009Gk.LJFF("product_id", strLIZJ2);
        Object objLIZJ = c1743900vTw.LIZJ("biz_type");
        if (objLIZJ == null) {
            objLIZJ = -1;
        }
        c2344009Gk.LJ(objLIZJ, "biz_type");
        String strLIZJ3 = c1743900vTw.LIZJ("product_source");
        if (strLIZJ3 == null) {
            strLIZJ3 = "";
        }
        c2344009Gk.LJFF("product_source", strLIZJ3);
        String strLIZJ4 = c1743900vTw.LIZJ("source");
        if (strLIZJ4 == null) {
            strLIZJ4 = "";
        }
        c2344009Gk.LJFF("source", strLIZJ4);
        String strLIZJ5 = c1743900vTw.LIZJ("room_id");
        if (strLIZJ5 == null) {
            strLIZJ5 = "";
        }
        c2344009Gk.LJFF("room_id", strLIZJ5);
        String strLIZJ6 = c1743900vTw.LIZJ("enter_from_merge");
        if (strLIZJ6 == null) {
            strLIZJ6 = "";
        }
        c2344009Gk.LJFF("enter_from_merge", strLIZJ6);
        String strLIZJ7 = c1743900vTw.LIZJ("enter_method");
        if (strLIZJ7 == null) {
            strLIZJ7 = "";
        }
        c2344009Gk.LJFF("enter_method", strLIZJ7);
        String strLIZJ8 = c1743900vTw.LIZJ("action_type");
        if (strLIZJ8 == null) {
            strLIZJ8 = "";
        }
        c2344009Gk.LJFF("action_type", strLIZJ8);
        String strLIZJ9 = c1743900vTw.LIZJ("carrier_type");
        if (strLIZJ9 == null) {
            strLIZJ9 = "";
        }
        c2344009Gk.LJFF("carrier_type", strLIZJ9);
        String strLIZJ10 = c1743900vTw.LIZJ("page_type");
        if (strLIZJ10 == null) {
            strLIZJ10 = "";
        }
        c2344009Gk.LJFF("page_type", strLIZJ10);
        String strLIZJ11 = c1743900vTw.LIZJ("anchor_show_type");
        if (strLIZJ11 == null) {
            strLIZJ11 = "";
        }
        c2344009Gk.LJFF("anchor_show_type", strLIZJ11);
        String strLIZJ12 = c1743900vTw.LIZJ("follow_status");
        if (strLIZJ12 == null) {
            strLIZJ12 = "-1";
        }
        c2344009Gk.LJFF("follow_status", strLIZJ12);
        String strLIZJ13 = c1743900vTw.LIZJ("entrance_form");
        if (strLIZJ13 == null) {
            strLIZJ13 = "";
        }
        c2344009Gk.LJFF("entrance_form", strLIZJ13);
        String strLIZJ14 = c1743900vTw.LIZJ("page_name");
        if (strLIZJ14 == null) {
            strLIZJ14 = "";
        }
        c2344009Gk.LJFF("page_name", strLIZJ14);
        String strLIZJ15 = c1743900vTw.LIZJ("request_id");
        if (strLIZJ15 == null) {
            strLIZJ15 = "";
        }
        c2344009Gk.LJFF("request_id", strLIZJ15);
        LIZ.getClass();
        LIZJ(c2344009Gk, c1743900vTw);
        String strLIZJ16 = c1743900vTw.LIZJ("entrance_form");
        if (strLIZJ16 != null && TextUtils.equals(strLIZJ16, "live_popup_card")) {
            String strLIZJ17 = c1743900vTw.LIZJ("is_mix_product");
            if (strLIZJ17 == null) {
                strLIZJ17 = "";
            }
            c2344009Gk.LJFF("is_mix_product", strLIZJ17);
        }
        HashMap map = (HashMap) c1743900vTw.LIZIZ();
        if (map != null) {
            c2344009Gk.LJI(map);
        }
        String strLIZJ18 = c1743900vTw.LIZJ("track_id");
        if (strLIZJ18 != null) {
            c2344009Gk.LJFF("track_id", strLIZJ18);
        }
        String strLIZJ19 = c1743900vTw.LIZJ("is_ad");
        if (strLIZJ19 == null) {
            strLIZJ19 = "";
        }
        c2344009Gk.LJFF("is_ad", strLIZJ19);
        String strLIZJ20 = c1743900vTw.LIZJ("ad_id");
        if (strLIZJ20 == null) {
            strLIZJ20 = "";
        }
        c2344009Gk.LJFF("ad_id", strLIZJ20);
        String strLIZJ21 = c1743900vTw.LIZJ("creative_id");
        if (strLIZJ21 != null) {
            str = strLIZJ21;
        }
        c2344009Gk.LJFF("creative_id", str);
        return c2344009Gk;
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, C1743900vTw c1743900vTw) {
        String strLIZJ = c1743900vTw.LIZJ("param_search_is_inner");
        if (strLIZJ != null) {
            c2344009Gk.LJFF("is_inner", strLIZJ);
        }
        String strLIZJ2 = c1743900vTw.LIZJ("param_inner_search_id");
        if (strLIZJ2 != null) {
            c2344009Gk.LJFF("inner_search_id", strLIZJ2);
        }
        String strLIZJ3 = c1743900vTw.LIZJ("param_rank_inner");
        if (strLIZJ3 != null) {
            c2344009Gk.LJFF("rank_inner", strLIZJ3);
        }
        String strLIZJ4 = c1743900vTw.LIZJ("param_is_slide");
        if (strLIZJ4 != null) {
            c2344009Gk.LJFF("is_slide", strLIZJ4);
        }
        String strLIZJ5 = c1743900vTw.LIZJ("param_slide_rank");
        if (strLIZJ5 != null) {
            c2344009Gk.LJFF("slide_rank", strLIZJ5);
        }
    }

    public static void LIZJ(C2344009Gk c2344009Gk, C1743900vTw c1743900vTw) {
        String value;
        String strLIZJ = c1743900vTw.LIZJ("room_id");
        String strLIZJ2 = c1743900vTw.LIZJ("enter_from_merge");
        String strLIZJ3 = c1743900vTw.LIZJ("param_search_result_id");
        IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
        String paramByName = iEcomSearchService.getParamByName("search_entrance_second");
        if (paramByName != null && C123100dR.LIZ(paramByName)) {
            c2344009Gk.LJFF("search_entrance_second", paramByName);
        }
        String paramByName2 = iEcomSearchService.getParamByName("source_module");
        if (paramByName2 != null && C123100dR.LIZ(paramByName2)) {
            c2344009Gk.LJFF("source_module", paramByName2);
        }
        for (Map.Entry<String, String> entry : C1ER1.LIZIZ.getLogParamsFromSearch(strLIZJ2, strLIZJ, "search_result_id", "search_id", "search_entrance", "list_item_id", "last_from_group_id", "origin_is_mall_tab", "search_keyword", "search_pre_product_id", "click_recom_search_entrance").entrySet()) {
            if (Intrinsics.LJFF(entry.getKey(), "list_item_id") && Intrinsics.LJFF(strLIZJ2, "general_search")) {
                if (strLIZJ == null) {
                    value = entry.getValue();
                } else {
                    value = strLIZJ;
                }
                c2344009Gk.LJFF("list_item_id", value);
            } else if (Intrinsics.LJFF(entry.getKey(), "search_result_id") && !TextUtils.isEmpty(strLIZJ3)) {
                c2344009Gk.LJFF(entry.getKey(), strLIZJ3);
            } else {
                c2344009Gk.LJFF(entry.getKey(), entry.getValue());
            }
        }
    }

    public static void LJI(boolean z, Boolean bool, String str, String str2, Map map, C1743900vTw c1743900vTw) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        String strLIZJ;
        InterfaceC20673515v3 interfaceC20673515v3K42;
        Object obj;
        if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
            if (map != null) {
                obj = map.get("is_pseudo_ad");
            } else {
                obj = null;
            }
            if (!Intrinsics.LJFF(obj, "1")) {
                return;
            }
        }
        if (z) {
            HashMap map2 = new HashMap();
            if (map != null) {
                map2.putAll(map);
            }
            map2.put("refer", str);
            HashMap map3 = new HashMap();
            map3.put("room_id", str2);
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService != null && (interfaceC20673515v3K42 = iLiveOuterService.k4()) != null && interfaceC20673515v3K42.LJLIL() != null) {
                C0IXW.LIZ("live_ad", "othershow", map2, map3);
                return;
            }
            return;
        }
        HashMap map4 = new HashMap();
        if (map != null) {
            map4.putAll(map);
        }
        map4.put("refer", str);
        HashMap map5 = new HashMap();
        map5.put("room_id", str2);
        if (c1743900vTw != null && (strLIZJ = c1743900vTw.LIZJ("product_id")) != null) {
            map5.put("product_id", strLIZJ);
        }
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService2 == null || (interfaceC20673515v3K4 = iLiveOuterService2.k4()) == null || interfaceC20673515v3K4.LJLIL() == null) {
            return;
        }
        C0IXW.LIZ("live_ad", "otherclick", map4, map5);
    }

    public static void LJFF(Map map, C1743900vTw c1743900vTw, String str, String str2, String str3, Map map2, Map map3, Map map4) {
        C2344009Gk c2344009GkLJ = LJ(c1743900vTw);
        c2344009GkLJ.LJIIIIZZ("stay_time", c1743900vTw.LIZJ("stay_time"));
        c2344009GkLJ.LJIIIIZZ("quit_type", c1743900vTw.LIZJ("quit_type"));
        if (str != null) {
            c2344009GkLJ.LJFF("flashsale_status", str);
        }
        if (str2 != null) {
            c2344009GkLJ.LJFF("countdown_type", str2);
        }
        if (c1743900vTw.LJFF("source_module")) {
            c2344009GkLJ.LJFF("source_module", c1743900vTw.LIZJ("source_module"));
        }
        if (c1743900vTw.LJFF("source_page_type")) {
            c2344009GkLJ.LJFF("source_page_type", c1743900vTw.LIZJ("source_page_type"));
        }
        if (c1743900vTw.LJFF("shopping_mode")) {
            c2344009GkLJ.LJFF("shopping_mode", c1743900vTw.LIZJ("shopping_mode"));
        }
        if (str3 != null) {
            c2344009GkLJ.LJFF("product_id", str3);
        }
        String str4 = (String) ((LinkedHashMap) map4).get("auction_id");
        if (str4 != null) {
            c2344009GkLJ.LJFF("auction_id", str4);
        }
        String str5 = (String) ((LinkedHashMap) map4).get("is_extended_auction");
        if (str5 != null) {
            c2344009GkLJ.LJFF("is_extended_auction", str5);
        }
        String str6 = (String) ((LinkedHashMap) map4).get("label_type");
        if (str6 != null) {
            c2344009GkLJ.LJFF("label_type", str6);
        }
        String str7 = (String) ((LinkedHashMap) map4).get("auction_status");
        if (str7 != null) {
            c2344009GkLJ.LJFF("auction_status", str7);
        }
        String str8 = (String) ((LinkedHashMap) map4).get("auction_type");
        if (str8 != null) {
            c2344009GkLJ.LJFF("auction_type", str8);
        }
        String str9 = (String) ((LinkedHashMap) map4).get("auction_info_all");
        if (str9 != null) {
            c2344009GkLJ.LJFF("auction_info_all", str9);
        }
        String str10 = (String) ((LinkedHashMap) map4).get("auction_info_left");
        if (str10 != null) {
            c2344009GkLJ.LJFF("auction_info_left", str10);
        }
        String str11 = (String) ((LinkedHashMap) map4).get("entrance_info");
        if (str11 != null) {
            c2344009GkLJ.LJFF("entrance_info", str11);
        }
        if (map != null) {
            c2344009GkLJ.LJII(map);
        }
        LIZ(c2344009GkLJ);
        c2344009GkLJ.LJII(LIZLLL());
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                c2344009GkLJ.LJFF((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        if (map3 != null) {
            for (Map.Entry entry2 : map3.entrySet()) {
                c2344009GkLJ.LJFF((String) entry2.getKey(), String.valueOf(entry2.getValue()));
            }
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map5 = c2344009GkLJ.LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_stay_time", map5);
    }
}
