package androidx.appcompat.widget;

import X.C14KV;
import X.C14MI;
import X.C1695010uD5;
import X.C20140313rF;
import X.C20141413rQ;
import X.C20175013wq;
import X.C20175113wr;
import X.C21370918kF;
import X.C21371318kJ;
import X.C21382118m3;
import X.C21402418pK;
import X.C21410518qd;
import X.C21410918qh;
import X.C21411318ql;
import X.C21412318qv;
import X.C786410Ut5;
import X.InterfaceC20745616Fy;
import X.InterfaceC21410718qf;
import X.InterfaceC21412618qy;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes33.dex */
public class AppCompatTextView extends TextView implements InterfaceC21412618qy, InterfaceC20745616Fy {
    public final C21411318ql LL;
    public final w LLILLJJLI;
    public final C20175113wr LLILLL;
    public C21402418pK LLILZ;
    public boolean LLILZIL;
    public C21410918qh LLILZLL;
    public Future<C21371318kJ> LLIZ;

    public AppCompatTextView() {
        throw null;
    }

    private C21402418pK getEmojiTextViewHelper() {
        if (this.LLILZ == null) {
            this.LLILZ = new C21402418pK(this);
        }
        return this.LLILZ;
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public int getAutoSizeMaxTextSize() {
        if (C14KV.LIZJ) {
            return super.getAutoSizeMaxTextSize();
        }
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            return Math.round(wVar.LJIIIIZZ.LJ);
        }
        return -1;
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public int getAutoSizeMinTextSize() {
        if (C14KV.LIZJ) {
            return super.getAutoSizeMinTextSize();
        }
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            return Math.round(wVar.LJIIIIZZ.LIZLLL);
        }
        return -1;
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public int getAutoSizeStepGranularity() {
        if (C14KV.LIZJ) {
            return super.getAutoSizeStepGranularity();
        }
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            return Math.round(wVar.LJIIIIZZ.LIZJ);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C14KV.LIZJ) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w wVar = this.LLILLJJLI;
        return wVar != null ? wVar.LJIIIIZZ.LJFF : new int[0];
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public int getAutoSizeTextType() {
        if (C14KV.LIZJ) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            return wVar.LJIIIIZZ.LIZ;
        }
        return 0;
    }

