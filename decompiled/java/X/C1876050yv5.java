package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IJsbBroadcastService;

/* JADX INFO: renamed from: X.0yv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876050yv5 extends AbstractC1876000yv0 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IJsbBroadcastService iJsbBroadcastService;
        InterfaceC1876010yv1 interfaceC1876010yv1 = (InterfaceC1876010yv1) xBaseParamModel;
        C1876760ywE.LIZIZ(this);
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
                if (interfaceC1876060yv6 instanceof IJsbBroadcastService) {
                    if (interfaceC1876060yv6 != null && (interfaceC1876060yv6 instanceof IJsbBroadcastService) && (iJsbBroadcastService = (IJsbBroadcastService) interfaceC1876060yv6) != null) {
                        try {
                            C13DA c13da = new C13DA();
                            for (InterfaceC1876040yv4 interfaceC1876040yv4 : interfaceC1876010yv1.getParams()) {
                                c13da.put(interfaceC1876040yv4.getKey(), interfaceC1876040yv4.getValue());
                            }
                            iJsbBroadcastService.LIZJ(interfaceC1876010yv1.getEventName(), c13da.build());
                            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1876020yv2.class, null), "");
                            return;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C2382909Vj.LIZ(completionBlock, 0, th.toString(), null, 4);
                            C1876760ywE.LIZ(this, 0, th.toString());
                            return;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        C2382909Vj.LIZ(completionBlock, 0, "PnS JSBridge Kit not initialized.", null, 4);
        C1876760ywE.LIZ(this, 0, "PnS JSBridge Kit not initialized.");
    }
}
