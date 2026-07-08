package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GUC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUC extends LinearLayout {
    public int LL;

    public final int getExpectedEmptyHeightPx() {
        return this.LL;
    }

    public final void setExpectedEmptyHeightPx(int i) {
        if (this.LL != i) {
            this.LL = i;
            if (getMeasuredHeight() <= getPaddingTop() + getPaddingBottom() && getVisibility() != 8) {
                requestLayout();
            }
        }
    }

    public C0GUC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f)));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UserInfoLayout);
        setExpectedEmptyHeightPx((int) typedArrayObtainStyledAttributes.getDimension(R$styleable.UserInfoLayout_expectedEmptyHeight, 16.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && getMeasuredHeight() <= getPaddingTop() + getPaddingBottom() && getVisibility() != 8) {
            setMeasuredDimension(getMeasuredWidth(), this.LL);
        }
    }
}
