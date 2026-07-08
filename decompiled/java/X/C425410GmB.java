package X;

import Y.ARunnableS1S0100001_6;
import Y.ARunnableS6S0100002_6;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425410GmB extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public float LLILZ;
    public boolean LLILZIL;
    public Function1<? super Float, Unit> LLILZLL;
    public Function0<Unit> LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final RectF LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public final float LLJJ;

    public final void LIZ() {
        float f = this.LLJILLL;
        float f2 = this.LLJILJILJ;
        float f3 = f - f2;
        if (f3 < 0.0f || f3 <= 0.0f) {
            return;
        }
        float f4 = this.LLILZ;
        if (f4 <= f3) {
            f3 = f4;
        }
        float f5 = f3 / 2.0f;
        this.LLIZLLLIL = C13LZ.LIZLLL(this.LLIZLLLIL, f2 + f5, f - f5);
    }

    public final float getCropOffsetRatio() {
        float f = this.LLJILLL;
        float f2 = this.LLJILJILJ;
        float f3 = f - f2;
        if (f3 < 0.0f || f3 <= 0.0f) {
            return 0.5f;
        }
        return C13LZ.LIZLLL((this.LLIZLLLIL - f2) / f3, 0.0f, 1.0f);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public final boolean getDraggable() {
        return this.LLILZIL;
    }

    public final Function0<Unit> getOnVisibleWindowClick() {
        return this.LLIZ;
    }

    public final Function1<Float, Unit> getOnWindowPositionChanged() {
        return this.LLILZLL;
    }

    public final float getVisibleWindowHeight() {
        return this.LLILZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0) {
            float width = getWidth();
            float height = getHeight();
            float f = this.LLJILLL - this.LLJILJILJ;
            if (f < 0.0f) {
                f = 0.0f;
            }
            float f2 = this.LLILZ;
            if (f <= 0.0f) {
                f = height;
            }
            if (f2 > f) {
                f2 = f;
            }
            float f3 = this.LLIZLLLIL;
            float f4 = f2 / 2.0f;
            this.LLJILJIL.set(0.0f, f3 - f4, width, f3 + f4);
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, null);
            canvas.drawRect(0.0f, 0.0f, width, height, this.LL);
            canvas.drawRect(this.LLJILJIL, this.LLILLJJLI);
            canvas.restoreToCount(iSaveLayer);
            canvas.drawRect(this.LLJILJIL, this.LLILLL);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f = this.LLILZ;
        float height = getHeight();
        if (f > height) {
            f = height;
        }
        float f2 = this.LLIZLLLIL;
        float f3 = f / 2.0f;
        float f4 = f2 - f3;
        float f5 = f2 + f3;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                } else {
                    if (!this.LLJIJIL) {
                        return true;
                    }
                    float y = motionEvent.getY() - this.LLJ;
                    if (this.LLILZIL && (this.LLJI || Math.abs(y) > this.LLJJ)) {
                        this.LLJI = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.LLJ = motionEvent.getY();
                        if (getHeight() > 0) {
                            this.LLIZLLLIL += y;
                            LIZ();
                            invalidate();
                        }
                    }
                    return true;
                }
            }
            if (this.LLJI) {
                this.LLJI = false;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                Function1<? super Float, Unit> function1 = this.LLILZLL;
                if (function1 != null) {
                    function1.invoke(Float.valueOf(getCropOffsetRatio()));
                }
                return true;
            }
            if (this.LLJIJIL && motionEvent.getAction() == 1) {
                super.performClick();
                Function0<Unit> function0 = this.LLIZ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.LLJIJIL = false;
            ViewParent parent3 = getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(false);
            }
            return true;
        }
        float y2 = motionEvent.getY();
        if (f4 <= y2 && y2 <= f5) {
            z = true;
        } else {
            z = false;
        }
        this.LLJIJIL = z;
        if (z) {
            this.LLJ = motionEvent.getY();
            return true;
        }
        this.LLJI = false;
        ViewParent parent4 = getParent();
        if (parent4 != null) {
            parent4.requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public final void setCropOffsetRatio(float f) {
        if (getHeight() <= 0) {
            HandlerHook.viewPost(this, new ARunnableS1S0100001_6(this, f, 0));
            return;
        }
        float f2 = this.LLJILLL;
        float f3 = this.LLJILJILJ;
        float f4 = f2 - f3;
        if (f4 >= 0.0f && f4 > 0.0f) {
            this.LLIZLLLIL = f3 + (f4 * C13LZ.LIZLLL(f, 0.0f, 1.0f));
            LIZ();
            invalidate();
            return;
        }
        HandlerHook.viewPost(this, new ARunnableS1S0100001_6(this, f, 1));
    }

    public final void setDraggable(boolean z) {
        this.LLILZIL = z;
    }

    public final void setOnVisibleWindowClick(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setOnWindowPositionChanged(Function1<? super Float, Unit> function1) {
        this.LLILZLL = function1;
    }

    public final void setVisibleWindowHeight(float f) {
        this.LLILZ = f;
        invalidate();
    }

    public C425410GmB(Context context, AttributeSet attributeSet) {
        int color;
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zd, context);
        if (numLIZJ != null) {
            color = numLIZJ.intValue();
        } else {
            color = ColorProtector.parseColor("#cc000000");
        }
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        this.LL = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LLILLJJLI = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(ColorProtector.parseColor("#4DFFFFFF"));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.5f))));
        this.LLILLL = paint3;
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(154));
        this.LLILZIL = true;
        this.LLIZLLLIL = -1.0f;
        this.LLJILJIL = new RectF();
        this.LLJJ = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void LIZIZ(float f, float f2) {
        if (getHeight() <= 0) {
            HandlerHook.viewPost(this, new ARunnableS6S0100002_6(this, f, f2, 0));
            return;
        }
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, getHeight());
        float fLIZLLL2 = C13LZ.LIZLLL(f2, fLIZLLL, getHeight());
        this.LLJILJILJ = fLIZLLL;
        this.LLJILLL = fLIZLLL2;
        if (this.LLIZLLLIL < 0.0f) {
            this.LLIZLLLIL = (fLIZLLL + fLIZLLL2) / 2.0f;
        }
        LIZ();
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 > 0) {
            if (this.LLJILLL <= this.LLJILJILJ) {
                this.LLJILJILJ = 0.0f;
                this.LLJILLL = i2;
            }
            if (this.LLIZLLLIL < 0.0f) {
                this.LLIZLLLIL = (this.LLJILJILJ + this.LLJILLL) / 2.0f;
            }
            LIZ();
        }
    }
}
