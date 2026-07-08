package X;

import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.03M4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03M4 extends C1002203vw<OspBottomViewModel> implements C03MH {
    public final Context LLILLJJLI;

    public C03M4() {
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

    @Override // X.C03MH
    public final void wZ1(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        orderSubmitAssemViewModel.withState(new AwS367S0200000_1(this, orderSubmitAssemViewModel, 324));
    }

    @Override // X.C03MH
    public final void zx1(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        if (orderSubmitAssemViewModel != null) {
            orderSubmitAssemViewModel.withState(new AwS367S0200000_1(this, orderSubmitAssemViewModel, 323));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C03JV r18, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r19) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03M4.LIZIZ(X.03JV, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel):void");
    }
}
