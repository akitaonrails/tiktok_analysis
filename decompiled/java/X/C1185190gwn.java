package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0gwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185190gwn extends FrameLayout {
    public int LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setEventConsumeMode(int i) {
        if (i != 0 && i != 1 && i != 2) {
            i = 0;
        }
        this.LL = i;
    }

    public C1185190gwn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
