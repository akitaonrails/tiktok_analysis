package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@InterfaceC1294060jmO
public final class C21206717yr {
    public static final C21206717yr LIZ = new C21206717yr();

    public static Map LIZJ() {
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

    public static C2344009Gk LIZLLL(C1743900vTw c1743900vTw) {
        String value;
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
        String strLIZJ16 = c1743900vTw.LIZJ("room_id");
        String strLIZJ17 = c1743900vTw.LIZJ("enter_from_merge");
        String strLIZJ18 = c1743900vTw.LIZJ("param_search_result_id");
        IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
        String paramByName = iEcomSearchService.getParamByName("search_entrance_second");
        if (paramByName != null && C123100dR.LIZ(paramByName)) {
            c2344009Gk.LJFF("search_entrance_second", paramByName);
        }
        String paramByName2 = iEcomSearchService.getParamByName("source_module");
        if (paramByName2 != null && C123100dR.LIZ(paramByName2)) {
            c2344009Gk.LJFF("source_module", paramByName2);
        }
        for (Map.Entry<String, String> entry : C1ER1.LIZIZ.getLogParamsFromSearch(strLIZJ17, strLIZJ16, "search_result_id", "search_id", "search_entrance", "list_item_id", "last_from_group_id", "origin_is_mall_tab", "search_keyword", "search_pre_product_id", "click_recom_search_entrance").entrySet()) {
            if (Intrinsics.LJFF(entry.getKey(), "list_item_id") && Intrinsics.LJFF(strLIZJ17, "general_search")) {
                if (strLIZJ16 == null) {
                    value = entry.getValue();
                } else {
                    value = strLIZJ16;
                }
                c2344009Gk.LJFF("list_item_id", value);
            } else if (Intrinsics.LJFF(entry.getKey(), "search_result_id") && !TextUtils.isEmpty(strLIZJ18)) {
                c2344009Gk.LJFF(entry.getKey(), strLIZJ18);
            } else {
                c2344009Gk.LJFF(entry.getKey(), entry.getValue());
            }
        }
        String strLIZJ19 = c1743900vTw.LIZJ("entrance_form");
        if (strLIZJ19 != null && TextUtils.equals(strLIZJ19, "live_popup_card")) {
            String strLIZJ20 = c1743900vTw.LIZJ("is_mix_product");
            if (strLIZJ20 == null) {
                strLIZJ20 = "";
            }
            c2344009Gk.LJFF("is_mix_product", strLIZJ20);
        }
        HashMap map = (HashMap) c1743900vTw.LIZIZ();
        if (map != null) {
            c2344009Gk.LJI(map);
        }
        String strLIZJ21 = c1743900vTw.LIZJ("track_id");
        if (strLIZJ21 != null) {
            c2344009Gk.LJFF("track_id", strLIZJ21);
        }
        String strLIZJ22 = c1743900vTw.LIZJ("is_ad");
        if (strLIZJ22 == null) {
            strLIZJ22 = "";
        }
        c2344009Gk.LJFF("is_ad", strLIZJ22);
        String strLIZJ23 = c1743900vTw.LIZJ("ad_id");
        if (strLIZJ23 == null) {
            strLIZJ23 = "";
        }
        c2344009Gk.LJFF("ad_id", strLIZJ23);
        String strLIZJ24 = c1743900vTw.LIZJ("creative_id");
        if (strLIZJ24 != null) {
            str = strLIZJ24;
        }
        c2344009Gk.LJFF("creative_id", str);
        return c2344009Gk;
    }

    public static final void LJII(C1743900vTw c1743900vTw) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        String strLIZJ = c1743900vTw.LIZJ("author_id");
        String str = "";
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        linkedHashMap.put("author_id", strLIZJ);
        String strLIZJ2 = c1743900vTw.LIZJ("room_id");
        if (strLIZJ2 == null) {
            strLIZJ2 = "";
        }
        linkedHashMap.put("room_id", strLIZJ2);
        String strLIZJ3 = c1743900vTw.LIZJ("enter_from_merge");
        if (strLIZJ3 == null) {
            strLIZJ3 = "";
        }
        linkedHashMap.put("enter_from_merge", strLIZJ3);
        String strLIZJ4 = c1743900vTw.LIZJ("enter_method");
        if (strLIZJ4 == null) {
            strLIZJ4 = "";
        }
        linkedHashMap.put("enter_method", strLIZJ4);
        String strLIZJ5 = c1743900vTw.LIZJ("action_type");
        if (strLIZJ5 == null) {
            strLIZJ5 = "";
        }
        linkedHashMap.put("action_type", strLIZJ5);
        String strLIZJ6 = c1743900vTw.LIZJ("follow_status");
        if (strLIZJ6 == null) {
            strLIZJ6 = "";
        }
        linkedHashMap.put("follow_status", strLIZJ6);
        String strLIZJ7 = c1743900vTw.LIZJ("rec_params");
        if (strLIZJ7 == null) {
            strLIZJ7 = "";
        }
        linkedHashMap.put("rec_params", strLIZJ7);
        linkedHashMap.put("source_page_type", "live");
        String strLIZJ8 = c1743900vTw.LIZJ("request_id");
        if (strLIZJ8 == null) {
            strLIZJ8 = "";
        }
        linkedHashMap.put("request_id", strLIZJ8);
        String strLIZJ9 = c1743900vTw.LIZJ("guidance_text_type");
        if (strLIZJ9 != null) {
            str = strLIZJ9;
        }
        linkedHashMap.put("guidance_text_type", str);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_guidance_show", linkedHashMap);
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

    public static final void LJI(C1743900vTw c1743900vTw, String str, long j) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        String strLIZJ = c1743900vTw.LIZJ("author_id");
        String str2 = "";
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        linkedHashMap.put("author_id", strLIZJ);
        String strLIZJ2 = c1743900vTw.LIZJ("room_id");
        if (strLIZJ2 == null) {
            strLIZJ2 = "";
        }
        linkedHashMap.put("room_id", strLIZJ2);
        String strLIZJ3 = c1743900vTw.LIZJ("enter_from_merge");
        if (strLIZJ3 == null) {
            strLIZJ3 = "";
        }
        linkedHashMap.put("enter_from_merge", strLIZJ3);
        String strLIZJ4 = c1743900vTw.LIZJ("enter_method");
        if (strLIZJ4 == null) {
            strLIZJ4 = "";
        }
        linkedHashMap.put("enter_method", strLIZJ4);
        String strLIZJ5 = c1743900vTw.LIZJ("action_type");
        if (strLIZJ5 == null) {
            strLIZJ5 = "";
        }
        linkedHashMap.put("action_type", strLIZJ5);
        String strLIZJ6 = c1743900vTw.LIZJ("follow_status");
        if (strLIZJ6 == null) {
            strLIZJ6 = "";
        }
        linkedHashMap.put("follow_status", strLIZJ6);
        String strLIZJ7 = c1743900vTw.LIZJ("rec_params");
        if (strLIZJ7 == null) {
            strLIZJ7 = "";
        }
        linkedHashMap.put("rec_params", strLIZJ7);
        linkedHashMap.put("source_page_type", "live");
        String strLIZJ8 = c1743900vTw.LIZJ("request_id");
        if (strLIZJ8 == null) {
            strLIZJ8 = "";
        }
        linkedHashMap.put("request_id", strLIZJ8);
        String strLIZJ9 = c1743900vTw.LIZJ("guidance_text_type");
        if (strLIZJ9 != null) {
            str2 = strLIZJ9;
        }
        linkedHashMap.put("guidance_text_type", str2);
        linkedHashMap.put("close_type", str);
        linkedHashMap.put("stay_time", String.valueOf(j));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_guidance_close", linkedHashMap);
    }

