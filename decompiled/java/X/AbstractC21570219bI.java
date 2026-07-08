package X;

import Y.AUListenerS79S0110000_33;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.19bI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21570219bI extends FrameLayout {
    public final RectF LL;
    public final Path LLILLJJLI;
    public final RectF LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public Rect LLIZ;
    public Rect LLIZLLLIL;
    public float LLJ;
    public final Rect LLJI;
    public final C0H9L LLJIJIL;
    public final C0H9L LLJILJIL;

    public final void LIZJ(float f) {
        if (this.LLIZ != null && this.LLIZLLLIL != null && !this.LLJI.isEmpty()) {
            Rect rectEvaluate = this.LLJIJIL.evaluate(f, this.LLIZ, this.LLJI);
            Rect rectEvaluate2 = this.LLJILJIL.evaluate(f, this.LLIZLLLIL, this.LLJI);
            float f2 = this.LLJ * (1.0f - f);
            if (rectEvaluate.equals(this.LLJI) && rectEvaluate2.equals(this.LLJI) && f2 == 0.0f) {
                this.LLILZ = false;
                this.LLILZIL = false;
                this.LLILZLL = false;
                return;
            }
            this.LL.set(rectEvaluate);
            if (f2 > 0.0f) {
                this.LLILLJJLI.rewind();
                this.LLILLJJLI.addRoundRect(this.LL, f2, f2, Path.Direction.CCW);
                this.LLILZIL = true;
            } else {
                this.LLILZ = true;
            }
            this.LLILLL.set(rectEvaluate2);
            this.LLILZLL = !this.LLILLL.equals(this.LL);
            invalidate();
        }
    }

    public AbstractC21570219bI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new RectF();
        this.LLILLJJLI = new Path();
        this.LLILLL = new RectF();
        this.LLILZ = false;
        this.LLILZIL = false;
        this.LLILZLL = false;
        this.LLJI = new Rect();
        this.LLJIJIL = new C0H9L(new Rect());
        this.LLJILJIL = new C0H9L(new Rect());
    }

    public AbstractC21570219bI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new RectF();
        this.LLILLJJLI = new Path();
        this.LLILLL = new RectF();
        this.LLILZ = false;
        this.LLILZIL = false;
        this.LLILZLL = false;
        this.LLJI = new Rect();
        this.LLJIJIL = new C0H9L(new Rect());
        this.LLJILJIL = new C0H9L(new Rect());
    }

    public boolean LIZLLL(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zLIZLLL;
        if (this.LLILZLL) {
            canvas.save();
            canvas.clipRect(this.LLILLL);
            if (this.LLILZIL) {
                canvas.save();
                canvas.clipPath(this.LLILLJJLI);
                zLIZLLL = LIZLLL(canvas, view, j);
                canvas.restore();
            } else if (this.LLILZ) {
                canvas.save();
                canvas.clipRect(this.LL);
                zLIZLLL = LIZLLL(canvas, view, j);
                canvas.restore();
            } else {
                zLIZLLL = LIZLLL(canvas, view, j);
            }
            canvas.restore();
            return zLIZLLL;
        }
        if (this.LLILZIL) {
            canvas.save();
            canvas.clipPath(this.LLILLJJLI);
            boolean zLIZLLL2 = LIZLLL(canvas, view, j);
            canvas.restore();
            return zLIZLLL2;
        }
        if (this.LLILZ) {
            canvas.save();
            canvas.clipRect(this.LL);
            boolean zLIZLLL3 = LIZLLL(canvas, view, j);
            canvas.restore();
            return zLIZLLL3;
        }
        return LIZLLL(canvas, view, j);
    }

    public final Animator LJ(Rect rect, Rect rect2, float f, boolean z) {
        this.LLIZ = new Rect(rect);
        this.LLIZLLLIL = new Rect(rect2);
        this.LLJ = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS79S0110000_33(this, z, 1));
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJI.set(0, 0, getWidth(), getHeight());
    }
}
