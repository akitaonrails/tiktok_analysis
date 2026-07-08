package X;

import Y.ACListenerS77S1100000_1;
import android.content.Context;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C941803mC extends AbstractC941303m7 {
    public TuxIconView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public PaymentMethod LLJLIL;
    public ElementDTO LLJLILLLLZIIL;
    public TextWatcher LLJLL;
    public Function1<? super Boolean, Unit> LLJLLIL;
    public Function1<? super List<PaymentElement>, Unit> LLJLLL;
    public String LLJZ;
    public Function1<? super Boolean, Unit> LLJZIJLIL;

    @Override // X.C1745300vWC
    public int getContentViewLayoutId() {
        return R.layout.aqe;
    }

    @Override // X.C1745300vWC
    public int getFooterViewLayoutId() {
        return R.layout.aqf;
    }

    public final TuxIconView getIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxe);
            this.LLJJL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getPrefixTextViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ro8);
            this.LLJL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTipsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xyz);
            this.LLJJLIIIJLLLLLLLZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.AbstractC941303m7
    public C1748260vay getInputView() {
        return getInputWithIndicatorFromXml();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement> getValue() {
        /*
            r8 = this;
            X.0I7D r2 = r8.getInputWithIndicatorEditTextFromXml()
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35YxxIKud/4cdYdQ6sKp7KDPJzH/cIkIZXx5A"
            r6 = 0
            r1.<init>(r0, r6)
            android.text.Editable r0 = X.C2204961BRm.LLLLJI(r2, r1)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r8.getElementDTO()
            r3 = 0
            if (r0 == 0) goto L87
            java.lang.Integer r2 = r0.styleType
            X.03g1 r0 = X.EnumC903503g1.CPF
            int r1 = r0.ordinal()
            if (r2 == 0) goto L87
            int r0 = r2.intValue()
            if (r0 != r1) goto L87
            r0 = 1
        L2c:
            java.lang.String r5 = ""
            if (r0 == 0) goto L3c
            java.lang.String r0 = "."
            java.lang.String r1 = kotlin.text.u.LJJIFFI(r4, r0, r5, r3)
            java.lang.String r0 = "-"
            java.lang.String r4 = kotlin.text.u.LJJIFFI(r1, r0, r5, r3)
        L3c:
            int r0 = r4.length()
            if (r0 <= 0) goto L5f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r8.getElementDTO()
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration r0 = r0.configuration
            if (r0 == 0) goto L55
            java.lang.String r0 = r0.prefix
            if (r0 == 0) goto L55
            r5 = r0
        L55:
            r1.append(r5)
            r1.append(r4)
            java.lang.String r5 = X.C2188811AlT.LIZIZ(r1)
        L5f:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r2 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r8.getElementDTO()
            if (r0 == 0) goto L85
            java.lang.String r3 = r0.id
        L69:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r8.getElementDTO()
            if (r0 == 0) goto L83
            java.lang.String r4 = r0.paramName
        L71:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r8.getElementDTO()
            if (r0 == 0) goto L79
            java.lang.Boolean r6 = r0.needEncryption
        L79:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            return r0
        L83:
            r4 = r6
            goto L71
        L85:
            r3 = r6
            goto L69
        L87:
            r0 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C941803mC.getValue():java.util.List");
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public ElementDTO getElementDTO() {
        return this.LLJLILLLLZIIL;
    }

    public final Function1<Boolean, Unit> getFocusChange() {
        return this.LLJZIJLIL;
    }

    public final String getInputMethod() {
        return this.LLJZ;
    }

    public final Function1<Boolean, Unit> getOnFocusChange() {
        return this.LLJLLIL;
    }

    @Override // X.AbstractC941303m7
    public Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LLJLLL;
    }

    @Override // X.AbstractC941303m7
    public PaymentMethod getPaymentMethod() {
        return this.LLJLIL;
    }

    public C941803mC(Context context) {
        super(context, null, 0);
        this.LLJLLIL = AFwS228S0000000_1.get$arr$(744);
        this.LLJLLL = AFwS228S0000000_1.get$arr$(746);
        this.LLJZ = "";
        this.LLJZIJLIL = AFwS228S0000000_1.get$arr$(743);
    }

    @Override // X.AbstractC941303m7
    public void setElementDTO(ElementDTO elementDTO) {
        this.LLJLILLLLZIIL = elementDTO;
    }

    public final void setFocusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJZIJLIL = function1;
    }

    public final void setIconFromXml(TuxIconView tuxIconView) {
        this.LLJJL = tuxIconView;
    }

    public final void setInputMethod(String str) {
        this.LLJZ = str;
    }

    public final void setOnFocusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJLLIL = function1;
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLJLLL = function1;
    }

    @Override // X.AbstractC941303m7
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LLJLIL = paymentMethod;
    }

    public final void setPrefixTextViewFromXml(TuxTextView tuxTextView) {
        this.LLJL = tuxTextView;
    }

    public final void setTipsFromXml(TuxTextView tuxTextView) {
        this.LLJJLIIIJLLLLLLLZ = tuxTextView;
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        TextWatcher textWatcher;
        String str;
        String str2;
        String strLJJIII;
        super.LIZ(elementDTO, paymentMethod, list, obj);
        setElementDTO(elementDTO);
        setPaymentMethod(paymentMethod);
        getInputWithIndicatorEditTextFromXml().setTag(elementDTO.styleType);
        getInputWithIndicatorFromXml().setOnEditTextFocusChangeListener(new C04JP(this, 4));
        TextWatcher textWatcher2 = this.LLJLL;
        if (textWatcher2 != null) {
            getInputWithIndicatorEditTextFromXml().removeTextChangedListener(textWatcher2);
        }
        Integer num = elementDTO.styleType;
        int iOrdinal = EnumC903503g1.CPF.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            final C0I7D inputWithIndicatorEditTextFromXml = getInputWithIndicatorEditTextFromXml();
            textWatcher = new C941903mD(inputWithIndicatorEditTextFromXml) { // from class: X.03mE
                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    String str3;
                    this.LLILZIL.getOnValueChange().invoke(this.LLILZIL.getValue());
                    C941803mC c941803mC = this.LLILZIL;
                    if (TextUtils.isEmpty(charSequence)) {
                        str3 = "";
                    } else {
                        str3 = "normal";
                    }
                    c941803mC.setInputMethod(str3);
                }
            };
        } else {
            textWatcher = new C927503jt() { // from class: X.03mF
                @Override // X.C927503jt, android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    String str3;
                    this.LL.getOnValueChange().invoke(this.LL.getValue());
                    C941803mC c941803mC = this.LL;
                    if (TextUtils.isEmpty(charSequence)) {
                        str3 = "";
                    } else {
                        str3 = "normal";
                    }
                    c941803mC.setInputMethod(str3);
                }
            };
        }
        this.LLJLL = textWatcher;
        getInputWithIndicatorEditTextFromXml().addTextChangedListener(this.LLJLL);
        String str3 = null;
        if (list != null) {
            Configuration configuration = elementDTO.configuration;
            if (configuration != null) {
                str2 = configuration.prefix;
            } else {
                str2 = null;
            }
            PaymentElement paymentElement = (PaymentElement) C13LP.LJJJLZIJ(0, list);
            if (paymentElement == null || (strLJJIII = paymentElement.paramValue) == null) {
                strLJJIII = "";
            }
            if (str2 != null && str2.length() != 0) {
                strLJJIII = u.LJJIII(strLJJIII, str2, "", false);
            }
            getInputWithIndicatorFromXml().setText(strLJJIII);
        }
        String str4 = elementDTO.notificationUrl;
        if (!C703302op.LIZ(str4)) {
            str4 = null;
        }
        if (str4 != null) {
            C786410Ut5.LLLLLLZZ(getIconFromXml(), 0);
            C786410Ut5.a9(getIconFromXml(), new ACListenerS77S1100000_1(this, str4, 3));
        } else {
            C786410Ut5.LLLLLLZZ(getIconFromXml(), 8);
        }
        String str5 = elementDTO.description;
        if (str5 != null && str5.length() != 0) {
            C786410Ut5.LLLLZLL(getTipsFromXml(), 0);
            getTipsFromXml().setText(elementDTO.description);
        } else {
            C786410Ut5.LLLLZLL(getTipsFromXml(), 8);
        }
        Configuration configuration2 = elementDTO.configuration;
        if (configuration2 != null && (str = configuration2.prefix) != null && str.length() != 0) {
            C786410Ut5.LLLLZLL(getPrefixTextViewFromXml(), 0);
            TuxTextView prefixTextViewFromXml = getPrefixTextViewFromXml();
            Configuration configuration3 = elementDTO.configuration;
            if (configuration3 != null) {
                str3 = configuration3.prefix;
            }
            prefixTextViewFromXml.setText(str3);
        } else {
            C786410Ut5.LLLLZLL(getPrefixTextViewFromXml(), 8);
        }
        getInputWithIndicatorEditTextFromXml().setImeOptions(6);
    }
}
