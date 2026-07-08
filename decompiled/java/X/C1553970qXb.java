package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0qXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553970qXb extends AbstractC1553990qXd {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1544050qHb c1544050qHb = C1544050qHb.LIZ;
        String jsbSecureDataflowId = ((InterfaceC1554010qXf) xBaseParamModel).getJsbSecureDataflowId();
        String name = getName();
        c1544050qHb.getClass();
        C443120HZe c443120HZeLIZ = C1544050qHb.LIZ(jsbSecureDataflowId, name);
        if (!((Boolean) c443120HZeLIZ.getFirst()).booleanValue() && c443120HZeLIZ.getSecond() == null) {
            C2382909Vj.LIZ(completionBlock, 0, (String) c443120HZeLIZ.getThird(), null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && interfaceC634840OvC.LIZLLL() != null) {
            C1289800jfW.LL.LIZ((Integer) c443120HZeLIZ.getSecond(), getHybridUrl(enumC1063300dmC));
            completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1554030qXh.class)), "stop gyroscope execute success.");
        } else {
            int i = C2187451AjH.LIZ;
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
            C2382909Vj.LIZ(completionBlock, 0, "context is null!!", null, 4);
        }
    }
}
