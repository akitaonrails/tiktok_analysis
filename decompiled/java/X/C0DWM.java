package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.0DWM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWM extends ViewOnAttachStateChangeListenerC20604515jv {
    public boolean LLILZ;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int top;
        if (motionEvent != null && this.LLILZ) {
            float y = motionEvent.getY();
            View childAt = getChildAt(0);
            if (childAt != null) {
                top = childAt.getTop();
            } else {
                top = -1;
            }
            if (y < top) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C0DWM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0DWM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
