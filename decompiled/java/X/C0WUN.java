package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0WUN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WUN extends C0WUO {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            C0VIN.LIZ(context, "bonus_widget_refresh_immediate", 0L, C0VI0.KEEP);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0WUQ.class, containerID), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
    }
}
