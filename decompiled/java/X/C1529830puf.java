package X;

import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0puf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529830puf {
    public static String LIZ(String str) {
        int iLJJIZ = a0.LJJIZ(str, '#', 0, false, 6);
        if (iLJJIZ != -1) {
            return str.substring(0, iLJJIZ);
        }
        return str;
    }

    public static C1537480q70 LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        return C1537480q70.hybridContextMap.get(LIZ(str));
    }

    public static void LIZLLL(String str) {
        C1514810pWR c1514810pWRLJIIIZ;
        Map<String, C1537480q70> map = C1537480q70.hybridContextMap;
        C1537480q70 c1537480q70 = map.get(LIZ(str));
        if (c1537480q70 != null && (c1514810pWRLJIIIZ = c1537480q70.LJIIIZ()) != null) {
            c1514810pWRLJIIIZ.LIZ();
        }
        map.remove(LIZ(str));
    }

    public static void LIZJ(C1537480q70 c1537480q70, String str) {
        C1514810pWR c1514810pWRLJIIIZ;
        Map<String, C1537480q70> map = C1537480q70.hybridContextMap;
        map.put(LIZ(str), c1537480q70);
        C1537480q70 c1537480q702 = map.get(LIZ(str));
        if (c1537480q702 != null && (c1514810pWRLJIIIZ = c1537480q702.LJIIIZ()) != null) {
            C1514690pWF.LIZJ(EnumC1514740pWK.Start, c1514810pWRLJIIIZ.LIZ, new JSONObject());
        }
    }
}
