package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362700EJw extends FrameLayout {
    public final float LL;
    public final float LLILLJJLI;
    public float LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public RectF LLILZLL;
    public final TuxTextView LLIZ;
    public int LLIZLLLIL;
    public int LLJ;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f = this.LLILLJJLI;
        float f2 = this.LLILLL;
        float f3 = (-90) + (f / 2.0f) + f2;
        int i = this.LLJ;
        float f4 = ((360.0f / i) - f) - f2;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < this.LLIZLLLIL) {
                canvas.drawArc(this.LLILZLL, f3, f4, false, this.LLILZIL);
            } else {
                canvas.drawArc(this.LLILZLL, f3, f4, false, this.LLILZ);
            }
            f3 += this.LLILLJJLI + f4 + this.LLILLL;
        }
    }

    public C362700EJw(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        super(context, attributeSet, 0);
        float fLIZIZ = C418440Gaw.LIZIZ(4);
        this.LL = fLIZIZ;
        this.LLILLJJLI = 7.2f;
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        paint.setColor(iIntValue);
        paint.setStrokeWidth(fLIZIZ);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.LLILZ = paint;
        Paint paint2 = new Paint();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0i, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -16711936;
        }
        paint2.setColor(iIntValue2);
        paint2.setStrokeWidth(fLIZIZ);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        this.LLILZIL = paint2;
        this.LLILZLL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColorRes(R.attr.a00);
        this.LLIZ = tuxTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(tuxTextView, layoutParams);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float fMin = Math.min(getWidth(), getHeight()) / 2.0f;
        float f = i / 2;
        float f2 = this.LL;
        float f3 = i2 / 2;
        this.LLILZLL = new RectF((f - fMin) + (f2 / 2.0f), (f3 - fMin) + (f2 / 2.0f), (f + fMin) - (f2 / 2.0f), (f3 + fMin) - (f2 / 2.0f));
        this.LLILLL = (float) ((((double) (this.LL / 2.0f)) / (((double) fMin) * 6.28d)) * ((double) 360.0f));
        invalidate();
    }
}
