package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import g1c.AjS40S0200000_1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03m7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC941303m7 extends C1745300vWC implements InterfaceC884803d0 {
    public Function1<? super List<PaymentElement>, String> LLJJJJJIL;
    public Function0<Unit> LLJJJJLIIL;

    public abstract /* synthetic */ ElementDTO getElementDTO();

    public abstract C1748260vay getInputView();

    public abstract /* synthetic */ Function1<List<PaymentElement>, Unit> getOnValueChange();

    public abstract /* synthetic */ PaymentMethod getPaymentMethod();

    public abstract /* synthetic */ List<PaymentElement> getValue();

    public abstract /* synthetic */ void setElementDTO(ElementDTO elementDTO);

    public abstract /* synthetic */ void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1);

    public abstract /* synthetic */ void setPaymentMethod(PaymentMethod paymentMethod);

    public final Function0<Unit> getOnErrorClear() {
        return this.LLJJJJLIIL;
    }

    public final Function1<List<PaymentElement>, String> getOnVerify() {
        return this.LLJJJJJIL;
    }

    public final void setOnErrorClear(Function0<Unit> function0) {
        this.LLJJJJLIIL = function0;
    }

    public final void setOnVerify(Function1<? super List<PaymentElement>, String> function1) {
        this.LLJJJJJIL = function1;
    }

    public AbstractC941303m7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJJJJIL = AFwS228S0000000_1.get$arr$(756);
        this.LLJJJJLIIL = AFwS185S0000000_1.get$arr$(468);
    }

    public void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        Integer num;
        int inputType;
        int iIntValue;
        boolean zLJFF;
        Integer num2;
        C1748260vay inputView = getInputView();
        if (inputView != null) {
            inputView.getInputWithIndicatorEditTextFromXml().setHint(elementDTO.placeholderDisplayName);
            Configuration configuration = elementDTO.configuration;
            if (configuration != null) {
                num = configuration.inputType;
            } else {
                num = null;
            }
            int iOrdinal = EnumC941503m9.NUMBER.ordinal();
            int i = 1;
            if (num != null && num.intValue() == iOrdinal) {
                inputType = 2;
            } else {
                int iOrdinal2 = EnumC941503m9.PHONE.ordinal();
                if (num != null && num.intValue() == iOrdinal2) {
                    inputType = 3;
                } else {
                    int iOrdinal3 = EnumC941503m9.TEXT.ordinal();
                    if (num != null && num.intValue() == iOrdinal3) {
                        inputType = 1;
                    } else {
                        inputType = inputView.getInputType();
                    }
                }
            }
            inputView.setInputType(inputType);
            C786410Ut5.I7(new AjS40S0200000_1(inputView, this, 76), getContentViewFromXml());
            Configuration configuration2 = elementDTO.configuration;
            if (configuration2 != null && (num2 = configuration2.maxLength) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = Integer.MAX_VALUE;
            }
            inputView.setMaxLength(iIntValue);
            Configuration configuration3 = elementDTO.configuration;
            if (configuration3 != null) {
                zLJFF = Intrinsics.LJFF(configuration3.lineBreak, Boolean.TRUE);
                if (zLJFF) {
                    i = Integer.MAX_VALUE;
                }
            } else {
                zLJFF = false;
            }
            inputView.setMaxLines(i);
            if (zLJFF) {
                inputView.setInputType(inputView.getInputType() | 131072);
            }
        }
        if (obj instanceof String) {
            LJFF(new C1745340vWG((String) obj, null, false, null, null, 30));
        } else {
            LIZIZ();
        }
    }
}
