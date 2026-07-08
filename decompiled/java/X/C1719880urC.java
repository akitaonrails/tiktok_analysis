package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.verify.PipoVerifyCenterService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0urC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719880urC extends AbstractC1719890urD {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1719900urE interfaceC1719900urE = (InterfaceC1719900urE) xBaseParamModel;
        String mid = interfaceC1719900urE.getMid();
        String muid = interfaceC1719900urE.getMuid();
        String fpSessionId = interfaceC1719900urE.getFpSessionId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(mid);
        sbLIZ.append('_');
        sbLIZ.append(muid);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1719910urF interfaceC1719910urF = (InterfaceC1719910urF) C1909107dp.LIZJ(InterfaceC1719910urF.class, null);
        if (fpSessionId.length() > 0) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) PipoVerifyCenterService.LIZIZ;
            if (concurrentHashMap.containsKey(strLIZIZ)) {
                interfaceC1719910urF.setResult("update");
            } else {
                interfaceC1719910urF.setResult("add");
            }
            concurrentHashMap.put(strLIZIZ, fpSessionId);
        } else {
            ((ConcurrentHashMap) PipoVerifyCenterService.LIZIZ).remove(strLIZIZ);
            interfaceC1719910urF.setResult("delete");
        }
        completionBlock.onSuccess(interfaceC1719910urF, "");
    }
}
