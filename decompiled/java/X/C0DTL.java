package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0DTL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DTL extends C21578619ce {
    public float LL;
    public float LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                if (Math.abs(rawX - this.LL) + 0.0f >= Math.abs(rawY - this.LLILLJJLI) + 0.0f) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.LL = rawX;
                this.LLILLJJLI = rawY;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C0DTL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1.0f;
        this.LLILLJJLI = -1.0f;
    }
}
