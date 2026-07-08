package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877710yxl extends AbstractC1877680yxi {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String strLJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create aux stream id, business name: ");
        sbLIZ.append(((InterfaceC1877690yxj) xBaseParamModel).getBusinessName());
        C20441214yg.LJIIIZ("CreateLiveAuxStreamIdMethod", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
        String containerID = null;
        if (interfaceC938530aWxLIZ != null) {
            strLJFF = interfaceC938530aWxLIZ.LJFF();
        } else {
            strLJFF = null;
        }
        if (strLJFF != null && strLJFF.length() != 0) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            InterfaceC1877700yxk interfaceC1877700yxk = (InterfaceC1877700yxk) C1909107dp.LIZJ(InterfaceC1877700yxk.class, containerID);
            interfaceC1877700yxk.setAuxStreamId(strLJFF);
            completionBlock.onSuccess(interfaceC1877700yxk, "");
            return;
        }
        C20441214yg.LJ("CreateLiveAuxStreamIdMethod", "create aux stream id failed, service or stream id is null");
        C2382909Vj.LIZ(completionBlock, 0, "create aux stream id failed", null, 4);
    }
}
