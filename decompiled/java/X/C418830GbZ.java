package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0GbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418830GbZ extends RelativeLayout {
    public Integer LL;

    public final void setCustomMaxHeightPx(int i) {
        Integer num = this.LL;
        if (num == null || num.intValue() != i) {
            this.LL = Integer.valueOf(i);
            invalidate();
        }
    }

    public C418830GbZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        Integer num = this.LL;
        if (num != null) {
            int iIntValue = num.intValue();
            if (measuredHeight <= iIntValue) {
                iIntValue = measuredHeight;
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (numValueOf != null && numValueOf.intValue() != measuredHeight) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(numValueOf.intValue(), 1073741824));
                setMeasuredDimension(getMeasuredWidth(), numValueOf.intValue());
            }
        }
    }
}
