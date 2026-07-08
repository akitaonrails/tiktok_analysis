package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import zoo.b;

/* JADX INFO: renamed from: X.19nT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC21645719nT {
    boolean E2(C21645419nQ c21645419nQ);

    void LIZ();

    boolean LIZIZ(MotionEvent motionEvent);

    void LIZJ(MotionEvent motionEvent, int[] iArr);

    boolean LIZLLL();

    boolean LJ();

    void LJFF(b bVar);

    void LJI(MotionEvent motionEvent, int[] iArr);

    void LJII(MotionEvent motionEvent, int[] iArr);

    void LJIIIIZZ(MotionEvent motionEvent, int[] iArr);

    boolean LJIIIZ(float f);

    void LJIIJ(MotionEvent motionEvent, int[] iArr);

    boolean LJJLIIIJLJLI(float f);

    boolean LLLLJI(float f);

    boolean LLLLLLLLL(b bVar, float f, float f2);

    boolean LLLZLZ(b bVar);

    boolean onDown(MotionEvent motionEvent);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onScale(ScaleGestureDetector scaleGestureDetector);

    boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector);

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onSingleTapConfirmed(MotionEvent motionEvent);

    boolean onSingleTapUp(MotionEvent motionEvent);

    void onTouchEvent(MotionEvent motionEvent);

    boolean onUp(MotionEvent motionEvent);
}
