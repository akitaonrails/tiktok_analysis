package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876310yvV extends AbstractC1876340yvY {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1876060yv6 interfaceC1876060yv6;
        InterfaceC1876320yvW interfaceC1876320yvW;
        InterfaceC1876350yvZ interfaceC1876350yvZ = (InterfaceC1876350yvZ) xBaseParamModel;
        C1876760ywE.LIZIZ(this);
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
                if (interfaceC1876060yv6 instanceof InterfaceC1876320yvW) {
                    break;
                }
            }
            interfaceC1876060yv6 = null;
        } else {
            interfaceC1876060yv6 = null;
        }
        if ((interfaceC1876060yv6 instanceof InterfaceC1876320yvW) && (interfaceC1876320yvW = (InterfaceC1876320yvW) interfaceC1876060yv6) != null) {
            interfaceC1876320yvW.LJFF(interfaceC1876350yvZ, new C1876330yvX(completionBlock, this));
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "PnSJSBridgeKit: IPNSConsentService is not registered.", null, 4);
            C1876760ywE.LIZ(this, 0, "PnSJSBridgeKit: IPNSConsentService is not registered.");
        }
    }
}
