package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0hLV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200510hLV extends ConstraintLayout {
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

    public C1200510hLV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
