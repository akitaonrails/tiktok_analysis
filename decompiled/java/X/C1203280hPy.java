package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203280hPy extends AbstractC1203440hQE {
    public final float getValue() {
        return getRatingValue();
    }

    public final void setRatingIconSizePx(int i) {
        setRatingSize(i);
        requestLayout();
    }

    public final void setValue(float f) {
        setRatingValue(f);
    }

    public C1203280hPy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.yj);
        setRatingSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        setRatingSpacing(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        setRatingEnableTouch(false);
        setHasOffset(true);
    }
}
