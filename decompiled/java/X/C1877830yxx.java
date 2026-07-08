package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877830yxx extends AbstractC1877810yxv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String taskKey;
        ITouchPointModuleService iTouchPointModuleService;
        InterfaceC1877820yxw interfaceC1877820yxw = (InterfaceC1877820yxw) xBaseParamModel;
        String status = interfaceC1877820yxw.getStatus();
        if (Intrinsics.LJFF(status, "start")) {
            ITouchPointModuleService iTouchPointModuleService2 = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
            if (iTouchPointModuleService2 != null) {
                iTouchPointModuleService2.LJIJ(interfaceC1877820yxw.getEventKey());
            }
        } else if (Intrinsics.LJFF(status, "claim") && (taskKey = interfaceC1877820yxw.getTaskKey()) != null && (iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null)) != null) {
            iTouchPointModuleService.LJIILL(taskKey);
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1877840yxy.class, null), "");
    }
}
