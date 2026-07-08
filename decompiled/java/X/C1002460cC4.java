package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0cC4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002460cC4 extends FrameLayout {
    public boolean LL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInterceptTouchEvent(boolean z) {
        this.LL = z;
    }

    public C1002460cC4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
