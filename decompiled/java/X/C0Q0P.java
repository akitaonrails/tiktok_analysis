package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Q0P, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q0P extends View {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public Layout LLILZ;
    public Layout LLILZIL;
    public int LLILZLL;
    public final int LLIZ;
    public final long LLIZLLLIL;
    public int LLJ;
    public long LLJI;
    public final C444830HcP LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public CharSequence LLJJ;
    public final ChoreographerFrameCallbackC660860Pw4 LLJJI;
    public boolean LLJJIII;

    public C0Q0P(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final float getOffsetPerFramePx() {
        return this.LL / this.LLIZ;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return this.LLJILJIL ? 1.0f : 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return this.LLJILJIL ? 1.0f : 0.0f;
    }

    public final void LIZJ() {
        C786410Ut5.v2().removeFrameCallback(this.LLJJI);
        this.LLJILJIL = false;
        this.LLJ = 0;
        this.LLILZLL = 0;
        invalidate();
    }

    public final int getGapOfTextTailAndHeadPx() {
        return this.LLILLJJLI;
    }

    public final int getMarqueeRepeatLimit() {
        return this.LLILLL;
    }

    public final int getScrollingSpeedPxPerSecond() {
        return this.LL;
    }

    public final CharSequence getText() {
        return this.LLJJ;
    }

    public final int getTextColor() {
        return this.LLJILJILJ;
    }

    public final int getTextSize() {
        return this.LLJILLL;
    }

    public final void LIZ(long j) {
        int iLIZIZ;
        if (!this.LLJILJIL) {
            return;
        }
        C786410Ut5.v2().postFrameCallback(this.LLJJI);
        Layout layout = this.LLILZ;
        if (layout != null) {
            int i = this.LLJ;
            if (j - this.LLJI < this.LLIZLLLIL) {
                iLIZIZ = C814420VxA.LIZ(((double) getOffsetPerFramePx()) * ((j - this.LLJI) / this.LLIZLLLIL));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(getOffsetPerFramePx());
            }
            int i2 = i + iLIZIZ;
            this.LLJ = i2;
            this.LLJI = j;
            if (i2 > layout.getWidth() + this.LLILLJJLI) {
                int i3 = this.LLILZLL + 1;
                this.LLILZLL = i3;
                int i4 = this.LLILLL;
                if (i4 >= 0 && i4 <= i3) {
                    LIZJ();
                } else {
                    this.LLJ %= layout.getWidth() + this.LLILLJJLI;
                }
            }
        }
        invalidate();
    }

    public final void LIZIZ(int i) {
        TextUtils.TruncateAt truncateAt;
        int paddingLeft;
        Layout layoutLIZIZ;
        if (this.LLJILJIL) {
            LIZJ();
        }
        this.LLJIJIL.LJIILIIL(this.LLJJ);
        this.LLJIJIL.LJIILJJIL(this.LLJILJILJ);
        this.LLJIJIL.LJII(this.LLJILLL);
        C444830HcP c444830HcP = this.LLJIJIL;
        c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LTR;
        boolean z = true;
        if (getLayoutDirection() == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        c444830HcP.LIZIZ.LJII = truncateAt;
        if (i <= 0) {
            paddingLeft = 0;
        } else {
            paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        }
        c444830HcP.LIZIZ.LJIIIIZZ = paddingLeft;
        Layout layoutLIZIZ2 = c444830HcP.LIZIZ();
        if (layoutLIZIZ2.getEllipsizedWidth() != layoutLIZIZ2.getWidth()) {
            z = false;
        }
        this.LLJJIII = z;
        if (z) {
            layoutLIZIZ = layoutLIZIZ2;
        } else {
            C444830HcP c444830HcP2 = this.LLJIJIL;
            c444830HcP2.LIZIZ.LJIIIIZZ = 0;
            layoutLIZIZ = c444830HcP2.LIZIZ();
        }
        this.LLILZ = layoutLIZIZ;
        this.LLILZIL = layoutLIZIZ2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int paddingLeft;
        int width2;
        Layout layout;
        int paddingLeft2;
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        int ellipsizedWidth = 0;
        if (!this.LLJILJIL) {
            Layout layout2 = this.LLILZIL;
            if (layout2 != null) {
                float paddingLeft3 = getPaddingLeft();
                if (getLayoutDirection() == 1) {
                    int width3 = getWidth();
                    if (width3 > 0) {
                        ellipsizedWidth = (width3 - getPaddingLeft()) - getPaddingRight();
                    }
                    ellipsizedWidth -= layout2.getEllipsizedWidth();
                }
                canvas.translate(paddingLeft3 + ellipsizedWidth, getPaddingTop());
                layout2.draw(canvas);
            }
        } else {
            Layout layout3 = this.LLILZ;
            if (layout3 != null) {
                float paddingLeft4 = getPaddingLeft();
                if (getLayoutDirection() == 1) {
                    int i = this.LLJ;
                    int width4 = getWidth();
                    if (width4 <= 0) {
                        paddingLeft2 = 0;
                    } else {
                        paddingLeft2 = (width4 - getPaddingLeft()) - getPaddingRight();
                    }
                    width = (i + paddingLeft2) - layout3.getWidth();
                } else {
                    width = -this.LLJ;
                }
                canvas.translate(paddingLeft4 + width, getPaddingTop());
                layout3.draw(canvas);
                int i2 = this.LLJ;
                int width5 = getWidth();
                if (width5 <= 0) {
                    paddingLeft = 0;
                } else {
                    paddingLeft = (width5 - getPaddingLeft()) - getPaddingRight();
                }
                if (i2 + paddingLeft > layout3.getWidth() + this.LLILLJJLI) {
                    if (getLayoutDirection() == 1) {
                        width2 = (-this.LLILLJJLI) - layout3.getWidth();
                    } else {
                        width2 = this.LLILLJJLI + layout3.getWidth();
                    }
                    canvas.translate(width2, 0.0f);
                    if (this.LLILZLL + 1 == this.LLILLL && (layout = this.LLILZIL) != null) {
                        if (getLayoutDirection() == 1) {
                            canvas.translate(layout3.getWidth() - layout.getEllipsizedWidth(), 0.0f);
                        }
                        layout3 = layout;
                    }
                    layout3.draw(canvas);
                }
            }
        }
        canvas.restore();
    }

    public final void setGapOfTextTailAndHeadPx(int i) {
        this.LLILLJJLI = i;
    }

    public final void setMarqueeRepeatLimit(int i) {
        this.LLILLL = i;
    }

    public final void setScrollingSpeedPxPerSecond(int i) {
        this.LL = i;
    }

    public final void setText(CharSequence charSequence) {
        if (charSequence != null && !a0.LJJJIL(charSequence)) {
            this.LLJJ = charSequence;
            LIZIZ(getWidth());
            requestLayout();
        } else {
            this.LLILZ = null;
            this.LLILZIL = null;
            invalidate();
        }
    }

    public final void setTextColor(int i) {
        this.LLJILJILJ = i;
        if (this.LLILZ == null) {
            return;
        }
        LIZIZ(getWidth());
    }

    public final void setTextSize(int i) {
        this.LLJILLL = i;
        if (this.LLILZ == null) {
            return;
        }
        LIZIZ(getWidth());
        requestLayout();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int width;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        Layout layout = this.LLILZ;
        int height = 0;
        if (layout != null) {
            width = layout.getWidth();
        } else {
            width = 0;
        }
        int i3 = paddingLeft + width;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        Layout layout2 = this.LLILZ;
        if (layout2 != null) {
            height = layout2.getHeight();
        }
        setMeasuredDimension(View.resolveSize(i3, i), View.resolveSize(paddingTop + height, i2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0Pw4] */
    public C0Q0P(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.y2;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        this.LLILLL = -1;
        this.LLIZ = 60;
        this.LLIZLLLIL = 1000000000 / ((long) 60);
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LIZIZ.LJII = TextUtils.TruncateAt.END;
        c444830HcP.LJIIIZ(1);
        this.LLJIJIL = c444830HcP;
        int i3 = R.attr.zi;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context);
        this.LLJILJILJ = numLIZJ != null ? numLIZJ.intValue() : i3;
        this.LLJILLL = 72;
        setLayoutDirection(2);
        this.LLJJI = new Choreographer.FrameCallback() { // from class: X.0Pw4
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.LL.LIZ(j);
            }
        };
        this.LLJJIII = true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            LIZIZ(i);
        }
    }
}
