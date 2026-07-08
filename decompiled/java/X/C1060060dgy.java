package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dgy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1060060dgy extends AbstractC1060070dgz {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        return true;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String strValueOf;
        String containerID;
        InterfaceC1060080dh0 interfaceC1060080dh0 = (InterfaceC1060080dh0) xBaseParamModel;
        try {
            if (interfaceC1060080dh0.getKey() == null) {
                strValueOf = "";
            } else {
                strValueOf = String.valueOf(interfaceC1060080dh0.getKey());
            }
            String strLIZIZ = C596440NaM.LIZ.LIZIZ(strValueOf, "");
            if (!TextUtils.isEmpty(strLIZIZ)) {
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                } else {
                    containerID = null;
                }
                InterfaceC1060090dh1 interfaceC1060090dh1 = (InterfaceC1060090dh1) C1909107dp.LIZJ(InterfaceC1060090dh1.class, containerID);
                interfaceC1060090dh1.setData(strLIZIZ);
                completionBlock.onSuccess(interfaceC1060090dh1, "");
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
