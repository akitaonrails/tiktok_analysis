package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0OcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623140OcK extends AbstractC623150OcL {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        List<String> updateModelIds = ((InterfaceC623160OcM) xBaseParamModel).getUpdateModelIds();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = updateModelIds.iterator();
        while (it2.hasNext()) {
            Long lLIZIZ = C1946707jt.LIZIZ(it2.next());
            if (lLIZIZ != null) {
                arrayList.add(lLIZIZ);
            }
        }
        C1440005kM.LIZ(new C623170OcN(arrayList));
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxWorkbenchUpdateEventMethod", arrayList.toString());
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC623180OcO.class, containerID), "success");
    }
}
