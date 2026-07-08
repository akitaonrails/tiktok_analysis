package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.12XM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12XM extends FrameLayout {
    public boolean LL;

    public final boolean getIntercept() {
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setIntercept(boolean z) {
        this.LL = z;
    }

    public C12XM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
