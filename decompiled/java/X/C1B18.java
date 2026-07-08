package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B18, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B18 extends C1B16 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Number storyStatus;
        String storyItemID;
        String storyOwnerID;
        Context context;
        String storyOwnerID2;
        Number storyStatus2;
        String storyItemID2;
        C1B17 c1b17 = (C1B17) xBaseParamModel;
        C1B19 storyData = c1b17.getStoryData();
        Context context2 = null;
        if (storyData != null) {
            storyStatus = storyData.getStoryStatus();
        } else {
            storyStatus = null;
        }
        if (Intrinsics.LJFF(storyStatus, 0)) {
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction != null) {
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    context = interfaceC634840OvC.getContext();
                } else {
                    context = null;
                }
                String liveEventData = c1b17.getLiveEventData();
                C1B19 storyData2 = c1b17.getStoryData();
                if (storyData2 != null) {
                    storyOwnerID2 = storyData2.getStoryOwnerID();
                } else {
                    storyOwnerID2 = null;
                }
                C1B19 storyData3 = c1b17.getStoryData();
                if (storyData3 != null) {
                    storyStatus2 = storyData3.getStoryStatus();
                } else {
                    storyStatus2 = null;
                }
                C1B19 storyData4 = c1b17.getStoryData();
                if (storyData4 != null) {
                    storyItemID2 = storyData4.getStoryItemID();
                } else {
                    storyItemID2 = null;
                }
                iHostAction.startStoryEditFromLiveEvent(context, liveEventData, storyOwnerID2, storyStatus2, storyItemID2);
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C1B1A.class, null), "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, -1, "IHostCreativeTool is null", null, 4);
            return;
        }
        if (!Intrinsics.LJFF(storyStatus, 2)) {
            return;
        }
        C1B19 storyData5 = c1b17.getStoryData();
        if (storyData5 != null) {
            storyItemID = storyData5.getStoryItemID();
        } else {
            storyItemID = null;
        }
        C1B19 storyData6 = c1b17.getStoryData();
        if (storyData6 != null) {
            storyOwnerID = storyData6.getStoryOwnerID();
        } else {
            storyOwnerID = null;
        }
        if (storyItemID != null && storyItemID.length() != 0 && storyOwnerID != null && storyOwnerID.length() != 0) {
            IHostAction iHostAction2 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                context2 = interfaceC634840OvC2.getContext();
            }
            iHostAction2.openStoryDetail(context2, storyItemID, storyOwnerID, "", "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, "storyItemID or storyOwnerID is null", null, 4);
    }
}
