package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0GbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418610GbD extends LinearLayout {
    public boolean LL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setMode(boolean z) {
        this.LL = z;
    }

    public C418610GbD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
