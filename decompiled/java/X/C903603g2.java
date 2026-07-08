package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomMergeBalanceAndInstallmentSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03g2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C903603g2 extends LinearLayout implements InterfaceC884803d0 {
    public Function1<? super List<PaymentElement>, Unit> LL;
    public PaymentMethod LLILLJJLI;
    public ElementDTO LLILLL;
    public boolean LLILZ;
    public HashMap<String, Object> LLILZIL;
    public C03WH LLILZLL;
    public String LLIZ;
    public final C01GW LLIZLLLIL;

    private final C904503gB getBalanceView() {
        return (C904503gB) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC884803d0
    public List<PaymentElement> getValue() {
        return Collections.singletonList(new PaymentElement("balance", null, null, null, Boolean.FALSE));
    }

    @Override // X.InterfaceC884803d0
    public ElementDTO getElementDTO() {
        return this.LLILLL;
    }

    public final boolean getHasCheckedPaymentMethod() {
        return this.LLILZ;
    }

    public Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LL;
    }

    public final String getPaySource() {
        return this.LLIZ;
    }

    public final C03WH getPaymentLogger() {
        return this.LLILZLL;
    }

    public PaymentMethod getPaymentMethod() {
        return this.LLILLJJLI;
    }

    public final HashMap<String, Object> getTrackParams() {
        return this.LLILZIL;
    }

    public C903603g2(Context context) {
        super(context, null, 0);
        this.LL = AFwS228S0000000_1.get$arr$(742);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS402S0200000_1(context, this, 82));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public void setElementDTO(ElementDTO elementDTO) {
        this.LLILLL = elementDTO;
    }

    public final void setHasCheckedPaymentMethod(boolean z) {
        this.LLILZ = z;
    }

    @Override // X.InterfaceC884803d0
    public void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LL = function1;
    }

    public final void setPaySource(String str) {
        this.LLIZ = str;
    }

    public final void setPaymentLogger(C03WH c03wh) {
        this.LLILZLL = c03wh;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LLILLJJLI = paymentMethod;
    }

    public final void setTrackParams(HashMap<String, Object> map) {
        this.LLILZIL = map;
    }

    @Override // X.InterfaceC884803d0
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        int iIntValue;
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        C904503gB balanceView = getBalanceView();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        int iIntValue2 = 0;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        balanceView.setBalanceTextColor(iIntValue);
        getBalanceView().setBalanceTextValue("");
        String str = paymentMethod.balance;
        if (str != null && C123100dR.LIZ(str) && !EcomMergeBalanceAndInstallmentSettings.LIZ(paymentMethod.id)) {
            getBalanceView().setBalanceTextValue(str);
        } else {
            C904503gB balanceView2 = getBalanceView();
            int visibility = balanceView2.getVisibility();
            balanceView2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, balanceView2);
        }
        Availability availability = paymentMethod.availability;
        if (availability != null && Intrinsics.LJFF(availability.isAvailable(), Boolean.FALSE)) {
            C904503gB balanceView3 = getBalanceView();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
            balanceView3.setBalanceTextColor(iIntValue2);
        }
    }
}
