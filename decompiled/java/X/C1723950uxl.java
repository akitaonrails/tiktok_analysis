package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0uxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723950uxl {
    public static String LJ(InterfaceC1107590evd interfaceC1107590evd, String str) {
        if (interfaceC1107590evd == null || !interfaceC1107590evd.hasKey(str)) {
            return null;
        }
        InterfaceC1871820yoG interfaceC1871820yoG = interfaceC1107590evd.get(str);
        if (interfaceC1871820yoG.getType() != EnumC1323480kXq.String) {
            return null;
        }
        try {
            return interfaceC1871820yoG.asString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static void LIZJ(String str, Object obj, InterfaceC1063920dnC interfaceC1063920dnC) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" :callback successfully, response is ");
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        HashMap map = new HashMap();
        map.put("code", 1);
        map.put("data", obj);
        interfaceC1063920dnC.LIZ(map);
    }

    public static void LIZLLL(String str, String str2, InterfaceC1063920dnC interfaceC1063920dnC) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" :callback fail, errorMsg is ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        HashMap map = new HashMap();
        map.put("code", 0);
        map.put("error_msg", str2);
        interfaceC1063920dnC.LIZ(map);
    }

    public static void LIZ(int i, int i2, String str, Map map, InterfaceC1063920dnC interfaceC1063920dnC) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pipo.getInfoByOcr");
        sbLIZ.append(" :callback with code:");
        sbLIZ.append(i);
        sbLIZ.append(" detailCode:");
        sbLIZ.append(i2);
        sbLIZ.append(" msg:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        HashMap map2 = new HashMap();
        map2.put("code", Integer.valueOf(i));
        map2.put("detail_code", Integer.valueOf(i2));
        map2.put("message", str);
        map2.put("data", map);
        interfaceC1063920dnC.LIZ(map2);
    }

    public static void LIZIZ(String str, int i, int i2, String str2, InterfaceC1063920dnC interfaceC1063920dnC) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" :callback with code:");
        sbLIZ.append(i);
        sbLIZ.append(" detailCode:");
        sbLIZ.append(i2);
        sbLIZ.append(" msg:");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        HashMap map = new HashMap();
        map.put("code", Integer.valueOf(i));
        map.put("detail_code", Integer.valueOf(i2));
        map.put("message", str2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("code:");
        sbLIZ2.append(i);
        sbLIZ2.append(" detailCode:");
        sbLIZ2.append(i2);
        sbLIZ2.append(" msg:");
        sbLIZ2.append(str2);
        map.put("msg", C2188811AlT.LIZIZ(sbLIZ2));
        interfaceC1063920dnC.LIZ(map);
    }
}