    public static final void LJFF(C1743900vTw c1743900vTw, Boolean bool, String str, Map map, Map map2, Map map3) {
        long j;
        C2344009Gk c2344009GkLIZLLL = LIZLLL(c1743900vTw);
        c2344009GkLIZLLL.LJIIIIZZ("item_order", c1743900vTw.LIZJ("item_order"));
        if (c1743900vTw.LJFF("campaign_id")) {
            c2344009GkLIZLLL.LJFF("campaign_id", c1743900vTw.LIZJ("campaign_id"));
        }
        if (c1743900vTw.LJFF("campaign_type")) {
            c2344009GkLIZLLL.LJFF("campaign_type", c1743900vTw.LIZJ("campaign_type"));
        }
        if (c1743900vTw.LJFF("campaign_channel")) {
            c2344009GkLIZLLL.LJFF("campaign_channel", c1743900vTw.LIZJ("campaign_channel"));
        }
        if (c1743900vTw.LJFF("campaign_user_tag")) {
            c2344009GkLIZLLL.LJFF("campaign_user_tag", c1743900vTw.LIZJ("campaign_user_tag"));
        }
        if (c1743900vTw.LJFF("source_page_type")) {
            c2344009GkLIZLLL.LJFF("source_page_type", c1743900vTw.LIZJ("source_page_type"));
        }
        if (c1743900vTw.LJFF("shopping_status")) {
            c2344009GkLIZLLL.LJFF("shopping_status", c1743900vTw.LIZJ("shopping_status"));
        }
        if (c1743900vTw.LJFF("shopping_mode")) {
            c2344009GkLIZLLL.LJFF("shopping_mode", c1743900vTw.LIZJ("shopping_mode"));
        }
        if (c1743900vTw.LJFF("isFirst")) {
            c2344009GkLIZLLL.LJFF("is_first", c1743900vTw.LIZJ("isFirst"));
        }
        if (c1743900vTw.LJFF("api_end_time")) {
            String strLIZJ = c1743900vTw.LIZJ("api_end_time");
            if (strLIZJ != null) {
                j = CastLongProtector.parseLong(strLIZJ);
            } else {
                j = 0;
            }
            c2344009GkLIZLLL.LIZLLL(System.currentTimeMillis() - j, "duration");
        }
        String strLIZJ2 = c1743900vTw.LIZJ("is_hot");
        if (strLIZJ2 != null) {
            c2344009GkLIZLLL.LJFF("is_hot", strLIZJ2);
        }
        String strLIZJ3 = c1743900vTw.LIZJ("hot_sell_number");
        if (strLIZJ3 != null) {
            c2344009GkLIZLLL.LJFF("hot_sell_number", strLIZJ3);
        }
        String strLIZJ4 = c1743900vTw.LIZJ("label_type");
        if (strLIZJ4 != null) {
            c2344009GkLIZLLL.LJFF("label_type", strLIZJ4);
        }
        String strLIZJ5 = c1743900vTw.LIZJ("label_number");
        if (strLIZJ5 != null) {
            c2344009GkLIZLLL.LJFF("label_number", strLIZJ5);
        }
        String strLIZJ6 = c1743900vTw.LIZJ("ecom_live_rcmd_info");
        if (strLIZJ6 != null) {
            c2344009GkLIZLLL.LJFF("ecom_live_rcmd_info", strLIZJ6);
        }
        if (c1743900vTw.LJFF("source_module")) {
            c2344009GkLIZLLL.LJFF("source_module", c1743900vTw.LIZJ("source_module"));
        }
        LIZIZ(c2344009GkLIZLLL, c1743900vTw);
        LIZ(c2344009GkLIZLLL);
        c2344009GkLIZLLL.LJII(map);
        c2344009GkLIZLLL.LJII(map2);
        c2344009GkLIZLLL.LJII(LIZJ());
        c2344009GkLIZLLL.LJII(map3);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map4 = c2344009GkLIZLLL.LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_show", map4);
        LJIIIIZZ(true, bool, "icon", str, map, null);
    }

