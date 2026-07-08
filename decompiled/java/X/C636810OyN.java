package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0OyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636810OyN extends FrameLayout {
    public boolean LL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LL) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setClickableEnabled(boolean z) {
        this.LL = z;
    }

    public C636810OyN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
