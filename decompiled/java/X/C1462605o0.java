package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.05o0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1462605o0 extends AbstractC1464305oH {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(((InterfaceC1464005oE) xBaseParamModel).getConversationId());
        if (c0y8tLIZ == null) {
            C2382909Vj.LIZ(completionBlock, 0, "get conversation failed", null, 4);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C1770106wV(CoroutineExceptionHandler.LJJLIL, completionBlock, 3))), null, null, new C1462305nx(c0y8tLIZ, this, completionBlock, null), 3);
        }
    }
}
