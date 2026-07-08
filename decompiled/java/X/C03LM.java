package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03LM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03LM extends C1002203vw<OrderSubmitAssemViewModel> implements C03LQ {
    @Override // X.C03LQ
    public final List<C03LX> fC(ECBaseFragment eCBaseFragment, final OspAddressViewModel ospAddressViewModel, final PaymentInfoViewModel paymentInfoViewModel, final OspBottomViewModel ospBottomViewModel, OspShopViewModel ospShopViewModel) {
        final OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ = LIZ();
        final View view = eCBaseFragment.getView();
        final OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ2 = LIZ();
        final OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ3 = LIZ();
        final View view2 = eCBaseFragment.getView();
        final OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ4 = LIZ();
        final View view3 = eCBaseFragment.getView();
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ5 = LIZ();
        final OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ6 = LIZ();
        final OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ7 = LIZ();
        return C1697810uHb.LJIIJJI(new AnonymousClass0390(view, ospBottomViewModel, orderSubmitAssemViewModelLIZ) { // from class: X.038s
            public final OrderSubmitAssemViewModel LIZ;
            public final View LIZIZ;
            public final OspBottomViewModel LIZJ;

            /* JADX WARN: Removed duplicated region for block: B:72:0x010d  */
            @Override // X.AnonymousClass0390
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C7953038t LIZ(java.lang.String r12, java.lang.String r13) {
                /*
                    Method dump skipped, instruction units count: 275
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C7952038s.LIZ(java.lang.String, java.lang.String):X.038t");
            }

            @Override // X.C03LX
            public final C03LS LIZIZ(String str, String str2) {
                C7953038t c7953038tLIZ = LIZ(str, str2);
                if (c7953038tLIZ != null) {
                    return c7953038tLIZ.LIZ;
                }
                return null;
            }

            {
                this.LIZ = orderSubmitAssemViewModelLIZ;
                this.LIZIZ = view;
                this.LIZJ = ospBottomViewModel;
            }
        }, new C03LX(ospBottomViewModel, orderSubmitAssemViewModelLIZ2) { // from class: X.03LR
            public final OrderSubmitAssemViewModel LIZ;
            public final OspBottomViewModel LIZIZ;

            {
                this.LIZ = orderSubmitAssemViewModelLIZ2;
                this.LIZIZ = ospBottomViewModel;
            }

            @Override // X.C03LX
            public final C03LS LIZIZ(String str, String str2) {
                if (!Intrinsics.LJFF(this.LIZ.LLJJIJI, "23005015") && !Intrinsics.LJFF(this.LIZ.LLJJIJI, "23005016") && !Intrinsics.LJFF(this.LIZ.LLJJIJI, "23005006")) {
                    return null;
                }
                OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
                if (orderSubmitAssemViewModel.LLJJIII != null) {
                    orderSubmitAssemViewModel.aT2(1);
                }
                C03O0 c03o0 = C03O0.LIZ;
                OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LIZ;
                OspBottomViewModel ospBottomViewModel2 = this.LIZIZ;
                c03o0.getClass();
                C03O0.LLFZ(str, orderSubmitAssemViewModel2, str2, ospBottomViewModel2, null, false);
                return C03LS.ERROR_CODE;
            }
        }, new AnonymousClass0390(orderSubmitAssemViewModelLIZ3, ospAddressViewModel, view2) { // from class: X.03Hm
            public final OrderSubmitAssemViewModel LIZ;
            public final OspAddressViewModel LIZIZ;
            public final View LIZJ;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1, types: [int] */
            /* JADX WARN: Type inference failed for: r4v7 */
            @Override // X.AnonymousClass0390
            public final C7953038t LIZ(String str, String str2) {
                int i;
                String str3;
                PaymentMethod paymentMethod;
                IdentityInfoOption identityInfoOption;
                Integer type;
                C03JV state = this.LIZ.getState();
                String strLJJIIZ = null;
                if (state.LLILZ || this.LIZ.h.LIZLLL()) {
                    return null;
                }
                if (this.LIZJ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this.LIZJ);
                    c1389890mGx.LJIIIZ(2131833110);
                    c1389890mGx.LJIIJJI();
                }
                OspAddressViewModel.wQ2(this.LIZIZ, this.LIZJ, null, null, this.LIZ, null, null, null, 118);
                C03O0 c03o0 = C03O0.LIZ;
                PaymentInfo paymentInfo = state.LLIZ;
                List<PaymentMethod> listRR2 = this.LIZ.rR2();
                c03o0.getClass();
                Pair pairLJIILLIIL = C03O0.LJIILLIIL(paymentInfo, listRR2);
                PaymentInfo paymentInfo2 = state.LLIZ;
                ?? LJFF = 0;
                if (paymentInfo2 != null && paymentInfo2.LIZJ()) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (C818303Hp.LIZ()) {
                    str3 = "place_order";
                } else {
                    str3 = "add_shipping_address";
                }
                HashMap<String, Object> mapHi1 = this.LIZ.hi1(false);
                mapHi1.put("is_delivery_info_complete_when_place_order", Integer.valueOf(state.LLILZ ? 1 : 0));
                PaymentInfo paymentInfo3 = state.LLIZ;
                if (paymentInfo3 != null) {
                    LJFF = Intrinsics.LJFF(paymentInfo3.isValid, Boolean.TRUE);
                }
                mapHi1.put("is_pay_info_complete_when_place_order", Integer.valueOf((int) LJFF));
                mapHi1.put("is_within_quantity_limit_when_place_order", Integer.valueOf(!Intrinsics.LJFF(state.LLLLLLLZIL, Boolean.FALSE) ? 1 : 0));
                IdentityInfo identityInfo = this.LIZ.LLZLI;
                if (identityInfo != null && (identityInfoOption = identityInfo.getIdentityInfoOption()) != null && (type = identityInfoOption.getType()) != null && type.intValue() == 3) {
                    mapHi1.put("is_cpf_info_complete_when_place_order", C893803eS.LIZ(C770702zh.LIZ(identityInfoOption.getValue())));
                }
                if (C123100dR.LIZ(this.LIZ.LLZLLIL)) {
                    mapHi1.put("original_trigger_page_name", this.LIZ.LLZLLIL);
                }
                Boolean bool = (Boolean) pairLJIILLIIL.getFirst();
                Boolean bool2 = (Boolean) pairLJIILLIIL.getSecond();
                PaymentInfo paymentInfo4 = state.LLIZ;
                if (paymentInfo4 != null && (paymentMethod = paymentInfo4.paymentMethod) != null) {
                    strLJJIIZ = paymentMethod.LJJIIZ();
                }
                C03O0.LJJJJLL(c03o0, str3, "next", mapHi1, null, strLJJIIZ, Integer.valueOf(i), null, null, null, null, null, null, null, null, bool, bool2, null, null, null, null, null, null, this.LIZ.LLLZLZ.LJIIJJI(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -537658128, 8388607);
                new C818503Hr("bottom").LIZIZ();
                return new C7953038t(C03LS.ADDRESS, C2097908Jt.LIZJ(new Pair("address_intercept_sub_reason", "no_address")));
            }

            @Override // X.C03LX
            public final C03LS LIZIZ(String str, String str2) {
                C7953038t c7953038tLIZ = LIZ(str, str2);
                if (c7953038tLIZ != null) {
                    return c7953038tLIZ.LIZ;
                }
                return null;
            }

            {
                this.LIZ = orderSubmitAssemViewModelLIZ3;
                this.LIZIZ = ospAddressViewModel;
                this.LIZJ = view2;
            }
        }, new C03LX(orderSubmitAssemViewModelLIZ4, paymentInfoViewModel, view3, ospBottomViewModel) { // from class: X.03LZ
            public final OrderSubmitAssemViewModel LIZ;
            public final PaymentInfoViewModel LIZIZ;
            public final View LIZJ;
            public final OspBottomViewModel LIZLLL;

            @Override // X.C03LX
            public final C03LS LIZIZ(String str, String str2) {
                boolean z;
                Boolean boolValueOf;
                String str3;
                PaymentInfo paymentInfo;
                PaymentInfo paymentInfo2;
                PaymentInfo paymentInfo3;
                Context context;
                PaymentMethod paymentMethod;
                C03JV state = this.LIZ.getState();
                PaymentInfo paymentInfo4 = state.LLIZ;
                if (paymentInfo4 != null && paymentInfo4.LIZLLL()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (paymentInfo3 = state.LLIZ) != null && Intrinsics.LJFF(paymentInfo3.isValid, Boolean.TRUE)) {
                    PaymentInfoViewModel paymentInfoViewModel2 = this.LIZIZ;
                    View view4 = this.LIZJ;
                    if (view4 != null) {
                        context = view4.getContext();
                    } else {
                        context = null;
                    }
                    PaymentInfo paymentInfo5 = state.LLIZ;
                    if (paymentInfo5 != null) {
                        paymentMethod = paymentInfo5.paymentMethod;
                    } else {
                        paymentMethod = null;
                    }
                    if (!paymentInfoViewModel2.vQ2(context, paymentMethod, this.LIZ)) {
                        return null;
                    }
                    C03O0 c03o0 = C03O0.LIZ;
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
                    OspBottomViewModel ospBottomViewModel2 = this.LIZLLL;
                    c03o0.getClass();
                    C03O0.LLFZ(str, orderSubmitAssemViewModel, str2, ospBottomViewModel2, "add_card", false);
                    return C03LS.PAYMENT_CCDC_DIRECT_CHECKOUT;
                }
                C03O0 c03o02 = C03O0.LIZ;
                OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LIZ;
                OspBottomViewModel ospBottomViewModel3 = this.LIZLLL;
                PaymentInfo paymentInfo6 = state.LLIZ;
                if (paymentInfo6 != null) {
                    boolValueOf = Boolean.valueOf(paymentInfo6.LIZLLL());
                } else {
                    boolValueOf = null;
                }
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(boolValueOf, bool)) {
                    str3 = "need_cvv";
                } else {
                    str3 = "payment_no_selection";
                }
                c03o02.getClass();
                C03O0.LLFZ(str, orderSubmitAssemViewModel2, str2, ospBottomViewModel3, str3, false);
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("ecom_checkout_express_osp_cvv_interaction", false) && (paymentInfo = state.LLIZ) != null && paymentInfo.LIZLLL() && ((paymentInfo2 = state.LLIZ) == null || !Intrinsics.LJFF(paymentInfo2.isValid, bool))) {
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LIZ;
                    orderSubmitAssemViewModel3.getClass();
                    OrderSubmitAssemViewModel.YS2(orderSubmitAssemViewModel3, "payment_methods", null, null, 12);
                    IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
                    if (iEventCenter != null) {
                        iEventCenter.LIZ("ec_payment_element_request_focus", "{}");
                    }
                    return C03LS.PAYMENT_ENTER_CVV;
                }
                if (this.LIZJ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this.LIZJ);
                    c1389890mGx.LJIIIZ(2131833111);
                    c1389890mGx.LJIIJJI();
                    OrderSubmitAssemViewModel.JS2(this.LIZ, this.LIZJ.getContext(), C960603pE.LIZLLL(this.LIZJ), "place_order", null, false, null, false, 240);
                }
                PaymentInfo paymentInfo7 = state.LLIZ;
                if (paymentInfo7 != null && paymentInfo7.LIZLLL()) {
                    return C03LS.PAYMENT_ENTER_CVV;
                }
                return C03LS.PAYMENT_NO_SELECTION;
            }

            {
                this.LIZ = orderSubmitAssemViewModelLIZ4;
                this.LIZIZ = paymentInfoViewModel;
                this.LIZJ = view3;
                this.LIZLLL = ospBottomViewModel;
            }
        }, new C03LT(eCBaseFragment.getView(), ospBottomViewModel, orderSubmitAssemViewModelLIZ5), new C03LX(ospBottomViewModel, orderSubmitAssemViewModelLIZ6) { // from class: X.038w
            public final OrderSubmitAssemViewModel LIZ;
            public final OspBottomViewModel LIZIZ;

            {
                this.LIZ = orderSubmitAssemViewModelLIZ6;
                this.LIZIZ = ospBottomViewModel;
            }

            @Override // X.C03LX
            public final C03LS LIZIZ(String str, String str2) {
                BillInfoData billInfoData;
                List<ShopOrderNew> list;
                if (this.LIZ.getState().LLLLL && (billInfoData = this.LIZ.LLJJI) != null && (list = billInfoData.newShopOrders) != null && !list.isEmpty()) {
                    List<ShopOrderNew> list2 = billInfoData.newShopOrders;
                    if (list2 != null) {
                        Iterator<ShopOrderNew> it2 = list2.iterator();
                        boolean z = false;
                        while (it2.hasNext()) {
                            List<MainOrderInfo> list3 = it2.next().mainOrderInfos;
                            if (list3 != null) {
                                Iterator<MainOrderInfo> it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    List<PackedSku> list4 = it3.next().packedSkus;
                                    if (list4 != null) {
                                        Iterator<PackedSku> it4 = list4.iterator();
                                        while (it4.hasNext()) {
                                            String str3 = it4.next().skuId;
                                            if (str3 == null || str3.length() == 0) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (!z) {
                            return null;
                        }
                    } else {
                        return null;
                    }
                }
                C03O0 c03o0 = C03O0.LIZ;
                OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
                OspBottomViewModel ospBottomViewModel2 = this.LIZIZ;
                c03o0.getClass();
                C03O0.LLFZ(str, orderSubmitAssemViewModel, str2, ospBottomViewModel2, null, false);
                return C03LS.AVAILABLE_ORDERS;
            }
        }, new C03IS(ospBottomViewModel, LIZ()), new C03LX(ospBottomViewModel, orderSubmitAssemViewModelLIZ7) { // from class: X.03LO
            public final OrderSubmitAssemViewModel LIZ;
            public final OspBottomViewModel LIZIZ;

            {
                this.LIZ = orderSubmitAssemViewModelLIZ7;
                this.LIZIZ = ospBottomViewModel;
            }

            @Override // X.C03LX
            public final C03LS LIZIZ(String str, String str2) {
                C828603Lo c828603Lo = this.LIZ.h;
                if (c828603Lo != null && !c828603Lo.LJI()) {
                    IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
                    if (iEventCenter != null) {
                        iEventCenter.LIZ("ec_virtual_info_open", C1741890vQh.LJIIIIZZ(new C799103Af(c828603Lo.LJ())));
                    }
                    C03O0 c03o0 = C03O0.LIZ;
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
                    OspBottomViewModel ospBottomViewModel2 = this.LIZIZ;
                    c03o0.getClass();
                    C03O0.LLFZ(str, orderSubmitAssemViewModel, str2, ospBottomViewModel2, null, false);
                    return C03LS.VIRTUAL_PRODUCT;
                }
                return null;
            }
        });
    }
}
