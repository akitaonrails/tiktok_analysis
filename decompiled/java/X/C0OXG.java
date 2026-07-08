package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0OXG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC1294060jmO
public final class C0OXG extends C0OXH {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        long jLongValue2;
        C0OXI c0oxi = (C0OXI) xBaseParamModel;
        Long lLIZIZ = C1946707jt.LIZIZ(c0oxi.getBulletinBoardId());
        if (lLIZIZ != null) {
            jLongValue = lLIZIZ.longValue();
        } else {
            jLongValue = 0;
        }
        Long lLIZIZ2 = C1946707jt.LIZIZ(c0oxi.getItemId());
        if (lLIZIZ2 != null) {
            jLongValue2 = lLIZIZ2.longValue();
        } else {
            jLongValue2 = 0;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(jLongValue);
        sbLIZ.append(' ');
        sbLIZ.append(jLongValue2);
        C1720106oR.LJI("RemoveCurrentBulletinItemMethod", C2188811AlT.LIZIZ(sbLIZ));
        String containerID = null;
        if (jLongValue != 0 && jLongValue2 != 0) {
            C1440005kM.LIZ(new C0OJZ(jLongValue, jLongValue2));
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0OXJ.class, containerID), "success");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 1, "bbId or itemId is null", null, 4);
    }
}
