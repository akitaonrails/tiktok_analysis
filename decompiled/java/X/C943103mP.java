package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03mP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C943103mP extends C958503ot {
    public C0I7D LLJILJILJ;
    public TextWatcher LLJILLL;
    public Function1<? super Boolean, Unit> LLJJ;
    public Function1<? super List<PaymentElement>, Unit> LLJJI;
    public Function1<? super List<PaymentElement>, Unit> LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public ElementDTO LLJJJ;

    private final TextWatcher getTextWatcher() {
        ElementDTO elementDTO = this.LLJJJ;
        Integer num = elementDTO != null ? elementDTO.styleType : null;
        int iOrdinal = EnumC903503g1.CPF.ordinal();
        if (num == null || num.intValue() != iOrdinal) {
            return new C927503jt() { // from class: X.03mS
                @Override // X.C927503jt, android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    this.LL.getAfterValueChanged().invoke(this.LL.getValue());
                }

                @Override // X.C927503jt, android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    this.LL.getOnValueChange().invoke(this.LL.getValue());
                }
            };
        }
        final C0I7D inputWithIndicatorEditTextFromXml = getInputWithIndicatorEditTextFromXml();
        return new C943203mQ(inputWithIndicatorEditTextFromXml) { // from class: X.03mR
            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.LLILZIL.getOnValueChange().invoke(this.LLILZIL.getValue());
            }
        };
    }

    public final C0I7D getInputWithIndicatorEditTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kq8);
            this.LLJILJILJ = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final EditText getInputView() {
        return getEditText();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    @Override // X.C958503ot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement> getValue() {
        /*
            r8 = this;
            android.widget.EditText r2 = r8.getEditText()
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl7Ib+d7IIde58Xh1Pqa6kfbPVpZa9a69E+bKvt"
            r6 = 0
            r1.<init>(r0, r6)
            android.text.Editable r0 = X.C2204961BRm.LLJILLL(r2, r1)
            java.lang.String r4 = r0.toString()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r8.LLJJJ
            r3 = 0
            if (r0 == 0) goto L74
            java.lang.Integer r2 = r0.styleType
            X.03g1 r0 = X.EnumC903503g1.CPF
            int r1 = r0.ordinal()
            if (r2 == 0) goto L74
            int r0 = r2.intValue()
            if (r0 != r1) goto L74
            r0 = 1
        L2a:
            java.lang.String r5 = ""
            if (r0 == 0) goto L3a
            java.lang.String r0 = "."
            java.lang.String r1 = kotlin.text.u.LJJIFFI(r4, r0, r5, r3)
            java.lang.String r0 = "-"
            java.lang.String r4 = kotlin.text.u.LJJIFFI(r1, r0, r5, r3)
        L3a:
            int r0 = r4.length()
            if (r0 <= 0) goto L5b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r8.LLJJJ
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration r0 = r0.configuration
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.prefix
            if (r0 == 0) goto L51
            r5 = r0
        L51:
            r1.append(r5)
            r1.append(r4)
            java.lang.String r5 = X.C2188811AlT.LIZIZ(r1)
        L5b:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r2 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r8.LLJJJ
            if (r0 == 0) goto L71
            java.lang.String r3 = r0.id
            java.lang.String r4 = r0.paramName
            java.lang.Boolean r6 = r0.needEncryption
        L67:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            return r0
        L71:
            r3 = r6
            r4 = r6
            goto L67
        L74:
            r0 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C943103mP.getValue():java.util.List");
    }

    public final Function1<List<PaymentElement>, Unit> getAfterValueChanged() {
        return this.LLJJIII;
    }

    public final ElementDTO getElementDTO() {
        return this.LLJJJ;
    }

    public final Function1<Boolean, Unit> getOnFocusChange() {
        return this.LLJJ;
    }

    public final Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LLJJI;
    }

    public final String getOptionName() {
        return this.LLJJIJIL;
    }

    public final String getPageName() {
        return this.LLJJIJIIJIL;
    }

    public final String getPrefilledValue() {
        return this.LLJJIJI;
    }

    public C943103mP(Context context) {
        super(context, null, 0);
        this.LLJJ = AFwS228S0000000_1.get$arr$(730);
        this.LLJJI = AFwS228S0000000_1.get$arr$(731);
        this.LLJJIII = AFwS228S0000000_1.get$arr$(729);
        this.LLJJIJIIJIL = "add card";
        this.LLJJIJIL = "ccdc";
    }

    public final void setAfterValueChanged(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLJJIII = function1;
    }

    public final void setElementDTO(ElementDTO elementDTO) {
        this.LLJJJ = elementDTO;
    }

    public final void setInputWithIndicatorEditTextFromXml(C0I7D c0i7d) {
        this.LLJILJILJ = c0i7d;
    }

    public final void setOnFocusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJJ = function1;
    }

    public final void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLJJI = function1;
    }

    public final void setOptionName(String str) {
        this.LLJJIJIL = str;
    }

    public final void setPageName(String str) {
        this.LLJJIJIIJIL = str;
    }

    public final void setPrefilledValue(String str) {
        this.LLJJIJI = str;
    }

    @Override // X.C958503ot
    public final void LIZLLL(ElementDTO elementDTO, List<PaymentElement> list, String str) {
        PaymentElement paymentElement;
        String strLJJIII;
        String str2;
        super.LIZLLL(elementDTO, list, str);
        this.LLJJJ = elementDTO;
        getEditText().setText(this.LLJJIJI);
        getEditText().setOnFocusChangeListener(new C04JP(this, 3));
        TextWatcher textWatcher = this.LLJILLL;
        if (textWatcher != null) {
            getEditText().removeTextChangedListener(textWatcher);
        }
        this.LLJILLL = getTextWatcher();
        getEditText().addTextChangedListener(this.LLJILLL);
        getEditText().setImeOptions(6);
        if (list != null && (paymentElement = (PaymentElement) C13LP.LJJJLL(list)) != null && (strLJJIII = paymentElement.paramValue) != null) {
            Configuration configuration = elementDTO.configuration;
            if (configuration != null && (str2 = configuration.prefix) != null && str2.length() != 0) {
                strLJJIII = u.LJJIII(strLJJIII, str2, "", false);
            }
            getEditText().setText(strLJJIII);
        }
    }
}
