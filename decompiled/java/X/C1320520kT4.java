package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

/* JADX INFO: renamed from: X.0kT4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320520kT4 extends HorizontalScrollView {
    public boolean LL;

    private final int getOffset() {
        int width;
        View childAt = getChildAt(0);
        if (childAt == null || (width = childAt.getWidth()) <= 0) {
            return 0;
        }
        return width - getMeasuredWidth();
    }

    public final void setOnScrollEndListener(InterfaceC1320530kT5 interfaceC1320530kT5) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public C1320520kT4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (getOffset() - getScrollX() == 0) {
            if (!this.LL) {
                this.LL = true;
            }
        } else {
            if (!this.LL) {
                return;
            }
            this.LL = false;
        }
    }
}
