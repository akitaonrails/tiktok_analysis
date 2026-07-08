package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0grh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182030grh extends AbstractC1182120grq {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1182110grp interfaceC1182110grp = (InterfaceC1182110grp) xBaseParamModel;
        InterfaceC1166580gSm interfaceC1166580gSm = C1076680e7m.LIZ.get(interfaceC1182110grp.getPageId());
        String containerID = null;
        if (interfaceC1166580gSm == null) {
            C2382909Vj.LIZ(completionBlock, 0, "global context not found", null, 4);
            return;
        }
        Number method = interfaceC1182110grp.getMethod();
        if (Intrinsics.LJFF(method, 0)) {
            interfaceC1166580gSm.LIZJ(interfaceC1182110grp.getDataType().intValue(), interfaceC1182110grp.getDataMap());
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1182170grv.class, containerID), "");
            return;
        }
        if (Intrinsics.LJFF(method, 1)) {
            List<String> keyList = interfaceC1182110grp.getKeyList();
            if (keyList != null) {
                Iterator<String> it2 = keyList.iterator();
                while (it2.hasNext()) {
                    interfaceC1166580gSm.LIZIZ(interfaceC1182110grp.getDataType().intValue(), it2.next());
                }
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1182170grv.class, containerID), "");
            return;
        }
        if (Intrinsics.LJFF(method, 2)) {
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                containerID = interfaceC634840OvC3.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1182170grv.class, containerID);
            ((InterfaceC1182170grv) xBaseModelLIZJ).setQueryMap(interfaceC1166580gSm.LIZ(interfaceC1182110grp.getDataType().intValue(), interfaceC1182110grp.getKeyList()));
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        if (Intrinsics.LJFF(method, 3)) {
            InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
            if (interfaceC634840OvC4 != null) {
                containerID = interfaceC634840OvC4.getContainerID();
            }
            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1182170grv.class, containerID);
            ((InterfaceC1182170grv) xBaseModelLIZJ2).setQueryMap(interfaceC1166580gSm.LIZLLL(interfaceC1182110grp.getDataType().intValue()));
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "unknown method", null, 4);
    }
}
