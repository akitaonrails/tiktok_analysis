package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0Gav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418430Gav extends C419060Gbw {
    public int LL;
    public float LLILLJJLI;

    public C418430Gav(Context context) {
        this(context, null, 6);
    }

    public C418430Gav(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int LIZ() {
        int width;
        float fLIZJ;
        if (this.LL > 0) {
            width = getWidth() + this.LL;
            if (width <= 0) {
                return 0;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            int i = this.LL;
            this.LL = 0;
            measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            fLIZJ = LIZJ();
            this.LL = i;
            measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        } else {
            width = getWidth();
            if (width <= 0) {
                return 0;
            }
            fLIZJ = LIZJ();
        }
        Context context = getContext();
        float f = width - fLIZJ;
        if (f < 0.0f) {
            f = 0.0f;
        }
        return C418440Gaw.LJFF(f, context);
    }

    public final float LIZJ() {
        int childCount = getChildCount();
        float measuredWidth = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                measuredWidth += childAt.getMeasuredWidth() + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
            }
        }
        return measuredWidth;
    }

    public final void LIZIZ(float f) {
        if (f == this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = f;
        if (!isLayoutRequested()) {
            postOnAnimation(new ARunnableS106S0100000_6((Object) this, 243));
        }
    }

    @Override // X.C419060Gbw, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        if (this.LL > 0) {
            int size = View.MeasureSpec.getSize(i) - this.LL;
            if (size >= 0) {
                i3 = size;
            }
            i = View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i));
        } else {
            float f = 0.0f;
            if (this.LLILLJJLI != 0.0f) {
                if (getLayoutDirection() == 1) {
                    i3 = 1;
                }
                float f2 = this.LLILLJJLI;
                if (i3 == 0) {
                    f2 = -f2;
                }
                float size2 = View.MeasureSpec.getSize(i) + f2;
                if (size2 >= 0.0f) {
                    f = size2;
                }
                i = View.MeasureSpec.makeMeasureSpec((int) f, View.MeasureSpec.getMode(i));
            }
        }
        super.onMeasure(i, i2);
    }

    public C418430Gav(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
