package X;

import Y.ACListenerS77S1100000_1;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03m6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C941203m6 extends AbstractC941303m7 {
    public TuxIconView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public PaymentMethod LLJL;
    public ElementDTO LLJLIL;
    public C941403m8 LLJLILLLLZIIL;
    public Function1<? super List<PaymentElement>, Unit> LLJLL;
    public String LLJLLIL;
    public C03WH LLJLLL;
    public Function1<? super Boolean, Unit> LLJZ;
    public boolean LLJZIJLIL;

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

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public List<PaymentElement> getValue() {
        ElementDTO elementDTO;
        ElementDTO elementDTO2;
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        List<ElementDTO> list;
        ElementDTO next;
        List<ElementDTO> list2;
        ElementDTO next2;
        Boolean bool2 = null;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(String.valueOf(C2204961BRm.LLLLJI(getInputWithIndicatorEditTextFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35YxxIKud/4cdYdQ6sKpxJjXB6H/8I0IaTg==", null))), new String[]{"/"}, 0, 6);
        String str5 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
        String str6 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
        ElementDTO elementDTO3 = getElementDTO();
        if (elementDTO3 == null || (list2 = elementDTO3.subElementDTOList) == null) {
            elementDTO = null;
        } else {
            Iterator<ElementDTO> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.LJFF(next2.id, "eg_ccdc_global_expiration_month")) {
                    break;
                }
            }
            elementDTO = next2;
        }
        ElementDTO elementDTO4 = getElementDTO();
        if (elementDTO4 == null || (list = elementDTO4.subElementDTOList) == null) {
            elementDTO2 = null;
        } else {
            Iterator<ElementDTO> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (Intrinsics.LJFF(next.id, "eg_ccdc_global_expiration_year")) {
                    break;
                }
            }
            elementDTO2 = next;
        }
        PaymentElement[] paymentElementArr = new PaymentElement[2];
        if (elementDTO != null) {
            str = elementDTO.id;
            str2 = elementDTO.paramName;
            bool = elementDTO.needEncryption;
        } else {
            str = null;
            str2 = null;
            bool = null;
        }
        paymentElementArr[0] = new PaymentElement(str, str2, str5, bool, Boolean.FALSE);
        if (elementDTO2 != null) {
            str3 = elementDTO2.id;
            str4 = elementDTO2.paramName;
            bool2 = elementDTO2.needEncryption;
        } else {
            str3 = null;
            str4 = null;
        }
        paymentElementArr[1] = new PaymentElement(str3, str4, str6, bool2, Boolean.FALSE);
        return C1697810uHb.LJIIJJI(paymentElementArr);
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public ElementDTO getElementDTO() {
        return this.LLJLIL;
    }

    public final Function1<Boolean, Unit> getFocusChange() {
        return this.LLJZ;
    }

    public final String getInputType() {
        return this.LLJLLIL;
    }

    @Override // X.AbstractC941303m7
    public Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LLJLL;
    }

    public final C03WH getPaymentLogger() {
        return this.LLJLLL;
    }

    @Override // X.AbstractC941303m7
    public PaymentMethod getPaymentMethod() {
        return this.LLJL;
    }

    public final boolean getTextHasFocus() {
        return this.LLJZIJLIL;
    }

    public C941203m6(Context context) {
        super(context, null, 0);
        this.LLJLL = AFwS228S0000000_1.get$arr$(755);
        this.LLJLLIL = "";
        this.LLJZ = AFwS228S0000000_1.get$arr$(751);
        getInputWithIndicatorFromXml().setInputType(2);
    }

    @Override // X.AbstractC941303m7
    public void setElementDTO(ElementDTO elementDTO) {
        this.LLJLIL = elementDTO;
    }

    public final void setFocusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJZ = function1;
    }

    public final void setIconFromXml(TuxIconView tuxIconView) {
        this.LLJJL = tuxIconView;
    }

    public final void setInputType(String str) {
        this.LLJLLIL = str;
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLJLL = function1;
    }

    public final void setPaymentLogger(C03WH c03wh) {
        this.LLJLLL = c03wh;
    }

    @Override // X.AbstractC941303m7
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LLJL = paymentMethod;
    }

    public final void setTextHasFocus(boolean z) {
        this.LLJZIJLIL = z;
    }

    public final void setTipsFromXml(TuxTextView tuxTextView) {
        this.LLJJLIIIJLLLLLLLZ = tuxTextView;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.03m8] */
    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        int inputType;
        int iIntValue;
        boolean zLJFF;
        Integer num;
        super.LIZ(elementDTO, paymentMethod, list, obj);
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        String str = elementDTO.notificationUrl;
        Integer num2 = null;
        if (!C703302op.LIZ(str)) {
            str = null;
        }
        if (str != null) {
            C786410Ut5.LLLLLLZZ(getIconFromXml(), 0);
            C786410Ut5.a9(getIconFromXml(), new ACListenerS77S1100000_1(this, str, 6));
        } else {
            C786410Ut5.LLLLLLZZ(getIconFromXml(), 8);
        }
        C1748260vay inputWithIndicatorFromXml = getInputWithIndicatorFromXml();
        Configuration configuration = elementDTO.configuration;
        if (configuration != null) {
            num2 = configuration.inputType;
        }
        int iOrdinal = EnumC941503m9.NUMBER.ordinal();
        if (num2 != null && num2.intValue() == iOrdinal) {
            inputType = getInputWithIndicatorFromXml().getInputType() | 2;
        } else {
            int iOrdinal2 = EnumC941503m9.PHONE.ordinal();
            if (num2 != null && num2.intValue() == iOrdinal2) {
                inputType = getInputWithIndicatorFromXml().getInputType() | 3;
            } else {
                inputType = getInputWithIndicatorFromXml().getInputType();
            }
        }
        inputWithIndicatorFromXml.setInputType(inputType);
        C1748260vay inputWithIndicatorFromXml2 = getInputWithIndicatorFromXml();
        Configuration configuration2 = elementDTO.configuration;
        int i = Integer.MAX_VALUE;
        if (configuration2 != null && (num = configuration2.maxLength) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        inputWithIndicatorFromXml2.setMaxLength(iIntValue);
        Configuration configuration3 = elementDTO.configuration;
        if (configuration3 != null) {
            zLJFF = Intrinsics.LJFF(configuration3.lineBreak, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        C1748260vay inputWithIndicatorFromXml3 = getInputWithIndicatorFromXml();
        if (!zLJFF) {
            i = 1;
        }
        inputWithIndicatorFromXml3.setMaxLines(i);
        if (zLJFF) {
            getInputWithIndicatorFromXml().setInputType(getInputWithIndicatorFromXml().getInputType() | 131072);
        }
        String str2 = elementDTO.description;
        if (str2 != null && str2.length() != 0) {
            C786410Ut5.LLLLZLL(getTipsFromXml(), 0);
            getTipsFromXml().setText(elementDTO.description);
        } else {
            C786410Ut5.LLLLZLL(getTipsFromXml(), 8);
        }
        C941403m8 c941403m8 = this.LLJLILLLLZIIL;
        if (c941403m8 != null) {
            getInputWithIndicatorEditTextFromXml().removeTextChangedListener(c941403m8);
        }
        final C0I7D inputWithIndicatorEditTextFromXml = getInputWithIndicatorEditTextFromXml();
        this.LLJLILLLLZIIL = new C933903kv(inputWithIndicatorEditTextFromXml) { // from class: X.03m8
            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                this.LLILZIL.getOnValueChange().invoke(this.LLILZIL.getValue());
                if (TextUtils.isEmpty(charSequence)) {
                    this.LLILZIL.setInputType("");
                } else {
                    this.LLILZIL.setInputType("normal");
                }
            }
        };
        getInputWithIndicatorEditTextFromXml().addTextChangedListener(this.LLJLILLLLZIIL);
        getInputWithIndicatorFromXml().setOnEditTextFocusChangeListener(new C04JK(this, elementDTO, 1));
        if (list != null) {
            C1748260vay inputWithIndicatorFromXml4 = getInputWithIndicatorFromXml();
            ArrayList arrayList = new ArrayList();
            Iterator<PaymentElement> it2 = list.iterator();
            while (it2.hasNext()) {
                String str3 = it2.next().paramValue;
                if (str3 != null) {
                    arrayList.add(str3);
                }
            }
            inputWithIndicatorFromXml4.setText(C13LP.LJJLIIIJ(arrayList, "/", null, null, 0, null, AFwS228S0000000_1.get$arr$(752), 30));
        }
        getInputWithIndicatorEditTextFromXml().setImeOptions(6);
    }
}
