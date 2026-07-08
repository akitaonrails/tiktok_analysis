package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0ysQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1874400ysQ extends AbstractC1874390ysP {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1874410ysR interfaceC1874410ysR = (InterfaceC1874410ysR) xBaseParamModel;
        C1874420ysS c1874420ysS = (C1874420ysS) C1619720sFe.LIZ.LIZ(1004);
        if (c1874420ysS != null) {
            c1874420ysS.LIZJ(interfaceC1874410ysR.getScene(), interfaceC1874410ysR.getExtParams(), new AwS607S0100000_28(completionBlock, (CompletionBlock<InterfaceC1874320ysI>) 21));
        } else {
            C2382909Vj.LIZ(completionBlock, 1, "client code error", null, 4);
        }
    }
}
