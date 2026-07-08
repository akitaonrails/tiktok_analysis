package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0GUG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUG extends LinearLayout {
    public int LL;

    public final int getMaxHeight() {
        return this.LL;
    }

    public final void setMaxHeight(int i) {
        if (this.LL != i) {
            this.LL = i;
            requestLayout();
        }
    }

    public C0GUG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = Integer.MAX_VALUE;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.LL, Integer.MIN_VALUE);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.LL), mode);
        }
        super.onMeasure(i, iMakeMeasureSpec);
    }
}
