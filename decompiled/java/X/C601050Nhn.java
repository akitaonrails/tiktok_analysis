package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0Nhn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C601050Nhn extends AbstractC601020Nhk {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
        if (iTouchPointModuleService != null) {
            iTouchPointModuleService.LJI();
        }
    }
}
