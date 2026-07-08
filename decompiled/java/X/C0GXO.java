package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0GXO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GXO extends ConstraintLayout {
    public C0GXO() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public C0GXO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
