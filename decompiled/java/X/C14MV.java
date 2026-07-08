package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.14MV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14MV extends ViewGroup {
    public int LL;

    @Override // android.view.View
    public int getBaseline() {
        return this.LL;
    }

    public C14MV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        int iMax3 = -1;
        int iMax4 = -1;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    iMax3 = Math.max(iMax3, baseline);
                    iMax4 = Math.max(iMax4, childAt.getMeasuredHeight() - baseline);
                }
                iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        if (iMax3 != -1) {
            iMax = Math.max(iMax, Math.max(iMax4, getPaddingBottom()) + iMax3);
            this.LL = iMax3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax2, getSuggestedMinimumWidth()), i, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int baseline;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i3 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                if (this.LL != -1 && childAt.getBaseline() != -1) {
                    baseline = (this.LL + paddingTop) - childAt.getBaseline();
                } else {
                    baseline = paddingTop;
                }
                childAt.layout(i6, baseline, measuredWidth + i6, measuredHeight + baseline);
            }
        }
    }
}
