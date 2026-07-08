package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0v2N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726810v2N extends AbstractC1726830v2P {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1726870v2T interfaceC1726870v2T = (InterfaceC1726870v2T) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        InterfaceC1726890v2V interfaceC1726890v2V = (InterfaceC1726890v2V) C1909107dp.LIZJ(InterfaceC1726890v2V.class, containerID);
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("pipo_security_jsb_enable", true)) {
            interfaceC1726890v2V.setSuccess(CardStruct.IStatusCode.DEFAULT);
            interfaceC1726890v2V.setErrorMsg("settings not enable");
            completionBlock.onSuccess(interfaceC1726890v2V, "");
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null && interfaceC634840OvC2.getContext() != null) {
            String merchantID = interfaceC1726870v2T.getMerchantID();
            String merchantUID = interfaceC1726870v2T.getMerchantUID();
            String hostDomain = interfaceC1726870v2T.getHostDomain();
            String fpSessionID = interfaceC1726870v2T.getFpSessionID();
            if (merchantID.length() != 0 && merchantUID.length() != 0 && hostDomain.length() != 0 && fpSessionID.length() != 0) {
                C1726900v2W c1726900v2W = C1726900v2W.LIZ;
                if (merchantID.length() != 0 && merchantUID.length() != 0 && hostDomain.length() != 0 && fpSessionID.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(merchantID);
                    sbLIZ.append('_');
                    sbLIZ.append(merchantUID);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    synchronized (c1726900v2W) {
                        try {
                            ConcurrentHashMap<String, C1726850v2R> concurrentHashMap = C1726900v2W.LIZJ;
                            C1726850v2R c1726850v2R = concurrentHashMap.get(strLIZIZ);
                            ConcurrentHashMap<String, InterfaceC2174508fX> concurrentHashMap2 = C1726900v2W.LIZIZ;
                            InterfaceC2174508fX interfaceC2174508fX = concurrentHashMap2.get(strLIZIZ);
                            if (c1726850v2R != null && interfaceC2174508fX != null && interfaceC2174508fX.LIZ(merchantID, merchantUID)) {
                                c1726850v2R.LIZ = hostDomain;
                                c1726850v2R.LIZIZ = fpSessionID;
                            } else {
                                C1726850v2R c1726850v2R2 = new C1726850v2R(hostDomain, fpSessionID);
                                concurrentHashMap.put(strLIZIZ, c1726850v2R2);
                                C1726500v1s c1726500v1s = new C1726500v1s(merchantID, merchantUID, c1726850v2R2, new C14BT());
                                c1726500v1s.LJ();
                                concurrentHashMap2.put(strLIZIZ, c1726500v1s);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    interfaceC1726890v2V.setSuccess("1");
                } else {
                    interfaceC1726890v2V.setSuccess(CardStruct.IStatusCode.DEFAULT);
                    interfaceC1726890v2V.setErrorMsg("Failed to initialize security SDK");
                }
                completionBlock.onSuccess(interfaceC1726890v2V, "");
                return;
            }
            interfaceC1726890v2V.setSuccess(CardStruct.IStatusCode.DEFAULT);
            interfaceC1726890v2V.setErrorMsg("Required parameters are empty");
            completionBlock.onSuccess(interfaceC1726890v2V, "");
            return;
        }
        interfaceC1726890v2V.setSuccess(CardStruct.IStatusCode.DEFAULT);
        interfaceC1726890v2V.setErrorMsg("Context is null");
        completionBlock.onSuccess(interfaceC1726890v2V, "");
    }
}
