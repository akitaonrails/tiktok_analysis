package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0dMX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047390dMX extends AbstractC1047400dMY {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1028200cra interfaceC1028200cra;
        String containerID2;
        C1047290dMN sessionInfo;
        C1051660dTQ c1051660dTQ;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String str = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (c1051660dTQ = (C1051660dTQ) c1537480q70LIZIZ.LJFF(C1051660dTQ.class)) != null) {
            interfaceC1028200cra = (InterfaceC1028200cra) c1051660dTQ.LIZIZ(InterfaceC1028200cra.class);
        } else {
            interfaceC1028200cra = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        } else {
            containerID2 = null;
        }
        InterfaceC1047410dMZ interfaceC1047410dMZ = (InterfaceC1047410dMZ) C1909107dp.LIZJ(InterfaceC1047410dMZ.class, containerID2);
        if (interfaceC1028200cra != null && (sessionInfo = interfaceC1028200cra.getSessionInfo()) != null) {
            str = sessionInfo.LIZ;
        }
        interfaceC1047410dMZ.setContainerId(str);
        completionBlock.onSuccess(interfaceC1047410dMZ, "");
    }
}
