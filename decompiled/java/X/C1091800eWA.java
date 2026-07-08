package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0eWA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091800eWA extends ConstraintLayout {
    public Integer LL;

    public final Integer getCustomMaxWidth() {
        return this.LL;
    }

    public final void setCustomMaxWidth(Integer num) {
        this.LL = num;
    }

    public C1091800eWA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer num = this.LL;
        if (num == null) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(num.intValue(), Integer.MIN_VALUE), i2);
        }
    }
}
