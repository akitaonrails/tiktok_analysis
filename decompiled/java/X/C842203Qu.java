package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: X.03Qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C842203Qu extends AbstractC840303Qb {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLLLZ;
        boolean z;
        String name;
        InterfaceC841403Qm interfaceC841403Qm = (InterfaceC841403Qm) xBaseParamModel;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IActivityStackDependencyService.class.getName();
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        Activity[] activityStack = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getActivityStack();
        C13LQ.LJJJLIIL(activityStack);
        Iterator it2 = Arrays.asList(activityStack).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Activity activity = (Activity) it2.next();
            if (activity instanceof OrderSubmitActivity) {
                OrderSubmitActivity orderSubmitActivity = (OrderSubmitActivity) activity;
                if (orderSubmitActivity != null && (orderSubmitAssemViewModelLLLZ = orderSubmitActivity.LLLZ()) != null) {
                    C948503nH.LJI(orderSubmitAssemViewModelLLLZ, C23271099x.INSTANCE, new C03QM(interfaceC841403Qm, orderSubmitAssemViewModelLLLZ, completionBlock, this, null));
                    return;
                }
            }
        }
        C2382909Vj.LIZ(completionBlock, 0, "can't find osp viewModel", null, 4);
    }
}
