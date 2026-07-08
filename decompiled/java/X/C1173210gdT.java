package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0gdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173210gdT {
    public static final C1173210gdT LIZ = new C1173210gdT();

    public static void LIZ(Boolean bool, PageFinder pageFinder) {
        String str;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "personal_homepage");
        linkedHashMap.put("enter_method", "favorite_poi_personal");
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("has_content", str);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("enter_favourite_places", linkedHashMap, c1185050gwZ);
    }

    public static void LIZIZ(PageFinder pageFinder, String str, String str2, String str3) {
        if (str != null) {
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("poi_id", str);
            linkedHashMap.put("enter_from", str2);
            linkedHashMap.put("enter_method", str3);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
            c1185040gwY.getClass();
            C1185040gwY.LJFF("show_favourite_poi_toast", linkedHashMap, c1185050gwZ);
        }
    }

    public static void LIZJ(String str, String str2, String str3, String str4, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("poi_id", str);
        linkedHashMap.put("enter_from", "poi_detail");
        C1189060h32.LIZ(str2, linkedHashMap);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("from_group_id", str3);
        linkedHashMap.put("enter_method", str4);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_ymal", linkedHashMap, c1185050gwZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", "poi_detail");
        linkedHashMap.put("from_poi_id", str);
        C1189060h32.LIZ(str2, linkedHashMap);
        LIZ.getClass();
        linkedHashMap.put("from_group_id", str3);
        linkedHashMap.put("target_poi_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("order", str5);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ymal_item_click", linkedHashMap, c1185050gwZ);
    }

    public static void LJ(String str, String str2, String str3, String str4, String str5, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", "poi_detail");
        linkedHashMap.put("from_poi_id", str);
        linkedHashMap.put("enter_from", "poi_detail");
        C1189060h32.LIZ(str2, linkedHashMap);
        LIZ.getClass();
        linkedHashMap.put("from_group_id", str3);
        linkedHashMap.put("target_poi_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("order", str5);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ymal_item_show", linkedHashMap, c1185050gwZ);
    }
}
