package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.extrafee.PaymentExtraFeeCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;

/* JADX INFO: renamed from: X.02zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C772502zz extends C035N<C731102tJ> implements C030D {
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C731102tJ(0);
    }

    public C772502zz(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.C030D
    public final boolean LJFF(BillInfoData billInfoData) {
        InterfaceC772402zy interfaceC772402zy = (InterfaceC772402zy) this.LIZJ.vr2(InterfaceC772402zy.class);
        if (interfaceC772402zy != null && !interfaceC772402zy.LJJJJZI(billInfoData)) {
            C030V c030v = PaymentExtraFeeCell.LLJI;
            PaymentInfo paymentInfoLJIILIIL = interfaceC772402zy.LJIILIIL();
            c030v.getClass();
            if (C030V.LIZ(paymentInfoLJIILIIL)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
