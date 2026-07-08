package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Q03, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q03 extends C0Q04 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object objLJFF;
        View view;
        String containerID;
        C0Q05 c0q05 = (C0Q05) xBaseParamModel;
        String containerID2 = null;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, Object> cardParams = c0q05.getCardParams();
            if (cardParams != null) {
                for (Map.Entry<String, Object> entry : cardParams.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
                C1529870puj.LIZ.getClass();
                objLJFF = C1529870puj.LJFF(containerID);
            } else {
                objLJFF = null;
            }
            if ((objLJFF instanceof View) && (view = (View) objLJFF) != null) {
                C653440Pk6.LIZ(C660870Pw5.LIZ(view).LJIILL, view, (String) linkedHashMap.get("search_result_id"), linkedHashMap);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null) {
                C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
            }
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0Q06.class, containerID2), "");
    }
}
