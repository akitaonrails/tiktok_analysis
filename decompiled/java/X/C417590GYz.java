package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C417590GYz extends FrameLayout {
    public float[] LL;
    public Paint LLILLJJLI;
    public RectF LLILLL;
    public Path LLILZ;
    public float LLILZIL;
    public int LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;

    public float getShadowDx() {
        return this.LLIZ;
    }

    public float getShadowDy() {
        return this.LLIZLLLIL;
    }

    public float getShadowRadius() {
        return this.LLILZIL;
    }

    public C417590GYz(Context context, AttributeSet attributeSet) {
        float dimension;
        float dimension2;
        float dimension3;
        super(context, attributeSet, 0);
        float f = 0.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundShadowLayout);
            float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundShadowLayout_radius, 0.0f);
            float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundShadowLayout_topLeftRadius, dimension4);
            dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundShadowLayout_topRightRadius, dimension4);
            dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundShadowLayout_bottomLeftRadius, dimension4);
            dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundShadowLayout_bottomRightRadius, dimension4);
            this.LLILZIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundShadowLayout_shadowRadius, 0);
            this.LLILZLL = typedArrayObtainStyledAttributes.getColor(R$styleable.RoundShadowLayout_shadowColor, -2005568139);
            this.LLIZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundShadowLayout_shadow_x, 0.0f);
            this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundShadowLayout_shadow_y, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            f = dimension5;
        } else {
            dimension = 0.0f;
            dimension2 = 0.0f;
            dimension3 = 0.0f;
        }
        this.LL = new float[]{f, f, dimension2, dimension2, dimension, dimension, dimension3, dimension3};
        this.LLILLL = new RectF();
        this.LLILZ = new Path();
        this.LLILLJJLI = new Paint();
        int iAbs = (int) (this.LLILZIL + Math.abs(this.LLIZ));
        int iAbs2 = (int) (this.LLILZIL + Math.abs(this.LLIZLLLIL));
        setPadding(iAbs, iAbs2, iAbs, iAbs2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            float f = this.LLILZIL;
            if (f > 0.0f) {
                float f2 = this.LLIZ;
                float f3 = this.LLIZLLLIL;
                int i5 = this.LLILZLL;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.LLILLL.set(f, f, i - f, i2 - f);
                if (f3 > 0.0f) {
                    RectF rectF = this.LLILLL;
                    rectF.top += f3;
                    rectF.bottom -= f3;
                } else if (f3 < 0.0f) {
                    this.LLILLL.top += Math.abs(f3);
                    this.LLILLL.bottom -= Math.abs(f3);
                }
                if (f2 > 0.0f) {
                    RectF rectF2 = this.LLILLL;
                    rectF2.left += f2;
                    rectF2.right -= f2;
                } else if (f2 < 0.0f) {
                    this.LLILLL.left += Math.abs(f2);
                    this.LLILLL.right -= Math.abs(f2);
                }
                this.LLILLJJLI.setAntiAlias(true);
                this.LLILLJJLI.setStyle(Paint.Style.FILL);
                this.LLILLJJLI.setColor(i5);
                if (!isInEditMode()) {
                    this.LLILLJJLI.setShadowLayer(f, f2, f3, i5);
                }
                this.LLILZ.reset();
                this.LLILZ.addRoundRect(this.LLILLL, this.LL, Path.Direction.CW);
                canvas.drawPath(this.LLILZ, this.LLILLJJLI);
                setBackground(new BitmapDrawable(getResources(), bitmapCreateBitmap));
            }
        }
    }
}
