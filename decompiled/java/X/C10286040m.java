package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.040m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10286040m extends LinearLayout {
    public C10286040m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (getOrientation() == 1) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        for (View view : new C09RD(this)) {
            if (view.getVisibility() != 8) {
                measureChild(view, i, i2);
                int measuredWidth = view.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i3 = marginLayoutParams2.leftMargin;
                } else {
                    i3 = 0;
                }
                int i6 = measuredWidth + i3;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i4 = 0;
                }
                i5 += i6 + i4;
            }
        }
        if (i5 + getPaddingLeft() + getPaddingRight() > size) {
            setOrientation(1);
        }
        super.onMeasure(i, i2);
    }
}
