package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePinCardSetting;

/* JADX INFO: renamed from: X.0UNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771250UNf extends FrameLayout {
    public final int LL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        setPivotX(getWidth() / 2);
        setPivotY(getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    public C771250UNf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LivePinCardSetting livePinCardSetting = LivePinCardSetting.INSTANCE;
        int iPinCardMinHeightPx = livePinCardSetting.pinCardMinHeightPx();
        this.LL = livePinCardSetting.pinCardMaxHeightPx();
        setMinimumHeight(iPinCardMinHeightPx);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    int i3 = this.LL;
                    if (size > i3) {
                        size = i3;
                    }
                    i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                }
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(this.LL, Integer.MIN_VALUE);
            }
        } else {
            int i4 = this.LL;
            if (size > i4) {
                size = i4;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setPivotX(i / 2);
        setPivotY(i2);
    }
}
