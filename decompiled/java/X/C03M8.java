package X;

import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS56S0210000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03M8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03M8 extends C1002203vw<OspBottomViewModel> implements C03MH {
    public final Context LLILLJJLI;

    public C03M8() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        this.LLILLJJLI = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    public final void LIZJ(C03JV c03jv) {
        boolean z;
        int iIntValue;
        C259800zU c259800zU = new C259800zU();
        if (!Intrinsics.LJFF(c03jv.LLIZLLLIL, Boolean.TRUE) && !LIZ().LLILZIL) {
            z = false;
        } else {
            z = true;
        }
        Integer num = c03jv.LLJILLL;
        if (num != null && (iIntValue = num.intValue()) > 0) {
            c259800zU.element = LIZ().wQ2(iIntValue).toString();
        }
        LIZ().setState(new AwS56S0210000_1(z, c03jv, c259800zU, 15));
    }

    @Override // X.C03MH
    public final void wZ1(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        orderSubmitAssemViewModel.withState(new AwS367S0200000_1(this, orderSubmitAssemViewModel, 321));
    }

    @Override // X.C03MH
    public final void zx1(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        if (orderSubmitAssemViewModel != null) {
            orderSubmitAssemViewModel.withState(new AwS367S0200000_1(this, orderSubmitAssemViewModel, 320));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C03JV r20, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r21) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03M8.LIZIZ(X.03JV, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel):void");
    }
}
