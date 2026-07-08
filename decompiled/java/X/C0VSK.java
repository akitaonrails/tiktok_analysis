package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VSK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSK {
    public static final List<C0VSL> LIZ = new ArrayList();
    public static final Object LIZIZ = new Object();

    public static void LIZ(long j) {
        synchronized (LIZIZ) {
            try {
                Iterator it2 = ((ArrayList) LIZ).iterator();
                while (it2.hasNext()) {
                    ((C0VSL) it2.next()).LIZIZ(j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
