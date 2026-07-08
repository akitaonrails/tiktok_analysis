package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876420yvg extends AbstractC1876440yvi {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1876060yv6 interfaceC1876060yv6;
        InterfaceC1876460yvk interfaceC1876460yvk;
        InterfaceC1876430yvh interfaceC1876430yvh = (InterfaceC1876430yvh) xBaseParamModel;
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
                if (interfaceC1876060yv6 instanceof InterfaceC1876460yvk) {
                    break;
                }
            }
            interfaceC1876060yv6 = null;
        } else {
            interfaceC1876060yv6 = null;
        }
        if ((interfaceC1876060yv6 instanceof InterfaceC1876460yvk) && (interfaceC1876460yvk = (InterfaceC1876460yvk) interfaceC1876060yv6) != null) {
            InterfaceC1876450yvj interfaceC1876450yvj = (InterfaceC1876450yvj) C1909107dp.LIZJ(InterfaceC1876450yvj.class, null);
            C1876480yvm c1876480yvmLJIIJ = interfaceC1876460yvk.LJIIJ(interfaceC1876430yvh.getTimeStamp().longValue(), interfaceC1876430yvh.getFormateStr());
            interfaceC1876450yvj.setTimeString(c1876480yvmLJIIJ.LIZ);
            interfaceC1876450yvj.setHour24Format(Boolean.valueOf(c1876480yvmLJIIJ.LIZIZ));
            completionBlock.onSuccess(interfaceC1876450yvj, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "PnSJSBridgeKit: IGetFormattedTimeInfo is not registered.", null, 4);
        C1876760ywE.LIZ(this, 0, "PnSJSBridgeKit: IGetFormattedTimeInfo is not registered.");
    }
}
