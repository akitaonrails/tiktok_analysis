package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1709370uaF extends C2217421BqW implements Function1<AbstractC1709700uam, Unit> {
    public C1709370uaF(CashierViewModel cashierViewModel) {
        super(1, cashierViewModel, CashierViewModel.class, "verifyAtSubmit", "verifyAtSubmit(Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/ccdc/SubmitVerifyAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1709700uam abstractC1709700uam) {
        AbstractC1709700uam abstractC1709700uam2 = abstractC1709700uam;
        C1710390ubt c1710390ubt = ((CashierViewModel) this.receiver).LLILZ;
        if (c1710390ubt != null) {
            c1710390ubt.LIZIZ(abstractC1709700uam2, true);
        }
        return Unit.LIZ;
    }
}
