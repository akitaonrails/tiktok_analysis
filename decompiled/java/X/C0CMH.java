package X;

import android.os.Handler;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: renamed from: X.0CMH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CMH {
    public final Handler LIZ;
    public final long LIZIZ;
    public boolean LIZLLL;
    public final Deque<Runnable> LIZJ = new ConcurrentLinkedDeque();
    public final C0CMI LJ = new Runnable() { // from class: X.0CMI
        public final void LIZ() {
            Runnable runnable = (Runnable) ((ConcurrentLinkedDeque) this.LL.LIZJ).poll();
            if (runnable == null) {
                this.LL.LIZLLL = false;
                return;
            }
            runnable.run();
            if (!(!this.LL.LIZJ.isEmpty())) {
                this.LL.LIZLLL = false;
                return;
            }
            C0CMH c0cmh = this.LL;
            C786410Ut5.LJLIIL(c0cmh.LIZIZ, c0cmh.LIZ, this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("DowngradeNormalPriorityExecutor@c0e.internalRunnable$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("DowngradeNormalPriorityExecutor@c0e.internalRunnable$1");
        }
    };

    public final synchronized void LIZIZ() {
        if (!this.LIZLLL && (!((ConcurrentLinkedDeque) this.LIZJ).isEmpty())) {
            this.LIZLLL = true;
            C786410Ut5.LJJZZIII(this.LIZ, this.LJ);
        }
    }

    public final synchronized void LIZ(Runnable runnable) {
        ((ConcurrentLinkedDeque) this.LIZJ).push(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0CMI] */
    public C0CMH(Handler handler, long j) {
        this.LIZ = handler;
        this.LIZIZ = j;
    }
}
