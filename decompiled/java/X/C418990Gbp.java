package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0Gbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418990Gbp extends LinearLayout {
    public C418990Gbp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        int measuredWidth = 0;
        int iMax = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            if (i4 != 0) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8) {
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    measuredWidth += childAt.getMeasuredWidth() + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
                    iMax = Math.max(iMax, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                }
            }
        }
        View childAt2 = getChildAt(0);
        if (childAt2.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
            int paddingStart = ((((size - measuredWidth) - getPaddingStart()) - getPaddingEnd()) - marginLayoutParams2.getMarginStart()) - marginLayoutParams2.getMarginEnd();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
            if (paddingStart < iLIZIZ) {
                paddingStart = iLIZIZ;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingStart, Integer.MIN_VALUE);
            i3 = 8;
            measureChildWithMargins(childAt2, iMakeMeasureSpec, 0, i2, 0);
            iMax = Math.max(iMax, childAt2.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
        } else {
            i3 = 8;
        }
        int paddingStart2 = getPaddingStart() + getPaddingEnd();
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3.getVisibility() != i3) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) childAt3.getLayoutParams();
                paddingStart2 += childAt3.getMeasuredWidth() + marginLayoutParams3.getMarginStart() + marginLayoutParams3.getMarginEnd();
            }
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = paddingStart2;
            }
        } else {
            size = Math.min(paddingStart2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0 || mode2 != 1073741824) {
                int paddingTop = iMax + getPaddingTop();
                int paddingBottom = getPaddingBottom();
                size2 = paddingTop + paddingBottom;
            }
        } else {
            size2 = Math.min(iMax + getPaddingTop() + getPaddingBottom(), size2);
        }
        setMeasuredDimension(size, size2);
    }

    public C418990Gbp(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setOrientation(0);
        setGravity(16);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart;
        int measuredWidth;
        if (getChildCount() == 0) {
            return;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = ((i4 - i2) - getPaddingBottom()) - paddingTop;
        if (getLayoutDirection() == 1) {
            paddingStart = getWidth() - getPaddingEnd();
        } else {
            paddingStart = getPaddingStart();
        }
        int childCount = getChildCount();
        int marginEnd = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = marginLayoutParams.topMargin;
                int i7 = ((((paddingBottom - measuredHeight) - i6) - marginLayoutParams.bottomMargin) / 2) + paddingTop + i6;
                int i8 = measuredHeight + i7;
                if (getLayoutDirection() == 1) {
                    int marginStart = paddingStart - (marginEnd + marginLayoutParams.getMarginStart());
                    measuredWidth = marginStart - childAt.getMeasuredWidth();
                    childAt.layout(measuredWidth, i7, marginStart, i8);
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    int marginStart2 = paddingStart + marginEnd + marginLayoutParams.getMarginStart();
                    measuredWidth = childAt.getMeasuredWidth() + marginStart2;
                    childAt.layout(marginStart2, i7, measuredWidth, i8);
                    marginEnd = marginLayoutParams.getMarginEnd();
                }
                paddingStart = measuredWidth;
            }
        }
    }
}
