package X;

import android.nfc.NfcAdapter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ugh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713370ugh extends AbstractC1713350ugf {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        InterfaceC1713360ugg interfaceC1713360ugg = (InterfaceC1713360ugg) xBaseParamModel;
        try {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1713380ugi.class, null);
            InterfaceC1713380ugi interfaceC1713380ugi = (InterfaceC1713380ugi) xBaseModelLIZJ;
            if (NfcAdapter.getDefaultAdapter(C1717770unn.LIZJ().getApplicationContext()) == null) {
                interfaceC1713380ugi.setStatus("DeviceNotSupportedNFC");
            } else if (!NfcAdapter.getDefaultAdapter(C1717770unn.LIZJ().getApplicationContext()).isEnabled()) {
                interfaceC1713380ugi.setStatus("NFCDisabled");
            } else if (!((IPipoCcdcService) ServiceManager.get().getService(IPipoCcdcService.class)).LJIIIIZZ(C1717770unn.LIZJ().getApplicationContext(), interfaceC1713360ugg.getEnterFrom())) {
                interfaceC1713380ugi.setStatus("FeatureDisabled");
            } else {
                interfaceC1713380ugi.setStatus("Available");
            }
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C2382909Vj.LIZ(completionBlock, 0, C1717770unn.LIZJ().getApplicationContext().getString(2131834217), null, 4);
        }
    }
}
