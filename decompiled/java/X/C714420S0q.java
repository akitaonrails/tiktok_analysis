package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0S0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714420S0q extends C21599719g3 {
    public boolean LLLLZI;

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

    public final void setUserInputEnabled(boolean z) {
        this.LLLLZI = z;
    }

    public C714420S0q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLZI = true;
    }
}
