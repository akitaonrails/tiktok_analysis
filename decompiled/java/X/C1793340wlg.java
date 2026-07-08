package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.touchpoint.api.service.IIncentiveAdService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0wlg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793340wlg extends AbstractC1793330wlf {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1793320wle interfaceC1793320wle = (InterfaceC1793320wle) xBaseParamModel;
        IIncentiveAdService iIncentiveAdService = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null);
        if (iIncentiveAdService != null) {
            iIncentiveAdService.LJIIL(interfaceC1793320wle.getParams());
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1793350wlh.class, null), "");
    }
}
