package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0FWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391430FWj extends C0I7D {
    public boolean LLIZ;

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLIZ) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setMode(boolean z) {
        this.LLIZ = z;
    }

    public C391430FWj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
    }
}
