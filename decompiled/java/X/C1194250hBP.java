package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hBP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194250hBP extends AbstractC1194260hBQ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Object obj;
        InterfaceC1194270hBR interfaceC1194270hBR = (InterfaceC1194270hBR) xBaseParamModel;
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1194280hBS.class, containerID);
            InterfaceC1194280hBS interfaceC1194280hBS = (InterfaceC1194280hBS) xBaseModelLIZJ;
            try {
                obj = C1956707lV.LIZ.get(interfaceC1194270hBR.getKey());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1205490hTX.LIZ.LJ(C1EMR.POI_MEMORY_CACHE_ERR, th);
                obj = null;
            }
            interfaceC1194280hBS.setData(obj);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1205490hTX.LIZ.LJ(C1EMR.POI_MEMORY_CACHE_ERR, th2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("throwable: msg: ");
            sbLIZ.append(th2.getMessage());
            sbLIZ.append(" stack: ");
            sbLIZ.append(C13SZ.LIZIZ(th2));
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
