package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0wv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799150wv3 extends AbstractC1799130wv1 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1799140wv2 interfaceC1799140wv2 = (InterfaceC1799140wv2) xBaseParamModel;
        String clientKey = interfaceC1799140wv2.getClientKey();
        Map<String, Object> rewardData = interfaceC1799140wv2.getRewardData();
        String containerID = null;
        if (rewardData == null) {
            C2382909Vj.LIZ(completionBlock, 0, "reward data is not passed in", null, 4);
            return;
        }
        C04PZ.LIZ.put(clientKey, rewardData);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1799160wv4.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZJ(containerID, c19719912DlLIZ), "");
    }
}
