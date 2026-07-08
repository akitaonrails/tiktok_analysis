package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.19bM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21570619bM {
    public final ScaleGestureDetector LIZ;
    public final GestureDetector LIZIZ;
    public final GestureDetectorOnGestureListenerC21571019bQ LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public MotionEvent LJFF;

    public C21570619bM(Context context, C21570519bL c21570519bL) {
        GestureDetector.OnGestureListener onGestureListener = new GestureDetector.OnGestureListener() { // from class: X.19bR
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                GestureDetectorOnGestureListenerC21571019bQ gestureDetectorOnGestureListenerC21571019bQ = this.LL.LIZJ;
                if (gestureDetectorOnGestureListenerC21571019bQ != null) {
                    return gestureDetectorOnGestureListenerC21571019bQ.onDown(motionEvent);
                }
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                GestureDetectorOnGestureListenerC21571019bQ gestureDetectorOnGestureListenerC21571019bQ = this.LL.LIZJ;
                if (gestureDetectorOnGestureListenerC21571019bQ != null) {
                    gestureDetectorOnGestureListenerC21571019bQ.onLongPress(motionEvent);
                }
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                GestureDetectorOnGestureListenerC21571019bQ gestureDetectorOnGestureListenerC21571019bQ = this.LL.LIZJ;
                if (gestureDetectorOnGestureListenerC21571019bQ != null) {
                    gestureDetectorOnGestureListenerC21571019bQ.onScroll(motionEvent, motionEvent2, f, f2);
                    return true;
                }
                return false;
            }
        };
        ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener = new ScaleGestureDetector.OnScaleGestureListener() { // from class: X.19bT
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                return false;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                MotionEvent motionEvent = this.LL.LJFF;
                if (motionEvent == null || motionEvent.getPointerCount() > 1) {
                    return true;
                }
                return false;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }
        };
        this.LIZJ = c21570519bL;
        GestureDetector gestureDetector = new GestureDetector(context, onGestureListener);
        this.LIZIZ = gestureDetector;
        gestureDetector.setOnDoubleTapListener(c21570519bL);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, onScaleGestureListener);
        this.LIZ = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        try {
            Field declaredField = ScaleGestureDetector.class.getDeclaredField("mMinSpan");
            declaredField.setAccessible(true);
            declaredField.set(scaleGestureDetector, 1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
