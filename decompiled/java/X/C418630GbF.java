package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C418630GbF extends ProgressBar {
    public final Paint LL;
    public float LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;

    public ObjectAnimator getHideAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    public ObjectAnimator getShowAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (int) (this.LLILLL * ((getProgress() * 1.0f) / getMax()));
        if (progress > 0.0f) {
            this.LL.setColor(this.LLILZ);
            this.LL.setStrokeWidth(this.LLILLJJLI);
            float height = getHeight() / 2.0f;
            if (this.LLILZIL) {
                int i = this.LLILLL;
                canvas.drawLine(i, height, i - progress, height, this.LL);
            } else {
                canvas.drawLine(0.0f, height, progress, height, this.LL);
            }
        }
        canvas.restore();
    }

    public void setReachedBarColor(int i) {
        this.LLILZ = i;
    }

    public void setReachedProgressBarHeight(float f) {
        this.LLILLJJLI = f;
    }

    public C418630GbF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Paint();
        this.LLILLJJLI = (int) TypedValue.applyDimension(1, 6, getResources().getDisplayMetrics());
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.VideoPlayerProgressbar);
        this.LLILZ = typedArrayObtainStyledAttributes.getColor(R$styleable.VideoPlayerProgressbar_reached_color, -261935);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoPlayerProgressbar_reached_height, this.LLILLJJLI);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            int paddingTop = (int) (getPaddingTop() + getPaddingBottom() + Math.max(this.LLILLJJLI, Math.abs(this.LL.descent() - this.LL.ascent())));
            if (mode == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
        this.LLILLL = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        this.LLILZIL = z;
    }
}
