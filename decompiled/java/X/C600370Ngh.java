package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Ngh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600370Ngh extends AbstractC600540Ngy {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC600410Ngl interfaceC600410Ngl = (InterfaceC600410Ngl) xBaseParamModel;
        if (interfaceC600410Ngl.getName().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, -1, "empty event name", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null) {
            C2382909Vj.LIZ(completionBlock, -1, "bridge context is empty", null, 4);
            return;
        }
        InterfaceC600380Ngi interfaceC600380Ngi = (InterfaceC600380Ngi) interfaceC634840OvC.LIZIZ(InterfaceC600380Ngi.class);
        if (interfaceC600380Ngi != null) {
            interfaceC600380Ngi.LJ(interfaceC600410Ngl.getName(), interfaceC600410Ngl.getData(), interfaceC600410Ngl.getPerfParams(), new C600290NgZ(completionBlock, this, interfaceC600410Ngl));
        } else {
            C600390Ngj.LIZ("lack region context");
            C2382909Vj.LIZ(completionBlock, -1, "lack region context", null, 4);
        }
    }
}
