package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bsf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990430bsf extends AbstractC1001050c9n {
    @Override // X.AbstractC1001050c9n
    public int getLayoutId$commercialize_feed_impl_release() {
        return R.layout.cw8;
    }

    @Override // X.AbstractC1001050c9n
    public void setLabelVisibility$commercialize_feed_impl_release(int i) {
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    public C990430bsf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setDefaultBackgroundColor$commercialize_feed_impl_release(C475630Ikz.LIZIZ(R.attr.a1p, context));
    }
}
