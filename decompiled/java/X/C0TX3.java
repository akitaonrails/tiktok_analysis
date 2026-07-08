package X;

import com.bytedance.keva.Keva;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TX3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TX3 extends C0TX4 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C0TX5 c0tx5 = (C0TX5) xBaseParamModel;
        try {
            if (C297490BlL.LIZ() < 0) {
                C2382909Vj.LIZ(completionBlock, 0, "not hit the fyp gps card exp", null, 4);
            }
            int iIntValue = c0tx5.getCardType().intValue();
            Keva keva = (Keva) C0TX8.LIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttls_gps_shaped_card_dislike_timestamp_");
            sbLIZ.append(iIntValue);
            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), System.currentTimeMillis());
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0TX6.class);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZJ(containerID, c19719912DlLIZ), "dislike success");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
