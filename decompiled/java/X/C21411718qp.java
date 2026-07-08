package X;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.widget.w;
import androidx.emoji2.text.e;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Locale;
import u4.q0;

/* JADX INFO: renamed from: X.18qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21411718qp extends CompoundButton {
    public static final C19LL LLLIIIIL = new C19LL(Float.class, 0);
    public static final int[] LLLIIIL = {R.attr.state_checked};
    public Drawable LL;
    public ColorStateList LLILLJJLI;
    public PorterDuff.Mode LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public Drawable LLILZLL;
    public ColorStateList LLIZ;
    public PorterDuff.Mode LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public CharSequence LLJJ;
    public CharSequence LLJJI;
    public CharSequence LLJJIII;
    public CharSequence LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public final int LLJJJ;
    public float LLJJJIL;
    public float LLJJJJ;
    public final VelocityTracker LLJJJJJIL;
    public final int LLJJJJLIIL;
    public float LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public final TextPaint LLJZ;
    public ColorStateList LLJZIJLIL;
    public Layout LLL;
    public Layout LLLF;
    public C497770Jfb LLLFF;
    public ObjectAnimator LLLFFI;
    public final w LLLFZ;
    public C21402418pK LLLI;
    public C21402718pN LLLII;
    public final Rect LLLIIII;
    public int mSwitchWidth;

    private C21402418pK getEmojiTextViewHelper() {
        if (this.LLLI == null) {
            this.LLLI = new C21402418pK(this);
        }
        return this.LLLI;
    }

    private boolean getTargetCheckedState() {
        return this.LLJJL > 0.5f;
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.LLILZLL;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.LLLIIII;
        drawable.getPadding(rect);
        Drawable drawable2 = this.LL;
        Rect rectLIZIZ = drawable2 != null ? C14SQ.LIZIZ(drawable2) : C14SQ.LIZJ;
        return ((((this.mSwitchWidth - this.LLJL) - rect.left) - rect.right) - rectLIZIZ.left) - rectLIZIZ.right;
    }

    public final void LIZ() {
        Drawable drawable = this.LL;
        if (drawable != null) {
            if (this.LLILZ || this.LLILZIL) {
                Drawable drawableMutate = drawable.mutate();
                this.LL = drawableMutate;
                if (this.LLILZ) {
                    C16GF.LJII(drawableMutate, this.LLILLJJLI);
                }
                if (this.LLILZIL) {
                    C16GF.LJIIIIZZ(this.LL, this.LLILLL);
                }
                if (this.LL.isStateful()) {
                    this.LL.setState(getDrawableState());
                }
            }
        }
    }

    public final void LIZIZ() {
        Drawable drawable = this.LLILZLL;
        if (drawable != null) {
            if (this.LLJ || this.LLJI) {
                Drawable drawableMutate = drawable.mutate();
                this.LLILZLL = drawableMutate;
                if (this.LLJ) {
                    C16GF.LJII(drawableMutate, this.LLIZ);
                }
                if (this.LLJI) {
                    C16GF.LJIIIIZZ(this.LLILZLL, this.LLIZLLLIL);
                }
                if (this.LLILZLL.isStateful()) {
                    this.LLILZLL.setState(getDrawableState());
                }
            }
        }
    }

    public final void LIZLLL() {
        setTextOnInternal(this.LLJJ);
        setTextOffInternal(this.LLJJIII);
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.13kx, X.18pN] */
    public final void LJ() {
        if (this.LLLII == null && this.LLLI.LIZIZ.LIZ.LIZIZ() && e.LJ()) {
            e eVarLIZ = e.LIZ();
            int iLIZJ = eVarLIZ.LIZJ();
            if (iLIZJ == 3 || iLIZJ == 0) {
                ?? r0 = new AbstractC20101313kx(this) { // from class: X.18pN
                    public final Reference<C21411718qp> LIZ;

                    @Override // X.AbstractC20101313kx
                    public final void LIZ() {
                        C21411718qp c21411718qp = this.LIZ.get();
                        if (c21411718qp != null) {
                            c21411718qp.LIZLLL();
                        }
                    }

                    @Override // X.AbstractC20101313kx
                    public final void LIZIZ() {
                        C21411718qp c21411718qp = this.LIZ.get();
                        if (c21411718qp != null) {
                            c21411718qp.LIZLLL();
                        }
                    }

                    {
                        this.LIZ = new WeakReference(this);
                    }
                };
                this.LLLII = r0;
                eVarLIZ.LJIIJ(r0);
            }
        }
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.LLJJL : this.LLJJL) * getThumbScrollRange()) + 0.5f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.LL;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.LLILZLL;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.LLJILJILJ : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.LLJILJILJ : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C21382118m3.LJIIIIZZ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.LLILZLL;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.LLLFFI;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.LLLFFI.end();
        this.LLLFFI = null;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean getShowText() {
        return this.LLJJIJIIJIL;
    }

    public boolean getSplitTrack() {
        return this.LLJILLL;
    }

    public int getSwitchMinWidth() {
        return this.LLJILJIL;
    }

    public int getSwitchPadding() {
        return this.LLJILJILJ;
    }

    public CharSequence getTextOff() {
        return this.LLJJIII;
    }

    public CharSequence getTextOn() {
        return this.LLJJ;
    }

    public Drawable getThumbDrawable() {
        return this.LL;
    }

    public final float getThumbPosition() {
        return this.LLJJL;
    }

    public int getThumbTextPadding() {
        return this.LLJIJIL;
    }

    public ColorStateList getThumbTintList() {
        return this.LLILLJJLI;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.LLILLL;
    }

    public Drawable getTrackDrawable() {
        return this.LLILZLL;
    }

    public ColorStateList getTrackTintList() {
        return this.LLIZ;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.LLIZLLLIL;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.LLJJIII = charSequence;
        C21402418pK emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodLJ = emojiTextViewHelper.LIZIZ.LIZ.LJ(this.LLLFF);
        if (transformationMethodLJ != null) {
            charSequence = transformationMethodLJ.getTransformation(charSequence, this);
        }
        this.LLJJIJI = charSequence;
        this.LLLF = null;
        if (this.LLJJIJIIJIL) {
            LJ();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.LLJJ = charSequence;
        C21402418pK emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodLJ = emojiTextViewHelper.LIZIZ.LIZ.LJ(this.LLLFF);
        if (transformationMethodLJ != null) {
            charSequence = transformationMethodLJ.getTransformation(charSequence, this);
        }
        this.LLJJI = charSequence;
        this.LLL = null;
        if (this.LLJJIJIIJIL) {
            LJ();
        }
    }

    public final Layout LIZJ(CharSequence charSequence) {
        int iCeil;
        TextPaint textPaint = this.LLJZ;
        if (charSequence != null) {
            iCeil = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            iCeil = 0;
        }
        return new StaticLayout(charSequence, textPaint, iCeil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rectLIZIZ;
        int i;
        int i2;
        Rect rect = this.LLLIIII;
        int i3 = this.LLJLIL;
        int i4 = this.LLJLILLLLZIIL;
        int i5 = this.LLJLL;
        int i6 = this.LLJLLIL;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.LL;
        if (drawable != null) {
            rectLIZIZ = C14SQ.LIZIZ(drawable);
        } else {
            rectLIZIZ = C14SQ.LIZJ;
        }
        Drawable drawable2 = this.LLILZLL;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectLIZIZ != null) {
                int i8 = rectLIZIZ.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectLIZIZ.top;
                int i10 = rect.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rectLIZIZ.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectLIZIZ.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.LLILZLL.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.LLILZLL.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.LL;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.LLJL + rect.right;
            this.LL.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C16GF.LJFF(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(iArrOnCreateDrawableState, LLLIIIL);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.LLLIIII;
        Drawable drawable = this.LLILZLL;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.LLJLILLLLZIIL;
        int i2 = this.LLJLLIL;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.LL;
        if (drawable != null) {
            if (this.LLJILLL && drawable2 != null) {
                Rect rectLIZIZ = C14SQ.LIZIZ(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectLIZIZ.left;
                rect.right -= rectLIZIZ.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                drawable.draw(canvas);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.LLL;
        } else {
            layout = this.LLLF;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.LLJZIJLIL;
            if (colorStateList != null) {
                this.LLJZ.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.LLJZ.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.LLJJ;
            } else {
                charSequence = this.LLJJIII;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.LLJJ;
        } else {
            charSequence = this.LLJJIII;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21411718qp.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().LIZJ(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence string = this.LLJJ;
                if (string == null) {
                    string = getResources().getString(2131822955);
                }
                q0.LJJIFFI(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string2 = this.LLJJIII;
            if (string2 == null) {
                string2 = getResources().getString(2131822954);
            }
            q0.LJJIFFI(this, string2);
        }
        float f = 1.0f;
        if (getWindowToken() != null && isLaidOut()) {
            if (!zIsChecked) {
                f = 0.0f;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, LLLIIIIL, f);
            this.LLLFFI = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(250L);
            this.LLLFFI.setAutoCancel(true);
            C786410Ut5.Pd(this.LLLFFI);
            return;
        }
        ObjectAnimator objectAnimator = this.LLLFFI;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!zIsChecked) {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C21382118m3.LJIIIZ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().LIZLLL(z);
        setTextOnInternal(this.LLJJ);
        setTextOffInternal(this.LLJJIII);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.LLJLLL = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().LIZ(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.LLJJIJIIJIL != z) {
            this.LLJJIJIIJIL = z;
            requestLayout();
            if (z) {
                LJ();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.LLJILLL = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.LLJILJIL = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.LLJILJILJ = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.LLJZ.getTypeface() != null && !this.LLJZ.getTypeface().equals(typeface)) || (this.LLJZ.getTypeface() == null && typeface != null)) {
            this.LLJZ.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.LLJJIII;
            if (string == null) {
                string = getResources().getString(2131822954);
            }
            q0.LJJIFFI(this, string);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.LLJJ;
            if (string == null) {
                string = getResources().getString(2131822955);
            }
            q0.LJJIFFI(this, string);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        if (this.LL != null) {
            this.LL.setCallback(null);
        }
        this.LL = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.LLJJL = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C14MI.LIZ(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.LLJIJIL = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.LLILLJJLI = colorStateList;
        this.LLILZ = true;
        LIZ();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.LLILLL = mode;
        this.LLILZIL = true;
        LIZ();
    }

    public void setTrackDrawable(Drawable drawable) {
        if (this.LLILZLL != null) {
            this.LLILZLL.setCallback(null);
        }
        this.LLILZLL = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C14MI.LIZ(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.LLIZ = colorStateList;
        this.LLJ = true;
        LIZIZ();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.LLIZLLLIL = mode;
        this.LLJI = true;
        LIZIZ();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.LL && drawable != this.LLILZLL) {
            return false;
        }
        return true;
    }

    public C21411718qp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.fpo);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.LL;
        if (drawable != null) {
            C16GF.LJ(drawable, f, f2);
        }
        Drawable drawable2 = this.LLILZLL;
        if (drawable2 != null) {
            C16GF.LJ(drawable2, f, f2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int iMax2;
        if (this.LLJJIJIIJIL) {
            if (this.LLL == null) {
                this.LLL = LIZJ(this.LLJJI);
            }
            if (this.LLLF == null) {
                this.LLLF = LIZJ(this.LLJJIJI);
            }
        }
        Rect rect = this.LLLIIII;
        Drawable drawable = this.LL;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.LL.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.LL.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.LLJJIJIIJIL) {
            iMax = Math.max(this.LLL.getWidth(), this.LLLF.getWidth()) + (this.LLJIJIL * 2);
        } else {
            iMax = 0;
        }
        this.LLJL = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.LLILZLL;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.LLILZLL.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax3 = rect.left;
        int iMax4 = rect.right;
        Drawable drawable3 = this.LL;
        if (drawable3 != null) {
            Rect rectLIZIZ = C14SQ.LIZIZ(drawable3);
            iMax3 = Math.max(iMax3, rectLIZIZ.left);
            iMax4 = Math.max(iMax4, rectLIZIZ.right);
        }
        if (this.LLJLLL) {
            iMax2 = Math.max(this.LLJILJIL, (this.LLJL * 2) + iMax3 + iMax4);
        } else {
            iMax2 = this.LLJILJIL;
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.mSwitchWidth = iMax2;
        this.LLJJLIIIJLLLLLLLZ = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.0Jfb] */
    public C21411718qp(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        Typeface typefaceCreate;
        int style;
        super(context, attributeSet, i);
        this.LLJJJJJIL = VelocityTracker.obtain();
        this.LLJLLL = true;
        this.LLLIIII = new Rect();
        C786410Ut5.t3(getContext());
        TextPaint textPaint = new TextPaint(1);
        this.LLJZ = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = R$styleable.SwitchCompat;
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context, attributeSet, iArr, i, 0);
        q0.LJIIZILJ(this, context, iArr, attributeSet, c21411918qrLJIILIIL.LIZIZ, i);
        Drawable drawableLJ = c21411918qrLJIILIIL.LJ(R$styleable.SwitchCompat_android_thumb);
        this.LL = drawableLJ;
        if (drawableLJ != null) {
            this.LL.setCallback(this);
        }
        Drawable drawableLJ2 = c21411918qrLJIILIIL.LJ(R$styleable.SwitchCompat_track);
        this.LLILZLL = drawableLJ2;
        if (drawableLJ2 != null) {
            this.LLILZLL.setCallback(this);
        }
        setTextOnInternal(c21411918qrLJIILIIL.LJIIJ(R$styleable.SwitchCompat_android_textOn));
        setTextOffInternal(c21411918qrLJIILIIL.LJIIJ(R$styleable.SwitchCompat_android_textOff));
        this.LLJJIJIIJIL = c21411918qrLJIILIIL.LIZ(R$styleable.SwitchCompat_showText, true);
        this.LLJIJIL = c21411918qrLJIILIIL.LIZLLL(R$styleable.SwitchCompat_thumbTextPadding, 0);
        this.LLJILJIL = c21411918qrLJIILIIL.LIZLLL(R$styleable.SwitchCompat_switchMinWidth, 0);
        this.LLJILJILJ = c21411918qrLJIILIIL.LIZLLL(R$styleable.SwitchCompat_switchPadding, 0);
        this.LLJILLL = c21411918qrLJIILIIL.LIZ(R$styleable.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListLIZIZ = c21411918qrLJIILIIL.LIZIZ(R$styleable.SwitchCompat_thumbTint);
        if (colorStateListLIZIZ != null) {
            this.LLILLJJLI = colorStateListLIZIZ;
            this.LLILZ = true;
        }
        PorterDuff.Mode modeLIZJ = C14SQ.LIZJ(c21411918qrLJIILIIL.LJII(R$styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.LLILLL != modeLIZJ) {
            this.LLILLL = modeLIZJ;
            this.LLILZIL = true;
        }
        if (this.LLILZ || this.LLILZIL) {
            LIZ();
        }
        ColorStateList colorStateListLIZIZ2 = c21411918qrLJIILIIL.LIZIZ(R$styleable.SwitchCompat_trackTint);
        if (colorStateListLIZIZ2 != null) {
            this.LLIZ = colorStateListLIZIZ2;
            this.LLJ = true;
        }
        PorterDuff.Mode modeLIZJ2 = C14SQ.LIZJ(c21411918qrLJIILIIL.LJII(R$styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.LLIZLLLIL != modeLIZJ2) {
            this.LLIZLLLIL = modeLIZJ2;
            this.LLJI = true;
        }
        if (this.LLJ || this.LLJI) {
            LIZIZ();
        }
        int iLJIIIIZZ = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.SwitchCompat_switchTextAppearance, 0);
        if (iLJIIIIZZ != 0) {
            C21411918qr c21411918qr = new C21411918qr(context, context.obtainStyledAttributes(iLJIIIIZZ, R$styleable.TextAppearance));
            ColorStateList colorStateListLIZIZ3 = c21411918qr.LIZIZ(R$styleable.TextAppearance_android_textColor);
            if (colorStateListLIZIZ3 != null) {
                this.LLJZIJLIL = colorStateListLIZIZ3;
            } else {
                this.LLJZIJLIL = getTextColors();
            }
            int iLIZLLL = c21411918qr.LIZLLL(R$styleable.TextAppearance_android_textSize, 0);
            if (iLIZLLL != 0) {
                float f = iLIZLLL;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int iLJII = c21411918qr.LJII(R$styleable.TextAppearance_android_typeface, -1);
            int iLJII2 = c21411918qr.LJII(R$styleable.TextAppearance_android_textStyle, -1);
            if (iLJII != 1) {
                if (iLJII != 2) {
                    if (iLJII != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (iLJII2 > 0) {
                if (typeface == null) {
                    typefaceCreate = Typeface.defaultFromStyle(iLJII2);
                } else {
                    typefaceCreate = Typeface.create(typeface, iLJII2);
                }
                setSwitchTypeface(typefaceCreate);
                if (typefaceCreate != null) {
                    style = typefaceCreate.getStyle();
                } else {
                    style = 0;
                }
                int i2 = (~style) & iLJII2;
                textPaint.setFakeBoldText((i2 & 1) != 0);
                textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (c21411918qr.LIZ(R$styleable.TextAppearance_textAllCaps, false)) {
                final Context context2 = getContext();
                this.LLLFF = new TransformationMethod(context2) { // from class: X.0Jfb
                    public final Locale LL;

                    @Override // android.text.method.TransformationMethod
                    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i3, Rect rect) {
                    }

                    {
                        this.LL = context2.getResources().getConfiguration().locale;
                    }

                    @Override // android.text.method.TransformationMethod
                    public final CharSequence getTransformation(CharSequence charSequence, View view) {
                        if (charSequence != null) {
                            return charSequence.toString().toUpperCase(this.LL);
                        }
                        return null;
                    }
                };
            } else {
                this.LLLFF = null;
            }
            setTextOnInternal(this.LLJJ);
            setTextOffInternal(this.LLJJIII);
            c21411918qr.LJIILJJIL();
        }
        this.LLLFZ = new w(this);
        this.LLLFZ.LJFF(attributeSet, i);
        c21411918qrLJIILIIL.LJIILJJIL();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LLJJJ = viewConfiguration.getScaledTouchSlop();
        this.LLJJJJLIIL = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().LIZIZ(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int iMax2;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        if (this.LL != null) {
            Rect rect = this.LLLIIII;
            Drawable drawable = this.LLILZLL;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectLIZIZ = C14SQ.LIZIZ(this.LL);
            iMax2 = Math.max(0, rectLIZIZ.left - rect.left);
            iMax = Math.max(0, rectLIZIZ.right - rect.right);
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax2;
            width = ((this.mSwitchWidth + paddingLeft) - iMax2) - iMax;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax;
            paddingLeft = (width - this.mSwitchWidth) + iMax2 + iMax;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i5 = this.LLJJLIIIJLLLLLLLZ;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.LLJJLIIIJLLLLLLLZ;
                this.LLJLIL = paddingLeft;
                this.LLJLILLLLZIIL = paddingTop;
                this.LLJLLIL = height;
                this.LLJLL = width;
            }
        } else {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i5 = this.LLJJLIIIJLLLLLLLZ;
            paddingTop = paddingTop2 - (i5 / 2);
        }
        height = i5 + paddingTop;
        this.LLJLIL = paddingLeft;
        this.LLJLILLLLZIIL = paddingTop;
        this.LLJLLIL = height;
        this.LLJLL = width;
    }
}
