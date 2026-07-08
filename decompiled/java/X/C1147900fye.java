package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147900fye extends AbstractC1147920fyg {
    public final void LIZJ(CompletionBlock<InterfaceC1147930fyh> completionBlock) {
        String containerID;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String strLJIILL = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1147930fyh interfaceC1147930fyh = (InterfaceC1147930fyh) C1909107dp.LIZJ(InterfaceC1147930fyh.class, containerID);
        try {
            Gson gson = C19748512Ol.LIZJ;
            C1126800fQc.LIZ.KE0().getClass();
            strLJIILL = gson.LJIILL(TaskManagerV2.LIZLLL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        interfaceC1147930fyh.setTaskData(strLJIILL);
        completionBlock.onSuccess(interfaceC1147930fyh, "");
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1147910fyf interfaceC1147910fyf = (InterfaceC1147910fyf) xBaseParamModel;
        String type = interfaceC1147910fyf.getType();
        if (Intrinsics.LJFF(type, "request")) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1147890fyd(interfaceC1147910fyf, this, completionBlock, null), 3);
        } else if (Intrinsics.LJFF(type, "get")) {
            LIZJ(completionBlock);
        } else {
            C2382909Vj.LIZ(completionBlock, -3, "The type is not 'get' or 'request'.", null, 4);
        }
    }
}
