package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.ugc.android.editor.track.widget.Vector2D;

/* JADX INFO: renamed from: X.19bt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21573919bt {
    public final InterfaceC21574019bu LIZ;
    public boolean LIZIZ;
    public MotionEvent LIZJ;
    public MotionEvent LIZLLL;
    public final Vector2D LJ = new Vector2D();
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;

    public final float LIZIZ() {
        if (this.LJIIJJI == -1.0f) {
            if (this.LJIIIZ == -1.0f) {
                float f = this.LJII;
                float f2 = this.LJIIIIZZ;
                this.LJIIIZ = (float) Math.sqrt((f * f) + (f2 * f2));
            }
            float f3 = this.LJIIIZ;
            if (this.LJIIJ == -1.0f) {
                float f4 = this.LJFF;
                float f5 = this.LJI;
                this.LJIIJ = (float) Math.sqrt((f4 * f4) + (f5 * f5));
            }
            this.LJIIJJI = f3 / this.LJIIJ;
        }
        return this.LJIIJJI;
    }

    public final void LIZLLL() {
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
        this.LJIILL = -1;
        this.LJIILLIIL = -1;
        this.LJIILJJIL = false;
    }

    public C21573919bt(InterfaceC21574019bu interfaceC21574019bu) {
        this.LIZ = interfaceC21574019bu;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.view.MotionEvent r8, android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21573919bt.LIZJ(android.view.MotionEvent, android.view.View):boolean");
    }

    public final void LJ(MotionEvent motionEvent, View view) {
        MotionEvent motionEvent2 = this.LIZLLL;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.LIZLLL = MotionEvent.obtain(motionEvent);
        this.LJIIIZ = -1.0f;
        this.LJIIJ = -1.0f;
        this.LJIIJJI = -1.0f;
        this.LJ.set(0.0f, 0.0f);
        MotionEvent motionEvent3 = this.LIZJ;
        int iFindPointerIndex = motionEvent3.findPointerIndex(this.LJIILL);
        int iFindPointerIndex2 = motionEvent3.findPointerIndex(this.LJIILLIIL);
        int iFindPointerIndex3 = motionEvent.findPointerIndex(this.LJIILL);
        int iFindPointerIndex4 = motionEvent.findPointerIndex(this.LJIILLIIL);
        if (iFindPointerIndex >= 0 && iFindPointerIndex2 >= 0 && iFindPointerIndex3 >= 0 && iFindPointerIndex4 >= 0) {
            float x = motionEvent3.getX(iFindPointerIndex);
            float y = motionEvent3.getY(iFindPointerIndex);
            float x2 = motionEvent3.getX(iFindPointerIndex2);
            float y2 = motionEvent3.getY(iFindPointerIndex2);
            float x3 = motionEvent.getX(iFindPointerIndex3);
            float y3 = motionEvent.getY(iFindPointerIndex3);
            float x4 = motionEvent.getX(iFindPointerIndex4) - x3;
            float y4 = motionEvent.getY(iFindPointerIndex4) - y3;
            this.LJ.set(x4, y4);
            this.LJFF = x2 - x;
            this.LJI = y2 - y;
            this.LJII = x4;
            this.LJIIIIZZ = y4;
            motionEvent.getEventTime();
            motionEvent3.getEventTime();
            this.LJIIL = motionEvent.getPressure(iFindPointerIndex3) + motionEvent.getPressure(iFindPointerIndex4);
            this.LJIILIIL = motionEvent3.getPressure(iFindPointerIndex) + motionEvent3.getPressure(iFindPointerIndex2);
            return;
        }
        this.LJIILJJIL = true;
        C355090Dw3.LIZLLL("ScaleGestureDetector", "Invalid MotionEvent stream detected.");
        if (this.LIZIZ) {
            this.LIZ.onScaleEnd();
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
