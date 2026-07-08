package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.051K, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051K {
    public static final C051K LIZ = new C051K();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(982));
    public static final C1269104xt LIZJ = new C1269104xt(false, false, false);
    public static final ConcurrentHashMap<C1269104xt, Gson> LIZLLL = new ConcurrentHashMap<>();

    public static Gson LIZJ() {
        return (Gson) LIZIZ.getValue();
    }

    public static Object LIZ(Class cls, Object obj) {
        String strLJIILL = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return LIZIZ((String) obj, cls);
        }
        try {
            strLJIILL = LIZJ().LJIILL(obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return LIZIZ(strLJIILL, cls);
    }

    public static Object LIZIZ(String str, Class cls) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object objLJII = null;
        if (z) {
            return null;
        }
        try {
            objLJII = LIZJ().LJII(str, cls);
            return objLJII;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return objLJII;
        }
    }

    public static String LIZLLL(boolean z, boolean z2, boolean z3, Object obj) {
        Gson gsonLIZJ;
        C1269104xt c1269104xt = new C1269104xt(z, z2, z3);
        if (Intrinsics.LJFF(c1269104xt, LIZJ)) {
            gsonLIZJ = LIZJ();
        } else {
            ConcurrentHashMap<C1269104xt, Gson> concurrentHashMap = LIZLLL;
            Gson gsonLIZ = concurrentHashMap.get(c1269104xt);
            if (gsonLIZ == null) {
                Gson gsonLIZJ2 = LIZJ();
                gsonLIZJ2.getClass();
                e eVar = new e(gsonLIZJ2);
                if (z) {
                    eVar.LJIIL = false;
                }
                if (z2) {
                    eVar.LJIILIIL = true;
                }
                if (z3) {
                    eVar.LJI = true;
                }
                gsonLIZ = eVar.LIZ();
                Gson gsonPutIfAbsent = concurrentHashMap.putIfAbsent(c1269104xt, gsonLIZ);
                if (gsonPutIfAbsent != null) {
                    gsonLIZ = gsonPutIfAbsent;
                }
            }
            gsonLIZJ = gsonLIZ;
        }
        return GsonProtectorUtils.toJson(gsonLIZJ, obj);
    }

    public static String LJFF(Object obj, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        try {
            return LIZLLL(z, false, z2, obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }
}
