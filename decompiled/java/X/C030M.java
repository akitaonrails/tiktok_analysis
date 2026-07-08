package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;

/* JADX INFO: renamed from: X.030M, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C030M extends C035N<C730902tH> implements C030N {
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C730902tH(0);
    }

    public C030M(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.C030N
    public final ExtraFeeStatement LJJLJLI(BillInfoData billInfoData) {
        String str;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        InterfaceC772402zy interfaceC772402zy = (InterfaceC772402zy) this.LIZJ.vr2(InterfaceC772402zy.class);
        if (interfaceC772402zy == null) {
            return null;
        }
        PaymentInfo paymentInfoLJIILIIL = interfaceC772402zy.LJIILIIL();
        if (interfaceC772402zy.LJJJJZI(billInfoData)) {
            return null;
        }
        C03SY c03sy = C03SY.LIZ;
        if (paymentInfoLJIILIIL != null && (paymentMethod2 = paymentInfoLJIILIIL.paymentMethod) != null) {
            str = paymentMethod2.id;
        } else {
            str = null;
        }
        c03sy.getClass();
        if (!C03SY.LJIJ(str) || paymentInfoLJIILIIL == null || (paymentMethod = paymentInfoLJIILIIL.paymentMethod) == null) {
            return null;
        }
        return paymentMethod.extraFeeStatement;
    }
}
