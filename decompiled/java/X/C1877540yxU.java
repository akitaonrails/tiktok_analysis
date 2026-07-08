package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0yxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877540yxU extends AbstractC1877520yxS {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        int iIntValue;
        int iIntValue2;
        boolean zBooleanValue3;
        ITouchPointModuleService iTouchPointModuleService;
        InterfaceC1877530yxT interfaceC1877530yxT = (InterfaceC1877530yxT) xBaseParamModel;
        interfaceC1877530yxT.getTime();
        Boolean start = interfaceC1877530yxT.getStart();
        if (start != null) {
            zBooleanValue = start.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean showBubble = interfaceC1877530yxT.getShowBubble();
        if (showBubble != null) {
            zBooleanValue2 = showBubble.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        Number type = interfaceC1877530yxT.getType();
        if (type != null) {
            iIntValue = type.intValue();
        } else {
            iIntValue = 0;
        }
        Number taskTime = interfaceC1877530yxT.getTaskTime();
        if (taskTime != null) {
            iIntValue2 = taskTime.intValue();
        } else {
            iIntValue2 = 0;
        }
        String taskId = interfaceC1877530yxT.getTaskId();
        if (taskId == null) {
            taskId = "";
        }
        Boolean claimRewards = interfaceC1877530yxT.getClaimRewards();
        if (claimRewards != null) {
            zBooleanValue3 = claimRewards.booleanValue();
        } else {
            zBooleanValue3 = false;
        }
        Boolean closeRedPacketPendant = interfaceC1877530yxT.getCloseRedPacketPendant();
        if ((closeRedPacketPendant == null || !closeRedPacketPendant.booleanValue()) && (iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null)) != null) {
            iTouchPointModuleService.LJIJJLI(iIntValue, iIntValue2, taskId, zBooleanValue, zBooleanValue2, zBooleanValue3);
        }
        InterfaceC1877500yxQ interfaceC1877500yxQ = (InterfaceC1877500yxQ) C1549500qQO.LIZ(InterfaceC1877500yxQ.class);
        interfaceC1877500yxQ.setCode(1);
        completionBlock.onSuccess(interfaceC1877500yxQ, "");
    }
}
