package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.09Vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2383909Vt extends AbstractC2384109Vv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        InterfaceC2384209Vw interfaceC2384209Vw = (InterfaceC2384209Vw) xBaseParamModel;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(interfaceC2384209Vw.getBulletinBoardId());
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        String containerID = null;
        if (jLongValue == 0) {
            C2382909Vj.LIZ(completionBlock, 1, "bbId is null", null, 4);
            return;
        }
        C1440005kM.LIZ(new C2038307yf(interfaceC2384209Vw));
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC2384009Vu.class, containerID), "success");
    }
}
