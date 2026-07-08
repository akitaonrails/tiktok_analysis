package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.touchpoint.api.service.IIncentiveAdService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0zbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902610zbv extends AbstractC1902620zbw {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String strLIZIZ;
        int iIntValue;
        InterfaceC1902630zbx interfaceC1902630zbx = (InterfaceC1902630zbx) xBaseParamModel;
        IIncentiveAdService iIncentiveAdService = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null);
        if (iIncentiveAdService != null) {
            String taskId = interfaceC1902630zbx.getTaskId();
            int iIntValue2 = interfaceC1902630zbx.getCompletedTimes().intValue();
            Number engagementType = interfaceC1902630zbx.getEngagementType();
            if (engagementType != null) {
                iIntValue = engagementType.intValue();
            } else {
                iIntValue = 1;
            }
            strLIZIZ = iIncentiveAdService.LIZIZ(iIntValue2, iIntValue, taskId);
        } else {
            strLIZIZ = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1902640zby.class, null);
        ((InterfaceC1902640zby) xBaseModelLIZJ).setReqId(strLIZIZ);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
