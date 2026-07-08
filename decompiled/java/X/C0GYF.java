package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.DecelerateInterpolator;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYF extends C21413918rB {
    public final long LLILLJJLI;
    public final TimeInterpolator LLILLL;
    public final float LLILZ;

    public final void setInitialTextSizeParams(int i) {
        setProgress(i);
    }

    public C0GYF(Context context, AttributeSet attributeSet) {
        int i;
        final int iIntValue;
        super(context, attributeSet);
        this.LLILLJJLI = 200L;
        this.LLILLL = new DecelerateInterpolator();
        if (C454590Hs9.LIZ(getContext())) {
            i = -20;
        } else {
            i = 20;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i));
        this.LLILZ = fLIZIZ;
        Context context2 = getContext();
        final float fApplyDimension = TypedValue.applyDimension(1, 3.0f, context2.getResources().getDisplayMetrics()) / 2;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e8, context2);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e8, new C1361400lX0(context2, R.style.xx));
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = -1;
            }
        }
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        setProgressDrawable(new Drawable(fApplyDimension, iIntValue, iLIZIZ) { // from class: X.0FF0
            public final float LIZ;
            public final int LIZJ;
            public final Paint LJFF;
            public final Paint LJI;
            public final boolean LIZIZ = false;
            public final Path LIZLLL = new Path();
            public final RectF LJ = new RectF();

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                int alpha = this.LJFF.getAlpha();
                if (alpha != 0) {
                    return alpha != 255 ? -3 : -1;
                }
                return -2;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                canvas.drawPath(this.LIZLLL, this.LJI);
                canvas.drawPath(this.LIZLLL, this.LJFF);
            }

            @Override // android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                Path path = this.LIZLLL;
                path.rewind();
                if (this.LIZIZ) {
                    float fHeight = rect.height() / 2.0f;
                    this.LIZLLL.reset();
                    int i2 = rect.left;
                    int i3 = this.LIZJ;
                    this.LIZLLL.addRoundRect(new RectF(new Rect(i2 + i3, rect.top, rect.right - i3, rect.bottom)), fHeight, fHeight, Path.Direction.CW);
                } else {
                    RectF rectF = this.LJ;
                    int i4 = rect.left;
                    float f = this.LIZ;
                    int i5 = rect.top;
                    int i6 = rect.bottom;
                    rectF.set(i4 - f, ((i5 + i6) / 2.0f) - f, i4 + f, ((i5 + i6) / 2.0f) + f);
                    path.arcTo(this.LJ, 90.0f, 180.0f, false);
                    this.LJ.set(rect.right - (rect.height() / 2.0f), rect.top, rect.right + (rect.height() / 2.0f), rect.bottom);
                    path.arcTo(this.LJ, -90.0f, 180.0f, false);
                    path.close();
                }
                path.setFillType(Path.FillType.WINDING);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i2) {
                this.LJFF.setAlpha(i2);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LJFF.setColorFilter(colorFilter);
                invalidateSelf();
            }

            {
                this.LIZ = fApplyDimension;
                this.LIZJ = iLIZIZ;
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(iIntValue);
                this.LJFF = paint;
                Paint paint2 = new Paint(1);
                paint2.setColor(1073741824);
                paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                paint2.setMaskFilter(new BlurMaskFilter(2.236068f, BlurMaskFilter.Blur.OUTER));
                this.LJI = paint2;
            }
        });
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationX(fLIZIZ);
    }
}
