package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0GWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416980GWq extends FrameLayout {
    public float LL;

    public final float getScale() {
        return this.LL;
    }

    public C416980GWq(Context context) {
        super(context, null);
        this.LL = 1.0f;
    }

    public final void setScale(float f) {
        this.LL = f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec((int) (getMeasuredHeight() * this.LL), View.MeasureSpec.getMode(i2)));
    }
}
