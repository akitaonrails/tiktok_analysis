package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.view.a;
import com.bytedance.android.live.settings.LiveHostReplayUISettings;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836290xsx extends View {
    public int LL;
    public int LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public final Paint LLJIJIL;
    public final Paint LLJILJIL;
    public final RectF LLJILJILJ;
    public final RectF LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public InterfaceC1836340xt2 LLJJIII;
    public C1836130xsh<Boolean> LLJJIJI;
    public boolean LLJJIJIIJIL;
    public Vibrator LLJJIJIL;
    public boolean LLJJJ;
    public final float LLJJJIL;
    public float LLJJJJ;

    public final void LIZ() {
        float f = this.LLJI;
        float f2 = this.LLJ;
        if (f == f2) {
            return;
        }
        float f3 = (this.LLJJ - f2) / (f - f2);
        if (Math.abs(this.LLJJJJ - f3) > this.LLJJJIL) {
            this.LLJJJJ = f3;
            InterfaceC1836340xt2 interfaceC1836340xt2 = this.LLJJIII;
            if (interfaceC1836340xt2 != null) {
                interfaceC1836340xt2.LIZ(f3);
            }
        }
    }

    public final float getPercentage() {
        float f = this.LLJI;
        float f2 = this.LLJ;
        if (f == f2) {
            return 0.0f;
        }
        return (this.LLJJ - f2) / (f - f2);
    }

    public final boolean getIgnoreDrag() {
        return this.LLJJJ;
    }

    public final C1836130xsh<Boolean> getScrolling() {
        return this.LLJJIJI;
    }

    public final boolean getStart() {
        return this.LLJJIJIIJIL;
    }

    public final int getThumbColor() {
        return this.LLILLJJLI;
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            this.LLILLJJLI = a.LIZIZ(R.attr.e2, getContext());
            this.LL = a.LIZIZ(R.attr.bt, getContext());
        } else {
            this.LLILLJJLI = a.LIZIZ(R.attr.ee, getContext());
            this.LL = a.LIZIZ(R.attr.e9, getContext());
        }
        this.LLJILJIL.setColor(this.LLILLJJLI);
        this.LLJIJIL.setColor(this.LL);
        invalidate();
        this.LLJJJ = z;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LLJILJILJ.set(getPaddingStart(), getPaddingTop(), getPaddingStart() + ((this.LLILLL - getPaddingStart()) - getPaddingEnd()), getPaddingTop() + ((this.LLILZ - getPaddingTop()) - getPaddingBottom()));
        RectF rectF = this.LLJILJILJ;
        float f = this.LLIZLLLIL;
        canvas.drawRoundRect(rectF, f, f, this.LLJIJIL);
        RectF rectF2 = this.LLJILLL;
        float f2 = this.LLJJ;
        float f3 = this.LLILZLL;
        float f4 = 2;
        float f5 = this.LLILZ;
        float f6 = this.LLILZIL;
        rectF2.set(f2 - (f3 / f4), (f5 - f6) / f4, (f2 - (f3 / f4)) + f3, ((f5 - f6) / f4) + f6);
        RectF rectF3 = this.LLJILLL;
        float f7 = this.LLIZ;
        canvas.drawRoundRect(rectF3, f7, f7, this.LLJILJIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1836290xsx.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setIgnoreDrag(boolean z) {
        this.LLJJJ = z;
    }

    public final void setMotionEventMoveListener(InterfaceC1836340xt2 interfaceC1836340xt2) {
        this.LLJJIII = interfaceC1836340xt2;
    }

    public final void setPercentage(float f) {
        if (this.LLJJJ || Float.isNaN(f)) {
            return;
        }
        if (C444960Hcc.LIZJ(getContext())) {
            f = 1 - f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.LLJI;
        float f3 = this.LLJ;
        this.LLJJ = (f * (f2 - f3)) + f3;
        invalidate();
    }

    public final void setScrolling(C1836130xsh<Boolean> c1836130xsh) {
        this.LLJJIJI = c1836130xsh;
    }

    public final void setStart(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setThumbColor(int i) {
        this.LLILLJJLI = i;
    }

    public C1836290xsx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -16777216;
        this.LLILLJJLI = -1;
        this.LLIZLLLIL = C497740JfY.LIZIZ(2.0f);
        Paint paint = new Paint();
        this.LLJIJIL = paint;
        Paint paint2 = new Paint();
        this.LLJILJIL = paint2;
        this.LLJILJILJ = new RectF();
        this.LLJILLL = new RectF();
        this.LLJJIJI = new C1836130xsh<>(Boolean.FALSE);
        this.LL = a.LIZIZ(R.attr.e9, getContext());
        this.LLILLJJLI = a.LIZIZ(R.attr.ee, getContext());
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint.setColor(this.LL);
        paint2.setColor(this.LLILLJJLI);
        if (LiveHostReplayUISettings.INSTANCE.getEnable()) {
            this.LLILZIL = C497740JfY.LIZIZ(20.0f);
            this.LLILZLL = C497740JfY.LIZIZ(16.0f);
            this.LLIZ = C497740JfY.LIZIZ(6.0f);
        } else {
            this.LLILZIL = C497740JfY.LIZIZ(10.0f);
            this.LLILZLL = C497740JfY.LIZIZ(24.0f);
            this.LLIZ = C497740JfY.LIZIZ(2.0f);
        }
        this.LLJJJIL = 0.001f;
        this.LLJJJJ = -1.0f;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLL = getMeasuredWidth();
        this.LLILZ = getMeasuredHeight();
        float f = 2;
        this.LLJ = getPaddingStart() + (this.LLILZLL / f);
        this.LLJI = (this.LLILLL - getPaddingEnd()) - (this.LLILZLL / f);
        if (this.LLJJ <= 0.001f) {
            if (C444960Hcc.LIZIZ()) {
                this.LLJJ = this.LLJI;
            } else {
                this.LLJJ = this.LLJ;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILLL = i;
        this.LLILZ = i2;
        float f = 2;
        this.LLJ = getPaddingStart() + (this.LLILZLL / f);
        this.LLJI = (this.LLILLL - getPaddingEnd()) - (this.LLILZLL / f);
    }
}
