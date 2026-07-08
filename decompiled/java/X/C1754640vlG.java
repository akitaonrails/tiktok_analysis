package X;

import Y.ALAdapterS21S0100000_26;
import Y.AUListenerS274S0100000_26;
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

/* JADX INFO: renamed from: X.0vlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1754640vlG extends FrameLayout implements InterfaceC1237420iJ2 {
    public static final /* synthetic */ int LLLJL = 0;
    public final C1947307jz LL;
    public final C1947307jz LLILLJJLI;
    public final C1947307jz LLILLL;
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
    public final C1748360vb8 LLJJIJI;
    public final String LLJJIJIIJIL;
    public String LLJJIJIL;
    public final C1754700vlM LLJJJ;
    public final float LLJJJIL;
    public final float LLJJJJ;
    public final float LLJJJJJIL;
    public final float LLJJJJLIIL;
    public final float LLJJL;
    public final float LLJJLIIIJLLLLLLLZ;
    public final float LLJL;
    public final float LLJLIL;
    public final float LLJLILLLLZIIL;
    public final float LLJLL;
    public float LLJLLIL;
    public float LLJLLL;
    public float LLJZ;
    public float LLJZIJLIL;
    public float LLL;
    public float LLLF;
    public float LLLFF;
    public EnumC1723120uwQ LLLFFI;
    public C339010DQt LLLFZ;
    public String LLLI;
    public EnumC1723160uwU LLLII;
    public EnumC992110bvN LLLIIII;
    public EnumC1719510uqb LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public InterfaceC1754730vlP LLLJ;
    public InterfaceC1237370iIx LLLJIL;

    public C1754640vlG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getBackgroundColor() {
        return LIZIZ(this.LLILZ);
    }

    private final int getBoxCount() {
        C339010DQt c339010DQt = this.LLLFZ;
        if (c339010DQt != null) {
            return c339010DQt.LIZIZ;
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
        C339010DQt c339010DQt = this.LLLFZ;
        if (c339010DQt == null || (list = c339010DQt.LIZ) == null || (size = list.size()) == 0) {
            return 0;
        }
        return size - 1;
    }

    private final int getTextColor() {
        return LIZIZ(this.LLJI);
    }

    @Override // X.InterfaceC1237410iJ1
    public final void LIZ() throws Throwable {
        InterfaceC1237370iIx interfaceC1237370iIx = this.LLLJIL;
        if (interfaceC1237370iIx != null) {
            Editable editableLLLLILI = C2204961BRm.LLLLILI(this.LLJJJ, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT+dIHXu7hQmMN13gADE2U=", null));
            C339010DQt c339010DQt = this.LLLFZ;
            interfaceC1237370iIx.LJJII(c339010DQt != null ? c339010DQt.LIZIZ : 0, editableLLLLILI);
        }
    }

    public final void LIZJ() {
        if (this.LLLILZ) {
            this.LLJJIII.cancel();
            this.LLJJI.LIZ();
            this.LLLILZ = false;
            LIZ();
            invalidate();
        }
    }

    public final boolean LJFF() {
        int i = C1723150uwT.LIZ[this.LLLII.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
                return false;
            }
        } else if (this.LLLIL) {
            return false;
        }
        return true;
    }

    public final void LJII() {
        float separatorCount;
        if (!this.LLLIIIL) {
            separatorCount = C418440Gaw.LIZIZ(48);
        } else if (getBoxCount() == 0) {
            separatorCount = 0.0f;
        } else {
            separatorCount = (((this.LLJLLL - this.LLJLLIL) - (getSeparatorCount() * this.LLJLILLLLZIIL)) - (getSpaceCount() * this.LLJLL)) / getBoxCount();
        }
        this.LLLF = separatorCount;
    }

    public final void LJIIIZ() {
        InputFilter[] inputFilterArr;
        C339010DQt c339010DQt = this.LLLFZ;
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(c339010DQt != null ? c339010DQt.LIZIZ : 0);
        C1754700vlM c1754700vlM = this.LLJJJ;
        int i = C1723150uwT.LIZIZ[this.LLLFFI.ordinal()];
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
        c1754700vlM.setFilters(inputFilterArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            r4 = this;
            X.0vlM r3 = r4.LLJJJ
            X.0uwQ r0 = r4.LLLFFI
            int[] r1 = X.C1723150uwT.LIZIZ
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
            boolean r0 = r4.LLLIL
            if (r0 == 0) goto L22
            r1 = 4225(0x1081, float:5.92E-42)
            goto L2b
        L22:
            r1 = 4241(0x1091, float:5.943E-42)
            goto L2b
        L25:
            boolean r0 = r4.LLLIL
            if (r0 == 0) goto L2b
            r1 = 18
        L2b:
            r3.setInputType(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1754640vlG.LJIIJ():void");
    }

    public final CharSequence getText() {
        return C2204961BRm.LLLLILI(this.LLJJJ, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT+dIHXu7hQmMN13gADE2U=", null));
    }

    private final int getNonAutoSizeWidth() {
        return C814420VxA.LIZIZ((getBoxCount() * this.LLLF) + (getSeparatorCount() * this.LLJLILLLLZIIL) + (getSpaceCount() * this.LLJLL));
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

    public final int LIZIZ(int i) {
        if (!isEnabled()) {
            return C2441009hQ.LJIIL(i, C814420VxA.LIZIZ(((i >> 24) & 255) * 0.4f));
        }
        return i;
    }

    public final void LJI(String str) {
        if (this.LLLILZ) {
            return;
        }
        this.LLJJIJIL = str;
        this.LLJJIII.start();
        setEnabled(true);
        this.LLLILZ = true;
        LIZ();
        invalidate();
    }

    public final void LJIIIIZZ(boolean z) {
        if (z && LJFF()) {
            this.LLJJ.start();
        } else {
            this.LLJJ.cancel();
            this.LLLIIL = false;
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
        EnumC1719510uqb enumC1719510uqb = this.LLLIIIIL;
        int i = 1;
        if (enumC1719510uqb != EnumC1719510uqb.LTR && (enumC1719510uqb != EnumC1719510uqb.LAYOUT || getLayoutDirection() == 1)) {
            z = false;
            i = -1;
        } else {
            z = true;
        }
        float f2 = this.LLLF;
        float f3 = this.LLJLL;
        float f4 = i;
        float f5 = (f2 + f3) * f4;
        float f6 = this.LLJLILLLLZIIL;
        float f7 = (f3 + f6) * f4;
        float f8 = 0.5f;
        float f9 = f6 * 0.5f;
        if (!z) {
            f9 = f2 - f9;
        }
        float f10 = this.LLJJJJLIIL * f4;
        if (z) {
            f = this.LLJLLIL;
        } else {
            f = this.LLJLLL - f2;
        }
        C339010DQt c339010DQt = this.LLLFZ;
        if (c339010DQt != null && (list = c339010DQt.LIZ) != null) {
            int i2 = 0;
            int i3 = 0;
            for (Integer num : list) {
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    int iIntValue = num.intValue();
                    if (i2 > 0) {
                        if (this.LLLIIII == EnumC992110bvN.DASH) {
                            float f11 = this.LLL;
                            this.LLJILJILJ.setColor(getTextColor());
                            C20588115hH.LIZIZ(canvas, "–", 0, 1, f + f9, f11, this.LLJILJILJ, this.LLJILLL);
                        }
                        f += f7;
                    }
                    int i5 = 0;
                    while (i5 < iIntValue) {
                        float f12 = this.LLLF + f;
                        if (this.LLLILZ) {
                            int errorColor = getErrorColor();
                            float f13 = this.LLJJJIL * f8;
                            this.LLJILJIL.set(f + f13, this.LLJZ + f13, f12 - f13, this.LLJZIJLIL - f13);
                            int iLIZIZ = C814420VxA.LIZIZ(((errorColor >> 24) & 255) * this.LLLFF);
                            Paint paint = this.LLJIJIL;
                            paint.setColor(C2441009hQ.LJIIL(errorColor, iLIZIZ));
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeCap(Paint.Cap.BUTT);
                            paint.setStrokeWidth(this.LLJJJIL);
                            RectF rectF = this.LLJILJIL;
                            float f14 = this.LLJJJJ;
                            canvas.drawRoundRect(rectF, f14, f14, this.LLJIJIL);
                        } else {
                            this.LLJILJIL.set(f, this.LLJZ, f12, this.LLJZIJLIL);
                            this.LLJIJIL.setColor(getBackgroundColor());
                            this.LLJIJIL.setStyle(Paint.Style.FILL);
                            RectF rectF2 = this.LLJILJIL;
                            float f15 = this.LLJJJJ;
                            canvas.drawRoundRect(rectF2, f15, f15, this.LLJIJIL);
                        }
                        Editable editableLLLLILI = C2204961BRm.LLLLILI(this.LLJJJ, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT+dIHXu7hQmMN13gADE2U=", null));
                        if (editableLLLLILI != null) {
                            length = editableLLLLILI.length();
                        } else {
                            length = 0;
                        }
                        float f16 = (f12 + f) * 0.5f;
                        if (i3 < length) {
                            if (this.LLLIL) {
                                float f18 = this.LLL;
                                this.LLJIJIL.setColor(getMaskFilledColor());
                                this.LLJIJIL.setStyle(Paint.Style.FILL);
                                canvas.drawCircle(f16, f18, this.LLJLIL, this.LLJIJIL);
                            } else {
                                Editable editableLLLLILI2 = C2204961BRm.LLLLILI(this.LLJJJ, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT+dIHXu7hQmMN13gADE2U=", null));
                                if (editableLLLLILI2 == null || (string = editableLLLLILI2.toString()) == null) {
                                    string = "";
                                }
                                float f19 = this.LLL;
                                this.LLJILJILJ.setColor(getTextColor());
                                C20588115hH.LIZIZ(canvas, string, i3, i3 + 1, f16, f19, this.LLJILJILJ, this.LLJILLL);
                            }
                            if (i3 == getBoxCount() - 1 && isFocused() && LJFF() && this.LLLIIL) {
                                LIZLLL(f16 + f10, this.LLL, canvas);
                            }
                        } else if (i3 == length && isFocused() && LJFF()) {
                            if (this.LLLIIL) {
                                LIZLLL(f16, this.LLL, canvas);
                            }
                        } else if (this.LLLIL) {
                            float f20 = this.LLL;
                            float f21 = this.LLJL * 0.5f;
                            Paint paint2 = this.LLJIJIL;
                            paint2.setColor(getMaskEmptyColor());
                            paint2.setStyle(Paint.Style.STROKE);
                            paint2.setStrokeCap(Paint.Cap.BUTT);
                            paint2.setStrokeWidth(this.LLJL);
                            canvas.drawCircle(f16, f20, this.LLJLIL - f21, this.LLJIJIL);
                        } else {
                            String str = this.LLLI;
                            if (str != null) {
                                float f22 = this.LLL;
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
        this.LLLILZJ = true;
        super.onRestoreInstanceState(parcelable);
        this.LLLILZJ = false;
    }

    public final void setAutoWidth(boolean z) {
        this.LLLIIIL = z;
        LJII();
        requestLayout();
    }

    public final void setDeleteAllAfterError(boolean z) {
        this.LLLILZLLLI = z;
    }

    public final void setDimOnComplete(boolean z) {
        this.LLLIILIL = z;
    }

    public final void setDirection(EnumC1719510uqb enumC1719510uqb) {
        this.LLLIIIIL = enumC1719510uqb;
        invalidate();
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

    public final void setListener(InterfaceC1754730vlP interfaceC1754730vlP) {
        this.LLLJ = interfaceC1754730vlP;
    }

    public final void setMasked(boolean z) {
        this.LLLIL = z;
        LJIIIIZZ(isFocused());
        LJIIJ();
        invalidate();
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        setOnLongClickListener(onLongClickListener);
    }

    public final void setPattern(C339010DQt c339010DQt) {
        this.LLLFZ = c339010DQt;
        setText("");
        LJIIIZ();
        LIZ();
        requestLayout();
    }

    public final void setPinType(EnumC1723120uwQ enumC1723120uwQ) {
        this.LLLFFI = enumC1723120uwQ;
        setText("");
        LJIIIZ();
        LJIIJ();
    }

    public final void setPlaceholder(Character ch) {
        String upperCase;
        if (ch != null) {
            upperCase = String.valueOf(ch.charValue()).toUpperCase(Locale.ROOT);
        } else {
            upperCase = null;
        }
        this.LLLI = upperCase;
        invalidate();
    }

    public final void setSeparator(EnumC992110bvN enumC992110bvN) {
        this.LLLIIII = enumC992110bvN;
        requestLayout();
    }

    public final void setShowCursor(EnumC1723160uwU enumC1723160uwU) {
        this.LLLII = enumC1723160uwU;
        LJIIIIZZ(isFocused());
        invalidate();
    }

    @Override // X.InterfaceC1237410iJ1
    public void setTuxFieldContentCallback(InterfaceC1237370iIx interfaceC1237370iIx) {
        this.LLLJIL = interfaceC1237370iIx;
    }

    public final void LJ(CharSequence charSequence, boolean z) {
        this.LLLIZZ = z;
        setText(charSequence);
        this.LLLIZZ = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (!this.LLLIIIL && mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(getNonAutoSizeWidth(), size) : getNonAutoSizeWidth();
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = C814420VxA.LIZIZ(this.LLJJJJJIL);
            }
        } else {
            size2 = Math.min(C814420VxA.LIZIZ(this.LLJJJJJIL), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.07jz] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.07jz] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.07jz] */
    /* JADX WARN: Type inference failed for: r0v68, types: [X.0vb8] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.0vlM, android.view.View, android.widget.TextView] */
    public C1754640vlG(final Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.yf;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        final C1992607rI c1992607rI = C1992607rI.LL;
        this.LL = new InputFilter() { // from class: X.07jz
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                StringBuilder sb = new StringBuilder();
                for (int i7 = i3; i7 < i4; i7++) {
                    char cCharAt = charSequence.charAt(i7);
                    if (c1992607rI.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                        sb.append(cCharAt);
                    }
                }
                if (sb.length() == i4 - i3) {
                    return null;
                }
                return sb.toString();
            }
        };
        final C1992507rH c1992507rH = C1992507rH.LL;
        this.LLILLJJLI = new InputFilter() { // from class: X.07jz
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                StringBuilder sb = new StringBuilder();
                for (int i7 = i3; i7 < i4; i7++) {
                    char cCharAt = charSequence.charAt(i7);
                    if (c1992507rH.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                        sb.append(cCharAt);
                    }
                }
                if (sb.length() == i4 - i3) {
                    return null;
                }
                return sb.toString();
            }
        };
        final C1992807rK c1992807rK = C1992807rK.LL;
        this.LLILLL = new InputFilter() { // from class: X.07jz
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                StringBuilder sb = new StringBuilder();
                for (int i7 = i3; i7 < i4; i7++) {
                    char cCharAt = charSequence.charAt(i7);
                    if (c1992807rK.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                        sb.append(cCharAt);
                    }
                }
                if (sb.length() == i4 - i3) {
                    return null;
                }
                return sb.toString();
            }
        };
        this.LLJJJIL = C418440Gaw.LIZIZ(2);
        this.LLJJJJ = C418440Gaw.LIZIZ(8);
        this.LLJJJJJIL = C418440Gaw.LIZIZ(52);
        this.LLJJJJLIIL = C418440Gaw.LIZIZ(12);
        this.LLJJL = C418440Gaw.LIZIZ(22);
        this.LLJJLIIIJLLLLLLLZ = C418440Gaw.LIZIZ(2);
        this.LLJL = C418440Gaw.LIZIZ(1);
        this.LLJLIL = C418440Gaw.LIZIZ(6);
        this.LLJLILLLLZIIL = C418440Gaw.LIZIZ(14);
        this.LLJLL = C418440Gaw.LIZIZ(6);
        this.LLLFF = 1.0f;
        this.LLLFFI = EnumC1723120uwQ.NUMERIC;
        this.LLLII = EnumC1723160uwU.DEFAULT;
        this.LLLIIII = EnumC992110bvN.DASH;
        this.LLLIIIIL = EnumC1719510uqb.LTR;
        this.LLLIILIL = true;
        this.LLLILZLLLI = true;
        TextWatcher textWatcher = new TextWatcher() { // from class: X.0vlK
            public boolean LL;
            public int LLILLJJLI;

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int length;
                int i3;
                if (editable != null) {
                    length = editable.length();
                } else {
                    length = 0;
                }
                C1754640vlG c1754640vlG = this.LLILLL;
                C339010DQt c339010DQt = c1754640vlG.LLLFZ;
                if (c339010DQt != null) {
                    i3 = c339010DQt.LIZIZ;
                } else {
                    i3 = 0;
                }
                if (length > 0 && !this.LL) {
                    this.LL = true;
                    InterfaceC1754730vlP interfaceC1754730vlP = c1754640vlG.LLLJ;
                    if (interfaceC1754730vlP != null) {
                        interfaceC1754730vlP.LJJLL();
                    }
                }
                C1754640vlG c1754640vlG2 = this.LLILLL;
                if (c1754640vlG2.LLLILZ) {
                    if (length < this.LLILLJJLI && c1754640vlG2.LLLILZLLLI && editable != null) {
                        editable.clear();
                    }
                    this.LLILLL.LIZJ();
                }
                C1754640vlG c1754640vlG3 = this.LLILLL;
                if ((!c1754640vlG3.LLLILZJ || c1754640vlG3.LLLIZZ) && length > 0 && length == i3) {
                    if (c1754640vlG3.LLLIILIL) {
                        c1754640vlG3.setEnabled(false);
                    }
                    InterfaceC1754730vlP interfaceC1754730vlP2 = this.LLILLL.LLLJ;
                    if (interfaceC1754730vlP2 != null) {
                        interfaceC1754730vlP2.LJJZ(editable);
                    }
                }
                InterfaceC1754730vlP interfaceC1754730vlP3 = this.LLILLL.LLLJ;
                if (interfaceC1754730vlP3 != null) {
                    interfaceC1754730vlP3.LIZ(i3, editable);
                }
                InterfaceC1237370iIx interfaceC1237370iIx = this.LLILLL.LLLJIL;
                if (interfaceC1237370iIx != null) {
                    interfaceC1237370iIx.LJJII(i3, editable);
                }
                this.LLILLL.invalidate();
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                int length;
                if (charSequence != null) {
                    length = charSequence.length();
                } else {
                    length = 0;
                }
                this.LLILLJJLI = length;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxPinField, i2, 0);
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
        valueAnimatorOfInt.setInterpolator(new Interpolator() { // from class: X.0vlN
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f >= 0.5f ? 1.0f : 0.0f;
            }
        });
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(2);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS274S0100000_26(this, 1));
        this.LLJJ = valueAnimatorOfInt;
        this.LLJJI = C1754660vlI.LIZ(context, this);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS274S0100000_26(this, 2));
        valueAnimatorOfFloat.addListener(new ALAdapterS21S0100000_26(this, 4));
        this.LLJJIII = valueAnimatorOfFloat;
        this.LLJJIJI = new InterfaceC1237390iIz() { // from class: X.0vb8
            @Override // X.InterfaceC1237390iIz
            public final void LIZ(C1748330vb5 c1748330vb5, CharSequence charSequence, int i3) {
                int length;
                C1754640vlG c1754640vlG = this.LIZ;
                if (c1754640vlG.LLLILZ) {
                    c1748330vb5.setFadeInMessage(true);
                    c1748330vb5.setMessageStyle(C338180DNo.LIZ);
                    String str = c1754640vlG.LLJJIJIL;
                    if (str != null) {
                        c1748330vb5.setMessage(str);
                        c1754640vlG.LLJJIJIL = null;
                    } else {
                        c1748330vb5.setMessage(c1754640vlG.LLJJIJIIJIL);
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
                c1748330vb5.LLJJIII = i3;
                c1748330vb5.LIZ();
            }
        };
        ?? r2 = new C0I7D(context) { // from class: X.0vlM
            {
                setCursorVisible(false);
                setTextIsSelectable(false);
                setWillNotDraw(true);
            }

            @Override // android.widget.TextView
            public final void onSelectionChanged(int i3, int i4) throws Throwable {
                int length;
                Editable editableLLLLILI = C2204961BRm.LLLLILI(this, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT+dIHXu7hQmMN13gADE2X4/2r3BNd+iQ==", null));
                if (editableLLLLILI != null && (i3 != (length = editableLLLLILI.length()) || i4 != length)) {
                    setSelection(length);
                } else {
                    super.onSelectionChanged(i3, i4);
                }
            }
        };
        this.LLJJJ = r2;
        r2.addTextChangedListener(textWatcher);
        r2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 3));
        addView((View) r2, -1, -1);
        LJIIIZ();
        LJIIJ();
    }

    public final void LIZLLL(float f, float f2, Canvas canvas) {
        float f3 = this.LLJJL * 0.5f;
        Paint paint = this.LLJIJIL;
        paint.setColor(getCursorColor());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.LLJJLIIIJLLLLLLLZ);
        canvas.drawLine(f, f2 - f3, f, f2 + f3, this.LLJIJIL);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJLLIL = getPaddingLeft();
        this.LLJLLL = getWidth() - getPaddingRight();
        this.LLJZ = getPaddingTop();
        float height = getHeight() - getPaddingBottom();
        this.LLJZIJLIL = height;
        this.LLL = (this.LLJZ + height) * 0.5f;
        LJII();
    }
}
