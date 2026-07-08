package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0wiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791400wiY extends AbstractC1791480wig {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC1791390wiX interfaceC1791390wiX = (InterfaceC1791390wiX) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            C352701Yn.LIZ(activityLIZLLL, new C1789280wf8(interfaceC1791390wiX, activityLIZLLL, null), new AwS393S0200000_27(completionBlock, (CompletionBlock<InterfaceC1791490wih>) this, (C1791400wiY) 77));
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "Activity is null", null, 4);
        }
    }
}
