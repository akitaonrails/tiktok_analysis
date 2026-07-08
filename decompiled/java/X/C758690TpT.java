package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS256S0300000_12;

/* JADX INFO: renamed from: X.0TpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758690TpT extends AbstractC758700TpU {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Long lLJIILIIL = C2095008Iq.LJIILIIL(((InterfaceC758710TpV) xBaseParamModel).getSheetStackToken());
        if (lLJIILIIL == null) {
            C2382909Vj.LIZ(completionBlock, 0, "token is invalid", null, 4);
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS256S0300000_12(completionBlock, (CompletionBlock<InterfaceC758720TpW>) this, (C758690TpT) lLJIILIIL, (Long) 5));
        }
    }
}
