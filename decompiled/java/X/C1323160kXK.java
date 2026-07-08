package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* JADX INFO: renamed from: X.0kXK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323160kXK extends HorizontalScrollView {
    public boolean LL;

    public C1323160kXK(Context context) {
        super(context);
        this.LL = true;
        setHorizontalScrollBarEnabled(true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setScrollBarVisible(boolean z) {
        setHorizontalScrollBarEnabled(z);
        if (z) {
            awakenScrollBars();
        }
        invalidate();
    }

    public final void setScrollEnabled(boolean z) {
        this.LL = z;
    }
}
