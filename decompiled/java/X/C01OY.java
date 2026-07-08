package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.01OY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01OY implements Runnable {
    public final List<Runnable> LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SerialRunnable@523e.run");
        try {
            Iterator<Runnable> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SerialRunnable@523e.run");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C01OY(List<? extends Runnable> list) {
        this.LL = list;
    }
}
