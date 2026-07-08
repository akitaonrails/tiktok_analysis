package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0GUD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUD extends LinearLayout {
    public int LL;

    public final int getCanMeasureExtra() {
        return this.LL;
    }

    public final void setCanMeasureExtra(int i) {
        this.LL = i;
    }

    public C0GUD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        int measuredWidth = 0;
        int iMax = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
            measuredWidth += childAt.getMeasuredWidth();
            iMax = Math.max(iMax, childAt.getMeasuredHeight());
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if ((mode == Integer.MIN_VALUE || mode == 1073741824) && measuredWidth < (i3 = size + this.LL)) {
            measuredWidth = i3;
        }
        setMeasuredDimension(measuredWidth, LinearLayout.resolveSize(iMax, i2));
    }
}
