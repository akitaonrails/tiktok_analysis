package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0V4H, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V4H {
    public final void finalize() {
        Runnable[] runnableArr;
        ArrayList<Runnable> arrayList = C0V4I.LIZIZ;
        synchronized (arrayList) {
            try {
                runnableArr = (Runnable[]) arrayList.toArray(C0V4I.LIZJ);
                C0V4I.LIZJ = runnableArr;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (Runnable runnable : runnableArr) {
            if (runnable != null) {
                runnable.run();
            }
        }
        if (C0V4I.LIZIZ.isEmpty()) {
            return;
        }
        C0V4I.LIZ = new WeakReference<>(new C0V4H());
    }
}
