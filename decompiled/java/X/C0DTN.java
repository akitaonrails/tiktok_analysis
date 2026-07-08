package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0DTN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DTN extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C0DTN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
