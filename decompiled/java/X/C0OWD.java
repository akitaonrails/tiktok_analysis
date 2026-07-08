package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0OWD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OWD extends FrameLayout {
    public boolean LL;

    public final boolean getInterceptAllTouches() {
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInterceptAllTouches(boolean z) {
        this.LL = z;
    }

    public C0OWD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
