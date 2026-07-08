package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0JYR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JYR {
    public static final /* synthetic */ int LIZ = 0;

    public static C493830JYf LIZ(Map map) {
        int iIntValue;
        long jLongValue;
        long jLongValue2;
        int iIntValue2;
        int iIntValue3;
        Integer numLJJLIIJ;
        Integer numLJJLIIJ2;
        Long lLJJLIL;
        Long lLJJLIL2;
        Integer numLJJLIIJ3;
        String str = (String) map.get("type");
        if (str != null && (numLJJLIIJ3 = C500260Jjc.LJJLIIJ(str)) != null) {
            iIntValue = numLJJLIIJ3.intValue();
        } else {
            iIntValue = 1;
        }
        String str2 = (String) map.get("vipMonthLowerBound");
        if (str2 != null && (lLJJLIL2 = C500260Jjc.LJJLIL(str2)) != null) {
            jLongValue = lLJJLIL2.longValue();
        } else {
            jLongValue = 0;
        }
        String str3 = (String) map.get("vipPlanLowerBound");
        if (str3 != null && (lLJJLIL = C500260Jjc.LJJLIL(str3)) != null) {
            jLongValue2 = lLJJLIL.longValue();
        } else {
            jLongValue2 = 0;
        }
        String str4 = (String) map.get("position");
        if (str4 != null && (numLJJLIIJ2 = C500260Jjc.LJJLIIJ(str4)) != null) {
            iIntValue2 = numLJJLIIJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        String str5 = (String) map.get("total_count");
        if (str5 != null && (numLJJLIIJ = C500260Jjc.LJJLIIJ(str5)) != null) {
            iIntValue3 = numLJJLIIJ.intValue();
        } else {
            iIntValue3 = 0;
        }
        String strLJIJI = (String) map.get("title");
        if (strLJIJI == null) {
            strLJIJI = C497740JfY.LJIJI(2131857042);
        }
        return new C493830JYf(iIntValue, iIntValue2, iIntValue3, jLongValue, jLongValue2, strLJIJI);
    }

    public static Map LIZIZ(C493830JYf c493830JYf) {
        HashMap map = new HashMap();
        map.put("type", String.valueOf(c493830JYf.LIZIZ));
        map.put("title", c493830JYf.LIZ);
        map.put("position", String.valueOf(c493830JYf.LIZJ));
        map.put("total_count", String.valueOf(c493830JYf.LIZLLL));
        map.put("vipMonthLowerBound", String.valueOf(c493830JYf.LJ));
        map.put("vipPlanLowerBound", String.valueOf(c493830JYf.LJFF));
        return map;
    }
}
