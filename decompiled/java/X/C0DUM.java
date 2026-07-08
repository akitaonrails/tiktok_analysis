package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DUM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DUM extends RecyclerView {
    public float LL;
    public float LLILLJJLI;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                if (Math.abs(motionEvent.getX() - this.LL) > Math.abs(motionEvent.getY() - this.LLILLJJLI)) {
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        } else {
            this.LL = motionEvent.getX();
            this.LLILLJJLI = motionEvent.getY();
            ViewParent parent3 = getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C0DUM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
