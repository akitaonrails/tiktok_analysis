package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostJsbViewerWishesInterceptSetting;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS279S0300000_35;

/* JADX INFO: renamed from: X.1E9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276701E9k extends AbstractC2276721E9m {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC2276711E9l interfaceC2276711E9l = (InterfaceC2276711E9l) xBaseParamModel;
        String actionType = interfaceC2276711E9l.getActionType();
        interfaceC2276711E9l.getScene();
        C914350Ztx c914350Ztx = new C914350Ztx(actionType, interfaceC2276711E9l.getAutoMatchScene(), interfaceC2276711E9l.getAutoMatchEntrance(), interfaceC2276711E9l.getPoolID(), interfaceC2276711E9l.getExtra());
        C2276781E9s c2276781E9s = new C2276781E9s(this, completionBlock);
        if (!CohostJsbViewerWishesInterceptSetting.enabled()) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nm0(c914350Ztx, c2276781E9s);
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS279S0300000_35(this, c2276781E9s, c914350Ztx, 5));
        }
    }
}
