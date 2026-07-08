package X;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.rich.reward.saas.openad.IRewardAdSaasOpenService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d0S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033700d0S extends AbstractC1033710d0T {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        Object objValueOf;
        try {
            C012O c012oLIZ = C118700cj.LIZ((InterfaceC1033720d0U) xBaseParamModel);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                IRewardAdSaasOpenService iRewardAdSaasOpenService = (IRewardAdSaasOpenService) PluggableExtentionKt.pluggableSpi$default(IRewardAdSaasOpenService.class, false, false, false, 14, null);
                if (iRewardAdSaasOpenService == null) {
                    C2382909Vj.LIZ(completionBlock, 0, "IRewardAdSaasOpenService is null", null, 4);
                    return;
                }
                IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
                if (iAppContextService == null) {
                    objValueOf = "";
                } else {
                    objValueOf = Integer.valueOf(iAppContextService.getAppId());
                }
                objValueOf.toString();
                AbstractC1033670d0P abstractC1033670d0PLIZ = iRewardAdSaasOpenService.LIZ(new C1033650d0N(new C1031810cxP(600, false, false, context, 224), c012oLIZ.LIZ, c012oLIZ.LIZIZ, c012oLIZ.LIZJ, c012oLIZ.LIZLLL));
                if (Intrinsics.LJFF(abstractC1033670d0PLIZ, C1033690d0R.LIZ)) {
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1033740d0W.class, null), "");
                    return;
                } else {
                    if (abstractC1033670d0PLIZ instanceof C1033680d0Q) {
                        C2382909Vj.LIZ(completionBlock, 0, ((C1033680d0Q) abstractC1033670d0PLIZ).LIZ, null, 4);
                        return;
                    }
                    throw new C1954807lC();
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "invalid reward ad params";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
