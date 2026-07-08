package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0XDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845150XDl extends AbstractC845160XDm {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Integer num;
        Integer num2;
        InterfaceC845180XDo interfaceC845180XDo = (InterfaceC845180XDo) xBaseParamModel;
        Number serviceId = interfaceC845180XDo.getServiceId();
        String containerID = null;
        if (serviceId instanceof Integer) {
            num = (Integer) serviceId;
        } else {
            num = null;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            Number methodId = interfaceC845180XDo.getMethodId();
            if ((methodId instanceof Integer) && (num2 = (Integer) methodId) != null) {
                int iIntValue2 = num2.intValue();
                Map<String, InterfaceC486470J5x> map = C845140XDk.LIZIZ;
                if (((LinkedHashMap) map).get(C845140XDk.LIZ(iIntValue, iIntValue2)) == null) {
                    C2203431BLp.LIZIZ.LJII(iIntValue, iIntValue2);
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        containerID = interfaceC634840OvC.getContainerID();
                    }
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC845170XDn.class, containerID);
                    ((InterfaceC845170XDn) xBaseModelLIZJ).setCode(10002);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    return;
                }
                C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
                c2203431BLp.LJII(iIntValue, iIntValue2);
                map.remove(C845140XDk.LIZ(iIntValue, iIntValue2));
                Map<String, C0XEZ> map2 = C845140XDk.LIZ;
                C0XEZ c0xez = (C0XEZ) ((LinkedHashMap) map2).get(C845140XDk.LIZ(iIntValue, iIntValue2));
                if (c0xez != null) {
                    c2203431BLp.LJIIJJI(c0xez);
                    map2.remove(C845140XDk.LIZ(iIntValue, iIntValue2));
                }
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                }
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC845170XDn.class, containerID);
                ((InterfaceC845170XDn) xBaseModelLIZJ2).setCode(10001);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "serviceId type error", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "serviceId type error", null, 4);
    }
}
