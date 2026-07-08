package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0kVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322300kVw {
    public static final Map<Class<?>, Object> LIZ = new ConcurrentHashMap();

    public static void LIZ(Class cls, String str) {
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls2.getClass().isAssignableFrom(cls.getClass())) {
                Object objNewInstance = cls2.newInstance();
                if (objNewInstance == null) {
                    int i = C2187451AjH.LIZ;
                    C1521730phb.LIZJ("MonitorService", "Null monitor service", new Throwable());
                } else {
                    ((ConcurrentHashMap) LIZ).put(cls, objNewInstance);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
