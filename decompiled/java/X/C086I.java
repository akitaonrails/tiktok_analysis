package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;

/* JADX INFO: renamed from: X.086I, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C086I {
    public static void LIZ(Object obj) {
        try {
            C1965507mv.LIZ("clear", obj, new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static <T> boolean LIZIZ(Collection<T> collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }
}
