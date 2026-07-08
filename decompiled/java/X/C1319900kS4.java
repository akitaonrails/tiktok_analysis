package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0kS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319900kS4 extends ConstraintLayout {
    public final Path LL;
    public float LLILLJJLI;
    public boolean LLILLL;

    public final boolean getInterceptTouch() {
        return this.LLILLL;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LLILLJJLI != 0.0f) {
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas.clipPath(this.LL);
            canvas.save();
        }
        super.dispatchDraw(canvas);
        if (this.LLILLJJLI != 0.0f) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLILLL && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void setInterceptTouch(boolean z) {
        this.LLILLL = z;
    }

    public final void setRadius(float f) {
        this.LLILLJJLI = f;
    }

    public C1319900kS4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1319900kS4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new Path();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LL.reset();
        Path path = this.LL;
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float f = this.LLILLJJLI;
        path.addRoundRect(rectF, new float[]{f, f, f, f, f, f, f, f}, Path.Direction.CW);
        invalidate();
    }
}
