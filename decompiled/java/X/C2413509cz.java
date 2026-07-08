package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.09cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2413509cz extends AbstractC2413609d0 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        Object c098200Yq;
        String str = "";
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, -3, "context is null", null, 4);
            return;
        }
        try {
            Intent intent = new Intent("android.settings.SETTINGS");
            intent.addFlags(268435456);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAxDA8/M+lr+IA3DTCe30HggC6g7uRDsQlq1/int0tgGQBmog=", null));
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC2413809d2.class, null), "");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return;
        }
        String message = thM5exceptionOrNullimpl.getMessage();
        if (message != null) {
            str = message;
        }
        C2382909Vj.LIZ(completionBlock, -3, str, null, 4);
    }
}
