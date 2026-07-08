package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0iIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237310iIr extends ScrollView {
    public final int LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C788530UwV.LIZ("dispatchScrollViewTouchEvent")) {
            C2188191AkT.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C1237310iIr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.scrollViewStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EcommerceUiMaxHeightScrollView);
        this.LL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.EcommerceUiMaxHeightScrollView_ecommerce_ui_scrollViewMaxHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LL;
        if (i3 <= 0) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        }
    }
}
