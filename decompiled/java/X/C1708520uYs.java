package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetailItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetails;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708520uYs extends C09AY implements InterfaceC1631630sYr<EnumC336190DFx, PayRequestPaymentDetailItem, String, String, Unit> {
    public final /* synthetic */ C1709570uaZ LL;
    public final /* synthetic */ List<PayRequestPaymentDetailItem> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC1631630sYr<EnumC336190DFx, PayRequestPaymentDetails, String, String, Unit> LLILZLL;
    public final /* synthetic */ CashierKey LLIZ;
    public final /* synthetic */ C1709570uaZ LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1708520uYs(C1709570uaZ c1709570uaZ, List<PayRequestPaymentDetailItem> list, Context context, boolean z, String str, boolean z2, InterfaceC1631630sYr<? super EnumC336190DFx, ? super PayRequestPaymentDetails, ? super String, ? super String, Unit> interfaceC1631630sYr, CashierKey cashierKey, C1709570uaZ c1709570uaZ2) {
        super(4);
        this.LL = c1709570uaZ;
        this.LLILLJJLI = list;
        this.LLILLL = context;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = interfaceC1631630sYr;
        this.LLIZ = cashierKey;
        this.LLIZLLLIL = c1709570uaZ2;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(EnumC336190DFx enumC336190DFx, PayRequestPaymentDetailItem payRequestPaymentDetailItem, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (payRequestPaymentDetailItem != null) {
            this.LLILLJJLI.add(payRequestPaymentDetailItem);
        }
        C1709570uaZ c1709570uaZ = this.LL;
        PaymentOption paymentOptionLJ = c1709570uaZ.LJIILIIL.LJ(c1709570uaZ.LJJIII);
        C1709570uaZ c1709570uaZ2 = this.LL;
        c1709570uaZ2.LJ(this.LLILLL, this.LLILZ, paymentOptionLJ, this.LLILZIL, new C1708500uYq(c1709570uaZ2, this.LLILLJJLI, this.LLILZLL, str4, this.LLIZ, this.LLIZLLLIL, str3));
        return Unit.LIZ;
    }
}
