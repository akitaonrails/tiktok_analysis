package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: X.19bL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21570519bL extends GestureDetectorOnGestureListenerC21571019bQ {
    public final /* synthetic */ C21570319bJ LL;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public C21570519bL(C21570319bJ c21570319bJ) {
        this.LL = c21570319bJ;
    }

    @Override // X.GestureDetectorOnGestureListenerC21571019bQ, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (this.LL.getChildCount() == 0) {
            return false;
        }
        this.LL.getClass();
        return true;
    }

    @Override // X.GestureDetectorOnGestureListenerC21571019bQ, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        InterfaceC21573019bk interfaceC21573019bk = this.LL.LLJILLL;
        if (interfaceC21573019bk != null) {
            interfaceC21573019bk.LIZ();
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InterfaceC21573019bk interfaceC21573019bk = this.LL.LLJILLL;
        if (interfaceC21573019bk != null) {
            interfaceC21573019bk.LIZIZ();
            return true;
        }
        return true;
    }

    @Override // X.GestureDetectorOnGestureListenerC21571019bQ, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C21570319bJ c21570319bJ = this.LL;
        float f3 = -f;
        float f4 = -f2;
        float f5 = c21570319bJ.LLJJIJI + f3;
        c21570319bJ.LLJJIJI = f5;
        float f6 = c21570319bJ.LLJJIJIIJIL + f4;
        c21570319bJ.LLJJIJIIJIL = f6;
        if (!c21570319bJ.LLJJIII && f6 > Math.abs(f5)) {
            c21570319bJ.LLJJIII = true;
            c21570319bJ.getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (c21570319bJ.LLJJIII) {
            c21570319bJ.LLJJI += f4;
            Matrix matrix = new Matrix(c21570319bJ.LLJJJ);
            matrix.postTranslate(f3, f4);
            RectF rectF = new RectF(0.0f, 0.0f, c21570319bJ.getWidth(), c21570319bJ.getHeight());
            float fMin = 1.0f - Math.min(1.0f, Math.abs(c21570319bJ.LLJJI) / (rectF.height() * 1.0f));
            c21570319bJ.LLJJIJIL = fMin;
            InterfaceC21573019bk interfaceC21573019bk = c21570319bJ.LLJILLL;
            if (interfaceC21573019bk != null) {
                interfaceC21573019bk.LIZJ(fMin);
            }
            RectF rectF2 = new RectF(0.0f, 0.0f, c21570319bJ.getWidth(), c21570319bJ.getHeight());
            float fMin2 = ((Math.min(1.0f, Math.abs(c21570319bJ.LLJJI) / (rectF2.height() * 1.0f)) * (-0.5f)) + 1.0f) / C21571519bV.LIZ(c21570319bJ.LLJJJ);
            matrix.postScale(fMin2, fMin2, motionEvent2.getX(), motionEvent2.getY());
            c21570319bJ.setImageMatrix(matrix);
        }
        return true;
    }
}
