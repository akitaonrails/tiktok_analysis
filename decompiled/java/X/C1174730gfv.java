package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174730gfv {
    public static final C1174730gfv LIZ = new C1174730gfv();

    public static void LJIIJ(C1174730gfv c1174730gfv, String str, MapModeType mapModeType, InterfaceC665370Q7z interfaceC665370Q7z, String str2, Boolean bool, PageFinder pageFinder, int i) {
        String type;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            mapModeType = null;
        }
        if ((i & 8) != 0) {
            interfaceC665370Q7z = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            pageFinder = null;
        }
        c1174730gfv.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", str2, linkedHashMap);
        C1189060h32.LJJ("enter_method", str, linkedHashMap);
        if (mapModeType != null) {
            type = mapModeType.getType();
        } else {
            type = null;
        }
        C1189060h32.LJJ("map_mode_type", type, linkedHashMap);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C1189060h32.LJJ("is_static_map", "1", linkedHashMap);
        }
        C1189060h32.LIZLLL(null, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_show_map_mode_page", linkedHashMap, c1185050gwZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", "map_mode", linkedHashMap);
        C1189060h32.LJJ("enter_method", "map_mode_card", linkedHashMap);
        C1189060h32.LJJ("poi_id", str, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("from_poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str4, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str5, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str6, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str7, linkedHashMap);
        C1189060h32.LIZ(str8, linkedHashMap);
        C1189060h32.LIZLLL(str9, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("cancel_favourite_poi", linkedHashMap, c1185050gwZ);
    }

    public static void LJFF(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", "map_mode", linkedHashMap);
        C1189060h32.LJJ("enter_method", "map_mode_card", linkedHashMap);
        C1189060h32.LJJ("poi_id", str, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("from_poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str4, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str5, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str6, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str7, linkedHashMap);
        C1189060h32.LIZ(str8, linkedHashMap);
        C1189060h32.LIZLLL(str9, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("favourite_poi", linkedHashMap, c1185050gwZ);
    }

    public static void LJI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", "map_mode", linkedHashMap);
        C1189060h32.LJJ("enter_method", str, linkedHashMap);
        C1189060h32.LJJ("poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("from_poi_id", str4, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str5, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str6, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str7, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str8, linkedHashMap);
        C1189060h32.LIZ(str9, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("close_map_mode", linkedHashMap, c1185050gwZ);
    }

    public static void LJII(String str, EnumC1174810gg3 enumC1174810gg3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String type;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", str, linkedHashMap);
        if (enumC1174810gg3 != null) {
            type = enumC1174810gg3.getType();
        } else {
            type = null;
        }
        C1189060h32.LJJ("action_type", type, linkedHashMap);
        C1189060h32.LJJ("poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str3, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str4, linkedHashMap);
        C1189060h32.LJJ("initial_poi_id", str5, linkedHashMap);
        C1189060h32.LJJ("initial_poi_from_group_id", str6, linkedHashMap);
        C1189060h32.LIZLLL(str7, linkedHashMap);
        C1189060h32.LIZ(str8, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("discovery_map_action", linkedHashMap, c1185050gwZ);
    }

    public static void LJIIJJI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", "map_mode", linkedHashMap);
        C1189060h32.LJJ("from_poi_id", str, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("action_type", str5, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str6, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str7, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str8, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str9, linkedHashMap);
        C1189060h32.LIZ(str4, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("search_this_area", linkedHashMap, c1185050gwZ);
    }

    public static void LJIIL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", "map_mode", linkedHashMap);
        C1189060h32.LJJ("from_poi_id", str, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str5, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str6, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str7, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str8, linkedHashMap);
        C1189060h32.LJJ("result", str9, linkedHashMap);
        C1189060h32.LIZ(str4, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("search_this_area_result", linkedHashMap, c1185050gwZ);
    }

    public static void LJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, MapModeType mapModeType, String str10, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String type;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", "map_mode", linkedHashMap);
        C1189060h32.LJJ("tab_code", str, linkedHashMap);
        C1189060h32.LJJ("from_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str4, linkedHashMap);
        C1189060h32.LJJ("from_group_id", str5, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str6, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str7, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str8, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str9, linkedHashMap);
        if (mapModeType != null) {
            type = mapModeType.getType();
        } else {
            type = null;
        }
        C1189060h32.LJJ("map_mode_type", type, linkedHashMap);
        C1189060h32.LIZ(str10, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("click_select_area", linkedHashMap, c1185050gwZ);
    }

    public static void LJIIIZ(C1174730gfv c1174730gfv, String str, String str2, String str3, String str4, String str5, String str6, MapModeType mapModeType, String str7, Boolean bool, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder, int i) {
        String str8;
        String type;
        if ((i & 1) != 0) {
            str8 = null;
        } else {
            str8 = "poi_detail";
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        if ((i & 128) != 0) {
            mapModeType = null;
        }
        if ((i & 256) != 0) {
            str7 = null;
        }
        if ((i & 512) != 0) {
            bool = null;
        }
        if ((i & 1024) != 0) {
            interfaceC665370Q7z = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            pageFinder = null;
        }
        c1174730gfv.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", str8, linkedHashMap);
        C1189060h32.LJJ("enter_method", str, linkedHashMap);
        C1189060h32.LJJ("poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str3, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str4, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str5, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str6, linkedHashMap);
        if (mapModeType == null || (type = mapModeType.getType()) == null) {
            type = MapModeType.OTHERS.getType();
        }
        C1189060h32.LJJ("map_mode_type", type, linkedHashMap);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C1189060h32.LJJ("is_static_map", "1", linkedHashMap);
        }
        C1189060h32.LIZ(str7, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("enter_map_mode_page", linkedHashMap, c1185050gwZ);
    }

    public static void LJIILJJIL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", str, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("poi_id", str4, linkedHashMap);
        C1189060h32.LJJ("from_poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("from_group_id", str5, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str6, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str7, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str8, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str9, linkedHashMap);
        C1189060h32.LJJ("tab_code", str10, linkedHashMap);
        C1189060h32.LIZ(str11, linkedHashMap);
        C1189060h32.LIZLLL(str12, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_map_mode_marker", linkedHashMap, c1185050gwZ);
    }

    public static void LIZIZ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, MapModeType mapModeType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        String type;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", "map_mode", linkedHashMap);
        C1189060h32.LJJ("enter_method", str, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("from_poi_id", str6, linkedHashMap);
        C1189060h32.LJJ("tab_code", str4, linkedHashMap);
        C1189060h32.LJJ("order", str5, linkedHashMap);
        C1189060h32.LJJ("from_group_id", str7, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str10, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str11, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str12, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str13, linkedHashMap);
        if (mapModeType != null) {
            type = mapModeType.getType();
        } else {
            type = null;
        }
        C1189060h32.LJJ("map_mode_type", type, linkedHashMap);
        C1189060h32.LIZ(str8, linkedHashMap);
        C1189060h32.LIZLLL(str9, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("click_poi_card", linkedHashMap, c1185050gwZ);
    }

    public static void LJIILL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, MapModeType mapModeType, String str13, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String type;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", "map_mode", linkedHashMap);
        C1189060h32.LJJ("enter_method", "map_mode_card", linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str, linkedHashMap);
        C1189060h32.LJJ("poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("from_poi_id", str5, linkedHashMap);
        C1189060h32.LJJ("tab_code", str3, linkedHashMap);
        C1189060h32.LJJ("order", str4, linkedHashMap);
        C1189060h32.LJJ("from_group_id", str6, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str9, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str10, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str11, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str12, linkedHashMap);
        if (mapModeType != null) {
            type = mapModeType.getType();
        } else {
            type = null;
        }
        C1189060h32.LJJ("map_mode_type", type, linkedHashMap);
        C1189060h32.LJJ("has_route", str13, linkedHashMap);
        C1189060h32.LIZ(str7, linkedHashMap);
        C1189060h32.LIZLLL(str8, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_poi_card", linkedHashMap, c1185050gwZ);
    }

    public static void LIZJ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, MapModeType mapModeType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        String type;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", str, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("from_poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("poi_id", str6, linkedHashMap);
        C1189060h32.LJJ("from_group_id", str4, linkedHashMap);
        C1189060h32.LJJ("tab_code", str5, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str9, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str10, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str11, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str12, linkedHashMap);
        C1189060h32.LJJ("initial_poi_from_group_id", str13, linkedHashMap);
        if (mapModeType != null) {
            type = mapModeType.getType();
        } else {
            type = null;
        }
        C1189060h32.LJJ("map_mode_type", type, linkedHashMap);
        C1189060h32.LJJ("aggregation_number", str14, linkedHashMap);
        C1189060h32.LIZ(str7, linkedHashMap);
        C1189060h32.LIZLLL(str8, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("click_poi_map_mode_marker", linkedHashMap, c1185050gwZ);
    }

    public static void LJIILIIL(C1174730gfv c1174730gfv, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder, int i) {
        Object obj;
        String str12 = str9;
        String str13 = str8;
        InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
        String str14 = str11;
        String str15 = str10;
        PageFinder pageFinder2 = null;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str13 = null;
        }
        if ((i & 256) != 0) {
            str12 = null;
        }
        if ((i & 512) != 0) {
            str15 = null;
        }
        if ((i & 1024) != 0) {
            str14 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bool2 = null;
        }
        if ((i & 8192) != 0) {
            interfaceC665370Q7z2 = null;
        }
        if ((i & 16384) == 0) {
            pageFinder2 = pageFinder;
        }
        c1174730gfv.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z2);
        C1189060h32.LJJ("enter_from", str, linkedHashMap);
        C1189060h32.LJJ("enter_method", str2, linkedHashMap);
        C1189060h32.LJJ("poi_id", str3, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str4, linkedHashMap);
        C1189060h32.LJJ("from_poi_id", str5, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str6, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str7, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str13, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str12, linkedHashMap);
        String str16 = "1";
        if (bool != null) {
            if (bool.booleanValue()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_login", obj);
        }
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str16 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_favourite", str16);
        }
        C1189060h32.LIZ(str15, linkedHashMap);
        C1189060h32.LIZLLL(str14, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder2);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_favourite_poi_button", linkedHashMap, c1185050gwZ);
    }
}
