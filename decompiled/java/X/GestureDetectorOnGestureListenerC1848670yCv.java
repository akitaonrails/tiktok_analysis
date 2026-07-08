package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0yCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class GestureDetectorOnGestureListenerC1848670yCv extends FrameLayout implements GestureDetector.OnGestureListener {
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

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (Looper.getMainLooper() != Looper.myLooper() && C1488660oqG.LIZIZ != null) {
            new HashMap();
            C1488660oqG.LIZIZ.LIZ();
        }
        super.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public GestureDetectorOnGestureListenerC1848670yCv(Context context) {
        super(context);
        new GestureDetector(context, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        InterfaceC1848680yCw interfaceC1848680yCw = C1488660oqG.LIZIZ;
        if (interfaceC1848680yCw != null) {
            interfaceC1848680yCw.LIZJ(true);
        }
        super.dispatchDraw(canvas);
        if (interfaceC1848680yCw != null) {
            interfaceC1848680yCw.LIZJ(false);
        }
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
        C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (Looper.getMainLooper() != Looper.myLooper() && C1488660oqG.LIZIZ != null) {
            new HashMap();
            C1488660oqG.LIZIZ.LIZ();
        }
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        if (Looper.getMainLooper() != Looper.myLooper() && C1488660oqG.LIZIZ != null) {
            new HashMap();
            C1488660oqG.LIZIZ.LIZ();
        }
        super.onDescendantInvalidated(view, view2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i = C2187451AjH.LIZ;
        C2211751BhN.LIZLLL();
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC1848680yCw interfaceC1848680yCw = C1488660oqG.LIZIZ;
        if (interfaceC1848680yCw != null) {
            interfaceC1848680yCw.LIZIZ(true);
        }
        super.onLayout(z, i, i2, i3, i4);
        if (interfaceC1848680yCw != null) {
            interfaceC1848680yCw.LIZIZ(false);
        }
        int i5 = C2187451AjH.LIZ;
        C2211751BhN.LJ(C2211751BhN.LJIIIZ(), true);
        C1848650yCt.LIZ();
    }
}
