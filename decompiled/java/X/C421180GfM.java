package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0GfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421180GfM extends LinearLayout {
    public final Paint LL;
    public RectF LLILLJJLI;
    public LinearGradient LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int[] LLIZ;
    public float[] LLIZLLLIL;
    public GradientDrawable.Orientation LLJ;

    public final int[] getColors() {
        return this.LLIZ;
    }

    public final LinearGradient getLg() {
        return this.LLILLL;
    }

    @Override // android.widget.LinearLayout
    public final GradientDrawable.Orientation getOrientation() {
        return this.LLJ;
    }

    public final float[] getPositions() {
        return this.LLIZLLLIL;
    }

    public final float getRadius() {
        return this.LLILZ;
    }

    public final int getX1() {
        return this.LLILZIL;
    }

    public final int getY1() {
        return this.LLILZLL;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLIZ != null && this.LLIZLLLIL != null && this.LLILZIL == 0 && this.LLILZLL == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            GradientDrawable.Orientation orientation = this.LLJ;
            if (orientation == GradientDrawable.Orientation.TOP_BOTTOM) {
                this.LLILZLL = measuredHeight;
            }
            if (orientation == GradientDrawable.Orientation.LEFT_RIGHT) {
                this.LLILZIL = measuredWidth;
            }
            if (orientation == GradientDrawable.Orientation.TL_BR) {
                this.LLILZIL = measuredWidth;
                this.LLILZLL = measuredHeight;
            }
        }
        LinearGradient linearGradient = this.LLILLL;
        if (linearGradient != null && canvas != null) {
            this.LL.setShader(linearGradient);
            RectF rectF = this.LLILLJJLI;
            if (rectF != null) {
                float f = this.LLILZ;
                canvas.drawRoundRect(rectF, f, f, this.LL);
            }
        }
    }

    public final void setColors(int[] iArr) {
        this.LLIZ = iArr;
    }

    public final void setLg(LinearGradient linearGradient) {
        this.LLILLL = linearGradient;
    }

    public final void setOrientation(GradientDrawable.Orientation orientation) {
        this.LLJ = orientation;
    }

    public final void setPositions(float[] fArr) {
        this.LLIZLLLIL = fArr;
    }

    public final void setRadius(float f) {
        this.LLILZ = f;
    }

    public final void setX1(int i) {
        this.LLILZIL = i;
    }

    public final void setY1(int i) {
        this.LLILZLL = i;
    }

    public C421180GfM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new Paint(1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 && i2 == 0) {
            return;
        }
        int[] iArr = this.LLIZ;
        float[] fArr = this.LLIZLLLIL;
        if (iArr == null || fArr == null) {
            return;
        }
        this.LLILLJJLI = new RectF(0.0f, 0.0f, i, i2);
        GradientDrawable.Orientation orientation = this.LLJ;
        if (orientation == GradientDrawable.Orientation.TOP_BOTTOM) {
            this.LLILZLL = i2;
        }
        if (orientation == GradientDrawable.Orientation.LEFT_RIGHT) {
            this.LLILZIL = i;
        }
        if (orientation == GradientDrawable.Orientation.TL_BR) {
            this.LLILZIL = i;
            this.LLILZLL = i2;
        }
        this.LLILLL = new LinearGradient(0.0f, 0.0f, this.LLILZIL, this.LLILZLL, iArr, fArr, Shader.TileMode.CLAMP);
    }
}
