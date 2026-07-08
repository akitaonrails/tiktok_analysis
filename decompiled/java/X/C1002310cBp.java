package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0cBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002310cBp extends FrameLayout {
    public boolean LL;

    public final boolean getIntercept() {
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setIntercept(boolean z) {
        this.LL = z;
    }

    public C1002310cBp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