    public InterfaceC21410718qf getSuperCaller() {
        if (this.LLILZLL == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.LLILZLL = new C21410518qd() { // from class: X.18qe
                    {
                        super(this.LIZJ);
                    }

                    @Override // X.C21410918qh, X.InterfaceC21410718qf
                    public final void LIZJ(int i2, float f) {
                        super/*android.widget.TextView*/.setLineHeight(i2, f);
                    }
                };
            } else if (i >= 28) {
                this.LLILZLL = new C21410518qd(this);
            } else if (i >= 26) {
                this.LLILZLL = new C21410918qh(this);
            }
        }
        return this.LLILZLL;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            return c21411318ql.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            return c21411318ql.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.LLILLJJLI.LIZLLL();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.LLILLJJLI.LJ();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<C21371318kJ> future = this.LLIZ;
        if (future != null) {
            try {
                this.LLIZ = null;
                C21382118m3.LJII(this, future.get());
            } catch (InterruptedException | ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C20175113wr c20175113wr;
        if (Build.VERSION.SDK_INT >= 28 || (c20175113wr = this.LLILLL) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c20175113wr.LIZIZ;
        return textClassifier == null ? C20175013wq.LIZ(c20175113wr.LIZ) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LIZ();
        }
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C21382118m3.LJIIIIZZ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public C21370918kF getTextMetricsParamsCompat() {
        return C21382118m3.LIZ(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) C786410Ut5.H2(getContext(), "input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.LLILLJJLI.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            C1695010uD5.LIZIZ(editorInfo, getText());
        }
        C21412318qv.LIZ(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().LIZJ(z);
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (!C14KV.LIZJ) {
            w wVar = this.LLILLJJLI;
            if (wVar == null) {
                return;
            }
            wVar.LJIIIZ(i);
            return;
        }
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJFF(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C21382118m3.LJIIIZ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().LIZLLL(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().LIZ(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().LIZIZ(i);
        } else {
            C21382118m3.LIZLLL(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().LIZ(i);
        } else {
            C21382118m3.LJ(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C21382118m3.LJFF(this, i);
    }

    public void setPrecomputedText(C21371318kJ c21371318kJ) {
        C21382118m3.LJII(this, c21371318kJ);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJIIIIZZ(mode);
        }
    }

    @Override // X.InterfaceC21412618qy
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.LLILLJJLI.LJIIJ(colorStateList);
        this.LLILLJJLI.LIZIZ();
    }

    @Override // X.InterfaceC21412618qy
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.LLILLJJLI.LJIIJJI(mode);
        this.LLILLJJLI.LIZIZ();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C20175113wr c20175113wr;
        if (Build.VERSION.SDK_INT < 28 && (c20175113wr = this.LLILLL) != null) {
            c20175113wr.LIZIZ = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<C21371318kJ> future) {
        this.LLIZ = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTextMetricsParamsCompat(X.C21370918kF r3) {
        /*
            r2 = this;
            android.text.TextDirectionHeuristic r1 = r3.LIZIZ
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r1 == r0) goto L44
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r1 == r0) goto L44
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r1 != r0) goto L26
            r0 = 2
        Lf:
            r2.setTextDirection(r0)
            android.text.TextPaint r1 = r2.getPaint()
            android.text.TextPaint r0 = r3.LIZ
            r1.set(r0)
            int r0 = r3.LIZJ
            X.C21382318m5.LJ(r2, r0)
            int r0 = r3.LIZLLL
            X.C21382318m5.LJII(r2, r0)
            return
        L26:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            if (r1 != r0) goto L2c
            r0 = 3
            goto Lf
        L2c:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
            if (r1 != r0) goto L32
            r0 = 4
            goto Lf
        L32:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LOCALE
            if (r1 != r0) goto L38
            r0 = 5
            goto Lf
        L38:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r1 != r0) goto L3e
            r0 = 6
            goto Lf
        L3e:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r1 != r0) goto L44
            r0 = 7
            goto Lf
        L44:
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.setTextMetricsParamsCompat(X.18kF):void");
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<C21371318kJ> future = this.LLIZ;
        if (future != null) {
            try {
                this.LLIZ = null;
                C21382118m3.LJII(this, future.get());
            } catch (InterruptedException | ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (!C14KV.LIZJ) {
            w wVar = this.LLILLJJLI;
            if (wVar == null) {
                return;
            }
            wVar.LJIIIIZZ(iArr, i);
            return;
        }
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().LIZJ(i, f);
        } else {
            C21382118m3.LJI(this, i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LJI(i, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C14KV.LIZJ) {
            super.setTextSize(i, f);
            return;
        }
        w wVar = this.LLILLJJLI;
        if (wVar == null) {
            return;
        }
        y yVar = wVar.LJIIIIZZ;
        if (yVar.LJIIIIZZ() && yVar.LIZ != 0) {
            return;
        }
        wVar.LJIIIIZZ.LJFF(f, i);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.LLILZIL) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            C20141413rQ c20141413rQ = C20140313rF.LIZ;
            if (context != null) {
                typefaceCreate = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typefaceCreate = null;
        }
        this.LLILZIL = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
            this.LLILZIL = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZIL = false;
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.LIZ(context);
        this.LLILZIL = false;
        this.LLILZLL = null;
        C786410Ut5.t3(getContext());
        C21411318ql c21411318ql = new C21411318ql(this);
        this.LL = c21411318ql;
        c21411318ql.LIZLLL(attributeSet, i);
        w wVar = new w(this);
        this.LLILLJJLI = wVar;
        this.LLILLJJLI.LJFF(attributeSet, i);
        wVar.LIZIZ();
        this.LLILLL = new C20175113wr(this);
        getEmojiTextViewHelper().LIZIZ(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        w wVar = this.LLILLJJLI;
        if (wVar != null && !C14KV.LIZJ) {
            y yVar = wVar.LJIIIIZZ;
            if (yVar.LJIIIIZZ() && yVar.LIZ != 0) {
                this.LLILLJJLI.LJIIIIZZ.LIZ();
            }
        }
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (!C14KV.LIZJ) {
            w wVar = this.LLILLJJLI;
            if (wVar == null) {
                return;
            }
            wVar.LJII(i, i2, i3, i4);
            return;
        }
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawableLIZ;
        Drawable drawableLIZ2;
        Drawable drawableLIZ3;
        Context context = getContext();
        Drawable drawableLIZ4 = null;
        if (i != 0) {
            drawableLIZ = C14MI.LIZ(context, i);
        } else {
            drawableLIZ = null;
        }
        if (i2 != 0) {
            drawableLIZ2 = C14MI.LIZ(context, i2);
        } else {
            drawableLIZ2 = null;
        }
        if (i3 != 0) {
            drawableLIZ3 = C14MI.LIZ(context, i3);
        } else {
            drawableLIZ3 = null;
        }
        if (i4 != 0) {
            drawableLIZ4 = C14MI.LIZ(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawableLIZ, drawableLIZ2, drawableLIZ3, drawableLIZ4);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawableLIZ;
        Drawable drawableLIZ2;
        Drawable drawableLIZ3;
        Context context = getContext();
        Drawable drawableLIZ4 = null;
        if (i != 0) {
            drawableLIZ = C14MI.LIZ(context, i);
        } else {
            drawableLIZ = null;
        }
        if (i2 != 0) {
            drawableLIZ2 = C14MI.LIZ(context, i2);
        } else {
            drawableLIZ2 = null;
        }
        if (i3 != 0) {
            drawableLIZ3 = C14MI.LIZ(context, i3);
        } else {
            drawableLIZ3 = null;
        }
        if (i4 != 0) {
            drawableLIZ4 = C14MI.LIZ(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawableLIZ, drawableLIZ2, drawableLIZ3, drawableLIZ4);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w wVar = this.LLILLJJLI;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        w wVar = this.LLILLJJLI;
        if (wVar != null && !C14KV.LIZJ) {
            wVar.LJIIIIZZ.LIZ();
        }
    }
}
