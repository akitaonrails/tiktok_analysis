package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ngg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600360Ngg extends AbstractC600590Nh3 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC600450Ngp interfaceC600450Ngp = (InterfaceC600450Ngp) xBaseParamModel;
        if (interfaceC600450Ngp.getName().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String containerID = null;
        if (z) {
            C2382909Vj.LIZ(completionBlock, -1, "empty event name", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null) {
            C2382909Vj.LIZ(completionBlock, -1, "bridge context is empty", null, 4);
            return;
        }
        for (EnumC599530NfL enumC599530NfL : EnumC599530NfL.values()) {
            if (Intrinsics.LJFF(enumC599530NfL.getValue(), interfaceC600450Ngp.getType())) {
                InterfaceC600380Ngi interfaceC600380Ngi = (InterfaceC600380Ngi) interfaceC634840OvC.LIZIZ(InterfaceC600380Ngi.class);
                if (interfaceC600380Ngi != null) {
                    int i = C599550NfN.LIZ[enumC599530NfL.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            interfaceC600380Ngi.U0(interfaceC634840OvC, interfaceC600450Ngp.getName());
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        interfaceC600380Ngi.LIZIZ(interfaceC634840OvC, interfaceC600450Ngp.getName());
                    }
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        containerID = interfaceC634840OvC2.getContainerID();
                    }
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC600510Ngv.class, containerID), "");
                    return;
                }
                C600390Ngj.LIZ("lack region context");
                C2382909Vj.LIZ(completionBlock, -1, "lack region context", null, 4);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalid type ");
        sbLIZ.append(interfaceC600450Ngp.getType());
        C600390Ngj.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("invalid type ");
        sbLIZ2.append(interfaceC600450Ngp.getType());
        C2382909Vj.LIZ(completionBlock, -1, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
    }
}
