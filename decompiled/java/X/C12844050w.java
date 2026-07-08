package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.050w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12844050w {
    public static Map LIZ(n nVar) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, k> entry : nVar.entrySet()) {
                linkedHashMap.put(entry.getKey(), LIZIZ(entry.getValue()));
            }
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return C2097608Jq.LJ();
        }
    }

    public static Object LIZIZ(k kVar) {
        kVar.getClass();
        if (kVar instanceof n) {
            return LIZ(kVar.LJIILIIL());
        }
        if (kVar instanceof h) {
            h hVarLJIIL = kVar.LJIIL();
            ArrayList arrayList = new ArrayList();
            Iterator<k> it2 = hVarLJIIL.iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZIZ(it2.next()));
            }
            return arrayList;
        }
        if (kVar instanceof q) {
            q qVarLJIILJJIL = kVar.LJIILJJIL();
            Object obj = qVarLJIILJJIL.LL;
            if (obj instanceof String) {
                return qVarLJIILJJIL.LJIL();
            }
            if (obj instanceof Number) {
                Number numberLJIJ = qVarLJIILJJIL.LJIJ();
                double dDoubleValue = numberLJIJ.doubleValue();
                long jLongValue = numberLJIJ.longValue();
                int iIntValue = numberLJIJ.intValue();
                float fFloatValue = numberLJIJ.floatValue();
                if (dDoubleValue == iIntValue) {
                    return Integer.valueOf(iIntValue);
                }
                if (dDoubleValue == jLongValue) {
                    return Long.valueOf(jLongValue);
                }
                if (dDoubleValue == fFloatValue) {
                    return Float.valueOf(fFloatValue);
                }
                return Double.valueOf(dDoubleValue);
            }
            if (obj instanceof Boolean) {
                return Boolean.valueOf(qVarLJIILJJIL.LJ());
            }
            return qVarLJIILJJIL.toString();
        }
        if (kVar instanceof m) {
            return "";
        }
        return kVar.toString();
    }
}
