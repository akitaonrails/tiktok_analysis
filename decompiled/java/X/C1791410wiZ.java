package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0wiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791410wiZ extends AbstractC1791450wid {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC1791430wib interfaceC1791430wib = (InterfaceC1791430wib) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            C352701Yn.LIZ(activityLIZLLL, new C1789800wfy(interfaceC1791430wib, activityLIZLLL, null), new AwS393S0200000_27(this, (C1791410wiZ) completionBlock, (CompletionBlock<InterfaceC1791440wic>) 75));
        } else {
            C2382909Vj.LIZ(completionBlock, -1, "context is null", null, 4);
        }
    }
}
