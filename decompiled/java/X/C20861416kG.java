package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16kG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C20861416kG extends AbstractC21144517op {
    @Override // X.AbstractC21144517op
    public final View LJIILIIL(final Context context, final AttributeSet attributeSet) {
        return new AbstractC1000980c9g(context, attributeSet) { // from class: X.0bsk
            @Override // X.AbstractC1000980c9g
            public int getLayoutId$commercialize_search_impl_release() {
                return R.layout.ete;
            }

            @Override // X.AbstractC1000980c9g
            public final boolean LIZLLL() {
                AwemeRawAd mAwemeRawAd$commercialize_search_impl_release;
                return this.LLILZLL != null && ((mAwemeRawAd$commercialize_search_impl_release = getMAwemeRawAd$commercialize_search_impl_release()) == null || !C1010120cOQ.LIZLLL(mAwemeRawAd$commercialize_search_impl_release));
            }

            @Override // X.AbstractC1000980c9g
            public void setTransformButtonVisibility$commercialize_search_impl_release(int i) {
                int visibility = getVisibility();
                setVisibility(i);
                C1602160rnK.LIZIZ(visibility, i, this);
            }

            {
                super(context, attributeSet, 0);
                setDefaultBackgroundColor(C960203pA.LIZ(R.attr.a1p, context));
            }

            @Override // X.AbstractC1000980c9g
            public final void LIZJ(int i, int i2) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(getResources().getDimensionPixelOffset(R.dimen.ae8));
                if (i2 == 0) {
                    gradientDrawable.setColor(i);
                    setBackground(gradientDrawable);
                } else {
                    gradientDrawable.setColor(getBackGroundColor());
                    C421740GgG.LIZJ(this, gradientDrawable, getBackGroundColor(), i, i2);
                }
            }
        };
    }
}
