package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Window;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09WP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09WP extends C09WQ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZ;
        Window window;
        String containerID;
        Context context;
        String strValueOf = String.valueOf(((C09WR) xBaseParamModel).getEnable());
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
            if (activityLIZ == null) {
                window = null;
            } else {
                window = activityLIZ.getWindow();
            }
            C1323040kX8.LIZIZ(activityLIZ, window, TextUtils.equals(strValueOf, "true"));
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            completionBlock.onSuccess((C09WS) C1909107dp.LIZJ(C09WS.class, containerID), "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null) {
                C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
            }
        }
    }
}
