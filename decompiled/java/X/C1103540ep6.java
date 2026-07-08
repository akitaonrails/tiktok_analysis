package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfig;

/* JADX INFO: renamed from: X.0ep6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103540ep6 extends FrameLayout {
    public final void LIZ() {
        setBackground(C1106260etU.LIZIZ(getContext()));
    }

    public C1103540ep6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBackground(C1106260etU.LIZIZ(context));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2 = 38.0f;
        if (LiveToolbarUIConfig.expandContainer() && C497740JfY.LJIL()) {
            f = 38.0f;
        } else {
            f = 36.0f;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) C497740JfY.LIZIZ(f), 1073741824);
        if (!LiveToolbarUIConfig.expandContainer() || !C497740JfY.LJIL()) {
            f2 = 36.0f;
        }
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) C497740JfY.LIZIZ(f2), 1073741824));
    }
}
