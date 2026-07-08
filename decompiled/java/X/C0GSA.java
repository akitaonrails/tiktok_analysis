package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GSA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GSA extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final RectF LLILLL;
    public float LLILZ;
    public Integer LLILZIL;
    public Integer LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public final boolean LLJI;
    public float LLJIJIL;

    public final void LIZ() {
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        Context context = getContext();
        this.LLILZIL = context != null ? C1308910kAL.LIZJ(R.attr.ezz, context) : null;
        this.LLIZ = 255;
        this.LLJ = 1.0f;
        this.LLJIJIL = 0.0f;
        Context context2 = getContext();
        this.LLILZLL = context2 != null ? C1308910kAL.LIZJ(R.attr.eze, context2) : null;
        this.LLIZLLLIL = 0;
    }

    public final int getBorderAlpha1() {
        return this.LLIZLLLIL;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        super.draw(canvas);
        this.LL.setStrokeWidth(this.LLILZ);
        Integer num = this.LLILZIL;
        if (num != null) {
            this.LL.setColor(num.intValue());
        }
        this.LL.setAlpha(this.LLIZ);
        this.LLILLJJLI.setStrokeWidth(this.LLILZ);
        Integer num2 = this.LLILZLL;
        if (num2 != null) {
            this.LLILLJJLI.setColor(num2.intValue());
        }
        this.LLILLJJLI.setAlpha(this.LLIZLLLIL);
        RectF rectF = this.LLILLL;
        if (this.LLJI) {
            f = -this.LLJIJIL;
        } else {
            f = this.LLJIJIL;
        }
        canvas.drawArc(rectF, -90.0f, f, false, this.LL);
        RectF rectF2 = this.LLILLL;
        if (this.LLJI) {
            f2 = -this.LLJIJIL;
        } else {
            f2 = this.LLJIJIL;
        }
        canvas.drawArc(rectF2, -90.0f, f2, false, this.LLILLJJLI);
    }

    public final void setBorderAlpha(int i) {
        this.LLIZ = i;
        invalidate();
    }

    public final void setBorderAlpha1(int i) {
        this.LLIZLLLIL = i;
        invalidate();
    }

    public final void setBorderWidth(float f) {
        this.LLILZ = f;
        invalidate();
    }

    public final void setProgress(float f) {
        this.LLJIJIL = f;
        invalidate();
    }

    public final void setScale(float f) {
        this.LLJ = f;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(f);
    }

    public C0GSA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.LL = paint;
        Paint paint2 = new Paint();
        this.LLILLJJLI = paint2;
        this.LLILLL = new RectF();
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        this.LLIZ = 255;
        this.LLJ = 1.0f;
        this.LLJI = true;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        LIZ();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.LLILLL;
        float f = this.LLILZ / 2;
        float f2 = i - f;
        rectF.set(f, f, f2, f2);
        float f3 = this.LLJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(f3);
        float f4 = this.LLJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(f4);
    }
}
