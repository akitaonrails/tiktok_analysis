package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hQ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203370hQ7 extends AbstractC1203440hQE {
    public Function1<? super Integer, Unit> LLJIJIL;

    public final int getValue() {
        return (int) getRatingValue();
    }

    public final Function1<Integer, Unit> getOnValueSelectedListener() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC1203440hQE
    public final void LIZIZ(float f) {
        Function1<? super Integer, Unit> function1 = this.LLJIJIL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf((int) f));
        }
    }

    public final void setOnValueSelectedListener(Function1<? super Integer, Unit> function1) {
        this.LLJIJIL = function1;
    }

    public final void setValue(int i) {
        setRatingValue(i);
    }

    public C1203370hQ7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setRatingSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        setRatingSpacing(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        setRatingEnableTouch(true);
        setHasOffset(false);
        setValue(0);
    }

    @Override // X.AbstractC1203440hQE, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZIZ;
        if (View.MeasureSpec.getSize(i) < (((getRatingSize() + getRatingSpacing()) * 5) - getRatingSpacing()) + getPaddingLeft() + getPaddingRight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        setRatingSpacing(iLIZIZ);
        super.onMeasure(i, i2);
    }
}
