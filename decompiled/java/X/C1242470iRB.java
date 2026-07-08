package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0iRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242470iRB extends LinearLayout {
    public boolean LL;

    public C1242470iRB(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL && motionEvent != null && motionEvent.getAction() == 1) {
            performClick();
            this.LL = false;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFold(boolean z) {
        this.LL = z;
    }
}
