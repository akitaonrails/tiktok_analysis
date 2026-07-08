package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import kotlin.jvm.internal.AwS65S1000000_14;

/* JADX INFO: renamed from: X.0Zht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906870Zht extends AbstractC906880Zhu {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        String str;
        MessageBubbleStyle userCurrentBubbleStyle;
        if (enumC1063300dmC != EnumC1063300dmC.LYNX) {
            C2382909Vj.LIZ(completionBlock, 0, "Only lynx platform is supported for now", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        IChatCustomizeHelper.LIZ.getClass();
        IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
        if (iChatCustomizeHelperLIZ == null || (userCurrentBubbleStyle = iChatCustomizeHelperLIZ.getUserCurrentBubbleStyle()) == null || (str = userCurrentBubbleStyle.resourceId) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        AwS65S1000000_14 awS65S1000000_14 = new AwS65S1000000_14(str, 0);
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC906890Zhv.class, containerID);
        awS65S1000000_14.invoke(xBaseResultModel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("success - ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
