package X;

import Y.ALAdapterS21S0100000_26;
import Y.AUListenerS265S0100000_16;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0vlH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1754650vlH extends FrameLayout implements InterfaceC1237420iJ2 {
    public static final /* synthetic */ int LLLL = 0;
    public final C1947407k0 LL;
    public final C1947407k0 LLILLJJLI;
    public final C1947407k0 LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final Paint LLJIJIL;
    public final RectF LLJILJIL;
    public final C444890HcV LLJILJILJ;
    public final Rect LLJILLL;
    public final ValueAnimator LLJJ;
    public final C21647019ng LLJJI;
    public final ValueAnimator LLJJIII;
    public final C1748370vb9 LLJJIJI;
    public final String LLJJIJIIJIL;
    public String LLJJIJIL;
    public final C1754690vlL LLJJJ;
    public boolean LLJJJIL;
    public final float LLJJJJ;
    public final float LLJJJJJIL;
    public final float LLJJJJLIIL;
    public final float LLJJL;
    public final float LLJJLIIIJLLLLLLLZ;
    public final float LLJL;
    public final float LLJLIL;
    public final float LLJLILLLLZIIL;
    public final float LLJLL;
    public final float LLJLLIL;
    public float LLJLLL;
    public float LLJZ;
    public float LLJZIJLIL;
    public float LLL;
    public float LLLF;
    public float LLLFF;
    public float LLLFFI;
    public EnumC1723110uwP LLLFZ;
    public C989340bqu LLLI;
    public String LLLII;
    public EnumC1723140uwS LLLIIII;
    public EnumC992100bvM LLLIIIIL;
    public EnumC1719500uqa LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public InterfaceC1754720vlO LLLJIL;
    public InterfaceC1237370iIx LLLJL;

    private final int getBackgroundColor() {
        return LIZIZ(this.LLILZ);
    }

    private final int getBoxCount() {
        C989340bqu c989340bqu = this.LLLI;
        if (c989340bqu != null) {
            return c989340bqu.LIZIZ;
        }
        return 0;
    }

    private final int getCursorColor() {
        return LIZIZ(this.LLILZLL);
    }

    private final int getErrorColor() {
        return LIZIZ(this.LLILZIL);
    }

    private final int getMaskEmptyColor() {
        return LIZIZ(this.LLIZ);
    }

    private final int getMaskFilledColor() {
        return LIZIZ(this.LLIZLLLIL);
    }

    private final int getPlaceholderColor() {
        return LIZIZ(this.LLJ);
    }

    private final int getSeparatorCount() {
        List<Integer> list;
        int size;
        C989340bqu c989340bqu = this.LLLI;
        if (c989340bqu == null || (list = c989340bqu.LIZ) == null || (size = list.size()) == 0) {
            return 0;
        }
        return size - 1;
    }

    private final int getTextColor() {
        return LIZIZ(this.LLJI);
    }

    @Override // X.InterfaceC1237410iJ1
    public final void LIZ() throws Throwable {
        InterfaceC1237370iIx interfaceC1237370iIx = this.LLLJL;
        if (interfaceC1237370iIx != null) {
            Editable editableLLLLIL = C2204961BRm.LLLLIL(this.LLJJJ, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT+dIHXv4R4h/56FJA8AVtffBRx", null));
            C989340bqu c989340bqu = this.LLLI;
            interfaceC1237370iIx.LJJII(c989340bqu != null ? c989340bqu.LIZIZ : 0, editableLLLLIL);
        }
    }

    public final boolean LIZLLL() {
        int i = C1723130uwR.LIZ[this.LLLIIII.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
                return false;
            }
        } else if (this.LLLILZ) {
            return false;
        }
        return true;
    }

    public final void LJ() {
        float separatorCount;
        if (!this.LLLIIL) {
            separatorCount = C418440Gaw.LIZIZ(48);
        } else if (getBoxCount() == 0) {
            separatorCount = 0.0f;
        } else {
            separatorCount = (((this.LLJZ - this.LLJLLL) - (getSeparatorCount() * this.LLJLL)) - (getSpaceCount() * this.LLJLLIL)) / getBoxCount();
        }
        this.LLLFF = separatorCount;
    }

    public final void LJI() {
        InputFilter[] inputFilterArr;
        C989340bqu c989340bqu = this.LLLI;
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(c989340bqu != null ? c989340bqu.LIZIZ : 0);
        C1754690vlL c1754690vlL = this.LLJJJ;
        int i = C1723130uwR.LIZIZ[this.LLLFZ.ordinal()];
        if (i == 1) {
            inputFilterArr = new InputFilter[]{lengthFilter, this.LL, new InputFilter.AllCaps()};
        } else if (i == 2) {
            inputFilterArr = new InputFilter[]{lengthFilter, this.LLILLJJLI};
        } else {
            if (i != 3) {
                throw new C1954807lC();
            }
            inputFilterArr = new InputFilter[]{lengthFilter, this.LLILLL, new InputFilter.AllCaps()};
        }
        c1754690vlL.setFilters(inputFilterArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            r4 = this;
            X.0vlL r3 = r4.LLJJJ
            X.0uwP r0 = r4.LLLFZ
            int[] r1 = X.C1723130uwR.LIZIZ
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r0 = 1
            if (r2 == r0) goto L1b
            r1 = 2
            if (r2 == r1) goto L25
            r0 = 3
            if (r2 == r0) goto L1b
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L1b:
            boolean r0 = r4.LLLILZ
            if (r0 == 0) goto L22
            r1 = 4225(0x1081, float:5.92E-42)
            goto L2b
        L22:
            r1 = 4241(0x1091, float:5.943E-42)
            goto L2b
        L25:
            boolean r0 = r4.LLLILZ
            if (r0 == 0) goto L2b
            r1 = 18
        L2b:
            r3.setInputType(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1754650vlH.LJII():void");
    }

    public final CharSequence getText() {
        return C2204961BRm.LLLLIL(this.LLJJJ, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT+dIHXv4R4h/56FJA8AVtffBRx", null));
    }

    private final int getNonAutoSizeWidth() {
        return C814420VxA.LIZIZ((getBoxCount() * this.LLLFF) + (getSeparatorCount() * this.LLJLL) + (getSpaceCount() * this.LLJLLIL));
    }

    private final int getSpaceCount() {
        int boxCount = (getBoxCount() + getSeparatorCount()) - 1;
        if (boxCount < 0) {
            return 0;
        }
        return boxCount;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJIII.cancel();
        this.LLJJI.LIZ();
    }

    @Override // X.InterfaceC1237420iJ2
    public InterfaceC1237390iIz getContentUpdateDelegate() {
        return this.LLJJIJI;
    }

    public final boolean getEnableDrawboxBorder() {
        return this.LLJJJIL;
    }

    public final int LIZIZ(int i) {
        if (!isEnabled()) {
            return C2441009hQ.LJIIL(i, C814420VxA.LIZIZ(((i >> 24) & 255) * 0.4f));
        }
        return i;
    }

    public final void LJFF(boolean z) {
        if (z && LIZLLL()) {
            this.LLJJ.start();
        } else {
            this.LLJJ.cancel();
            this.LLLIILIL = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        boolean z;
        float f;
        List<Integer> list;
        int length;
        String string;
        if (getBoxCount() == 0) {
            return;
        }
        EnumC1719500uqa enumC1719500uqa = this.LLLIIIL;
        int i = 1;
        if (enumC1719500uqa != EnumC1719500uqa.LTR && (enumC1719500uqa != EnumC1719500uqa.LAYOUT || getLayoutDirection() == 1)) {
            z = false;
            i = -1;
        } else {
            z = true;
        }
        float f2 = this.LLLFF;
        float f3 = this.LLJLLIL;
        float f4 = i;
        float f5 = (f2 + f3) * f4;
        float f6 = this.LLJLL;
        float f7 = (f3 + f6) * f4;
        float f8 = 0.5f;
        float f9 = f6 * 0.5f;
        if (!z) {
            f9 = f2 - f9;
        }
        float f10 = this.LLJJL * f4;
        if (z) {
            f = this.LLJLLL;
        } else {
            f = this.LLJZ - f2;
        }
        C989340bqu c989340bqu = this.LLLI;
        if (c989340bqu != null && (list = c989340bqu.LIZ) != null) {
            int i2 = 0;
            int i3 = 0;
            for (Integer num : list) {
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    int iIntValue = num.intValue();
                    if (i2 > 0) {
                        if (this.LLLIIIIL == EnumC992100bvM.DASH) {
                            float f11 = this.LLLF;
                            this.LLJILJILJ.setColor(getTextColor());
                            C20588115hH.LIZIZ(canvas, "–", 0, 1, f + f9, f11, this.LLJILJILJ, this.LLJILLL);
                        }
                        f += f7;
                    }
                    int i5 = 0;
                    while (i5 < iIntValue) {
                        float f12 = this.LLLFF + f;
                        if (this.LLJJJIL) {
                            if (this.LLLILZJ) {
                                int errorColor = getErrorColor();
                                float f13 = this.LLJJJJ * f8;
                                this.LLJILJIL.set(f + f13, this.LLJZIJLIL + f13, f12 - f13, this.LLL - f13);
                                int iLIZIZ = C814420VxA.LIZIZ(((errorColor >> 24) & 255) * this.LLLFFI);
                                Paint paint = this.LLJIJIL;
                                paint.setColor(C2441009hQ.LJIIL(errorColor, iLIZIZ));
                                paint.setStyle(Paint.Style.STROKE);
                                paint.setStrokeCap(Paint.Cap.BUTT);
                                paint.setStrokeWidth(this.LLJJJJ);
                                RectF rectF = this.LLJILJIL;
                                float f14 = this.LLJJJJJIL;
                                canvas.drawRoundRect(rectF, f14, f14, this.LLJIJIL);
                            } else {
                                this.LLJILJIL.set(f, this.LLJZIJLIL, f12, this.LLL);
                                this.LLJIJIL.setColor(getBackgroundColor());
                                this.LLJIJIL.setStyle(Paint.Style.FILL);
                                RectF rectF2 = this.LLJILJIL;
                                float f15 = this.LLJJJJJIL;
                                canvas.drawRoundRect(rectF2, f15, f15, this.LLJIJIL);
                            }
                        }
                        Editable editableLLLLIL = C2204961BRm.LLLLIL(this.LLJJJ, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT+dIHXv4R4h/56FJA8AVtffBRx", null));
                        if (editableLLLLIL != null) {
                            length = editableLLLLIL.length();
                        } else {
                            length = 0;
                        }
                        float f16 = (f12 + f) * 0.5f;
                        if (i3 < length) {
                            if (this.LLLILZ) {
                                float f18 = this.LLLF;
                                this.LLJIJIL.setColor(getMaskFilledColor());
                                this.LLJIJIL.setStyle(Paint.Style.FILL);
                                canvas.drawCircle(f16, f18, this.LLJLILLLLZIIL, this.LLJIJIL);
                            } else {
                                Editable editableLLLLIL2 = C2204961BRm.LLLLIL(this.LLJJJ, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT+dIHXv4R4h/56FJA8AVtffBRx", null));
                                if (editableLLLLIL2 == null || (string = editableLLLLIL2.toString()) == null) {
                                    string = "";
                                }
                                float f19 = this.LLLF;
                                this.LLJILJILJ.setColor(getTextColor());
                                C20588115hH.LIZIZ(canvas, string, i3, i3 + 1, f16, f19, this.LLJILJILJ, this.LLJILLL);
                            }
                            if (i3 == getBoxCount() - 1 && isFocused() && LIZLLL() && this.LLLIILIL) {
                                LIZJ(f16 + f10, this.LLLF, canvas);
                            }
                        } else if (i3 == length && isFocused() && LIZLLL()) {
                            if (this.LLLIILIL) {
                                LIZJ(f16, this.LLLF, canvas);
                            }
                        } else if (this.LLLILZ) {
                            float f20 = this.LLLF;
                            float f21 = this.LLJLIL * 0.5f;
                            Paint paint2 = this.LLJIJIL;
                            paint2.setColor(getMaskEmptyColor());
                            paint2.setStyle(Paint.Style.STROKE);
                            paint2.setStrokeCap(Paint.Cap.BUTT);
                            paint2.setStrokeWidth(this.LLJLIL);
                            canvas.drawCircle(f16, f20, this.LLJLILLLLZIIL - f21, this.LLJIJIL);
                        } else {
                            String str = this.LLLII;
                            if (str != null) {
                                float f22 = this.LLLF;
                                this.LLJILJILJ.setColor(getPlaceholderColor());
                                C20588115hH.LIZ(canvas, str, f16, f22, this.LLJILJILJ, this.LLJILLL);
                            }
                        }
                        i3++;
                        f += f5;
                        i5++;
                        f8 = 0.5f;
                    }
                    i2 = i4;
                    f8 = 0.5f;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        this.LLLILZLLLI = true;
        super.onRestoreInstanceState(parcelable);
        this.LLLILZLLLI = false;
    }

    public final void setAutoWidth(boolean z) {
        this.LLLIIL = z;
        LJ();
        requestLayout();
    }

    public final void setDeleteAllAfterError(boolean z) {
        this.LLLIZZ = z;
    }

    public final void setDimOnComplete(boolean z) {
        this.LLLIL = z;
    }

    public final void setDirection(EnumC1719500uqa enumC1719500uqa) {
        this.LLLIIIL = enumC1719500uqa;
        invalidate();
    }

    public final void setEnableDrawboxBorder(boolean z) {
        this.LLJJJIL = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setEnabled(z);
    }

    public final void setIsFocused(boolean z) {
        InputMethodManager inputMethodManager;
        if (z) {
            if (requestFocus() && (inputMethodManager = (InputMethodManager) C446980Hfs.LIZIZ(getContext(), InputMethodManager.class)) != null) {
                inputMethodManager.showSoftInput(this.LLJJJ, 1);
                return;
            }
            return;
        }
        clearFocus();
        InputMethodManager inputMethodManager2 = (InputMethodManager) C446980Hfs.LIZIZ(getContext(), InputMethodManager.class);
        if (inputMethodManager2 == null) {
            return;
        }
        inputMethodManager2.hideSoftInputFromWindow(getWindowToken(), 2);
    }

    public final void setListener(InterfaceC1754720vlO interfaceC1754720vlO) {
        this.LLLJIL = interfaceC1754720vlO;
    }

    public final void setMasked(boolean z) {
        this.LLLILZ = z;
        LJFF(isFocused());
        LJII();
        invalidate();
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        setOnLongClickListener(onLongClickListener);
    }

    public final void setPattern(C989340bqu c989340bqu) {
        this.LLLI = c989340bqu;
        setText("");
        LJI();
        LIZ();
        requestLayout();
    }

    public final void setPinType(EnumC1723110uwP enumC1723110uwP) {
        this.LLLFZ = enumC1723110uwP;
        setText("");
        LJI();
        LJII();
    }

    public final void setPlaceholder(Character ch) {
        String upperCase;
        if (ch != null) {
            upperCase = String.valueOf(ch.charValue()).toUpperCase(Locale.ROOT);
        } else {
            upperCase = null;
        }
        this.LLLII = upperCase;
        invalidate();
    }

    public final void setSeparator(EnumC992100bvM enumC992100bvM) {
        this.LLLIIIIL = enumC992100bvM;
        requestLayout();
    }

    public final void setShowCursor(EnumC1723140uwS enumC1723140uwS) {
        this.LLLIIII = enumC1723140uwS;
        LJFF(isFocused());
        invalidate();
    }

    @Override // X.InterfaceC1237410iJ1
    public void setTuxFieldContentCallback(InterfaceC1237370iIx interfaceC1237370iIx) {
        this.LLLJL = interfaceC1237370iIx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.07k0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.07k0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.07k0] */
    /* JADX WARN: Type inference failed for: r0v83, types: [X.0vb9] */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.0vlL, android.view.View, android.widget.TextView] */
    public C1754650vlH(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.yf);
        final C1992707rJ c1992707rJ = C1992707rJ.LL;
        this.LL = new InputFilter() { // from class: X.07k0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                StringBuilder sb = new StringBuilder();
                for (int i5 = i; i5 < i2; i5++) {
                    char cCharAt = charSequence.charAt(i5);
                    if (c1992707rJ.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                        sb.append(cCharAt);
                    }
                }
                if (sb.length() == i2 - i) {
                    return null;
                }
                return sb.toString();
            }
        };
        final C1992407rG c1992407rG = C1992407rG.LL;
        this.LLILLJJLI = new InputFilter() { // from class: X.07k0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                StringBuilder sb = new StringBuilder();
                for (int i5 = i; i5 < i2; i5++) {
                    char cCharAt = charSequence.charAt(i5);
                    if (c1992407rG.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                        sb.append(cCharAt);
                    }
                }
                if (sb.length() == i2 - i) {
                    return null;
                }
                return sb.toString();
            }
        };
        final C1992907rL c1992907rL = C1992907rL.LL;
        this.LLILLL = new InputFilter() { // from class: X.07k0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                StringBuilder sb = new StringBuilder();
                for (int i5 = i; i5 < i2; i5++) {
                    char cCharAt = charSequence.charAt(i5);
                    if (c1992907rL.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                        sb.append(cCharAt);
                    }
                }
                if (sb.length() == i2 - i) {
                    return null;
                }
                return sb.toString();
            }
        };
        this.LLJJJIL = true;
        this.LLJJJJ = C418440Gaw.LIZIZ(2);
        this.LLJJJJJIL = C418440Gaw.LIZIZ(8);
        this.LLJJJJLIIL = C418440Gaw.LIZIZ(52);
        this.LLJJL = C418440Gaw.LIZIZ(12);
        this.LLJJLIIIJLLLLLLLZ = C418440Gaw.LIZIZ(22);
        this.LLJL = C418440Gaw.LIZIZ(2);
        this.LLJLIL = C418440Gaw.LIZIZ(1);
        this.LLJLILLLLZIIL = C418440Gaw.LIZIZ(6);
        this.LLJLL = C418440Gaw.LIZIZ(14);
        this.LLJLLIL = C418440Gaw.LIZIZ(6);
        this.LLLFFI = 1.0f;
        this.LLLFZ = EnumC1723110uwP.NUMERIC;
        this.LLLIIII = EnumC1723140uwS.DEFAULT;
        this.LLLIIIIL = EnumC992100bvM.DASH;
        this.LLLIIIL = EnumC1719500uqa.LTR;
        this.LLLIL = true;
        this.LLLIZZ = true;
        TextWatcher textWatcher = new TextWatcher() { // from class: X.0vlJ
            public boolean LL;
            public int LLILLJJLI;

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) throws Throwable {
                int length;
                int i;
                if (editable != null) {
                    length = editable.length();
                } else {
                    length = 0;
                }
                C1754650vlH c1754650vlH = this.LLILLL;
                C989340bqu c989340bqu = c1754650vlH.LLLI;
                if (c989340bqu != null) {
                    i = c989340bqu.LIZIZ;
                } else {
                    i = 0;
                }
                if (length > 0 && !this.LL) {
                    this.LL = true;
                    InterfaceC1754720vlO interfaceC1754720vlO = c1754650vlH.LLLJIL;
                    if (interfaceC1754720vlO != null) {
                        interfaceC1754720vlO.LJJLL();
                    }
                }
                C1754650vlH c1754650vlH2 = this.LLILLL;
                if (c1754650vlH2.LLLILZJ) {
                    if (length < this.LLILLJJLI && c1754650vlH2.LLLIZZ && editable != null) {
                        editable.clear();
                    }
                    C1754650vlH c1754650vlH3 = this.LLILLL;
                    if (c1754650vlH3.LLLILZJ) {
                        c1754650vlH3.LLJJIII.cancel();
                        c1754650vlH3.LLJJI.LIZ();
                        c1754650vlH3.LLLILZJ = false;
                        c1754650vlH3.LIZ();
                        c1754650vlH3.invalidate();
                    }
                }
                C1754650vlH c1754650vlH4 = this.LLILLL;
                if ((!c1754650vlH4.LLLILZLLLI || c1754650vlH4.LLLJ) && length > 0 && length == i) {
                    if (c1754650vlH4.LLLIL) {
                        c1754650vlH4.setEnabled(false);
                    }
                    InterfaceC1754720vlO interfaceC1754720vlO2 = this.LLILLL.LLLJIL;
                    if (interfaceC1754720vlO2 != null) {
                        interfaceC1754720vlO2.LJJZ(editable);
                    }
                }
                InterfaceC1754720vlO interfaceC1754720vlO3 = this.LLILLL.LLLJIL;
                if (interfaceC1754720vlO3 != null) {
                    interfaceC1754720vlO3.LJJZZI();
                }
                InterfaceC1237370iIx interfaceC1237370iIx = this.LLILLL.LLLJL;
                if (interfaceC1237370iIx != null) {
                    interfaceC1237370iIx.LJJII(i, editable);
                }
                this.LLILLL.invalidate();
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int length;
                if (charSequence != null) {
                    length = charSequence.length();
                } else {
                    length = 0;
                }
                this.LLILLJJLI = length;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxPinField, R.attr.yf, 0);
        this.LLILZ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxPinField__tux_pinFieldBackgroundColor, 0);
        this.LLILZLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxPinField__tux_pinFieldCursorColor, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxPinField__tux_pinFieldErrorColor, 0);
        this.LLIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxPinField__tux_pinFieldMaskEmptyColor, 0);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxPinField__tux_pinFieldMaskFilledColor, 0);
        this.LLJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxPinField__tux_pinFieldPlaceholderColor, 0);
        this.LLJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxPinField__tux_pinFieldTextColor, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxPinField__tux_pinFieldErrorMessage);
        this.LLJJIJIIJIL = strXd == null ? "" : strXd;
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxPinField__tux_pinFieldFont, 0);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        this.LLJIJIL = new Paint(1);
        this.LLJILJIL = new RectF();
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.setAntiAlias(true);
        c444890HcV.LIZ(integer);
        c444890HcV.setFontFeatureSettings("lnum, tnum");
        this.LLJILJILJ = c444890HcV;
        this.LLJILLL = new Rect();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(new Interpolator() { // from class: X.0vlQ
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f >= 0.5f ? 1.0f : 0.0f;
            }
        });
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(2);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(this, 10));
        this.LLJJ = valueAnimatorOfInt;
        this.LLJJI = new C21647019ng(context, this, new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.42f), new C1342130l1v(0.0f), new C1342130l1v(0.58f), new C1342130l1v(1.0f), 72L), C1697810uHb.LJIIJJI(new C19746412Nq("move1", new C082N(0.0f, C418440Gaw.LIZIZ(8))), new C19746412Nq("move2", new C082N(C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(-8))), new C19746412Nq("move3", new C082N(C418440Gaw.LIZIZ(-8), C418440Gaw.LIZIZ(5))), new C19746412Nq("move4", new C082N(C418440Gaw.LIZIZ(5), C418440Gaw.LIZIZ(-5))), new C19746412Nq("move5", new C082N(C418440Gaw.LIZIZ(-5), C418440Gaw.LIZIZ(2))), new C19746412Nq("move6", new C082N(C418440Gaw.LIZIZ(2), C418440Gaw.LIZIZ(-2))), new C19746412Nq("move7", new C082N(C418440Gaw.LIZIZ(-2), 0.0f)))), false);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(this, 11));
        valueAnimatorOfFloat.addListener(new ALAdapterS21S0100000_26(this, 0));
        this.LLJJIII = valueAnimatorOfFloat;
        this.LLJJIJI = new InterfaceC1237390iIz() { // from class: X.0vb9
            @Override // X.InterfaceC1237390iIz
            public final void LIZ(C1748330vb5 c1748330vb5, CharSequence charSequence, int i) {
                int length;
                C1754650vlH c1754650vlH = this.LIZ;
                if (c1754650vlH.LLLILZJ) {
                    c1748330vb5.setFadeInMessage(true);
                    c1748330vb5.setMessageStyle(C338180DNo.LIZ);
                    String str = c1754650vlH.LLJJIJIL;
                    if (str != null) {
                        c1748330vb5.setMessage(str);
                        c1754650vlH.LLJJIJIL = null;
                    } else {
                        c1748330vb5.setMessage(c1754650vlH.LLJJIJIIJIL);
                    }
                } else {
                    c1748330vb5.setMessage(null);
                }
                if (charSequence != null) {
                    length = charSequence.length();
                } else {
                    length = 0;
                }
                c1748330vb5.LLJJI = length;
                c1748330vb5.LLJJIII = i;
                c1748330vb5.LIZ();
            }
        };
        ?? r2 = new C0I7D(context) { // from class: X.0vlL
            {
                setCursorVisible(false);
                setTextIsSelectable(false);
                setWillNotDraw(true);
            }

            @Override // android.widget.TextView
            public final void onSelectionChanged(int i, int i2) throws Throwable {
                int length;
                Editable editableLLLLIL = C2204961BRm.LLLLIL(this, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT+dIHXv4R4h/56FJA8AVtffBRxofSxdqtz+mI=", null));
                if (editableLLLLIL != null && (i != (length = editableLLLLIL.length()) || i2 != length)) {
                    setSelection(length);
                } else {
                    super.onSelectionChanged(i, i2);
                }
            }
        };
        this.LLJJJ = r2;
        r2.addTextChangedListener(textWatcher);
        r2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 0));
        addView((View) r2, -1, -1);
        LJI();
        LJII();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (!this.LLLIIL && mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(getNonAutoSizeWidth(), size) : getNonAutoSizeWidth();
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = C814420VxA.LIZIZ(this.LLJJJJLIIL);
            }
        } else {
            size2 = Math.min(C814420VxA.LIZIZ(this.LLJJJJLIIL), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void LIZJ(float f, float f2, Canvas canvas) {
        float f3 = this.LLJJLIIIJLLLLLLLZ * 0.5f;
        Paint paint = this.LLJIJIL;
        paint.setColor(getCursorColor());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.LLJL);
        canvas.drawLine(f, f2 - f3, f, f2 + f3, this.LLJIJIL);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJLLL = getPaddingLeft();
        this.LLJZ = getWidth() - getPaddingRight();
        this.LLJZIJLIL = getPaddingTop();
        float height = getHeight() - getPaddingBottom();
        this.LLL = height;
        this.LLLF = (this.LLJZIJLIL + height) * 0.5f;
        LJ();
    }
}
