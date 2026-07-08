package X;

import Y.ARunnableS101S0100000_1;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03LN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03LN extends C1002203vw<OrderSubmitAssemViewModel> implements C03LQ {
    @Override // X.C03LQ
    public final List<C03LX> fC(ECBaseFragment eCBaseFragment, final OspAddressViewModel ospAddressViewModel, final PaymentInfoViewModel paymentInfoViewModel, final OspBottomViewModel ospBottomViewModel, OspShopViewModel ospShopViewModel) {
        final OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ = LIZ();
        final View view = eCBaseFragment.getView();
        final OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ2 = LIZ();
        final View view2 = eCBaseFragment.getView();
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ3 = LIZ();
        final OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ4 = LIZ();
        final OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ5 = LIZ();
        final View view3 = eCBaseFragment.getView();
        return C1697810uHb.LJIIJJI(new AnonymousClass0390(view, ospBottomViewModel, ospAddressViewModel, orderSubmitAssemViewModelLIZ) { // from class: X.03Hn
            public final OrderSubmitAssemViewModel LIZ;
            public final OspAddressViewModel LIZIZ;
            public final View LIZJ;
            public final OspBottomViewModel LIZLLL;

            @Override // X.AnonymousClass0390
            public final C7953038t LIZ(String str, String str2) {
                AnonymousClass0376 anonymousClass0376;
                C03JV state = this.LIZ.getState();
                Boolean bool = state.LLIZLLLIL;
                Boolean bool2 = Boolean.TRUE;
                String str3 = "invalid_address";
                if (!Intrinsics.LJFF(bool, bool2)) {
                    return new C7953038t(C03LS.ADDRESS, C2097908Jt.LIZJ(new Pair("address_intercept_sub_reason", "invalid_address")));
                }
                if (C818203Ho.LIZ()) {
                    boolean z = true;
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_strengthen_checkout_process", true) == 0) {
                        z = false;
                    }
                    if (z && !state.LLILZ && this.LIZ.h.LIZJ()) {
                        this.LIZ.hT2(false);
                        OspAddressViewModel.wQ2(this.LIZIZ, this.LIZJ, null, null, this.LIZ, null, null, Boolean.valueOf(C03IF.LIZ()), 54);
                        C03O0 c03o0 = C03O0.LIZ;
                        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
                        OspBottomViewModel ospBottomViewModel2 = this.LIZLLL;
                        c03o0.getClass();
                        C03O0.LLFZ(str, orderSubmitAssemViewModel, str2, ospBottomViewModel2, null, false);
                        return new C7953038t(C03LS.ADDRESS, C2097908Jt.LIZJ(new Pair("address_intercept_sub_reason", "no_address")));
                    }
                    if ((!state.LLILZ || (anonymousClass0376 = state.LLILZIL) == null || !Intrinsics.LJFF(anonymousClass0376.LLJJIII, bool2)) && this.LIZ.h.LIZJ()) {
                        OrderSubmitAssemViewModel.oT2(this.LIZ, "shipping_address", false);
                        C03O0 c03o02 = C03O0.LIZ;
                        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LIZ;
                        OspBottomViewModel ospBottomViewModel3 = this.LIZLLL;
                        c03o02.getClass();
                        C03O0.LLFZ(str, orderSubmitAssemViewModel2, str2, ospBottomViewModel3, null, false);
                        C03LS c03ls = C03LS.ADDRESS;
                        if (!state.LLILZ) {
                            str3 = "no_address";
                        }
                        return new C7953038t(c03ls, C2097908Jt.LIZJ(new Pair("address_intercept_sub_reason", str3)));
                    }
                    return null;
                }
                return null;
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
                this.LIZIZ = ospAddressViewModel;
                this.LIZJ = view;
                this.LIZLLL = ospBottomViewModel;
            }
        }, new C03LX(orderSubmitAssemViewModelLIZ2, paymentInfoViewModel, view2, ospBottomViewModel) { // from class: X.03Nq
            public final OrderSubmitAssemViewModel LIZ;
            public final PaymentInfoViewModel LIZIZ;
            public final View LIZJ;
            public final OspBottomViewModel LIZLLL;

            /* JADX WARN: Code restructure failed: missing block: B:146:0x01fa, code lost:
            
                if (r3.get(r2) == null) goto L147;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C03LX
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C03LS LIZIZ(java.lang.String r24, java.lang.String r25) {
                /*
                    Method dump skipped, instruction units count: 691
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C834003Nq.LIZIZ(java.lang.String, java.lang.String):X.03LS");
            }

            {
                this.LIZ = orderSubmitAssemViewModelLIZ2;
                this.LIZIZ = paymentInfoViewModel;
                this.LIZJ = view2;
                this.LIZLLL = ospBottomViewModel;
            }
        }, new C03LT(eCBaseFragment.getView(), ospBottomViewModel, orderSubmitAssemViewModelLIZ3), new C03LX(ospBottomViewModel, orderSubmitAssemViewModelLIZ4) { // from class: X.038u
            public final OrderSubmitAssemViewModel LIZ;
            public final OspBottomViewModel LIZIZ;

            {
                this.LIZ = orderSubmitAssemViewModelLIZ4;
                this.LIZIZ = ospBottomViewModel;
            }

            @Override // X.C03LX
            public final C03LS LIZIZ(String str, String str2) {
                Integer num = this.LIZ.LLLLIILLL;
                if (num != null && num.intValue() == 1) {
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
                    orderSubmitAssemViewModel.getClass();
                    orderSubmitAssemViewModel.setState(new AwS16S0010000_1(true, 26));
                    C03O0 c03o0 = C03O0.LIZ;
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LIZ;
                    OspBottomViewModel ospBottomViewModel2 = this.LIZIZ;
                    c03o0.getClass();
                    C03O0.LLFZ(str, orderSubmitAssemViewModel2, str2, ospBottomViewModel2, null, false);
                    Integer num2 = this.LIZ.getState().LLLIIIIL;
                    if (num2 != null && num2.intValue() == 1) {
                        return C03LS.PHONE;
                    }
                    return null;
                }
                return null;
            }
        }, new C03LX(view3, ospBottomViewModel, orderSubmitAssemViewModelLIZ5) { // from class: X.03LP
            public final OrderSubmitAssemViewModel LIZ;
            public final OspBottomViewModel LIZIZ;
            public final View LIZJ;

            @Override // X.C03LX
            public final C03LS LIZIZ(String str, String str2) {
                C828603Lo c828603Lo = this.LIZ.h;
                if (c828603Lo == null || c828603Lo.LJI()) {
                    return null;
                }
                if (c828603Lo.LIZIZ == 2) {
                    IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
                    if (iEventCenter != null) {
                        iEventCenter.LIZ("ec_virtual_info_open", C1741890vQh.LJIIIIZZ(new C799103Af(c828603Lo.LJ())));
                    }
                } else {
                    OrderSubmitAssemViewModel.YS2(this.LIZ, "virtual_product_cell", null, null, 12);
                    View view4 = this.LIZJ;
                    if (view4 != null) {
                        HandlerHook.viewPostDelay(view4, new ARunnableS101S0100000_1(c828603Lo, 109), 300L);
                    }
                }
                C03O0 c03o0 = C03O0.LIZ;
                OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
                OspBottomViewModel ospBottomViewModel2 = this.LIZIZ;
                c03o0.getClass();
                C03O0.LLFZ(str, orderSubmitAssemViewModel, str2, ospBottomViewModel2, null, false);
                return C03LS.VIRTUAL_PRODUCT;
            }

            {
                this.LIZ = orderSubmitAssemViewModelLIZ5;
                this.LIZIZ = ospBottomViewModel;
                this.LIZJ = view3;
            }
        }, new C03LY(eCBaseFragment.getView(), ospBottomViewModel, LIZ()), new C03IA(LIZ(), eCBaseFragment));
    }
}
