package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IWHFeedsService;

/* JADX INFO: renamed from: X.0yvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876570yvv extends AbstractC1876720ywA {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0yw2] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        final InterfaceC1876740ywC interfaceC1876740ywC = (InterfaceC1876740ywC) xBaseParamModel;
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
                    if (interfaceC1876060yv6 instanceof IWHFeedsService) {
                        if (interfaceC1876060yv6 != null) {
                            ((IWHFeedsService) interfaceC1876060yv6).LJIIL(activityLIZLLL, interfaceC1876740ywC, new InterfaceC1876240yvO<InterfaceC1876690yw7>() { // from class: X.0yw2
                                @Override // X.InterfaceC1876240yvO
                                public final void onSuccess(InterfaceC1876690yw7 interfaceC1876690yw7) {
                                    InterfaceC1876690yw7 interfaceC1876690yw72 = interfaceC1876690yw7;
                                    CompletionBlock<InterfaceC1876690yw7> completionBlock2 = completionBlock;
                                    if (interfaceC1876690yw72 == null) {
                                        interfaceC1876690yw72 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1876690yw7.class, interfaceC1876740ywC.getReactId());
                                    }
                                    completionBlock2.onSuccess(interfaceC1876690yw72, "");
                                }

                                @Override // X.InterfaceC1876240yvO
                                public final void onFail(int i2, String str) {
                                    C2382909Vj.LIZ(completionBlock, i2, str, null, 4);
                                    C1876760ywE.LIZ(this, i2, str);
                                }
                            });
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
