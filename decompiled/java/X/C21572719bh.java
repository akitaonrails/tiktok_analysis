package X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.19bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21572719bh {
    public final InterfaceC21572919bj LIZ;
    public boolean LIZIZ;
    public MotionEvent LIZJ;
    public MotionEvent LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public boolean LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;

    public final void LIZIZ() {
        MotionEvent motionEvent = this.LIZJ;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.LIZJ = null;
        }
        MotionEvent motionEvent2 = this.LIZLLL;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.LIZLLL = null;
        }
        this.LIZIZ = false;
        this.LJIILLIIL = -1;
        this.LJIIZILJ = -1;
        this.LJIILL = false;
    }

    public C21572719bh(C21573419bo c21573419bo) {
        this.LIZ = c21573419bo;
    }

    public final void LIZJ(MotionEvent motionEvent, View view) {
        MotionEvent motionEvent2 = this.LIZLLL;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.LIZLLL = MotionEvent.obtain(motionEvent);
        this.LJIIJ = -1.0f;
        this.LJIIJJI = -1.0f;
        this.LJIIL = -1.0f;
        MotionEvent motionEvent3 = this.LIZJ;
        int iFindPointerIndex = motionEvent3.findPointerIndex(this.LJIILLIIL);
        int iFindPointerIndex2 = motionEvent3.findPointerIndex(this.LJIIZILJ);
        int iFindPointerIndex3 = motionEvent.findPointerIndex(this.LJIILLIIL);
        int iFindPointerIndex4 = motionEvent.findPointerIndex(this.LJIIZILJ);
        if (iFindPointerIndex >= 0 && iFindPointerIndex2 >= 0 && iFindPointerIndex3 >= 0 && iFindPointerIndex4 >= 0) {
            float x = motionEvent3.getX(iFindPointerIndex);
            float y = motionEvent3.getY(iFindPointerIndex);
            float x2 = motionEvent3.getX(iFindPointerIndex2);
            float y2 = motionEvent3.getY(iFindPointerIndex2);
            float x3 = motionEvent.getX(iFindPointerIndex3);
            float y3 = motionEvent.getY(iFindPointerIndex3);
            float x4 = motionEvent.getX(iFindPointerIndex4) - x3;
            float y4 = motionEvent.getY(iFindPointerIndex4) - y3;
            this.LJI = x2 - x;
            this.LJII = y2 - y;
            this.LJIIIIZZ = x4;
            this.LJIIIZ = y4;
            this.LJ = x3 + (x4 * 0.5f);
            this.LJFF = y3 + (y4 * 0.5f);
            motionEvent.getEventTime();
            motionEvent3.getEventTime();
            this.LJIILIIL = motionEvent.getPressure(iFindPointerIndex3) + motionEvent.getPressure(iFindPointerIndex4);
            this.LJIILJJIL = motionEvent3.getPressure(iFindPointerIndex) + motionEvent3.getPressure(iFindPointerIndex2);
            return;
        }
        this.LJIILL = true;
        if (this.LIZIZ) {
            this.LIZ.LIZ(this);
        }
    }

    public static int LIZ(int i, int i2, MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (i3 != i2 && i3 != iFindPointerIndex) {
                return i3;
            }
        }
        return -1;
    }
}
