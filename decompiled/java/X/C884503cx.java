package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C884503cx extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CCDCAddCardViewModel LL;
    public final /* synthetic */ PaymentInfo LLILLJJLI;
    public final /* synthetic */ List<ElementDTO> LLILLL;
    public final /* synthetic */ List<PaymentElement> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884503cx(CCDCAddCardViewModel cCDCAddCardViewModel, PaymentInfo paymentInfo, List<ElementDTO> list, List<PaymentElement> list2, boolean z) {
        super(0);
        this.LL = cCDCAddCardViewModel;
        this.LLILLJJLI = paymentInfo;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Boolean bool;
        Address address;
        Boolean bool2;
        Boolean bool3;
        CCDCAddCardViewModel cCDCAddCardViewModel = this.LL;
        PaymentInfo paymentInfo = this.LLILLJJLI;
        List<ElementDTO> list = this.LLILLL;
        List<PaymentElement> listLIZIZ = this.LLILZ;
        boolean z = this.LLILZIL;
        cCDCAddCardViewModel.getClass();
        if (C865203Zq.LIZ()) {
            if (Intrinsics.LJFF(cCDCAddCardViewModel.LLILLL, "EDIT_ADDRESS")) {
                if (Intrinsics.LJFF(cCDCAddCardViewModel.getState().LLJIJIL, Boolean.TRUE)) {
                    EnterParams enterParams = cCDCAddCardViewModel.LLILLJJLI;
                    listLIZIZ = C7769031r.LIZIZ(enterParams != null ? enterParams.shippingAddress : null, list);
                }
                cCDCAddCardViewModel.hR2(paymentInfo, listLIZIZ);
                EnterParams enterParams2 = cCDCAddCardViewModel.LLILLJJLI;
                if (enterParams2 == null || !enterParams2.LJJIIJ) {
                    C1440005kM.LIZ(new C03OE(paymentInfo, cCDCAddCardViewModel.LLILLL, cCDCAddCardViewModel.LLJIJIL, false, 24));
                } else {
                    C1440005kM.LIZ(new C03OF(paymentInfo, cCDCAddCardViewModel.LLILLL, cCDCAddCardViewModel.LLJIJIL, false, 24));
                }
                cCDCAddCardViewModel.setState(AFwS228S0000000_1.get$arr$(599));
            } else if (Intrinsics.LJFF(cCDCAddCardViewModel.LLILLL, "ADD_NEW_CARD") || Intrinsics.LJFF(cCDCAddCardViewModel.LLILLL, "ADD_NEW_CCI_US")) {
                if (Intrinsics.LJFF(cCDCAddCardViewModel.getState().LLJIJIL, Boolean.TRUE)) {
                    EnterParams enterParams3 = cCDCAddCardViewModel.LLILLJJLI;
                    listLIZIZ = C7769031r.LIZIZ(enterParams3 != null ? enterParams3.shippingAddress : null, list);
                }
                cCDCAddCardViewModel.hR2(paymentInfo, listLIZIZ);
                if (!Intrinsics.LJFF(cCDCAddCardViewModel.LLILLL, "ADD_NEW_CCI_US")) {
                    EnterParams enterParams4 = cCDCAddCardViewModel.LLILLJJLI;
                    if (enterParams4 == null || !enterParams4.LJJIIJ) {
                        PaymentCacheHelper paymentCacheHelper = PaymentCacheHelper.LIZ;
                        String str = cCDCAddCardViewModel.LLJIJIL;
                        paymentCacheHelper.getClass();
                        PaymentCacheHelper.LJIIJJI(str);
                        PaymentCacheHelper.LIZIZ(paymentInfo);
                    } else {
                        C879403c8 c879403c8 = C879403c8.LIZ;
                        C879403c8.LJ(cCDCAddCardViewModel.LLJIJIL);
                        C879403c8.LIZ(paymentInfo);
                    }
                    EnterParams enterParams5 = cCDCAddCardViewModel.LLILLJJLI;
                    if (enterParams5 == null || !enterParams5.LJJIIJ) {
                        C1440005kM.LIZ(new C03OE(paymentInfo, "ADD_NEW_CARD", cCDCAddCardViewModel.LLJIJIL, (enterParams5 == null || (bool2 = enterParams5.LJIIJ) == null) ? false : bool2.booleanValue(), 8));
                    } else {
                        C1440005kM.LIZ(new C03OF(paymentInfo, "ADD_NEW_CARD", cCDCAddCardViewModel.LLJIJIL, (enterParams5 == null || (bool3 = enterParams5.LJIIJ) == null) ? false : bool3.booleanValue(), 8));
                    }
                }
                cCDCAddCardViewModel.setState(new AwS367S0200000_1(cCDCAddCardViewModel, paymentInfo, 240));
            } else {
                if (Intrinsics.LJFF(cCDCAddCardViewModel.getState().LLJIJIL, Boolean.TRUE)) {
                    EnterParams enterParams6 = cCDCAddCardViewModel.LLILLJJLI;
                    listLIZIZ = C7769031r.LIZIZ(enterParams6 != null ? enterParams6.shippingAddress : null, list);
                }
                cCDCAddCardViewModel.hR2(paymentInfo, listLIZIZ);
                EnterParams enterParams7 = cCDCAddCardViewModel.LLILLJJLI;
                if (enterParams7 == null || !enterParams7.LJJIIJ) {
                    PaymentCacheHelper paymentCacheHelper2 = PaymentCacheHelper.LIZ;
                    String str2 = cCDCAddCardViewModel.LLJIJIL;
                    paymentCacheHelper2.getClass();
                    PaymentCacheHelper.LJIIJJI(str2);
                    PaymentCacheHelper.LIZIZ(paymentInfo);
                } else {
                    C879403c8 c879403c82 = C879403c8.LIZ;
                    C879403c8.LJ(cCDCAddCardViewModel.LLJIJIL);
                    C879403c8.LIZ(paymentInfo);
                }
                EnterParams enterParams8 = cCDCAddCardViewModel.LLILLJJLI;
                if (enterParams8 == null || !enterParams8.LJJIIJ) {
                    C1440005kM.LIZ(new C03OE(paymentInfo, cCDCAddCardViewModel.LLILLL, cCDCAddCardViewModel.LLJIJIL, false, 24));
                } else {
                    C1440005kM.LIZ(new C03OF(paymentInfo, cCDCAddCardViewModel.LLILLL, cCDCAddCardViewModel.LLJIJIL, false, 24));
                }
                cCDCAddCardViewModel.setState(AFwS228S0000000_1.get$arr$(601));
            }
        } else if (Intrinsics.LJFF(cCDCAddCardViewModel.LLILLL, "ADD_NEW_CARD") || Intrinsics.LJFF(cCDCAddCardViewModel.LLILLL, "ADD_NEW_CCI_SEA") || Intrinsics.LJFF(cCDCAddCardViewModel.LLILLL, "ADD_NEW_CCI_BR")) {
            EnterParams enterParams9 = cCDCAddCardViewModel.LLILLJJLI;
            if (Intrinsics.LJFF(enterParams9 != null ? enterParams9.paySource : null, "ordersubmit")) {
                EnterParams enterParams10 = cCDCAddCardViewModel.LLILLJJLI;
                if (enterParams10 != null && (address = enterParams10.shippingAddress) != null && list != null && !list.isEmpty()) {
                    Map mapLIZJ = C7769031r.LIZJ(address);
                    ArrayList arrayList = new ArrayList();
                    for (ElementDTO elementDTO : list) {
                        PaymentElement paymentElementLIZ = elementDTO.LIZ();
                        paymentElementLIZ.setParamValue(mapLIZJ != null ? (String) mapLIZJ.get(elementDTO.id) : null);
                        arrayList.add(paymentElementLIZ);
                    }
                    PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
                    if (paymentMethodInfo != null) {
                        paymentMethodInfo.setPaymentElements(C03S8.LJJII(paymentMethodInfo.paymentElements, arrayList));
                    }
                    EnterParams enterParams11 = cCDCAddCardViewModel.LLILLJJLI;
                    if (enterParams11 == null || !enterParams11.LJJIIJ) {
                        PaymentCacheHelper paymentCacheHelper3 = PaymentCacheHelper.LIZ;
                        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
                        String strLJIIJ = paymentMethod != null ? paymentMethod.LJIIJ() : null;
                        paymentCacheHelper3.getClass();
                        PaymentCacheHelper.LIZ(strLJIIJ, arrayList);
                    }
                }
                EnterParams enterParams12 = cCDCAddCardViewModel.LLILLJJLI;
                if (enterParams12 == null || !enterParams12.LJJIIJ) {
                    PaymentCacheHelper paymentCacheHelper4 = PaymentCacheHelper.LIZ;
                    String str3 = cCDCAddCardViewModel.LLJIJIL;
                    paymentCacheHelper4.getClass();
                    PaymentCacheHelper.LJIIJJI(str3);
                    paymentInfo.LJ = cCDCAddCardViewModel.EQ2(paymentInfo);
                    PaymentCacheHelper.LIZIZ(paymentInfo);
                } else {
                    C879403c8 c879403c83 = C879403c8.LIZ;
                    C879403c8.LJ(cCDCAddCardViewModel.LLJIJIL);
                    C879403c8.LIZ(paymentInfo);
                }
                EnterParams enterParams13 = cCDCAddCardViewModel.LLILLJJLI;
                boolean z2 = (enterParams13 == null || (bool = enterParams13.LJIIJ) == null || !bool.booleanValue() || z) ? false : true;
                EnterParams enterParams14 = cCDCAddCardViewModel.LLILLJJLI;
                if (enterParams14 == null || !enterParams14.LJJIIJ) {
                    C1440005kM.LIZ(new C03OE(paymentInfo, "ADD_NEW_CARD", cCDCAddCardViewModel.LLJIJIL, cCDCAddCardViewModel.LLJJL, z2));
                } else {
                    C1440005kM.LIZ(new C03OF(paymentInfo, "ADD_NEW_CARD", cCDCAddCardViewModel.LLJIJIL, cCDCAddCardViewModel.LLJJL, z2));
                }
                cCDCAddCardViewModel.LLJJL = null;
                if (Intrinsics.LJFF(cCDCAddCardViewModel.LLILLL, "ADD_NEW_CCI_SEA")) {
                    cCDCAddCardViewModel.setState(AFwS228S0000000_1.get$arr$(613));
                } else if (!Intrinsics.LJFF(cCDCAddCardViewModel.LLILLL, "ADD_NEW_CCI_BR")) {
                    cCDCAddCardViewModel.setState(AFwS228S0000000_1.get$arr$(616));
                } else if (!z || cCDCAddCardViewModel.fR2()) {
                    cCDCAddCardViewModel.setState(AFwS228S0000000_1.get$arr$(614));
                } else {
                    cCDCAddCardViewModel.setState(new AwS580S0100000_1(paymentInfo, 604));
                }
            } else {
                EnterParams enterParams15 = cCDCAddCardViewModel.LLILLJJLI;
                if (enterParams15 == null || !enterParams15.LJJIIJ) {
                    PaymentCacheHelper paymentCacheHelper5 = PaymentCacheHelper.LIZ;
                    String str4 = cCDCAddCardViewModel.LLJIJIL;
                    paymentCacheHelper5.getClass();
                    PaymentCacheHelper.LJIIJJI(str4);
                    paymentInfo.LJ = cCDCAddCardViewModel.EQ2(paymentInfo);
                    PaymentCacheHelper.LIZIZ(paymentInfo);
                } else {
                    C879403c8 c879403c84 = C879403c8.LIZ;
                    C879403c8.LJ(cCDCAddCardViewModel.LLJIJIL);
                    C879403c8.LIZ(paymentInfo);
                }
                EnterParams enterParams16 = cCDCAddCardViewModel.LLILLJJLI;
                if (enterParams16 == null || !enterParams16.LJJIIJ) {
                    C1440005kM.LIZ(new C03OE(paymentInfo, cCDCAddCardViewModel.LLILLL, cCDCAddCardViewModel.LLJIJIL, false, 24));
                } else {
                    C1440005kM.LIZ(new C03OF(paymentInfo, cCDCAddCardViewModel.LLILLL, cCDCAddCardViewModel.LLJIJIL, false, 24));
                }
                if (Intrinsics.LJFF(cCDCAddCardViewModel.LLILLL, "ADD_NEW_CCI_SEA")) {
                    cCDCAddCardViewModel.setState(AFwS228S0000000_1.get$arr$(604));
                } else if (!Intrinsics.LJFF(cCDCAddCardViewModel.LLILLL, "ADD_NEW_CCI_BR")) {
                    cCDCAddCardViewModel.setState(AFwS228S0000000_1.get$arr$(607));
                } else if (!z || cCDCAddCardViewModel.fR2()) {
                    cCDCAddCardViewModel.setState(AFwS228S0000000_1.get$arr$(606));
                } else {
                    cCDCAddCardViewModel.setState(new AwS580S0100000_1(paymentInfo, 597));
                }
            }
        } else {
            PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
            String strLJIIJ2 = paymentMethod2 != null ? paymentMethod2.LJIIJ() : null;
            EnterParams enterParams17 = cCDCAddCardViewModel.LLILLJJLI;
            if (enterParams17 == null || !enterParams17.LJJIIJ) {
                PaymentCacheHelper paymentCacheHelper6 = PaymentCacheHelper.LIZ;
                String str5 = cCDCAddCardViewModel.LLJIJIL;
                paymentCacheHelper6.getClass();
                PaymentCacheHelper.LJIIJJI(str5);
                PaymentCacheHelper.LIZIZ(paymentInfo);
                PaymentMethodInfo paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
                PaymentCacheHelper.LIZ(strLJIIJ2, paymentMethodInfo2 != null ? paymentMethodInfo2.paymentElements : null);
            } else {
                C879403c8 c879403c85 = C879403c8.LIZ;
                C879403c8.LJ(cCDCAddCardViewModel.LLJIJIL);
                C879403c8.LIZ(paymentInfo);
            }
            EnterParams enterParams18 = cCDCAddCardViewModel.LLILLJJLI;
            if (enterParams18 == null || !enterParams18.LJJIIJ) {
                C1440005kM.LIZ(new C03OE(paymentInfo, cCDCAddCardViewModel.LLILLL, cCDCAddCardViewModel.LLJIJIL, false, 24));
            } else {
                C1440005kM.LIZ(new C03OF(paymentInfo, cCDCAddCardViewModel.LLILLL, cCDCAddCardViewModel.LLJIJIL, false, 24));
            }
            cCDCAddCardViewModel.setState(AFwS228S0000000_1.get$arr$(603));
        }
        return Unit.LIZ;
    }
}
