package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876150yvF extends AbstractC1876170yvH {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1876060yv6 interfaceC1876060yv6;
        InterfaceC1876160yvG interfaceC1876160yvG;
        InterfaceC634840OvC interfaceC634840OvC;
        InterfaceC1876190yvJ interfaceC1876190yvJ = (InterfaceC1876190yvJ) xBaseParamModel;
        C1876250yvP.LIZ.getClass();
        if (!C1876250yvP.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1876250yvP.class.getSimpleName());
            sbLIZ.append(" is not isInitialized");
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            C1876760ywE.LIZ(this, 0, "PnS JSBridge Kit not initialized.");
            return;
        }
        InterfaceC1876060yv6[] interfaceC1876060yv6Arr = C1876250yvP.LIZIZ;
        if (interfaceC1876060yv6Arr != null) {
            int length = interfaceC1876060yv6Arr.length;
            for (int i = 0; i < length; i++) {
                interfaceC1876060yv6 = interfaceC1876060yv6Arr[i];
                if (interfaceC1876060yv6 instanceof InterfaceC1876160yvG) {
                    break;
                }
            }
            interfaceC1876060yv6 = null;
        } else {
            interfaceC1876060yv6 = null;
        }
        if (!(interfaceC1876060yv6 instanceof InterfaceC1876160yvG) || (interfaceC1876160yvG = (InterfaceC1876160yvG) interfaceC1876060yv6) == null || (interfaceC634840OvC = this.IBridgeSdkContext) == null || interfaceC634840OvC.getContext() == null) {
            return;
        }
        interfaceC1876160yvG.LJIIIIZZ(interfaceC1876190yvJ, new C1876180yvI(completionBlock, this));
    }
}
