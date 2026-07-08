package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;

/* JADX INFO: renamed from: X.0uwu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723420uwu extends AbstractC1723430uwv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String str = "";
        InterfaceC1723450uwx interfaceC1723450uwx = (InterfaceC1723450uwx) xBaseParamModel;
        try {
            ((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).init();
            InterfaceC1723440uww interfaceC1723440uww = (InterfaceC1723440uww) C1909107dp.LIZJ(InterfaceC1723440uww.class, null);
            C1716520ulm c1716520ulmLJIILJJIL = ((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).LJIILJJIL(interfaceC1723450uwx.getOriginSchema(), interfaceC1723450uwx.getScene());
            interfaceC1723440uww.setPipoSchema(c1716520ulmLJIILJJIL.LIZ);
            interfaceC1723440uww.setJumpToPipo(Boolean.valueOf(c1716520ulmLJIILJJIL.LIZIZ));
            completionBlock.onSuccess(interfaceC1723440uww, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            C2382909Vj.LIZ(completionBlock, -100, message, null, 4);
            C1AF0.LJ(th);
            String message2 = th.getMessage();
            if (message2 != null) {
                str = message2;
            }
            C1725270uzt.LJFF("210", str, null, null);
        }
    }
}
