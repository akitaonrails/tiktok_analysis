package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.19oS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21651819oS extends FrameLayout {
    public InterfaceC1747020vYy LL;
    public float LLILLJJLI;
    public final float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public final ScaleGestureDetector LLIZ;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1 || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            this.LLIZ.onTouchEvent(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setMap(InterfaceC1747020vYy interfaceC1747020vYy) {
        this.LL = interfaceC1747020vYy;
    }

    public C21651819oS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = 19.0f;
        this.LLILLL = 6.0f;
        this.LLILZ = 19.0f;
        this.LLIZ = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: X.19oT
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                C21651819oS c21651819oS = this.LL;
                float f = c21651819oS.LLILZIL;
                InterfaceC1747020vYy interfaceC1747020vYy = c21651819oS.LL;
                if (f > 0.0f && interfaceC1747020vYy != null) {
                    float fLog = (float) (Math.log(scaleGestureDetector.getCurrentSpan() / f) / Math.log(2.0d));
                    C21651819oS c21651819oS2 = this.LL;
                    float f2 = c21651819oS2.LLILZ + fLog;
                    float f3 = c21651819oS2.LLILLL;
                    if (f2 < f3) {
                        f2 = f3;
                    }
                    if (Math.abs(f2 - c21651819oS2.LLILLJJLI) < 0.1f) {
                        return true;
                    }
                    this.LL.LLILLJJLI = f2;
                    interfaceC1747020vYy.LIZ(f2);
                    return true;
                }
                return false;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                C21651819oS c21651819oS = this.LL;
                c21651819oS.LLILZLL = true;
                c21651819oS.LLILZ = c21651819oS.LLILLJJLI;
                c21651819oS.LLILZIL = scaleGestureDetector.getCurrentSpan();
                return true;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                this.LL.LLILZLL = false;
            }
        });
    }
}
