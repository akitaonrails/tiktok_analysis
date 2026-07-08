package X;

import Y.ACListenerS77S1100000_1;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03mH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C942303mH extends AbstractC941303m7 {
    public C1748260vay LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public PaymentMethod LLJLIL;
    public ElementDTO LLJLILLLLZIIL;
    public C942203mG LLJLL;
    public Function1<? super List<PaymentElement>, Unit> LLJLLIL;
    public C1745850vX5 LLJLLL;
    public final int LLJZ;

    @Override // X.C1745300vWC
    public View getContentView() {
        C1745850vX5 c1745850vX5 = new C1745850vX5(getContext(), null, 6);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1745850vX5);
        c1745850vX5.setLayoutParams(layoutParams);
        C426750GoL.LJIIL(c1745850vX5.getInputWithIndicator().getEditText(), null, Integer.valueOf(this.LLJZ), null, Integer.valueOf(this.LLJZ), 21);
        this.LLJLLL = c1745850vX5;
        return c1745850vX5;
    }

    public final C1748260vay getCountryCodePhoneInputFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f1o);
            this.LLJJL = (C1748260vay) callbackFindViewById;
        }
        return (C1748260vay) callbackFindViewById;
    }

    public final View getDelimiterFromXml() {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.flf);
        this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxIconView getIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxe);
            this.LLJL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public List<PaymentElement> getValue() {
        String str;
        String str2;
        String str3;
        List<ElementDTO> list;
        List<ElementDTO> list2;
        C1745850vX5 c1745850vX5 = this.LLJLLL;
        C942903mN phoneModel = c1745850vX5 != null ? c1745850vX5.getPhoneModel() : null;
        ElementDTO elementDTO = getElementDTO();
        ElementDTO elementDTO2 = (elementDTO == null || (list2 = elementDTO.subElementDTOList) == null) ? null : (ElementDTO) C13LP.LJJJLZIJ(0, list2);
        ElementDTO elementDTO3 = getElementDTO();
        ElementDTO elementDTO4 = (elementDTO3 == null || (list = elementDTO3.subElementDTOList) == null) ? null : (ElementDTO) C13LP.LJJJLZIJ(1, list);
        PaymentElement[] paymentElementArr = new PaymentElement[3];
        String str4 = null;
        paymentElementArr[0] = new PaymentElement(null, null, phoneModel != null ? phoneModel.LIZ : null, null, Boolean.FALSE);
        if (elementDTO4 != null) {
            str = elementDTO4.id;
            str2 = elementDTO4.paramName;
        } else {
            str = null;
            str2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('+');
        sbLIZ.append(phoneModel != null ? phoneModel.LIZIZ : null);
        paymentElementArr[1] = new PaymentElement(str, str2, C2188811AlT.LIZIZ(sbLIZ), elementDTO4 != null ? elementDTO4.needEncryption : null, Boolean.FALSE);
        if (elementDTO2 != null) {
            str3 = elementDTO2.id;
            str4 = elementDTO2.paramName;
        } else {
            str3 = null;
        }
        String str5 = phoneModel != null ? phoneModel.LIZJ : null;
        if (!C703302op.LIZ(str5)) {
            str5 = null;
        }
        paymentElementArr[2] = new PaymentElement(str3, str4, str5, elementDTO2 != null ? elementDTO2.needEncryption : null, Boolean.FALSE);
        return C1697810uHb.LJIIJJI(paymentElementArr);
    }

    @Override // X.AbstractC941303m7
    public C1748260vay getInputView() {
        return getCountryCodePhoneInputFromXml();
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public ElementDTO getElementDTO() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.AbstractC941303m7
    public Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LLJLLIL;
    }

    @Override // X.AbstractC941303m7
    public PaymentMethod getPaymentMethod() {
        return this.LLJLIL;
    }

    public C942303mH(Context context) {
        super(context, null, 0);
        this.LLJLLIL = AFwS228S0000000_1.get$arr$(749);
        this.LLJZ = (int) C12ES.LIZJ(15.0f, context);
        getCountryCodePhoneInputFromXml().setInputType(3);
    }

    public final void setCountryCodePhoneInputFromXml(C1748260vay c1748260vay) {
        this.LLJJL = c1748260vay;
    }

    public final void setDelimiterFromXml(View view) {
        this.LLJJLIIIJLLLLLLLZ = view;
    }

    @Override // X.AbstractC941303m7
    public void setElementDTO(ElementDTO elementDTO) {
        this.LLJLILLLLZIIL = elementDTO;
    }

    public final void setIconFromXml(TuxIconView tuxIconView) {
        this.LLJL = tuxIconView;
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLJLLIL = function1;
    }

    @Override // X.AbstractC941303m7
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LLJLIL = paymentMethod;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.03mG] */
    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        String str;
        String str2;
        C1745850vX5 c1745850vX5;
        super.LIZ(elementDTO, paymentMethod, list, obj);
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        String str3 = elementDTO.notificationUrl;
        String str4 = null;
        if (!C703302op.LIZ(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            C786410Ut5.LJLLLLLL(0, getDelimiterFromXml());
            C786410Ut5.LLLLLLZZ(getIconFromXml(), 0);
            C786410Ut5.a9(getIconFromXml(), new ACListenerS77S1100000_1(this, str3, 4));
        } else {
            C786410Ut5.LJLLLLLL(8, getDelimiterFromXml());
            C786410Ut5.LLLLLLZZ(getIconFromXml(), 8);
        }
        getCountryCodePhoneInputFromXml().setMaxLines(1);
        C942203mG c942203mG = this.LLJLL;
        if (c942203mG != null) {
            getInputWithIndicatorEditTextFromXml().removeTextChangedListener(c942203mG);
        }
        this.LLJLL = new C927503jt() { // from class: X.03mG
            @Override // X.C927503jt, android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.LL.getOnValueChange().invoke(this.LL.getValue());
            }
        };
        getInputWithIndicatorEditTextFromXml().addTextChangedListener(this.LLJLL);
        getCountryCodePhoneInputFromXml().setOnEditTextFocusChangeListener(new C04JP(this, 6));
        if (list != null) {
            if (list.size() < 3) {
                C1745850vX5 c1745850vX52 = this.LLJLLL;
                if (c1745850vX52 != null) {
                    C2280611EOl c2280611EOlLIZ = C14L2.LIZ();
                    c1745850vX52.LIZIZ(c2280611EOlLIZ.LIZIZ, c2280611EOlLIZ.LIZ);
                }
                C1745850vX5 c1745850vX53 = this.LLJLLL;
                if (c1745850vX53 != null) {
                    c1745850vX53.setPhoneNumber("");
                }
            } else {
                PaymentElement paymentElement = (PaymentElement) C13LP.LJJJLZIJ(0, list);
                if (paymentElement != null) {
                    str = paymentElement.paramValue;
                } else {
                    str = null;
                }
                PaymentElement paymentElement2 = (PaymentElement) C13LP.LJJJLZIJ(1, list);
                if (paymentElement2 != null) {
                    str2 = paymentElement2.paramValue;
                } else {
                    str2 = null;
                }
                PaymentElement paymentElement3 = (PaymentElement) C13LP.LJJJLZIJ(2, list);
                if (paymentElement3 != null) {
                    str4 = paymentElement3.paramValue;
                }
                if (str != null && str2 != null && str4 != null && (c1745850vX5 = this.LLJLLL) != null) {
                    c1745850vX5.setPhoneModel(new C942903mN(str, u.LJJIFFI(str2, "+", "", false), str4));
                }
            }
        }
        getInputWithIndicatorEditTextFromXml().setImeOptions(6);
    }
}
