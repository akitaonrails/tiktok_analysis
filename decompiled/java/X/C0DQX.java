package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0DQX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQX extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent.getActionMasked() == 0 && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C0DQX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
