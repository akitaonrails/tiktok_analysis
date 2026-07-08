package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hQ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203330hQ3 extends AbstractC1203440hQE {
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));

    public final int getStarSize() {
        return getRatingSize();
    }

    public final int getStarSpacing() {
        return getRatingSpacing();
    }

    public final float getValue() {
        return getRatingValue();
    }

    public final void setStarSize(int i) {
        if (getRatingSize() != i) {
            setRatingSize(i);
            requestLayout();
            invalidate();
        }
    }

    public final void setStarSpacing(int i) {
        if (getRatingSpacing() != i) {
            setRatingSpacing(i);
            requestLayout();
            invalidate();
        }
    }

    public final void setValue(float f) {
        setRatingValue(f);
    }

    public C1203330hQ3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.yj);
        setRatingSize(LLJIJIL);
        setRatingSpacing(LLJILJIL);
        setRatingEnableTouch(false);
        setHasOffset(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxRatingBar, R.attr.yj, 0);
        setValue(typedArrayObtainStyledAttributes.getFloat(R$styleable.TuxRatingBar_tux_ratingBarValue, 0.0f));
        typedArrayObtainStyledAttributes.recycle();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.PoiRatingBar);
            setStarSize(typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.PoiRatingBar_poi_ratingStarSize, getRatingSize()));
            setStarSpacing(typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.PoiRatingBar_poi_ratingStarSpacing, getRatingSpacing()));
            setValue(typedArrayObtainStyledAttributes2.getFloat(R$styleable.PoiRatingBar_poi_ratingValue, getValue()));
            typedArrayObtainStyledAttributes2.recycle();
        }
    }
}
