package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0QxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687180QxQ extends AbstractC687220QxU {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        boolean z;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("handle start");
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC687230QxV.class, containerID);
        InterfaceC687230QxV interfaceC687230QxV = (InterfaceC687230QxV) xBaseModelLIZJ;
        C687150QxN.LL.getClass();
        if (C687150QxN.LLILLJJLI != EnumC687210QxT.UNKNOWN.getValue() && C687150QxN.LLILLJJLI != EnumC687210QxT.COMPLETE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        interfaceC687230QxV.setValid(Boolean.valueOf(z));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle success: isValid: ");
        sbLIZ.append(interfaceC687230QxV.isValid());
        C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
