package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Gao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418360Gao extends FrameLayout {
    public C0GYF LL;

    public static /* synthetic */ void getSlider$annotations() {
    }

    public final C0GYF getSlider() {
        C0GYF c0gyf = this.LL;
        if (c0gyf != null) {
            return c0gyf;
        }
        "VerticalTextSizeSliderWrapper must include a TextSizeSlider as its child.".toString();
        throw new IllegalArgumentException("VerticalTextSizeSliderWrapper must include a TextSizeSlider as its child.");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        float f;
        super.onViewAdded(view);
        if (this.LL == null && (view instanceof C0GYF)) {
            C0GYF c0gyf = (C0GYF) view;
            if (C454590Hs9.LIZ(c0gyf.getContext())) {
                f = 90.0f;
            } else {
                f = 270.0f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gyf);
            c0gyf.setRotation(f);
            this.LL = c0gyf;
        }
    }

    public C418360Gao(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getSlider().getVisibility() != 8) {
            int paddingStart = ((i3 - i) - getPaddingStart()) - getPaddingEnd();
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int paddingStart2 = getPaddingStart() + C814420VxA.LIZIZ((paddingStart - paddingTop) * 0.5f);
            int paddingTop2 = getPaddingTop() + C814420VxA.LIZIZ((paddingTop - paddingStart) * 0.5f);
            getSlider().layout(paddingStart2, paddingTop2, paddingTop + paddingStart2, paddingStart + paddingTop2);
        }
    }
}
