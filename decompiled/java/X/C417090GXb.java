package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417090GXb extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final float LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public final int LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final boolean LLJ;
    public final RectF LLJI;
    public int LLJIJIL;
    public Function1<? super Integer, Unit> LLJILJIL;
    public final boolean LLJILJILJ;

    public final int getNominalTone() {
        return this.LLJIJIL - ((this.LLILZLL / 2) + 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int i3;
        super.onDraw(canvas);
        if (this.LLJ) {
            int width = getWidth();
            int i4 = this.LLILZLL;
            i = (width - (this.LLILZ * i4)) / (i4 + 1);
        } else {
            int width2 = getWidth();
            int i5 = this.LLILZLL;
            i = (width2 - (this.LLILZ * i5)) / (i5 - 1);
        }
        this.LLILZIL = i;
        int i6 = this.LLILZLL;
        if (1 <= i6) {
            int i7 = 1;
            while (true) {
                if (this.LLJ) {
                    if (i7 == 1) {
                        i3 = this.LLILZIL;
                    } else {
                        int i8 = this.LLILZIL;
                        i3 = i8 + ((i7 - 1) * (this.LLILZ + i8));
                    }
                    f = i3;
                } else {
                    f = (i7 - 1) * (this.LLILZ + this.LLILZIL);
                }
                RectF rectF = this.LLJI;
                rectF.left = f;
                rectF.right = f + this.LLILZ;
                if (this.LLJILJILJ) {
                    rectF.top = (getHeight() - this.LLILLL) - ((this.LLILZLL - i7) * this.LLIZLLLIL);
                } else {
                    rectF.top = (getHeight() - this.LLILLL) - ((i7 - 1) * this.LLIZLLLIL);
                }
                this.LLJI.bottom = getHeight();
                if (this.LLJILJILJ) {
                    i2 = (this.LLILZLL - this.LLJIJIL) + 1;
                } else {
                    i2 = this.LLJIJIL;
                }
                if (i7 == i2) {
                    if (canvas != null) {
                        RectF rectF2 = this.LLJI;
                        float f2 = this.LLIZ;
                        canvas.drawRoundRect(rectF2, f2, f2, this.LL);
                    }
                } else if (canvas != null) {
                    RectF rectF3 = this.LLJI;
                    float f3 = this.LLIZ;
                    canvas.drawRoundRect(rectF3, f3, f3, this.LLILLJJLI);
                }
                if (i7 != i6) {
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void setHighLightColor(int i) {
        this.LL.setColor(i);
        invalidate();
    }

    public final void setOnToneChangeListener(Function1<? super Integer, Unit> function1) {
        this.LLJILJIL = function1;
    }

    public C417090GXb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LL = paint;
        Paint paint2 = new Paint();
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LLILLJJLI = paint2;
        this.LLJI = new RectF();
        this.LLJILJILJ = C497740JfY.LJJ();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ToneProcessView);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.ToneProcessView_highlight_color, C497740JfY.LIZLLL(R.attr.c9i, getContext())));
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.ToneProcessView_normal_color, C497740JfY.LIZLLL(R.attr.c92, getContext())));
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.ToneProcessView_tone_num, 9);
        this.LLILZLL = integer;
        this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ToneProcessView_stroke_width, (int) C497740JfY.LIZIZ(8.0f));
        this.LLIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ToneProcessView_bar_radius, (int) C497740JfY.LIZIZ(4.0f));
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ToneProcessView_min_height, (int) C497740JfY.LIZIZ(8.0f));
        this.LLILLL = dimensionPixelSize;
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ToneProcessView_max_height, (int) C497740JfY.LIZIZ(24.0f));
        this.LLJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ToneProcessView_auto_horizontal_margin, false);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJIJIL = (integer / 2) + 1;
        this.LLIZLLLIL = (dimensionPixelSize2 - dimensionPixelSize) / (integer - 1);
    }
}
