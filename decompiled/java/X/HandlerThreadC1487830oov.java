package X;

import Y.ARunnableS123S0100000_23;
import android.os.Handler;
import ci3.a;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class HandlerThreadC1487830oov extends a {
    public final /* synthetic */ C1487820oou LL;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            this.LL.LJ = new Handler(C786410Ut5.W2(this.LL.LIZLLL));
            C786410Ut5.LJJZZIII(this.LL.LJ, new ARunnableS123S0100000_23(this, 154));
            if (zLJ) {
                C0W9U.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC1487830oov(C1487820oou c1487820oou, int i) {
        super("media_pool_control", i);
        this.LL = c1487820oou;
    }
}
