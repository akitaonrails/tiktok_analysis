package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Nj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C601820Nj2 extends AbstractC601800Nj0 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC601810Nj1 interfaceC601810Nj1 = (InterfaceC601810Nj1) xBaseParamModel;
        if (enumC1063300dmC != EnumC1063300dmC.LYNX) {
            C2382909Vj.LIZ(completionBlock, 0, "Only lynx platform is supported for now", null, 4);
            return;
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(interfaceC601810Nj1.getServerMsgId());
        if (lLJIILIIL == null) {
            return;
        }
        long jLongValue = lLJIILIIL.longValue();
        C0YNY c0yny = InterfaceC874680YTa.LIZ;
        C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(c0yny).LJJJ(jLongValue);
        if (c869590Y9lLJJJ == null) {
            return;
        }
        C0YNY.LIZ(c0yny).LIZ(c869590Y9lLJJJ, false, null);
    }
}
