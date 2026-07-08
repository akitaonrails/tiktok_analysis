package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0OXL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OXL extends C0OXM {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        long jLongValue2;
        C0OXN c0oxn = (C0OXN) xBaseParamModel;
        Long lLIZIZ = C1946707jt.LIZIZ(c0oxn.getBulletinBoardId());
        if (lLIZIZ != null) {
            jLongValue = lLIZIZ.longValue();
        } else {
            jLongValue = 0;
        }
        Long lLIZIZ2 = C1946707jt.LIZIZ(c0oxn.getItemId());
        if (lLIZIZ2 != null) {
            jLongValue2 = lLIZIZ2.longValue();
        } else {
            jLongValue2 = 0;
        }
        String containerID = null;
        if (jLongValue != 0 && jLongValue2 != 0) {
            C1440005kM.LIZ(new C619210OQl(jLongValue, jLongValue2, c0oxn.getMobExtra()));
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0OXO.class, containerID), "success");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 1, "bbId or itemId is null", null, 4);
    }
}
