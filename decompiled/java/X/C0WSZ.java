package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0WSZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WSZ {
    public static Object LIZ(String str) {
        try {
            return Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Common", null, 6, th);
            return null;
        }
    }
}
