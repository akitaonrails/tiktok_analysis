package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.touchpoint.api.service.IIncentiveAdService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0yri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873960yri extends AbstractC1873940yrg {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        boolean zLJ;
        InterfaceC1873970yrj interfaceC1873970yrj = (InterfaceC1873970yrj) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        HashMap mapLIZIZ = C13054058y.LIZIZ(interfaceC1873970yrj.getCommonParams());
        if (context != null) {
            IIncentiveAdService iIncentiveAdService = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null);
            if (iIncentiveAdService != null) {
                zLJ = iIncentiveAdService.LJ(mapLIZIZ);
            } else {
                zLJ = false;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1873950yrh.class, null);
            ((InterfaceC1873950yrh) xBaseModelLIZJ).setResult(Boolean.valueOf(zLJ));
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        }
    }
}
