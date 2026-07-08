package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Gbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C419060Gbw extends LinearLayout {
    public C419060Gbw() {
        throw null;
    }

    public C419060Gbw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        if (getOrientation() == 0 && View.MeasureSpec.getMode(i) == 1073741824) {
            int childCount = getChildCount();
            int i3 = 0;
            TextView textView = null;
            int i4 = 0;
            boolean z2 = false;
            int measuredWidth = 0;
            while (true) {
                z = true;
                if (i4 >= childCount || z2) {
                    break;
                }
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8) {
                    if (childAt instanceof TextView) {
                        TextView textView2 = (TextView) childAt;
                        if (textView2.getEllipsize() != null) {
                            if (textView == null) {
                                textView2.setMaxWidth(Integer.MAX_VALUE);
                                textView = textView2;
                            } else {
                                z2 = true;
                            }
                        }
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.weight <= 0.0f) {
                        z = false;
                    }
                    z2 |= z;
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                    measuredWidth += childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                }
                i4++;
            }
            if (textView != null && measuredWidth != 0) {
                z = false;
            }
            boolean z3 = z2 | z;
            int size = View.MeasureSpec.getSize(i);
            if (!z3 && measuredWidth > size) {
                int measuredWidth2 = textView.getMeasuredWidth() - (measuredWidth - size);
                if (measuredWidth2 >= 0) {
                    i3 = measuredWidth2;
                }
                textView.setMaxWidth(i3);
            }
        }
        super.onMeasure(i, i2);
    }

    public C419060Gbw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
