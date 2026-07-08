package X;

import android.hardware.display.DisplayManager;
import android.view.Display;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0VTJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VTJ extends C0VTK {
    public boolean LL;
    public long LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(381));

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        DisplayManager displayManager;
        Display display;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!this.LL && (displayManager = (DisplayManager) this.LLILLL.getValue()) != null && (display = displayManager.getDisplay(i)) != null && ((int) display.getRefreshRate()) > 60) {
            C0VTH.LIZ(false, true);
            this.LL = true;
            try {
                DisplayManager displayManager2 = (DisplayManager) this.LLILLL.getValue();
                if (displayManager2 != null) {
                    displayManager2.unregisterDisplayListener(this);
                    return;
                }
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return;
            }
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
