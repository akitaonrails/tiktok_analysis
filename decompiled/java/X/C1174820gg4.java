package X;

import com.bytedance.android.btm.api.model.PageFinder;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0gg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174820gg4 {
    public static final C1174820gg4 LIZ = new C1174820gg4();

    public static void LIZIZ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2) {
        String strLIZ;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        if (str != null) {
            strLIZ = C1175600ghK.LIZ(str);
        } else {
            strLIZ = null;
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("btn_location", str2, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_nearby_mapview_click", linkedHashMap, c1185050gwZ);
    }

    public static void LIZJ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2) {
        String strLIZ;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        if (str != null) {
            strLIZ = C1175600ghK.LIZ(str);
        } else {
            strLIZ = null;
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("btn_location", str2, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_nearby_mapview_show", linkedHashMap, c1185050gwZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", "poi_detail");
        linkedHashMap.put("enter_method", "single_card");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("tab_code", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("order", str2);
        linkedHashMap.put("from_group_id", str3);
        linkedHashMap.put("target_poi_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("initial_poi_enter_from", str5);
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("initial_poi_enter_method", str6);
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap.put("initial_poi_from_group_id", str7);
        if (str9 == null) {
            str9 = "";
        }
        linkedHashMap.put("poi_distance", str9);
        C1189060h32.LJJ("ttls_poi_card_list_type", str10, linkedHashMap);
        C1189060h32.LIZLLL(str8, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("click_nearby_poi_card", linkedHashMap, c1185050gwZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", "poi_detail");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("tab_code", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("order", str2);
        linkedHashMap.put("from_poi_id", str3);
        linkedHashMap.put("from_group_id", str4);
        linkedHashMap.put("target_poi_id", str5);
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("initial_poi_enter_from", str6);
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap.put("initial_poi_enter_method", str7);
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("initial_poi_from_group_id", str8);
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("poi_distance", str10);
        C1189060h32.LJJ("ttls_poi_card_list_type", str11, linkedHashMap);
        C1189060h32.LIZLLL(str9, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_nearby_poi_card", linkedHashMap, c1185050gwZ);
    }
}
