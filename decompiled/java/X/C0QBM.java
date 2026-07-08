package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0QBM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QBM extends C0QBN {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        LinkedHashMap linkedHashMap;
        EnumC1876780ywG enumC1876780ywGLIZ;
        Integer numValueOf;
        C0QBO c0qbo = (C0QBO) xBaseParamModel;
        String consentKey = c0qbo.getConsentKey();
        if (consentKey.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String containerID = null;
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        Map<String, Object> extra = c0qbo.getExtra();
        if (extra != null) {
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(extra.size()));
            Iterator<T> it2 = extra.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        } else {
            linkedHashMap = null;
        }
        if (((IPNSConsentSDKConfigService) ServiceManager.get().getService(IPNSConsentSDKConfigService.class)).LIZ() != null && (enumC1876780ywGLIZ = C1915720zx4.LIZ(consentKey, linkedHashMap)) != null && (numValueOf = Integer.valueOf(enumC1876780ywGLIZ.getI())) != null) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0QBP.class, containerID);
            ((C0QBP) xBaseModelLIZJ).setState(numValueOf);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
    }
}
