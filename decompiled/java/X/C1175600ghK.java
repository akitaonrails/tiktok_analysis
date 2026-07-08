package X;

import com.bytedance.android.btm.api.model.PageFinder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ghK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175600ghK {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (str.length() == 0 || Intrinsics.LJFF(str, "popular")) {
            return null;
        }
        return str;
    }

    public static String LJIIJ(Integer num) {
        int value = EnumC1175610ghL.USER_CITY_STATUS_LOCAL.getValue();
        if (num != null && num.intValue() == value) {
            return "local";
        }
        int value2 = EnumC1175610ghL.USER_CITY_STATUS_BEFORE_TRAVEL.getValue();
        if (num != null && num.intValue() == value2) {
            return "remote_before";
        }
        int value3 = EnumC1175610ghL.USER_CITY_STATUS_IN_TRAVEL.getValue();
        if (num != null && num.intValue() == value3) {
            return "remote_in";
        }
        return "others";
    }

    public static void LJFF(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("map_mode_type", LJIIJ(num), linkedHashMap);
        C1189060h32.LJJ("ttls_filter_type", str, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_map_filter_apply_click", linkedHashMap, c1185050gwZ);
    }

    public static void LJI(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("map_mode_type", LJIIJ(num), linkedHashMap);
        C1189060h32.LJJ("ttls_filter_type", str, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_map_filter_click", linkedHashMap, c1185050gwZ);
    }

    public static void LJIIIIZZ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str) {
        String strLIZ;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        if (str != null) {
            strLIZ = LIZ(str);
        } else {
            strLIZ = null;
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("map_mode_type", LJIIJ(num), linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("click_subtab", linkedHashMap, c1185050gwZ);
    }

    public static void LIZJ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str, String str2) {
        String strLIZ;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        if (str != null) {
            strLIZ = LIZ(str);
        } else {
            strLIZ = null;
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("map_mode_type", LJIIJ(num), linkedHashMap);
        C1189060h32.LJJ("ttls_filter_type_list", str2, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("click_list_anchor", linkedHashMap, c1185050gwZ);
    }

    public static void LJII(String str, Integer num, String str2, EnumC1174810gg3 enumC1174810gg3, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String strLIZ;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        String type = null;
        if (str != null) {
            strLIZ = LIZ(str);
        } else {
            strLIZ = null;
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("map_mode_type", LJIIJ(num), linkedHashMap);
        C1189060h32.LJJ("ttls_filter_type_list", str2, linkedHashMap);
        if (enumC1174810gg3 != null) {
            type = enumC1174810gg3.getType();
        }
        C1189060h32.LJJ("action_type", type, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("discovery_map_action", linkedHashMap, c1185050gwZ);
    }

    public static void LIZLLL(String str, Integer num, String str2, String str3, String str4, String str5, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String strLIZ;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        if (str != null) {
            strLIZ = LIZ(str);
        } else {
            strLIZ = null;
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("map_mode_type", LJIIJ(num), linkedHashMap);
        C1189060h32.LJJ("ttls_filter_type_list", str2, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("target_collect_info", str4, linkedHashMap);
        C1189060h32.LJJ("target_local_service_key_category", str5, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("copy_address", linkedHashMap, c1185050gwZ);
    }

    public static void LJIIIZ(String str, Integer num, String str2, String str3, String str4, String str5, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String strLIZ;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        if (str != null) {
            strLIZ = LIZ(str);
        } else {
            strLIZ = null;
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("map_mode_type", LJIIJ(num), linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("target_local_service_key_category", str4, linkedHashMap);
        C1189060h32.LJJ("ttls_filter_type_list", str5, linkedHashMap);
        C1189060h32.LIZLLL(str3, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("show_map_mode_marker", linkedHashMap, c1185050gwZ);
    }

    public static void LIZIZ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        String strLIZ;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        if (str6 != null) {
            C1189060h32.LIZLLL(str6, linkedHashMap);
        }
        C1189060h32.LJJ("enter_method", "map_mode_card", linkedHashMap);
        if (str != null) {
            strLIZ = LIZ(str);
        } else {
            strLIZ = null;
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("map_mode_type", LJIIJ(num), linkedHashMap);
        C1189060h32.LJJ("ttls_filter_type_list", str2, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("target_collect_info", str4, linkedHashMap);
        C1189060h32.LJJ("target_local_service_key_category", str5, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("cancel_favourite_poi", linkedHashMap, c1185050gwZ);
    }

    public static void LJ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        String strLIZ;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        if (str6 != null) {
            C1189060h32.LIZLLL(str6, linkedHashMap);
        }
        C1189060h32.LJJ("enter_method", "map_mode_card", linkedHashMap);
        if (str != null) {
            strLIZ = LIZ(str);
        } else {
            strLIZ = null;
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("map_mode_type", LJIIJ(num), linkedHashMap);
        C1189060h32.LJJ("ttls_filter_type_list", str2, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("target_collect_info", str4, linkedHashMap);
        C1189060h32.LJJ("target_local_service_key_category", str5, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("favourite_poi", linkedHashMap, c1185050gwZ);
    }
}
