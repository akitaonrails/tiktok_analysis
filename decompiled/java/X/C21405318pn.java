package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21405318pn extends LinearLayout {
    public C0I7D LL;
    public LinearLayout LLILLJJLI;
    public Function0<Boolean> LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public InterfaceC21405418po LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public final int LLJILLL;

    public static /* synthetic */ void getPrimaryIndicatorType$annotations() {
    }

    public static /* synthetic */ void getSecondaryIndicatorType$annotations() {
    }

    private final ImageView getCheckImageView() {
        return (ImageView) this.LLILZIL.getValue();
    }

    private final ImageView getClearButton() {
        return (ImageView) this.LLILZ.getValue();
    }

    private final ImageView getEyeCloseImageView() {
        return (ImageView) this.LLIZ.getValue();
    }

    private final ImageView getEyeOpenImageView() {
        return (ImageView) this.LLILZLL.getValue();
    }

    private final C19713212Aw getLoadingView() {
        return (C19713212Aw) this.LLIZLLLIL.getValue();
    }

    public final int getDefaultIndicatorSize() {
        return ((Number) this.LLJI.getValue()).intValue();
    }

    public final int getDefaultPadding() {
        return ((Number) this.LLJ.getValue()).intValue();
    }

    public final C0I7D getInputWithIndicatorEditTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kq8);
            this.LL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final LinearLayout getInputWithIndicatorViewContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kq9);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.12Aw] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.ImageView] */
    public final void LIZIZ() {
        ?? clearButton;
        C19713212Aw loadingView = getLoadingView();
        if (loadingView != null) {
            loadingView.LIZJ();
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(this.LLJILJILJ), Integer.valueOf(this.LLJILJIL));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (((Number) obj).intValue() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (iIntValue == 1) {
                clearButton = getClearButton();
            } else if (iIntValue == 2) {
                clearButton = getLoadingView();
                clearButton.LIZIZ();
            } else if (iIntValue == 3) {
                clearButton = getCheckImageView();
            } else if (iIntValue == 4) {
                LIZLLL(129);
                clearButton = getEyeCloseImageView();
            } else if (iIntValue != 5) {
                clearButton = new View(getContext());
            } else {
                LIZLLL(144);
                clearButton = getEyeOpenImageView();
            }
            arrayList2.add(clearButton);
        }
        LinearLayout inputWithIndicatorViewContainerFromXml = getInputWithIndicatorViewContainerFromXml();
        int size = this.LLJILLL * arrayList2.size();
        int i = this.LLJILLL;
        if (inputWithIndicatorViewContainerFromXml != null) {
            ViewGroup.LayoutParams layoutParams = inputWithIndicatorViewContainerFromXml.getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = size;
            C786410Ut5.W5(inputWithIndicatorViewContainerFromXml, layoutParams);
        }
        C786410Ut5.LJJJJJL(getInputWithIndicatorViewContainerFromXml());
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            getInputWithIndicatorViewContainerFromXml().addView((View) it3.next());
        }
        invalidate();
    }

    public final EditText getEditText() {
        return getInputWithIndicatorEditTextFromXml();
    }

    public final String getText() {
        String string;
        String string2;
        Editable editableLLLLJI = C2204961BRm.LLLLJI(getInputWithIndicatorEditTextFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkjtr7urAAM9s8m4YhAOwpn4CaunvmGKYnQ==", null));
        return (editableLLLLJI == null || (string = editableLLLLJI.toString()) == null || (string2 = a0.LJLIIIL(string).toString()) == null) ? "" : string2;
    }

    public final ImageView LIZ(int i) {
        ImageView imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getDefaultIndicatorSize(), getDefaultIndicatorSize());
        layoutParams.gravity = 16;
        C786410Ut5.c6(imageView, layoutParams);
        imageView.setImageResource(i);
        return imageView;
    }

    public final void LIZLLL(int i) {
        int selectionStart = getInputWithIndicatorEditTextFromXml().getSelectionStart();
        int selectionEnd = getInputWithIndicatorEditTextFromXml().getSelectionEnd();
        getInputWithIndicatorEditTextFromXml().setInputType(i);
        getInputWithIndicatorEditTextFromXml().setSelection(selectionStart, selectionEnd);
    }

    public final void setAutoHideRules(Function0<Boolean> function0) {
        this.LLILLL = function0;
    }

    public final void setContainerPadding(int i) {
        getInputWithIndicatorViewContainerFromXml().setPadding(i, i, i, i);
    }

    public final void setIndicatorVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZL(i, getInputWithIndicatorViewContainerFromXml());
    }

    public final void setInputWithIndicatorEditTextFromXml(C0I7D c0i7d) {
        this.LL = c0i7d;
    }

    public final void setInputWithIndicatorViewContainerFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setListener(InterfaceC21405418po interfaceC21405418po) {
        this.LLJIJIL = interfaceC21405418po;
    }

    public final void setText(CharSequence charSequence) {
        getInputWithIndicatorEditTextFromXml().setText(charSequence);
        if (charSequence.length() > 0) {
            getInputWithIndicatorEditTextFromXml().setSelection(charSequence.length());
        }
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        getInputWithIndicatorEditTextFromXml().addTextChangedListener(textWatcher);
    }

    public C21405318pn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = new AwS576S0100000_32(this, 568);
        this.LLILZ = C452501pT.LIZIZ(new AwS433S0200000_32(context, this, 28));
        this.LLILZIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 569));
        this.LLILZLL = C452501pT.LIZIZ(new AwS433S0200000_32(context, this, 30));
        this.LLIZ = C452501pT.LIZIZ(new AwS433S0200000_32(context, this, 29));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS420S0200000_19(context, this, 153));
        this.LLJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(343));
        this.LLJI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(342));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.InputWithIndicator);
        this.LLJILJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.InputWithIndicator_indicatorType, 0);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getInt(R$styleable.InputWithIndicator_secondaryIndicatorType, 0);
        this.LLJILLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.InputWithIndicator_indicatorViewSize, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(28.0d))));
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.InputWithIndicator_inputHint);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.InputWithIndicator_android_maxLines, 1);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.InputWithIndicator_android_maxLength, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.InputWithIndicator_android_inputType, 1);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.InputWithIndicator_inputColor, C960203pA.LIZ(R.attr.a1h, context));
        C786410Ut5.LJLLJ(context, R.layout.cti, this);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.InputWithIndicator_inputId, 80);
        if (resourceId != 80) {
            getInputWithIndicatorEditTextFromXml().setId(resourceId);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 > 0) {
            C1722190uuv.LIZ(getInputWithIndicatorEditTextFromXml(), i2);
        }
        getInputWithIndicatorEditTextFromXml().setMaxLines(i);
        getInputWithIndicatorEditTextFromXml().setHint(strXd);
        if (i3 != 129) {
            getInputWithIndicatorEditTextFromXml().setInputType(i3);
        }
        getInputWithIndicatorEditTextFromXml().setTuxFont(42);
        getInputWithIndicatorEditTextFromXml().setTextColor(color);
        getInputWithIndicatorEditTextFromXml().addTextChangedListener(new C21524019Li(this, 5));
        getInputWithIndicatorEditTextFromXml().setOnFocusChangeListener(new ViewOnFocusChangeListenerC21523319Lb(this, 3));
        if (this.LLJILJIL == 1) {
            C786410Ut5.LJZL(8, getInputWithIndicatorViewContainerFromXml());
        }
        LIZIZ();
    }

    public final void LIZJ(int i, int i2) {
        if (i2 == this.LLJILJILJ && i == this.LLJILJIL) {
            return;
        }
        this.LLJILJILJ = i2;
        this.LLJILJIL = i;
        LIZIZ();
    }
}
