package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0GTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416060GTc extends FrameLayout {
    public int LL;
    public int LLILLJJLI;

    public final void setMaxHeightCompat(int i) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        if (this.LLILLJJLI != i) {
            this.LLILLJJLI = i;
            if (getHeight() > this.LLILLJJLI) {
                requestLayout();
            }
        }
    }

    public final void setMinHeightCompat(int i) {
        if (this.LL != i) {
            this.LL = i;
            if (getHeight() < this.LL) {
                requestLayout();
            }
        }
    }

    public C416060GTc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = Integer.MAX_VALUE;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0 && (i3 = this.LLILLJJLI) != Integer.MAX_VALUE) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, this.LLILLJJLI), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        int iMin = Math.min(Math.max(getMeasuredHeight(), this.LL), this.LLILLJJLI);
        if (iMin != getMeasuredHeight()) {
            setMeasuredDimension(getMeasuredWidth(), iMin);
        }
    }
}
