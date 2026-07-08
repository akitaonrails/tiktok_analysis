package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.dynamic.card.IMDynamicCardOpenServiceImpl;

/* JADX INFO: renamed from: X.09VU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09VU extends C09VV {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C09VW c09vw = (C09VW) xBaseParamModel;
        IMDynamicCardOpenServiceImpl iMDynamicCardOpenServiceImpl = IMDynamicCardOpenServiceImpl.LIZIZ;
        String businessType = c09vw.getBusinessType();
        C1258204w8 c1258204w8 = new C1258204w8(businessType, c09vw.getScene(), c09vw.getBusinessId(), c09vw.getEvent(), c09vw.getParams());
        InterfaceC2258508t5 interfaceC2258508t5 = IMDynamicCardOpenServiceImpl.LIZJ.get(businessType);
        if (interfaceC2258508t5 != null) {
            interfaceC2258508t5.onEvent(c1258204w8);
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C09VX.class, containerID), "");
    }
}
