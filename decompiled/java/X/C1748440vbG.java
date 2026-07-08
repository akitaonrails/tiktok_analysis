package X;

import Y.ACListenerS139S0100000_4;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0vbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748440vbG extends LinearLayout {
    public static final /* synthetic */ int LLLIL = 0;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public float LLJJIJIIJIL;
    public Integer LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public final boolean LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public View LLJJL;
    public final View LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public TuxTextView LLJLIL;
    public final C0I7D LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxIconView LLJLLIL;
    public TuxSpinner LLJLLL;
    public TuxIconView LLJZ;
    public TuxIconView LLJZIJLIL;
    public TuxIconView LLL;
    public final View LLLF;
    public View LLLFF;
    public final CharSequence LLLFFI;
    public final CharSequence LLLFZ;
    public final CharSequence LLLI;
    public final CharSequence LLLII;
    public final CharSequence LLLIIII;
    public final CharSequence LLLIIIIL;
    public C823380WRs LLLIIIL;
    public final boolean LLLIIL;
    public final Map<String, TextWatcher> LLLIILIL;

    public C1748440vbG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZJ() throws Throwable {
        Editable editableLLLLJI = C2204961BRm.LLLLJI(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmTaaJewgb1dvOgJIw==", null));
        if (editableLLLLJI != null) {
            editableLLLLJI.clear();
        }
    }

    public final View LIZLLL() {
        View view = new View(getContext());
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), -1));
        return view;
    }

    public final void LJII() {
        this.LLJLILLLLZIIL.clearFocus();
    }

    public final boolean LJIIIZ() {
        return this.LLJLILLLLZIIL.requestFocus();
    }

    public final void LJIIJJI() throws Throwable {
        TuxIconView tuxIconView = this.LLJZ;
        if (tuxIconView == null) {
            return;
        }
        Editable editableLLLLJI = C2204961BRm.LLLLJI(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmTaaJewgb1dvOgJIw==", null));
        C786410Ut5.LLLLLLZZ(tuxIconView, (editableLLLLJI == null || editableLLLLJI.length() <= 0 || this.LLJJJJJIL == 1) ? 8 : 0);
    }

    public final void LJIJ() {
        Drawable drawableLIZ;
        int i = this.LLJJJJJIL;
        if (i == 0 || i == 1 || i == 2) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(this.LL);
            c384050F3z.LIZJ = Float.valueOf(this.LLJJIJIIJIL);
            drawableLIZ = c384050F3z.LIZ(getContext());
        } else if (i != 3) {
            drawableLIZ = null;
        } else {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LJ = Integer.valueOf(this.LLILLJJLI);
            c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            c384050F3z2.LIZJ = Float.valueOf(this.LLJJIJIIJIL);
            drawableLIZ = c384050F3z2.LIZ(getContext());
        }
        setBackground(drawableLIZ);
    }

    public final void LJIJI() {
        View view = this.LLLFF;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(this.LLJJJIL);
        marginLayoutParams.setMarginEnd(0);
        C786410Ut5.W5(view, layoutParams);
    }

    public final void LJIJJ() {
        View view = this.LLJJL;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(this.LLJJJIL);
        C786410Ut5.W5(view, layoutParams);
    }

    public final TextUtils.TruncateAt getEditTextEllipsize() {
        return this.LLJLILLLLZIIL.getEllipsize();
    }

    public final boolean getEditTextEnabled() {
        return this.LLJLILLLLZIIL.isEnabled();
    }

    public final InputFilter[] getEditTextFilters() {
        return this.LLJLILLLLZIIL.getFilters();
    }

    public final Integer getEditTextImportantForAutofill() {
        if (Build.VERSION.SDK_INT >= 26) {
            return Integer.valueOf(this.LLJLILLLLZIIL.getImportantForAutofill());
        }
        return null;
    }

    public final int getEditTextInputType() {
        return this.LLJLILLLLZIIL.getInputType();
    }

    public final boolean getEditTextIsClickable() {
        return this.LLJLILLLLZIIL.isClickable();
    }

    public final Boolean getEditTextIsContextClickable() {
        return Boolean.valueOf(this.LLJLILLLLZIIL.isContextClickable());
    }

    public final boolean getEditTextIsCursorVisible() {
        return this.LLJLILLLLZIIL.isCursorVisible();
    }

    public final boolean getEditTextIsFocusable() {
        return this.LLJLILLLLZIIL.isFocusable();
    }

    public final boolean getEditTextIsFocusableInTouchMode() {
        return this.LLJLILLLLZIIL.isFocusableInTouchMode();
    }

    public final boolean getEditTextIsLongClickable() {
        return this.LLJLILLLLZIIL.isLongClickable();
    }

    public final KeyListener getEditTextKeyListener() {
        return this.LLJLILLLLZIIL.getKeyListener();
    }

    public final int getEditTextLength() {
        return this.LLJLILLLLZIIL.length();
    }

    public final View.OnFocusChangeListener getEditTextOnFocusChangeListener() {
        return this.LLJLILLLLZIIL.getOnFocusChangeListener();
    }

    public final Object getEditTextTag() {
        return this.LLJLILLLLZIIL.getTag();
    }

    public final int getEditTextTextAlignment() {
        return this.LLJLILLLLZIIL.getTextAlignment();
    }

    public final IBinder getEditTextWindowToken() {
        return this.LLJLILLLLZIIL.getWindowToken();
    }

    public final CharSequence getHint() {
        return this.LLJLILLLLZIIL.getHint();
    }

    public final int getImeOptions() {
        return this.LLJLILLLLZIIL.getImeOptions();
    }

    public final int getMaxLines() {
        return this.LLJLILLLLZIIL.getMaxLines();
    }

    public final int getSelectionEnd() {
        return this.LLJLILLLLZIIL.getSelectionEnd();
    }

    public final int getSelectionStart() {
        return this.LLJLILLLLZIIL.getSelectionStart();
    }

    public final Editable getText() {
        if (this.LLLIIL) {
            return new SpannableStringBuilder(this.LLLIIIL != null ? C823380WRs.LIZ(String.valueOf(C2204961BRm.LLLLJI(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmTaaJewgb1dvOgJIw==", null)))) : "");
        }
        return C2204961BRm.LLLLJI(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW74pDEmTaaJewgb1dvOgJIw==", null));
    }

    public final void LIZ(TextWatcher textWatcher) {
        if (this.LLLIIL) {
            this.LLJLILLLLZIIL.addTextChangedListener(new C1775970wJf(this, textWatcher, 5));
        } else {
            this.LLJLILLLLZIIL.addTextChangedListener(textWatcher);
        }
    }

    public final void LIZIZ(View view) {
        int i = 0;
        Iterator it2 = C13LP.LJJJJLI(C1697810uHb.LJIIJJI(this.LLJJL, this.LLJJLIIIJLLLLLLLZ, this.LLJL, this.LLJLIL, this.LLJLILLLLZIIL, this.LLJLL, this.LLJLLIL, this.LLJLLL, this.LLJZ, this.LLJZIJLIL, this.LLL, this.LLLF, this.LLLFF)).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), view)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        addView(view, i);
    }

    public final void LJFF(View view) {
        View view2 = this.LLLFF;
        if (view2 != null) {
            C786410Ut5.LJJLIIIJLLLLLLLZ(this, view2);
        }
        this.LLLFF = view;
        LJIJI();
        if (view != null) {
            LIZIZ(view);
        }
    }

    public final void LJI(View view) {
        View view2 = this.LLJJL;
        if (view2 != null) {
            C786410Ut5.LJJLIIIJLLLLLLLZ(this, view2);
        }
        this.LLJJL = view;
        LJIJJ();
        if (view != null) {
            LIZIZ(view);
        }
    }

    public final void LJIILLIIL(boolean z) {
        if (z) {
            if (this.LLJZ == null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = this.LLIZ;
                c419910GdJ.LIZLLL = Integer.valueOf(this.LLIZLLLIL);
                TuxIconView tuxIconViewLJ = LJ(c419910GdJ, false);
                this.LLJZ = tuxIconViewLJ;
                tuxIconViewLJ.setContentDescription(this.LLLI);
                LIZIZ(tuxIconViewLJ);
                C786410Ut5.a9(tuxIconViewLJ, new ACListenerS139S0100000_4(this, 4));
            }
            LJIIJJI();
            return;
        }
        TuxIconView tuxIconView = this.LLJZ;
        if (tuxIconView != null) {
            C786410Ut5.LJJLIIIJLLLLLLLZ(this, tuxIconView);
        }
        this.LLJZ = null;
    }

    public final void LJIIZILJ(boolean z) {
        TuxIconView tuxIconView = this.LLJZIJLIL;
        if (tuxIconView == null) {
            return;
        }
        this.LLJJJJLIIL = z;
        int selectionStart = this.LLJLILLLLZIIL.getSelectionStart();
        if (z) {
            tuxIconView.setIconRes(this.LLJIJIL);
            tuxIconView.setContentDescription(this.LLLFZ);
            this.LLJLILLLLZIIL.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            tuxIconView.setIconRes(this.LLJILJIL);
            tuxIconView.setContentDescription(this.LLLFFI);
            this.LLJLILLLLZIIL.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        this.LLJLILLLLZIIL.setSelection(selectionStart);
    }

    public final void setEditTextEllipsize(TextUtils.TruncateAt truncateAt) {
        this.LLJLILLLLZIIL.setEllipsize(truncateAt);
    }

    public final void setEditTextEnabled(boolean z) {
        this.LLJLILLLLZIIL.setEnabled(z);
    }

    public final void setEditTextFilters(InputFilter[] inputFilterArr) {
        this.LLJLILLLLZIIL.setFilters(inputFilterArr);
    }

    public final void setEditTextImportantForAutofill(Integer num) {
        if (Build.VERSION.SDK_INT >= 26 && num != null) {
            this.LLJLILLLLZIIL.setImportantForAutofill(num.intValue());
        }
    }

    public final void setEditTextInputType(int i) {
        this.LLJLILLLLZIIL.setInputType(i);
    }

    public final void setEditTextIsClickable(boolean z) {
        this.LLJLILLLLZIIL.setClickable(z);
    }

    public final void setEditTextIsContextClickable(Boolean bool) {
        if (bool != null) {
            this.LLJLILLLLZIIL.setContextClickable(bool.booleanValue());
        }
    }

    public final void setEditTextIsCursorVisible(boolean z) {
        this.LLJLILLLLZIIL.setCursorVisible(z);
    }

    public final void setEditTextIsFocusable(boolean z) {
        this.LLJLILLLLZIIL.setFocusable(z);
    }

    public final void setEditTextIsFocusableInTouchMode(boolean z) {
        this.LLJLILLLLZIIL.setFocusableInTouchMode(z);
    }

    public final void setEditTextIsLongClickable(boolean z) {
        this.LLJLILLLLZIIL.setLongClickable(z);
    }

    public final void setEditTextKeyListener(KeyListener keyListener) {
        this.LLJLILLLLZIIL.setKeyListener(keyListener);
    }

    public final void setEditTextOnClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.d9(this.LLJLILLLLZIIL, onClickListener);
    }

    public final void setEditTextOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.LLJLILLLLZIIL.setOnFocusChangeListener(onFocusChangeListener);
    }

    public final void setEditTextTag(Object obj) {
        this.LLJLILLLLZIIL.setTag(obj);
    }

    public final void setEditTextTextAlignment(int i) {
        this.LLJLILLLLZIIL.setTextAlignment(i);
        this.LLJLILLLLZIIL.getFilters();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        this.LLJLILLLLZIIL.setEnabled(z);
        if (this.LLJJJJ) {
            if (isEnabled()) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(f);
        }
    }

    public final void setHint(CharSequence charSequence) {
        this.LLJLILLLLZIIL.setHint(charSequence);
    }

    public final void setHintTextColor(int i) {
        this.LLJLILLLLZIIL.setHintTextColor(this.LLILLL);
    }

    public final void setImeOptions(int i) {
        this.LLJLILLLLZIIL.setImeOptions(i);
    }

    public final void setMaxLength(int i) {
        InputFilter[] inputFilterArr;
        if (this.LLJLILLLLZIIL.length() < 0) {
            return;
        }
        C0I7D c0i7d = this.LLJLILLLLZIIL;
        if (c0i7d.getFilters().length == 0) {
            inputFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)};
        } else {
            inputFilterArr = (InputFilter[]) C09RB.LJJII(C09RB.LJIJJLI(C09RB.LJIIIZ(C13LQ.LJIIJJI(this.LLJLILLLLZIIL.getFilters()), AFwS268S0000000_26.get$arr$(97)), new InputFilter.LengthFilter(i))).toArray(new InputFilter[0]);
        }
        c0i7d.setFilters(inputFilterArr);
    }

    public final void setMaxLines(int i) {
        this.LLJLILLLLZIIL.setMaxLines(i);
    }

    public final void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.LLJLILLLLZIIL.setOnEditorActionListener(onEditorActionListener);
    }

    public final void setPlaceholderText(CharSequence charSequence) {
        this.LLJLILLLLZIIL.setHint(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPrefixText(CharSequence charSequence) {
        boolean z;
        int i = 0;
        if (charSequence != null && charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        TuxTextView tuxTextView = null;
        Object[] objArr = 0;
        if (z) {
            TuxTextView tuxTextView2 = new TuxTextView(getContext(), objArr == true ? 1 : 0, 6, i);
            tuxTextView2.setText(charSequence);
            tuxTextView2.setTextColor(this.LLILZIL);
            Integer num = this.LLJJIJIL;
            if (num != null) {
                tuxTextView2.setTuxFont(num.intValue());
            }
            tuxTextView = tuxTextView2;
        }
        TuxTextView tuxTextView3 = this.LLJLIL;
        if (tuxTextView3 != null) {
            C786410Ut5.LJJLIIIJLLLLLLLZ(this, tuxTextView3);
        }
        this.LLJLIL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setFocusableInTouchMode(true);
        }
        TuxTextView tuxTextView4 = this.LLJLIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setImportantForAccessibility(1);
        }
        if (tuxTextView != null) {
            LIZIZ(tuxTextView);
        }
    }

    public final void setSelection(int i) {
        this.LLJLILLLLZIIL.setSelection(i);
    }

    public final void setSingleLine(boolean z) {
        this.LLJLILLLLZIIL.setSingleLine(z);
    }

    public final void setSizeVariant(int i) {
        C1748450vbH c1748450vbH;
        int i2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    } else {
                        c1748450vbH = new C1748450vbH(28, 18, 20, 20, 14, 51, 4, 4, 4);
                    }
                } else {
                    c1748450vbH = new C1748450vbH(32, 20, 24, 24, 16, 41, 6, 6, 6);
                }
            } else {
                c1748450vbH = new C1748450vbH(40, 24, 30, 40, 20, 101, 8, 8, 8);
            }
        } else {
            c1748450vbH = new C1748450vbH(48, 24, 30, 40, 20, 101, 10, 12, 8);
        }
        this.LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1748450vbH.LIZ)));
        this.LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1748450vbH.LIZIZ)));
        this.LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1748450vbH.LIZJ)));
        this.LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1748450vbH.LIZLLL)));
        this.LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1748450vbH.LJ)));
        this.LLJJIJIIJIL = C418440Gaw.LIZIZ(Integer.valueOf(c1748450vbH.LJI));
        this.LLJJIJIL = Integer.valueOf(c1748450vbH.LJFF);
        this.LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1748450vbH.LJII)));
        this.LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1748450vbH.LJIIIIZZ)));
        C426750GoL.LJIIL(this, Integer.valueOf(this.LLJJJ), null, Integer.valueOf(this.LLJJJ), null, 26);
        LJIJJ();
        LJIJI();
        for (TuxIconView tuxIconView : C1697810uHb.LJIIJJI(this.LLJL, this.LLJLLIL, this.LLJZ, this.LLJZIJLIL, this.LLL)) {
            if (tuxIconView != null) {
                ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                if (Intrinsics.LJFF(tuxIconView, this.LLJL)) {
                    i2 = this.LLJJ;
                } else {
                    i2 = this.LLJJI;
                }
                layoutParams.width = i2;
                layoutParams.height = this.LLJJIII;
                tuxIconView.setIconWidth(this.LLJJIJI);
                tuxIconView.setIconHeight(this.LLJJIJI);
            }
        }
        TuxSpinner tuxSpinner = this.LLJLLL;
        if (tuxSpinner != null) {
            ViewGroup.LayoutParams layoutParams2 = tuxSpinner.getLayoutParams();
            int i3 = this.LLJJI;
            layoutParams2.width = i3;
            int i4 = this.LLJJIII;
            layoutParams2.height = i4;
            int i5 = this.LLJJIJI;
            int i6 = (i3 - i5) / 2;
            int i7 = (i4 - i5) / 2;
            C426750GoL.LJIIL(tuxSpinner, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i6), Integer.valueOf(i7), 16);
        }
        Integer num = this.LLJJIJIL;
        if (num != null) {
            int iIntValue = num.intValue();
            TuxTextView tuxTextView = this.LLJLIL;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(iIntValue);
            }
            this.LLJLILLLLZIIL.setTuxFont(iIntValue);
            TuxTextView tuxTextView2 = this.LLJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(iIntValue);
            }
        }
        LJIJ();
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSuffixText(CharSequence charSequence) {
        boolean z;
        int i = 0;
        if (charSequence != null && charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        TuxTextView tuxTextView = null;
        Object[] objArr = 0;
        if (z) {
            TuxTextView tuxTextView2 = new TuxTextView(getContext(), objArr == true ? 1 : 0, 6, i);
            tuxTextView2.setText(charSequence);
            tuxTextView2.setTextColor(this.LLILZIL);
            Integer num = this.LLJJIJIL;
            if (num != null) {
                tuxTextView2.setTuxFont(num.intValue());
            }
            tuxTextView = tuxTextView2;
        }
        TuxTextView tuxTextView3 = this.LLJLL;
        if (tuxTextView3 != null) {
            C786410Ut5.LJJLIIIJLLLLLLLZ(this, tuxTextView3);
        }
        this.LLJLL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setFocusableInTouchMode(true);
        }
        TuxTextView tuxTextView4 = this.LLJLL;
        if (tuxTextView4 != null) {
            tuxTextView4.setImportantForAccessibility(1);
        }
        if (tuxTextView != null) {
            LIZIZ(tuxTextView);
        }
    }

    public final void setTextColor(int i) {
        this.LLJLILLLLZIIL.setTextColor(this.LLILZ);
    }

    public final void setTuxFont(int i) {
        this.LLJLILLLLZIIL.setTuxFont(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0vbG, android.view.View] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final void setValidationStatus(int i) {
        this.LLJJJJJIL = i;
        ?? r6 = 0;
        r6 = 0;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        TuxIconView tuxIconView = this.LLJLLIL;
                        if (tuxIconView != null) {
                            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                        }
                        TuxSpinner tuxSpinner = this.LLJLLL;
                        if (tuxSpinner != null) {
                            C786410Ut5.LLZILL(tuxSpinner, 8);
                        }
                        this.LLJLILLLLZIIL.setEnabled(true);
                        r6 = this.LLLIIII;
                    }
                } else {
                    if (this.LLJLLIL == null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = this.LLJ;
                        c419910GdJ.LIZLLL = Integer.valueOf(this.LLJI);
                        TuxIconView tuxIconViewLJ = LJ(c419910GdJ, false);
                        this.LLJLLIL = tuxIconViewLJ;
                        LIZIZ(tuxIconViewLJ);
                    }
                    TuxSpinner tuxSpinner2 = this.LLJLLL;
                    if (tuxSpinner2 != null) {
                        C786410Ut5.LLZILL(tuxSpinner2, 8);
                    }
                    TuxIconView tuxIconView2 = this.LLJLLIL;
                    if (tuxIconView2 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                    }
                    this.LLJLILLLLZIIL.setEnabled(true);
                    r6 = this.LLLIIIIL;
                }
            } else {
                if (this.LLJLLL == null) {
                    TuxSpinner tuxSpinner3 = new TuxSpinner(getContext(), r6, 6, i2);
                    this.LLJLLL = tuxSpinner3;
                    C786410Ut5.X6(tuxSpinner3, new LinearLayout.LayoutParams(this.LLJJI, this.LLJJIII));
                    int i3 = this.LLJJI;
                    int i4 = this.LLJJIJI;
                    int i5 = (i3 - i4) / 2;
                    int i6 = (this.LLJJIII - i4) / 2;
                    C426750GoL.LJIIL(tuxSpinner3, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(i6), 16);
                    LIZIZ(tuxSpinner3);
                }
                TuxSpinner tuxSpinner4 = this.LLJLLL;
                if (tuxSpinner4 != null) {
                    C786410Ut5.LLZILL(tuxSpinner4, 0);
                }
                TuxIconView tuxIconView3 = this.LLJLLIL;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                }
                this.LLJLILLLLZIIL.setEnabled(false);
                r6 = this.LLLII;
            }
        } else {
            TuxIconView tuxIconView4 = this.LLJLLIL;
            if (tuxIconView4 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
            }
            TuxSpinner tuxSpinner5 = this.LLJLLL;
            if (tuxSpinner5 != null) {
                C786410Ut5.LLZILL(tuxSpinner5, 8);
            }
            this.LLJLILLLLZIIL.setEnabled(true);
        }
        q0.LJJIFFI(this.LLJLILLLLZIIL, r6);
        LJIIJJI();
        LJIJ();
    }

    public static void LJIIL(C1748440vbG c1748440vbG, TextWatcher textWatcher) {
        if (c1748440vbG.LLLIIL) {
            TextWatcher textWatcher2 = (TextWatcher) ((LinkedHashMap) c1748440vbG.LLLIILIL).get("");
            if (textWatcher2 != null) {
                c1748440vbG.LLJLILLLLZIIL.removeTextChangedListener(textWatcher2);
                return;
            }
            return;
        }
        if (textWatcher == null) {
            return;
        }
        c1748440vbG.LLJLILLLLZIIL.removeTextChangedListener(textWatcher);
    }

    public static void LJIILJJIL(C1748440vbG c1748440vbG, int i) {
        TuxIconView tuxIconViewLJ;
        if (i != 0) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LIZLLL = Integer.valueOf(c1748440vbG.LLILZLL);
            tuxIconViewLJ = c1748440vbG.LJ(c419910GdJ, true);
        } else {
            tuxIconViewLJ = null;
        }
        TuxIconView tuxIconView = c1748440vbG.LLJL;
        if (tuxIconView != null) {
            C786410Ut5.LJJLIIIJLLLLLLLZ(c1748440vbG, tuxIconView);
        }
        c1748440vbG.LLJL = tuxIconViewLJ;
        if (tuxIconViewLJ != null) {
            tuxIconViewLJ.setContentDescription(null);
            c1748440vbG.LIZIZ(tuxIconViewLJ);
        }
    }

    public static void LJIILL(C1748440vbG c1748440vbG, CharSequence charSequence) {
        c1748440vbG.LLJLILLLLZIIL.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TuxIconView LJ(C419910GdJ c419910GdJ, boolean z) {
        int i;
        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, 0 == true ? 1 : 0);
        int i2 = this.LLJJIJI;
        c419910GdJ.LIZIZ = i2;
        c419910GdJ.LIZJ = i2;
        tuxIconView.setTuxIcon(c419910GdJ);
        if (z) {
            i = this.LLJJ;
        } else {
            i = this.LLJJI;
        }
        C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(i, this.LLJJIII));
        return tuxIconView;
    }

    public final void LJIIIIZZ(InputMethodManager inputMethodManager, int i) {
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.LLJLILLLLZIIL.getWindowToken(), i);
        }
    }

    public final void LJIIJ(InputMethodManager inputMethodManager, int i) {
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.LLJLILLLLZIIL, i);
        }
    }

    public final void LJIILIIL(int i, boolean z) {
        this.LLJLILLLLZIIL.setInputType(i);
        if (i == 128 && z) {
            if (this.LLJZIJLIL == null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = this.LLJIJIL;
                c419910GdJ.LIZLLL = Integer.valueOf(this.LLJILJILJ);
                TuxIconView tuxIconViewLJ = LJ(c419910GdJ, false);
                this.LLJZIJLIL = tuxIconViewLJ;
                C786410Ut5.a9(tuxIconViewLJ, new ACListenerS160S0100000_26(this, 6));
                LIZIZ(tuxIconViewLJ);
                LJIIZILJ(true);
                return;
            }
            return;
        }
        this.LLJLILLLLZIIL.setTransformationMethod(null);
        TuxIconView tuxIconView = this.LLJZIJLIL;
        if (tuxIconView != null) {
            C786410Ut5.LJJLIIIJLLLLLLLZ(this, tuxIconView);
        }
        this.LLJZIJLIL = null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLJILLL;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1748440vbG(Context context, AttributeSet attributeSet, int i) {
        int i2;
        AttributeSet attributeSet2 = null;
        AttributeSet attributeSet3 = (i & 2) != 0 ? null : attributeSet;
        int i3 = 0;
        if ((i & 4) != 0) {
            i2 = R.attr.y3;
        } else {
            i2 = 0;
        }
        super(context, attributeSet3, i2);
        this.LLLIILIL = new LinkedHashMap();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet3, R$styleable.TuxInputBox, i2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxInputBox__tux_inputBoxBackgroundColor, 0);
        this.LL = color;
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxInputBox__tux_inputBoxPlaceholderTextColor, 0);
        this.LLILLL = color2;
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxInputBox__tux_inputBoxTextColor, 0);
        this.LLILZ = color3;
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxInputBox__tux_inputBoxPrefixSuffixTextColor, 0);
        this.LLILZLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxInputBox__tux_inputBoxPrefixSuffixIconColor, 0);
        this.LLIZ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxInputBox__tux_inputBoxClearIcon, 0);
        this.LLJ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxInputBox__tux_inputBoxValidIcon, 0);
        this.LLJIJIL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxInputBox__tux_inputBoxVisibilityToggleIcon, 0);
        this.LLJILJIL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxInputBox__tux_inputBoxVisibilityToggleCloseIcon, 0);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxInputBox__tux_inputBoxClearIconColor, 0);
        this.LLJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxInputBox__tux_inputBoxValidColor, 0);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxInputBox__tux_inputBoxVisibilityToggleColor, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxInputBox__tux_inputBoxInvalidColor, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxInputBox__tux_inputBoxEnableSecurityMode, false);
        this.LLLIIL = z;
        this.LLLFFI = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxInputBox__tux_inputBoxShowPasswordLabel);
        this.LLLFZ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxInputBox__tux_inputBoxHidePasswordLabel);
        this.LLLI = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxInputBox__tux_inputBoxClearTextLabel);
        this.LLLII = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxInputBox__tux_inputBoxValidatingLabel);
        this.LLLIIII = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxInputBox__tux_inputBoxInvalidLabel);
        this.LLLIIIIL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxInputBox__tux_inputBoxValidatedLabel);
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxInputBox_tux_inputBoxSizeVariant, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJJJJ = true;
        setOrientation(0);
        setGravity(16);
        setImportantForAccessibility(2);
        C0I7D c0i7d = new C0I7D(context, attributeSet2, 6, i3);
        this.LLJLILLLLZIIL = c0i7d;
        c0i7d.setTextColor(color3);
        c0i7d.setHintTextColor(color2);
        c0i7d.setTextDirection(5);
        C426750GoL.LJIIL(c0i7d, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, 26);
        c0i7d.addTextChangedListener(new C1775980wJg(this, 0));
        c0i7d.setAccessibilityLiveRegion(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(c0i7d, layoutParams);
        setBackgroundColor(color);
        setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)));
        setSizeVariant(i4);
        View viewLIZLLL = LIZLLL();
        this.LLJJLIIIJLLLLLLLZ = viewLIZLLL;
        LIZIZ(viewLIZLLL);
        View viewLIZLLL2 = LIZLLL();
        this.LLLF = viewLIZLLL2;
        LIZIZ(viewLIZLLL2);
        if (z) {
            this.LLLIIIL = C823380WRs.LIZ;
        }
    }
}
