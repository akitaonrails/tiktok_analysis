package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;

/* JADX INFO: renamed from: X.0TRL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TRL extends C0TRI {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C1537480q70 hybridContext;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IMessageAbility iMessageAbility;
        C0TRK c0trk = (C0TRK) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
            C1529870puj.LIZ.getClass();
            InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(containerID);
            if (interfaceC1541990qEHLJFF != null && (hybridContext = interfaceC1541990qEHLJFF.getHybridContext()) != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) hybridContext.LJFF(InterfaceC665370Q7z.class)) != null && (iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null)) != null) {
                iMessageAbility.bL0(c0trk.getUuid(), c0trk.getData());
            }
        }
    }
}
