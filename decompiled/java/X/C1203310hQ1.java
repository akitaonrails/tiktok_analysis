package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hQ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203310hQ1 extends AbstractC1203440hQE {
    public final float getValue() {
        return getRatingValue();
    }

    public final void setValue(float f) {
        setRatingValue(f);
    }

    public C1203310hQ1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.yj);
        setRatingSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        setRatingSpacing(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        setRatingEnableTouch(false);
        setHasOffset(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxRatingBar, R.attr.yj, 0);
        setValue(typedArrayObtainStyledAttributes.getFloat(R$styleable.TuxRatingBar_tux_ratingBarValue, 0.0f));
        typedArrayObtainStyledAttributes.recycle();
    }
}
