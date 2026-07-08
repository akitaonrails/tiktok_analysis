package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0xtu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1836880xtu extends View {
    public int LL;
    public final Paint LLILLJJLI;
    public Rect LLILLL;
    public float LLILZ;
    public Rect LLILZIL;
    public RectF LLILZLL;
    public final Path LLIZ;

    public void LIZIZ(Canvas canvas, RectF rectF) {
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final float getCornerRadius() {
        return this.LLILZ;
    }

    public final Rect getCropRect() {
        return this.LLILZIL;
    }

    public final Rect getEditRect() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.LL;
        if (i != -1) {
            if (i == 0) {
                LIZ(canvas, this.LLILZLL);
            }
        } else {
            Rect rect = this.LLILLL;
            LIZ(canvas, new RectF(rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public final void setCornerRadius(float f) {
        this.LLILZ = f;
    }

    public final void setCropRect(Rect rect) {
        this.LLILZIL = rect;
    }

    public final void setEditRect(Rect rect) {
        this.LLILLL = rect;
    }

    public C1836880xtu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(Canvas canvas, RectF rectF) {
        if (this.LLILZ > 0.0f) {
            this.LLIZ.reset();
            this.LLIZ.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Path.Direction.CW);
            Path path = this.LLIZ;
            float f = this.LLILZ;
            path.addRoundRect(rectF, f, f, Path.Direction.CCW);
            canvas.drawPath(this.LLIZ, this.LLILLJJLI);
            return;
        }
        Iterator it2 = C1697810uHb.LJIIJJI(new RectF(0.0f, 0.0f, getMeasuredWidth(), rectF.top), new RectF(0.0f, rectF.top, rectF.left, rectF.bottom), new RectF(rectF.right, rectF.top, getMeasuredWidth(), rectF.bottom), new RectF(0.0f, rectF.bottom, getMeasuredWidth(), getMeasuredHeight())).iterator();
        while (it2.hasNext()) {
            canvas.drawRect((RectF) it2.next(), this.LLILLJJLI);
        }
        LIZIZ(canvas, rectF);
    }

    public final void LIZJ(float f, float f2) {
        this.LL = 0;
        float f3 = 1;
        float f4 = 2;
        float f5 = (f3 + f) / f4;
        Rect rect = this.LLILLL;
        int i = rect.left;
        float f6 = (f3 - f) / f4;
        int i2 = rect.right;
        int i3 = rect.top;
        int i4 = rect.bottom;
        this.LLILZLL = new RectF((i * f5) + (i2 * f6), ((i3 * f5) + (i4 * f6)) - f2, (i * f6) + (i2 * f5), ((f6 * i3) + (f5 * i4)) - f2);
        invalidate();
    }

    public final void LIZLLL(float f, boolean z) {
        Rect rect;
        Rect rect2;
        this.LL = 0;
        C2488709p7 c2488709p7 = C2488709p7.LIZ;
        if (z) {
            rect = this.LLILLL;
            rect2 = this.LLILZIL;
        } else {
            rect = this.LLILZIL;
            rect2 = this.LLILLL;
        }
        c2488709p7.getClass();
        this.LLILZLL = C2488709p7.LIZ(f, rect, rect2);
        invalidate();
    }

    public C1836880xtu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = -1;
        Paint paint = new Paint();
        paint.setColor(-16777216);
        this.LLILLJJLI = paint;
        this.LLILLL = new Rect();
        this.LLILZIL = new Rect();
        this.LLILZLL = new RectF();
        this.LLIZ = new Path();
    }
}
