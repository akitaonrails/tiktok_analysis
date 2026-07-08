package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0FF4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FF4 extends FrameLayout {
    public C1DYT LL;

    public static /* synthetic */ void getSlider$annotations() {
    }

    public final C1DYT getSlider() {
        C1DYT c1dyt = this.LL;
        if (c1dyt != null) {
            return c1dyt;
        }
        "VerticalTextSizeSliderWrapper must include a TextSizeSlider as its child.".toString();
        throw new IllegalArgumentException("VerticalTextSizeSliderWrapper must include a TextSizeSlider as its child.");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        float f;
        super.onViewAdded(view);
        if (this.LL == null && (view instanceof C1DYT)) {
            C1DYT c1dyt = (C1DYT) view;
            if (C444960Hcc.LIZIZ()) {
                f = 90.0f;
            } else {
                f = 270.0f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1dyt);
            c1dyt.setRotation(f);
            this.LL = c1dyt;
        }
    }

    public C0FF4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getSlider().getVisibility() != 8) {
            int paddingLeft = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int paddingLeft2 = getPaddingLeft() + C814420VxA.LIZIZ((paddingLeft - paddingTop) * 0.5f);
            int paddingTop2 = getPaddingTop() + C814420VxA.LIZIZ((paddingTop - paddingLeft) * 0.5f);
            getSlider().layout(paddingLeft2, paddingTop2, paddingTop + paddingLeft2, paddingLeft + paddingTop2);
        }
    }
}
