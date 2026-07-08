package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09e9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2420709e9 extends AbstractC2420809eA {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Context context;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            context = interfaceC634840OvC2.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnupb/VWr7cRjfRy17ogN+n4Hj/slCC6Hgm70cyEM5o836c=", null));
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC2420909eB.class, containerID);
            ((InterfaceC2420909eB) xBaseModelLIZJ).setStatus("success");
            completionBlock.onSuccess((InterfaceC2420909eB) xBaseModelLIZJ, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "go to desktop error";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
