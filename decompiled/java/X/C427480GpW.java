package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.text.NumberFormat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0GpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427480GpW extends View {
    public final int LL;
    public final int LLILLJJLI;
    public final Paint LLILLL;
    public int LLILZ;
    public final ObjectAnimator LLILZIL;
    public boolean LLILZLL;
    public final String LLIZ;
    public Function1<? super Integer, ? extends CharSequence> LLIZLLLIL;

    public C427480GpW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        if (this.LLILZ == 100 && this.LLILZLL) {
            this.LLILZIL.setDuration(200L);
            C786410Ut5.Pd(this.LLILZIL);
        } else {
            this.LLILZIL.cancel();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
        }
    }

    public final void LIZIZ() {
        setContentDescription(this.LLIZLLLIL.invoke(Integer.valueOf(this.LLILZ)));
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LLILLL.setStrokeWidth(getHeight());
        this.LLILLL.setColor(this.LL);
        float height = getHeight() / 2;
        canvas.drawLine(0.0f, height, getWidth(), height, this.LLILLL);
        this.LLILLL.setColor(this.LLILLJJLI);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        if (z) {
            canvas.drawLine(getWidth(), height, getWidth() - (getWidth() * (this.LLILZ / 100)), height, this.LLILLL);
        } else {
            canvas.drawLine(0.0f, height, getWidth() * (this.LLILZ / 100), height, this.LLILLL);
        }
    }

    public final void setAutoDisappear(boolean z) {
        this.LLILZLL = z;
        LIZ();
    }

    public final void setFormatProgressForDisplay(Function1<? super Integer, ? extends CharSequence> function1) {
        this.LLIZLLLIL = function1;
        LIZIZ();
    }

    public final void setProgress(int i) {
        if (i < 0) {
            this.LLILZ = 0;
        } else if (i > 100) {
            this.LLILZ = 100;
        } else {
            this.LLILZ = i;
        }
        invalidate();
        LIZ();
        LIZIZ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C427480GpW(Context context, AttributeSet attributeSet, int i) {
        int i2;
        String str;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.yh;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.LLILLL = paint;
        this.LLILZIL = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.LLILZLL = true;
        if (a0.LJJIZ(NumberFormat.getPercentInstance().format(0L), ' ', 0, false, 6) == -1) {
            str = "";
        } else {
            str = " ";
        }
        this.LLIZ = str;
        this.LLIZLLLIL = new AwS585S0100000_6(this, 33);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxProgressiveLoading, i2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxProgressiveLoading_tux_underColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxProgressiveLoading_tux_aboveColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LL = color;
        this.LLILLJJLI = color2;
        this.LLILZLL = true;
        LIZIZ();
    }
}
