package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.ECCCDCOptimizeConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.03mK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C942603mK extends C958503ot {
    public ElementDTO LLJILJILJ;
    public TextWatcher LLJILLL;
    public Function1<? super List<PaymentElement>, Unit> LLJJ;
    public Function1<? super List<PaymentElement>, Unit> LLJJI;
    public Function1<? super Boolean, Unit> LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;

    public final EditText getInputView() {
        return getEditText();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    @Override // X.C958503ot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement> getValue() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C942603mK.getValue():java.util.List");
    }

    public final Function1<List<PaymentElement>, Unit> getAfterValueChanged() {
        return this.LLJJI;
    }

    public final ElementDTO getElementDTO() {
        return this.LLJILJILJ;
    }

    public final Function1<Boolean, Unit> getFocusChange() {
        return this.LLJJIII;
    }

    public final Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LLJJ;
    }

    public final boolean getTextHasFocus() {
        return this.LLJJIJI;
    }

    public C942603mK(Context context) {
        super(context, null, 0);
        this.LLJJ = AFwS228S0000000_1.get$arr$(727);
        this.LLJJI = AFwS228S0000000_1.get$arr$(725);
        this.LLJJIII = AFwS228S0000000_1.get$arr$(726);
        getEditText().setInputType(2);
    }

    public final void setATM(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setAfterValueChanged(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLJJI = function1;
    }

    public final void setBancontact(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setElementDTO(ElementDTO elementDTO) {
        this.LLJILJILJ = elementDTO;
    }

    public final void setFocusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJJIII = function1;
    }

    public final void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLJJ = function1;
    }

    public final void setTextHasFocus(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // X.C958503ot
    public final void LIZLLL(ElementDTO elementDTO, List<PaymentElement> list, String str) {
        TextWatcher textWatcher;
        Integer num;
        int inputType;
        super.LIZLLL(elementDTO, list, str);
        this.LLJILJILJ = elementDTO;
        TextWatcher textWatcher2 = this.LLJILLL;
        if (textWatcher2 != null) {
            getEditText().removeTextChangedListener(textWatcher2);
        }
        final EditText editText = getEditText();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECCCDCOptimizeConfig eCCCDCOptimizeConfig = C943003mO.LIZ;
        ECCCDCOptimizeConfig eCCCDCOptimizeConfig2 = (ECCCDCOptimizeConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_ecom_ccdc_optimize_config", ECCCDCOptimizeConfig.class, eCCCDCOptimizeConfig);
        if (eCCCDCOptimizeConfig2 != null) {
            eCCCDCOptimizeConfig = eCCCDCOptimizeConfig2;
        }
        Boolean bool = eCCCDCOptimizeConfig.fixCCDCDateInput;
        if (bool != null && bool.booleanValue()) {
            textWatcher = new C942803mM(editText) { // from class: X.03mL
                @Override // X.C942803mM, android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    super.afterTextChanged(editable);
                    this.getAfterValueChanged().invoke(this.getValue());
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    this.getOnValueChange().invoke(this.getValue());
                }
            };
        } else {
            textWatcher = new C933903kv(editText) { // from class: X.03mA
                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    this.getOnValueChange().invoke(this.getValue());
                }
            };
        }
        this.LLJILLL = textWatcher;
        getEditText().setImeOptions(6);
        EditText editText2 = getEditText();
        Configuration configuration = elementDTO.configuration;
        if (configuration != null) {
            num = configuration.inputType;
        } else {
            num = null;
        }
        int iOrdinal = EnumC941503m9.NUMBER.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            inputType = 2;
        } else {
            int iOrdinal2 = EnumC941503m9.PHONE.ordinal();
            if (num != null && num.intValue() == iOrdinal2) {
                inputType = 3;
            } else {
                inputType = getEditText().getInputType();
            }
        }
        editText2.setInputType(inputType);
        getEditText().addTextChangedListener(this.LLJILLL);
        getEditText().setOnFocusChangeListener(new C04JP(this, 2));
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<PaymentElement> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().paramValue;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "/", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                getEditText().setText(strLJJLIIIJ);
            }
        }
    }
}
