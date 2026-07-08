package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECLatamOspFlowOpt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C817903Hl implements AnonymousClass0390 {
    public final OrderSubmitAssemViewModel LIZ;
    public final View LIZIZ;
    public final OspAddressViewModel LIZJ;
    public final OspBottomViewModel LIZLLL;
    public final OspShopViewModel LJ;

    @Override // X.AnonymousClass0390
    public final C7953038t LIZ(String str, String str2) {
        List<ShopOrderNew> list;
        String str3;
        C723002s0 c723002s0LJ;
        List<ShopOrderNew> list2;
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list3;
        MainOrderInfo mainOrderInfo;
        boolean z;
        MainOrderSetting mainOrderSetting;
        BillInfoSetting billInfoSetting;
        ShippingAddress shippingAddress;
        Integer num;
        boolean z2;
        int i;
        String strLJJIIZ;
        PaymentMethodsData paymentMethodsData;
        PaymentMethod paymentMethod;
        IdentityInfoOption identityInfoOption;
        Integer type;
        String str4 = str;
        C03JV state = this.LIZ.getState();
        Boolean bool = state.LLIZLLLIL;
        Boolean bool2 = Boolean.TRUE;
        String str5 = "no_address";
        if (!Intrinsics.LJFF(bool, bool2)) {
            C03LS c03ls = C03LS.ADDRESS;
            if (state.LLILZ) {
                str5 = "invalid_address";
            }
            return new C7953038t(c03ls, C2097908Jt.LIZJ(new Pair("address_intercept_sub_reason", str5)));
        }
        Boolean boolValueOf = null;
        list = null;
        List<PaymentMethod> list4 = null;
        int i2 = 0;
        if (!state.LLILZ && ((num = this.LIZ.LLLLIILLL) == null || num.intValue() != 1)) {
            if (C818303Hp.LIZ() && !C03IF.LIZ() && !ECLatamOspFlowOpt.LIZ()) {
                OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
                C1DFH c1dfh = C0PEM.LIZ;
                C948503nH.LJI(orderSubmitAssemViewModel, C2107308Nj.LIZ.LLIILII(), new C827103Kz(this, null));
            } else {
                OspAddressViewModel ospAddressViewModel = this.LIZJ;
                View view = this.LIZIZ;
                OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LIZ;
                String value = EnumC818803Hu.PLACE_ORDER.getValue();
                if (!C03IF.LIZ() && !ECLatamOspFlowOpt.LJFF()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                OspAddressViewModel.wQ2(ospAddressViewModel, view, null, null, orderSubmitAssemViewModel2, value, null, Boolean.valueOf(z2), 38);
            }
            this.LIZ.hT2(false);
            C03O0 c03o0 = C03O0.LIZ;
            PaymentInfo paymentInfo = state.LLIZ;
            List<PaymentMethod> listRR2 = this.LIZ.rR2();
            c03o0.getClass();
            Pair pairLJIILLIIL = C03O0.LJIILLIIL(paymentInfo, listRR2);
            PaymentInfo paymentInfo2 = state.LLIZ;
            if (paymentInfo2 != null && paymentInfo2.LIZJ()) {
                i = 1;
            } else {
                i = 0;
            }
            if (str4 == null) {
                str4 = "";
            }
            HashMap<String, Object> mapHi1 = this.LIZ.hi1(false);
            mapHi1.put("is_delivery_info_complete_when_place_order", Integer.valueOf(state.LLILZ ? 1 : 0));
            PaymentInfo paymentInfo3 = state.LLIZ;
            if (paymentInfo3 != null && !paymentInfo3.LIZIZ() && Intrinsics.LJFF(paymentInfo3.isValid, bool2)) {
                i2 = 1;
            }
            mapHi1.put("is_pay_info_complete_when_place_order", Integer.valueOf(i2));
            mapHi1.put("is_within_quantity_limit_when_place_order", Integer.valueOf(!Intrinsics.LJFF(state.LLLLLLLZIL, Boolean.FALSE) ? 1 : 0));
            IdentityInfo identityInfo = this.LIZ.LLZLI;
            if (identityInfo != null && (identityInfoOption = identityInfo.getIdentityInfoOption()) != null && (type = identityInfoOption.getType()) != null && type.intValue() == 3) {
                mapHi1.put("is_cpf_info_complete_when_place_order", C893803eS.LIZ(C703302op.LIZ(identityInfoOption.getValue())));
            }
            mapHi1.putAll(this.LIZ.d0);
            if (C123100dR.LIZ(this.LIZ.LLZLLIL)) {
                mapHi1.put("original_trigger_page_name", this.LIZ.LLZLLIL);
            }
            Boolean bool3 = (Boolean) pairLJIILLIIL.getFirst();
            Boolean bool4 = (Boolean) pairLJIILLIIL.getSecond();
            PaymentInfo paymentInfo4 = state.LLIZ;
            if (paymentInfo4 != null && (paymentMethod = paymentInfo4.paymentMethod) != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            } else {
                strLJJIIZ = null;
            }
            Map<String, Object> mapLJIIJJI = this.LIZ.LLLZLZ.LJIIJJI();
            int i3 = this.LIZ.x0;
            if (C818303Hp.LIZ()) {
                BillInfoData billInfoData = this.LIZ.LLJJI;
                if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                    list4 = paymentMethodsData.paymentMethods;
                }
                boolValueOf = Boolean.valueOf(C03QF.LJI(list4));
            }
            C03O0.LJJJJLL(c03o0, str4, "next", mapHi1, null, strLJJIIZ, Integer.valueOf(i), null, null, null, null, null, null, null, null, bool3, bool4, null, null, null, null, null, null, mapLJIIJJI, false, null, null, null, null, null, Integer.valueOf(i3), null, boolValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -537658128, 8388527);
            new C818503Hr("bottom").LIZIZ();
            return new C7953038t(C03LS.ADDRESS, C2097908Jt.LIZJ(new Pair("address_intercept_sub_reason", "no_address")));
        }
        C013C c013c = new C013C();
        OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LIZ;
        C1077604Ji c1077604Ji = new C1077604Ji(this, c013c, 7);
        BillInfoData billInfoData2 = orderSubmitAssemViewModel3.LLJJI;
        if (billInfoData2 != null && (list = billInfoData2.newShopOrders) != null) {
            int i4 = 0;
            for (ShopOrderNew shopOrderNew2 : list) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    List<MainOrderInfo> list5 = shopOrderNew2.mainOrderInfos;
                    if (list5 != null) {
                        int i6 = 0;
                        for (MainOrderInfo mainOrderInfo2 : list5) {
                            int i7 = i6 + 1;
                            if (i6 >= 0) {
                                MainOrderInfo mainOrderInfo3 = mainOrderInfo2;
                                if (Intrinsics.LJFF(mainOrderInfo3.isPudoLogisticsServiceSelected, Boolean.TRUE) && ((str3 = mainOrderInfo3.selectedPudoId) == null || str3.length() == 0)) {
                                    BillInfoData billInfoData3 = orderSubmitAssemViewModel3.LLJJI;
                                    if (billInfoData3 != null && (list2 = billInfoData3.newShopOrders) != null && (shopOrderNew = (ShopOrderNew) C13LP.LJJJLZIJ(i4, list2)) != null && (list3 = shopOrderNew.mainOrderInfos) != null && (mainOrderInfo = (MainOrderInfo) C13LP.LJJJLZIJ(i6, list3)) != null) {
                                        String str6 = shopOrderNew.sellerId;
                                        BillInfoData billInfoData4 = orderSubmitAssemViewModel3.LLJJI;
                                        if (billInfoData4 != null && (shippingAddress = billInfoData4.shippingAddress) != null && shippingAddress.shippingAddress != null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        Integer num2 = shopOrderNew.productType;
                                        PhoneCredit phoneCredit = shopOrderNew.phoneCredit;
                                        if (billInfoData4 != null && (billInfoSetting = billInfoData4.settings) != null) {
                                            mainOrderSetting = billInfoSetting.mainOrderSetting;
                                        } else {
                                            mainOrderSetting = null;
                                        }
                                        c723002s0LJ = C719002rM.LJ(mainOrderInfo, str6, z, null, num2, phoneCredit, C03CV.GEN_TYPE_DEFAULT, null, mainOrderSetting);
                                        int i8 = mainOrderInfo.LIZ;
                                        if (c723002s0LJ != null) {
                                            c723002s0LJ.LLJJL = i8;
                                        }
                                    } else {
                                        c723002s0LJ = null;
                                    }
                                    c1077604Ji.invoke(Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i6), c723002s0LJ);
                                } else {
                                    i6 = i7;
                                }
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c1077604Ji.invoke(Boolean.TRUE, -1, -1, null);
        } else {
            c1077604Ji.invoke(Boolean.TRUE, -1, -1, null);
        }
        if (!c013c.element) {
            return null;
        }
        C03O0 c03o02 = C03O0.LIZ;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = this.LIZ;
        OspBottomViewModel ospBottomViewModel = this.LIZLLL;
        c03o02.getClass();
        C03O0.LLFZ(str4, orderSubmitAssemViewModel4, str2, ospBottomViewModel, null, false);
        return new C7953038t(C03LS.PUDO);
    }

    @Override // X.C03LX
    public final C03LS LIZIZ(String str, String str2) {
        C7953038t c7953038tLIZ = LIZ(str, str2);
        if (c7953038tLIZ != null) {
            return c7953038tLIZ.LIZ;
        }
        return null;
    }

    public C817903Hl(OrderSubmitAssemViewModel orderSubmitAssemViewModel, View view, OspAddressViewModel ospAddressViewModel, OspBottomViewModel ospBottomViewModel, OspShopViewModel ospShopViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
        this.LIZIZ = view;
        this.LIZJ = ospAddressViewModel;
        this.LIZLLL = ospBottomViewModel;
        this.LJ = ospShopViewModel;
    }
}
