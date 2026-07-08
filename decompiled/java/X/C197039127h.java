package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import u4.q0;

/* JADX INFO: renamed from: X.127h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C197039127h extends TuxTextView {
    public final boolean LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public CharSequence LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public C1856690yPr LLJL;
    public final CharSequence LLJLIL;
    public final CharSequence LLJLILLLLZIIL;
    public Integer LLJLL;
    public boolean LLJLLIL;
    public Integer LLJLLL;
    public int LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public Function1<? super C197039127h, Unit> LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public final C197036127e LLLIIII;
    public boolean LLLIIIIL;

    public C197039127h(Context context) {
        this(context, null, 6, 0);
    }

    public C197039127h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public void LJJJJJ() {
        this.LLJLLIL = true;
        this.LLLIIII.LIZLLL = null;
        LJJL();
    }

    @Override // android.view.View
    public final boolean performClick() {
        this.LLLIIIIL = true;
        return super.performClick();
    }

    public final void LJJJZ() {
        q0.LJJIFFI(this, (this.LLLII && !isEnabled() && this.LLLI) ? C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(this.LLJLIL, this.LLJLILLLLZIIL), null, null, null, 0, null, null, 63) : (isEnabled() || !this.LLLI) ? this.LLLII ? this.LLJLIL : null : this.LLJLILLLLZIIL);
    }

    public final void LJJL() {
        if (this.LLJJJJ) {
            if (!this.LLLII) {
                this.LLLIIII.LIZJ(TextUtils.isEmpty(getText()) ? 0 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(4.0f))));
                return;
            }
            if (this.LLJL == null) {
                this.LLJL = new C1856690yPr(getContext(), this.LLJJLIIIJLLLLLLLZ);
            }
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            C1856690yPr c1856690yPr = this.LLJL;
            if (c1856690yPr != null) {
                Integer num = this.LLJLLL;
                c1856690yPr.LJFF((num == null && (num = this.LLJLL) == null) ? -16777216 : num.intValue());
            }
            int i = this.LLLIIII.LIZJ;
            int i2 = width - i;
            if (i2 < 0) {
                i2 = 0;
            }
            int iLIZIZ = C814420VxA.LIZIZ(i2 / 2.0f);
            C1856690yPr c1856690yPr2 = this.LLJL;
            if (c1856690yPr2 != null) {
                c1856690yPr2.setBounds(iLIZIZ, 0, i + iLIZIZ, this.LLLIIII.LIZIZ);
            }
            setCompoundDrawables(this.LLJL, null, null, null);
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    private final void LJJJLIIL() {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf((this.LLL || (this.LLLF && !this.LLJZIJLIL)) ? 200 : this.LLJZ));
            ((GradientDrawable) background).setCornerRadius(fLIZIZ);
            C427690Gpr.LJ(this, fLIZIZ);
        }
    }

    private final int getPaddingLeftValue() {
        return LJJJJLL(getPaddingLeft() > 0 ? getPaddingLeft() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f))));
    }

    private final int getPaddingRightValue() {
        return LJJJJLL(getPaddingRight() > 0 ? getPaddingRight() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f))));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1856690yPr c1856690yPr = this.LLJL;
        if (c1856690yPr != null) {
            c1856690yPr.LJIIJ();
        }
    }

    public final boolean getSupportClickWhenDisable() {
        return this.LLLI;
    }

    private final void setButtonVariantInner(int i) {
        C197041127j c197041127j;
        if (i == 3) {
            return;
        }
        float f = 1.0f;
        if (i == -1) {
            setBackground(null);
            C786410Ut5.w5(this, 1.0f);
            return;
        }
        int i2 = R.attr.a04;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zv);
                        c197041127j = new C197041127j(R.attr.a1l, c384050F3z, R.attr.a1l);
                    } else {
                        if (!isEnabled()) {
                            i2 = R.attr.a1p;
                        }
                        C384050F3z c384050F3z2 = new C384050F3z();
                        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1b);
                        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                        c384050F3z2.LJFF = Integer.valueOf(i2);
                        c197041127j = new C197041127j(i2, c384050F3z2, i2);
                    }
                } else {
                    C384050F3z c384050F3z3 = new C384050F3z();
                    c384050F3z3.LIZIZ = Integer.valueOf(R.attr.zj);
                    c197041127j = new C197041127j(R.attr.zi, c384050F3z3, R.attr.zi);
                }
            } else {
                C384050F3z c384050F3z4 = new C384050F3z();
                c384050F3z4.LIZIZ = Integer.valueOf(R.attr.a03);
                c197041127j = new C197041127j(R.attr.a1h, c384050F3z4, R.attr.a1h);
            }
        } else {
            C384050F3z c384050F3z5 = new C384050F3z();
            c384050F3z5.LIZIZ = Integer.valueOf(R.attr.a04);
            c197041127j = new C197041127j(R.attr.zi, c384050F3z5, R.attr.zi);
        }
        Context context = getContext();
        setTextColorRes(c197041127j.LIZ);
        if (!isEnabled()) {
            f = 0.4f;
        }
        C786410Ut5.w5(this, f);
        setDefaultTintColorRes$tux_theme_release(c197041127j.LIZJ);
        setBackground(c197041127j.LIZIZ.LIZ(context));
        LJJJLIIL();
    }

    public final void LJJJJL(Function1<? super C197039127h, Unit> function1) {
        if (function1 != null) {
            function1.invoke(this);
        }
        this.LLLFF = function1;
    }

    public final void LJJJJLI(boolean z) {
        if (!z) {
            setMinTextSize(-1.0f);
        } else {
            if (getMinTextSize() > 0) {
                return;
            }
            setMinTextSize(10.0f);
        }
    }

    public final int LJJJJLL(int i) {
        int i2 = this.LLJJJJJIL;
        if (i2 != 0) {
            if (i2 == 1) {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            return i;
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    public final void LJJLI(boolean z) {
        this.LLJZIJLIL = true;
        this.LLL = z;
        LJJJLIIL();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLLI && !isEnabled() && isClickable() && motionEvent != null && motionEvent.getAction() == 1 && motionEvent.getX() <= getWidth() && motionEvent.getY() <= getHeight()) {
            performClick();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (Build.VERSION.SDK_INT >= 24 && (drawable instanceof GradientDrawable) && ((GradientDrawable) drawable).getCornerRadius() < getMinHeight() / 2) {
            LJJJLIIL();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 24 && (drawable instanceof GradientDrawable) && ((GradientDrawable) drawable).getCornerRadius() < getMinHeight() / 2) {
            LJJJLIIL();
        }
    }

    public final void setBackgroundRadius(int i) {
        this.LLJZ = i;
        LJJJLIIL();
    }

    public final void setButtonEndIcon(Integer num) {
        C197036127e c197036127e = this.LLLIIII;
        c197036127e.LJII = c197036127e.LIZIZ(num);
        LJJL();
    }

    public final void setButtonEndIconDrawable(Drawable drawable) {
        this.LLLIIII.LJII = drawable;
        LJJL();
    }

    public final void setButtonSize(int i) {
        boolean z;
        C197040127i c197040127i;
        if (i != 0 && i != 1) {
            z = false;
        } else {
            z = true;
        }
        this.LLLF = z;
        this.LLJJJJJIL = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    } else {
                        c197040127i = new C197040127i(163, Integer.MAX_VALUE, 52, 102, 20, 20);
                    }
                } else {
                    c197040127i = new C197040127i(88, 122, 44, 102, 20, 20);
                }
            } else {
                c197040127i = new C197040127i(88, 120, 32, 42, 16, 16);
            }
        } else {
            c197040127i = new C197040127i(64, 100, 28, 52, 14, 14);
        }
        setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c197040127i.LIZ))));
        int i2 = c197040127i.LIZIZ;
        int iLIZIZ = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        }
        setMaxWidth(iLIZIZ);
        setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c197040127i.LIZJ))));
        setTuxFont(c197040127i.LIZLLL);
        setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c197040127i.LJ))));
        setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c197040127i.LJFF))));
        this.LLJZ = 200;
        LJJJLIIL();
        if (i != 0) {
            if (i == 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                setTuxFont(52);
                setTypeface(C1697580uHE.LIZIZ(0.0f, 540, 17.0f, 0.0f, Float.valueOf(14.0f), 0.0f, 0, linkedHashMap, 105));
                if (true ^ linkedHashMap.isEmpty()) {
                    setCurrentFontVariationSettings$tux_theme_release(linkedHashMap);
                    return;
                }
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        setTuxFont(62);
        setTypeface(C1697580uHE.LIZIZ(0.0f, 540, 17.0f, 0.0f, Float.valueOf(13.0f), 0.0f, 0, linkedHashMap2, 105));
        if (!(true ^ linkedHashMap2.isEmpty())) {
            return;
        }
        setCurrentFontVariationSettings$tux_theme_release(linkedHashMap2);
    }

    public final void setButtonStartIcon(Integer num) {
        C197036127e c197036127e = this.LLLIIII;
        c197036127e.LJI = c197036127e.LIZIZ(num);
        LJJL();
    }

    public final void setButtonStartIconDrawable(Drawable drawable) {
        this.LLLIIII.LJI = drawable;
        LJJL();
    }

    public void setButtonVariant(int i) {
        this.LLJJJJLIIL = i;
        setButtonVariantInner(i);
        Function1<? super C197039127h, Unit> function1 = this.LLLFF;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    public final void setDefaultTintColorRes$tux_theme_release(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            this.LLJLL = Integer.valueOf(iIntValue);
            if (!this.LLJLLIL) {
                this.LLLIIII.LIZLLL = Integer.valueOf(iIntValue);
                LJJL();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.LLJJJJ) {
            setButtonVariant(this.LLJJJJLIIL);
        }
        LJJJZ();
    }

    public void setIconHeight(int i) {
        this.LLLIIII.LIZIZ = i;
        LJJL();
    }

    public void setIconTintColor(int i) {
        this.LLJLLIL = true;
        this.LLLIIII.LIZLLL = Integer.valueOf(i);
        LJJL();
    }

    public void setIconTintColorRes(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            setIconTintColor(numLIZJ.intValue());
        }
    }

    public void setIconWidth(int i) {
        this.LLLIIII.LIZJ = i;
        LJJL();
    }

    public final void setLoading(boolean z) {
        if (z != this.LLLII) {
            this.LLLII = z;
            if (z) {
                LJJL();
                this.LLJJL = getText();
                setText("");
                C1856690yPr c1856690yPr = this.LLJL;
                if (c1856690yPr != null) {
                    c1856690yPr.LJIIIZ();
                }
                LJJJZ();
                return;
            }
            C1856690yPr c1856690yPr2 = this.LLJL;
            if (c1856690yPr2 != null) {
                c1856690yPr2.LJIIJ();
            }
            setText(this.LLJJL);
            LJJJZ();
        }
    }

    public final void setLoadingIconColor(int i) {
        this.LLJLLL = Integer.valueOf(i);
        LJJL();
    }

    public final void setLoadingIconColorRes(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            setLoadingIconColor(numLIZJ.intValue());
        }
    }

    public final void setSupportClickWhenDisable(boolean z) {
        this.LLLI = z;
        LJJJZ();
    }

    public final void LJJJLZIJ(Integer num, Integer num2) {
        C197036127e c197036127e = this.LLLIIII;
        c197036127e.LJI = c197036127e.LIZIZ(num);
        C197036127e c197036127e2 = this.LLLIIII;
        c197036127e2.LJII = c197036127e2.LIZIZ(num2);
        LJJL();
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        boolean z = true;
        if (layoutParams == null || layoutParams.width != -2 || getMinWidth() <= 0) {
            z = false;
        }
        LJJJIL(z);
        super.onMeasure(i, i2);
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.LLLII) {
            if (charSequence != null && charSequence.length() > 0) {
                this.LLJJL = charSequence;
            }
            charSequence = "";
        }
        super.setText(charSequence, bufferType);
        LJJL();
    }

    public C197039127h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJJJJIL = Integer.MIN_VALUE;
        this.LLJJJJLIIL = Integer.MIN_VALUE;
        this.LLJJL = "";
        this.LLLFZ = Integer.MAX_VALUE;
        this.LLJJJJ = true;
        C197036127e c197036127e = new C197036127e(this);
        this.LLLIIII = c197036127e;
        c197036127e.LIZ(attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxButton, i, 0);
        this.LLJJJJJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxButton_tux_buttonSize, -1);
        this.LLJJJJLIIL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxButton_tux_buttonVariant, Integer.MIN_VALUE);
        this.LLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxButton_tux_buttonCapsule, false);
        this.LLJZIJLIL = typedArrayObtainStyledAttributes.hasValue(R$styleable.TuxButton_tux_buttonCapsule);
        LJJJJLI(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxButton_tux_buttonAutoSizing, false));
        this.LLJJLIIIJLLLLLLLZ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxButton__tux_loadingIcon, 0);
        this.LLJLIL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxButton_tux_buttonLoadingState);
        this.LLJLILLLLZIIL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxButton_tux_buttonClickableState);
        typedArrayObtainStyledAttributes.recycle();
        this.LLLFFI = getMinWidth();
        this.LLLFZ = getMaxWidth();
        setPadding(getPaddingLeftValue(), 0, getPaddingRightValue(), 0);
        setGravity(17);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(4.0f))));
        setButtonSize(this.LLJJJJJIL);
        setButtonVariant(this.LLJJJJLIIL);
        float f = c197036127e.LJ;
        if (f > 0.0f) {
            c197036127e.LIZJ = (int) f;
        }
        float f2 = c197036127e.LJFF;
        if (f2 > 0.0f) {
            c197036127e.LIZIZ = (int) f2;
        }
        LJJL();
        int i2 = this.LLLFZ;
        if (i2 < Integer.MAX_VALUE) {
            setMaxWidth(i2);
        }
        int i3 = this.LLLFFI;
        if (i3 > 0) {
            setMinWidth(i3);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C197039127h(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i3 = R.attr.xj;
        } else {
            i3 = 0;
        }
        this(context, attributeSet, i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJJL();
    }
}
