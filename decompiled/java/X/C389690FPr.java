package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0FPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389690FPr extends ConstraintLayout {
    public int LL;

    public C389690FPr() {
        throw null;
    }

    public final int getEnforcedMinHeightPx() {
        return this.LL;
    }

    public final void setEnforcedMinHeightPx(int i) {
        if (this.LL != i) {
            this.LL = i;
            requestLayout();
        }
    }

    public C389690FPr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin;
        super.onMeasure(i, i2);
        if (this.LL > 0 && getMeasuredHeight() < this.LL) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    return;
                } else {
                    iMin = this.LL;
                }
            } else {
                iMin = Math.min(this.LL, size);
            }
            if (iMin > getMeasuredHeight()) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
            }
        }
    }
}
