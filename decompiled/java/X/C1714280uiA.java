package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.verify.PipoVerifyCenterService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0uiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714280uiA extends AbstractC1714300uiC {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC1714310uiD interfaceC1714310uiD = (InterfaceC1714310uiD) xBaseParamModel;
        String mid = interfaceC1714310uiD.getMid();
        String muid = interfaceC1714310uiD.getMuid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(mid);
        sbLIZ.append('_');
        sbLIZ.append(muid);
        String str = (String) ((ConcurrentHashMap) PipoVerifyCenterService.LIZIZ).get(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            InterfaceC1714290uiB interfaceC1714290uiB = (InterfaceC1714290uiB) C1909107dp.LIZJ(InterfaceC1714290uiB.class, null);
            interfaceC1714290uiB.setFpSessionId(str);
            completionBlock.onSuccess(interfaceC1714290uiB, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "FP_SESSION_ID_NOT_FOUND", null, 4);
    }
}
