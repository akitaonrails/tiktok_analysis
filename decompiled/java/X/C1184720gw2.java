package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0gw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184720gw2 {
    public static final C1184720gw2 LIZ = new C1184720gw2();

    public static void LIZ(String str, String str2, String str3, String str4, InterfaceC665370Q7z interfaceC665370Q7z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJIJI(linkedHashMap, "enter_from", "poi_detail");
        C1189060h32.LJIJI(linkedHashMap, "poi_id", str);
        C1189060h32.LIZ(str2, linkedHashMap);
        C1189060h32.LJIJI(linkedHashMap, "user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C1189060h32.LJIJI(linkedHashMap, "from_group_id", str3);
        C1189060h32.LJIJI(linkedHashMap, "label_name", str4);
        C20684815ws.LJIILLIIL("click_category_theme_label", linkedHashMap);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, C1184710gw1 c1184710gw1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, null);
        C1189060h32.LJIJI(linkedHashMap, "enter_from", "poi_detail");
        C1189060h32.LJIJI(linkedHashMap, "poi_id", str);
        C1189060h32.LIZ(str2, linkedHashMap);
        C1189060h32.LJIJI(linkedHashMap, "user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C1189060h32.LJIJI(linkedHashMap, "from_group_id", str3);
        C1189060h32.LJIJI(linkedHashMap, "label_name", str4);
        C1185040gwY.LIZ.getClass();
        C1185040gwY.LJI("show_category_theme_label", linkedHashMap, null, c1184710gw1);
    }
}
