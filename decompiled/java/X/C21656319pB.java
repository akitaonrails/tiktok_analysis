package X;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.19pB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21656319pB extends AbstractC21655919p7 {
    public final InterfaceC21656419pC LJIIJJI;
    public boolean LJIIL;

    public final void LIZIZ() {
        MotionEvent motionEvent = this.LIZIZ;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.LIZIZ = null;
        }
        MotionEvent motionEvent2 = this.LIZJ;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.LIZJ = null;
        }
        this.LJFF = false;
        this.LJIIL = false;
    }

    public final void LIZJ(MotionEvent motionEvent) {
        float x;
        float y;
        float y2;
        int actionIndex;
        MotionEvent motionEvent2 = this.LIZIZ;
        MotionEvent motionEvent3 = this.LIZJ;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
            this.LIZJ = null;
        }
        this.LIZJ = MotionEvent.obtain(motionEvent);
        if (motionEvent2 != null) {
            motionEvent.getEventTime();
            motionEvent2.getEventTime();
            this.LJ = motionEvent2.getPressure(motionEvent2.getActionIndex());
        }
        this.LIZLLL = motionEvent.getPressure(motionEvent.getActionIndex());
        MotionEvent motionEvent4 = this.LIZIZ;
        float x2 = 0.0f;
        if (motionEvent4 != null) {
            x = motionEvent4.getX(0);
            y = motionEvent4.getY(0);
        } else {
            x = 0.0f;
            y = 0.0f;
        }
        if (motionEvent4 != null && motionEvent4.getPointerCount() >= 2) {
            x2 = motionEvent4.getX(1);
            y2 = motionEvent4.getY(1);
        } else {
            y2 = 0.0f;
        }
        this.LJII = x2 - x;
        this.LJIIIIZZ = y2 - y;
        float x3 = motionEvent.getX(0);
        float y3 = motionEvent.getY(0);
        if (motionEvent.getPointerCount() >= 2) {
            x2 = motionEvent.getX(1);
            y2 = motionEvent.getY(1);
        }
        this.LJIIIZ = x2 - x3;
        this.LJIIJ = y2 - y3;
        int pointerCount = motionEvent.getPointerCount();
        if ((motionEvent.getAction() & 255) == 6) {
            actionIndex = motionEvent.getActionIndex();
        } else {
            actionIndex = -1;
        }
        for (int i = 0; i < pointerCount; i++) {
            if (actionIndex != i) {
                motionEvent.getX(i);
                motionEvent.getY(i);
            }
        }
    }

    public C21656319pB(Context context, C21656919pH c21656919pH) {
        super(context);
        this.LJIIJJI = c21656919pH;
    }
}
