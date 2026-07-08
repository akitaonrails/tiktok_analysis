package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;

/* JADX INFO: renamed from: X.03tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C987803tc {
    public static final BizIdentity LIZ(Integer num, String str) {
        String strLIZIZ = C955103oL.LIZIZ(num);
        int iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(num), "order_submit", null, null, 12);
        EnumC969503qf.Companion.getClass();
        C987903td c987903tdLIZIZ = C969603qg.LIZIZ(iLJIIJJI, "order_submit", strLIZIZ);
        return new BizIdentity(str, c987903tdLIZIZ.LIZ, c987903tdLIZIZ.LIZIZ);
    }

    public static final <T extends InterfaceC1025703zj<OrderSubmitAssemViewModel>> T LIZIZ(OrderSubmitAssemViewModel orderSubmitAssemViewModel, Class<T> cls) {
        return (T) C1025503zh.LIZ(cls, orderSubmitAssemViewModel.o, orderSubmitAssemViewModel);
    }
}
