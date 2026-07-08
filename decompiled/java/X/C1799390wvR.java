package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799390wvR extends AbstractC1799410wvT {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1797410wsF interfaceC1797410wsF;
        InterfaceC1799430wvV interfaceC1799430wvV = (InterfaceC1799430wvV) xBaseParamModel;
        String containerID = interfaceC1799430wvV.getContainerID();
        boolean animated = interfaceC1799430wvV.getAnimated();
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (interfaceC1797410wsF = c1874950ytJ.LJI) != null) {
            interfaceC1797410wsF.LIZ(this.IBridgeSdkContext, enumC1063300dmC, containerID, animated);
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1799400wvS.class, null), "");
    }
}
