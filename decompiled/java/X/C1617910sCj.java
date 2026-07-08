package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0sCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1617910sCj extends ConstraintLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1616450sAN.LIZ(motionEvent, this);
        return super.dispatchTouchEvent(motionEvent);
    }

    public C1617910sCj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public C1617910sCj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
