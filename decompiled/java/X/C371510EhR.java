package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0EhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371510EhR extends FrameLayout {
    public int[] LL;
    public float[] LLILLJJLI;
    public Paint LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;

    public final void setGradientColor(int[] iArr) {
        this.LL = iArr;
    }

    public final void setGradientPosition(float[] fArr) {
        this.LLILLJJLI = fArr;
    }

    public final void setIsTransparent(boolean z) {
        this.LLJ = z;
        invalidate();
    }

    public final void setPaintAlpha(int i) {
        Paint paint = this.LLILLL;
        if (paint == null || paint.getAlpha() == i) {
            return;
        }
        paint.setAlpha(i);
        invalidate();
    }

    public final void setPosition(int i) {
        if (i == this.LLILZ) {
            return;
        }
        this.LLILZ = i;
        invalidate();
    }

    public C371510EhR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new int[]{-1, -654311424, 0};
        this.LLILLJJLI = new float[]{0.0f, 0.25f, 1.0f};
        this.LLJ = true;
        Paint paint = new Paint(1);
        this.LLILLL = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.LLILLL;
        if (paint2 != null) {
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EdgeTransparentView);
        this.LLILZ = typedArrayObtainStyledAttributes.getInt(R$styleable.EdgeTransparentView_position_edge, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.EdgeTransparentView_width_edge, C418440Gaw.LIZIZ(20));
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.EdgeTransparentView_fade_right_margin, C418440Gaw.LIZIZ(0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Paint paint;
        if (this.LLJ) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            boolean zDrawChild = super.drawChild(canvas, view, j);
            int i = this.LLILZ;
            if ((i == 0 || (i & 1) != 0) && (paint = this.LLILLL) != null) {
                canvas.drawRect(0.0f, -3.0f, this.LLILZLL, this.LLILZIL, paint);
            }
            int i2 = this.LLILZ;
            if (i2 == 0 || (i2 & 2) != 0) {
                int iSave = canvas.save();
                float f = 2;
                canvas.rotate(180.0f, this.LLILZLL / f, this.LLIZ / f);
                Paint paint2 = this.LLILLL;
                if (paint2 != null) {
                    canvas.drawRect(this.LLIZLLLIL, -3.0f, this.LLILZLL, this.LLILZIL, paint2);
                }
                canvas.restoreToCount(iSave);
            }
            int i3 = (this.LLIZ - this.LLILZLL) / 2;
            int i4 = this.LLILZ;
            if (i4 == 0 || (i4 & 4) != 0) {
                int iSave2 = canvas.save();
                float f2 = 2;
                canvas.rotate(90.0f, this.LLILZLL / f2, this.LLIZ / f2);
                float f3 = i3;
                canvas.translate(0.0f, f3);
                Paint paint3 = this.LLILLL;
                if (paint3 != null) {
                    canvas.drawRect(-f3, -3.0f, this.LLILZLL + f3, this.LLILZIL, paint3);
                }
                canvas.restoreToCount(iSave2);
            }
            int i5 = this.LLILZ;
            if (i5 == 0 || (i5 & 8) != 0) {
                int iSave3 = canvas.save();
                float f4 = 2;
                canvas.rotate(270.0f, this.LLILZLL / f4, this.LLIZ / f4);
                float f5 = i3;
                canvas.translate(0.0f, f5);
                Paint paint4 = this.LLILLL;
                if (paint4 != null) {
                    canvas.drawRect(-f5, -3.0f, this.LLILZLL + f5, this.LLILZIL, paint4);
                }
                canvas.restoreToCount(iSave3);
            }
            canvas.restoreToCount(iSaveLayer);
            return zDrawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.LLILLL;
        if (paint != null) {
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLILZIL, this.LL, this.LLILLJJLI, Shader.TileMode.CLAMP));
        }
        this.LLILZLL = getWidth();
        this.LLIZ = getHeight();
    }
}
