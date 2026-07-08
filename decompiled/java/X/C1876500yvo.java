package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IACFeedsService;

/* JADX INFO: renamed from: X.0yvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876500yvo extends AbstractC1876530yvr {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC1876540yvs interfaceC1876540yvs = (InterfaceC1876540yvs) xBaseParamModel;
        C1876760ywE.LIZIZ(this);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            C1876250yvP.LIZ.getClass();
            InterfaceC1876060yv6[] interfaceC1876060yv6Arr = C1876250yvP.LIZIZ;
            if (interfaceC1876060yv6Arr != null) {
                int length = interfaceC1876060yv6Arr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    InterfaceC1876060yv6 interfaceC1876060yv6 = interfaceC1876060yv6Arr[i];
                    if (interfaceC1876060yv6 instanceof IACFeedsService) {
                        if (interfaceC1876060yv6 != null) {
                            ((IACFeedsService) interfaceC1876060yv6).LJI(activityLIZLLL, interfaceC1876540yvs, new C1876510yvp(completionBlock, interfaceC1876540yvs, this));
                            return;
                        }
                    } else {
                        i++;
                    }
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "PnS JSBridge Kit not initialized.", null, 4);
            C1876760ywE.LIZ(this, 0, "PnS JSBridge Kit not initialized.");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Can not find activity.", null, 4);
        C1876760ywE.LIZ(this, 0, "Can not find activity.");
    }
}
