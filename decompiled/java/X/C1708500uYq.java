package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIFlow;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPricingPlanMarketingTool;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetailItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetails;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708500uYq extends C09AY implements InterfaceC1631630sYr<EnumC336190DFx, PayRequestPaymentDetailItem, String, String, Unit> {
    public final /* synthetic */ C1709570uaZ LL;
    public final /* synthetic */ List<PayRequestPaymentDetailItem> LLILLJJLI;
    public final /* synthetic */ InterfaceC1631630sYr<EnumC336190DFx, PayRequestPaymentDetails, String, String, Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ CashierKey LLILZIL;
    public final /* synthetic */ C1709570uaZ LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1708500uYq(C1709570uaZ c1709570uaZ, List<PayRequestPaymentDetailItem> list, InterfaceC1631630sYr<? super EnumC336190DFx, ? super PayRequestPaymentDetails, ? super String, ? super String, Unit> interfaceC1631630sYr, String str, CashierKey cashierKey, C1709570uaZ c1709570uaZ2, String str2) {
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
        String strLJII;
        String str3;
        List<CBIPricingPlanMarketingTool> list;
        CBIFlow cBIFlow;
        String str4 = str2;
        String str5 = str;
        if (payRequestPaymentDetailItem != null) {
            this.LLILLJJLI.add(payRequestPaymentDetailItem);
        }
        CommuteType commuteTypeLJIIJ = CommuteType.NONE;
        C1709570uaZ c1709570uaZ = this.LL;
        if (c1709570uaZ.LJI == null) {
            strLJII = null;
        } else {
            strLJII = c1709570uaZ.LJII();
        }
        C1709570uaZ c1709570uaZ2 = this.LL;
        PIPOPaymentOptionSource pIPOPaymentOptionSource = c1709570uaZ2.LJIILIIL;
        String str6 = c1709570uaZ2.LJJIII;
        if (str6 == null && (str6 = c1709570uaZ2.LJJII) == null) {
            str6 = "";
        }
        PaymentOption paymentOptionLJ = pIPOPaymentOptionSource.LJ(str6);
        boolean zBooleanValue = false;
        if (paymentOptionLJ != null) {
            Boolean bool = paymentOptionLJ.LJIIJJI(this.LLILZLL).storePaymentMethod;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            commuteTypeLJIIJ = paymentOptionLJ.LJIIJ();
            PIPOPaymentMethod pIPOPaymentMethod = paymentOptionLJ.legacyPM;
            if (pIPOPaymentMethod != null && (cBIFlow = pIPOPaymentMethod.paymentFlow) != null) {
                str3 = cBIFlow.packageName;
            } else {
                str3 = null;
            }
            PricingPlan pricingPlan = paymentOptionLJ.LIZIZ;
            if (pricingPlan != null) {
                list = pricingPlan.marketingTools;
            } else {
                list = null;
            }
        } else {
            str3 = null;
            list = null;
        }
        if (this.LLILLJJLI.isEmpty()) {
            InterfaceC1631630sYr<EnumC336190DFx, PayRequestPaymentDetails, String, String, Unit> interfaceC1631630sYr = this.LLILLL;
            EnumC336190DFx enumC336190DFx2 = EnumC336190DFx.PAYMENT_ERROR;
            if (str5 == null) {
                if (this.LL.LJJII != null) {
                    str5 = this.LLIZ;
                } else {
                    str5 = null;
                }
            }
            if (str4 == null) {
                str4 = this.LLILZ;
            }
            interfaceC1631630sYr.invoke(enumC336190DFx2, null, str5, str4);
        } else {
            this.LLILLL.invoke(EnumC336190DFx.SUCCESS, new PayRequestPaymentDetails(this.LLILLJJLI, null, this.LL.LJIIJ(), C1708480uYo.LIZ(this.LLILZIL, commuteTypeLJIIJ), zBooleanValue, Integer.valueOf(commuteTypeLJIIJ.getValue()), str3, list, strLJII, 2, null), null, null);
        }
        return Unit.LIZ;
    }
}
