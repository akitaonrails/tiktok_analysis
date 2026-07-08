package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0pWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515080pWs {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC634840OvC interfaceC634840OvC, CompletionBlock completionBlock, Function2 function2) {
        Object objLIZIZ;
        Activity activityLIZLLL;
        if (interfaceC634840OvC != null) {
            objLIZIZ = interfaceC634840OvC.LIZIZ(PdpViewModel.class);
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            objLIZIZ = null;
            activityLIZLLL = null;
        }
        if ((activityLIZLLL instanceof C19EG) && activityLIZLLL != null && objLIZIZ != null) {
            function2.invoke(activityLIZLLL, objLIZIZ);
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
        }
    }
}
