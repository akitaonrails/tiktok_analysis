package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IWHFeedsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0yvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876580yvw extends AbstractC1876600yvy {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0yvx] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        final InterfaceC1876610yvz interfaceC1876610yvz = (InterfaceC1876610yvz) xBaseParamModel;
        interfaceC1876610yvz.getReactId();
        interfaceC1876610yvz.getLoadBehavior();
        List<InterfaceC1876680yw6> awemeList = interfaceC1876610yvz.getAwemeList();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(awemeList, 10));
        Iterator<InterfaceC1876680yw6> it2 = awemeList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAwemeId());
        }
        C1876760ywE.LIZIZ(this);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && interfaceC634840OvC.LIZLLL() != null) {
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
                            ((IWHFeedsService) interfaceC1876060yv6).LJII(interfaceC1876610yvz, new InterfaceC1876240yvO<Object>() { // from class: X.0yvx
                                @Override // X.InterfaceC1876240yvO
                                public final void onSuccess(Object obj) {
                                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1876670yw5.class, interfaceC1876610yvz.getReactId()), "");
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
