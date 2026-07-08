package X;

import com.bytedance.android.btm.api.model.PageFinder;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0gc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172390gc9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(HashMap map, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.putAll(map);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("show_pick_entrance", linkedHashMap, c1185050gwZ);
    }

    public static void LIZ(String str, String str2, HashMap map, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_method", str, linkedHashMap);
        C1189060h32.LJJ("tab_name", str2, linkedHashMap);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("click_pick_entrance", linkedHashMap, c1185050gwZ);
    }
}
