package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ukW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715740ukW extends AbstractC1715730ukV {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        boolean z;
        InterfaceC1715720ukU interfaceC1715720ukU = (InterfaceC1715720ukU) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        InterfaceC1715750ukX interfaceC1715750ukX = (InterfaceC1715750ukX) C1909107dp.LIZJ(InterfaceC1715750ukX.class, containerID);
        if (!C1716020uky.LIZ()) {
            Boolean bool = Boolean.FALSE;
            interfaceC1715750ukX.setDeviceReady(bool);
            interfaceC1715750ukX.setSettingReady(bool);
            completionBlock.onSuccess(interfaceC1715750ukX, "Android 9 required");
            return;
        }
        if (context == null) {
            Boolean bool2 = Boolean.FALSE;
            interfaceC1715750ukX.setDeviceReady(bool2);
            interfaceC1715750ukX.setSettingReady(bool2);
            completionBlock.onSuccess(interfaceC1715750ukX, "context null");
            return;
        }
        int iLIZ = C1836510xtJ.LIZIZ(context).LIZ();
        boolean z2 = false;
        if (iLIZ != 0 && iLIZ != 11) {
            z = false;
        } else {
            z = true;
        }
        interfaceC1715750ukX.setDeviceReady(Boolean.valueOf(z));
        if (iLIZ == 0) {
            z2 = true;
        }
        interfaceC1715750ukX.setSettingReady(Boolean.valueOf(z2));
        if (!z) {
            completionBlock.onSuccess(interfaceC1715750ukX, "");
            return;
        }
        interfaceC1715750ukX.setBiometricType("general");
        interfaceC1715750ukX.setClientBiometryDataTag(C1715790ukb.LIZIZ(interfaceC1715720ukU.getWalletUid()).LIZLLL());
        completionBlock.onSuccess(interfaceC1715750ukX, "");
    }
}
