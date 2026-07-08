package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.touchpoint.api.service.IIncentiveAdService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;

/* JADX INFO: renamed from: X.0dqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065840dqI extends AbstractC1065820dqG {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iIntValue;
        int iIntValue2;
        Context context;
        IIncentiveAdService iIncentiveAdService;
        InterfaceC1065830dqH interfaceC1065830dqH = (InterfaceC1065830dqH) xBaseParamModel;
        Number duration = interfaceC1065830dqH.getDuration();
        if (duration != null) {
            iIntValue = duration.intValue();
        } else {
            iIntValue = 20;
        }
        Number rewards = interfaceC1065830dqH.getRewards();
        if (rewards != null) {
            iIntValue2 = rewards.intValue();
        } else {
            iIntValue2 = 0;
        }
        String enterFrom = interfaceC1065830dqH.getEnterFrom();
        String pageEnterFrom = interfaceC1065830dqH.getPageEnterFrom();
        String commonParams = interfaceC1065830dqH.getCommonParams();
        String extraParams = interfaceC1065830dqH.getExtraParams();
        String logExtra = interfaceC1065830dqH.getLogExtra();
        String taskEventKey = interfaceC1065830dqH.getTaskEventKey();
        List<String> prefetchParams = interfaceC1065830dqH.getPrefetchParams();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && taskEventKey != null && taskEventKey.length() != 0 && (iIncentiveAdService = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null)) != null) {
            iIncentiveAdService.LIZJ(context, iIntValue, iIntValue2, enterFrom, pageEnterFrom, commonParams, extraParams, prefetchParams, logExtra, taskEventKey);
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC747930TVn.class, null);
        ((InterfaceC747930TVn) xBaseModelLIZJ).setCode(1);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
