package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.188n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212359188n extends ConstraintLayout {
    public Integer LL;
    public Integer LLILLJJLI;
    public Function2<? super Boolean, ? super Integer, Unit> LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    public C212359188n() {
        throw null;
    }

    public final int e0() {
        this.LL = null;
        this.LLILLJJLI = null;
        measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return getMeasuredHeight();
    }

    public final int getMaximumHeight() {
        Integer num = this.LL;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final boolean getAvoidFlicker() {
        return this.LLILZIL;
    }

    public final boolean getEnableAnim() {
        return this.LLILZ;
    }

    public final Function2<Boolean, Integer, Unit> getReachMaxHeightCallback() {
        return this.LLILLL;
    }

    public final void setAvoidFlicker(boolean z) {
        this.LLILZIL = z;
    }

    public final void setEnableAnim(boolean z) {
        this.LLILZ = z;
    }

    public final void setInitialFixedHeight(Integer num) {
        Integer num2 = this.LLILLJJLI;
        if (num2 != null && num2.equals(num)) {
            return;
        }
        this.LLILLJJLI = num;
        requestLayout();
    }

    public final void setMaximumHeight(Integer num) {
        Integer num2 = this.LL;
        if (num2 != null && num2.equals(num)) {
            return;
        }
        this.LL = num;
        requestLayout();
    }

    public final void setReachMaxHeightCallback(Function2<? super Boolean, ? super Integer, Unit> function2) {
        this.LLILLL = function2;
    }

    public C212359188n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLILZIL && getMeasuredHeight() > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            return;
        }
        Integer num = this.LLILLJJLI;
        if (num != null) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824));
            this.LLILLJJLI = null;
        } else {
            Integer num2 = this.LL;
            if (num2 != null) {
                i2 = View.MeasureSpec.makeMeasureSpec(num2.intValue(), Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Integer num;
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLILLJJLI == null && (num = this.LL) != null) {
            int iIntValue = num.intValue();
            Function2<? super Boolean, ? super Integer, Unit> function2 = this.LLILLL;
            if (function2 != null) {
                if (iIntValue <= i2) {
                    z = true;
                } else {
                    z = false;
                }
                function2.invoke(Boolean.valueOf(z), Integer.valueOf(i2));
            }
        }
        if (this.LLILZ) {
            C19748612Om.LIZ(this, new C21459418yW());
            if (this.LLILLJJLI != null) {
                this.LLILLJJLI = null;
            }
        }
    }
}
