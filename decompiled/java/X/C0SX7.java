package X;

import android.view.View;
import android.widget.Magnifier;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0SX7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SX7 implements Runnable {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C0SX4 LLILLJJLI;

    public C0SX7(View view, C0SX4 c0sx4) {
        this.LL = view;
        this.LLILLJJLI = c0sx4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PostModeTextSelectionHelper@13e4.refreshSelectionMagnifier$1");
        try {
            if (this.LL.getParent() != null) {
                try {
                    Magnifier magnifier = this.LLILLJJLI.LJJIIJ;
                    if (magnifier != null) {
                        magnifier.update();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeTextSelectionHelper@13e4.refreshSelectionMagnifier$1");
    }
}
