package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0FPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389590FPh extends FrameLayout {
    public float LL;

    public final float getRatio() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.LL;
        if (f != 1.0f && f > 0.0f) {
            canvas.save();
            float f2 = this.LL;
            canvas.scale(f2, f2);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void setRatio(float f) {
        if (this.LL != f) {
            this.LL = f;
            requestLayout();
            invalidate();
        }
    }

    public C389590FPh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = this.LL;
        if (f != 1.0f && f > 0.0f) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size, (int) (getMeasuredHeight() * this.LL));
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float f = this.LL;
        if (f != 1.0f && f > 0.0f && getLayoutDirection() == 1) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getLeft() < 0) {
                    childAt.layout(0, childAt.getTop(), childAt.getMeasuredWidth(), childAt.getBottom());
                }
            }
        }
    }
}
