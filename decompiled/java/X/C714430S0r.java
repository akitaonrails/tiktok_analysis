package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0S0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714430S0r extends C21599719g3 {
    public boolean LLLLZI;

    public C714430S0r() {
        throw null;
    }

    public final boolean getAllowScroll() {
        return this.LLLLZI;
    }

    @Override // X.C21600219g8, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLLLZI) {
            return super.canScrollHorizontally(i);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLLLZI) {
            return super.canScrollVertically(i);
        }
        return false;
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLLLZI) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLLLZI) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setAllowScroll(boolean z) {
        this.LLLLZI = z;
    }

    public C714430S0r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLZI = true;
    }
}
