package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0oPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472050oPT {
    public static boolean LIZJ(C1472990oQz c1472990oQz) {
        if (c1472990oQz != null) {
            if (c1472990oQz.LIZIZ != null) {
                return true;
            }
            if (!TextUtils.isEmpty(c1472990oQz.LJ)) {
                return c1472990oQz.LJIIIIZZ;
            }
            return false;
        }
        return false;
    }

    public static Object LIZ(String str, Map map) {
        try {
            Object obj = map.get(str);
            if (obj != null) {
                return obj;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String LIZIZ(String str, Map map) {
        if (map != null && map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        return null;
    }
}
