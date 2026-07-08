package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.11rI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19631011rI extends C0I7D {
    public boolean LLIZ;

    public final boolean getCanTouchMoved() {
        return this.LLIZ;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLIZ) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCanTouchMoved(boolean z) {
        this.LLIZ = z;
    }

    public final void setMode(boolean z) {
        this.LLIZ = z;
    }

    public C19631011rI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
    }
}
