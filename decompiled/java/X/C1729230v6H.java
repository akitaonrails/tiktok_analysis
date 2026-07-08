package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveBillboardTrackParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v6H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729230v6H {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("page_name", "live"), new Pair("popup_name", "billboard_update"), new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"));

    public static void LIZIZ(C1729160v6A c1729160v6A, String str) {
        boolean z;
        Object obj;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("is_org_template", CardStruct.IStatusCode.DEFAULT);
        SeaLiveBillboardTrackParams seaLiveBillboardTrackParams = c1729160v6A.LJII;
        if (seaLiveBillboardTrackParams != null && seaLiveBillboardTrackParams.isAutoDisplay) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_auto_display", obj);
        if (!c1729160v6A.LIZJ) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_live_take_default", str2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        String str3 = c1729160v6A.LJFF;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = c1729160v6A.LIZLLL;
        String str5 = c1729160v6A.LJ;
        String str6 = c1729160v6A.LIZ;
        Long l = c1729160v6A.LIZIZ;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"));
        mapLJIIJ.put("room_id", str3);
        mapLJIIJ.put("live_status", "during_live");
        mapLJIIJ.put("author_id", str);
        mapLJIIJ.put("user_type", "author");
        mapLJIIJ.put("is_live_take_default", CardStruct.IStatusCode.DEFAULT);
        mapLJIIJ.put("billboard_type", "photo");
        if (str4 != null) {
            mapLJIIJ.put("resource_id", str4);
        }
        if (str5 != null) {
            mapLJIIJ.put("sticker_id", str5);
        }
        if (str6 != null) {
            mapLJIIJ.put("photo_id", str6);
        }
        mapLJIIJ.put("tem_num", String.valueOf(1));
        if (l != null) {
            l.longValue();
            mapLJIIJ.put("use_time", String.valueOf((System.currentTimeMillis() - l.longValue()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        }
        mapLJIIJ.put("template_id", "7");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIIIZZ.size()));
        for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        mapLJIIJ.putAll(linkedHashMap);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_billboard_use_time", mapLJIIJ);
    }

    public static void LIZJ(String str, String str2, String str3, String str4) {
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

    public static void LIZ(Map map, String str, String str2, String str3, String str4, String str5) {
        if (Intrinsics.LJFF(map.get("is_real_display_on_screen"), CardStruct.IStatusCode.DEFAULT)) {
            return;
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"));
        mapLJIIJ.put("room_id", str);
        mapLJIIJ.put("live_status", "during_live");
        mapLJIIJ.put("author_id", str2);
        mapLJIIJ.put("user_type", "author");
        mapLJIIJ.put("is_live_take_default", CardStruct.IStatusCode.DEFAULT);
        mapLJIIJ.put("billboard_type", "photo");
        if (str3 != null) {
            mapLJIIJ.put("resource_id", str3);
        }
        if (str4 != null) {
            mapLJIIJ.put("sticker_id", str4);
        }
        if (str5 != null) {
            mapLJIIJ.put("photo_id", str5);
        }
        mapLJIIJ.put("tem_num", String.valueOf(1));
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        mapLJIIJ.putAll(linkedHashMap);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_billboard_select", mapLJIIJ);
    }
}
