package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* JADX INFO: renamed from: X.0SXR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SXR extends HorizontalScrollView {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C0SXR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
