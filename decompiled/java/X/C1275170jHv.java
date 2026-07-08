package X;

import Y.ARunnableS120S0100000_20;
import android.os.Handler;

/* JADX INFO: renamed from: X.0jHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1275170jHv {
    public long LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public ARunnableS120S0100000_20 LJ;
    public final /* synthetic */ C1274860jHQ LJFF;

    public final synchronized void LIZ() {
        if (this.LIZJ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.LIZIZ = jCurrentTimeMillis;
            if (jCurrentTimeMillis - this.LIZ > 500) {
                this.LJFF.LJIIIZ.LJII.getClass();
            }
            this.LIZ = this.LIZIZ;
        }
    }

    public final synchronized void LIZIZ() {
        this.LIZLLL = false;
        Handler handler = this.LJFF.LJIIIZ.LJIIJJI;
        if (handler != null) {
            handler.removeCallbacks(this.LJ);
        }
    }

    public C1275170jHv(C1274860jHQ c1274860jHQ, String str) {
        this.LJFF = c1274860jHQ;
    }
}
