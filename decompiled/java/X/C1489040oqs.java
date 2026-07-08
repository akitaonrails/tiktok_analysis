package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0oqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489040oqs<T> {
    public final ConcurrentLinkedQueue<WeakReference<T>> LIZ = new ConcurrentLinkedQueue<>();

    public final void LIZ(T t) {
        if (t == null) {
            return;
        }
        synchronized (this.LIZ) {
            try {
                Iterator<WeakReference<T>> it2 = this.LIZ.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    T t2 = it2.next().get();
                    if (t2 == null) {
                        it2.remove();
                    } else if (t2 == t) {
                        z = true;
                    }
                }
                if (!z) {
                    this.LIZ.add(new WeakReference<>(t));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(InterfaceC1489050oqt<T> interfaceC1489050oqt) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        synchronized (this.LIZ) {
            try {
                if (this.LIZ.size() > 0) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue(this.LIZ);
                } else {
                    concurrentLinkedQueue = null;
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (concurrentLinkedQueue != null) {
            try {
                Iterator it2 = concurrentLinkedQueue.iterator();
                while (it2.hasNext()) {
                    Object obj = ((WeakReference) it2.next()).get();
                    if (obj != null) {
                        try {
                            interfaceC1489050oqt.LIZ(obj);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            } catch (Throwable th2) {
            }
        }
    }
}
