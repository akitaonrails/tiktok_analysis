package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.01CK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CK extends C08K8 {
    public static final C01CK LJFF = new C01CK();
    public static final String LJI = "LynxViewDetailReporter";
    public static final String LJII = "memory_crash_lynx_detail";
    public static final C01CW LJIIIIZZ = C01CW.PRE_CRASH;

    @Override // X.C08K8
    public final Map<String, String> LIZ() {
        Map mapLJIIL;
        HashMap map;
        HashMap map2;
        Iterator it2;
        int i;
        String strLJIJI;
        String strLJIJI2;
        HashMap map3 = new HashMap();
        try {
            C1529870puj.LIZ.getClass();
            Map mapLIZLLL = C1529870puj.LIZLLL();
            mapLJIIL = C2097608Jq.LJIIL(C1529870puj.LIZJ, C1529870puj.LJ);
            map = new HashMap();
            map2 = new HashMap();
            it2 = ((LinkedHashMap) mapLIZLLL).entrySet().iterator();
            i = 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        while (true) {
            String strLIZ = null;
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
            if (interfaceC1541990qEH != null) {
                i++;
                C1537480q70 hybridContext = interfaceC1541990qEH.getHybridContext();
                if (hybridContext != null && (strLJIJI2 = hybridContext.LJIJI()) != null) {
                    strLIZ = C01CJ.LIZ(C01CJ.LIZIZ(strLJIJI2));
                }
                if (!(strLIZ == null || strLIZ.length() == 0)) {
                    Integer num = (Integer) map.get(strLIZ);
                    map.put(strLIZ, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            return map3;
        }
        Iterator it3 = ((LinkedHashMap) mapLJIIL).entrySet().iterator();
        int i2 = 0;
        while (it3.hasNext()) {
            InterfaceC1541990qEH interfaceC1541990qEH2 = (InterfaceC1541990qEH) ((WeakReference) ((Map.Entry) it3.next()).getValue()).get();
            if (interfaceC1541990qEH2 != null) {
                i2++;
                C1537480q70 hybridContext2 = interfaceC1541990qEH2.getHybridContext();
                String strLIZ2 = (hybridContext2 == null || (strLJIJI = hybridContext2.LJIJI()) == null) ? null : C01CJ.LIZ(C01CJ.LIZIZ(strLJIJI));
                if (!(strLIZ2 == null || strLIZ2.length() == 0)) {
                    Integer num2 = (Integer) map2.get(strLIZ2);
                    map2.put(strLIZ2, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                }
            }
        }
        if (i + i2 >= 20) {
            StringBuilder sb = new StringBuilder();
            sb.append("lynx_total:");
            sb.append(i);
            sb.append("\n");
            sb.append("web_total:");
            sb.append(i2);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                sb.append("\n");
                sb.append("lynx.");
                sb.append(str);
                sb.append(":");
                sb.append(iIntValue);
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                String str2 = (String) entry2.getKey();
                int iIntValue2 = ((Number) entry2.getValue()).intValue();
                sb.append("\n");
                sb.append("web.");
                sb.append(str2);
                sb.append(":");
                sb.append(iIntValue2);
            }
            map3.put("MemReport_lynx", sb.toString());
            return map3;
        }
        return map3;
    }

    @Override // X.C08K8
    public final String LIZIZ() {
        return LJI;
    }

    @Override // X.C08K8
    public final String LIZJ() {
        return LJII;
    }

    @Override // X.C08K8
    public final C01CW LIZLLL() {
        return LJIIIIZZ;
    }
}
