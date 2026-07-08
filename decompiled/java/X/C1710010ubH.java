package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ubH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1710010ubH extends C2217421BqW implements Function1<String, Unit> {
    public C1710010ubH(SubCashierViewModel subCashierViewModel) {
        super(1, subCashierViewModel, SubCashierViewModel.class, "changePaymentMethod", "changePaymentMethod(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C1709570uaZ c1709570uaZ;
        String str2 = str;
        SubCashierEnterParams subCashierEnterParams = ((SubCashierViewModel) this.receiver).LL;
        if (subCashierEnterParams != null && (c1709570uaZ = subCashierEnterParams.paymentData) != null) {
            c1709570uaZ.LJIILJJIL(str2, false, false);
        }
        return Unit.LIZ;
    }
}
