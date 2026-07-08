package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0wlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793110wlJ extends AbstractC1793080wlG {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1793120wlK interfaceC1793120wlK = (InterfaceC1793120wlK) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
            return;
        }
        try {
            if (context instanceof C19EG) {
                IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) PluggableExtentionKt.pluggableSpi$default(IGamePartnershipService.class, false, false, false, 14, null);
                if (iGamePartnershipService != null) {
                    iGamePartnershipService.r11(context, interfaceC1793120wlK.getUrl(), interfaceC1793120wlK.getTitle(), interfaceC1793120wlK.getDesc());
                    completionBlock.onSuccess((InterfaceC1793090wlH) C1909107dp.LIZJ(InterfaceC1793090wlH.class, null), "");
                    return;
                } else {
                    C2382909Vj.LIZ(completionBlock, -2, null, null, 6);
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, -2, null, null, 6);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, -3, null, null, 6);
        }
    }
}
