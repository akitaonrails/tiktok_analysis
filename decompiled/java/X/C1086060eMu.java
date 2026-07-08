package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086060eMu extends C1091250eVH {
    public Function0<Integer> LLJI;

    public final Function0<Integer> getMaxWidthProvider() {
        return this.LLJI;
    }

    public final void setMaxWidthProvider(Function0<Integer> function0) {
        this.LLJI = function0;
    }

    public C1086060eMu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // X.C1091250eVH, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iIntValue;
        Function0<Integer> function0 = this.LLJI;
        if (function0 != null && (iIntValue = function0.invoke().intValue()) > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    i = View.MeasureSpec.makeMeasureSpec(iIntValue, Integer.MIN_VALUE);
                } else {
                    i = View.MeasureSpec.makeMeasureSpec(Math.min(size, iIntValue), 1073741824);
                }
            } else {
                i = View.MeasureSpec.makeMeasureSpec(Math.min(size, iIntValue), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }
}
