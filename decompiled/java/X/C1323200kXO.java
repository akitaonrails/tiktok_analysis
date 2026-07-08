package X;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0kXO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323200kXO extends C21578619ce {
    public boolean LL;

    public C1323200kXO(Context context) {
        super(context);
        this.LL = true;
        setVerticalScrollBarEnabled(true);
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.C21578619ce, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setScrollBarVisible(boolean z) {
        setVerticalScrollBarEnabled(z);
        if (z) {
            awakenScrollBars();
        }
        invalidate();
    }

    public final void setScrollEnabled(boolean z) {
        this.LL = z;
    }
}
