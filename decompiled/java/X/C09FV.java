package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09FV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09FV {
    public static void LIZIZ(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            C786410Ut5.LJJJI("value", obj.toString(), bundle);
        }
    }

    public static <T> T LIZ(Bundle bundle, String str, Class<T> cls, T t) {
        T t2;
        try {
            t2 = (T) bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            t2 = null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            t2 = null;
        }
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(C786410Ut5.j4("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t2.getClass().getCanonicalName()}));
    }
}
