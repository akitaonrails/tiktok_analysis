package X;

import android.view.MotionEvent;
import com.ss.android.vesdk.VETouchPointer;
import r1k.a;

/* JADX INFO: renamed from: X.19qV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21664519qV extends AbstractC21664719qX {
    public boolean LJIIJJI() {
        return this instanceof a;
    }

    public void LJIILL(VETouchPointer vETouchPointer, int i) {
    }

    @Override // X.InterfaceC21645719nT
    public final void onTouchEvent(MotionEvent motionEvent) {
        LJIILJJIL(motionEvent, 0);
    }

    @Override // X.InterfaceC21645719nT
    public void LIZJ(MotionEvent motionEvent, int[] iArr) {
        LJIILIIL(motionEvent, iArr);
    }

    @Override // X.InterfaceC21645719nT
    public void LJI(MotionEvent motionEvent, int[] iArr) {
        LJIILIIL(motionEvent, iArr);
    }

    @Override // X.InterfaceC21645719nT
    public void LJII(MotionEvent motionEvent, int[] iArr) {
        LJIILIIL(motionEvent, iArr);
    }

    @Override // X.InterfaceC21645719nT
    public void LJIIIIZZ(MotionEvent motionEvent, int[] iArr) {
        LJIILIIL(motionEvent, iArr);
    }

    @Override // X.InterfaceC21645719nT
    public void LJIIJ(MotionEvent motionEvent, int[] iArr) {
        LJIILIIL(motionEvent, iArr);
    }

    public final void LJIILIIL(MotionEvent motionEvent, int[] iArr) {
        if (!LJIIJJI() || motionEvent.getPointerCount() != 2) {
            return;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(motionEvent.getX() + iArr[0], motionEvent.getY() + iArr[1]);
        LJIILJJIL(motionEventObtain, 1);
    }

    public final void LJIILJJIL(MotionEvent motionEvent, int i) {
        int action = motionEvent.getAction() & 255;
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > i) {
            pointerCount -= i;
        }
        VETouchPointer vETouchPointer = new VETouchPointer();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                vETouchPointer.setEvent(VETouchPointer.TouchEvent.ENDED);
                                LJIIL(vETouchPointer, motionEvent, (motionEvent.getAction() & 65280) >> 8);
                                LJIILL(vETouchPointer, pointerCount);
                                return;
                            }
                            return;
                        }
                        vETouchPointer.setEvent(VETouchPointer.TouchEvent.BEGAN);
                        LJIIL(vETouchPointer, motionEvent, (motionEvent.getAction() & 65280) >> 8);
                        LJIILL(vETouchPointer, pointerCount);
                        return;
                    }
                    vETouchPointer.setEvent(VETouchPointer.TouchEvent.CANCELED);
                    LJIIL(vETouchPointer, motionEvent, 0);
                    LJIILL(vETouchPointer, pointerCount);
                    return;
                }
                vETouchPointer.setEvent(VETouchPointer.TouchEvent.MOVED);
                if (i < 0 || i >= motionEvent.getPointerCount()) {
                    i = 0;
                }
                while (i < motionEvent.getPointerCount()) {
                    LJIIL(vETouchPointer, motionEvent, i);
                    LJIILL(vETouchPointer, pointerCount);
                    i++;
                }
                return;
            }
            vETouchPointer.setEvent(VETouchPointer.TouchEvent.ENDED);
            LJIIL(vETouchPointer, motionEvent, 0);
            LJIILL(vETouchPointer, pointerCount);
            return;
        }
        vETouchPointer.setEvent(VETouchPointer.TouchEvent.BEGAN);
        LJIIL(vETouchPointer, motionEvent, 0);
        LJIILL(vETouchPointer, pointerCount);
    }

    public static final void LJIIL(VETouchPointer vETouchPointer, MotionEvent motionEvent, int i) {
        int pointerId = motionEvent.getPointerId(i);
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        vETouchPointer.setForce(motionEvent.getPressure(i));
        vETouchPointer.setPointerId(pointerId);
        vETouchPointer.setX(x);
        vETouchPointer.setY(y);
        vETouchPointer.setMajorRadius(30.0f);
    }
}
