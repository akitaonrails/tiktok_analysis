package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.034o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C7844034o extends C1002203vw<OrderSubmitAssemViewModel> implements InterfaceC7850034u {
    @Override // X.InterfaceC7850034u
    public final void Gv2() {
        PaymentMethodInfo paymentMethodInfo;
        PaymentInfo paymentInfo = LIZ().LLJJJ;
        if (C03PU.LIZIZ((paymentInfo == null || (paymentMethodInfo = paymentInfo.paymentMethodInfo) == null) ? null : paymentMethodInfo.id)) {
            return;
        }
        if (C7845034p.LIZ()) {
            LIZ().r.LIZJ = true;
            return;
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ = LIZ();
        orderSubmitAssemViewModelLIZ.getClass();
        orderSubmitAssemViewModelLIZ.setState(AFwS228S0000000_1.get$arr$(458));
    }

    @Override // X.InterfaceC7850034u
    public final boolean wa0() {
        return C7845034p.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x038c  */
    @Override // X.InterfaceC7850034u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopRequestParam> lO1(X.C03JV r60) {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7844034o.lO1(X.03JV):java.util.List");
    }

    @Override // X.InterfaceC7850034u
    public void je2(Context context, C03NB c03nb, Throwable th, long j, String str, Integer num) {
        C7872035q c7872035q = C7872035q.LIZ;
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ = LIZ();
        c7872035q.getClass();
        C7872035q.LIZJ(context, c03nb, th, j, str, num, orderSubmitAssemViewModelLIZ);
    }
}
