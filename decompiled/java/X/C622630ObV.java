package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0ObV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622630ObV extends AbstractC622640ObW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        InterfaceC622650ObX interfaceC622650ObX = (InterfaceC622650ObX) xBaseParamModel;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(interfaceC622650ObX.getBulletinBoardId());
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        C1440005kM.LIZ(new C0ORG(jLongValue, interfaceC622650ObX.getTitle(), interfaceC622650ObX.getMessage(), interfaceC622650ObX.getPrimaryBtnContent(), new AwS410S0200000_9(completionBlock, (CompletionBlock<InterfaceC622660ObY>) this, (C622630ObV) 4), interfaceC622650ObX.getSecondaryBtnContent(), new AwS410S0200000_9(completionBlock, (CompletionBlock<InterfaceC622660ObY>) this, (C622630ObV) 5), new AwS553S0100000_9(completionBlock, (CompletionBlock<InterfaceC622660ObY>) 24)));
    }
}
