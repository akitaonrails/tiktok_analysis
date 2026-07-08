package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0yCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class GestureDetectorOnGestureListenerC1848660yCu extends FrameLayout implements GestureDetector.OnGestureListener {
    public static boolean LLILLL = true;
    public float LL;
    public float LLILLJJLI;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public GestureDetectorOnGestureListenerC1848660yCu(Context context) {
        super(context);
        new GestureDetector(context, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2 || (Math.abs(motionEvent.getX() - this.LL) <= 20.0f && Math.abs(motionEvent.getY() - this.LLILLJJLI) <= 20.0f)) {
                    return zDispatchTouchEvent;
                }
                int i = C2187451AjH.LIZ;
                C2211751BhN.LJ(C2211751BhN.LJIIIZ(), true);
                ((Handler) C1848650yCt.LIZ.getValue()).removeCallbacks(C1848650yCt.LIZIZ);
                return zDispatchTouchEvent;
            }
            int i2 = C2187451AjH.LIZ;
            C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
            C1848650yCt.LIZ();
            return zDispatchTouchEvent;
        }
        this.LL = motionEvent.getX();
        this.LLILLJJLI = motionEvent.getY();
        return zDispatchTouchEvent;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        int i = C2187451AjH.LIZ;
        C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trigger reason: onWindowVisibilityChanged isFirst: ");
        sbLIZ.append(LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LLILLL) {
            LLILLL = false;
            C1848650yCt.LIZ();
        } else {
            C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i = C2187451AjH.LIZ;
        C2211751BhN.LIZLLL();
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = C2187451AjH.LIZ;
        C2211751BhN.LIZLLL();
        C1848650yCt.LIZ();
    }
}
