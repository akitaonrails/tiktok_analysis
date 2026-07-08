package X;

import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791420V2u extends AbstractWindowCallbackC1196740hFQ {
    public final /* synthetic */ Window LLILLJJLI;
    public final /* synthetic */ C791390V2r LLILLL;

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListenerRemove = this.LLILLL.LJIILLIIL.remove(this.LLILLJJLI);
                this.LLILLL.LJIIZILJ.remove(this.LLILLJJLI);
                this.LLILLL.LJJII = null;
                if (onFrameMetricsAvailableListenerRemove != null) {
                    this.LLILLJJLI.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListenerRemove);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LL.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C791390V2r c791390V2r = this.LLILLL;
        if (!c791390V2r.LJI) {
            c791390V2r.LIZIZ.LIZ(keyEvent.getEventTime());
        }
        return this.LL.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C791390V2r c791390V2r = this.LLILLL;
        if (!c791390V2r.LJI) {
            c791390V2r.LIZIZ.LIZ(motionEvent.getEventTime());
        }
        return this.LL.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C791420V2u(C791390V2r c791390V2r, Window.Callback callback, Window window) {
        super(callback);
        this.LLILLL = c791390V2r;
        this.LLILLJJLI = window;
    }
}
