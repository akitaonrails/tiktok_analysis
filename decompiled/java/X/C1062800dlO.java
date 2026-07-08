package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dlO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062800dlO extends AbstractC1062810dlP {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        return true;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        try {
            String strLIZIZ = C596440NaM.LIZ.LIZIZ(String.valueOf(((InterfaceC1062820dlQ) xBaseParamModel).getKey()), "");
            if (!TextUtils.isEmpty(strLIZIZ)) {
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                } else {
                    containerID = null;
                }
                InterfaceC1062830dlR interfaceC1062830dlR = (InterfaceC1062830dlR) C1909107dp.LIZJ(InterfaceC1062830dlR.class, containerID);
                interfaceC1062830dlR.setData(strLIZIZ);
                completionBlock.onSuccess(interfaceC1062830dlR, "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "value is null", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null) {
                C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
            }
        }
    }
}
