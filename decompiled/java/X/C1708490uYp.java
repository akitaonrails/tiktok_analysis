package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPricingPlanMarketingTool;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetailItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetails;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708490uYp extends C09AY implements InterfaceC1631630sYr<EnumC336190DFx, PayRequestPaymentDetailItem, String, String, Unit> {
    public final /* synthetic */ C1709570uaZ LL;
    public final /* synthetic */ List<PayRequestPaymentDetailItem> LLILLJJLI;
    public final /* synthetic */ InterfaceC1631630sYr<EnumC336190DFx, PayRequestPaymentDetails, String, String, Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ CashierKey LLILZIL;
    public final /* synthetic */ C1709570uaZ LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1708490uYp(C1709570uaZ c1709570uaZ, List<PayRequestPaymentDetailItem> list, InterfaceC1631630sYr<? super EnumC336190DFx, ? super PayRequestPaymentDetails, ? super String, ? super String, Unit> interfaceC1631630sYr, String str, CashierKey cashierKey, C1709570uaZ c1709570uaZ2, String str2) {
        super(4);
        this.LL = c1709570uaZ;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC1631630sYr;
        this.LLILZ = str;
        this.LLILZIL = cashierKey;
        this.LLILZLL = c1709570uaZ2;
        this.LLIZ = str2;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(EnumC336190DFx enumC336190DFx, PayRequestPaymentDetailItem payRequestPaymentDetailItem, String str, String str2) {
        List<CBIPricingPlanMarketingTool> list;
        String str3 = str2;
        String str4 = str;
        if (payRequestPaymentDetailItem != null) {
            this.LLILLJJLI.add(payRequestPaymentDetailItem);
        }
        CommuteType commuteTypeLJIIJ = CommuteType.NONE;
        C1709570uaZ c1709570uaZ = this.LL;
        PIPOPaymentOptionSource pIPOPaymentOptionSource = c1709570uaZ.LJIILIIL;
        String str5 = c1709570uaZ.LJJIII;
        if (str5 == null && (str5 = c1709570uaZ.LJJII) == null) {
            str5 = "";
        }
        PaymentOption paymentOptionLJ = pIPOPaymentOptionSource.LJ(str5);
        boolean zBooleanValue = false;
        if (paymentOptionLJ != null) {
            Boolean bool = paymentOptionLJ.LJIIJJI(this.LLILZLL).storePaymentMethod;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            commuteTypeLJIIJ = paymentOptionLJ.LJIIJ();
            PricingPlan pricingPlan = paymentOptionLJ.LIZIZ;
            if (pricingPlan != null) {
                list = pricingPlan.marketingTools;
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        if (this.LLILLJJLI.isEmpty()) {
            InterfaceC1631630sYr<EnumC336190DFx, PayRequestPaymentDetails, String, String, Unit> interfaceC1631630sYr = this.LLILLL;
            EnumC336190DFx enumC336190DFx2 = EnumC336190DFx.PAYMENT_ERROR;
            if (str4 == null) {
                if (this.LL.LJJII != null) {
                    str4 = this.LLIZ;
                } else {
                    str4 = null;
                }
            }
            if (str3 == null) {
                str3 = this.LLILZ;
            }
            interfaceC1631630sYr.invoke(enumC336190DFx2, null, str4, str3);
        } else {
            this.LLILLL.invoke(EnumC336190DFx.SUCCESS, new PayRequestPaymentDetails(this.LLILLJJLI, null, this.LL.LJIIJ(), C1708480uYo.LIZ(this.LLILZIL, commuteTypeLJIIJ), zBooleanValue, Integer.valueOf(commuteTypeLJIIJ.getValue()), null, list, this.LL.LJII(), 66, null), null, null);
        }
        return Unit.LIZ;
    }
}
