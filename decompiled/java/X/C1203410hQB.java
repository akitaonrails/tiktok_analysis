package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203410hQB extends AbstractC1203440hQE {
    public final int getSize() {
        return getRatingSize();
    }

    public final int getSpacing() {
        return getRatingSpacing();
    }

    public final float getValue() {
        return getRatingValue();
    }

    public C1203410hQB(Context context) {
        super(context, (AttributeSet) null, R.attr.yj);
    }

    public final void setSize(int i) {
        setRatingSize(i);
    }

    public final void setSpacing(int i) {
        setRatingSpacing(i);
    }

    public final void setValue(float f) {
        setRatingValue(f);
    }
}
