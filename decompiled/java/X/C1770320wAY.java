package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wAY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770320wAY {
    public static final C1770320wAY LIZ = new C1770320wAY();

    public static String LJIIL(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(',');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void LIZJ(String str, Map map) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("search_entrance", str), new Pair("enter_from", str), new Pair("photo_search_previous_page", str), new Pair("photo_search_module", "non_shoppable_videos_recom_find_similar"));
        mapLJIIJ.putAll(map);
        mapLJIIJ.remove("enter_product_id");
        C1421105hJ.LIZJ("find_similar_tab_click", mapLJIIJ);
    }

    public static void LIZLLL(String str, Map map) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("search_entrance", str), new Pair("enter_from", str), new Pair("photo_search_previous_page", str), new Pair("photo_search_module", "non_shoppable_videos_recom_find_similar"));
        mapLJIIJ.putAll(map);
        mapLJIIJ.remove("enter_product_id");
        C1421105hJ.LIZJ("find_similar_tab_show", mapLJIIJ);
    }

    public static void LJI(int i, int i2, long j) {
        try {
            C1421105hJ.LIZJ("rd_tiktokec_search_base64_decoded_success_rate", C2097608Jq.LJIIJ(new Pair("success", Integer.valueOf(i)), new Pair("duration", Long.valueOf(j)), new Pair("length", Integer.valueOf(i2))));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIIIIZZ(EnumC1770450wAl enumC1770450wAl, Map map, Integer num, Integer num2) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("reason", Integer.valueOf(enumC1770450wAl.getValue()));
            if (num != null) {
                linkedHashMap.put("interest_type", Integer.valueOf(num.intValue()));
            }
            if (num2 != null) {
                linkedHashMap.put("play_duration", Integer.valueOf(num2.intValue()));
            }
            C1421105hJ.LIZJ("tiktokec_rd_search_feed_guide_entrance_not_show", linkedHashMap);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZ(Aweme aweme, Integer num, Integer num2, Float f, String str) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("item_id", aweme.getAid()), new Pair("enter_from", str), new Pair("is_cart", 0));
        if (num != null) {
            mapLJIIJ.put("action_type", Integer.valueOf(num.intValue()));
        }
        if (num2 != null) {
            mapLJIIJ.put("play_duration", Integer.valueOf(num2.intValue()));
        }
        if (f != null) {
            mapLJIIJ.put("duration_rate", Float.valueOf(((int) (f.floatValue() * 100)) / 100.0f));
        }
        C1421105hJ.LIZJ("tiktokec_ecom_video_action", mapLJIIJ);
    }

    public static void LJ(String str, String str2, String str3, String str4, Map map) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str4), new Pair("enter_method", "click_no_anchor_video_button"), new Pair("mall_entrance", "homepage_hot_no_anchor_video"), new Pair("tab_name", "shop_now"), new Pair("mall_extra_info", str2), new Pair("diversion_params", str3), new Pair("direct_text", str), new Pair("is_login", Integer.valueOf(((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin() ? 1 : 0)));
        mapLJIIJ.putAll(map);
        C1421105hJ.LIZJ("tiktokec_mall_entrance_click", mapLJIIJ);
    }

    public static void LJFF(String str, String str2, String str3, String str4, Map map) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str4), new Pair("enter_method", "click_no_anchor_video_button"), new Pair("mall_entrance", "homepage_hot_no_anchor_video"), new Pair("tab_name", "shop_now"), new Pair("mall_extra_info", str2), new Pair("diversion_params", str3), new Pair("direct_text", str), new Pair("is_login", Integer.valueOf(((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin() ? 1 : 0)));
        mapLJIIJ.putAll(map);
        C1421105hJ.LIZJ("tiktokec_mall_entrance_show", mapLJIIJ);
    }

    public static void LJIIJ(Map map, Integer num, Boolean bool, String str, String str2) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("words_source", "feed_mall_search_button"), new Pair("words_position", 0), new Pair("search_position", str2), new Pair("search_entrance", str2), new Pair("bar_type", str));
        mapLJIIJ.putAll(map);
        if (num != null) {
            mapLJIIJ.put("group_position", Integer.valueOf(num.intValue()));
        }
        if (bool != null) {
            mapLJIIJ.put("is_full_word", Integer.valueOf(!bool.booleanValue() ? 1 : 0));
        }
        C1421105hJ.LIZJ("trending_words_click", mapLJIIJ);
    }

    public static void LJIIJJI(Map map, Integer num, Boolean bool, String str, String str2) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("words_source", "feed_mall_search_button"), new Pair("words_position", 0), new Pair("search_position", str2), new Pair("search_entrance", str2), new Pair("bar_type", str));
        mapLJIIJ.putAll(map);
        if (num != null) {
            mapLJIIJ.put("group_position", Integer.valueOf(num.intValue()));
        }
        if (bool != null) {
            mapLJIIJ.put("is_full_word", Integer.valueOf(!bool.booleanValue() ? 1 : 0));
        }
        C1421105hJ.LIZJ("trending_words_show", mapLJIIJ);
    }

    public static void LJII(C1770320wAY c1770320wAY, Aweme aweme, String str, Integer num, Boolean bool, String str2, Long l, List list, List list2, int i) {
        if ((i & 1) != 0) {
            aweme = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            list = null;
        }
        if ((i & 128) != 0) {
            list2 = null;
        }
        c1770320wAY.getClass();
        try {
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, 2), new Pair("stage", str));
            if (aweme != null) {
                String aid = aweme.getAid();
                if (aid != null) {
                    mapLJIIJ.put("aweme_id", aid);
                }
                mapLJIIJ.put("sale_intent", Integer.valueOf(C1770180wAK.LJIIJ(C1770180wAK.LIZ, aweme)));
                mapLJIIJ.put("relation_type", Integer.valueOf(aweme.getProductRecallType()));
            }
            if (num != null) {
                mapLJIIJ.put("interest_type", Integer.valueOf(num.intValue()));
            }
            if (bool != null) {
                bool.booleanValue();
                mapLJIIJ.put("pass", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            if (str2 != null) {
                mapLJIIJ.put("enter_from", str2);
            }
            if (l != null) {
                mapLJIIJ.put("duration", Long.valueOf(l.longValue()));
            }
            if (list != null) {
                LIZ.getClass();
                String strLJIIL = LJIIL(list);
                if (strLJIIL != null) {
                    mapLJIIJ.put("aweme_id_list", strLJIIL);
                }
            }
            if (list2 != null) {
                LIZ.getClass();
                String strLJIIL2 = LJIIL(list2);
                if (strLJIIL2 != null) {
                    mapLJIIJ.put("aweme_id_success_list", strLJIIL2);
                }
            }
            mapLJIIJ.put("enable", Integer.valueOf(C1770330wAZ.LIZ().enable));
            mapLJIIJ.put("enter_from_filter", C1770330wAZ.LIZ().enterFromFilter.toString());
            mapLJIIJ.put("disable_ttt_filter", Integer.valueOf(C1770330wAZ.LIZ().disableTttFilter));
            mapLJIIJ.put("sale_intent_filter", Integer.valueOf(C1770330wAZ.LIZ().saleIntentFilter));
            mapLJIIJ.put("enable_dev_sale_intent", Integer.valueOf(C1770330wAZ.LIZ().enableDevSaleIntent));
            C1421105hJ.LIZJ("tiktokec_rd_search_diversion_trace", mapLJIIJ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
