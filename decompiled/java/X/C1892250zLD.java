package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zLD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892250zLD extends AbstractC1892210zL9 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C21210517zT c21210517zT;
        InterfaceC1892240zLC interfaceC1892240zLC = (InterfaceC1892240zLC) xBaseParamModel;
        if (Intrinsics.LJFF(interfaceC1892240zLC.getEventName(), "rd_tiktokec_meaningful_rendered")) {
            try {
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null && (c21210517zT = (C21210517zT) interfaceC634840OvC.LIZIZ(C21210517zT.class)) != null) {
                    C421580Gg0.LIZ(new AwS429S0200000_28(c21210517zT, interfaceC1892240zLC, 159));
                }
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1892220zLA.class, null), "");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
            }
        }
    }
}
