package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547870qNl extends AbstractC1548190qOH {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                C23250099c.LIZLLL(C1064790dob.LIZ(context, null), C0PEM.LIZJ, null, new C1548210qOJ(this, context, completionBlock, null), 2);
            } else {
                C2382909Vj.LIZ(completionBlock, -100, "empty context", null, 4);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            String str = "";
            if (message == null) {
                message = "";
            }
            C2382909Vj.LIZ(completionBlock, -100, message, null, 4);
            C1AF0.LJ(th);
            String message2 = th.getMessage();
            if (message2 != null) {
                str = message2;
            }
            C1725270uzt.LJFF("210", str, null, null);
        }
    }
}
