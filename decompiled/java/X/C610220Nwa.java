package X;

import com.bytedance.android.btm.api.model.PageFinder;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Nwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610220Nwa {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(PageFinder pageFinder, String str, Map map) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("policy_name", str);
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("click_terms_and_policy_name", linkedHashMap, c1185050gwZ);
    }

    public static void LIZIZ(PageFinder pageFinder, String str, Map map) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("policy_name", str);
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("show_terms_and_policy_name", linkedHashMap, c1185050gwZ);
    }

    public static void LIZJ(PageFinder pageFinder, String str, Map map) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("show_tokopedia_toast", linkedHashMap, c1185050gwZ);
    }
}
