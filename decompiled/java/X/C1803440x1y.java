package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0x1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803440x1y {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, HashMap map) {
        if (map == null) {
            map = new HashMap();
        }
        map.put("big_optimize", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_all");
        C1807660x8m.LIZJ(0, C2188811AlT.LIZIZ(sbLIZ), map);
    }

    public static void LIZIZ(String str, Throwable th) {
        C1149180g0i.Companion.getClass();
        C1149180g0i c1149180g0iLIZ = C1149170g0h.LIZ(th);
        LIZJ(str, c1149180g0iLIZ.getErrorCode(), c1149180g0iLIZ.getDetailCode(), th.getMessage(), null);
    }

    public static void LIZJ(String str, Integer num, Integer num2, String str2, HashMap map) {
        int iIntValue;
        if (map == null) {
            map = new HashMap();
        }
        int iIntValue2 = -1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        map.put("error_code", Integer.valueOf(iIntValue));
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        map.put("detail_code", Integer.valueOf(iIntValue2));
        if (str2 == null) {
            str2 = "";
        }
        map.put("error_msg", str2);
        map.put("big_optimize", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_all");
        C1807660x8m.LIZJ(1, C2188811AlT.LIZIZ(sbLIZ), map);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_error");
        C1807660x8m.LIZJ(1, C2188811AlT.LIZIZ(sbLIZ2), map);
    }
}
