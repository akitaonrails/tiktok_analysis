package X;

import Y.ARunnableS133S0100000_33;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.19nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21648919nz extends GestureDetector.SimpleOnGestureListener {
    public final C21649019o0 LL;
    public final PointF LLILLJJLI = new PointF();

    public C21648919nz(C21649019o0 c21649019o0) {
        this.LL = c21649019o0;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        C21649019o0 c21649019o0 = this.LL;
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (c21649019o0.LLJJIJIL == null) {
                    c21649019o0.LLJJIJIL = new C1765510w2n(c21649019o0);
                }
                InterfaceC1765520w2o interfaceC1765520w2o = c21649019o0.LLJJIJIL;
                c21649019o0.LLJIJIL.getValues(c21649019o0.LLJILJILJ);
                C1765510w2n c1765510w2n = (C1765510w2n) interfaceC1765520w2o;
                c1765510w2n.LIZ(c21649019o0.LLJILJILJ[0]);
                c21649019o0.LLJL = true;
                c21649019o0.LLJIJIL.getValues(c21649019o0.LLJILJILJ);
                float fLIZ = c1765510w2n.LIZ(c21649019o0.LLJILJILJ[0]);
                ARunnableS133S0100000_33 aRunnableS133S0100000_33 = new ARunnableS133S0100000_33(c21649019o0, 116);
                if (c21649019o0.LLJJJJ.isRunning()) {
                    c21649019o0.LJIJ();
                }
                c21649019o0.LLJJIII.reset();
                Matrix matrix = c21649019o0.LLJJIII;
                float[] fArr = c21649019o0.LLJILJILJ;
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                c21649019o0.LLJIJIL.invert(c21649019o0.LLJILJIL);
                c21649019o0.LLJILJIL.mapPoints(fArr, 0, fArr, 0, 1);
                PointF pointF2 = new PointF(fArr[0], fArr[1]);
                matrix.setScale(fLIZ, fLIZ, pointF2.x, pointF2.y);
                c21649019o0.LJIIJJI(pointF2.x, pointF2.y, matrix);
                c21649019o0.LJIIL(matrix);
                c21649019o0.LJIIZILJ(c21649019o0.LLJJIII, c21649019o0.LLJJJJJIL, aRunnableS133S0100000_33, null);
            }
            return true;
        }
        this.LLILLJJLI.set(pointF);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return super.onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C21649019o0 c21649019o0 = this.LL;
        c21649019o0.LLJIJIL.getValues(c21649019o0.LLJILJILJ);
        if (c21649019o0.LLJILJILJ[0] > 1.0f) {
            int i = (int) f;
            int i2 = (int) f2;
            if (!c21649019o0.LLJJJJ.isRunning() && c21649019o0.LLILZIL) {
                if (c21649019o0.LLJJL.computeScrollOffset() && c21649019o0.LLJJL.computeScrollOffset()) {
                    c21649019o0.LLJJL.forceFinished(true);
                }
                c21649019o0.LLJJL.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                c21649019o0.LLJJIJIIJIL.set(c21649019o0.LLJIJIL);
                Matrix matrix = c21649019o0.LLJIJIL;
                matrix.set(matrix);
                c21649019o0.LJFF();
            }
        }
        return false;
    }
}
