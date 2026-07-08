package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0GXL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXL extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent != null && motionEvent.getAction() == 0) {
            requestDisallowInterceptTouchEvent(true);
        }
        return zDispatchTouchEvent;
    }

    public C0GXL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
