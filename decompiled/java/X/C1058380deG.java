package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0deG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058380deG {
    public final long LIZ = ((Number) C1474810oTv.E3.getValue()).intValue();
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public final RunnableC1058370deF LIZJ = new Runnable() { // from class: X.0deF
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("FastScrollJudge@9f33.<field>$1");
            try {
                this.LL.LJ = false;
                Runnable runnable = this.LL.LIZLLL;
                if (runnable != null) {
                    runnable.run();
                    this.LL.LIZLLL = null;
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("FastScrollJudge@9f33.<field>$1");
        }
    };
    public Runnable LIZLLL = null;
    public volatile boolean LJ;

    public final void LIZ() {
        this.LJ = true;
        this.LIZIZ.removeCallbacks(this.LIZJ);
        C786410Ut5.LJLIIL(this.LIZ, this.LIZIZ, this.LIZJ);
    }
}
