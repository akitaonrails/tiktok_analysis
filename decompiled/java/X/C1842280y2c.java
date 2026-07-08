package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0y2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842280y2c extends C0I7D {
    public boolean LLIZ;

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLIZ) {
            System.currentTimeMillis();
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setMode(boolean z) {
        this.LLIZ = z;
    }

    public C1842280y2c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
