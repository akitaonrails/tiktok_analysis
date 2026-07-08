package X;

import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.text.a0;
import u4.q0;

/* JADX INFO: renamed from: X.0vay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748260vay extends LinearLayout {
    public C0I7D LL;
    public FrameLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public View LLILZ;
    public boolean LLILZIL;
    public Function0<Boolean> LLILZLL;
    public C370460Efk LLIZ;
    public ImageView LLIZLLLIL;
    public final int LLJ;
    public int LLJI;
    public View.OnClickListener LLJIJIL;
    public View.OnFocusChangeListener LLJILJIL;
    public Function1<? super Boolean, Unit> LLJILJILJ;

    public static /* synthetic */ void getIndicatorType$annotations() {
    }

    private final C370460Efk getClearButton() {
        if (this.LLIZ == null) {
            this.LLIZ = new C370460Efk(getContext(), null, 6);
            C370460Efk c370460Efk = this.LLIZ;
            if (c370460Efk != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 16;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c370460Efk);
                c370460Efk.setLayoutParams(layoutParams);
            }
        }
        return this.LLIZ;
    }

    private final ImageView getImageView() {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new ImageView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            C786410Ut5.c6(this.LLIZLLLIL, layoutParams);
        }
        return this.LLIZLLLIL;
    }

    public final View getInputBottomSpaceFromXml() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.kp_);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final FrameLayout getInputWithIndicatorClickContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kq7);
            this.LLILLJJLI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C0I7D getInputWithIndicatorEditTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kq8);
            this.LL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final FrameLayout getInputWithIndicatorViewContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kq9);
            this.LLILLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final EditText getEditText() {
        return getInputWithIndicatorEditTextFromXml();
    }

    public final int getInputType() {
        return getInputWithIndicatorEditTextFromXml().getInputType();
    }

    public final String getText() throws Throwable {
        String string;
        String string2;
        Editable editableLLLLJI = C2204961BRm.LLLLJI(getInputWithIndicatorEditTextFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsD7eYi4WNqi6I6dDLMeXd+lTqJrgEJKW5hA==", null));
        return (editableLLLLJI == null || (string = editableLLLLJI.toString()) == null || (string2 = a0.LJLIIIL(string).toString()) == null) ? "" : string2;
    }

    public final boolean getEnableAutoHide() {
        return this.LLILZIL;
    }

    public final int getIndicatorType() {
        return this.LLJ;
    }

    public final View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.LLJILJIL;
    }

    public final Function1<Boolean, Unit> getOnIndicatorVisibleChangeListener() {
        return this.LLJILJILJ;
    }

    public final void setAutoHideRules(Function0<Boolean> function0) {
        this.LLILZLL = function0;
    }

    public final void setContainerPadding(int i) {
        getInputWithIndicatorViewContainerFromXml().setPadding(i, i, i, i);
    }

    public final void setEnableAutoHide(boolean z) {
        this.LLILZIL = z;
    }

    public final void setHint(String str) {
        getInputWithIndicatorEditTextFromXml().setHint(str);
    }

    public final void setIndicatorClickListener(View.OnClickListener onClickListener) {
        this.LLJIJIL = onClickListener;
    }

    public final void setIndicatorSize(int i) {
        this.LLJI = i;
    }

    public final void setIndicatorVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZ(i, getInputWithIndicatorClickContainerFromXml());
        C786410Ut5.LJZ(i, getInputWithIndicatorViewContainerFromXml());
        this.LLJILJILJ.invoke(Boolean.valueOf(z));
        if (z) {
            int i2 = C20094413jq.LJIIZILJ;
            FrameLayout inputWithIndicatorClickContainerFromXml = getInputWithIndicatorClickContainerFromXml();
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
            c1397760mTe.LIZJ = null;
            c1397760mTe.LIZ = getContext().getString(2131823235);
            c1397760mTe.LJ = new ACListenerS160S0100000_26(this, 27);
            c1397760mTe.LJI = AFwS215S0000000_26.get$arr$(74);
            q0.LJIJ(inputWithIndicatorClickContainerFromXml, c1397760mTe.LIZ());
        }
    }

    public final void setInputBottomSpaceFromXml(View view) {
        this.LLILZ = view;
    }

    public final void setInputTextEncrypted(boolean z) {
        if (z) {
            getInputWithIndicatorEditTextFromXml().setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            getInputWithIndicatorEditTextFromXml().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
    }

    public final void setInputType(int i) {
        getInputWithIndicatorEditTextFromXml().setInputType(i);
    }

    public final void setInputWithIndicatorClickContainerFromXml(FrameLayout frameLayout) {
        this.LLILLJJLI = frameLayout;
    }

    public final void setInputWithIndicatorEditTextFromXml(C0I7D c0i7d) {
        this.LL = c0i7d;
    }

    public final void setInputWithIndicatorViewContainerFromXml(FrameLayout frameLayout) {
        this.LLILLL = frameLayout;
    }

    public final void setMaxLength(int i) {
        C0I7D inputWithIndicatorEditTextFromXml;
        InputFilter[] inputFilterArr;
        if (i > 0 && (inputWithIndicatorEditTextFromXml = getInputWithIndicatorEditTextFromXml()) != null) {
            if (inputWithIndicatorEditTextFromXml.getFilters().length == 0) {
                inputFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)};
            } else {
                inputFilterArr = (InputFilter[]) C09RB.LJJII(C09RB.LJIJJLI(C09RB.LJIIIZ(C13LQ.LJIIJJI(inputWithIndicatorEditTextFromXml.getFilters()), AFwS268S0000000_26.get$arr$(534)), new InputFilter.LengthFilter(i))).toArray(new InputFilter[0]);
            }
            inputWithIndicatorEditTextFromXml.setFilters(inputFilterArr);
        }
    }

    public final void setMaxLines(int i) {
        getInputWithIndicatorEditTextFromXml().setMaxLines(i);
    }

    public final void setOnEditTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.LLJILJIL = onFocusChangeListener;
    }

    public final void setOnIndicatorVisibleChangeListener(Function1<? super Boolean, Unit> function1) {
        this.LLJILJILJ = function1;
    }

    public final void setText(CharSequence charSequence) {
        getInputWithIndicatorEditTextFromXml().setText(charSequence);
        if (charSequence.length() > 0) {
            getInputWithIndicatorEditTextFromXml().setSelection(String.valueOf(C2204961BRm.LLLLJI(getInputWithIndicatorEditTextFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsD7eYi4WNqi6I6dDLMeXd+lTqJrgEJKW5hA==", null))).length());
        }
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        getInputWithIndicatorEditTextFromXml().addTextChangedListener(textWatcher);
    }

    public C1748260vay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = true;
        this.LLILZLL = new AwS570S0100000_26(this, 18);
        this.LLJILJILJ = AFwS231S0000000_3.get$arr$(25);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.commerce_InputWithIndicator);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.commerce_InputWithIndicator_commerce_indicatorType, 0);
        this.LLJ = i;
        this.LLJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.commerce_InputWithIndicator_commerce_indicatorViewSize, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.commerce_InputWithIndicator_commerce_inputHint);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.commerce_InputWithIndicator_android_maxLines, Integer.MAX_VALUE);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.commerce_InputWithIndicator_android_maxLength, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.commerce_InputWithIndicator_android_inputType, 1);
        float f = typedArrayObtainStyledAttributes.getInt(R$styleable.commerce_InputWithIndicator_commerce_inputTextSize, 15);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.commerce_InputWithIndicator_commerce_inputColor, C960203pA.LIZ(R.attr.a1h, context));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.commerce_InputWithIndicator_commerce_editTextPaddingVertical, 0);
        C786410Ut5.LJLLJ(context, R.layout.anb, this);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.commerce_InputWithIndicator_commerce_inputId, 80);
        if (resourceId != 80) {
            getInputWithIndicatorEditTextFromXml().setId(resourceId);
        }
        typedArrayObtainStyledAttributes.recycle();
        setMaxLength(i3);
        setMaxLines(i2);
        if (C426750GoL.LIZLLL(getContext())) {
            getInputWithIndicatorEditTextFromXml().setLayoutDirection(0);
            getInputWithIndicatorEditTextFromXml().setTextAlignment(6);
        }
        C426750GoL.LJIIL(getInputWithIndicatorEditTextFromXml(), null, Integer.valueOf(dimensionPixelSize), null, Integer.valueOf(dimensionPixelSize), 21);
        getInputWithIndicatorEditTextFromXml().setHint(strXd);
        getInputWithIndicatorEditTextFromXml().setTextSize(f);
        getInputWithIndicatorEditTextFromXml().setInputType(i4);
        getInputWithIndicatorEditTextFromXml().setTextColor(color);
        getInputWithIndicatorEditTextFromXml().addTextChangedListener(new C927503jt() { // from class: X.0vaz
            @Override // X.C927503jt, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (this.LL.getEnableAutoHide()) {
                    C1748260vay c1748260vay = this.LL;
                    c1748260vay.setIndicatorVisible(c1748260vay.LLILZLL.invoke().booleanValue());
                }
            }
        });
        getInputWithIndicatorEditTextFromXml().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0vb0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                if (i5 == 6 && textView != null) {
                    textView.clearFocus();
                    return false;
                }
                return false;
            }
        });
        getInputWithIndicatorEditTextFromXml().setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 1));
        C786410Ut5.I7(new AjS70S0100000_26(this, 1), getInputWithIndicatorClickContainerFromXml());
        if (i == 1 && this.LLILZIL) {
            C786410Ut5.LJZ(8, getInputWithIndicatorViewContainerFromXml());
        }
        if (this.LLJI <= 0) {
            this.LLJI = C0H9I.LIZ(16.0d);
        }
        FrameLayout inputWithIndicatorViewContainerFromXml = getInputWithIndicatorViewContainerFromXml();
        int i5 = this.LLJI;
        C1744700vVE.LJII(inputWithIndicatorViewContainerFromXml, i5, i5);
        if (i == 1) {
            C370460Efk clearButton = getClearButton();
            C786410Ut5.LJJJJIZL(getInputWithIndicatorViewContainerFromXml());
            getInputWithIndicatorViewContainerFromXml().addView(clearButton);
        }
    }
}
