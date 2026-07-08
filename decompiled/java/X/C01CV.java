package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.01CV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CV extends C08K8 {
    public static final C01CV LJFF = new C01CV();
    public static final String LJI = "PssDetailReporter";
    public static final String LJII = "memory_crash_pss_detail";
    public static final C01CW LJIIIIZZ = C01CW.ATTACH;

    @Override // X.C08K8
    public final Map<String, String> LIZ() {
        StringBuilder sb;
        Iterator it2;
        HashMap map = new HashMap();
        try {
            Map mapLIZ = C09NZ.LIZ(true);
            sb = new StringBuilder();
            it2 = mapLIZ.entrySet().iterator();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            Pair pair = (Pair) entry.getValue();
            String strLJJLIL = a0.LJJLIL(str, e3.d, "");
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(strLJJLIL);
            sb.append(":");
            sb.append(((Number) pair.getFirst()).intValue());
            for (Map.Entry entry2 : ((Map) pair.getSecond()).entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                int iIntValue2 = ((Number) entry2.getValue()).intValue();
                sb.append("\n");
                sb.append(strLJJLIL);
                sb.append(e3.d);
                String str2 = (String) ((LinkedHashMap) C1962007mM.LIZ).get(Integer.valueOf(iIntValue));
                if (str2 == null) {
                    str2 = "????";
                }
                sb.append(str2);
                sb.append(":");
                sb.append(iIntValue2);
            }
            return map;
        }
        if (sb.length() > 0) {
            map.put("MemReport_PSS", sb.toString());
            return map;
        }
        return map;
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
