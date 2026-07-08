package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0DQZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQZ extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.999f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C0DQZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
