package X;

import com.bytedance.memrelief.gc.WeakRefMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09Qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2370009Qk {
    public final void finalize() {
        Iterator<Runnable> it2 = WeakRefMonitor.sGcWatchers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        WeakRefMonitor.sGcWatcher = new WeakReference<>(new C2370009Qk());
    }
}
