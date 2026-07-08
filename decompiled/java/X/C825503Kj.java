package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.ActivityUserSelection;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponUpdateInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS86S1200000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$onEvent$4", f = "OrderSubmitAssemViewModel.kt", l = {}, m = "invokeSuspend")
public final class C825503Kj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OrderSubmitAssemViewModel LL;
    public final /* synthetic */ CouponClaimedEvent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C825503Kj(OrderSubmitAssemViewModel orderSubmitAssemViewModel, CouponClaimedEvent couponClaimedEvent, InterfaceC1364105Vn<? super C825503Kj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = orderSubmitAssemViewModel;
        this.LLILLJJLI = couponClaimedEvent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C825503Kj(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        boolean zBooleanValue;
        Boolean bool;
        Boolean bool2;
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.onEvent$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C037J c037j = this.LL.LLLJL;
        CouponClaimedEvent couponClaimedEvent = this.LLILLJJLI;
        c037j.getClass();
        List<VoucherInfoNew> list = couponClaimedEvent.voucherIds;
        if (list != null && (num = couponClaimedEvent.voucherType) != null) {
            int iIntValue = num.intValue();
            ActivityUserSelection activityUserSelection = couponClaimedEvent.activityUserSelection;
            CouponUpdateInfo couponUpdateInfo = couponClaimedEvent.couponUpdateInfo;
            boolean zBooleanValue2 = false;
            if (couponUpdateInfo != null && (bool2 = couponUpdateInfo.voucherChanged) != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = false;
            }
            CouponUpdateInfo couponUpdateInfo2 = couponClaimedEvent.couponUpdateInfo;
            if (couponUpdateInfo2 != null && (bool = couponUpdateInfo2.activityChanged) != null) {
                zBooleanValue2 = bool.booleanValue();
            }
            if (zBooleanValue2) {
                c037j.LJFF = true;
                c037j.LJI = activityUserSelection;
            }
            if (zBooleanValue) {
                c037j.LIZLLL = true;
                c037j.LIZ.setState(AFwS228S0000000_1.get$arr$(864));
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        if (iIntValue != 3) {
                            c037j.LJ = null;
                        } else {
                            String str = c037j.LJ;
                            if (str != null) {
                                C037K.LIZ(new AwS115S1100000_1(str, (String) list, (List<VoucherInfoNew>) 52), c037j.LJIIIIZZ);
                            }
                            C037K.LIZ(new AwS367S0200000_1((List) list, (List<VoucherInfoNew>) c037j, (C037J) 353), c037j.LJII);
                        }
                    } else {
                        String str2 = c037j.LJ;
                        if (str2 != null) {
                            C037K.LIZ(new AwS86S1200000_1(str2, (String) list, (List<VoucherInfoNew>) c037j, (C037J) 46), c037j.LJIIIIZZ);
                        }
                    }
                } else {
                    C037K.LIZ(new AwS367S0200000_1((List) list, (List<VoucherInfoNew>) c037j, (C037J) 351), c037j.LJII);
                }
            } else if (zBooleanValue2) {
                OrderSubmitAssemViewModel.OS2(c037j.LIZ, false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.SELECT_VOUCHER.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
            }
            c037j.LJ = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.onEvent$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
