package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237360iIw extends LinearLayout implements InterfaceC1237420iJ2 {
    public final LinearLayout LL;
    public final C0I7D LLILLJJLI;
    public final FrameLayout LLILLL;
    public final C1748350vb7 LLILZ;
    public InterfaceC1237370iIx LLILZIL;
    public boolean LLILZLL;
    public final GradientDrawable LLIZ;
    public final GradientDrawable LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public GradientDrawable LLJJIJI;
    public CharSequence LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public Function1<? super Editable, Unit> LLJJJIL;

    public C1237360iIw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getBackgroundColor() {
        return LIZJ(0.7f, this.LLJIJIL);
    }

    private final int getMessageColor() {
        return LIZJ(0.4f, this.LLJILJILJ);
    }

    private final int getPlaceholderColor() {
        return LIZJ(0.4f, this.LLJILJIL);
    }

    private final int getTrailingAreaSpace() {
        int i = this.LLJJI;
        if (i == 0) {
            return 0;
        }
        return i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    @Override // X.InterfaceC1237410iJ1
    public final void LIZ() {
        InterfaceC1237370iIx interfaceC1237370iIx = this.LLILZIL;
        if (interfaceC1237370iIx != null) {
            interfaceC1237370iIx.LJJII(this.LLJJIJIL, C2204961BRm.LLLLJI(this.LLILLJJLI, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT6eJeNrr9NqYQkgx2K1Bd7gGgUUDeYOA==", null)));
        }
    }

    public final void LIZIZ() {
        int iLIZIZ = (this.LLJILLL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) - getTrailingAreaSpace();
        int iLIZIZ2 = (this.LLJJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) - getTrailingAreaSpace();
        if (this.LLILZLL) {
            this.LLILLJJLI.setHeight(iLIZIZ2);
        } else {
            this.LLILLJJLI.setMaxHeight(iLIZIZ2);
            this.LLILLJJLI.setMinHeight(iLIZIZ);
        }
        requestLayout();
    }

    public final GradientDrawable getCurrentContainerBackground() {
        GradientDrawable gradientDrawable = this.LLJJIJI;
        return gradientDrawable == null ? this.LLIZ : gradientDrawable;
    }

    public final CharSequence getMessage() {
        return C2204961BRm.LLLLJI(this.LLILLJJLI, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmT6eJeNrr9NqYQkgx2K1Bd7gGgUUDeYOA==", null));
    }

    public final boolean getApproveExceed() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1237420iJ2
    public InterfaceC1237390iIz getContentUpdateDelegate() {
        return this.LLILZ;
    }

    public final GradientDrawable getCustomContainer() {
        return this.LLJJIJI;
    }

    public final boolean getHasScrollBar() {
        return this.LLJJIII;
    }

    public final int getMessageMaxLength() {
        return this.LLJJIJIL;
    }

    public final CharSequence getPlaceholder() {
        return this.LLJJIJIIJIL;
    }

    public final Function1<Editable, Unit> getTextChangedCallback() {
        return this.LLJJJIL;
    }

    public final void setApproveExceed(boolean z) {
        InputFilter[] inputFilterArr;
        this.LLJJJ = z;
        C0I7D c0i7d = this.LLILLJJLI;
        if (z) {
            inputFilterArr = new InputFilter[0];
        } else {
            inputFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.LLJJIJIL)};
        }
        c0i7d.setFilters(inputFilterArr);
    }

    public final void setCustomContainer(GradientDrawable gradientDrawable) {
        this.LLJJIJI = gradientDrawable;
        LinearLayout linearLayout = this.LL;
        if (gradientDrawable == null) {
            gradientDrawable = this.LLIZ;
        }
        linearLayout.setBackground(gradientDrawable);
    }

    public final void setHasScrollBar(boolean z) {
        this.LLJJIII = z;
        C0I7D c0i7d = this.LLILLJJLI;
        c0i7d.setVerticalScrollBarEnabled(z);
        c0i7d.setMovementMethod(new ScrollingMovementMethod());
    }

    public final void setMessage(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        C0I7D c0i7d = this.LLILLJJLI;
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        c0i7d.setText(spannableStringBuilder);
        this.LLILLJJLI.setScrollY(0);
    }

    public final void setMessageMaxLength(int i) {
        InputFilter[] inputFilterArr;
        this.LLJJIJIL = i;
        LIZ();
        C0I7D c0i7d = this.LLILLJJLI;
        if (this.LLJJJ) {
            inputFilterArr = new InputFilter[0];
        } else {
            inputFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.LLJJIJIL)};
        }
        c0i7d.setFilters(inputFilterArr);
    }

    public final void setPlaceholder(CharSequence charSequence) {
        this.LLJJIJIIJIL = charSequence;
        this.LLILLJJLI.setHint(charSequence);
    }

    public final void setTextAreaEnabled(boolean z) {
        GradientDrawable gradientDrawable;
        int i;
        this.LLILLJJLI.setEnabled(z);
        this.LLILLJJLI.setTextColor(getMessageColor());
        LinearLayout linearLayout = this.LL;
        GradientDrawable gradientDrawable2 = this.LLJJIJI;
        if (gradientDrawable2 != null) {
            if (z) {
                i = 255;
            } else {
                i = 178;
            }
            gradientDrawable2.setAlpha(i);
            gradientDrawable = this.LLJJIJI;
        } else {
            this.LLIZ.setColor(getBackgroundColor());
            gradientDrawable = this.LLIZ;
        }
        linearLayout.setBackground(gradientDrawable);
        this.LLILLJJLI.setTextColor(getMessageColor());
    }

    public final void setTextChangedCallback(Function1<? super Editable, Unit> function1) {
        this.LLJJJIL = function1;
    }

    public final void setTrailingText(CharSequence charSequence) {
        boolean z;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        View view = null;
        if (!z) {
            TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
            tuxTextView.setText(charSequence);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
            C786410Ut5.R6(tuxTextView, layoutParams);
            tuxTextView.setTuxFont(this.LLJ);
            tuxTextView.setTextColor(this.LLJI);
            view = tuxTextView;
        }
        setTrailingView(view);
    }

    public final void setTrailingView(View view) {
        C786410Ut5.LJJJJIZL(this.LLILLL);
        if (view == null) {
            this.LLJJI = 0;
            C786410Ut5.LJZ(8, this.LLILLL);
        } else {
            this.LLILLL.addView(view);
            C786410Ut5.LJZ(0, this.LLILLL);
            view.measure(0, 0);
            this.LLJJI = view.getMeasuredHeight();
        }
        LIZIZ();
    }

    @Override // X.InterfaceC1237410iJ1
    public void setTuxFieldContentCallback(InterfaceC1237370iIx interfaceC1237370iIx) {
        this.LLILZIL = interfaceC1237370iIx;
    }

    public final int LIZJ(float f, int i) {
        if (!this.LLILLJJLI.isEnabled()) {
            return C2441009hQ.LJIIL(i, C814420VxA.LIZIZ(((i >> 24) & 255) * f));
        }
        return i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1237360iIw(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.z1;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
        this.LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
        this.LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = Integer.MAX_VALUE;
        LinearLayout.inflate(context, R.layout.h6, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextAreaBox, i2, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextAreaBox__tux_textAreaMessageFont, 0);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextAreaBox__tux_textAreaMessageColor, 0);
        this.LLJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextAreaBox__tux_textAreaTrailingFont, 0);
        this.LLJILJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextAreaBox__tux_textAreaPlaceholderColor, 0);
        this.LLJIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextAreaBox__tux_textAreaBackgroundColor, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextAreaBox__tux_textAreaErrorColor, 0);
        this.LLJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextAreaBox__tux_textAreaTrailingColor, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextAreaBox__tux_textAreaFieldMaxLengthReachedMessage);
        strXd = strXd == null ? "" : strXd;
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextAreaBox__tux_textAreaFieldMaxLengthExceededMessage);
        String str = strXd2 != null ? strXd2 : "";
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.b8i);
        this.LL = linearLayout;
        C0I7D c0i7d = (C0I7D) findViewById(R.id.xl8);
        this.LLILLJJLI = c0i7d;
        this.LLILLL = (FrameLayout) findViewById(R.id.b8j);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(getBackgroundColor());
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
        this.LLIZ = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(8));
        gradientDrawable2.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), color);
        this.LLIZLLLIL = gradientDrawable2;
        linearLayout.setBackground(gradientDrawable);
        this.LLILZ = new C1748350vb7(strXd, str);
        c0i7d.setTuxFont(i3);
        c0i7d.setTextColor(getMessageColor());
        c0i7d.setHintTextColor(getPlaceholderColor());
        c0i7d.addTextChangedListener(new C1266020j3A(this, 1));
        LIZIZ();
    }
}
