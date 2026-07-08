package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.textfield.TextInputLayout$SavedState;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u4.q0;

/* JADX INFO: renamed from: X.19Su, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21543419Su extends LinearLayout {
    public final FrameLayout LL;
    public final LinearLayout LLILLJJLI;
    public final LinearLayout LLILLL;
    public final FrameLayout LLILZ;
    public EditText LLILZIL;
    public CharSequence LLILZLL;
    public final C21543719Sx LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public AppCompatTextView LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public CharSequence LLJILLL;
    public boolean LLJJ;
    public AppCompatTextView LLJJI;
    public ColorStateList LLJJIII;
    public int LLJJIJI;
    public ColorStateList LLJJIJIIJIL;
    public ColorStateList LLJJIJIL;
    public CharSequence LLJJJ;
    public final AppCompatTextView LLJJJIL;
    public CharSequence LLJJJJ;
    public final AppCompatTextView LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public CharSequence LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C21538919Rb LLJL;
    public C21538919Rb LLJLIL;
    public final C19RX LLJLILLLLZIIL;
    public final int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public int LLLF;
    public int LLLFF;
    public final Rect LLLFFI;
    public final Rect LLLFZ;
    public final RectF LLLI;
    public Typeface LLLII;
    public final C21545019Tk LLLIIII;
    public ColorStateList LLLIIIIL;
    public boolean LLLIIIL;
    public PorterDuff.Mode LLLIIL;
    public boolean LLLIILIL;
    public Drawable LLLIL;
    public int LLLILZ;
    public View.OnLongClickListener LLLILZJ;
    public final LinkedHashSet<C19TE> LLLILZLLLI;
    public int LLLIZZ;
    public final SparseArray<C19T9> LLLJ;
    public final C21545019Tk LLLJIL;
    public final LinkedHashSet<C19TF> LLLJL;
    public ColorStateList LLLL;
    public boolean LLLLII;
    public PorterDuff.Mode LLLLIIIILLL;
    public boolean LLLLIIL;
    public Drawable LLLLIILL;
    public int LLLLIILLL;
    public Drawable LLLLIL;
    public View.OnLongClickListener LLLLILI;
    public View.OnLongClickListener LLLLJ;
    public final C21545019Tk LLLLJI;
    public ColorStateList LLLLL;
    public ColorStateList LLLLLIL;
    public ColorStateList LLLLLILLIL;
    public int LLLLLJIL;
    public int LLLLLJLJLL;
    public int LLLLLL;
    public ColorStateList LLLLLLIL;
    public int LLLLLLJ;
    public int LLLLLLL;
    public int LLLLLLLLL;
    public int LLLLLLLLLL;
    public int LLLLLLLZIL;
    public boolean LLLLLLZ;
    public final C21543619Sw LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public ValueAnimator LLLLLZL;
    public boolean LLLLZ;
    public boolean LLLLZI;

    private C19T9 getEndIconDelegate() {
        C19T9 c19t9 = this.LLLJ.get(this.LLLIZZ);
        return c19t9 == null ? this.LLLJ.get(0) : c19t9;
    }

    private C21545019Tk getEndIconToUpdateDummyDrawable() {
        if (this.LLLLJI.getVisibility() == 0) {
            return this.LLLLJI;
        }
        if (this.LLLIZZ == 0 || !LJI()) {
            return null;
        }
        return this.LLLJIL;
    }

    public final void LIZIZ() {
        C21538919Rb c21538919Rb = this.LLJL;
        if (c21538919Rb == null) {
            return;
        }
        c21538919Rb.setShapeAppearanceModel(this.LLJLILLLLZIIL);
        if (this.LLJLLIL == 2 && this.LLJZ > -1 && this.LLLF != 0) {
            C21538919Rb c21538919Rb2 = this.LLJL;
            float f = this.LLJZ;
            int i = this.LLLF;
            c21538919Rb2.LL.LJIIJ = f;
            c21538919Rb2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
            C21539019Rc c21539019Rc = c21538919Rb2.LL;
            if (c21539019Rc.LIZLLL != colorStateListValueOf) {
                c21539019Rc.LIZLLL = colorStateListValueOf;
                c21538919Rb2.onStateChange(c21538919Rb2.getState());
            }
        }
        int iLJIIJ = this.LLLFF;
        if (this.LLJLLIL == 1) {
            TypedValue typedValueLIZ = C19PF.LIZ(R.attr.bix, getContext());
            iLJIIJ = C2441009hQ.LJIIJ(this.LLLFF, typedValueLIZ != null ? typedValueLIZ.data : 0);
        }
        this.LLLFF = iLJIIJ;
        this.LLJL.LJIIJJI(ColorStateList.valueOf(iLJIIJ));
        if (this.LLLIZZ == 3) {
            this.LLILZIL.getBackground().invalidateSelf();
        }
        C21538919Rb c21538919Rb3 = this.LLJLIL;
        if (c21538919Rb3 != null) {
            if (this.LLJZ > -1 && this.LLLF != 0) {
                c21538919Rb3.LJIIJJI(ColorStateList.valueOf(this.LLLF));
            }
            invalidate();
        }
        invalidate();
    }

    public final void LIZJ() {
        LIZLLL(this.LLLJIL, this.LLLLII, this.LLLL, this.LLLLIIL, this.LLLLIIIILLL);
    }

    public final int LJ() {
        float fLJFF;
        if (!this.LLJJJJLIIL) {
            return 0;
        }
        int i = this.LLJLLIL;
        if (i == 0 || i == 1) {
            fLJFF = this.LLLLLLZZ.LJFF();
        } else {
            if (i != 2) {
                return 0;
            }
            fLJFF = this.LLLLLLZZ.LJFF() / 2.0f;
        }
        return (int) fLJFF;
    }

    public final boolean LJFF() {
        return this.LLJJJJLIIL && !TextUtils.isEmpty(this.LLJJL) && (this.LLJL instanceof C21541319Rz);
    }

    public final boolean LJI() {
        return this.LLILZ.getVisibility() == 0 && this.LLLJIL.getVisibility() == 0;
    }

    public final void LJII() {
        int i = this.LLJLLIL;
        if (i == 0) {
            this.LLJL = null;
            this.LLJLIL = null;
        } else if (i == 1) {
            this.LLJL = new C21538919Rb(this.LLJLILLLLZIIL);
            this.LLJLIL = new C21538919Rb();
        } else {
            if (i != 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLJLLIL);
                sbLIZ.append(" is illegal; only @BoxBackgroundMode constants are supported.");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!this.LLJJJJLIIL || (this.LLJL instanceof C21541319Rz)) {
                this.LLJL = new C21538919Rb(this.LLJLILLLLZIIL);
            } else {
                this.LLJL = new C21541319Rz(this.LLJLILLLLZIIL);
            }
            this.LLJLIL = null;
        }
        EditText editText = this.LLILZIL;
        if (editText != null && this.LLJL != null && editText.getBackground() == null && this.LLJLLIL != 0) {
            this.LLILZIL.setBackground(this.LLJL);
        }
        LJJIFFI();
        if (this.LLJLLIL == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.LLJLLL = getResources().getDimensionPixelSize(R.dimen.a6x);
            } else if (C19RN.LJ(getContext())) {
                this.LLJLLL = getResources().getDimensionPixelSize(R.dimen.a6w);
            }
        }
        if (this.LLILZIL != null && this.LLJLLIL == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText2 = this.LLILZIL;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.a6v), this.LLILZIL.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.a6u));
            } else if (C19RN.LJ(getContext())) {
                EditText editText3 = this.LLILZIL;
                editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.a6t), this.LLILZIL.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.a6s));
            }
        }
        if (this.LLJLLIL != 0) {
            LJIIZILJ();
        }
    }

    public final void LJIILJJIL() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.LLJIJIL;
        if (appCompatTextView != null) {
            LJIIL(appCompatTextView, this.LLJI ? this.LLJILJIL : this.LLJILJILJ);
            if (!this.LLJI && (colorStateList2 = this.LLJJIJIIJIL) != null) {
                this.LLJIJIL.setTextColor(colorStateList2);
            }
            if (!this.LLJI || (colorStateList = this.LLJJIJIL) == null) {
                return;
            }
            this.LLJIJIL.setTextColor(colorStateList);
        }
    }

    public final boolean LJIILL() {
        boolean z;
        if (this.LLILZIL == null) {
            return false;
        }
        boolean z2 = true;
        if (!(getStartIconDrawable() == null && this.LLJJJ == null) && this.LLILLJJLI.getMeasuredWidth() > 0) {
            int measuredWidth = this.LLILLJJLI.getMeasuredWidth() - this.LLILZIL.getPaddingLeft();
            if (this.LLLIL == null || this.LLLILZ != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.LLLIL = colorDrawable;
                this.LLLILZ = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.LLILZIL.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.LLLIL;
            if (drawable != drawable2) {
                this.LLILZIL.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.LLLIL != null) {
                Drawable[] compoundDrawablesRelative2 = this.LLILZIL.getCompoundDrawablesRelative();
                this.LLILZIL.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.LLLIL = null;
                z = true;
            }
            z = false;
        }
        if ((this.LLLLJI.getVisibility() != 0 && ((this.LLLIZZ == 0 || !LJI()) && this.LLJJJJ == null)) || this.LLILLL.getMeasuredWidth() <= 0) {
            if (this.LLLLIILL == null) {
                return z;
            }
            Drawable[] compoundDrawablesRelative3 = this.LLILZIL.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative3[2] == this.LLLLIILL) {
                this.LLILZIL.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.LLLLIL, compoundDrawablesRelative3[3]);
            } else {
                z2 = z;
            }
            this.LLLLIILL = null;
            return z2;
        }
        int measuredWidth2 = this.LLJJJJJIL.getMeasuredWidth() - this.LLILZIL.getPaddingRight();
        C21545019Tk endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
        if (endIconToUpdateDummyDrawable != null) {
            measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart();
        }
        Drawable[] compoundDrawablesRelative4 = this.LLILZIL.getCompoundDrawablesRelative();
        Drawable drawable3 = this.LLLLIILL;
        if (drawable3 == null) {
            ColorDrawable colorDrawable2 = new ColorDrawable();
            this.LLLLIILL = colorDrawable2;
            this.LLLLIILLL = measuredWidth2;
            colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
        } else if (this.LLLLIILLL != measuredWidth2) {
            this.LLLLIILLL = measuredWidth2;
            drawable3.setBounds(0, 0, measuredWidth2, 1);
            this.LLILZIL.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.LLLLIILL, compoundDrawablesRelative4[3]);
            return true;
        }
        Drawable drawable4 = compoundDrawablesRelative4[2];
        Drawable drawable5 = this.LLLLIILL;
        if (drawable4 == drawable5) {
            return z;
        }
        this.LLLLIL = drawable4;
        this.LLILZIL.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], drawable5, compoundDrawablesRelative4[3]);
        return true;
    }

    public final void LJIILLIIL() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.LLILZIL;
        if (editText == null || this.LLJLLIL != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        Drawable drawableMutate = background.mutate();
        if (this.LLIZ.LJ()) {
            drawableMutate.setColorFilter(C14MG.LIZJ(this.LLIZ.LJI(), PorterDuff.Mode.SRC_IN));
        } else if (this.LLJI && (appCompatTextView = this.LLJIJIL) != null) {
            drawableMutate.setColorFilter(C14MG.LIZJ(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.LLILZIL.refreshDrawableState();
        }
    }

    public final void LJIIZILJ() {
        if (this.LLJLLIL != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LL.getLayoutParams();
            int iLJ = LJ();
            if (iLJ != layoutParams.topMargin) {
                layoutParams.topMargin = iLJ;
                this.LL.requestLayout();
            }
        }
    }

    public final void LJIJJ() {
        if (this.LLILZIL == null) {
            return;
        }
        this.LLJJJIL.setPaddingRelative(this.LLLIIII.getVisibility() != 0 ? this.LLILZIL.getPaddingStart() : 0, this.LLILZIL.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.a71), this.LLILZIL.getCompoundPaddingBottom());
    }

    public final void LJIJJLI() {
        C786410Ut5.LLIL(this.LLJJJIL, (this.LLJJJ == null || this.LLLLLLZ) ? 8 : 0);
        LJIILL();
    }

    public final void LJJ() {
        if (this.LLILZIL == null) {
            return;
        }
        int paddingEnd = 0;
        if (!LJI() && this.LLLLJI.getVisibility() != 0) {
            paddingEnd = this.LLILZIL.getPaddingEnd();
        }
        this.LLJJJJJIL.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.a71), this.LLILZIL.getPaddingTop(), paddingEnd, this.LLILZIL.getPaddingBottom());
    }

    public final void LJJI() {
        int visibility = this.LLJJJJJIL.getVisibility();
        boolean z = (this.LLJJJJ == null || this.LLLLLLZ) ? false : true;
        C786410Ut5.LLIL(this.LLJJJJJIL, z ? 0 : 8);
        if (visibility != this.LLJJJJJIL.getVisibility()) {
            getEndIconDelegate().LIZJ(z);
        }
        LJIILL();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI() {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21543419Su.LJJIFFI():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.LLLLZ) {
            return;
        }
        this.LLLLZ = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C21543619Sw c21543619Sw = this.LLLLLLZZ;
        boolean zLJIILL = c21543619Sw != null ? c21543619Sw.LJIILL(drawableState) : false;
        if (this.LLILZIL != null) {
            LJIJ(isLaidOut() && isEnabled(), false);
        }
        LJIILLIIL();
        LJJIFFI();
        if (zLJIILL) {
            invalidate();
        }
        this.LLLLZ = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.LLILZIL;
        return editText != null ? editText.getBaseline() + getPaddingTop() + LJ() : super.getBaseline();
    }

    public C21538919Rb getBoxBackground() {
        int i = this.LLJLLIL;
        if (i == 1 || i == 2) {
            return this.LLJL;
        }
        throw new IllegalStateException();
    }

    public float getBoxCornerRadiusBottomEnd() {
        C21538919Rb c21538919Rb = this.LLJL;
        return c21538919Rb.LL.LIZ.LJII.LIZ(c21538919Rb.LJI());
    }

    public float getBoxCornerRadiusBottomStart() {
        C21538919Rb c21538919Rb = this.LLJL;
        return c21538919Rb.LL.LIZ.LJI.LIZ(c21538919Rb.LJI());
    }

    public float getBoxCornerRadiusTopEnd() {
        C21538919Rb c21538919Rb = this.LLJL;
        return c21538919Rb.LL.LIZ.LJFF.LIZ(c21538919Rb.LJI());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.LLJL.LJII();
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.LLIZLLLIL && this.LLJI && (appCompatTextView = this.LLJIJIL) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public CharSequence getEndIconContentDescription() {
        return this.LLLJIL.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.LLLJIL.getDrawable();
    }

    public CharSequence getError() {
        C21543719Sx c21543719Sx = this.LLIZ;
        if (c21543719Sx.LJIIJ) {
            return c21543719Sx.LJIIIZ;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.LLIZ.LJIIL;
    }

    public int getErrorCurrentTextColors() {
        return this.LLIZ.LJI();
    }

    public Drawable getErrorIconDrawable() {
        return this.LLLLJI.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.LLIZ.LJI();
    }

    public CharSequence getHelperText() {
        C21543719Sx c21543719Sx = this.LLIZ;
        if (c21543719Sx.LJIILLIIL) {
            return c21543719Sx.LJIILL;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.LLIZ.LJIIZILJ;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.LLJJJJLIIL) {
            return this.LLJJL;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.LLLLLLZZ.LJFF();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C21543619Sw c21543619Sw = this.LLLLLLZZ;
        return c21543619Sw.LJI(c21543619Sw.LJIIJJI);
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.LLLJIL.getContentDescription();
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.LLLJIL.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.LLJJ) {
            return this.LLJILLL;
        }
        return null;
    }

    public ColorStateList getPrefixTextColor() {
        return this.LLJJJIL.getTextColors();
    }

    public CharSequence getStartIconContentDescription() {
        return this.LLLIIII.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.LLLIIII.getDrawable();
    }

    public ColorStateList getSuffixTextColor() {
        return this.LLJJJJJIL.getTextColors();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21543419Su.LJIIIIZZ():void");
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        TextInputLayout$SavedState textInputLayout$SavedState = new TextInputLayout$SavedState(super.onSaveInstanceState());
        if (this.LLIZ.LJ()) {
            textInputLayout$SavedState.LL = getError();
        }
        textInputLayout$SavedState.LLILLJJLI = this.LLLIZZ != 0 && this.LLLJIL.isChecked();
        textInputLayout$SavedState.LLILLL = getHint();
        textInputLayout$SavedState.LLILZ = getHelperText();
        textInputLayout$SavedState.LLILZIL = getPlaceholderText();
        return textInputLayout$SavedState;
    }

    public int getBoxBackgroundColor() {
        return this.LLLFF;
    }

    public int getBoxBackgroundMode() {
        return this.LLJLLIL;
    }

    public int getBoxStrokeColor() {
        return this.LLLLLL;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.LLLLLLIL;
    }

    public int getBoxStrokeWidth() {
        return this.LLJZIJLIL;
    }

    public int getBoxStrokeWidthFocused() {
        return this.LLL;
    }

    public int getCounterMaxLength() {
        return this.LLJ;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.LLJJIJIIJIL;
    }

    public ColorStateList getCounterTextColor() {
        return this.LLJJIJIIJIL;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.LLLLLIL;
    }

    public EditText getEditText() {
        return this.LLILZIL;
    }

    public int getEndIconMode() {
        return this.LLLIZZ;
    }

    public C21545019Tk getEndIconView() {
        return this.LLLJIL;
    }

    public ColorStateList getHintTextColor() {
        return this.LLLLLILLIL;
    }

    public int getPlaceholderTextAppearance() {
        return this.LLJJIJI;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.LLJJIII;
    }

    public CharSequence getPrefixText() {
        return this.LLJJJ;
    }

    public TextView getPrefixTextView() {
        return this.LLJJJIL;
    }

    public CharSequence getSuffixText() {
        return this.LLJJJJ;
    }

    public TextView getSuffixTextView() {
        return this.LLJJJJJIL;
    }

    public Typeface getTypeface() {
        return this.LLLII;
    }

    private void setEditText(EditText editText) {
        boolean z;
        boolean z2;
        if (this.LLILZIL == null) {
            int i = this.LLLIZZ;
            this.LLILZIL = editText;
            LJII();
            setTextInputAccessibilityDelegate(new C21543919Sz(this));
            C21543619Sw c21543619Sw = this.LLLLLLZZ;
            Typeface typeface = this.LLILZIL.getTypeface();
            C19TC c19tc = c21543619Sw.LJIL;
            if (c19tc != null) {
                c19tc.LIZJ = true;
            }
            if (c21543619Sw.LJIJ != typeface) {
                c21543619Sw.LJIJ = typeface;
                z = true;
            } else {
                z = false;
            }
            C19TC c19tc2 = c21543619Sw.LJIJJLI;
            if (c19tc2 != null) {
                c19tc2.LIZJ = true;
            }
            if (c21543619Sw.LJIJI != typeface) {
                c21543619Sw.LJIJI = typeface;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                c21543619Sw.LJIIIZ();
            }
            C21543619Sw c21543619Sw2 = this.LLLLLLZZ;
            float textSize = this.LLILZIL.getTextSize();
            if (c21543619Sw2.LJIIIIZZ != textSize) {
                c21543619Sw2.LJIIIIZZ = textSize;
                c21543619Sw2.LJIIIZ();
            }
            int gravity = this.LLILZIL.getGravity();
            C21543619Sw c21543619Sw3 = this.LLLLLLZZ;
            int i2 = (gravity & (-113)) | 48;
            if (c21543619Sw3.LJII != i2) {
                c21543619Sw3.LJII = i2;
                c21543619Sw3.LJIIIZ();
            }
            C21543619Sw c21543619Sw4 = this.LLLLLLZZ;
            if (c21543619Sw4.LJI != gravity) {
                c21543619Sw4.LJI = gravity;
                c21543619Sw4.LJIIIZ();
            }
            this.LLILZIL.addTextChangedListener(new TextWatcher() { // from class: X.19T3
                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    this.LL.LJIJ(!r2.LLLLZI, false);
                    C21543419Su c21543419Su = this.LL;
                    if (c21543419Su.LLIZLLLIL) {
                        c21543419Su.LJIILIIL(editable.length());
                    }
                    C21543419Su c21543419Su2 = this.LL;
                    if (c21543419Su2.LLJJ) {
                        c21543419Su2.LJIJI(editable.length());
                    }
                }
            });
            if (this.LLLLLIL == null) {
                this.LLLLLIL = this.LLILZIL.getHintTextColors();
            }
            if (this.LLJJJJLIIL) {
                if (TextUtils.isEmpty(this.LLJJL)) {
                    CharSequence hint = this.LLILZIL.getHint();
                    this.LLILZLL = hint;
                    setHint(hint);
                    this.LLILZIL.setHint((CharSequence) null);
                }
                this.LLJJLIIIJLLLLLLLZ = true;
            }
            if (this.LLJIJIL != null) {
                LJIILIIL(this.LLILZIL.getText().length());
            }
            LJIILLIIL();
            this.LLIZ.LIZIZ();
            this.LLILLJJLI.bringToFront();
            this.LLILLL.bringToFront();
            this.LLILZ.bringToFront();
            this.LLLLJI.bringToFront();
            Iterator<C19TE> it2 = this.LLLILZLLLI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(this);
            }
            LJIJJ();
            LJJ();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            LJIJ(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i;
        C21545019Tk c21545019Tk = this.LLLLJI;
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.a(c21545019Tk, i);
        FrameLayout frameLayout = this.LLILZ;
        if (!z) {
            i2 = 0;
        }
        C786410Ut5.LJZ(i2, frameLayout);
        LJJ();
        if (this.LLLIZZ == 0) {
            LJIILL();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.LLJJL)) {
            this.LLJJL = charSequence;
            C21543619Sw c21543619Sw = this.LLLLLLZZ;
            if (charSequence == null || !TextUtils.equals(c21543619Sw.LJJ, charSequence)) {
                c21543619Sw.LJJ = charSequence;
                c21543619Sw.LJJI = null;
                Bitmap bitmap = c21543619Sw.LJJII;
                if (bitmap != null) {
                    C786410Ut5.LJJJJ(bitmap);
                    c21543619Sw.LJJII = null;
                }
                c21543619Sw.LJIIIZ();
            }
            if (!this.LLLLLLZ) {
                LJIIIIZZ();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.LLJJ == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.LLJJI = appCompatTextView;
            appCompatTextView.setId(R.id.xrt);
            this.LLJJI.setAccessibilityLiveRegion(1);
            setPlaceholderTextAppearance(this.LLJJIJI);
            setPlaceholderTextColor(this.LLJJIII);
            AppCompatTextView appCompatTextView2 = this.LLJJI;
            if (appCompatTextView2 != null) {
                this.LL.addView(appCompatTextView2);
                C786410Ut5.LLIL(this.LLJJI, 0);
            }
        } else {
            AppCompatTextView appCompatTextView3 = this.LLJJI;
            if (appCompatTextView3 != null) {
                C786410Ut5.LLIL(appCompatTextView3, 8);
            }
            this.LLJJI = null;
        }
        this.LLJJ = z;
    }

    public final void LIZ(float f) {
        if (this.LLLLLLZZ.LIZJ == f) {
            return;
        }
        if (this.LLLLLZL == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLLLLZL = valueAnimator;
            valueAnimator.setInterpolator(C194V.LIZIZ);
            this.LLLLLZL.setDuration(167L);
            this.LLLLLZL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19T4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.LL.LLLLLLZZ.LJIILIIL(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.LLLLLZL.setFloatValues(this.LLLLLLZZ.LIZJ, f);
        this.LLLLLZL.start();
    }

    public final void LJIILIIL(int i) {
        boolean z;
        int i2;
        boolean z2 = this.LLJI;
        int i3 = this.LLJ;
        if (i3 == -1) {
            this.LLJIJIL.setText(String.valueOf(i));
            this.LLJIJIL.setContentDescription(null);
            this.LLJI = false;
        } else {
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.LLJI = z;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.LLJIJIL;
            int i4 = this.LLJ;
            if (this.LLJI) {
                i2 = 2131828519;
            } else {
                i2 = 2131828518;
            }
            appCompatTextView.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(i4)));
            if (z2 != this.LLJI) {
                LJIILJJIL();
            }
            this.LLJIJIL.setText(C21627319kV.LIZJ().LJFF(getContext().getString(2131828520, Integer.valueOf(i), Integer.valueOf(this.LLJ))));
        }
        if (this.LLILZIL != null && z2 != this.LLJI) {
            LJIJ(false, false);
            LJJIFFI();
            LJIILLIIL();
        }
    }

    public final void LJIJI(int i) {
        if (i == 0 && !this.LLLLLLZ) {
            AppCompatTextView appCompatTextView = this.LLJJI;
            if (appCompatTextView != null && this.LLJJ) {
                appCompatTextView.setText(this.LLJILLL);
                C786410Ut5.LLIL(this.LLJJI, 0);
                this.LLJJI.bringToFront();
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView2 = this.LLJJI;
        if (appCompatTextView2 == null || !this.LLJJ) {
            return;
        }
        appCompatTextView2.setText((CharSequence) null);
        C786410Ut5.LLIL(this.LLJJI, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.LLLLZI = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.LLLLZI = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.LLJJJJLIIL) {
            this.LLLLLLZZ.LJ(canvas);
        }
        C21538919Rb c21538919Rb = this.LLJLIL;
        if (c21538919Rb != null) {
            Rect bounds = c21538919Rb.getBounds();
            bounds.top = bounds.bottom - this.LLJZ;
            this.LLJLIL.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof TextInputLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        TextInputLayout$SavedState textInputLayout$SavedState = (TextInputLayout$SavedState) parcelable;
        super.onRestoreInstanceState(textInputLayout$SavedState.mSuperState);
        setError(textInputLayout$SavedState.LL);
        if (textInputLayout$SavedState.LLILLJJLI) {
            HandlerHook.viewPost(this.LLLJIL, new Runnable() { // from class: X.19T1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TextInputLayout@2f16.onRestoreInstanceState$1");
                    try {
                        this.LL.LLLJIL.performClick();
                        this.LL.LLLJIL.jumpDrawablesToCurrentState();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TextInputLayout@2f16.onRestoreInstanceState$1");
                }
            });
        }
        setHint(textInputLayout$SavedState.LLILLL);
        setHelperText(textInputLayout$SavedState.LLILZ);
        setPlaceholderText(textInputLayout$SavedState.LLILZIL);
        requestLayout();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.LLLFF != i) {
            this.LLLFF = i;
            this.LLLLLLJ = i;
            this.LLLLLLLLL = i;
            this.LLLLLLLLLL = i;
            LIZIZ();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C446980Hfs.LIZ(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.LLLLLLJ = defaultColor;
        this.LLLFF = defaultColor;
        this.LLLLLLL = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.LLLLLLLLL = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.LLLLLLLLLL = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        LIZIZ();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.LLJLLIL) {
            return;
        }
        this.LLJLLIL = i;
        if (this.LLILZIL != null) {
            LJII();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.LLLLLL != i) {
            this.LLLLLL = i;
            LJJIFFI();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.LLLLLJIL = colorStateList.getDefaultColor();
            this.LLLLLLLZIL = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.LLLLLJLJLL = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.LLLLLL = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.LLLLLL != colorStateList.getDefaultColor()) {
            this.LLLLLL = colorStateList.getDefaultColor();
        }
        LJJIFFI();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.LLLLLLIL != colorStateList) {
            this.LLLLLLIL = colorStateList;
            LJJIFFI();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.LLJZIJLIL = i;
        LJJIFFI();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.LLL = i;
        LJJIFFI();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        int length;
        if (this.LLIZLLLIL != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.LLJIJIL = appCompatTextView;
                appCompatTextView.setId(R.id.xrq);
                Typeface typeface = this.LLLII;
                if (typeface != null) {
                    this.LLJIJIL.setTypeface(typeface);
                }
                this.LLJIJIL.setMaxLines(1);
                this.LLIZ.LIZ(this.LLJIJIL, 2);
                ((ViewGroup.MarginLayoutParams) this.LLJIJIL.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.ab2));
                LJIILJJIL();
                if (this.LLJIJIL != null) {
                    EditText editText = this.LLILZIL;
                    if (editText == null) {
                        length = 0;
                    } else {
                        length = editText.getText().length();
                    }
                    LJIILIIL(length);
                }
            } else {
                this.LLIZ.LJIIIIZZ(this.LLJIJIL, 2);
                this.LLJIJIL = null;
            }
            this.LLIZLLLIL = z;
        }
    }

    public void setCounterMaxLength(int i) {
        int length;
        if (this.LLJ != i) {
            if (i > 0) {
                this.LLJ = i;
            } else {
                this.LLJ = -1;
            }
            if (this.LLIZLLLIL && this.LLJIJIL != null) {
                EditText editText = this.LLILZIL;
                if (editText == null) {
                    length = 0;
                } else {
                    length = editText.getText().length();
                }
                LJIILIIL(length);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.LLJILJIL != i) {
            this.LLJILJIL = i;
            LJIILJJIL();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.LLJJIJIL != colorStateList) {
            this.LLJJIJIL = colorStateList;
            LJIILJJIL();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.LLJILJILJ != i) {
            this.LLJILJILJ = i;
            LJIILJJIL();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.LLJJIJIIJIL != colorStateList) {
            this.LLJJIJIIJIL = colorStateList;
            LJIILJJIL();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.LLLLLIL = colorStateList;
        this.LLLLLILLIL = colorStateList;
        if (this.LLILZIL != null) {
            LJIJ(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        LJIIIZ(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.LLLJIL.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.LLLJIL.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        CharSequence text;
        if (i != 0) {
            text = getResources().getText(i);
        } else {
            text = null;
        }
        setEndIconContentDescription(text);
    }

    public void setEndIconDrawable(int i) {
        Drawable drawableLIZ;
        if (i != 0) {
            drawableLIZ = C14MI.LIZ(getContext(), i);
        } else {
            drawableLIZ = null;
        }
        setEndIconDrawable(drawableLIZ);
    }

    public void setEndIconMode(int i) {
        boolean z;
        int i2 = this.LLLIZZ;
        this.LLLIZZ = i;
        Iterator<C19TF> it2 = this.LLLJL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(this, i2);
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        setEndIconVisible(z);
        if (getEndIconDelegate().LIZIZ(this.LLJLLIL)) {
            getEndIconDelegate().LIZ();
            LIZJ();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The current box background mode ");
        sbLIZ.append(this.LLJLLIL);
        sbLIZ.append(" is not supported by the end icon mode ");
        sbLIZ.append(i);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C21545019Tk c21545019Tk = this.LLLJIL;
        View.OnLongClickListener onLongClickListener = this.LLLLILI;
        C786410Ut5.t9(c21545019Tk, onClickListener);
        LJIIJJI(c21545019Tk, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLLLILI = onLongClickListener;
        C21545019Tk c21545019Tk = this.LLLJIL;
        c21545019Tk.setOnLongClickListener(onLongClickListener);
        LJIIJJI(c21545019Tk, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.LLLL != colorStateList) {
            this.LLLL = colorStateList;
            this.LLLLII = true;
            LIZJ();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.LLLLIIIILLL != mode) {
            this.LLLLIIIILLL = mode;
            this.LLLLIIL = true;
            LIZJ();
        }
    }

    public void setEndIconVisible(boolean z) {
        int i;
        if (LJI() != z) {
            C21545019Tk c21545019Tk = this.LLLJIL;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.a(c21545019Tk, i);
            LJJ();
            LJIILL();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.LLIZ.LJIIJ) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C21543719Sx c21543719Sx = this.LLIZ;
            c21543719Sx.LIZJ();
            c21543719Sx.LJIIIZ = charSequence;
            c21543719Sx.LJIIJJI.setText(charSequence);
            int i = c21543719Sx.LJII;
            if (i != 1) {
                c21543719Sx.LJIIIIZZ = 1;
            }
            c21543719Sx.LJIIJ(i, c21543719Sx.LJIIIIZZ, c21543719Sx.LJIIIZ(c21543719Sx.LJIIJJI, charSequence));
            return;
        }
        this.LLIZ.LJII();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C21543719Sx c21543719Sx = this.LLIZ;
        c21543719Sx.LJIIL = charSequence;
        AppCompatTextView appCompatTextView = c21543719Sx.LJIIJJI;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C21543719Sx c21543719Sx = this.LLIZ;
        if (c21543719Sx.LJIIJ != z) {
            c21543719Sx.LIZJ();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(c21543719Sx.LIZ, null);
                c21543719Sx.LJIIJJI = appCompatTextView;
                appCompatTextView.setId(R.id.xrr);
                c21543719Sx.LJIIJJI.setTextAlignment(5);
                Typeface typeface = c21543719Sx.LJIJJ;
                if (typeface != null) {
                    c21543719Sx.LJIIJJI.setTypeface(typeface);
                }
                int i = c21543719Sx.LJIILIIL;
                c21543719Sx.LJIILIIL = i;
                AppCompatTextView appCompatTextView2 = c21543719Sx.LJIIJJI;
                if (appCompatTextView2 != null) {
                    c21543719Sx.LIZIZ.LJIIL(appCompatTextView2, i);
                }
                ColorStateList colorStateList = c21543719Sx.LJIILJJIL;
                c21543719Sx.LJIILJJIL = colorStateList;
                AppCompatTextView appCompatTextView3 = c21543719Sx.LJIIJJI;
                if (appCompatTextView3 != null && colorStateList != null) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = c21543719Sx.LJIIL;
                c21543719Sx.LJIIL = charSequence;
                AppCompatTextView appCompatTextView4 = c21543719Sx.LJIIJJI;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                C786410Ut5.LLIL(c21543719Sx.LJIIJJI, 4);
                c21543719Sx.LJIIJJI.setAccessibilityLiveRegion(1);
                c21543719Sx.LIZ(c21543719Sx.LJIIJJI, 0);
            } else {
                c21543719Sx.LJII();
                c21543719Sx.LJIIIIZZ(c21543719Sx.LJIIJJI, 0);
                c21543719Sx.LJIIJJI = null;
                c21543719Sx.LIZIZ.LJIILLIIL();
                c21543719Sx.LIZIZ.LJJIFFI();
            }
            c21543719Sx.LJIIJ = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        Drawable drawableLIZ;
        if (i != 0) {
            drawableLIZ = C14MI.LIZ(getContext(), i);
        } else {
            drawableLIZ = null;
        }
        setErrorIconDrawable(drawableLIZ);
        LJIIJ(this.LLLLJI, this.LLLLL);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C21545019Tk c21545019Tk = this.LLLLJI;
        View.OnLongClickListener onLongClickListener = this.LLLLJ;
        C786410Ut5.t9(c21545019Tk, onClickListener);
        LJIIJJI(c21545019Tk, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLLLJ = onLongClickListener;
        C21545019Tk c21545019Tk = this.LLLLJI;
        c21545019Tk.setOnLongClickListener(onLongClickListener);
        LJIIJJI(c21545019Tk, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.LLLLL = colorStateList;
        Drawable drawable = this.LLLLJI.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            C16GF.LJII(drawable, colorStateList);
        }
        if (this.LLLLJI.getDrawable() != drawable) {
            this.LLLLJI.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.LLLLJI.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            C16GF.LJIIIIZZ(drawable, mode);
        }
        if (this.LLLLJI.getDrawable() != drawable) {
            this.LLLLJI.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C21543719Sx c21543719Sx = this.LLIZ;
        c21543719Sx.LJIILIIL = i;
        AppCompatTextView appCompatTextView = c21543719Sx.LJIIJJI;
        if (appCompatTextView != null) {
            c21543719Sx.LIZIZ.LJIIL(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C21543719Sx c21543719Sx = this.LLIZ;
        c21543719Sx.LJIILJJIL = colorStateList;
        AppCompatTextView appCompatTextView = c21543719Sx.LJIIJJI;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.LLLLLZ != z) {
            this.LLLLLZ = z;
            LJIJ(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.LLIZ.LJIILLIIL) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.LLIZ.LJIILLIIL) {
            setHelperTextEnabled(true);
        }
        C21543719Sx c21543719Sx = this.LLIZ;
        c21543719Sx.LIZJ();
        c21543719Sx.LJIILL = charSequence;
        c21543719Sx.LJIIZILJ.setText(charSequence);
        int i = c21543719Sx.LJII;
        if (i != 2) {
            c21543719Sx.LJIIIIZZ = 2;
        }
        c21543719Sx.LJIIJ(i, c21543719Sx.LJIIIIZZ, c21543719Sx.LJIIIZ(c21543719Sx.LJIIZILJ, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C21543719Sx c21543719Sx = this.LLIZ;
        c21543719Sx.LJIJI = colorStateList;
        AppCompatTextView appCompatTextView = c21543719Sx.LJIIZILJ;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C21543719Sx c21543719Sx = this.LLIZ;
        if (c21543719Sx.LJIILLIIL != z) {
            c21543719Sx.LIZJ();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(c21543719Sx.LIZ, null);
                c21543719Sx.LJIIZILJ = appCompatTextView;
                appCompatTextView.setId(R.id.xrs);
                c21543719Sx.LJIIZILJ.setTextAlignment(5);
                Typeface typeface = c21543719Sx.LJIJJ;
                if (typeface != null) {
                    c21543719Sx.LJIIZILJ.setTypeface(typeface);
                }
                C786410Ut5.LLIL(c21543719Sx.LJIIZILJ, 4);
                c21543719Sx.LJIIZILJ.setAccessibilityLiveRegion(1);
                int i = c21543719Sx.LJIJ;
                c21543719Sx.LJIJ = i;
                AppCompatTextView appCompatTextView2 = c21543719Sx.LJIIZILJ;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(i);
                }
                ColorStateList colorStateList = c21543719Sx.LJIJI;
                c21543719Sx.LJIJI = colorStateList;
                AppCompatTextView appCompatTextView3 = c21543719Sx.LJIIZILJ;
                if (appCompatTextView3 != null && colorStateList != null) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                c21543719Sx.LIZ(c21543719Sx.LJIIZILJ, 1);
            } else {
                c21543719Sx.LIZJ();
                int i2 = c21543719Sx.LJII;
                if (i2 == 2) {
                    c21543719Sx.LJIIIIZZ = 0;
                }
                c21543719Sx.LJIIJ(i2, c21543719Sx.LJIIIIZZ, c21543719Sx.LJIIIZ(c21543719Sx.LJIIZILJ, null));
                c21543719Sx.LJIIIIZZ(c21543719Sx.LJIIZILJ, 1);
                c21543719Sx.LJIIZILJ = null;
                c21543719Sx.LIZIZ.LJIILLIIL();
                c21543719Sx.LIZIZ.LJJIFFI();
            }
            c21543719Sx.LJIILLIIL = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C21543719Sx c21543719Sx = this.LLIZ;
        c21543719Sx.LJIJ = i;
        AppCompatTextView appCompatTextView = c21543719Sx.LJIIZILJ;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        CharSequence text;
        if (i != 0) {
            text = getResources().getText(i);
        } else {
            text = null;
        }
        setHint(text);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.LLLLLZIL = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.LLJJJJLIIL) {
            this.LLJJJJLIIL = z;
            if (!z) {
                this.LLJJLIIIJLLLLLLLZ = false;
                if (!TextUtils.isEmpty(this.LLJJL) && TextUtils.isEmpty(this.LLILZIL.getHint())) {
                    this.LLILZIL.setHint(this.LLJJL);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.LLILZIL.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.LLJJL)) {
                        setHint(hint);
                    }
                    this.LLILZIL.setHint((CharSequence) null);
                }
                this.LLJJLIIIJLLLLLLLZ = true;
            }
            if (this.LLILZIL != null) {
                LJIIZILJ();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.LLLLLLZZ.LJIIJ(i);
        this.LLLLLILLIL = this.LLLLLLZZ.LJIIJJI;
        if (this.LLILZIL != null) {
            LJIJ(false, false);
            LJIIZILJ();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.LLLLLILLIL != colorStateList) {
            if (this.LLLLLIL == null) {
                this.LLLLLLZZ.LJIIJJI(colorStateList);
            }
            this.LLLLLILLIL = colorStateList;
            if (this.LLILZIL != null) {
                LJIJ(false, false);
            }
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence text;
        if (i != 0) {
            text = getResources().getText(i);
        } else {
            text = null;
        }
        setPasswordVisibilityToggleContentDescription(text);
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawableLIZ;
        if (i != 0) {
            drawableLIZ = C14MI.LIZ(getContext(), i);
        } else {
            drawableLIZ = null;
        }
        setPasswordVisibilityToggleDrawable(drawableLIZ);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z) {
            if (this.LLLIZZ != 1) {
                setEndIconMode(1);
                return;
            }
            return;
        }
        setEndIconMode(0);
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.LLLL = colorStateList;
        this.LLLLII = true;
        LIZJ();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.LLLLIIIILLL = mode;
        this.LLLLIIL = true;
        LIZJ();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int length = 0;
        if (this.LLJJ && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.LLJJ) {
                setPlaceholderTextEnabled(true);
            }
            this.LLJILLL = charSequence;
        }
        EditText editText = this.LLILZIL;
        if (editText != null) {
            length = editText.getText().length();
        }
        LJIJI(length);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.LLJJIJI = i;
        AppCompatTextView appCompatTextView = this.LLJJI;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.LLJJIII != colorStateList) {
            this.LLJJIII = colorStateList;
            AppCompatTextView appCompatTextView = this.LLJJI;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.LLJJJ = charSequence2;
        this.LLJJJIL.setText(charSequence);
        LJIJJLI();
    }

    public void setPrefixTextAppearance(int i) {
        this.LLJJJIL.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.LLJJJIL.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.LLLIIII.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        CharSequence text;
        if (i != 0) {
            text = getResources().getText(i);
        } else {
            text = null;
        }
        setStartIconContentDescription(text);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.LLLIIII.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            LJIIJ(this.LLLIIII, this.LLLIIIIL);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C21545019Tk c21545019Tk = this.LLLIIII;
        View.OnLongClickListener onLongClickListener = this.LLLILZJ;
        C786410Ut5.t9(c21545019Tk, onClickListener);
        LJIIJJI(c21545019Tk, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLLILZJ = onLongClickListener;
        C21545019Tk c21545019Tk = this.LLLIIII;
        c21545019Tk.setOnLongClickListener(onLongClickListener);
        LJIIJJI(c21545019Tk, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.LLLIIIIL != colorStateList) {
            this.LLLIIIIL = colorStateList;
            this.LLLIIIL = true;
            LIZLLL(this.LLLIIII, true, colorStateList, this.LLLIILIL, this.LLLIIL);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.LLLIIL != mode) {
            this.LLLIIL = mode;
            this.LLLIILIL = true;
            LIZLLL(this.LLLIIII, this.LLLIIIL, this.LLLIIIIL, true, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        boolean z2;
        int i = 0;
        if (this.LLLIIII.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            C21545019Tk c21545019Tk = this.LLLIIII;
            if (!z) {
                i = 8;
            }
            C786410Ut5.a(c21545019Tk, i);
            LJIJJ();
            LJIILL();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.LLJJJJ = charSequence2;
        this.LLJJJJJIL.setText(charSequence);
        LJJI();
    }

    public void setSuffixTextAppearance(int i) {
        this.LLJJJJJIL.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.LLJJJJJIL.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C21543919Sz c21543919Sz) {
        EditText editText = this.LLILZIL;
        if (editText != null) {
            q0.LJIJ(editText, c21543919Sz);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z;
        if (typeface != this.LLLII) {
            this.LLLII = typeface;
            C21543619Sw c21543619Sw = this.LLLLLLZZ;
            C19TC c19tc = c21543619Sw.LJIL;
            boolean z2 = true;
            if (c19tc != null) {
                c19tc.LIZJ = true;
            }
            if (c21543619Sw.LJIJ != typeface) {
                c21543619Sw.LJIJ = typeface;
                z = true;
            } else {
                z = false;
            }
            C19TC c19tc2 = c21543619Sw.LJIJJLI;
            if (c19tc2 != null) {
                c19tc2.LIZJ = true;
            }
            if (c21543619Sw.LJIJI != typeface) {
                c21543619Sw.LJIJI = typeface;
            } else {
                z2 = false;
            }
            if (z || z2) {
                c21543619Sw.LJIIIZ();
            }
            C21543719Sx c21543719Sx = this.LLIZ;
            if (typeface != c21543719Sx.LJIJJ) {
                c21543719Sx.LJIJJ = typeface;
                AppCompatTextView appCompatTextView = c21543719Sx.LJIIJJI;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = c21543719Sx.LJIIZILJ;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.LLJIJIL;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.LLLJIL.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.LLLJIL.setImageDrawable(drawable);
        LJIIJ(this.LLLJIL, this.LLLL);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        boolean z;
        this.LLLLJI.setImageDrawable(drawable);
        if (drawable != null && this.LLIZ.LJIIJ) {
            z = true;
        } else {
            z = false;
        }
        setErrorIconVisible(z);
    }

    public void setHint(CharSequence charSequence) {
        if (this.LLJJJJLIIL) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.LLLJIL.setContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.LLLJIL.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.LLLIIII.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        Drawable drawableLIZ;
        if (i != 0) {
            drawableLIZ = C14MI.LIZ(getContext(), i);
        } else {
            drawableLIZ = null;
        }
        setStartIconDrawable(drawableLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05cc  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21543419Su(android.content.Context r26, android.util.AttributeSet r27) {
        /*
            Method dump skipped, instruction units count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21543419Su.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void LJIIIZ(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                LJIIIZ((ViewGroup) childAt, z);
            }
        }
    }

    public static void LJIIJJI(C21545019Tk c21545019Tk, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean zHasOnClickListeners = c21545019Tk.hasOnClickListeners();
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (zHasOnClickListeners || z) {
            z2 = true;
        }
        c21545019Tk.setFocusable(z2);
        c21545019Tk.setClickable(zHasOnClickListeners);
        c21545019Tk.setPressable(zHasOnClickListeners);
        c21545019Tk.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        c21545019Tk.setImportantForAccessibility(i);
    }

    public final void LJIIJ(C21545019Tk c21545019Tk, ColorStateList colorStateList) {
        Drawable drawable = c21545019Tk.getDrawable();
        if (c21545019Tk.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = getDrawableState();
            int[] drawableState2 = c21545019Tk.getDrawableState();
            int length = drawableState.length;
            int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
            Drawable drawableMutate = drawable.mutate();
            C16GF.LJII(drawableMutate, ColorStateList.valueOf(colorForState));
            c21545019Tk.setImageDrawable(drawableMutate);
        }
    }

    public final void LJIIL(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (textView.getTextColors().getDefaultColor() == -65281) {
            textView.setTextAppearance(R.style.ok);
            textView.setTextColor(C446980Hfs.LIZ(getContext(), R.color.k_));
        }
    }

    public final void LJIJ(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList textColors;
        int colorForState;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.LLILZIL;
        int length = 0;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.LLILZIL;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean zLJ = this.LLIZ.LJ();
        ColorStateList colorStateList2 = this.LLLLLIL;
        if (colorStateList2 != null) {
            this.LLLLLLZZ.LJIIJJI(colorStateList2);
            C21543619Sw c21543619Sw = this.LLLLLLZZ;
            ColorStateList colorStateList3 = this.LLLLLIL;
            if (c21543619Sw.LJIIJ != colorStateList3) {
                c21543619Sw.LJIIJ = colorStateList3;
                c21543619Sw.LJIIIZ();
            }
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList4 = this.LLLLLIL;
            if (colorStateList4 != null) {
                colorForState = colorStateList4.getColorForState(new int[]{-16842910}, this.LLLLLLLZIL);
            } else {
                colorForState = this.LLLLLLLZIL;
            }
            this.LLLLLLZZ.LJIIJJI(ColorStateList.valueOf(colorForState));
            C21543619Sw c21543619Sw2 = this.LLLLLLZZ;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorForState);
            if (c21543619Sw2.LJIIJ != colorStateListValueOf) {
                c21543619Sw2.LJIIJ = colorStateListValueOf;
                c21543619Sw2.LJIIIZ();
            }
        } else if (zLJ) {
            C21543619Sw c21543619Sw3 = this.LLLLLLZZ;
            AppCompatTextView appCompatTextView2 = this.LLIZ.LJIIJJI;
            if (appCompatTextView2 != null) {
                textColors = appCompatTextView2.getTextColors();
            } else {
                textColors = null;
            }
            c21543619Sw3.LJIIJJI(textColors);
        } else if (this.LLJI && (appCompatTextView = this.LLJIJIL) != null) {
            this.LLLLLLZZ.LJIIJJI(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.LLLLLILLIL) != null) {
            this.LLLLLLZZ.LJIIJJI(colorStateList);
        }
        if (z3 || !this.LLLLLZ || (isEnabled() && z4)) {
            if (z2 || this.LLLLLLZ) {
                ValueAnimator valueAnimator = this.LLLLLZL;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.LLLLLZL.cancel();
                }
                if (z && this.LLLLLZIL) {
                    LIZ(1.0f);
                } else {
                    this.LLLLLLZZ.LJIILIIL(1.0f);
                }
                this.LLLLLLZ = false;
                if (LJFF()) {
                    LJIIIIZZ();
                }
                EditText editText3 = this.LLILZIL;
                if (editText3 != null) {
                    length = editText3.getText().length();
                }
                LJIJI(length);
                LJIJJLI();
                LJJI();
                return;
            }
            return;
        }
        if (!z2 && this.LLLLLLZ) {
            return;
        }
        ValueAnimator valueAnimator2 = this.LLLLLZL;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.LLLLLZL.cancel();
        }
        if (z && this.LLLLLZIL) {
            LIZ(0.0f);
        } else {
            this.LLLLLLZZ.LJIILIIL(0.0f);
        }
        if (LJFF() && (!((C21541319Rz) this.LLJL).LLJJJJLIIL.isEmpty()) && LJFF()) {
            ((C21541319Rz) this.LLJL).LJIJJ(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.LLLLLLZ = true;
        AppCompatTextView appCompatTextView3 = this.LLJJI;
        if (appCompatTextView3 != null && this.LLJJ) {
            appCompatTextView3.setText((CharSequence) null);
            C786410Ut5.LLIL(this.LLJJI, 4);
        }
        LJIJJLI();
        LJJI();
    }

    public final void LJIL(boolean z, boolean z2) {
        int defaultColor = this.LLLLLLIL.getDefaultColor();
        int colorForState = this.LLLLLLIL.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.LLLLLLIL.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.LLLF = colorForState2;
        } else if (z2) {
            this.LLLF = colorForState;
        } else {
            this.LLLF = defaultColor;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.LLILZIL;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.LLILZLL != null) {
            boolean z = this.LLJJLIIIJLLLLLLLZ;
            this.LLJJLIIIJLLLLLLLZ = false;
            CharSequence hint = editText.getHint();
            this.LLILZIL.setHint(this.LLILZLL);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                this.LLILZIL.setHint(hint);
                this.LLJJLIIIJLLLLLLLZ = z;
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLILZIL.setHint(hint);
                this.LLJJLIIIJLLLLLLLZ = z;
                throw th;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.LL.getChildCount());
        for (int i2 = 0; i2 < this.LL.getChildCount(); i2++) {
            View childAt = this.LL.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.LLILZIL) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        if (this.LLILZIL != null && this.LLILZIL.getMeasuredHeight() < (iMax = Math.max(this.LLILLL.getMeasuredHeight(), this.LLILLJJLI.getMeasuredHeight()))) {
            this.LLILZIL.setMinimumHeight(iMax);
            z = true;
        } else {
            z = false;
        }
        boolean zLJIILL = LJIILL();
        if (z || zLJIILL) {
            HandlerHook.viewPost(this.LLILZIL, new Runnable() { // from class: X.19T2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TextInputLayout@2f16.onMeasure$1");
                    try {
                        this.LL.LLILZIL.requestLayout();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TextInputLayout@2f16.onMeasure$1");
                }
            });
        }
        if (this.LLJJI != null && (editText = this.LLILZIL) != null) {
            this.LLJJI.setGravity(editText.getGravity());
            this.LLJJI.setPadding(this.LLILZIL.getCompoundPaddingLeft(), this.LLILZIL.getCompoundPaddingTop(), this.LLILZIL.getCompoundPaddingRight(), this.LLILZIL.getCompoundPaddingBottom());
        }
        LJIJJ();
        LJJ();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.LL.addView(view, layoutParams2);
            C786410Ut5.a6(this.LL, layoutParams);
            LJIIZILJ();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public static void LIZLLL(C21545019Tk c21545019Tk, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = c21545019Tk.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                C16GF.LJII(drawable, colorStateList);
            }
            if (z2) {
                C16GF.LJIIIIZZ(drawable, mode);
            }
        }
        if (c21545019Tk.getDrawable() != drawable) {
            c21545019Tk.setImageDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.LLILZIL;
        if (editText != null) {
            Rect rect = this.LLLFFI;
            C1292440jjm.LIZ(rect, editText, this);
            C21538919Rb c21538919Rb = this.LLJLIL;
            if (c21538919Rb != null) {
                int i5 = rect.bottom;
                c21538919Rb.setBounds(rect.left, i5 - this.LLL, rect.right, i5);
            }
            if (this.LLJJJJLIIL) {
                C21543619Sw c21543619Sw = this.LLLLLLZZ;
                float textSize = this.LLILZIL.getTextSize();
                if (c21543619Sw.LJIIIIZZ != textSize) {
                    c21543619Sw.LJIIIIZZ = textSize;
                    c21543619Sw.LJIIIZ();
                }
                int gravity = this.LLILZIL.getGravity();
                C21543619Sw c21543619Sw2 = this.LLLLLLZZ;
                int i6 = (gravity & (-113)) | 48;
                if (c21543619Sw2.LJII != i6) {
                    c21543619Sw2.LJII = i6;
                    c21543619Sw2.LJIIIZ();
                }
                C21543619Sw c21543619Sw3 = this.LLLLLLZZ;
                if (c21543619Sw3.LJI != gravity) {
                    c21543619Sw3.LJI = gravity;
                    c21543619Sw3.LJIIIZ();
                }
                C21543619Sw c21543619Sw4 = this.LLLLLLZZ;
                if (this.LLILZIL != null) {
                    Rect rect2 = this.LLLFZ;
                    if (getLayoutDirection() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rect2.bottom = rect.bottom;
                    int i7 = this.LLJLLIL;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            int compoundPaddingLeft = rect.left + this.LLILZIL.getCompoundPaddingLeft();
                            if (this.LLJJJ != null && !z2) {
                                compoundPaddingLeft = (compoundPaddingLeft - this.LLJJJIL.getMeasuredWidth()) + this.LLJJJIL.getPaddingLeft();
                            }
                            rect2.left = compoundPaddingLeft;
                            rect2.top = getPaddingTop();
                            int compoundPaddingRight = rect.right - this.LLILZIL.getCompoundPaddingRight();
                            if (this.LLJJJ != null && z2) {
                                compoundPaddingRight += this.LLJJJIL.getMeasuredWidth() - this.LLJJJIL.getPaddingRight();
                            }
                            rect2.right = compoundPaddingRight;
                        } else {
                            rect2.left = rect.left + this.LLILZIL.getPaddingLeft();
                            rect2.top = rect.top - LJ();
                            rect2.right = rect.right - this.LLILZIL.getPaddingRight();
                        }
                    } else {
                        int compoundPaddingLeft2 = rect.left + this.LLILZIL.getCompoundPaddingLeft();
                        if (this.LLJJJ != null && !z2) {
                            compoundPaddingLeft2 = (compoundPaddingLeft2 - this.LLJJJIL.getMeasuredWidth()) + this.LLJJJIL.getPaddingLeft();
                        }
                        rect2.left = compoundPaddingLeft2;
                        rect2.top = rect.top + this.LLJLLL;
                        int compoundPaddingRight2 = rect.right - this.LLILZIL.getCompoundPaddingRight();
                        if (this.LLJJJ != null && z2) {
                            compoundPaddingRight2 += this.LLJJJIL.getMeasuredWidth() - this.LLJJJIL.getPaddingRight();
                        }
                        rect2.right = compoundPaddingRight2;
                    }
                    c21543619Sw4.getClass();
                    int i8 = rect2.left;
                    int i9 = rect2.top;
                    int i10 = rect2.right;
                    int i11 = rect2.bottom;
                    Rect rect3 = c21543619Sw4.LJ;
                    if (rect3.left != i8 || rect3.top != i9 || rect3.right != i10 || rect3.bottom != i11) {
                        rect3.set(i8, i9, i10, i11);
                        c21543619Sw4.LJJIIZ = true;
                        c21543619Sw4.LJIIIIZZ();
                    }
                    C21543619Sw c21543619Sw5 = this.LLLLLLZZ;
                    if (this.LLILZIL != null) {
                        Rect rect4 = this.LLLFZ;
                        TextPaint textPaint = c21543619Sw5.LJJIJ;
                        textPaint.setTextSize(c21543619Sw5.LJIIIIZZ);
                        textPaint.setTypeface(c21543619Sw5.LJIJI);
                        textPaint.setLetterSpacing(c21543619Sw5.LJJJJI);
                        float f = -c21543619Sw5.LJJIJ.ascent();
                        rect4.left = rect.left + this.LLILZIL.getCompoundPaddingLeft();
                        if (this.LLJLLIL == 1 && this.LLILZIL.getMinLines() <= 1) {
                            compoundPaddingTop = (int) (rect.centerY() - (f / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.LLILZIL.getCompoundPaddingTop();
                        }
                        rect4.top = compoundPaddingTop;
                        rect4.right = rect.right - this.LLILZIL.getCompoundPaddingRight();
                        if (this.LLJLLIL == 1 && this.LLILZIL.getMinLines() <= 1) {
                            compoundPaddingBottom = (int) (rect4.top + f);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.LLILZIL.getCompoundPaddingBottom();
                        }
                        rect4.bottom = compoundPaddingBottom;
                        int i12 = rect4.left;
                        int i13 = rect4.top;
                        int i14 = rect4.right;
                        Rect rect5 = c21543619Sw5.LIZLLL;
                        if (rect5.left != i12 || rect5.top != i13 || rect5.right != i14 || rect5.bottom != compoundPaddingBottom) {
                            rect5.set(i12, i13, i14, compoundPaddingBottom);
                            c21543619Sw5.LJJIIZ = true;
                            c21543619Sw5.LJIIIIZZ();
                        }
                        this.LLLLLLZZ.LJIIIZ();
                        if (LJFF() && !this.LLLLLLZ) {
                            LJIIIIZZ();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }
}
