package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.VenmoProcess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03jB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C923103jB extends AbstractC923203jC {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String strJ3;
        InterfaceC923303jD interfaceC923303jD = (InterfaceC923303jD) xBaseParamModel;
        try {
            if (Intrinsics.LJFF(C923003jA.LIZ().jsSdkExtractCorrelation, Boolean.TRUE)) {
                strJ3 = interfaceC923303jD.getDeviceData().getCorrelationId();
            } else {
                strJ3 = C786410Ut5.J3(interfaceC923303jD.getDeviceData().toJSON());
            }
            VenmoProcess.LIZ.getClass();
            VenmoProcess.LIZLLL(strJ3);
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC924303jN.class, null);
            ((InterfaceC924303jN) xBaseModelLIZJ).setCode(1);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SendVenmoDeviceDataMethod error: ");
            sbLIZ.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZJ(strLIZIZ);
            VenmoProcess.LIZ.getClass();
            VenmoProcess.LIZLLL(null);
            C2382909Vj.LIZ(completionBlock, 0, String.valueOf(e), null, 4);
        }
    }
}