    public static void LJIIIIZZ(boolean z, Boolean bool, String str, String str2, Map map, C1743900vTw c1743900vTw) {
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

    public static void LJ(C1743900vTw c1743900vTw, String str, Boolean bool, Map map, Map map2, String str2, String str3, Map map3, Map map4, String str4) {
        C2344009Gk c2344009GkLIZLLL = LIZLLL(c1743900vTw);
        c2344009GkLIZLLL.LJIIIIZZ("item_order", c1743900vTw.LIZJ("item_order"));
        if (str4 != null) {
            c2344009GkLIZLLL.LJFF("entrance_form", str4);
        }
        if (c1743900vTw.LJFF("campaign_id")) {
            c2344009GkLIZLLL.LJFF("campaign_id", c1743900vTw.LIZJ("campaign_id"));
        }
        if (c1743900vTw.LJFF("campaign_type")) {
            c2344009GkLIZLLL.LJFF("campaign_type", c1743900vTw.LIZJ("campaign_type"));
        }
        if (c1743900vTw.LJFF("campaign_channel")) {
            c2344009GkLIZLLL.LJFF("campaign_channel", c1743900vTw.LIZJ("campaign_channel"));
        }
        if (c1743900vTw.LJFF("campaign_user_tag")) {
            c2344009GkLIZLLL.LJFF("campaign_user_tag", c1743900vTw.LIZJ("campaign_user_tag"));
        }
        if (c1743900vTw.LJFF("shopping_status")) {
            c2344009GkLIZLLL.LJFF("shopping_status", c1743900vTw.LIZJ("shopping_status"));
        }
        if (c1743900vTw.LJFF("shopping_mode")) {
            c2344009GkLIZLLL.LJFF("shopping_mode", c1743900vTw.LIZJ("shopping_mode"));
        }
        if (c1743900vTw.LJFF("source_page_type")) {
            c2344009GkLIZLLL.LJFF("source_page_type", c1743900vTw.LIZJ("source_page_type"));
        }
        String strLIZJ = c1743900vTw.LIZJ("is_hot");
        if (strLIZJ != null) {
            c2344009GkLIZLLL.LJFF("is_hot", strLIZJ);
        }
        String strLIZJ2 = c1743900vTw.LIZJ("hot_sell_number");
        if (strLIZJ2 != null) {
            c2344009GkLIZLLL.LJFF("hot_sell_number", strLIZJ2);
        }
        String strLIZJ3 = c1743900vTw.LIZJ("label_type");
        if (strLIZJ3 != null) {
            c2344009GkLIZLLL.LJFF("label_type", strLIZJ3);
        }
        String strLIZJ4 = c1743900vTw.LIZJ("label_number");
        if (strLIZJ4 != null) {
            c2344009GkLIZLLL.LJFF("label_number", strLIZJ4);
        }
        String strLIZJ5 = c1743900vTw.LIZJ("label_order");
        if (strLIZJ5 != null) {
            c2344009GkLIZLLL.LJFF("label_order", strLIZJ5);
        }
        String strLIZJ6 = c1743900vTw.LIZJ("ec_access_forbidden");
        if (strLIZJ6 != null) {
            c2344009GkLIZLLL.LJFF("ec_access_forbidden", strLIZJ6);
        }
        if (c1743900vTw.LJFF("source_module")) {
            c2344009GkLIZLLL.LJFF("source_module", c1743900vTw.LIZJ("source_module"));
        }
        String strLIZJ7 = c1743900vTw.LIZJ("guidance_text_type");
        if (strLIZJ7 != null) {
            c2344009GkLIZLLL.LJFF("guidance_text_type", strLIZJ7);
        }
        String strLIZJ8 = c1743900vTw.LIZJ("notice_type");
        if (strLIZJ8 != null) {
            c2344009GkLIZLLL.LJFF("notice_type", strLIZJ8);
        }
        String strLIZJ9 = c1743900vTw.LIZJ("minimum_interval");
        if (strLIZJ9 != null) {
            c2344009GkLIZLLL.LJFF("minimum_interval", strLIZJ9);
        }
        String strLIZJ10 = c1743900vTw.LIZJ("ecom_live_rcmd_info");
        if (strLIZJ10 != null) {
            c2344009GkLIZLLL.LJFF("ecom_live_rcmd_info", strLIZJ10);
        }
        c2344009GkLIZLLL.LJFF("landing_page", str3);
        LIZ(c2344009GkLIZLLL);
        LIZIZ(c2344009GkLIZLLL, c1743900vTw);
        c2344009GkLIZLLL.LJII(map);
        c2344009GkLIZLLL.LJII(map2);
        c2344009GkLIZLLL.LJII(LIZJ());
        c2344009GkLIZLLL.LJII(map3);
        c2344009GkLIZLLL.LJII(map4);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map5 = c2344009GkLIZLLL.LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_click", map5);
        LJIIIIZZ(false, bool, str2, str, map, c1743900vTw);
    }
}
