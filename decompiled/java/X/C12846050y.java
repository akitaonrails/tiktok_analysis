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
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.050y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12846050y {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(n nVar) {
        try {
            if (nVar == null) {
                return C2097608Jq.LJ();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, k> entry : nVar.entrySet()) {
                linkedHashMap.put(entry.getKey(), LIZJ(entry.getValue()));
            }
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return C2097608Jq.LJ();
        }
    }

    public static final List<Object> LIZIZ(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            if (jSONArray == null) {
                return arrayList;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    arrayList.add(LIZLLL((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    arrayList.add(LIZIZ((JSONArray) obj));
                } else if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return new ArrayList();
        }
    }

    public static Object LIZJ(k kVar) {
        kVar.getClass();
        if (kVar instanceof n) {
            return LIZ(kVar.LJIILIIL());
        }
        if (kVar instanceof h) {
            h hVarLJIIL = kVar.LJIIL();
            ArrayList arrayList = new ArrayList();
            Iterator<k> it2 = hVarLJIIL.iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZJ(it2.next()));
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

    public static final Map<String, Object> LIZLLL(JSONObject jSONObject) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    linkedHashMap.put(next, LIZLLL((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    linkedHashMap.put(next, LIZIZ((JSONArray) obj));
                } else if (obj != null) {
                    linkedHashMap.put(next, obj);
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return new LinkedHashMap();
        }
    }
}
