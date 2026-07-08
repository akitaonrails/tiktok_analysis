package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: renamed from: X.0nNA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432180nNA extends AbstractC1503340pDw {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1503350pDx interfaceC1503350pDx = (InterfaceC1503350pDx) xBaseParamModel;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && currentUser.LIZLLL() == 3) {
            C2382909Vj.LIZ(completionBlock, 2, "BA Account", null, 4);
            return;
        }
        InterfaceC523450Kfv interfaceC523450KfvLJIIIIZZ = C0CHQ.LIZ().LJIIIIZZ();
        String templateId = interfaceC1503350pDx.getTemplateId();
        C1429050nI7.LIZ.getClass();
        interfaceC523450KfvLJIIIIZZ.LJ(templateId, C1429050nI7.LIZ(), null, null, new AwS601S0100000_22(completionBlock, (CompletionBlock<InterfaceC1503330pDv>) 689), new AwS616S0100000_2(completionBlock, (CompletionBlock<InterfaceC1503330pDv>) 107));
    }
}
