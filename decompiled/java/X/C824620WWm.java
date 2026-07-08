package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0WWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824620WWm extends AbstractC824630WWn {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws Throwable {
        Activity activityLIZLLL;
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        InterfaceC824640WWo interfaceC824640WWo = (InterfaceC824640WWo) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            String url = interfaceC824640WWo.getUrl();
            String packageName = interfaceC824640WWo.getPackageName();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (C743880TFy.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplicationContext(), packageName)) {
                try {
                    C0WWG c0wwg = new C0WWG();
                    c0wwg.LIZ().LIZ.setPackage(packageName);
                    c0wwg.LIZ().LIZ(activityLIZLLL, UriProtector.parse(url));
                    completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC824650WWp.class)), "");
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2382909Vj.LIZ(completionBlock, -1, e.toString(), null, 4);
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, -1, "app not installed", null, 4);
        }
    }
}
