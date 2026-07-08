package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362690EJv extends FrameLayout {
    public final float LL;
    public final float LLILLJJLI;
    public float LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public RectF LLILZLL;
    public int LLIZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = this.LLIZ;
        float f = ((360.0f / i) - this.LLILLJJLI) - this.LLILLL;
        float f2 = -100.0f;
        for (int i2 = 0; i2 < i; i2++) {
            canvas.drawArc(this.LLILZLL, f2, f, false, this.LLILZ);
            f2 += this.LLILLJJLI + f + this.LLILLL;
        }
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (Math.min(getWidth(), getHeight()) / 2.0f) - (this.LL / 2.0f), this.LLILZIL);
    }

    public C362690EJv(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(53);
        tuxTextView.setTextColorRes(R.attr.a1p);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(tuxTextView, layoutParams);
        tuxTextView.setText("?");
        float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(1.5d));
        this.LL = fLIZIZ;
        this.LLILLJJLI = 10.0f;
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
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
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, context);
        paint2.setColor(numLIZJ2 != null ? numLIZJ2.intValue() : -7829368);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.LLILZIL = paint2;
        this.LLILZLL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.LLIZ = 12;
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
