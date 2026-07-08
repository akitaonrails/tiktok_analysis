package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.jvm.internal.AwS16S0010000_1;

/* JADX INFO: renamed from: X.038v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7955038v implements C03LX {
    public final OrderSubmitAssemViewModel LIZ;
    public final OspBottomViewModel LIZIZ;

    public C7955038v(OspBottomViewModel ospBottomViewModel, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
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
            OspBottomViewModel ospBottomViewModel = this.LIZIZ;
            c03o0.getClass();
            C03O0.LLFZ(str, orderSubmitAssemViewModel2, str2, ospBottomViewModel, null, false);
            Integer num2 = this.LIZ.getState().LLLIIIIL;
            if (num2 != null && num2.intValue() == 1) {
                return C03LS.PHONE;
            }
            return null;
        }
        return null;
    }
}
