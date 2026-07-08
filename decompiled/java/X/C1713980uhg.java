package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.verify.IPipoVerifyCenterService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713980uhg extends AbstractC1714000uhi {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C19EG c19eg;
        IPipoVerifyCenterService iPipoVerifyCenterService;
        Activity activityLIZLLL = null;
        C1713520ugw c1713520ugw = new C1713520ugw(new C1713590uh3(new C1713840uhS((n) null, 3), null, ((InterfaceC1714020uhk) xBaseParamModel).getVerifyInfo()), new C1714040uhm(EnumC1714450uiR.HALF_PAGE, null, null, null, null, false, null, 126), null, 4);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        }
        if ((activityLIZLLL instanceof C19EG) && (c19eg = (C19EG) activityLIZLLL) != null && (iPipoVerifyCenterService = (IPipoVerifyCenterService) PluggableExtentionKt.pluggableSpi$default(IPipoVerifyCenterService.class, false, false, false, 14, null)) != null) {
            iPipoVerifyCenterService.LIZ(c19eg, c1713520ugw, new InterfaceC1713650uh9() { // from class: X.0uhh
                @Override // X.InterfaceC1713650uh9
                public final void LIZ(C1713690uhD c1713690uhD) {
                    String containerID;
                    InterfaceC634840OvC interfaceC634840OvC2 = this.LIZ.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        containerID = interfaceC634840OvC2.getContainerID();
                    } else {
                        containerID = null;
                    }
                    InterfaceC1714010uhj interfaceC1714010uhj = (InterfaceC1714010uhj) C1909107dp.LIZJ(InterfaceC1714010uhj.class, containerID);
                    interfaceC1714010uhj.setResult(c1713690uhD.LIZIZ);
                    if (Intrinsics.LJFF(c1713690uhD.LIZIZ, "PASS")) {
                        interfaceC1714010uhj.setSuccess(Boolean.TRUE);
                        completionBlock.onSuccess(interfaceC1714010uhj, "");
                    } else {
                        interfaceC1714010uhj.setSuccess(Boolean.FALSE);
                        completionBlock.onSuccess(interfaceC1714010uhj, "");
                    }
                }
            });
        }
    }
}
