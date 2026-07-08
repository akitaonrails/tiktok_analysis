package X;

import android.view.MotionEvent;
import com.ss.android.vesdk.VETouchPointer;

/* JADX INFO: renamed from: X.19qU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21664419qU extends C0FUM {
    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public void onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int pointerCount = motionEvent.getPointerCount();
        VETouchPointer vETouchPointer = new VETouchPointer();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                vETouchPointer.setEvent(VETouchPointer.TouchEvent.ENDED);
                                LJJIJIL(vETouchPointer, motionEvent, (motionEvent.getAction() & 65280) >> 8);
                                return;
                            }
                            return;
                        }
                        vETouchPointer.setEvent(VETouchPointer.TouchEvent.BEGAN);
                        LJJIJIL(vETouchPointer, motionEvent, (motionEvent.getAction() & 65280) >> 8);
                        return;
                    }
                    vETouchPointer.setEvent(VETouchPointer.TouchEvent.CANCELED);
                    LJJIJIL(vETouchPointer, motionEvent, 0);
                    return;
                }
                vETouchPointer.setEvent(VETouchPointer.TouchEvent.MOVED);
                for (int i = 0; i < pointerCount; i++) {
                    LJJIJIL(vETouchPointer, motionEvent, i);
                }
                return;
            }
            vETouchPointer.setEvent(VETouchPointer.TouchEvent.ENDED);
            LJJIJIL(vETouchPointer, motionEvent, 0);
            return;
        }
        vETouchPointer.setEvent(VETouchPointer.TouchEvent.BEGAN);
        LJJIJIL(vETouchPointer, motionEvent, 0);
    }

    public static final void LJJIJIL(VETouchPointer vETouchPointer, MotionEvent motionEvent, int i) {
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
