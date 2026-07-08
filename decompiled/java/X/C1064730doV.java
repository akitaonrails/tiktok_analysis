package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0doV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064730doV extends AbstractC1064740doW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Boolean runInIdle = ((InterfaceC1064750doX) xBaseParamModel).getRunInIdle();
        Boolean bool = Boolean.FALSE;
        boolean z = true;
        try {
            C1064620doK c1064620doK = new C1064620doK(!Intrinsics.LJFF(runInIdle, bool), !Intrinsics.LJFF(r2.getCheckGlobalWebViewWarmupStatus(), bool));
            C1520080pew.LJFF(null, "webview_warmup", "call", "jsb", null, null, null, null, 241);
            if (C1064720doU.LIZIZ == null) {
                C1064720doU.LIZIZ = c1064620doK;
                if (!C1064720doU.LIZ()) {
                    C1064620doK c1064620doK2 = C1064720doU.LIZIZ;
                    if (c1064620doK2 == null) {
                        c1064620doK2 = null;
                    }
                    if (c1064620doK2.LIZ) {
                        C1064640doM.LIZ(new C1064770doZ());
                    } else {
                        C1064720doU.LJ();
                    }
                    z = false;
                }
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1064760doY.class, null);
            ((InterfaceC1064760doY) xBaseModelLIZJ).setHasWarmUp(Boolean.valueOf(z));
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
        }
    }
}
