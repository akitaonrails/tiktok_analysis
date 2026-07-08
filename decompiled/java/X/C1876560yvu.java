package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IACFeedsService;

/* JADX INFO: renamed from: X.0yvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876560yvu extends AbstractC1876630yw1 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC1876650yw3 interfaceC1876650yw3 = (InterfaceC1876650yw3) xBaseParamModel;
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
                            ((IACFeedsService) interfaceC1876060yv6).LIZ(activityLIZLLL, interfaceC1876650yw3, new C1876620yw0(completionBlock, interfaceC1876650yw3, this));
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
