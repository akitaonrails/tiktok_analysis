package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: X.040l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10285040l extends LinearLayout {
    public C10285040l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (getOrientation() == 0) {
            int size = View.MeasureSpec.getSize(i);
            TextView textView = null;
            int i5 = 0;
            int i6 = 0;
            for (View view : new C09RD(this)) {
                if (view.getVisibility() != 8) {
                    if (textView == null && (view instanceof TextView)) {
                        textView = (TextView) view;
                    }
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        i3 = marginLayoutParams2.leftMargin;
                    } else {
                        i3 = 0;
                    }
                    int i7 = measuredWidth + i3;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        i4 = marginLayoutParams.rightMargin;
                    } else {
                        i4 = 0;
                    }
                    i6 += i7 + i4;
                }
            }
            int paddingLeft = i6 + getPaddingLeft() + getPaddingRight();
            if (paddingLeft > size && textView != null) {
                int measuredWidth2 = textView.getMeasuredWidth() - (paddingLeft - size);
                if (measuredWidth2 >= 0) {
                    i5 = measuredWidth2;
                }
                textView.setMaxWidth(i5);
            }
        }
        super.onMeasure(i, i2);
    }
}
