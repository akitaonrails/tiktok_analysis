package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C782270UmP extends C21538419Qw {
    public int LLILZIL;

    public void setLayoutStyle(int i) {
        this.LLILZIL = i;
        if (i == 1) {
            setRadius(getContext().getResources().getDimensionPixelSize(R.dimen.a4f));
        }
        if (!isLayoutRequested()) {
            requestLayout();
        }
    }

    public C782270UmP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLILZIL;
        if (i3 == 0) {
            int size = View.MeasureSpec.getSize(i);
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.a47);
            if (size > 0) {
                size = Math.min(dimensionPixelSize, (int) (size * 0.8f));
            }
            int size2 = View.MeasureSpec.getSize(i2);
            int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.a48);
            if (size2 > 0) {
                size2 = Math.min(dimensionPixelSize2, (int) (size2 * 0.84f));
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(size2, View.MeasureSpec.getMode(i2)));
            return;
        }
        if (i3 == 1) {
            int size3 = View.MeasureSpec.getSize(i);
            int dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(R.dimen.a49);
            int dimensionPixelSize4 = getContext().getResources().getDimensionPixelSize(R.dimen.a5j);
            if (size3 > 0) {
                int i4 = dimensionPixelSize4 * 2;
                if (size3 > dimensionPixelSize3 + i4) {
                    size3 = dimensionPixelSize3;
                } else {
                    size3 -= i4;
                }
            }
            int size4 = View.MeasureSpec.getSize(i2);
            int dimensionPixelSize5 = getContext().getResources().getDimensionPixelSize(R.dimen.a48);
            if (size4 > 0) {
                size4 = Math.min(dimensionPixelSize5, (int) (size4 * 0.8f));
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size3, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(size4, View.MeasureSpec.getMode(i2)));
            return;
        }
        int size5 = View.MeasureSpec.getSize(i);
        int dimensionPixelSize6 = getContext().getResources().getDimensionPixelSize(R.dimen.a49);
        int dimensionPixelSize7 = getContext().getResources().getDimensionPixelSize(R.dimen.a5j);
        if (size5 > 0) {
            int i5 = dimensionPixelSize7 * 2;
            if (size5 > dimensionPixelSize6 + i5) {
                size5 -= getContext().getResources().getDimensionPixelSize(R.dimen.a5g) * 2;
            } else {
                size5 -= i5;
            }
        }
        int size6 = View.MeasureSpec.getSize(i2);
        int dimensionPixelSize8 = getContext().getResources().getDimensionPixelSize(R.dimen.a48);
        if (size6 > 0) {
            size6 = Math.min(dimensionPixelSize8, (int) (size6 * 0.8f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size5, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(size6, View.MeasureSpec.getMode(i2)));
    }
}
