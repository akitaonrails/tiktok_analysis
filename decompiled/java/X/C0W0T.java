package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;

/* JADX INFO: renamed from: X.0W0T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W0T {
    public static boolean LIZ(Bundle bundle, Bundle bundle2) {
        Object obj;
        if (bundle != null) {
            if (bundle2 == null || bundle.size() != bundle2.size()) {
                return false;
            }
            Set<String> setKeySet = bundle.keySet();
            if (!setKeySet.containsAll(bundle2.keySet())) {
                return false;
            }
            for (String str : setKeySet) {
                Object obj2 = null;
                try {
                    obj = bundle.get(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                try {
                    obj2 = bundle2.get(str);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                } catch (OutOfMemoryError e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                if (!LIZIZ(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
        if (bundle == bundle2) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
