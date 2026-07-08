package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Gmv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425870Gmv extends ViewGroup {
    public final List<View> LL;
    public boolean LLILLJJLI;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final int getVisibleViewCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setVisibleDependOnOrder(boolean z) {
        if (z != this.LLILLJJLI) {
            this.LLILLJJLI = z;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public C425870Gmv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILLJJLI = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingStart;
        int i3;
        int i4;
        int iMax;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 0) {
            paddingStart = Integer.MAX_VALUE;
        } else {
            paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        }
        int childCount = getChildCount();
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        int i7 = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (z) {
                    i3 = marginLayoutParams2.rightMargin;
                } else {
                    i3 = marginLayoutParams2.leftMargin;
                }
                int i9 = measuredWidth + i3;
                if (z) {
                    i4 = marginLayoutParams2.leftMargin;
                } else {
                    i4 = marginLayoutParams2.rightMargin;
                }
                int i10 = i9 + i4;
                if (marginLayoutParams != null) {
                    if (z) {
                        i5 = marginLayoutParams.leftMargin;
                        i6 = marginLayoutParams2.rightMargin;
                    } else {
                        i5 = marginLayoutParams.rightMargin;
                        i6 = marginLayoutParams2.leftMargin;
                    }
                    iMax = Math.max(i5, i6);
                } else {
                    iMax = 0;
                }
                if (i7 + iMax + i10 > paddingStart) {
                    if (this.LLILLJJLI) {
                        break;
                    }
                } else {
                    i7 += iMax + i10;
                    if (childAt instanceof TuxTextView) {
                        TextView textView = (TextView) childAt;
                        int baseline = textView.getBaseline();
                        if (baseline >= 0) {
                            iMax3 = Math.max(iMax3, marginLayoutParams2.topMargin + baseline);
                            iMax4 = Math.max(iMax4, (textView.getMeasuredHeight() - baseline) + marginLayoutParams2.bottomMargin);
                        } else {
                            iMax2 = Math.max(iMax2, textView.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
                        }
                    } else {
                        iMax2 = Math.max(iMax2, childAt.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
                    }
                    marginLayoutParams = marginLayoutParams2;
                }
            }
        }
        int paddingStart2 = i7 + getPaddingStart() + getPaddingEnd();
        int iMax5 = Math.max(iMax3 + iMax4, iMax2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = paddingStart2;
            }
        } else {
            size = Math.min(paddingStart2, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = iMax5 + getPaddingTop() + getPaddingBottom();
            }
        } else {
            size2 = Math.min(iMax5 + getPaddingTop() + getPaddingBottom(), size2);
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C425870Gmv.onLayout(boolean, int, int, int, int):void");
    }
}
