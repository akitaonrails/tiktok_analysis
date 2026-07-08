package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0poN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525930poN {
    public final Deque<Runnable> LIZ = new LinkedList();
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final int LIZJ = 200;

    public final void LIZ() {
        synchronized (this) {
            try {
                this.LIZIZ.set(true);
                while (((LinkedList) this.LIZ).size() > 0) {
                    ((Runnable) ((LinkedList) this.LIZ).pop()).run();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.LIZIZ.get()) {
                    runnable.run();
                } else if (((LinkedList) this.LIZ).size() < this.LIZJ) {
                    ((LinkedList) this.LIZ).add(runnable);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("throw task ");
                    sbLIZ.append(runnable);
                    sbLIZ.append(", because there are too many tasks in queue");
                    C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
