package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09WY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09WY extends AbstractC2384609Wa {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        try {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2384909Wd(completionBlock, this, null), 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to get nonce: ");
            sbLIZ.append(e);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            completionBlock.onFailure(0, "System Exception", null);
        }
    }
}
