package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.03Dm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C807603Dm extends FrameLayout {
    public float LL;

    public void setRatio(float f) {
        this.LL = f;
    }

    public C807603Dm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = 0.5625f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        float f = this.LL;
        if (f != 0.0f) {
            i = View.MeasureSpec.makeMeasureSpec((int) (size * f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
