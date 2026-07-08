package X;

import android.text.TextUtils;
import com.bytedance.goda.model.adapter.MapAdapter;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.051O, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051O {
    public static final Gson LIZ = new Gson();

    public static Object LIZ(k kVar) {
        if (kVar instanceof m) {
            return null;
        }
        if (kVar instanceof n) {
            return LIZJ(kVar.LJIILIIL());
        }
        if (kVar instanceof h) {
            h hVarLJIIL = kVar.LJIIL();
            ArrayList arrayList = new ArrayList();
            Iterator<k> it2 = hVarLJIIL.iterator();
            while (it2.hasNext()) {
                Object objLIZ = LIZ(it2.next());
                if (objLIZ != null) {
                    arrayList.add(objLIZ);
                }
            }
            return arrayList;
        }
        q qVarLJIILJJIL = kVar.LJIILJJIL();
        Object obj = qVarLJIILJJIL.LL;
        if (obj instanceof Boolean) {
            return Boolean.valueOf(qVarLJIILJJIL.LJ());
        }
        if (obj instanceof Number) {
            double dDoubleValue = qVarLJIILJJIL.LJIJ().doubleValue();
            long j = (long) dDoubleValue;
            if (dDoubleValue - j == 0.0d) {
                if (-2147483648L <= j && j <= 2147483647L) {
                    return Integer.valueOf((int) j);
                }
                return Long.valueOf(j);
            }
            return Double.valueOf(dDoubleValue);
        }
        return qVarLJIILJJIL.LJIL();
    }

    public static String LIZIZ(Map map) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), "mobile_config")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            linkedHashMap = null;
        }
        Gson gson = LIZ;
        gson.getClass();
        new e(gson).LIZJ(new MapAdapter(), new TypeToken<Map<String, ? extends Object>>() { // from class: X.051P
        }.getType());
        return GsonProtectorUtils.toJson(gson, linkedHashMap);
    }

    public static Map LIZJ(n nVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(nVar.size());
        for (Map.Entry<String, k> entry : nVar.entrySet()) {
            linkedHashMap.put(entry.getKey(), LIZ(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static Object LIZLLL(Class cls, Map map) {
        Gson gson = LIZ;
        return GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, map), cls);
    }

    public static Object LJ(Class cls, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return LIZ.LJII(str, cls);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
