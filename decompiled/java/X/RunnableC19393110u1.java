package X;

import Y.ARunnableS129S0100000_29;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10u1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19393110u1 implements Runnable {
    public final /* synthetic */ C126G LL;

    public final void LIZ() {
        C126G c126g = this.LL;
        if (!c126g.LLJI || !c126g.LLJILJIL) {
            c126g.performClick();
            return;
        }
        ViewGroup.LayoutParams layoutParams = c126g.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            try {
                ((WindowManager.LayoutParams) layoutParams).flags = 128;
                ((WindowManager) C786410Ut5.H2(this.LL.getContext(), "window")).updateViewLayout(this.LL, layoutParams);
                C786410Ut5.LJJZZIII(this.LL.LLILZIL, new ARunnableS129S0100000_29(this, 180));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AnimatablePushView$PerformClickCmd@2113.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnimatablePushView$PerformClickCmd@2113.run");
    }

    public RunnableC19393110u1(C126G c126g) {
        this.LL = c126g;
    }
}
