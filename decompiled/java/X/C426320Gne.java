package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Gne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426320Gne extends View {
    public static final /* synthetic */ int LLJI = 0;
    public int LL;
    public int LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final int LLIZLLLIL;
    public final Map<Boolean, RadialGradient> LLJ;

    public C426320Gne(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height;
        super.onDraw(canvas);
        if (getWidth() < getHeight()) {
            height = getWidth();
        } else {
            height = getHeight();
        }
        float f = height;
        float f2 = 2;
        float width = ((getWidth() - f) / f2) + (this.LLILLL.getStrokeWidth() / f2);
        float height2 = ((getHeight() - f) / f2) + (this.LLILLL.getStrokeWidth() / f2);
        float strokeWidth = (width + f) - this.LLILLL.getStrokeWidth();
        float strokeWidth2 = (f + height2) - this.LLILLL.getStrokeWidth();
        float f3 = (this.LLILZIL / 100.0f) * 360.0f;
        if (this.LLILZLL) {
            if (((LinkedHashMap) this.LLJ).get(Boolean.valueOf(this.LLIZ)) == null) {
                LIZIZ(getWidth(), getHeight(), true);
                LIZIZ(getWidth(), getHeight(), false);
            }
            this.LLILZ.setShader((Shader) ((LinkedHashMap) this.LLJ).get(Boolean.valueOf(this.LLIZ)));
            canvas.drawCircle((getWidth() + width) / 2.0f, (getHeight() + height2) / 2.0f, (getWidth() / 2.0f) + this.LLIZLLLIL, this.LLILZ);
        }
        this.LLILLL.setColor(this.LL);
        canvas.drawArc(width, height2, strokeWidth, strokeWidth2, -90.0f, 360.0f, false, this.LLILLL);
        this.LLILLL.setColor(this.LLILLJJLI);
        canvas.drawArc(width, height2, strokeWidth, strokeWidth2, -90.0f, f3, false, this.LLILLL);
    }

    public final void setAboveColor(int i) {
        this.LLILLJJLI = i;
        invalidate();
    }

    public final void setAboveColorAttr(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            this.LLILLJJLI = numLIZJ.intValue();
            invalidate();
        }
    }

    public final void setProgress(float f) {
        LIZ(f, false);
    }

    public final void setUnderColor(int i) {
        this.LL = i;
        invalidate();
    }

    public final void setUnderColorAttr(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            this.LL = numLIZJ.intValue();
            invalidate();
        }
    }

    public final void LIZ(float f, boolean z) {
        if (f < 0.0f) {
            this.LLILZIL = 0.0f;
        } else if (f > 100.0f) {
            this.LLILZIL = 100.0f;
        } else {
            this.LLILZIL = f;
        }
        if (z) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C426320Gne(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.xp;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.LLILLL = paint;
        this.LLILZ = new Paint();
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLJ = new LinkedHashMap();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxCircularProgress, i2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCircularProgress_tux_circularProgress_underColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCircularProgress_tux_circularProgress_aboveColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LL = color;
        this.LLILLJJLI = color2;
    }

    public final void LIZIZ(int i, int i2, boolean z) {
        float f;
        int color;
        int iArgb;
        float f2;
        if (i < i2) {
            f = i;
        } else {
            f = i2;
        }
        float f3 = f / 2.0f;
        if (z) {
            color = ColorProtector.parseColor("#26000000");
        } else {
            color = ColorProtector.parseColor("#1C000000");
        }
        Map<Boolean, RadialGradient> map = this.LLJ;
        Boolean boolValueOf = Boolean.valueOf(z);
        int i3 = this.LLIZLLLIL;
        float f4 = f3 + i3;
        int[] iArr = new int[3];
        if (z) {
            iArgb = color;
        } else if (f3 > i3) {
            iArgb = 0;
        } else {
            iArgb = Color.argb((int) (Color.alpha(color) * (f3 / i3)), Color.red(color), Color.green(color), Color.blue(color));
        }
        iArr[0] = iArgb;
        iArr[1] = color;
        iArr[2] = 0;
        float[] fArr = new float[3];
        int i4 = this.LLIZLLLIL;
        if (f3 > i4) {
            f2 = (f3 - i4) / (i4 + f3);
        } else {
            f2 = 0.0f;
        }
        fArr[0] = f2;
        fArr[1] = f3 / (i4 + f3);
        fArr[2] = 1.0f;
        map.put(boolValueOf, new RadialGradient(f3, f3, f4, iArr, fArr, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float fLIZIZ;
        super.onSizeChanged(i, i2, i3, i4);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        Paint paint = this.LLILLL;
        if (i > iLIZIZ && i2 > iLIZIZ) {
            fLIZIZ = C418440Gaw.LIZIZ(3);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(2);
        }
        paint.setStrokeWidth(fLIZIZ);
        LIZIZ(i, i2, true);
        LIZIZ(i, i2, false);
        invalidate();
    }
}
