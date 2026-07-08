package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Nmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604170Nmp extends AbstractC604140Nmm {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        try {
            C2487409ou.LIZJ(new Runnable() { // from class: X.0IxO
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LSFYPShapedCardScrollNextVideoMethod@142e.handle$1");
                    try {
                        C1440005kM.LIZ(new C483280IxK());
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LSFYPShapedCardScrollNextVideoMethod@142e.handle$1");
                }
            });
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC604150Nmn.class);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
            ((InterfaceC604150Nmn) xBaseModelLIZJ).setCode(1);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "scroll to next video success");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2382909Vj.LIZ(completionBlock, 0, "scroll to next video failed", null, 4);
        }
    }
}
