package X;

import android.content.Context;
import com.bytedance.applog.AppLog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.1BF3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BF3 {
    public static final List<String> LIZ = Collections.singletonList("EventsSenderUtils");
    public static final Map<String, C1BF2> LIZIZ = new ConcurrentHashMap();
    public static final C2192511ArR LIZJ = new C08UT<Boolean>() { // from class: X.1ArR
        @Override // X.C08UT
        public final Object LIZ() {
            Class<?> cls;
            try {
                cls = Class.forName("com.bytedance.applog.et_verify.EventVerify");
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                cls = null;
            }
            return Boolean.valueOf(cls != null);
        }
    };

    public static C1BF2 LIZ(String str) {
        C2192511ArR c2192511ArR = LIZJ;
        C1BF2 c1bf2 = null;
        if (!c2192511ArR.LIZIZ(new Object[0]).booleanValue()) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        if (!concurrentHashMap.containsKey(str)) {
            if (c2192511ArR.LIZIZ(new Object[0]).booleanValue()) {
                Object objLIZ = C1BF5.LIZ(str);
                if (objLIZ == null) {
                    objLIZ = AppLog.getInstance();
                }
                try {
                    Constructor<?> constructor = Class.forName("com.bytedance.applog.et_verify.EventVerify").getConstructor(C2209901BeO.class);
                    constructor.setAccessible(true);
                    C1BF2 c1bf22 = (C1BF2) constructor.newInstance(objLIZ);
                    if (c1bf22 == null) {
                        C2209791BeD.LJIJJ().LIZJ(LIZ, "can't find event verify, should compile with ET", new Object[0]);
                    } else {
                        C2209791BeD.LJIJJ().LJI(LIZ, "found event sender: {}", c1bf22);
                    }
                    c1bf2 = c1bf22;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2209791BeD.LJIJJ().LIZJ(LIZ, "can't find event verify, should compile with ET", new Object[0]);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C2209791BeD.LJIJJ().LIZJ(LIZ, "can't find event verify, should compile with ET", new Object[0]);
                    throw th;
                }
            }
            ((ConcurrentHashMap) LIZIZ).put(str, c1bf2);
            return c1bf2;
        }
        return (C1BF2) concurrentHashMap.get(str);
    }

    public static boolean LIZIZ(String str) {
        C1BF2 c1bf2LIZ;
        if (!LIZJ.LIZIZ(new Object[0]).booleanValue() || (c1bf2LIZ = LIZ(str)) == null) {
            return false;
        }
        return c1bf2LIZ.isEnable();
    }

    public static void LJ(String str, String str2) {
        C1BF2 c1bf2LIZ = LIZ(str);
        if (c1bf2LIZ != null) {
            c1bf2LIZ.LJFF(str2);
        } else {
            C2209791BeD.LJIJJ().LJIIL(LIZ, new Object[0]);
        }
    }

    public static void LJFF(long j, String str) {
        C1BF2 c1bf2LIZ = LIZ(str);
        if (c1bf2LIZ != null) {
            c1bf2LIZ.LJ(j);
        } else {
            C2209791BeD.LJIJJ().LJIIL(LIZ, new Object[0]);
        }
    }

    public static void LJII(String str, List<String> list) {
        C1BF2 c1bf2LIZ = LIZ(str);
        if (c1bf2LIZ != null) {
            c1bf2LIZ.LIZJ(list);
        } else {
            C2209791BeD.LJIJJ().LJIIL(LIZ, new Object[0]);
        }
    }

    public static void LIZJ(Context context, String str, String str2) {
        C1BF2 c1bf2LIZ = LIZ(str);
        if (c1bf2LIZ != null) {
            c1bf2LIZ.LIZ(str2, context);
        } else {
            C2209791BeD.LJIJJ().LJIIL(LIZ, new Object[0]);
        }
    }

    public static void LIZLLL(String str, String str2, JSONArray jSONArray) {
        C1BF2 c1bf2LIZ = LIZ(str);
        if (c1bf2LIZ != null) {
            c1bf2LIZ.LIZIZ(str2, jSONArray);
        }
    }

    public static void LJI(Context context, String str, boolean z) {
        C1BF2 c1bf2LIZ = LIZ(str);
        if (c1bf2LIZ != null) {
            c1bf2LIZ.LIZLLL(z, context);
        } else {
            C2209791BeD.LJIJJ().LJIIL(LIZ, new Object[0]);
        }
    }
}
