package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376740Eps extends LinearLayout {
    public final Paint LL;
    public final RectF LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final float LLJILJILJ;
    public final float LLJILLL;
    public boolean LLJJ;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.LLJJ) {
            return;
        }
        float width = getWidth();
        float paddingTop = getPaddingTop() + this.LLILZ;
        float f = this.LLILZIL;
        float f2 = 0.0f + paddingTop;
        float f3 = this.LLJILLL + f;
        float f4 = this.LLIZLLLIL + f2;
        this.LLILLJJLI.set(f, f2, f3, f4);
        RectF rectF = this.LLILLJJLI;
        float f5 = this.LLILZLL;
        canvas.drawRoundRect(rectF, f5, f5, this.LL);
        float f6 = width - this.LLILZ;
        float f7 = this.LLIZ;
        float f8 = f6 - f7;
        float f9 = this.LLILLL + paddingTop;
        float f10 = f7 + f9;
        float f11 = this.LLILZIL;
        canvas.drawCircle(f8 + f11, f9 + f11, f11, this.LL);
        float f12 = f8 - this.LLILZ;
        float f13 = f12 - this.LLJI;
        float f14 = this.LLILLL + paddingTop;
        this.LLILLJJLI.set(f13, f14, f12, this.LLIZ + f14);
        RectF rectF2 = this.LLILLJJLI;
        float f15 = this.LLILZIL;
        canvas.drawRoundRect(rectF2, f15, f15, this.LL);
        float f16 = this.LLILZIL;
        float f18 = f4 + this.LLILLL;
        float f19 = this.LLJILJILJ + f16;
        float f20 = this.LLIZ + f18;
        this.LLILLJJLI.set(f16, f18, f19, f20);
        RectF rectF3 = this.LLILLJJLI;
        float f21 = this.LLILZ;
        canvas.drawRoundRect(rectF3, f21, f21, this.LL);
        float f22 = this.LLILZIL;
        float f23 = width - f22;
        float f24 = f23 - this.LLJILJIL;
        float f25 = f22 + f10;
        this.LLILLJJLI.set(f24, f25, f23, this.LLIZ + f25);
        RectF rectF4 = this.LLILLJJLI;
        float f26 = this.LLILZ;
        canvas.drawRoundRect(rectF4, f26, f26, this.LL);
        float f27 = f24 - this.LLILLL;
        float f28 = f27 - this.LLJIJIL;
        float f29 = f10 + this.LLILZIL;
        this.LLILLJJLI.set(f28, f29, f27, this.LLIZ + f29);
        RectF rectF5 = this.LLILLJJLI;
        float f30 = this.LLILZ;
        canvas.drawRoundRect(rectF5, f30, f30, this.LL);
        float f31 = this.LLILZIL;
        float f32 = f20 + this.LLILLL;
        float f33 = this.LLJ;
        this.LLILLJJLI.set(f31, f32, f31 + f33, f33 + f32);
        RectF rectF6 = this.LLILLJJLI;
        float f34 = this.LLILZ;
        canvas.drawRoundRect(rectF6, f34, f34, this.LL);
    }

    public final void setDrawSkeletion(boolean z) {
        this.LLJJ = z;
        invalidate();
    }

    public C376740Eps(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey_, context);
        if (numLIZJ != null) {
            paint.setColor(numLIZJ.intValue());
        }
        paint.setStyle(Paint.Style.FILL);
        this.LL = paint;
        this.LLILLJJLI = new RectF();
        this.LLILLL = C497740JfY.LIZIZ(6);
        this.LLILZ = C497740JfY.LIZIZ(8);
        this.LLILZIL = C497740JfY.LIZIZ(12);
        this.LLILZLL = C497740JfY.LIZIZ(18);
        this.LLIZ = C497740JfY.LIZIZ(24);
        this.LLIZLLLIL = C497740JfY.LIZIZ(36);
        this.LLJ = C497740JfY.LIZIZ(40);
        this.LLJI = C497740JfY.LIZIZ(51);
        this.LLJIJIL = C497740JfY.LIZIZ(96);
        this.LLJILJIL = C497740JfY.LIZIZ(106);
        this.LLJILJILJ = C497740JfY.LIZIZ(122);
        this.LLJILLL = C497740JfY.LIZIZ(164);
        this.LLJJ = true;
    }
}
