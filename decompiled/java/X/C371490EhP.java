package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0EhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371490EhP extends RelativeLayout {
    public C371490EhP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount < 1) {
            return;
        }
        int i3 = 0;
        int iMax = 0;
        do {
            iMax = Math.max(iMax, getChildAt(i3).getMeasuredWidth());
            i3++;
        } while (i3 < childCount);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMax + getPaddingLeft() + getPaddingRight(), 1073741824), i2);
    }
}
