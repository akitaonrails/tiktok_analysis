package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AwS53S1000000_2;

/* JADX INFO: renamed from: X.0hCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195080hCk extends AbstractC1195090hCl {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1059860dge c1059860dge;
        C1162800gMg c1162800gMg;
        String key = ((InterfaceC1195100hCm) xBaseParamModel).getKey();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null && (c1059860dge = (C1059860dge) interfaceC634840OvC.LIZIZ(C1059860dge.class)) != null && (c1162800gMg = (C1162800gMg) c1059860dge.LIZ(C1162800gMg.class)) != null) {
            c1162800gMg.LIZ.remove(key);
            C1168400gVi.LIZ(new AwS53S1000000_2(key, 2));
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1195110hCn.class, containerID), "execute successfully");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "execute failed, variableManager is null", null, 4);
    }
}
