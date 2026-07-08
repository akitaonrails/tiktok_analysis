package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Snu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C732240Snu extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1616450sAN.LIZ(motionEvent, this);
        return super.dispatchTouchEvent(motionEvent);
    }

    public C732240Snu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public C732240Snu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
