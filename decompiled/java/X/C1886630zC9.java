package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS369S0200000_3;

/* JADX INFO: renamed from: X.0zC9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886630zC9 extends AbstractC1515000pWk {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(827));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(826));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        final Activity activityLIZLLL;
        InterfaceC1515010pWl interfaceC1515010pWl = (InterfaceC1515010pWl) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            if (!interfaceC1515010pWl.isPasskeyCreated() && ((ICredentialManagerService) this.LLILLL.getValue()).LJIILL()) {
                ((ICredentialManagerService) this.LLILLL.getValue()).LJ(activityLIZLLL, new AwS369S0200000_3(this, activityLIZLLL, 28));
                return;
            }
            IBindService iBindService = (IBindService) this.LLILZ.getValue();
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_skip_right", true);
            iBindService.bindMobileOrEmail(activityLIZLLL, "find_account", "click", bundle, true, new C0XTR() { // from class: X.09pz
                @Override // X.C0XTR
                public final void onResult(int i, int i2, Object obj) {
                    C1886630zC9 c1886630zC9 = this.LIZ;
                    Activity activity = activityLIZLLL;
                    c1886630zC9.getClass();
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "aweme://main");
                    smartRouteBuildRoute.addFlags(67108864);
                    smartRouteBuildRoute.addFlags(268435456);
                    smartRouteBuildRoute.open();
                }
            });
        }
    }
}
