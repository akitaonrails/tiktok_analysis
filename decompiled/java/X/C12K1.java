package X;

import Y.AUListenerS277S0100000_29;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.tools.beauty.views.SwitchButton$SavedState;

/* JADX INFO: renamed from: X.12K1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12K1 extends CompoundButton {
    public static final int[] LLLL = {R.attr.state_checked, R.attr.state_enabled, R.attr.state_pressed};
    public static final int[] LLLLII = {-16842912, R.attr.state_enabled, R.attr.state_pressed};
    public Drawable LL;
    public Drawable LLILLJJLI;
    public ColorStateList LLILLL;
    public ColorStateList LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public RectF LLIZ;
    public float LLIZLLLIL;
    public long LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public Drawable LLJJJ;
    public Drawable LLJJJIL;
    public RectF LLJJJJ;
    public RectF LLJJJJJIL;
    public RectF LLJJJJLIIL;
    public RectF LLJJL;
    public RectF LLJJLIIIJLLLLLLLZ;
    public Paint LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public ValueAnimator LLJLLIL;
    public float LLJLLL;
    public RectF LLJZ;
    public float LLJZIJLIL;
    public float LLL;
    public float LLLF;
    public int LLLFF;
    public int LLLFFI;
    public Paint LLLFZ;
    public CharSequence LLLI;
    public CharSequence LLLII;
    public TextPaint LLLIIII;
    public Layout LLLIIIIL;
    public Layout LLLIIIL;
    public float LLLIIL;
    public float LLLIILIL;
    public int LLLIL;
    public int LLLILZ;
    public int LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public RunnableC19379910rt LLLJIL;
    public CompoundButton.OnCheckedChangeListener LLLJL;

    public final void LIZLLL() {
        int i;
        if (this.LLJILJIL == 0 || (i = this.LLJILJILJ) == 0 || this.LLJILLL == 0 || this.LLJJ == 0) {
            return;
        }
        if (this.LLILZIL == -1.0f) {
            this.LLILZIL = Math.min(r3, i) / 2.0f;
        }
        if (this.LLILZLL == -1.0f) {
            this.LLILZLL = Math.min(this.LLJILLL, this.LLJJ) / 2.0f;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int iCeil = (int) Math.ceil((this.LLJILLL - Math.min(0.0f, this.LLIZ.left)) - Math.min(0.0f, this.LLIZ.right));
        float paddingTop = measuredHeight <= ((int) Math.ceil((this.LLJJ - Math.min(0.0f, this.LLIZ.top)) - Math.min(0.0f, this.LLIZ.bottom))) ? getPaddingTop() + Math.max(0.0f, this.LLIZ.top) : (((measuredHeight - r2) + 1) / 2.0f) + getPaddingTop() + Math.max(0.0f, this.LLIZ.top);
        float paddingLeft = measuredWidth <= this.LLJILLL ? getPaddingLeft() + Math.max(0.0f, this.LLIZ.left) : (((measuredWidth - iCeil) + 1) / 2.0f) + getPaddingLeft() + Math.max(0.0f, this.LLIZ.left);
        this.LLJJJJ.set(paddingLeft, paddingTop, this.LLJILJIL + paddingLeft, this.LLJILJILJ + paddingTop);
        RectF rectF = this.LLJJJJ;
        float f = rectF.left;
        RectF rectF2 = this.LLIZ;
        float f2 = f - rectF2.left;
        RectF rectF3 = this.LLJJJJJIL;
        float f3 = rectF.top;
        float f4 = rectF2.top;
        rectF3.set(f2, f3 - f4, this.LLJILLL + f2, (f3 - f4) + this.LLJJ);
        RectF rectF4 = this.LLJJJJLIIL;
        RectF rectF5 = this.LLJJJJ;
        rectF4.set(rectF5.left, 0.0f, (this.LLJJJJJIL.right - this.LLIZ.right) - rectF5.width(), 0.0f);
        this.LLILZLL = Math.min(Math.min(this.LLJJJJJIL.width(), this.LLJJJJJIL.height()) / 2.0f, this.LLILZLL);
        Drawable drawable = this.LLILLJJLI;
        if (drawable != null) {
            RectF rectF6 = this.LLJJJJJIL;
            drawable.setBounds((int) rectF6.left, (int) rectF6.top, (int) Math.ceil(rectF6.right), (int) Math.ceil(this.LLJJJJJIL.bottom));
        }
        if (this.LLLIIIIL != null) {
            RectF rectF7 = this.LLJJJJJIL;
            float fWidth = (rectF7.left + (((((rectF7.width() + this.LLLIL) - this.LLJILJIL) - this.LLIZ.right) - this.LLLIIIIL.getWidth()) / 2.0f)) - this.LLLILZJ;
            RectF rectF8 = this.LLJJJJJIL;
            float fHeight = rectF8.top + ((rectF8.height() - this.LLLIIIIL.getHeight()) / 2.0f);
            this.LLJJL.set(fWidth, fHeight, this.LLLIIIIL.getWidth() + fWidth, this.LLLIIIIL.getHeight() + fHeight);
        }
        if (this.LLLIIIL != null) {
            RectF rectF9 = this.LLJJJJJIL;
            float fWidth2 = ((rectF9.right - (((((rectF9.width() + this.LLLIL) - this.LLJILJIL) - this.LLIZ.left) - this.LLLIIIL.getWidth()) / 2.0f)) - this.LLLIIIL.getWidth()) + this.LLLILZJ;
            RectF rectF10 = this.LLJJJJJIL;
            float fHeight2 = rectF10.top + ((rectF10.height() - this.LLLIIIL.getHeight()) / 2.0f);
            this.LLJJLIIIJLLLLLLLZ.set(fWidth2, fHeight2, this.LLLIIIL.getWidth() + fWidth2, this.LLLIIIL.getHeight() + fHeight2);
        }
        this.LLLIZZ = true;
    }

    public PointF getBackSizeF() {
        return new PointF(this.LLJJJJJIL.width(), this.LLJJJJJIL.height());
    }

    public float getThumbHeight() {
        return this.LLJILJILJ;
    }

    public float getThumbWidth() {
        return this.LLJILJIL;
    }

    private boolean getStatusBasedOnPos() {
        return getProgress() > 0.5f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.LLJLIL || (colorStateList2 = this.LLILZ) == null) {
            setDrawableState(this.LL);
        } else {
            this.LLJJI = colorStateList2.getColorForState(getDrawableState(), this.LLJJI);
        }
        boolean zIsChecked = isChecked();
        int[] iArr = LLLLII;
        int[] iArr2 = LLLL;
        int[] iArr3 = zIsChecked ? iArr : iArr2;
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.LLJJIJIIJIL = textColors.getColorForState(iArr2, defaultColor);
            this.LLJJIJIL = textColors.getColorForState(iArr, defaultColor);
        }
        if (!this.LLJLILLLLZIIL && (colorStateList = this.LLILLL) != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), this.LLJJIII);
            this.LLJJIII = colorForState;
            this.LLJJIJI = this.LLILLL.getColorForState(iArr3, colorForState);
            return;
        }
        Drawable drawable = this.LLILLJJLI;
        if ((drawable instanceof StateListDrawable) && this.LLJI) {
            drawable.setState(iArr3);
            this.LLJJJIL = this.LLILLJJLI.getCurrent().mutate();
        } else {
            this.LLJJJIL = null;
        }
        setDrawableState(this.LLILLJJLI);
        Drawable drawable2 = this.LLILLJJLI;
        if (drawable2 != null) {
            this.LLJJJ = drawable2.getCurrent().mutate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SwitchButton$SavedState switchButton$SavedState = new SwitchButton$SavedState(super.onSaveInstanceState());
        switchButton$SavedState.LL = this.LLLI;
        switchButton$SavedState.LLILLJJLI = this.LLLII;
        return switchButton$SavedState;
    }

    private float getProgress() {
        return this.LLJLLL;
    }

    public long getAnimationDuration() {
        return this.LLJ;
    }

    public ColorStateList getBackColor() {
        return this.LLILLL;
    }

    public Drawable getBackDrawable() {
        return this.LLILLJJLI;
    }

    public float getBackRadius() {
        return this.LLILZLL;
    }

    public CharSequence getTextOff() {
        return this.LLLII;
    }

    public CharSequence getTextOn() {
        return this.LLLI;
    }

    public ColorStateList getThumbColor() {
        return this.LLILZ;
    }

    public Drawable getThumbDrawable() {
        return this.LL;
    }

    public RectF getThumbMargin() {
        return this.LLIZ;
    }

    public float getThumbRadius() {
        return this.LLILZIL;
    }

    public float getThumbRangeRatio() {
        return this.LLIZLLLIL;
    }

    public int getTintColor() {
        return this.LLJIJIL;
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b A[PHI: r1
      0x000b: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:3:0x0004, B:5:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setProgress(float r3) {
        /*
            r2 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lc
        Lb:
            r3 = r1
        Lc:
            r2.LLJLLL = r3
            r2.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12K1.setProgress(float):void");
    }

    public final void LIZIZ(boolean z) {
        ValueAnimator valueAnimator = this.LLJLLIL;
        if (valueAnimator == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.LLJLLIL.cancel();
        }
        this.LLJLLIL.setDuration(this.LLJ);
        if (z) {
            this.LLJLLIL.setFloatValues(this.LLJLLL, 1.0f);
        } else {
            this.LLJLLIL.setFloatValues(this.LLJLLL, 0.0f);
        }
        this.LLJLLIL.start();
    }

    public final Layout LIZJ(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT > 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.LLLIIII, (int) Math.ceil(Layout.getDesiredWidth(charSequence, r4))).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(1.1f, 0.0f).setIncludePad(false).build();
        }
        return null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Layout layout;
        RectF rectF;
        RectF rectF2;
        float progress;
        int i3;
        Drawable drawable;
        Drawable drawable2;
        super.onDraw(canvas);
        if (!this.LLLIZZ) {
            LIZLLL();
        }
        if (!this.LLLIZZ) {
            return;
        }
        if (this.LLJLILLLLZIIL) {
            if (this.LLJI && this.LLJJJ != null && this.LLJJJIL != null) {
                if (isChecked()) {
                    drawable = this.LLJJJ;
                } else {
                    drawable = this.LLJJJIL;
                }
                if (isChecked()) {
                    drawable2 = this.LLJJJIL;
                } else {
                    drawable2 = this.LLJJJ;
                }
                int progress2 = (int) (getProgress() * 255.0f);
                drawable.setAlpha(progress2);
                drawable.draw(canvas);
                drawable2.setAlpha(255 - progress2);
                drawable2.draw(canvas);
            } else {
                this.LLILLJJLI.setAlpha(255);
                this.LLILLJJLI.draw(canvas);
            }
        } else if (this.LLJI) {
            if (isChecked()) {
                i = this.LLJJIII;
            } else {
                i = this.LLJJIJI;
            }
            if (isChecked()) {
                i2 = this.LLJJIJI;
            } else {
                i2 = this.LLJJIII;
            }
            int progress3 = (int) (getProgress() * 255.0f);
            this.LLJL.setARGB((Color.alpha(i) * progress3) / 255, Color.red(i), Color.green(i), Color.blue(i));
            RectF rectF3 = this.LLJJJJJIL;
            float f = this.LLILZLL;
            canvas.drawRoundRect(rectF3, f, f, this.LLJL);
            this.LLJL.setARGB((Color.alpha(i2) * (255 - progress3)) / 255, Color.red(i2), Color.green(i2), Color.blue(i2));
            RectF rectF4 = this.LLJJJJJIL;
            float f2 = this.LLILZLL;
            canvas.drawRoundRect(rectF4, f2, f2, this.LLJL);
            this.LLJL.setAlpha(255);
        } else {
            this.LLJL.setColor(this.LLJJIII);
            RectF rectF5 = this.LLJJJJJIL;
            float f3 = this.LLILZLL;
            canvas.drawRoundRect(rectF5, f3, f3, this.LLJL);
        }
        if (getProgress() > 0.5d) {
            layout = this.LLLIIIIL;
        } else {
            layout = this.LLLIIIL;
        }
        if (getProgress() > 0.5d) {
            rectF = this.LLJJL;
        } else {
            rectF = this.LLJJLIIIJLLLLLLLZ;
        }
        if (layout != null && rectF != null) {
            if (getProgress() < 0.25d) {
                progress = 1.0f - (getProgress() * 4.0f);
            } else {
                progress = 0.0f;
            }
            if (getProgress() >= 0.75d) {
                progress = (getProgress() * 4.0f) - 3.0f;
            }
            int i4 = (int) (progress * 255.0f);
            if (getProgress() > 0.5d) {
                i3 = this.LLJJIJIIJIL;
            } else {
                i3 = this.LLJJIJIL;
            }
            layout.getPaint().setARGB((Color.alpha(i3) * i4) / 255, Color.red(i3), Color.green(i3), Color.blue(i3));
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            layout.draw(canvas);
            canvas.restore();
        }
        this.LLJZ.set(this.LLJJJJ);
        this.LLJZ.offset(this.LLJLLL * this.LLJJJJLIIL.width(), 0.0f);
        if (this.LLJLIL) {
            Drawable drawable3 = this.LL;
            RectF rectF6 = this.LLJZ;
            drawable3.setBounds((int) rectF6.left, (int) rectF6.top, (int) Math.ceil(rectF6.right), (int) Math.ceil(this.LLJZ.bottom));
            this.LL.draw(canvas);
        } else {
            this.LLJL.setColor(this.LLJJI);
            RectF rectF7 = this.LLJZ;
            float f4 = this.LLILZIL;
            canvas.drawRoundRect(rectF7, f4, f4, this.LLJL);
        }
        if (this.LLJLL) {
            this.LLLFZ.setColor(ColorProtector.parseColor("#AA0000"));
            canvas.drawRect(this.LLJJJJJIL, this.LLLFZ);
            this.LLLFZ.setColor(ColorProtector.parseColor("#0000FF"));
            canvas.drawRect(this.LLJZ, this.LLLFZ);
            this.LLLFZ.setColor(ColorProtector.parseColor("#000000"));
            RectF rectF8 = this.LLJJJJLIIL;
            float f5 = rectF8.left;
            float f6 = this.LLJJJJ.top;
            canvas.drawLine(f5, f6, rectF8.right, f6, this.LLLFZ);
            this.LLLFZ.setColor(ColorProtector.parseColor("#00CC00"));
            if (getProgress() > 0.5d) {
                rectF2 = this.LLJJL;
            } else {
                rectF2 = this.LLJJLIIIJLLLLLLLZ;
            }
            canvas.drawRect(rectF2, this.LLLFZ);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SwitchButton$SavedState switchButton$SavedState = (SwitchButton$SavedState) parcelable;
        CharSequence charSequence = switchButton$SavedState.LL;
        CharSequence charSequence2 = switchButton$SavedState.LLILLJJLI;
        this.LLLI = charSequence;
        this.LLLII = charSequence2;
        this.LLLIIIIL = null;
        this.LLLIIIL = null;
        this.LLLIZZ = false;
        requestLayout();
        invalidate();
        this.LLLILZLLLI = true;
        super.onRestoreInstanceState(switchButton$SavedState.getSuperState());
        this.LLLILZLLLI = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.10rt] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12K1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimationDuration(long j) {
        this.LLJ = j;
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.LLILLL = colorStateList;
        if (colorStateList != null) {
            setBackDrawable(null);
        }
        invalidate();
    }

    public void setBackColorRes(int i) {
        setBackColor(C838410Wul.LIZIZ(i, getContext()));
    }

    public void setBackDrawable(Drawable drawable) {
        boolean z;
        this.LLILLJJLI = drawable;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLILLLLZIIL = z;
        refreshDrawableState();
        this.LLLIZZ = false;
        requestLayout();
        invalidate();
    }

    public void setBackDrawableRes(int i) {
        setBackDrawable(C800330VaR.LIZIZ(getContext(), i));
    }

    public void setBackRadius(float f) {
        this.LLILZLL = f;
        if (!this.LLJLILLLLZIIL) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (isChecked() != z) {
            LIZIZ(z);
        }
        if (this.LLLILZLLLI) {
            setCheckedImmediatelyNoEvent(z);
        } else {
            super.setChecked(z);
        }
    }

    public void setCheckedImmediately(boolean z) {
        float f;
        super.setChecked(z);
        ValueAnimator valueAnimator = this.LLJLLIL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLJLLIL.cancel();
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        setProgress(f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z) {
        if (this.LLLJL == null) {
            setCheckedImmediately(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z);
        super.setOnCheckedChangeListener(this.LLLJL);
    }

    public void setCheckedNoEvent(boolean z) {
        if (this.LLLJL == null) {
            setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.LLLJL);
    }

    public void setDrawDebugRect(boolean z) {
        this.LLJLL = z;
        invalidate();
    }

    public void setFadeBack(boolean z) {
        this.LLJI = z;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.LLLJL = onCheckedChangeListener;
    }

    public void setTextAdjust(int i) {
        this.LLLILZJ = i;
        this.LLLIZZ = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i) {
        this.LLLILZ = i;
        this.LLLIZZ = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i) {
        this.LLLIL = i;
        this.LLLIZZ = false;
        requestLayout();
        invalidate();
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.LLILZ = colorStateList;
        if (colorStateList != null) {
            setThumbDrawable(null);
        }
        invalidate();
    }

    public void setThumbColorRes(int i) {
        setThumbColor(C838410Wul.LIZIZ(i, getContext()));
    }

    public void setThumbDrawable(Drawable drawable) {
        boolean z;
        this.LL = drawable;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLIL = z;
        refreshDrawableState();
        this.LLLIZZ = false;
        requestLayout();
        invalidate();
    }

    public void setThumbDrawableRes(int i) {
        setThumbDrawable(C800330VaR.LIZIZ(getContext(), i));
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            this.LLIZ.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.LLLIZZ = false;
            requestLayout();
            return;
        }
        this.LLIZ.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.LLLIZZ = false;
        requestLayout();
    }

    public void setThumbRadius(float f) {
        this.LLILZIL = f;
        if (!this.LLJLIL) {
            invalidate();
        }
    }

    public void setThumbRangeRatio(float f) {
        this.LLIZLLLIL = f;
        this.LLLIZZ = false;
        requestLayout();
    }

    public void setTintColor(int i) {
        this.LLJIJIL = i;
        this.LLILZ = C12K2.LIZIZ(i);
        this.LLILLL = C12K2.LIZ(this.LLJIJIL);
        this.LLJLILLLLZIIL = false;
        this.LLJLIL = false;
        refreshDrawableState();
        invalidate();
    }

    public C12K1(Context context, AttributeSet attributeSet) {
        int integer;
        float dimension;
        float dimension2;
        float f;
        float dimension3;
        String strXd;
        Drawable drawable;
        String strXd2;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int color;
        Drawable drawable2;
        float dimension4;
        float dimension5;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        float dimension6;
        boolean z;
        float dimension7;
        float dimension8;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        TypedArray typedArrayObtainStyledAttributes;
        TypedArray typedArrayObtainStyledAttributes2;
        super(context, attributeSet);
        this.LLLFF = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LLLFFI = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.LLJL = new Paint(1);
        Paint paint = new Paint(1);
        this.LLLFZ = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.LLLFZ.setStrokeWidth(getResources().getDisplayMetrics().density);
        this.LLLIIII = getPaint();
        this.LLJJJJ = new RectF();
        this.LLJJJJJIL = new RectF();
        this.LLJJJJLIIL = new RectF();
        this.LLIZ = new RectF();
        this.LLJJL = new RectF();
        this.LLJJLIIIJLLLLLLLZ = new RectF();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.0f).setDuration(250L);
        this.LLJLLIL = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.LLJLLIL.addUpdateListener(new AUListenerS277S0100000_29(this, 15));
        this.LLJZ = new RectF();
        float f2 = getResources().getDisplayMetrics().density * 2.0f;
        if (attributeSet != null && (typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, R$styleable.SwitchButton)) != null) {
            drawable = typedArrayObtainStyledAttributes2.getDrawable(R$styleable.SwitchButton_kswThumbDrawable);
            colorStateList2 = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.SwitchButton_kswThumbColor);
            float dimension9 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_kswThumbMargin, f2);
            dimension7 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_kswThumbMarginLeft, dimension9);
            dimension8 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_kswThumbMarginRight, dimension9);
            dimension5 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_kswThumbMarginTop, dimension9);
            dimension3 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_kswThumbMarginBottom, dimension9);
            dimension4 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_kswThumbWidth, 0.0f);
            dimension6 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_kswThumbHeight, 0.0f);
            dimension2 = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_kswThumbRadius, -1.0f);
            dimension = typedArrayObtainStyledAttributes2.getDimension(R$styleable.SwitchButton_kswBackRadius, -1.0f);
            drawable2 = typedArrayObtainStyledAttributes2.getDrawable(R$styleable.SwitchButton_kswBackDrawable);
            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.SwitchButton_kswBackColor);
            f = typedArrayObtainStyledAttributes2.getFloat(R$styleable.SwitchButton_kswThumbRangeRatio, 1.8f);
            integer = typedArrayObtainStyledAttributes2.getInteger(R$styleable.SwitchButton_kswAnimationDuration, 250);
            z = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.SwitchButton_kswFadeBack, true);
            color = typedArrayObtainStyledAttributes2.getColor(R$styleable.SwitchButton_kswTintColor, 0);
            strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes2, R$styleable.SwitchButton_kswTextOn);
            strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes2, R$styleable.SwitchButton_kswTextOff);
            dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.SwitchButton_kswTextThumbInset, 0);
            dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.SwitchButton_kswTextExtra, 0);
            dimensionPixelSize3 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.SwitchButton_kswTextAdjust, 0);
            typedArrayObtainStyledAttributes2.recycle();
        } else {
            integer = 250;
            dimension = -1.0f;
            dimension2 = -1.0f;
            f = 1.8f;
            dimension3 = 0.0f;
            strXd = null;
            drawable = null;
            strXd2 = null;
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
            dimensionPixelSize3 = 0;
            color = 0;
            drawable2 = null;
            dimension4 = 0.0f;
            dimension5 = 0.0f;
            colorStateList = null;
            colorStateList2 = null;
            dimension6 = 0.0f;
            z = true;
            dimension7 = 0.0f;
            dimension8 = 0.0f;
        }
        if (attributeSet != null && (typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.focusable, R.attr.clickable})) != null) {
            z2 = true;
            boolean z5 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            boolean z6 = typedArrayObtainStyledAttributes.getBoolean(1, z5);
            setFocusable(z5);
            setClickable(z6);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            z2 = true;
            setFocusable(true);
            setClickable(true);
        }
        this.LLLI = strXd2;
        this.LLLII = strXd;
        this.LLLIL = dimensionPixelSize;
        this.LLLILZ = dimensionPixelSize2;
        this.LLLILZJ = dimensionPixelSize3;
        this.LL = drawable;
        this.LLILZ = colorStateList2;
        if (drawable != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLJLIL = z3;
        this.LLJIJIL = color;
        if (color == 0) {
            Context context2 = getContext();
            TypedValue typedValue = new TypedValue();
            if (context2.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, z2)) {
                i = typedValue.data;
            } else {
                i = 3309506;
            }
            this.LLJIJIL = i;
        }
        if (!this.LLJLIL && this.LLILZ == null) {
            ColorStateList colorStateListLIZIZ = C12K2.LIZIZ(this.LLJIJIL);
            this.LLILZ = colorStateListLIZIZ;
            this.LLJJI = colorStateListLIZIZ.getDefaultColor();
        }
        this.LLJILJIL = (int) Math.ceil(dimension4);
        this.LLJILJILJ = (int) Math.ceil(dimension6);
        this.LLILLJJLI = drawable2;
        this.LLILLL = colorStateList;
        if (drawable2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LLJLILLLLZIIL = z4;
        if (!z4 && colorStateList == null) {
            ColorStateList colorStateListLIZ = C12K2.LIZ(this.LLJIJIL);
            this.LLILLL = colorStateListLIZ;
            int defaultColor = colorStateListLIZ.getDefaultColor();
            this.LLJJIII = defaultColor;
            this.LLJJIJI = this.LLILLL.getColorForState(LLLL, defaultColor);
        }
        this.LLIZ.set(dimension7, dimension5, dimension8, dimension3);
        this.LLIZLLLIL = this.LLIZ.width() >= 0.0f ? Math.max(f, 1.0f) : f;
        this.LLILZIL = dimension2;
        this.LLILZLL = dimension;
        long j = integer;
        this.LLJ = j;
        this.LLJI = z;
        this.LLJLLIL.setDuration(j);
        if (isChecked()) {
            setProgress(1.0f);
        }
    }

    public static /* synthetic */ void LIZ(C12K1 c12k1, ValueAnimator valueAnimator) {
        c12k1.getClass();
        c12k1.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        float width;
        float width2;
        float height;
        float height2;
        if (this.LLLIIIIL == null && !TextUtils.isEmpty(this.LLLI)) {
            this.LLLIIIIL = LIZJ(this.LLLI);
        }
        if (this.LLLIIIL == null && !TextUtils.isEmpty(this.LLLII)) {
            this.LLLIIIL = LIZJ(this.LLLII);
        }
        Layout layout = this.LLLIIIIL;
        if (layout != null) {
            width = layout.getWidth();
        } else {
            width = 0.0f;
        }
        Layout layout2 = this.LLLIIIL;
        if (layout2 != null) {
            width2 = layout2.getWidth();
        } else {
            width2 = 0.0f;
        }
        if (width == 0.0f && width2 == 0.0f) {
            this.LLLIIL = 0.0f;
        } else {
            this.LLLIIL = Math.max(width, width2);
        }
        Layout layout3 = this.LLLIIIIL;
        if (layout3 != null) {
            height = layout3.getHeight();
        } else {
            height = 0.0f;
        }
        Layout layout4 = this.LLLIIIL;
        if (layout4 != null) {
            height2 = layout4.getHeight();
        } else {
            height2 = 0.0f;
        }
        if (height == 0.0f && height2 == 0.0f) {
            this.LLLIILIL = 0.0f;
        } else {
            this.LLLIILIL = Math.max(height, height2);
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (this.LLJILJIL == 0 && this.LLJLIL) {
            this.LLJILJIL = this.LL.getIntrinsicWidth();
        }
        int iCeil = (int) Math.ceil(this.LLLIIL);
        if (this.LLIZLLLIL == 0.0f) {
            this.LLIZLLLIL = 1.8f;
        }
        if (mode == 1073741824) {
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            if (this.LLJILJIL != 0) {
                int iCeil2 = (int) Math.ceil(r0 * this.LLIZLLLIL);
                int i3 = this.LLLILZ + iCeil;
                int i4 = iCeil2 - this.LLJILJIL;
                RectF rectF = this.LLIZ;
                int iCeil3 = i3 - (i4 + ((int) Math.ceil(Math.max(rectF.left, rectF.right))));
                float f = iCeil2;
                RectF rectF2 = this.LLIZ;
                int iCeil4 = (int) Math.ceil(rectF2.left + f + rectF2.right + Math.max(iCeil3, 0));
                this.LLJILLL = iCeil4;
                if (iCeil4 < 0) {
                    this.LLJILJIL = 0;
                }
                if (f + Math.max(this.LLIZ.left, 0.0f) + Math.max(this.LLIZ.right, 0.0f) + Math.max(iCeil3, 0) > paddingLeft) {
                    this.LLJILJIL = 0;
                }
            }
            int iCeil5 = (int) Math.ceil((((size - getPaddingLeft()) - getPaddingRight()) - Math.max(this.LLIZ.left, 0.0f)) - Math.max(this.LLIZ.right, 0.0f));
            if (iCeil5 < 0) {
                this.LLJILJIL = 0;
                this.LLJILLL = 0;
            } else {
                float f2 = iCeil5;
                this.LLJILJIL = (int) Math.ceil(f2 / this.LLIZLLLIL);
                RectF rectF3 = this.LLIZ;
                int iCeil6 = (int) Math.ceil(f2 + rectF3.left + rectF3.right);
                this.LLJILLL = iCeil6;
                if (iCeil6 < 0) {
                    this.LLJILJIL = 0;
                    this.LLJILLL = 0;
                } else {
                    int i5 = iCeil + this.LLLILZ;
                    int i6 = iCeil5 - this.LLJILJIL;
                    RectF rectF4 = this.LLIZ;
                    int iCeil7 = i5 - (i6 + ((int) Math.ceil(Math.max(rectF4.left, rectF4.right))));
                    if (iCeil7 > 0) {
                        this.LLJILJIL -= iCeil7;
                    }
                    if (this.LLJILJIL < 0) {
                        this.LLJILJIL = 0;
                        this.LLJILLL = 0;
                    }
                }
            }
        } else {
            if (this.LLJILJIL == 0) {
                this.LLJILJIL = (int) Math.ceil(getResources().getDisplayMetrics().density * 20.0f);
            }
            if (this.LLIZLLLIL == 0.0f) {
                this.LLIZLLLIL = 1.8f;
            }
            int iCeil8 = (int) Math.ceil(this.LLJILJIL * this.LLIZLLLIL);
            float f3 = iCeil + this.LLLILZ;
            float f4 = iCeil8 - this.LLJILJIL;
            RectF rectF5 = this.LLIZ;
            int iCeil9 = (int) Math.ceil(f3 - ((f4 + Math.max(rectF5.left, rectF5.right)) + this.LLLIL));
            float f5 = iCeil8;
            RectF rectF6 = this.LLIZ;
            int iCeil10 = (int) Math.ceil(rectF6.left + f5 + rectF6.right + Math.max(0, iCeil9));
            this.LLJILLL = iCeil10;
            if (iCeil10 < 0) {
                this.LLJILJIL = 0;
                this.LLJILLL = 0;
            } else {
                int iCeil11 = (int) Math.ceil(f5 + Math.max(0.0f, this.LLIZ.left) + Math.max(0.0f, this.LLIZ.right) + Math.max(0, iCeil9));
                size = Math.max(iCeil11, getPaddingLeft() + iCeil11 + getPaddingRight());
            }
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.LLJILJILJ == 0 && this.LLJLIL) {
            this.LLJILJILJ = this.LL.getIntrinsicHeight();
        }
        if (mode2 == 1073741824) {
            if (this.LLJILJILJ != 0) {
                RectF rectF7 = this.LLIZ;
                this.LLJJ = (int) Math.ceil(r0 + rectF7.top + rectF7.bottom);
                this.LLJJ = (int) Math.ceil(Math.max(r2, this.LLLIILIL));
                if ((((r2 + getPaddingTop()) + getPaddingBottom()) - Math.min(0.0f, this.LLIZ.top)) - Math.min(0.0f, this.LLIZ.bottom) > size2) {
                    this.LLJILJILJ = 0;
                }
            }
            int iCeil12 = (int) Math.ceil(((size2 - getPaddingTop()) - getPaddingBottom()) + Math.min(0.0f, this.LLIZ.top) + Math.min(0.0f, this.LLIZ.bottom));
            this.LLJJ = iCeil12;
            if (iCeil12 < 0) {
                this.LLJJ = 0;
                this.LLJILJILJ = 0;
            } else {
                RectF rectF8 = this.LLIZ;
                int iCeil13 = (int) Math.ceil((iCeil12 - rectF8.top) - rectF8.bottom);
                this.LLJILJILJ = iCeil13;
                if (iCeil13 < 0) {
                    this.LLJJ = 0;
                    this.LLJILJILJ = 0;
                }
            }
        } else {
            if (this.LLJILJILJ == 0) {
                this.LLJILJILJ = (int) Math.ceil(getResources().getDisplayMetrics().density * 20.0f);
            }
            float f6 = this.LLJILJILJ;
            RectF rectF9 = this.LLIZ;
            int iCeil14 = (int) Math.ceil(f6 + rectF9.top + rectF9.bottom);
            this.LLJJ = iCeil14;
            if (iCeil14 < 0) {
                this.LLJJ = 0;
                this.LLJILJILJ = 0;
            } else {
                int iCeil15 = (int) Math.ceil(this.LLLIILIL - iCeil14);
                if (iCeil15 > 0) {
                    this.LLJJ += iCeil15;
                    this.LLJILJILJ += iCeil15;
                }
                int iMax = Math.max(this.LLJILJILJ, this.LLJJ);
                size2 = Math.max(Math.max(iMax, getPaddingTop() + iMax + getPaddingBottom()), getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            LIZLLL();
        }
    }
}
