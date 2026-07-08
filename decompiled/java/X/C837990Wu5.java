package X;

import com.bytedance.bpea.basics.Cert;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Wu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837990Wu5 {
    public static InterfaceC837780Wtk LIZ;
    public static InterfaceC837710Wtd LIZIZ;

    public static boolean LIZ(C825940Wae c825940Wae) {
        if (LIZIZ == null) {
            LIZIZ(-4005, c825940Wae, "sandbox not config");
        }
        InterfaceC837780Wtk interfaceC837780Wtk = LIZ;
        if (interfaceC837780Wtk != null && interfaceC837780Wtk.LIZ(c825940Wae) && LIZIZ != null) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(int i, C825940Wae c825940Wae, String str) {
        Integer numLIZ;
        C838310Wub c838310WubLIZ = C838320Wuc.LIZ(c825940Wae, "SandboxCheck");
        c838310WubLIZ.LIZJ = i;
        c838310WubLIZ.LIZLLL = str;
        c838310WubLIZ.LJFF = EnumC838050WuB.WARN;
        c838310WubLIZ.LJI = new Throwable();
        Cert cert = c825940Wae.LIZ;
        Object obj = null;
        if (cert != null) {
            numLIZ = C825920Wac.LIZ(cert);
        } else {
            numLIZ = null;
        }
        Object objLIZIZ = c825940Wae.LIZIZ("classIdentifier");
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        Object objLIZIZ2 = c825940Wae.LIZIZ("methodSignature");
        if (objLIZIZ2 instanceof String) {
            obj = objLIZIZ2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("dataflowID", numLIZ);
        linkedHashMap.put("classIdentifier", objLIZIZ);
        linkedHashMap.put("methodSignature", obj);
        Map<String, Object> map = c838310WubLIZ.LJII;
        if (map != null) {
            map.putAll(linkedHashMap);
        } else {
            c838310WubLIZ.LJII = linkedHashMap;
        }
        C838280WuY.LIZ(c838310WubLIZ);
    }
}
