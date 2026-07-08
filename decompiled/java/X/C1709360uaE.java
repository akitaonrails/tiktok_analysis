package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1709360uaE extends C2217421BqW implements InterfaceC1631620sYq<C1709570uaZ, PaymentOption, String, Unit> {
    public C1709360uaE(CashierViewModel cashierViewModel) {
        super(3, cashierViewModel, CashierViewModel.class, "onCVVElementValueChanged", "onCVVElementValueChanged(Lcom/ss/android/ugc/aweme/pipo/cashier/common/model/PIPOPaymentMethodsData;Lcom/ss/android/ugc/aweme/pipo/cashier/common/model/po/PaymentOption;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C1709570uaZ c1709570uaZ, PaymentOption paymentOption, String str) {
        EnumC1709200uZy enumC1709200uZy;
        C1709070uZl c1709070uZl;
        C1709570uaZ c1709570uaZ2 = c1709570uaZ;
        PaymentOption paymentOption2 = paymentOption;
        String str2 = str;
        CashierViewModel cashierViewModel = (CashierViewModel) this.receiver;
        cashierViewModel.LLILZIL.put(paymentOption2.LIZ, str2);
        CashierEnterParams cashierEnterParams = cashierViewModel.LL;
        if (cashierEnterParams != null && (c1709070uZl = cashierEnterParams.LIZIZ) != null) {
            enumC1709200uZy = c1709070uZl.LIZIZ;
        } else {
            enumC1709200uZy = null;
        }
        if (enumC1709200uZy == EnumC1709200uZy.PAY_NOW) {
            paymentOption2.LJJIFFI(c1709570uaZ2, str2);
        }
        return Unit.LIZ;
    }
}
