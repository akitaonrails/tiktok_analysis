package X;

import Y.ATListenerS348S0200000_29;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19724112Fb extends View {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public final TuxTextView LLJJIJIL;
    public int LLJJJ;
    public InterfaceC19724212Fc LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final Paint LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public final PorterDuffXfermode LLJZ;

    public final InterfaceC19724412Fe getIndicatorTransform() {
        return null;
    }

    public final int getActiveRailColor() {
        return this.LL;
    }

    public final int getClickHotspotHeight() {
        return this.LLJ;
    }

    public final boolean getHasActiveRail() {
        return this.LLJJJJJIL;
    }

    public final boolean getHasIndicator() {
        return this.LLJJI;
    }

    public final boolean getHasSteppedDot() {
        return this.LLJJJJ;
    }

    public final int getIndicator() {
        return this.LLJJIJI;
    }

    public final int getIndicatorColor() {
        return this.LLILZ;
    }

    public final int getIndicatorFont() {
        return this.LLJJJ;
    }

    public final int getKnobAndIndicatorMargin() {
        return this.LLJJIJIIJIL;
    }

    public final int getKnobColor() {
        return this.LLILLL;
    }

    public final int getKnobRadius() {
        return this.LLILZLL;
    }

    public final int getKnobShadowColor() {
        return this.LLILZIL;
    }

    public final int getKnobShadowOffsetX() {
        return this.LLJIJIL;
    }

    public final int getKnobShadowOffsetY() {
        return this.LLJILJIL;
    }

    public final int getKnobShadowRadius() {
        return this.LLJI;
    }

    public final int getMax() {
        return this.LLJILLL;
    }

    public final int getMin() {
        return this.LLJILJILJ;
    }

    public final InterfaceC19724212Fc getOnSliderListener() {
        return this.LLJJJIL;
    }

    public final int getRailColor() {
        return this.LLILLJJLI;
    }

    public final int getRailHeight() {
        return this.LLIZLLLIL;
    }

    public final int getStep() {
        return this.LLJJ;
    }

    public final int getSteppedDotDiameter() {
        return this.LLIZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (this.LLJLIL <= 0) {
            return;
        }
        int i2 = this.LLJILLL;
        int i3 = this.LLJILJILJ;
        int i4 = this.LLJJ;
        float f3 = ((i2 - ((i2 - i3) % i4)) - i3) / i4;
        float f4 = ((this.LLJJIJI - i3) / i4) / f3;
        if (getLayoutDirection() == 1) {
            f = this.LLJJLIIIJLLLLLLLZ;
            f2 = this.LLJLIL * (1 - f4);
        } else {
            f = this.LLJJLIIIJLLLLLLLZ;
            f2 = this.LLJLIL * f4;
        }
        float f5 = f + f2;
        if (this.LLJJI) {
            TuxTextView tuxTextView = this.LLJJIJIL;
            int i5 = this.LLJJJJLIIL;
            tuxTextView.measure(i5, i5);
            int measuredWidth = this.LLJJIJIL.getMeasuredWidth();
            if (measuredWidth % 2 == 0) {
                i = measuredWidth / 2;
            } else {
                i = (measuredWidth / 2) + 1;
            }
            int measuredWidth2 = ((int) f5) - i;
            int measuredWidth3 = this.LLJJIJIL.getMeasuredWidth() + measuredWidth2;
            if (measuredWidth >= this.LLJLLL) {
                measuredWidth2 = this.LLJLL;
            } else {
                int i6 = this.LLJLL;
                if (measuredWidth2 < i6) {
                    measuredWidth2 = i6;
                } else {
                    int i7 = this.LLJLLIL;
                    if (measuredWidth3 > i7) {
                        measuredWidth2 = i7 - this.LLJJIJIL.getMeasuredWidth();
                    }
                }
            }
            this.LLJJIJIL.measure(View.MeasureSpec.makeMeasureSpec(this.LLJLLL, Integer.MIN_VALUE), this.LLJJJJLIIL);
            TuxTextView tuxTextView2 = this.LLJJIJIL;
            tuxTextView2.layout(0, 0, tuxTextView2.getMeasuredWidth(), this.LLJJIJIL.getMeasuredHeight());
            canvas2.translate(measuredWidth2, ((this.LLJLILLLLZIIL - this.LLILZLL) - this.LLJJIJIIJIL) - this.LLJJIJIL.getMeasuredHeight());
            this.LLJJIJIL.draw(canvas2);
            canvas2.translate(-measuredWidth2, -(((this.LLJLILLLLZIIL - this.LLILZLL) - this.LLJJIJIIJIL) - this.LLJJIJIL.getMeasuredHeight()));
        }
        int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LLJJL, 31);
        this.LLJJL.setColor(this.LLILLJJLI);
        float f6 = this.LLJJLIIIJLLLLLLLZ;
        int i8 = this.LLJLILLLLZIIL;
        canvas2.drawLine(f6, i8, this.LLJL, i8, this.LLJJL);
        if (this.LLJJJJ) {
            this.LLJJL.setXfermode(this.LLJZ);
            int i9 = this.LLJILJILJ;
            while (i9 <= this.LLJILLL) {
                canvas2.drawCircle(this.LLJJLIIIJLLLLLLLZ + (this.LLJLIL * (((i9 - this.LLJILJILJ) / this.LLJJ) / f3)), this.LLJLILLLLZIIL, this.LLIZ / 2, this.LLJJL);
                i9 += this.LLJJ;
            }
            this.LLJJL.setXfermode(null);
        }
        if (this.LLJJJJJIL) {
            this.LLJJL.setColor(this.LL);
            if (getLayoutDirection() == 1) {
                int i10 = this.LLJLILLLLZIIL;
                canvas2 = canvas2;
                canvas2.drawLine(f5, i10, this.LLJL, i10, this.LLJJL);
            } else {
                float f7 = this.LLJJLIIIJLLLLLLLZ;
                int i11 = this.LLJLILLLLZIIL;
                canvas2 = canvas2;
                canvas2.drawLine(f7, i11, f5, i11, this.LLJJL);
            }
            if (this.LLJJJJ) {
                this.LLJJL.setXfermode(this.LLJZ);
                int i12 = this.LLJILJILJ;
                if (getLayoutDirection() == 1) {
                    while (i12 <= this.LLJJIJI) {
                        canvas2.drawCircle(this.LLJJLIIIJLLLLLLLZ + (this.LLJLIL * (1 - (((i12 - this.LLJILJILJ) / this.LLJJ) / f3))), this.LLJLILLLLZIIL, this.LLIZ / 2, this.LLJJL);
                        i12 += this.LLJJ;
                    }
                } else {
                    while (i12 <= this.LLJJIJI) {
                        canvas2.drawCircle(this.LLJJLIIIJLLLLLLLZ + (this.LLJLIL * (((i12 - this.LLJILJILJ) / this.LLJJ) / f3)), this.LLJLILLLLZIIL, this.LLIZ / 2, this.LLJJL);
                        i12 += this.LLJJ;
                    }
                }
                this.LLJJL.setXfermode(null);
            }
        }
        canvas2.restoreToCount(iSaveLayer);
        this.LLJJL.setColor(this.LLILLL);
        if (getLayoutDirection() == 1) {
            this.LLJJL.setShadowLayer(this.LLJI, -this.LLJIJIL, this.LLJILJIL, this.LLILZIL);
        } else {
            this.LLJJL.setShadowLayer(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLILZIL);
        }
        canvas2.drawCircle(f5, this.LLJLILLLLZIIL, this.LLILZLL, this.LLJJL);
        this.LLJJL.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void setActiveRailColor(int i) {
        this.LL = i;
        invalidate();
    }

    public final void setClickHotspotHeight(int i) {
        this.LLJ = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f);
        super.setEnabled(z);
    }

    public final void setHasActiveRail(boolean z) {
        this.LLJJJJJIL = z;
        invalidate();
    }

    public final void setHasIndicator(boolean z) {
        this.LLJJI = z;
        requestLayout();
    }

    public final void setHasSteppedDot(boolean z) {
        this.LLJJJJ = z;
        invalidate();
    }

    public final void setIndicator(int i) {
        InterfaceC19724212Fc interfaceC19724212Fc;
        int i2;
        int i3 = this.LLJILJILJ;
        if (i >= i3) {
            int i4 = this.LLJILLL;
            int i5 = this.LLJJ;
            int i6 = i4 - ((i4 - i3) % i5);
            if (i > i6) {
                i3 = i6;
            } else {
                int i7 = (i - i3) % i5;
                if (i7 < i5 / 2.0f) {
                    i2 = i - i7;
                } else {
                    i2 = i + (i5 - i7);
                }
                i3 = i2;
            }
        }
        if (this.LLJJIJI != i3 && (interfaceC19724212Fc = this.LLJJJIL) != null) {
            interfaceC19724212Fc.LIZJ(i3, this.LLJJIII);
        }
        this.LLJJIJI = i3;
        this.LLJJIJIL.setText(String.valueOf(i3));
        invalidate();
    }

    public final void setIndicatorColor(int i) {
        this.LLILZ = i;
        this.LLJJIJIL.setTextColor(i);
        invalidate();
    }

    public final void setIndicatorFont(int i) {
        this.LLJJJ = i;
        this.LLJJIJIL.setTuxFont(i);
        requestLayout();
    }

    public final void setIndicatorTransform(InterfaceC19724412Fe interfaceC19724412Fe) {
        setIndicator(this.LLJJIJI);
    }

    public final void setKnobAndIndicatorMargin(int i) {
        this.LLJJIJIIJIL = i;
        requestLayout();
    }

    public final void setKnobColor(int i) {
        this.LLILLL = i;
        invalidate();
    }

    public final void setKnobRadius(int i) {
        this.LLILZLL = i;
        requestLayout();
    }

    public final void setKnobShadowColor(int i) {
        this.LLILZIL = i;
        invalidate();
    }

    public final void setKnobShadowOffsetX(int i) {
        this.LLJIJIL = i;
        requestLayout();
    }

    public final void setKnobShadowOffsetY(int i) {
        this.LLJILJIL = i;
        requestLayout();
    }

    public final void setKnobShadowRadius(int i) {
        this.LLJI = i;
        requestLayout();
    }

    public final void setMax(int i) {
        this.LLJILLL = Math.max(0, i);
        setIndicator(this.LLJJIJI);
    }

    public final void setMin(int i) {
        this.LLJILJILJ = Math.max(0, i);
        setIndicator(this.LLJJIJI);
    }

    public final void setOnSliderListener(InterfaceC19724212Fc interfaceC19724212Fc) {
        this.LLJJJIL = interfaceC19724212Fc;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(new ATListenerS348S0200000_29(this, onTouchListener, 0));
    }

    public final void setRailColor(int i) {
        this.LLILLJJLI = i;
        invalidate();
    }

    public final void setRailHeight(int i) {
        this.LLIZLLLIL = i;
        this.LLJJL.setStrokeWidth(i);
        invalidate();
    }

    public final void setStep(int i) {
        this.LLJJ = Math.max(1, i);
        setIndicator(this.LLJJIJI);
    }

    public final void setSteppedDotDiameter(int i) {
        this.LLIZ = i;
        invalidate();
    }

    public C19724112Fb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.y1);
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        this.LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        this.LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        this.LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLJILLL = 100;
        this.LLJJ = 1;
        this.LLJJI = true;
        this.LLJJIJI = this.LLJILJILJ;
        this.LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-2, -2));
        tuxTextView.setText(String.valueOf(this.LLJJIJI));
        tuxTextView.setTextColor(this.LLILZ);
        tuxTextView.setMaxLines(1);
        this.LLJJIJIL = tuxTextView;
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = View.MeasureSpec.makeMeasureSpec(10000, Integer.MIN_VALUE);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.LLIZLLLIL);
        this.LLJJL = paint;
        this.LLJZ = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxFreeSlider, R.attr.y1, 0);
        setHasSteppedDot(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxFreeSlider_tux_freeSliderHasSteppedDot, false));
        setHasActiveRail(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxFreeSlider_tux_freeSliderHasActiveRail, true));
        setActiveRailColor(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFreeSlider_tux_freeSliderActiveRailColor, 0));
        setRailColor(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFreeSlider_tux_freeSliderRailColor, 0));
        setKnobColor(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFreeSlider_tux_freeSliderKnobColor, 0));
        setIndicatorColor(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFreeSlider_tux_freeSliderIndicatorColor, 0));
        setKnobShadowColor(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFreeSlider_tux_freeSliderKnobShadowColor, 0));
        setKnobRadius((int) typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxFreeSlider_tux_freeSliderKnobRadius, C418440Gaw.LIZIZ(10)));
        setRailHeight((int) typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxFreeSlider_tux_freeSliderRailHeight, C418440Gaw.LIZIZ(3)));
        setClickHotspotHeight((int) typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxFreeSlider_tux_freeSliderClickHotspotHeight, C418440Gaw.LIZIZ(40)));
        setSteppedDotDiameter((int) typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxFreeSlider_tux_freeSliderSteppedDotDiameter, C418440Gaw.LIZIZ(7)));
        setKnobShadowRadius((int) typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxFreeSlider_tux_freeSliderKnobRadius, C418440Gaw.LIZIZ(8)));
        setKnobShadowOffsetX((int) typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxFreeSlider_tux_freeSliderKnobShadowOffsetX, 0.0f));
        setKnobShadowOffsetY((int) typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxFreeSlider_tux_freeSliderKnobShadowOffsetY, C418440Gaw.LIZIZ(2)));
        setMin(typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxFreeSlider_tux_freeSliderMin, 0));
        setMax(typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxFreeSlider_tux_freeSliderMax, 100));
        setStep(typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxFreeSlider_tux_freeSliderStep, 1));
        setHasIndicator(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxFreeSlider_tux_freeSliderHasIndicator, true));
        setIndicator(typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxFreeSlider_tux_freeSliderIndicator, 0));
        setKnobAndIndicatorMargin((int) typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxFreeSlider_tux_freeSliderKnobAndIndicatorMargin, C418440Gaw.LIZIZ(2)));
        setIndicatorFont(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFreeSlider_tux_freeSliderIndicatorFont, 0));
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingRight;
        int paddingTop;
        int paddingBottom;
        int paddingLeft2;
        int paddingRight2;
        int size = View.MeasureSpec.getSize(i);
        int iAbs = this.LLILZLL + this.LLJI + Math.abs(this.LLJIJIL);
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        this.LLJJLIIIJLLLLLLLZ = paddingLeft + iAbs;
        if (getLayoutDirection() == 1) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int i3 = size - (iAbs + paddingRight);
        this.LLJL = i3;
        this.LLJLIL = i3 - this.LLJJLIIIJLLLLLLLZ;
        int i4 = this.LLJI - this.LLJILJIL;
        if (i4 > 0) {
            paddingTop = getPaddingTop() + this.LLILZLL + i4;
        } else {
            paddingTop = this.LLILZLL + getPaddingTop();
        }
        this.LLJLILLLLZIIL = paddingTop;
        this.LLJLILLLLZIIL = Math.max(this.LLJ / 2, paddingTop);
        if (this.LLJJI) {
            TuxTextView tuxTextView = this.LLJJIJIL;
            int i5 = this.LLJJJJLIIL;
            tuxTextView.measure(i5, i5);
            this.LLJLILLLLZIIL = Math.max(getPaddingTop() + this.LLJJIJIL.getMeasuredHeight() + this.LLJJIJIIJIL + this.LLILZLL, this.LLJLILLLLZIIL);
            if (getLayoutDirection() == 1) {
                paddingLeft2 = getPaddingRight();
            } else {
                paddingLeft2 = getPaddingLeft();
            }
            this.LLJLL = paddingLeft2;
            if (getLayoutDirection() == 1) {
                paddingRight2 = getPaddingLeft();
            } else {
                paddingRight2 = getPaddingRight();
            }
            int i6 = size - paddingRight2;
            this.LLJLLIL = i6;
            this.LLJLLL = i6 - this.LLJLL;
        }
        int i7 = this.LLJI + this.LLJILJIL;
        if (i7 > 0) {
            paddingBottom = getPaddingBottom() + this.LLILZLL + i7;
        } else {
            paddingBottom = this.LLILZLL + getPaddingBottom();
        }
        int iMax = Math.max(this.LLJ / 2, paddingBottom);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size2 = this.LLJLILLLLZIIL + iMax;
        }
        setMeasuredDimension(size, size2);
    }
}
