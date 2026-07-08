package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ccU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018840ccU extends AbstractC1018850ccV {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context contextLJFF = C2214201BlK.LJFF();
        String containerID = null;
        if (contextLJFF == null) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                contextLJFF = interfaceC634840OvC.getContext();
            } else {
                contextLJFF = null;
            }
        }
        if (contextLJFF == null) {
            C1AF0.LIZIZ();
            C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
            return;
        }
        int iLJIILJJIL = C12ES.LJIILJJIL(C14KQ.LJIIIIZZ(contextLJFF), contextLJFF);
        int iLJIILJJIL2 = C12ES.LJIILJJIL((C14KQ.LJ(contextLJFF) - C12ES.LIZJ(58.0f, contextLJFF)) - C14KI.LIZIZ(contextLJFF), contextLJFF);
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        InterfaceC1018860ccW interfaceC1018860ccW = (InterfaceC1018860ccW) C1909107dp.LIZJ(InterfaceC1018860ccW.class, containerID);
        interfaceC1018860ccW.setWidth(Integer.valueOf(iLJIILJJIL));
        interfaceC1018860ccW.setHeight(Integer.valueOf(iLJIILJJIL2));
        interfaceC1018860ccW.setScale(Float.valueOf(contextLJFF.getResources().getDisplayMetrics().density));
        completionBlock.onSuccess(interfaceC1018860ccW, "");
    }
}
