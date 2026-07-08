package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: renamed from: X.0hiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1214790hiX extends ScrollView {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C788530UwV.LIZ("dispatchScrollViewTouchEvent")) {
            C2188191AkT.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C1214790hiX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (C0TY1.LIZ) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) C497740JfY.LIZIZ(148.0f), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
