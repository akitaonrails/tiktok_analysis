package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS143S1200000_28;

/* JADX INFO: renamed from: X.0yr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873560yr4 extends AbstractC1873520yr0 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        if (containerID != null && containerID.length() != 0) {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS143S1200000_28(containerID, (String) completionBlock, (CompletionBlock<InterfaceC1873540yr2>) this, (C1873560yr4) 7));
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "containerId is null", null, 4);
        }
    }
}
