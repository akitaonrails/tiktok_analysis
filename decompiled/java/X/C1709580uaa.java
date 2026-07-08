package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetailItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uaa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709580uaa extends C09AY implements InterfaceC1631630sYr<EnumC336190DFx, List<? extends POPayElement>, String, String, Unit> {
    public final /* synthetic */ C1709570uaZ LL;
    public final /* synthetic */ InterfaceC835070WpN LLILLJJLI;
    public final /* synthetic */ PaymentOption LLILLL;
    public final /* synthetic */ PIPOPaymentMethod LLILZ;
    public final /* synthetic */ List<POPayElement> LLILZIL;
    public final /* synthetic */ InterfaceC1631630sYr<EnumC336190DFx, PayRequestPaymentDetailItem, String, String, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1709580uaa(C1709570uaZ c1709570uaZ, InterfaceC835070WpN interfaceC835070WpN, PaymentOption paymentOption, PIPOPaymentMethod pIPOPaymentMethod, List<POPayElement> list, InterfaceC1631630sYr<? super EnumC336190DFx, ? super PayRequestPaymentDetailItem, ? super String, ? super String, Unit> interfaceC1631630sYr) {
        super(4);
        this.LL = c1709570uaZ;
        this.LLILLJJLI = interfaceC835070WpN;
        this.LLILLL = paymentOption;
        this.LLILZ = pIPOPaymentMethod;
        this.LLILZIL = list;
        this.LLILZLL = interfaceC1631630sYr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(EnumC336190DFx enumC336190DFx, List<? extends POPayElement> list, String str, String str2) {
        List<? extends POPayElement> list2 = list;
        if (enumC336190DFx == EnumC336190DFx.SUCCESS) {
            if (list2 != null) {
                this.LLILZIL.addAll(list2);
            }
            this.LL.LJIIL(this.LLILLJJLI, this.LLILLL, list2);
            C1709570uaZ c1709570uaZ = this.LL;
            this.LLILZLL.invoke(enumC336190DFx, c1709570uaZ.LIZLLL(this.LLILLL, this.LLILZ, c1709570uaZ.LJIJI(this.LLILZIL)), str, str2);
        } else {
            this.LLILZLL.invoke(enumC336190DFx, null, str, str2);
        }
        return Unit.LIZ;
    }
}
