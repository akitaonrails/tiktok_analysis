package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0NiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C601420NiO extends AbstractC601530NiZ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC601620Nii interfaceC601620Nii = (InterfaceC601620Nii) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C601410NiN(CoroutineExceptionHandler.LJJLIL, completionBlock, containerID))), null, null, new C601630Nij(interfaceC601620Nii, completionBlock, containerID, null), 3);
    }
}
