package X;

import com.bytedance.memrelief.gc.SoftRefMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.SoftReference;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0jaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286520jaE {
    public final void finalize() {
        Iterator<Runnable> it2 = SoftRefMonitor.sGcWatchers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        SoftRefMonitor.sGcWatcher = new SoftReference<>(new C1286520jaE());
    }
}
