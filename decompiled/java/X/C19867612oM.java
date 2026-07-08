package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.12oM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19867612oM {
    public static boolean LIZ(Object obj, Map map) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static Object LIZIZ(Object obj, Map map) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
