package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0V4G, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V4G {
    public final float LIZ;
    public final Runnable LIZIZ;
    public final C0V4F LIZJ = new Runnable() { // from class: X.0V4F
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("MemoryMonitor@eec5.<field>$1");
            try {
                Runtime runtime = Runtime.getRuntime();
                long jMaxMemory = runtime.maxMemory();
                float fFreeMemory = runtime.totalMemory() - runtime.freeMemory();
                C0V4G c0v4g = this.LL;
                if (fFreeMemory > jMaxMemory * c0v4g.LIZ) {
                    c0v4g.LIZIZ.run();
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("MemoryMonitor@eec5.<field>$1");
        }
    };

    public final void LIZ() {
        C0V4F c0v4f = this.LIZJ;
        ArrayList<Runnable> arrayList = C0V4I.LIZIZ;
        synchronized (arrayList) {
            try {
                arrayList.add(c0v4f);
                if (C0V4I.LIZ == null) {
                    C0V4I.LIZ = new WeakReference<>(new C0V4H());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0V4F] */
    public C0V4G(float f, Runnable runnable) {
        this.LIZ = f;
        this.LIZIZ = runnable;
    }
}
