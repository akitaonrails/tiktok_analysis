package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1503860pEm extends AbstractC1503870pEn {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        LifecycleOwner lifecycleOwner;
        InterfaceC1503850pEl interfaceC1503850pEl = (InterfaceC1503850pEl) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != 0) {
            if (!a0.LJJJIL(interfaceC1503850pEl.getEvent()) && !a0.LJJJIL(interfaceC1503850pEl.getRegion()) && !a0.LJJJIL(interfaceC1503850pEl.getRiskInfo())) {
                if ((activityLIZLLL instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) activityLIZLLL) != null) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C1503840pEk(activityLIZLLL, interfaceC1503850pEl, completionBlock, null), 3);
                    return;
                } else {
                    C2382909Vj.LIZ(completionBlock, 0, "Lifecycle not available", null, 4);
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, -3, "Invalid params", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
    }
}
