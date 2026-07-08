package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AwS132S1100000_18;

/* JADX INFO: renamed from: X.0hCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194980hCa extends AbstractC1194990hCb {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1059860dge c1059860dge;
        InterfaceC1164410gPH interfaceC1164410gPH;
        C1162800gMg c1162800gMg;
        InterfaceC1195000hCc interfaceC1195000hCc = (InterfaceC1195000hCc) xBaseParamModel;
        String key = interfaceC1195000hCc.getKey();
        Object data = interfaceC1195000hCc.getData();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null && (c1059860dge = (C1059860dge) interfaceC634840OvC.LIZIZ(C1059860dge.class)) != null && (interfaceC1164410gPH = (InterfaceC1164410gPH) c1059860dge.LIZ(InterfaceC1164410gPH.class)) != null && (c1162800gMg = interfaceC1164410gPH.get()) != null) {
            c1162800gMg.LIZ.put(key, data);
            C1168400gVi.LIZ(new AwS132S1100000_18(key, data, 1));
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1195010hCd.class, containerID), "execute successfully");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "execute failed, variableManager is null", null, 4);
    }
}
