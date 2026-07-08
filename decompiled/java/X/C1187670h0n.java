package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187670h0n {
    public static final C1187670h0n LIZ = new C1187670h0n();

    public static void LIZLLL(int i, String str, String str2, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key", "network_result");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("biz", str);
        linkedHashMap.put("error_code", String.valueOf(i));
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        if (str2 != null) {
            linkedHashMap.put(Scene.SCENE_SERVICE, "component_refresh");
        } else {
            linkedHashMap.put(Scene.SCENE_SERVICE, "page_refresh");
            str2 = "";
        }
        linkedHashMap.put("from_instance_id", str2);
        C20684815ws.LJIILLIIL("local_service_slash_track", linkedHashMap);
    }

    public static void LJ(long j, String str, String str2, Map map, boolean z) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key", "network_duration");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("biz", str);
        linkedHashMap.put("duration", String.valueOf(j));
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_success", str3);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        if (str2 != null) {
            linkedHashMap.put(Scene.SCENE_SERVICE, "component_refresh");
        } else {
            linkedHashMap.put(Scene.SCENE_SERVICE, "page_refresh");
            str2 = "";
        }
        linkedHashMap.put("from_instance_id", str2);
        C20684815ws.LJIILLIIL("local_service_slash_track", linkedHashMap);
    }

    public static void LJFF(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, long j, Boolean bool, Boolean bool2) {
        String string;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key", "route_to_page");
        linkedHashMap.put("biz", "poi_detail");
        String str8 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("poi_id", str);
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, string);
        linkedHashMap.put("error_reason", str3);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("collect_info", str2);
        linkedHashMap.put("stay_time", String.valueOf(System.currentTimeMillis() - j));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap2.put("enter_from", str4);
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap2.put("enter_method", str5);
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap2.put("initial_poi_enter_from", str6);
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap2.put("initial_poi_enter_method", str7);
        linkedHashMap.put("biz_common_params", C2365509Or.LJ(linkedHashMap2));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool3)) {
            obj = CardStruct.IStatusCode.DEFAULT;
        } else if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
            obj = "";
        } else {
            obj = "1";
        }
        linkedHashMap3.put("is_first_enter_page", obj);
        if (Intrinsics.LJFF(bool2, bool3)) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        } else if (Intrinsics.LJFF(bool2, Boolean.FALSE)) {
            str8 = "1";
        }
        linkedHashMap3.put("is_first_enter_same_poi_page", str8);
        linkedHashMap.put("tech_common_params", C2365509Or.LJ(linkedHashMap3));
        C20684815ws.LJIILLIIL("local_service_slash_track", linkedHashMap);
    }

    public static void LIZ(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, Integer num, String str8, String str9, String str10, String str11, String str12, Boolean bool, Boolean bool2) {
        String str13;
        String str14;
        String str15;
        String string;
        Object obj;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str12;
        String str20 = str11;
        String str21 = str10;
        String str22 = str9;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key", "data_dispatch");
        String str23 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("biz", str);
        if (str2 == null) {
            str13 = "";
        } else {
            str13 = str2;
        }
        linkedHashMap.put("instance_id", str13);
        linkedHashMap.put("dispatch_stage", str3);
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("poi_id", str4);
        linkedHashMap.put("stay_time", String.valueOf(j));
        if (str16 == null) {
            str14 = "";
        } else {
            str14 = str16;
        }
        linkedHashMap.put("enter_from", str14);
        if (str17 == null) {
            str15 = "";
        } else {
            str15 = str17;
        }
        linkedHashMap.put("session_id", str15);
        if (str18 == null) {
            str18 = "page_refresh";
        }
        linkedHashMap.put("data_update_type", str18);
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("page_left", string);
        linkedHashMap.put("refresh_code", str8);
        if (str22 == null) {
            str22 = "";
        }
        linkedHashMap.put("collect_info", str22);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("event_resource", str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (str16 == null) {
            str16 = "";
        }
        linkedHashMap2.put("enter_from", str16);
        if (str21 == null) {
            str21 = "";
        }
        linkedHashMap2.put("enter_method", str21);
        if (str20 == null) {
            str20 = "";
        }
        linkedHashMap2.put("initial_poi_enter_from", str20);
        if (str19 == null) {
            str19 = "";
        }
        linkedHashMap2.put("initial_poi_enter_method", str19);
        linkedHashMap.put("biz_common_params", C2365509Or.LJ(linkedHashMap2));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (str17 == null) {
            str17 = "";
        }
        linkedHashMap3.put("session_id", str17);
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool3)) {
            obj = CardStruct.IStatusCode.DEFAULT;
        } else if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
            obj = "";
        } else {
            obj = "1";
        }
        linkedHashMap3.put("is_first_enter_page", obj);
        if (Intrinsics.LJFF(bool2, bool3)) {
            str23 = CardStruct.IStatusCode.DEFAULT;
        } else if (Intrinsics.LJFF(bool2, Boolean.FALSE)) {
            str23 = "1";
        }
        linkedHashMap3.put("is_first_enter_same_poi_page", str23);
        linkedHashMap.put("tech_common_params", C2365509Or.LJ(linkedHashMap3));
        C20684815ws.LJIILLIIL("local_service_slash_track", linkedHashMap);
    }

    public static void LIZIZ(String str, String str2, String str3, long j, String str4, String str5, long j2, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, C1187710h0r c1187710h0r, String str12, String str13, Boolean bool, Boolean bool2, Boolean bool3) {
        String str14;
        String str15;
        String string;
        Object obj;
        Object obj2;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20 = str6;
        String str21 = str11;
        String str22 = str10;
        String str23 = str13;
        String str24 = str9;
        String str25 = str8;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key", "lynx_view_create_done");
        String str26 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("biz", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("instance_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("poi_id", str3);
        linkedHashMap.put("stay_time", String.valueOf(j));
        if (str4 == null) {
            str14 = "";
        } else {
            str14 = str4;
        }
        linkedHashMap.put("enter_from", str14);
        if (str5 == null) {
            str15 = "";
        } else {
            str15 = str5;
        }
        linkedHashMap.put("session_id", str15);
        linkedHashMap.put("duration", String.valueOf(j2));
        if (str20 == null) {
            str20 = "page_refresh";
        }
        linkedHashMap.put("data_update_type", str20);
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("page_left", string);
        linkedHashMap.put("refresh_code", str7);
        if (str25 == null) {
            str25 = "";
        }
        linkedHashMap.put("collect_info", str25);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap2.put("enter_from", str4);
        if (str24 == null) {
            str24 = "";
        }
        linkedHashMap2.put("enter_method", str24);
        if (str22 == null) {
            str22 = "";
        }
        linkedHashMap2.put("initial_poi_enter_from", str22);
        if (str21 == null) {
            str21 = "";
        }
        linkedHashMap2.put("initial_poi_enter_method", str21);
        linkedHashMap.put("biz_common_params", C2365509Or.LJ(linkedHashMap2));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap3.put("session_id", str5);
        Boolean bool4 = Boolean.TRUE;
        String str27 = "1";
        if (Intrinsics.LJFF(bool, bool4)) {
            obj = CardStruct.IStatusCode.DEFAULT;
        } else if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
            obj = "";
        } else {
            obj = "1";
        }
        linkedHashMap3.put("is_first_enter_page", obj);
        if (Intrinsics.LJFF(bool2, bool4)) {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        } else if (!Intrinsics.LJFF(bool2, Boolean.FALSE)) {
            obj2 = "";
        } else {
            obj2 = "1";
        }
        linkedHashMap3.put("is_first_enter_same_poi_page", obj2);
        if (str23 == null) {
            str23 = "";
        }
        linkedHashMap3.put("url", str23);
        if (c1187710h0r == null || (str16 = c1187710h0r.LIZIZ) == null) {
            str16 = "";
        }
        linkedHashMap3.put("spark_version", str16);
        if (c1187710h0r == null || (str17 = c1187710h0r.LIZJ) == null) {
            str17 = "";
        }
        linkedHashMap3.put("lynx_version", str17);
        if (!Intrinsics.LJFF(bool3, bool4)) {
            str27 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap3.put("is_offline_gecko", str27);
        if (c1187710h0r == null || (str18 = c1187710h0r.LIZ) == null) {
            str18 = "";
        }
        linkedHashMap3.put("gecko_version_id", str18);
        if (c1187710h0r == null || (str19 = c1187710h0r.LIZLLL) == null) {
            str19 = "";
        }
        linkedHashMap3.put("gecko_channel", str19);
        if (str12 != null) {
            str26 = str12;
        }
        linkedHashMap3.put("gecko_bundle", str26);
        linkedHashMap.put("tech_common_params", C2365509Or.LJ(linkedHashMap3));
        C20684815ws.LJIILLIIL("local_service_slash_track", linkedHashMap);
    }

    public static void LIZJ(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, long j2, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, C1187710h0r c1187710h0r, String str15, String str16, Boolean bool, Boolean bool2, Boolean bool3) {
        String str17;
        String str18;
        String string;
        Object obj;
        Object obj2;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23 = str3;
        String str24 = str2;
        String str25 = str5;
        String str26 = str4;
        String str27 = str8;
        String str28 = str7;
        String str29 = str16;
        String str30 = str14;
        String str31 = str12;
        String str32 = str11;
        String str33 = str13;
        String str34 = str9;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key", "lynx_load_result");
        String str35 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("biz", str);
        if (str24 == null) {
            str24 = "";
        }
        linkedHashMap.put("instance_id", str24);
        if (str23 == null) {
            str23 = "";
        }
        linkedHashMap.put("poi_id", str23);
        linkedHashMap.put("stay_time", String.valueOf(j));
        if (str26 == null) {
            str17 = "";
        } else {
            str17 = str26;
        }
        linkedHashMap.put("enter_from", str17);
        if (str25 == null) {
            str18 = "";
        } else {
            str18 = str25;
        }
        linkedHashMap.put("session_id", str18);
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str6);
        if (str28 == null) {
            str28 = "";
        }
        linkedHashMap.put("error_reason", str28);
        if (str27 == null) {
            str27 = "";
        }
        linkedHashMap.put("resource_type", str27);
        linkedHashMap.put("duration", String.valueOf(j2));
        if (str34 == null) {
            str34 = "page_refresh";
        }
        linkedHashMap.put("data_update_type", str34);
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("page_left", string);
        linkedHashMap.put("refresh_code", str10);
        if (str32 == null) {
            str32 = "";
        }
        linkedHashMap.put("collect_info", str32);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (str26 == null) {
            str26 = "";
        }
        linkedHashMap2.put("enter_from", str26);
        if (str31 == null) {
            str31 = "";
        }
        linkedHashMap2.put("enter_method", str31);
        if (str33 == null) {
            str33 = "";
        }
        linkedHashMap2.put("initial_poi_enter_from", str33);
        if (str30 == null) {
            str30 = "";
        }
        linkedHashMap2.put("initial_poi_enter_method", str30);
        linkedHashMap.put("biz_common_params", C2365509Or.LJ(linkedHashMap2));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (str25 == null) {
            str25 = "";
        }
        linkedHashMap3.put("session_id", str25);
        Boolean bool4 = Boolean.TRUE;
        String str36 = "1";
        if (Intrinsics.LJFF(bool, bool4)) {
            obj = CardStruct.IStatusCode.DEFAULT;
        } else if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
            obj = "";
        } else {
            obj = "1";
        }
        linkedHashMap3.put("is_first_enter_page", obj);
        if (Intrinsics.LJFF(bool2, bool4)) {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        } else if (!Intrinsics.LJFF(bool2, Boolean.FALSE)) {
            obj2 = "";
        } else {
            obj2 = "1";
        }
        linkedHashMap3.put("is_first_enter_same_poi_page", obj2);
        if (str29 == null) {
            str29 = "";
        }
        linkedHashMap3.put("url", str29);
        if (c1187710h0r == null || (str19 = c1187710h0r.LIZIZ) == null) {
            str19 = "";
        }
        linkedHashMap3.put("spark_version", str19);
        if (c1187710h0r == null || (str20 = c1187710h0r.LIZJ) == null) {
            str20 = "";
        }
        linkedHashMap3.put("lynx_version", str20);
        if (!Intrinsics.LJFF(bool3, bool4)) {
            str36 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap3.put("is_offline_gecko", str36);
        if (c1187710h0r == null || (str21 = c1187710h0r.LIZ) == null) {
            str21 = "";
        }
        linkedHashMap3.put("gecko_version_id", str21);
        if (c1187710h0r == null || (str22 = c1187710h0r.LIZLLL) == null) {
            str22 = "";
        }
        linkedHashMap3.put("gecko_channel", str22);
        if (str15 != null) {
            str35 = str15;
        }
        linkedHashMap3.put("gecko_bundle", str35);
        linkedHashMap.put("tech_common_params", C2365509Or.LJ(linkedHashMap3));
        C20684815ws.LJIILLIIL("local_service_slash_track", linkedHashMap);
    }
}
