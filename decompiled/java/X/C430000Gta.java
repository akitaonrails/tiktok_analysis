package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Gta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430000Gta extends LinearLayout {
    public int LL;

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        this.LL = 0;
    }

    public final boolean LIZ(C19M4 c19m4) {
        int measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        c19m4.measure(0, 0);
        ViewGroup.LayoutParams layoutParams = c19m4.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            measuredWidth = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + c19m4.getMeasuredWidth();
        } else {
            measuredWidth = c19m4.getMeasuredWidth();
        }
        if (this.LL + measuredWidth > getMeasuredWidth()) {
            return false;
        }
        this.LL += measuredWidth;
        addView(c19m4);
        return true;
    }

    public C430000Gta(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        TextView textView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 1; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                width = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + childAt.getWidth();
            } else {
                width = childAt.getWidth();
            }
            int i7 = width + i5;
            if (i7 <= getWidth()) {
                if ((childAt instanceof TextView) && (textView = (TextView) childAt) != null && textView.getLayout() != null) {
                    int lineCount = textView.getLayout().getLineCount();
                    for (int i8 = 0; i8 < lineCount; i8++) {
                        if (textView.getLayout().getEllipsisCount(i8) > 0) {
                            C786410Ut5.LJLLLLLL(8, childAt);
                            break;
                            break;
                        }
                    }
                }
                C786410Ut5.LJLLLLLL(0, childAt);
                i5 = i7;
            } else {
                C786410Ut5.LJLLLLLL(8, childAt);
                break;
            }
        }
    }
}
