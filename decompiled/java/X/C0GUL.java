package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0GUL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUL extends ConstraintLayout {
    public C0GUL() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public C0GUL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
