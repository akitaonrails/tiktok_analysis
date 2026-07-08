package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;

/* JADX INFO: renamed from: X.0uax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1709810uax extends C2217421BqW implements InterfaceC1631620sYq<PaymentOption, String, EnumC1710440uby, C1710830ucb> {
    public C1709810uax(CashierViewModel cashierViewModel) {
        super(3, cashierViewModel, CashierViewModel.class, "verifyEle", "verifyEle(Lcom/ss/android/ugc/aweme/pipo/cashier/common/model/po/PaymentOption;Ljava/lang/String;Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/ccdc/VerifyScene;)Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/ccdc/VerifyResult;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C1710830ucb invoke(PaymentOption paymentOption, String str, EnumC1710440uby enumC1710440uby) {
        PaymentOption paymentOption2 = paymentOption;
        String str2 = str;
        EnumC1710440uby enumC1710440uby2 = enumC1710440uby;
        C1710390ubt c1710390ubt = ((CashierViewModel) this.receiver).LLILZ;
        if (c1710390ubt != null) {
            return c1710390ubt.LIZJ(EnumC1710490uc3.CVV, paymentOption2, str2, enumC1710440uby2, null);
        }
        return null;
    }
}
