package X;

import Y.AAListenerS17S0100001_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Gov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427110Gov extends TuxTextView {
    public static final float LLJLIL = C418440Gaw.LIZIZ(4);
    public static final float LLJLILLLLZIIL = C418440Gaw.LIZIZ(Float.valueOf(8.5f));
    public static final float LLJLL = C418440Gaw.LIZIZ(2);
    public final Integer LLJJJJ;
    public final Paint LLJJJJJIL;
    public final RectF LLJJJJLIIL;
    public EnumC429000Gry LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public ValueAnimator LLJL;

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.LLJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJL = null;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LJJJJJ(this.LLJJLIIIJLLLLLLLZ);
        invalidate();
    }

    public final void LJJJJJ(float f) {
        GradientDrawable gradientDrawable;
        try {
            Drawable background = getBackground();
            Drawable drawableMutate = null;
            if (background != null) {
                drawableMutate = background.mutate();
                float f2 = 1.0f + ((-0.8f) * f);
                if (drawableMutate != null) {
                    drawableMutate.setAlpha(C814420VxA.LIZIZ(255 * f2));
                }
            }
            float f3 = LLJLIL;
            float height = getHeight() / 2.0f;
            if ((drawableMutate instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableMutate) != null) {
                gradientDrawable.setCornerRadius(f3 + ((height - f3) * f));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        Integer numValueOf;
        GradientDrawable gradientDrawable;
        ColorStateList color;
        float f = this.LLJJLIIIJLLLLLLLZ;
        float fLIZLLL = 1.0f - C13LZ.LIZLLL(f / 0.55f, 0.0f, 1.0f);
        if (fLIZLLL == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            super.onDraw(canvas);
        } else if (fLIZLLL != 0.0f) {
            int iSaveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), C814420VxA.LIZIZ(255 * fLIZLLL));
            super.onDraw(canvas);
            canvas.restoreToCount(iSaveLayerAlpha);
        }
        float fLIZLLL2 = C13LZ.LIZLLL((f - 0.2f) / 0.8f, 0.0f, 1.0f);
        if (fLIZLLL2 > 0.0f) {
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable background = getBackground();
                if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null && (color = gradientDrawable.getColor()) != null) {
                    numValueOf = Integer.valueOf(color.getDefaultColor());
                } else {
                    numValueOf = this.LLJJJJ;
                }
            } else {
                numValueOf = this.LLJJJJ;
            }
            if (numValueOf != null) {
                float f2 = LLJLILLLLZIIL;
                float f3 = 0.72f * f2;
                float f4 = f3 + ((f2 - f3) * fLIZLLL2);
                float width = (getWidth() - f4) / 2.0f;
                float height = (getHeight() - f4) / 2.0f;
                this.LLJJJJLIIL.set(width, height, width + f4, f4 + height);
                Paint paint = this.LLJJJJJIL;
                int iIntValue = numValueOf.intValue();
                int iArgb = Color.argb(255, Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
                paint.setColor(Color.argb(C814420VxA.LIZIZ(Color.alpha(iArgb) * C13LZ.LIZLLL(fLIZLLL2, 0.0f, 1.0f)), Color.red(iArgb), Color.green(iArgb), Color.blue(iArgb)));
                RectF rectF = this.LLJJJJLIIL;
                float f5 = LLJLL;
                canvas.drawRoundRect(rectF, f5, f5, this.LLJJJJJIL);
            }
        }
    }

    public final void setMode(EnumC429000Gry enumC429000Gry) {
        Pair pair;
        if (enumC429000Gry == this.LLJJL) {
            return;
        }
        this.LLJJL = enumC429000Gry;
        int i = C427120Gow.LIZ[enumC429000Gry.ordinal()];
        if (i != 1) {
            if (i == 2) {
                pair = new Pair(Float.valueOf(0.0f), Float.valueOf(1.0f));
            } else {
                throw new C1954807lC();
            }
        } else {
            pair = new Pair(Float.valueOf(1.0f), Float.valueOf(0.0f));
        }
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        ValueAnimator valueAnimator = this.LLJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 20));
        valueAnimatorOfFloat.addListener(new AAListenerS17S0100001_6(this, fFloatValue2, 1));
        valueAnimatorOfFloat.addListener(new AAListenerS17S0100001_6(this, fFloatValue2, 0));
        valueAnimatorOfFloat.start();
        this.LLJL = valueAnimatorOfFloat;
    }

    public C427110Gov(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
        this.LLJJJJ = C1308910kAL.LIZJ(R.attr.gs, context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LLJJJJJIL = paint;
        this.LLJJJJLIIL = new RectF();
        this.LLJJL = EnumC429000Gry.TEXT;
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        String string;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (measuredHeight < suggestedMinimumHeight) {
            measuredHeight = suggestedMinimumHeight;
        }
        TextPaint paint = getPaint();
        CharSequence text = getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        int iCeil = ((int) Math.ceil(paint.measureText(string))) + getCompoundPaddingLeft() + getCompoundPaddingRight();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (iCeil < suggestedMinimumWidth) {
            iCeil = suggestedMinimumWidth;
        }
        setMeasuredDimension(TextView.resolveSize(C814420VxA.LIZIZ(iCeil + ((measuredHeight - iCeil) * this.LLJJLIIIJLLLLLLLZ)), i), measuredHeight);
    }
}
