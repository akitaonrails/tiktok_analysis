package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopRequestParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.034r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7847034r extends C1002203vw<OrderSubmitAssemViewModel> implements InterfaceC7850034u {
    @Override // X.InterfaceC7850034u
    public final boolean wa0() {
        return false;
    }

    @Override // X.InterfaceC7850034u
    public final void Gv2() {
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ = LIZ();
        orderSubmitAssemViewModelLIZ.getClass();
        orderSubmitAssemViewModelLIZ.setState(AFwS228S0000000_1.get$arr$(458));
    }

    @Override // X.InterfaceC7850034u
    public final List<OrderShopRequestParam> lO1(C03JV c03jv) {
        return LIZ().lO1(c03jv);
    }

    @Override // X.InterfaceC7850034u
    public final void je2(Context context, C03NB c03nb, Throwable th, long j, String str, Integer num) {
        C7872035q c7872035q = C7872035q.LIZ;
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ = LIZ();
        c7872035q.getClass();
        C7872035q.LIZJ(context, c03nb, th, j, str, num, orderSubmitAssemViewModelLIZ);
    }
}
