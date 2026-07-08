package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0puk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529880puk {
    public static InterfaceC1059280dfi LIZ(String str) {
        if (str == null) {
            return null;
        }
        C1529830puf c1529830puf = C1537480q70.Companion;
        c1529830puf.getClass();
        String strLIZ = C1529830puf.LIZ(str);
        if (strLIZ != null) {
            Map<String, String> map = C1529860pui.LIZ;
            c1529830puf.getClass();
            if (map.containsKey(C1529830puf.LIZ(strLIZ))) {
                if (strLIZ == null) {
                    strLIZ = null;
                } else {
                    Map<String, String> map2 = C1529860pui.LIZ;
                    c1529830puf.getClass();
                    strLIZ = (String) ((LinkedHashMap) map2).get(C1529830puf.LIZ(strLIZ));
                }
            }
        }
        C1537480q70 c1537480q70LIZIZ = LIZIZ(strLIZ);
        if (c1537480q70LIZIZ == null) {
            return null;
        }
        return (InterfaceC1059280dfi) c1537480q70LIZIZ.LJFF(InterfaceC1059280dfi.class);
    }

    public static C1537480q70 LIZIZ(String str) {
        C1537480q70.Companion.getClass();
        return C1529830puf.LIZIZ(str);
    }
}
