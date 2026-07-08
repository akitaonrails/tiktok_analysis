package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.BillboardTrackParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v6I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729240v6I {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("page_name", "live"), new Pair("popup_name", "billboard_update"), new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"));

    public static String LJFF(int i) {
        return i == 0 ? "before_live" : "during_live";
    }

    public static void LIZLLL(C1729210v6F c1729210v6F, String str) {
        Object obj;
        Pair[] pairArr = new Pair[3];
        String str2 = CardStruct.IStatusCode.DEFAULT;
        boolean z = false;
        pairArr[0] = new Pair("is_org_template", CardStruct.IStatusCode.DEFAULT);
        BillboardTrackParams billboardTrackParams = c1729210v6F.LJII;
        if (billboardTrackParams != null && billboardTrackParams.isAutoDisplay) {
            z = true;
        }
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_auto_display", obj);
        if (c1729210v6F.LIZJ) {
            str2 = "1";
        }
        pairArr[2] = new Pair("is_live_take_default", str2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        String str3 = c1729210v6F.LJFF;
        if (str3 == null) {
            str3 = "";
        }
        LIZJ(mapLJIIIIZZ, str3, str, "photo", c1729210v6F.LIZLLL, c1729210v6F.LJ, "7", c1729210v6F.LIZ, 1, c1729210v6F.LIZIZ);
    }

    public static void LJ(String str, String str2, String str3, String str4) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("room_id", str);
        linkedHashMap.put("live_status", str2);
        linkedHashMap.put("author_id", str3);
        linkedHashMap.put("click_area", str4);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_popup_click", linkedHashMap);
    }

    public static void LIZ(int i, String str, String str2, String str3, String str4, String str5, Map map) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"));
        mapLJIIJ.put("is_live_take_default", CardStruct.IStatusCode.DEFAULT);
        mapLJIIJ.put("room_id", str);
        mapLJIIJ.put("live_status", str2);
        mapLJIIJ.put("author_id", str3);
        mapLJIIJ.put("user_type", "author");
        mapLJIIJ.put("billboard_type", str4);
        mapLJIIJ.put("click_type", str5);
        mapLJIIJ.put("is_live_take_default", CardStruct.IStatusCode.DEFAULT);
        mapLJIIJ.put("tem_num", String.valueOf(i));
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            mapLJIIJ.putAll(linkedHashMap);
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("tiktokec_billboard_click", mapLJIIJ);
    }

    public static void LIZIZ(Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        Object obj;
        if (map != null) {
            obj = map.get("is_real_display_on_screen");
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(obj, CardStruct.IStatusCode.DEFAULT)) {
            return;
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"));
        mapLJIIJ.put("room_id", str);
        mapLJIIJ.put("live_status", str2);
        mapLJIIJ.put("author_id", str3);
        mapLJIIJ.put("user_type", "author");
        mapLJIIJ.put("is_live_take_default", CardStruct.IStatusCode.DEFAULT);
        mapLJIIJ.put("billboard_type", str4);
        if (str5 != null) {
            mapLJIIJ.put("resource_id", str5);
        }
        if (str6 != null) {
            mapLJIIJ.put("sticker_id", str6);
        }
        if (str7 != null) {
            mapLJIIJ.put("photo_id", str7);
        }
        mapLJIIJ.put("tem_num", String.valueOf(i));
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            mapLJIIJ.putAll(linkedHashMap);
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_billboard_select", mapLJIIJ);
    }

    public static void LIZJ(Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Long l) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"));
        mapLJIIJ.put("room_id", str);
        mapLJIIJ.put("live_status", "during_live");
        mapLJIIJ.put("author_id", str2);
        mapLJIIJ.put("user_type", "author");
        mapLJIIJ.put("is_live_take_default", CardStruct.IStatusCode.DEFAULT);
        mapLJIIJ.put("billboard_type", str3);
        if (str4 != null) {
            mapLJIIJ.put("resource_id", str4);
        }
        if (str5 != null) {
            mapLJIIJ.put("sticker_id", str5);
        }
        if (str7 != null) {
            mapLJIIJ.put("photo_id", str7);
        }
        mapLJIIJ.put("tem_num", String.valueOf(i));
        if (l != null) {
            l.longValue();
            mapLJIIJ.put("use_time", String.valueOf((System.currentTimeMillis() - l.longValue()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        }
        if (str6 != null) {
            mapLJIIJ.put("template_id", str6);
        }
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            mapLJIIJ.putAll(linkedHashMap);
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_billboard_use_time", mapLJIIJ);
    }
}
