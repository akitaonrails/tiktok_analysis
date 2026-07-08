package X;

import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zSt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897010zSt {
    public static int LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final ArrayList<InterfaceC1896760zSU> LIZ = C1697810uHb.LJ(new C1897130zT5(), new C1897150zT7(), new C1897120zT4(), new C1897100zT2(), new C1897140zT6(), new C1897090zT1(), new C1897110zT3());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(519));
    public static List<Bubble> LJFF = new ArrayList();
    public static final Map<Integer, Integer> LJI = new LinkedHashMap();

    public static void LIZ(String str, String str2, Bubble bubble) {
        String str3;
        if (bubble != null && (str3 = bubble.LIZIZ) != null && str3.length() != 0) {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            int i = bubble.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strValueOf = String.valueOf(bubble.bubbleType);
            if (strValueOf == null) {
                strValueOf = "";
            }
            linkedHashMap.put("sub_type", strValueOf);
            linkedHashMap.put("click_position", str);
            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
            linkedHashMap.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
            String str4 = bubble.taskKey;
            if (str4 == null) {
                str4 = "";
            }
            linkedHashMap.put("task_key", str4);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("land_page", str2);
            Integer num = bubble.LIZJ;
            c1894320zOY.getClass();
            C1894320zOY.LJIILJJIL(i, linkedHashMap, num, null, null);
        }
    }
}
