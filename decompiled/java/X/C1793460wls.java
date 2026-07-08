package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS155S0400000_27;

/* JADX INFO: renamed from: X.0wls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793460wls extends AbstractC1793480wlu {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS155S0400000_27((IInteractService) C1161920gLG.LIZJ(IInteractService.class), (IInteractService) context, (Context) this, (C1793460wls) completionBlock, (CompletionBlock<InterfaceC1793490wlv>) 9));
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
        }
    }
}
