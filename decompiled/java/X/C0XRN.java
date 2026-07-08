package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XRN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XRN extends C0XRO {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        C0XRP c0xrp = (C0XRP) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "spark context is null", null, 4);
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            C2382909Vj.LIZ(completionBlock, 0, "spark context must be lifecycleOwner", null, 4);
            return;
        }
        try {
            C0XRL.LIZ(c19egLIZIZ).LIZJ(c0xrp.getAudioUrl());
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0XRQ.class, null);
            ((C0XRQ) xBaseModelLIZJ).setAudioUrl(c0xrp.getAudioUrl());
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop audio: ");
            sbLIZ.append(c0xrp.getAudioUrl());
            sbLIZ.append(" error: ");
            sbLIZ.append(th.getMessage());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
