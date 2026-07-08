package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0DQW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQW extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C0DQW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
