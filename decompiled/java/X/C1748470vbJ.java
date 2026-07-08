package X;

import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748470vbJ extends FrameLayout implements InterfaceC1237420iJ2 {
    public static final int LLJJI;
    public static final int LLJJIII;
    public static final int LLJJIJI;
    public final C0I7D LL;
    public final View LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public final C1748350vb7 LLILZIL;
    public InterfaceC1237370iIx LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public TuxIconView LLJILJILJ;
    public TuxSpinner LLJILLL;
    public final int LLJJ;

    public C1748470vbJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZJ() {
        this.LL.setSingleLine(true);
    }

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    @Override // X.InterfaceC1237410iJ1
    public final void LIZ() throws Throwable {
        InterfaceC1237370iIx interfaceC1237370iIx = this.LLILZLL;
        if (interfaceC1237370iIx != null) {
            interfaceC1237370iIx.LJJII(this.LLIZLLLIL, C2204961BRm.LLLLJI(this.LL, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmTaaJetirVcjsPA+ok=", null)));
        }
    }

    public final void LJIIJJI() throws Throwable {
        if (!this.LLIZ) {
            LJ(null);
            return;
        }
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = new TuxIconView(getContext(), null, 0, 6, null);
            TuxIconView tuxIconView = this.LLJILJILJ;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = this.LLJJ;
                c419910GdJ.LIZLLL = Integer.valueOf(this.LLJ);
                tuxIconView.setTuxIcon(c419910GdJ);
                int i = LLJJI;
                C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(i, i));
                C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(LLJJIII), null, Integer.valueOf(LLJJIJI), null, false, 26);
                C786410Ut5.a9(tuxIconView, new ACListenerS160S0100000_26(this, 7));
            }
        }
        Editable editableLLLLJI = C2204961BRm.LLLLJI(this.LL, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmTaaJetirVcjsPA+ok=", null));
        if (editableLLLLJI == null || editableLLLLJI.length() <= 0) {
            LJ(null);
        } else {
            LJ(this.LLJILJILJ);
        }
    }

    @Override // X.InterfaceC1237420iJ2
    public InterfaceC1237390iIz getContentUpdateDelegate() {
        return this.LLILZIL;
    }

    public final C0I7D getEditText() {
        return this.LL;
    }

    public final void LIZIZ(TextWatcher textWatcher) {
        this.LL.addTextChangedListener(textWatcher);
    }

    public final void LIZLLL(boolean z) {
        this.LL.setEnabled(z);
        if (z) {
            this.LL.setTextColor(this.LLJI);
        } else {
            this.LL.setTextColor(this.LLJ);
        }
    }

    public final void LJ(AppCompatImageView appCompatImageView) {
        C786410Ut5.LJJJJIZL(this.LLILZ);
        if (appCompatImageView != null) {
            this.LLILZ.addView(appCompatImageView);
            C786410Ut5.LJZ(0, this.LLILZ);
        } else {
            C786410Ut5.LJZ(8, this.LLILZ);
        }
    }

    public final void LJFF(boolean z) {
        this.LLIZ = z;
        LJIIJJI();
    }

    public final void LJI(boolean z) {
        if (z) {
            this.LLILLJJLI.setBackgroundColor(this.LLJILJIL);
        } else {
            this.LLILLJJLI.setBackgroundColor(this.LLJIJIL);
        }
    }

    public final void LJII(int i) {
        this.LL.setInputType(i);
    }

    public final void LJIIIIZZ(int i) {
        this.LL.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
    }

    public final void LJIIIZ(int i) {
        this.LL.setMaxLines(i);
    }

    public final void LJIIJ(String str) {
        this.LL.setHint(str);
    }

    public final void LJIIL(TuxTextView tuxTextView) {
        C786410Ut5.LJJJJIZL(this.LLILLL);
        this.LLILLL.addView(tuxTextView);
        C786410Ut5.LJZ(0, this.LLILLL);
    }

    public final void LJIILIIL(String str) {
        this.LL.setText(str);
    }

    public final void LJIILJJIL(boolean z) throws Throwable {
        if (z) {
            if (this.LLJILLL == null) {
                this.LLJILLL = new TuxSpinner(getContext(), null, 6, 0);
                TuxSpinner tuxSpinner = this.LLJILLL;
                if (tuxSpinner != null) {
                    int i = LLJJI;
                    C786410Ut5.X6(tuxSpinner, new FrameLayout.LayoutParams(i, i));
                    C426750GoL.LJIIIZ(tuxSpinner, Integer.valueOf(LLJJIII), null, Integer.valueOf(LLJJIJI), null, false, 26);
                }
            }
            LJ(this.LLJILLL);
            TuxSpinner tuxSpinner2 = this.LLJILLL;
            if (tuxSpinner2 != null) {
                C786410Ut5.LLZILL(tuxSpinner2, 0);
                return;
            }
            return;
        }
        LJIIJJI();
    }

    @Override // X.InterfaceC1237410iJ1
    public void setTuxFieldContentCallback(InterfaceC1237370iIx interfaceC1237370iIx) {
        this.LLILZLL = interfaceC1237370iIx;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1748470vbJ(Context context, AttributeSet attributeSet, int i) throws Throwable {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.z3;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LLIZ = true;
        this.LLIZLLLIL = 20;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h7, this, true);
        C0I7D c0i7d = (C0I7D) findViewById(R.id.grz);
        this.LL = c0i7d;
        View viewFindViewById = findViewById(R.id.uqb);
        this.LLILLJJLI = viewFindViewById;
        this.LLILLL = (FrameLayout) findViewById(R.id.vzr);
        this.LLILZ = (FrameLayout) findViewById(R.id.h5b);
        findViewById(R.id.hwv);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextField, i2, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextField__tux_textFieldTextFont, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextField__tux_textFieldTextColor, 0);
        this.LLJI = color;
        this.LLJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextField__tux_textFieldDisabledColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextField__tux_textFieldSeparatorColor, 0);
        this.LLJIJIL = color2;
        this.LLJILJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextField__tux_textFieldErrorSeparatorColor, 0);
        typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxTextField__tux_textFieldPassIcon, 0);
        typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextField__tux_textFieldPassIconColor, 0);
        this.LLJJ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxTextField__tux_textFieldClearBtnIcon, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextField__tux_textFieldMaxLengthReachedMessage);
        strXd = strXd == null ? "" : strXd;
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextField__tux_textFieldMaxLengthExceededMessage);
        String str = strXd2 != null ? strXd2 : "";
        typedArrayObtainStyledAttributes.recycle();
        this.LLILZIL = new C1748350vb7(strXd, str);
        c0i7d.setTuxFont(i3);
        c0i7d.setTextColor(color);
        viewFindViewById.setBackgroundColor(color2);
        ((InputMethodManager) C786410Ut5.H2(context, "input_method")).showSoftInput(c0i7d, 1);
        c0i7d.addTextChangedListener(new C1775980wJg(this, 1));
        LIZ();
    }
}
