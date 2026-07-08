package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0v2O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726820v2O extends AbstractC1726840v2Q {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Map mapLJ;
        InterfaceC1726880v2U interfaceC1726880v2U = (InterfaceC1726880v2U) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1726860v2S interfaceC1726860v2S = (InterfaceC1726860v2S) C1909107dp.LIZJ(InterfaceC1726860v2S.class, containerID);
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("pipo_security_jsb_enable", true)) {
            interfaceC1726860v2S.setSignedHeaders(C2097608Jq.LJ());
            completionBlock.onSuccess(interfaceC1726860v2S, "");
            return;
        }
        String merchantID = interfaceC1726880v2U.getMerchantID();
        String merchantUID = interfaceC1726880v2U.getMerchantUID();
        String signingPayload = interfaceC1726880v2U.getSigningPayload();
        if (merchantID.length() != 0 && merchantUID.length() != 0) {
            ConcurrentHashMap<String, InterfaceC2174508fX> concurrentHashMap = C1726900v2W.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(merchantID);
            sbLIZ.append('_');
            sbLIZ.append(merchantUID);
            InterfaceC2174508fX interfaceC2174508fX = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
            if (interfaceC2174508fX == null || (mapLJ = interfaceC2174508fX.LIZJ(signingPayload)) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            interfaceC1726860v2S.setSignedHeaders(mapLJ);
            completionBlock.onSuccess(interfaceC1726860v2S, "");
            return;
        }
        interfaceC1726860v2S.setSignedHeaders(C2097608Jq.LJ());
        completionBlock.onSuccess(interfaceC1726860v2S, "");
    }
}
