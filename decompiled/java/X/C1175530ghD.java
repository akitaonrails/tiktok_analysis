package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0ghD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175530ghD {
    public static final C1175530ghD LIZ = new C1175530ghD();

    public static void LIZ(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, InterfaceC665370Q7z interfaceC665370Q7z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", "poi_detail");
        linkedHashMap.put("tab_code", str);
        linkedHashMap.put("enable_location", str2);
        linkedHashMap.put("system_is_precise", str3);
        linkedHashMap.put("inapp_is_precise", str4);
        linkedHashMap.put("index", String.valueOf(0));
        linkedHashMap.put("total_tab_cnt", String.valueOf(i));
        linkedHashMap.put("poi_id", str5);
        linkedHashMap.put("poi_city", str6);
        linkedHashMap.put("poi_detail_type", str7);
        linkedHashMap.put("poi_region_code", str8);
        linkedHashMap.put("is_claimed", str9);
        C1189060h32.LIZ(str10, linkedHashMap);
        C20684815ws.LJIILLIIL("discovery_module_show", linkedHashMap);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", str, linkedHashMap);
        C1189060h32.LJJ("poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("from_group_id", str4, linkedHashMap);
        C1189060h32.LJJ("tab_code", str5, linkedHashMap);
        C1189060h32.LJJ("is_fake_map", CardStruct.IStatusCode.DEFAULT, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str6, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str7, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str8, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str9, linkedHashMap);
        C1189060h32.LJJ("initial_poi_from_group_id", str10, linkedHashMap);
        C1189060h32.LIZ(str3, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("click_subtab", linkedHashMap, c1185050gwZ);
    }

    public static void LIZJ(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJIJI(linkedHashMap, "enter_from", "poi_detail");
        C1189060h32.LJIJI(linkedHashMap, "poi_id", str);
        C1189060h32.LJIJI(linkedHashMap, "from_group_id", str2);
        C1189060h32.LJIJI(linkedHashMap, "is_fake_map", C1189060h32.LJJIIZI(bool));
        C1189060h32.LJIJI(linkedHashMap, "tab_code", str3);
        C1189060h32.LJIJI(linkedHashMap, "poi_detail_enter_from", str4);
        C1189060h32.LJIJI(linkedHashMap, "poi_detail_enter_method", str5);
        C1189060h32.LJIJI(linkedHashMap, "initial_poi_enter_from", str6);
        C1189060h32.LJIJI(linkedHashMap, "initial_poi_enter_method", str7);
        C1189060h32.LJIJI(linkedHashMap, "initial_poi_from_group_id", str8);
        if (!C123100dR.LIZ(str9) || str9 == null) {
            str9 = MapModeType.OTHERS.getType();
        }
        C1189060h32.LJIJI(linkedHashMap, "map_mode_type", str9);
        C1189060h32.LIZ(str10, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("show_map_mode", linkedHashMap, c1185050gwZ);
    }

    public static void LIZIZ(C1175530ghD c1175530ghD, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, PageFinder pageFinder, MapModeType mapModeType, String str11, InterfaceC665370Q7z interfaceC665370Q7z, int i) {
        String str12;
        String str13;
        String type;
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str11;
        String str23 = str10;
        InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
        String str24 = str9;
        if ((i & 1) != 0) {
            str12 = null;
        } else {
            str12 = "poi_detail";
        }
        if ((i & 2) != 0) {
            str14 = null;
        }
        if ((i & 4) != 0) {
            str15 = null;
        }
        if ((i & 16) != 0) {
            str16 = null;
        }
        if ((i & 32) != 0) {
            str17 = null;
        }
        if ((i & 64) != 0) {
            str18 = null;
        }
        if ((i & 128) != 0) {
            str19 = null;
        }
        if ((i & 256) != 0) {
            str20 = null;
        }
        if ((i & 512) != 0) {
            str21 = null;
        }
        if ((i & 1024) != 0) {
            str24 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str23 = null;
        }
        if ((i & 8192) != 0) {
            mapModeType = null;
        }
        if ((i & 16384) != 0) {
            str22 = null;
        }
        if ((i & 32768) != 0) {
            interfaceC665370Q7z2 = null;
        }
        c1175530ghD.getClass();
        if (((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJII(0, C1BWL.LIZ())) {
            str13 = "1";
        } else {
            str13 = CardStruct.IStatusCode.DEFAULT;
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z2);
        C1189060h32.LJJ("enter_from", str12, linkedHashMap);
        C1189060h32.LJJ("enter_method", str14, linkedHashMap);
        C1189060h32.LJJ("poi_id", str15, linkedHashMap);
        C1189060h32.LJJ("follow_page", null, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str18, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str19, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str20, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str21, linkedHashMap);
        C1189060h32.LJJ("tab_code", str24, linkedHashMap);
        C1189060h32.LJJ("is_fake_map", CardStruct.IStatusCode.DEFAULT, linkedHashMap);
        C1189060h32.LJJ("enable_location", str13, linkedHashMap);
        C1189060h32.LJJ("initial_poi_from_group_id", str23, linkedHashMap);
        if (mapModeType == null || (type = mapModeType.getType()) == null) {
            type = MapModeType.OTHERS.getType();
        }
        C1189060h32.LJJ("map_mode_type", type, linkedHashMap);
        C1189060h32.LJJ("map_mode_type", str22, linkedHashMap);
        C1189060h32.LIZ(str16, linkedHashMap);
        C1189060h32.LIZLLL(str17, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("poi_map_operation", linkedHashMap, c1185050gwZ);
    }
}
