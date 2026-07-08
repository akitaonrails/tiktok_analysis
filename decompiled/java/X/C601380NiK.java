package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0NiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C601380NiK extends AbstractC601540Nia {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC601560Nic interfaceC601560Nic = (InterfaceC601560Nic) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C601370NiJ(CoroutineExceptionHandler.LJJLIL, completionBlock, containerID))), null, null, new C601640Nik(interfaceC601560Nic, completionBlock, containerID, this, null), 3);
    }
}
