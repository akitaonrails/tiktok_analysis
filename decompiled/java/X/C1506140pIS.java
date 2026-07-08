package X;

import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS212S0000000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pIS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506140pIS extends AbstractC1506100pIO {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(116));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1506130pIR interfaceC1506130pIR = (InterfaceC1506130pIR) C1909107dp.LIZJ(InterfaceC1506130pIR.class, null);
        ((ISubscribeService) this.LLILLL.getValue()).ei();
        n nVarLIZJ = C517110KPt.LIZJ(((InterfaceC1506110pIP) xBaseParamModel).getAnchorID());
        if (nVarLIZJ != null) {
            try {
                interfaceC1506130pIR.setData(C2348809Ig.LIZJ(new JSONObject(nVarLIZJ.toString())));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (interfaceC1506130pIR.getData() == null) {
            interfaceC1506130pIR.setData(new HashMap());
        }
        completionBlock.onSuccess(interfaceC1506130pIR, "");
    }
}
