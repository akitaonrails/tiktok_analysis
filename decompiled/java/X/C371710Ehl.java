package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Ehl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C371710Ehl extends FrameLayout {
    public int LL;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i = this.LL;
        if (i == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i == 1) {
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, getWidth() / 2);
        } else if (i == 2) {
            canvas.rotate(180.0f, getWidth() / 2, getHeight() / 2);
        } else {
            canvas.translate(0.0f, getHeight());
            canvas.rotate(270.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, (-getWidth()) / 2);
        }
        super.dispatchDraw(canvas);
    }

    public void setViewRotation(int i) {
        this.LL = ((i + 360) % 360) / 90;
    }

    public C371710Ehl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LL;
        if (i3 != 1 && i3 != 3) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, i2);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }
}
