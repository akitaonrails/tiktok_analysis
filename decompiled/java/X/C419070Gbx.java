package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419070Gbx extends LinearLayout {
    public C419070Gbx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getOrientation() == 0 && View.MeasureSpec.getMode(i) == 1073741824) {
            int childCount = getChildCount();
            TextView textView = null;
            int measuredWidth = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8) {
                    if (childAt instanceof TextView) {
                        TextView textView2 = (TextView) childAt;
                        if (Intrinsics.LJFF(textView2.getTag(), "manual_ellipsize") && textView == null) {
                            textView2.setMaxWidth(Integer.MAX_VALUE);
                            textView = textView2;
                        }
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                    measuredWidth += childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                }
            }
            if (textView != null && measuredWidth != 0) {
                int size = View.MeasureSpec.getSize(i);
                if (measuredWidth < size) {
                    textView.setEllipsize(null);
                } else {
                    textView.setMaxWidth(textView.getMeasuredWidth() - (measuredWidth - size));
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
        }
        setMeasuredDimension(getMeasuredWidthAndState(), getMeasuredHeightAndState());
        super.onMeasure(i, i2);
    }
}
