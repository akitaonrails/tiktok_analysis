package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418540Gb6 extends View {
    public final TuxIconDrawable LL;
    public final PorterDuffXfermode LLILLJJLI;
    public final Paint LLILLL;
    public Function1<? super Float, Unit> LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public float LLJI;

    public final int getRatingActiveColor() {
        return this.LLILZLL;
    }

    public final int getRatingColor() {
        return this.LLILZIL;
    }

    public final boolean getRatingEnableTouch() {
        return this.LLJ;
    }

    public final int getRatingSize() {
        return this.LLIZ;
    }

    public final int getRatingSpacing() {
        return this.LLIZLLLIL;
    }

    public final float getRatingValue() {
        return this.LLJI;
    }

    public final float LIZ(float f) {
        boolean z;
        int paddingLeft;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f <= getWidth() - getPaddingLeft()) {
                if (f < getPaddingRight()) {
                    return 5.0f;
                }
                paddingLeft = (int) ((((getWidth() - getPaddingLeft()) - f) / (this.LLIZ + this.LLIZLLLIL)) + 1);
            } else {
                return 0.0f;
            }
        } else if (f >= getPaddingLeft()) {
            if (f > getWidth() - getPaddingRight()) {
                return 5.0f;
            }
            paddingLeft = (int) (((f - getPaddingLeft()) / (this.LLIZ + this.LLIZLLLIL)) + 1);
        } else {
            return 0.0f;
        }
        return paddingLeft;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int width2;
        int i;
        int i2;
        int i3 = this.LLIZLLLIL / 2;
        int paddingTop = getPaddingTop() + i3;
        int i4 = paddingTop + this.LLIZ;
        int paddingLeft = getPaddingLeft();
        if (getLayoutDirection() == 1) {
            width = ((getWidth() - paddingLeft) - i3) - this.LLIZ;
        } else {
            width = paddingLeft + i3;
        }
        this.LL.LJFF(this.LLILZIL);
        int i5 = 0;
        do {
            this.LL.setBounds(width, paddingTop, this.LLIZ + width, i4);
            this.LL.draw(canvas);
            if (getLayoutDirection() == 1) {
                width -= this.LLIZ + this.LLIZLLLIL;
            } else {
                width += this.LLIZ + this.LLIZLLLIL;
            }
            i5++;
        } while (i5 < 5);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LLILLL, 31);
        this.LLILLL.setXfermode(this.LLILLJJLI);
        int i6 = (int) this.LLJI;
        if (getLayoutDirection() == 1) {
            width2 = ((getWidth() - paddingLeft) - i3) - this.LLIZ;
        } else {
            width2 = paddingLeft + i3;
        }
        this.LL.LJFF(this.LLILZLL);
        for (int i7 = 0; i7 < i6; i7++) {
            this.LL.setBounds(width2, paddingTop, this.LLIZ + width2, i4);
            this.LL.draw(canvas);
            if (getLayoutDirection() == 1) {
                width2 -= this.LLIZ + this.LLIZLLLIL;
            } else {
                width2 += this.LLIZ + this.LLIZLLLIL;
            }
        }
        double d = ((double) (this.LLJI - i6)) + 0.05d;
        if (!this.LLJ && d > 0.0d && d >= 0.1d) {
            double d2 = (((double) ((int) (d / 0.1d))) * 0.07d) + 0.15d;
            if (getLayoutDirection() == 1) {
                int i8 = this.LLIZ;
                i2 = ((int) (((double) i8) * (((double) 1) - d2))) + width2;
                i = i8 + width2;
            } else {
                i = ((int) (((double) this.LLIZ) * d2)) + width2;
                i2 = width2;
            }
            canvas.clipRect(i2, paddingTop, i, i4);
            this.LL.setBounds(width2, paddingTop, this.LLIZ + width2, i4);
            this.LL.draw(canvas);
        }
        this.LLILLL.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJ) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            Function1<? super Float, Unit> function1 = this.LLILZ;
                            if (function1 != null) {
                                function1.invoke(Float.valueOf(this.LLJI));
                            }
                            return true;
                        }
                    } else {
                        setRatingValue(LIZ(motionEvent.getX()));
                        return true;
                    }
                } else {
                    Function1<? super Float, Unit> function12 = this.LLILZ;
                    if (function12 != null) {
                        function12.invoke(Float.valueOf(this.LLJI));
                    }
                    return true;
                }
            } else {
                setRatingValue(LIZ(motionEvent.getX()));
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnStarChanged$topic_release(Function1<? super Float, Unit> function1) {
        this.LLILZ = function1;
    }

    public final void setRatingActiveColor(int i) {
        if (this.LLILZLL != i) {
            this.LLILZLL = i;
            invalidate();
        }
    }

    public final void setRatingColor(int i) {
        if (this.LLILZIL != i) {
            this.LLILZIL = i;
            invalidate();
        }
    }

    public final void setRatingEnableTouch(boolean z) {
        this.LLJ = z;
    }

    public final void setRatingSize(int i) {
        if (this.LLIZ != i) {
            this.LLIZ = i;
            this.LL.LJII(i);
            this.LL.LJ(this.LLIZ);
            requestLayout();
        }
    }

    public final void setRatingSpacing(int i) {
        if (this.LLIZLLLIL != i) {
            this.LLIZLLLIL = i;
            requestLayout();
        }
    }

    public final void setRatingValue(float f) {
        if (this.LLJI != f) {
            this.LLJI = f;
            invalidate();
        }
    }

    public C418540Gb6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LLILLL = paint;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, context);
        if (numLIZJ != null) {
            setRatingColor(numLIZJ.intValue());
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ny, context);
        if (numLIZJ2 != null) {
            setRatingActiveColor(numLIZJ2.intValue());
        }
        setRatingSpacing(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        setRatingEnableTouch(true);
        setRatingValue(0.0f);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_star_fill;
        c419910GdJ.LIZLLL = Integer.valueOf(this.LLILZIL);
        this.LL = c419910GdJ.LIZ(context);
        setRatingSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(((this.LLIZ + this.LLIZLLLIL) * 5) + getPaddingLeft() + getPaddingRight(), this.LLIZ + this.LLIZLLLIL + getPaddingTop() + getPaddingBottom());
    }
}
