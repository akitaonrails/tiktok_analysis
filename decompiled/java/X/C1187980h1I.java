package X;

import com.bytedance.android.btm.api.model.PageFinder;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0h1I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187980h1I {
    public static final C1187980h1I LIZ = new C1187980h1I();

    public static void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder, String str, int i) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("tag_code", str, linkedHashMap);
        C1189060h32.LJJ("tag_index", String.valueOf(i), linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_post_tag_click", linkedHashMap, c1185050gwZ);
    }

    public static void LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder, String str, int i) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("tag_code", str, linkedHashMap);
        C1189060h32.LJJ("tag_index", String.valueOf(i), linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_post_tag_show", linkedHashMap, c1185050gwZ);
    }

    public static void LIZJ(PageFinder pageFinder, String str, String str2, String str3) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
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
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_posts", linkedHashMap, c1185050gwZ);
    }
}
