package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ngf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600350Ngf extends AbstractC600550Ngz {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        EnumC599530NfL next;
        InterfaceC600440Ngo interfaceC600440Ngo = (InterfaceC600440Ngo) xBaseParamModel;
        if (interfaceC600440Ngo.getName().length() == 0) {
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
        Iterator<EnumC599530NfL> it2 = EnumC599530NfL.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getValue(), interfaceC600440Ngo.getType())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC599530NfL enumC599530NfL = next;
        if (enumC599530NfL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid type ");
            sbLIZ.append(interfaceC600440Ngo.getType());
            C2382909Vj.LIZ(completionBlock, -1, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        InterfaceC600380Ngi interfaceC600380Ngi = (InterfaceC600380Ngi) interfaceC634840OvC.LIZIZ(InterfaceC600380Ngi.class);
        if (interfaceC600380Ngi != null) {
            int i = C599540NfM.LIZ[enumC599530NfL.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    interfaceC600380Ngi.LIZ(interfaceC600440Ngo.getName(), new C598590Ndp(interfaceC634840OvC, interfaceC600440Ngo, null), this);
                } else {
                    throw new C1954807lC();
                }
            } else {
                interfaceC600380Ngi.Q(interfaceC634840OvC, interfaceC600440Ngo.getName());
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC600500Ngu.class, containerID), "");
            return;
        }
        C600390Ngj.LIZ("lack region context");
        C2382909Vj.LIZ(completionBlock, -1, "lack region context", null, 4);
    }
}
