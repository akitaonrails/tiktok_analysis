package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hBM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194220hBM extends AbstractC1194230hBN {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean zBooleanValue;
        String containerID;
        InterfaceC1194240hBO interfaceC1194240hBO = (InterfaceC1194240hBO) xBaseParamModel;
        try {
            String key = interfaceC1194240hBO.getKey();
            Object data = interfaceC1194240hBO.getData();
            Boolean disableOverwrite = interfaceC1194240hBO.getDisableOverwrite();
            if (disableOverwrite != null) {
                zBooleanValue = disableOverwrite.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1956707lV.LIZ(data, key, zBooleanValue);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1194290hBT.class, containerID), "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1205490hTX.LIZ.LJ(C1EMR.POI_MEMORY_CACHE_ERR, th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("throwable: msg: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(" stack: ");
            sbLIZ.append(C13SZ.LIZIZ(th));
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
