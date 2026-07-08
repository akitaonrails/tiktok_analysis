package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0EfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370250EfP extends View {
    public final Paint LL;
    public final Path LLILLJJLI;
    public final RectF LLILLL;
    public final RectF LLILZ;
    public final RectF LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;

    public final float LIZ(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() > 0 && getHeight() > 0) {
            this.LLILLL.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            if (this.LLILLL.width() > 0.0f && this.LLILLL.height() > 0.0f) {
                Path path = this.LLILLJJLI;
                RectF rectF = this.LLILLL;
                float fMin = Math.min(LIZ(3.0f), Math.min(rectF.width() * 0.25f, rectF.height() * 0.25f));
                this.LLILZ.set(rectF.centerX() - fMin, rectF.top, rectF.centerX() + fMin, rectF.top + (fMin * 2.0f));
                this.LLILZIL.set(rectF.left, rectF.top + (rectF.height() * 0.3f), rectF.right, rectF.bottom);
                C349390Dmr c349390DmrLIZJ = LIZJ(this.LLILZ, 225.0f);
                C349390Dmr c349390DmrLIZJ2 = LIZJ(this.LLILZ, 315.0f);
                C349390Dmr c349390DmrLIZJ3 = LIZJ(this.LLILZIL, 45.0f);
                C349390Dmr c349390DmrLIZJ4 = LIZJ(this.LLILZIL, 135.0f);
                C349390Dmr c349390DmrLIZIZ = LIZIZ(this.LLILZ, 315.0f);
                C349390Dmr c349390DmrLIZIZ2 = LIZIZ(this.LLILZ, 225.0f);
                C349390Dmr c349390DmrLIZIZ3 = LIZIZ(this.LLILZIL, 45.0f);
                C349390Dmr c349390DmrLIZIZ4 = LIZIZ(this.LLILZIL, 135.0f);
                float fMin2 = Math.min(rectF.width(), rectF.height()) * 0.28f;
                float fWidth = this.LLILZIL.width() * 0.18f;
                path.reset();
                path.moveTo(c349390DmrLIZJ.LIZ, c349390DmrLIZJ.LIZIZ);
                path.arcTo(this.LLILZ, 225.0f, 90.0f);
                float f = (c349390DmrLIZIZ.LIZ * fMin2) + c349390DmrLIZJ2.LIZ;
                float f2 = c349390DmrLIZJ2.LIZIZ + (c349390DmrLIZIZ.LIZIZ * fMin2);
                float f3 = c349390DmrLIZJ3.LIZ;
                float f4 = f3 - (c349390DmrLIZIZ3.LIZ * fWidth);
                float f5 = c349390DmrLIZJ3.LIZIZ;
                path.cubicTo(f, f2, f4, f5 - (c349390DmrLIZIZ3.LIZIZ * fWidth), f3, f5);
                path.arcTo(this.LLILZIL, 45.0f, 90.0f);
                float f6 = (c349390DmrLIZIZ4.LIZ * fWidth) + c349390DmrLIZJ4.LIZ;
                float f7 = (c349390DmrLIZIZ4.LIZIZ * fWidth) + c349390DmrLIZJ4.LIZIZ;
                float f8 = c349390DmrLIZJ.LIZ;
                float f9 = f8 - (c349390DmrLIZIZ2.LIZ * fMin2);
                float f10 = c349390DmrLIZJ.LIZIZ;
                path.cubicTo(f6, f7, f9, f10 - (c349390DmrLIZIZ2.LIZIZ * fMin2), f8, f10);
                path.close();
                int iSave = canvas.save();
                canvas.rotate(this.LLILZLL, getWidth() / 2.0f, getHeight() / 2.0f);
                try {
                    canvas.drawPath(this.LLILLJJLI, this.LL);
                    canvas.restoreToCount(iSave);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.LL.setColor(i);
        invalidate();
    }

    public final void setTiltDegree(float f) {
        this.LLILZLL = f;
        invalidate();
    }

    public C370250EfP(Context context, AttributeSet attributeSet) {
        ColorDrawable colorDrawable;
        Integer numValueOf;
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int iIntValue = -1;
        paint.setColor(-1);
        this.LL = paint;
        this.LLILLJJLI = new Path();
        this.LLILLL = new RectF();
        this.LLILZ = new RectF();
        this.LLILZIL = new RectF();
        this.LLILZLL = -15.0f;
        this.LLIZ = LIZ(24.0f);
        this.LLIZLLLIL = LIZ(24.0f);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.BubbleDropletView, 0, 0);
            this.LLILZLL = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleDropletView_bubbleDropletTiltDegree, -15.0f);
            this.LLIZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleDropletView_bubbleDropletWidth, LIZ(24.0f));
            this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.BubbleDropletView_bubbleDropletHeight, LIZ(24.0f));
            int i = R$styleable.BubbleDropletView_bubbleDropletColor;
            Drawable background = getBackground();
            if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null && (numValueOf = Integer.valueOf(colorDrawable.getColor())) != null) {
                iIntValue = numValueOf.intValue();
            }
            paint.setColor(typedArrayObtainStyledAttributes.getColor(i, iIntValue));
            typedArrayObtainStyledAttributes.recycle();
            Drawable background2 = getBackground();
            if ((background2 instanceof ColorDrawable) && background2 != null) {
                setBackground(null);
            }
        }
    }

    public static C349390Dmr LIZIZ(RectF rectF, float f) {
        double radians = Math.toRadians(f);
        float fSin = (-(rectF.width() / 2.0f)) * ((float) Math.sin(radians));
        float fHeight = (rectF.height() / 2.0f) * ((float) Math.cos(radians));
        float fHypot = (float) Math.hypot(fSin, fHeight);
        if (fHypot < 1.0E-4f) {
            fHypot = 1.0E-4f;
        }
        return new C349390Dmr(fSin / fHypot, fHeight / fHypot);
    }

    public static C349390Dmr LIZJ(RectF rectF, float f) {
        double radians = Math.toRadians(f);
        return new C349390Dmr(rectF.centerX() + ((rectF.width() / 2.0f) * ((float) Math.cos(radians))), rectF.centerY() + ((rectF.height() / 2.0f) * ((float) Math.sin(radians))));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(getPaddingLeft() + getPaddingRight() + ((int) this.LLIZ), i), View.resolveSize(getPaddingTop() + getPaddingBottom() + ((int) this.LLIZLLLIL), i2));
    }
}
