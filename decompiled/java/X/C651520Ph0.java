package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.network.INetwork;

/* JADX INFO: renamed from: X.0Ph0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651520Ph0 extends AbstractC651530Ph1 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        try {
            INetwork iNetwork = (INetwork) C647490PaV.LIZ.getValue();
            if (iNetwork != null) {
                long jLIZIZ = iNetwork.LIZIZ();
                if (jLIZIZ > 0) {
                    InterfaceC651540Ph2 interfaceC651540Ph2 = (InterfaceC651540Ph2) C1909107dp.LIZJ(InterfaceC651540Ph2.class, "GetServerTime");
                    interfaceC651540Ph2.setServerTimestamp(Long.valueOf(jLIZIZ));
                    completionBlock.onSuccess(interfaceC651540Ph2, "");
                    return;
                }
            }
            ((InterfaceC651540Ph2) C1909107dp.LIZJ(InterfaceC651540Ph2.class, "GetServerTime")).setServerTimestamp(0L);
            C2382909Vj.LIZ(completionBlock, 0, "Failed to get server time", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((InterfaceC651540Ph2) C1909107dp.LIZJ(InterfaceC651540Ph2.class, "GetServerTime")).setServerTimestamp(0L);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Get server time as exception: ");
            sbLIZ.append(e.getMessage());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
