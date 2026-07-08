package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0kRT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319530kRT extends C19U1 {
    public int LL;
    public boolean LLILLJJLI;

    public final int getMaxScrollXOffset() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 2 && this.LLILLJJLI && (getScrollX() >= this.LL || getScrollX() <= 0)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setMaxScrollXOffset(int i) {
        this.LL = i;
    }

    public final void setNewGesture(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setNewGestureEnable(boolean z) {
        this.LLILLJJLI = z;
    }

    public C1319530kRT(Context context, AttributeSet attributeSet) {
        new LinkedHashMap();
        super(context, attributeSet);
        this.LL = Integer.MAX_VALUE;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() > 0) {
            this.LL = getChildAt(0).getWidth() - getWidth();
        }
    }
}
