package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.sec.SecDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.sec.ISecDependencyService;

/* JADX INFO: renamed from: X.05o3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1462905o3 extends AbstractC1464405oI {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iIntValue;
        Activity activityLIZLLL;
        AnonymousClass0317 anonymousClass0317CreateISecDependencyServicebyMonsterPlugin;
        Integer num;
        Number verifyCode = ((InterfaceC1463605oA) xBaseParamModel).getVerifyCode();
        String name = null;
        if ((verifyCode instanceof Integer) && (num = (Integer) verifyCode) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateISecDependencyServicebyMonsterPlugin = SecDependencyService.createISecDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateISecDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = ISecDependencyService.class.getName();
                if (anonymousClass0317CreateISecDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateISecDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateISecDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISecDependencyService.class);
            }
            ((ISecDependencyService) anonymousClass0317CreateISecDependencyServicebyMonsterPlugin).popCaptcha(activityLIZLLL, iIntValue, new C854103Vj() { // from class: X.05o6
                @Override // X.C854103Vj
                public final void LIZ(boolean z2) {
                    CompletionBlock<InterfaceC1463705oB> completionBlock2 = completionBlock;
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1463705oB.class, null);
                    ((InterfaceC1463705oB) xBaseModelLIZJ).setResult(Boolean.valueOf(z2));
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                }
            });
        }
    }
}
