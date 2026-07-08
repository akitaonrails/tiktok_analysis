package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0OWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620780OWm extends AbstractC620790OWn {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        InterfaceC620800OWo interfaceC620800OWo = (InterfaceC620800OWo) xBaseParamModel;
        String containerID = null;
        if (!C0OU6.LIZ()) {
            C2382909Vj.LIZ(completionBlock, 1, "client not enable", null, 4);
            return;
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(interfaceC620800OWo.getBulletinBoardId());
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        int iIntValue = interfaceC620800OWo.getPostType().intValue();
        if (jLongValue != 0 && iIntValue >= 0) {
            Map<String, Object> postContentMap = interfaceC620800OWo.getPostContentMap();
            if (postContentMap == null) {
                postContentMap = new LinkedHashMap<>();
            }
            Map<String, Object> mobExtra = interfaceC620800OWo.getMobExtra();
            if (mobExtra == null) {
                mobExtra = new LinkedHashMap<>();
            }
            C1440005kM.LIZ(new C0OVY(jLongValue, iIntValue, postContentMap, mobExtra));
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC620810OWp.class, containerID), "success");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 1, "bbId or postType is null", null, 4);
    }
}
