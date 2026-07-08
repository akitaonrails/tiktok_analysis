package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09WL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09WL extends C09WM {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        String containerID;
        String strValueOf = String.valueOf(((C09WN) xBaseParamModel).getEnable());
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                Activity activityLIZ = C1388190mED.LIZ(context);
                C1323040kX8.LIZIZ(activityLIZ, activityLIZ.getWindow(), TextUtils.equals(strValueOf, "true"));
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID = null;
                }
                completionBlock.onSuccess((C09WO) C1909107dp.LIZJ(C09WO.class, containerID), "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, -1, "context is null", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null) {
                C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
            }
        }
    }
}
