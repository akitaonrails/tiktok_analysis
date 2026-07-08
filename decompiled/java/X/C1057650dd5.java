package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057650dd5 extends AbstractC1057670dd7 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Context context;
        boolean z;
        InterfaceC1057660dd6 interfaceC1057660dd6 = (InterfaceC1057660dd6) xBaseParamModel;
        C1044770dIJ c1044770dIJ = new C1044770dIJ(interfaceC1057660dd6.getItemId(), interfaceC1057660dd6.getCreativeId(), interfaceC1057660dd6.getGroupId(), interfaceC1057660dd6.getCid(), interfaceC1057660dd6.getReqId(), interfaceC1057660dd6.getRit(), interfaceC1057660dd6.getLogExtra(), interfaceC1057660dd6.getExtraParams(), interfaceC1057660dd6.getEnterFrom());
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 == null || (context = interfaceC634840OvC2.LIZLLL()) == null) {
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                context = interfaceC634840OvC3.getContext();
            } else {
                context = null;
            }
        }
        if (containerID != null && !a0.LJJJIL(containerID)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && context != null) {
            IShoppingTaskHostService iShoppingTaskHostService = (IShoppingTaskHostService) PluggableExtentionKt.pluggableSpi$default(IShoppingTaskHostService.class, false, false, false, 14, null);
            if (iShoppingTaskHostService == null) {
                C2382909Vj.LIZ(completionBlock, -1, "report_open_failed", null, 4);
                return;
            } else {
                if (iShoppingTaskHostService.LIZ(context, containerID, c1044770dIJ, new AwS417S0200000_16(completionBlock, (CompletionBlock<InterfaceC1057680dd8>) this, (C1057650dd5) 43))) {
                    return;
                }
                C2382909Vj.LIZ(completionBlock, -1, "report_open_failed", null, 4);
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -1, "invalid_context", null, 4);
    }
}
