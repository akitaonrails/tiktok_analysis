package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0v4O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1728060v4O extends AbstractC1728080v4Q {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1055640dZq interfaceC1055640dZq;
        String strLIZ;
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (interfaceC1055640dZq = c1874950ytJ.LJIIIIZZ) != null && (strLIZ = interfaceC1055640dZq.LIZ(this.IBridgeSdkContext)) != null) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1728070v4P.class, null);
            ((InterfaceC1728070v4P) xBaseModelLIZJ).setContainerID(strLIZ);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "getContainerID not implemented in ContainerDepend", null, 4);
    }
}
