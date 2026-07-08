package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203290hPz extends AbstractC1203440hQE {
    public final float getValue() {
        return getRatingValue();
    }

    public final void setValue(float f) {
        setRatingValue(f);
    }

    public C1203290hPz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.yj);
        setRatingSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        setRatingSpacing(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        setRatingEnableTouch(false);
        setHasOffset(true);
        setInactiveColor(R.attr.a02);
    }
}
