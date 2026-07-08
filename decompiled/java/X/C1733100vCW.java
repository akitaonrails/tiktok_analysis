package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ProductConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vCW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733100vCW {
    public static final C1733100vCW LIZ = new C1733100vCW();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("enter_from_merge", "enter_method", "action_type", "btm", "btm_show_id", "bcm_chain", "is_ad", "request_id");
    public static final Map<String, String> LIZJ = C2097608Jq.LJIIIIZZ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("module_name", "live_billboard"));

    public static String LJIIJ(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
            return obj.toString();
        }
        return obj.toString();
    }

    public static void LIZIZ(Map map, Map map2) {
        Object obj;
        for (String str : LIZIZ) {
            if (map2 != null && (obj = map2.get(str)) != null) {
                LIZ.getClass();
                String strLJIIJ = LJIIJ(obj);
                if (strLJIIJ != null) {
                    map.put(str, strLJIIJ);
                }
            }
        }
    }

    public static String LJIIIZ(ECBillboard eCBillboard, Map map) {
        Object obj;
        String strLJIIJ;
        if (map != null && (obj = map.get("entrance_form")) != null && (strLJIIJ = LJIIJ(obj)) != null && (!a0.LJJJIL(strLJIIJ))) {
            return strLJIIJ;
        }
        if (eCBillboard.LIZIZ()) {
            return "promo_billboard";
        }
        if (!eCBillboard.LIZ()) {
            return null;
        }
        return "sale_billboard";
    }

    public static void LIZ(String str, View view, Map map) {
        String str2;
        PageFinder pageFinderVia;
        if (Intrinsics.LJFF(str, "live_billboard")) {
            str2 = "a2270.b4180.c19607";
        } else if (Intrinsics.LJFF(str, "benefit_watermark")) {
            str2 = "a2270.b4180.c62765";
        } else {
            str2 = "";
        }
        if (str2.length() == 0) {
            return;
        }
        if (view == null || (pageFinderVia = PageFinder.via(view)) == null) {
            pageFinderVia = PageFinder.via(EnumC1733160vCc.LIVE_ROOM.getValue());
        }
        map.putAll(C7936038c.LIZ(str2, pageFinderVia));
        String bcmChainStandardStringByFinder = BtmSDK.INSTANCE.getBcmChainStandardStringByFinder(str2, pageFinderVia, null);
        if (bcmChainStandardStringByFinder.length() > 0) {
            map.put("bcm_chain", bcmChainStandardStringByFinder);
        }
        if (!map.containsKey("btm")) {
            map.put("btm", str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:3:0x0002, B:6:0x0010, B:8:0x001f, B:13:0x0028, B:15:0x0055, B:18:0x005e, B:24:0x006e, B:26:0x0077, B:29:0x0096, B:33:0x009f, B:35:0x00a9, B:37:0x00bd, B:36:0x00b9, B:27:0x008c, B:14:0x004c, B:20:0x0062, B:23:0x0069), top: B:45:0x0002, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.String r10, java.lang.String r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1733100vCW.LIZLLL(java.lang.String, java.lang.String, java.util.Map):java.lang.String");
    }

    public static String LJIIIIZZ(Uri uri, String str, String str2) {
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        boolean z = false;
        for (String str3 : UriProtector.getQueryParameterNames(uri)) {
            List<String> queryParameters = UriProtector.getQueryParameters(uri, str3);
            if (Intrinsics.LJFF(str3, str)) {
                if (!z) {
                    builderClearQuery.appendQueryParameter(str3, str2);
                    z = true;
                }
            } else {
                Iterator<String> it2 = queryParameters.iterator();
                while (it2.hasNext()) {
                    builderClearQuery.appendQueryParameter(str3, it2.next());
                }
            }
        }
        if (!z) {
            builderClearQuery.appendQueryParameter(str, str2);
        }
        return builderClearQuery.build().toString();
    }

    public static String LIZJ(String str, String str2, Map map, Map map2) {
        String strLJIIJ;
        Object obj;
        if (str != null && str.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("source_page_type", "live");
            linkedHashMap.putAll(map2);
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("enter_page_entrance", str2);
            if (map == null || (obj = map.get("entrance_form")) == null || (strLJIIJ = LJIIJ(obj)) == null || !(!a0.LJJJIL(strLJIIJ))) {
                strLJIIJ = null;
            }
            return LIZLLL(str, strLJIIJ, linkedHashMap);
        }
        return str;
    }

    public static Map LJFF(String str, String str2, Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("author_id", str);
        linkedHashMap.put("room_id", str2);
        LIZ.getClass();
        LIZIZ(linkedHashMap, map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map LJ(String str, String str2, Map map, Map map2, C1733010vCN c1733010vCN, ECBillboard eCBillboard) {
        Object obj;
        String strLJIIJ;
        Long l;
        String string;
        Map mapLJFF = LJFF(str, str2, map, map2);
        mapLJFF.put("page_name", "live");
        mapLJFF.put("source_page_type", "live");
        mapLJFF.put("click_area", "card");
        LIZ.getClass();
        LIZ("live_billboard", c1733010vCN, mapLJFF);
        ProductConfig productConfig = eCBillboard.productConfig;
        if (productConfig != null && (l = productConfig.productId) != null && (string = l.toString()) != null && (!a0.LJJJIL(string))) {
            mapLJFF.put("product_id", string);
        }
        if (map != null && (obj = map.get("track_id")) != null && (strLJIIJ = LJIIJ(obj)) != null) {
            mapLJFF.put("track_id", strLJIIJ);
        }
        return mapLJFF;
    }

    public static void LJII(String str, String str2, String str3, Map map, Map map2, View view, String str4, String str5) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJFF = LJFF(str, str2, map, map2);
        mapLJFF.put("page_name", "live");
        mapLJFF.put("click_area", str3);
        mapLJFF.put("module_name", str3);
        LIZ.getClass();
        LIZ(str3, view, mapLJFF);
        if (str4 != null) {
            mapLJFF.put("icon_type", str4);
        }
        if (str5 != null) {
            mapLJFF.put("billboard_type", str5);
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_module_click", mapLJFF);
    }

    public static void LJI(C1733100vCW c1733100vCW, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, C1733010vCN c1733010vCN, boolean z, int i) {
        Map mapLJ;
        if ((i & 64) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        if ((i & 128) != 0) {
            map = null;
        }
        if ((i & 256) != 0) {
            map2 = C2097608Jq.LJ();
        }
        if ((i & 512) != 0) {
            c1733010vCN = null;
        }
        if ((i & 1024) != 0) {
            z = false;
        }
        c1733100vCW.getClass();
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZJ);
        linkedHashMap.put("author_id", str);
        linkedHashMap.put("room_id", str2);
        linkedHashMap.put("billboard_type", str3);
        linkedHashMap.put("billboard_promo", str4);
        linkedHashMap.put("icon_type", str5);
        linkedHashMap.put("page_name", str6);
        linkedHashMap.putAll(mapLJ);
        linkedHashMap.putAll(map2);
        LIZ.getClass();
        LIZ("live_billboard", c1733010vCN, linkedHashMap);
        if (z) {
            LIZIZ(linkedHashMap, map);
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_module_show", linkedHashMap);
    }
}
