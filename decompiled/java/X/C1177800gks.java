package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: X.0gks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177800gks extends RelativeLayout {
    public BottomSheetBehavior<?> LL;
    public Double LLILLJJLI;
    public Integer LLILLL;
    public Integer LLILZ;
    public Double LLILZIL;
    public Double LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C1177870gkz LLJIJIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<?> bottomSheetBehavior = this.LL;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.removeBottomSheetCallback(this.LLJIJIL);
        }
    }

    public final BottomSheetBehavior<?> getBehavior() {
        return this.LL;
    }

    public final Double getInitHeightRatio() {
        return this.LLILZLL;
    }

    public final Integer getMaxHeight() {
        return this.LLILLL;
    }

    public final Double getMaxHeightRatio() {
        return this.LLILLJJLI;
    }

    public final Integer getPeekHeight() {
        return this.LLILZ;
    }

    public final Double getPeekHeightRatio() {
        return this.LLILZIL;
    }

    public final int getRealMaxHeight() {
        return this.LLIZ;
    }

    public final int getRealPeekHeight() {
        return this.LLIZLLLIL;
    }

    public final void setBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(this.LLJIJIL);
        }
        this.LL = bottomSheetBehavior;
    }

    public final void setInitHeightRatio(Double d) {
        this.LLILZLL = d;
    }

    public final void setMaxHeight(Integer num) {
        this.LLILLL = num;
    }

    public final void setMaxHeightRatio(Double d) {
        this.LLILLJJLI = d;
    }

    public final void setPeekHeight(Integer num) {
        this.LLILZ = num;
    }

    public final void setPeekHeightRatio(Double d) {
        this.LLILZIL = d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0gkz] */
    public C1177800gks(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJ = true;
        this.LLJIJIL = new AbstractC1177930gl5() { // from class: X.0gkz
            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view) {
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f) {
                C1177800gks c1177800gks = this.LIZ;
                if (c1177800gks.LLJ) {
                    c1177800gks.LLJ = false;
                    c1177800gks.requestLayout();
                }
            }
        };
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iIntValue;
        int iIntValue2;
        super.onMeasure(i, i2);
        Double d = this.LLILLJJLI;
        if (d != null) {
            iIntValue = (int) (d.doubleValue() * ((double) getMeasuredHeight()));
        } else {
            Integer num = this.LLILLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
        }
        this.LLIZ = iIntValue;
        Double d2 = this.LLILZIL;
        if (d2 != null) {
            iIntValue2 = (int) (d2.doubleValue() * ((double) getMeasuredHeight()));
        } else {
            Integer num2 = this.LLILZ;
            if (num2 == null && (num2 = this.LLILLL) == null) {
                iIntValue2 = 0;
            } else {
                iIntValue2 = num2.intValue();
            }
        }
        this.LLIZLLLIL = iIntValue2;
        if (this.LLJ && !this.LLJI && this.LLILZLL != null && getMeasuredHeight() != 0) {
            Double d3 = this.LLILZLL;
            if (d3 != null) {
                double dDoubleValue = d3.doubleValue();
                BottomSheetBehavior<?> bottomSheetBehavior = this.LL;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setPeekHeight((int) (dDoubleValue * ((double) getMeasuredHeight())));
                    return;
                }
                return;
            }
            return;
        }
        Integer num3 = this.LLILLL;
        int measuredHeight = getMeasuredHeight();
        if (num3 == null || num3.intValue() != measuredHeight) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.LLIZ, 1073741824));
            setMeasuredDimension(getMeasuredWidth(), this.LLIZ);
        }
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.LL;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setPeekHeight(this.LLIZLLLIL);
        }
        if (this.LLJI) {
            BottomSheetBehavior<?> bottomSheetBehavior3 = this.LL;
            if (bottomSheetBehavior3 != null) {
                bottomSheetBehavior3.setState(4);
            }
            this.LLJ = false;
            this.LLJI = false;
        }
    }
}
