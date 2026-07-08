package X;

import android.app.Activity;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0R6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class WindowOnFrameMetricsAvailableListenerC690580R6y implements Window.OnFrameMetricsAvailableListener {
    public final Function2<C0R73, Boolean, Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public WeakReference<View> LJ;
    public boolean LJFF;
    public long LJI;

    public WindowOnFrameMetricsAvailableListenerC690580R6y(C0RCP c0rcp, C0RCQ c0rcq) {
        this.LIZ = c0rcq;
        this.LIZIZ = c0rcp;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        C0R73 c0r73LIZIZ;
        View view;
        Activity activityLIZ;
        Window window2;
        if (!this.LIZJ) {
            return;
        }
        if (!this.LJFF ? 0 >= C0R74.LIZ || System.currentTimeMillis() - this.LIZLLL >= C0R74.LIZIZ : 0 >= C0R75.LIZ) {
            this.LIZIZ.invoke();
            try {
                if (window != null) {
                    window.removeOnFrameMetricsAvailableListener(this);
                    return;
                }
                WeakReference<View> weakReference = this.LJ;
                if (weakReference != null && (view = weakReference.get()) != null && (activityLIZ = C085T.LIZ(view.getContext())) != null && (window2 = activityLIZ.getWindow()) != null) {
                    window2.removeOnFrameMetricsAvailableListener(this);
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (this.LJI > 0 && System.currentTimeMillis() - this.LJI < 16) {
            return;
        }
        this.LJI = System.currentTimeMillis();
        C690560R6w.LIZ.getClass();
        C0R70 c0r70 = C690560R6w.LIZLLL;
        if (c0r70 != null) {
            c0r73LIZIZ = c0r70.LIZIZ();
        } else {
            c0r73LIZIZ = null;
        }
        this.LIZ.invoke(c0r73LIZIZ, Boolean.valueOf(this.LJFF));
    }
}
