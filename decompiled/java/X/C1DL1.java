package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: X.1DL1, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DL1 extends C2254251DLb implements InterfaceC2254061DKi {
    public final Context LIZ;
    public final InterfaceC2254081DKk LIZIZ;
    public final C1DHX LIZJ;
    public boolean LIZLLL = true;
    public final ScaleGestureDetector LJ;
    public final C19290410dS LJFF;

    @Override // X.InterfaceC2254061DKi
    public final void LIZJ(boolean z) {
        this.LIZLLL = z;
    }

    public C1DL1(C19GS c19gs, InterfaceC2254081DKk interfaceC2254081DKk, C1DHX c1dhx) {
        this.LIZ = c19gs;
        this.LIZIZ = interfaceC2254081DKk;
        this.LIZJ = c1dhx;
        this.LJ = new ScaleGestureDetector(c19gs, new ScaleGestureDetector.OnScaleGestureListener() { // from class: X.1DL0
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                return this.LL.LIZJ.K3(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan(), scaleGestureDetector.getScaleFactor());
            }
        });
        C19290410dS c19290410dS = new C19290410dS(c19gs, new GestureDetector.SimpleOnGestureListener(), null);
        c19290410dS.LIZIZ(new GestureDetector.OnDoubleTapListener() { // from class: X.1DKn
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                C1DL1 c1dl1 = this.LL;
                if (!c1dl1.LIZLLL) {
                    return false;
                }
                InterfaceC2254081DKk interfaceC2254081DKk2 = c1dl1.LIZIZ;
                C1DI4 c1di4 = C1DI4.LIZ;
                interfaceC2254081DKk2.U3(C1DI6.LIZ.LIZ(C1DI7.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW, null));
                return true;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (motionEvent == null) {
                    return false;
                }
                C1DL1 c1dl1 = this.LL;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (c1dl1.LIZJ.z4(c1dl1.LIZIZ.getViewFunction().LIZJ(), c1dl1.LIZ.getResources().getDisplayMetrics().density, new float[]{x, y}, c1dl1.LIZIZ.getViewFunction().LIZIZ())) {
                    c1dl1.LIZIZ.H0((int) x, (int) y);
                    if (c1dl1.LIZIZ.getExposureCompensationEnable()) {
                        c1dl1.LIZIZ.nh(x, y);
                    }
                }
                return true;
            }
        });
        this.LJFF = c19290410dS;
    }
}
