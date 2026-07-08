package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747740TUu extends AbstractC747750TUv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        Object objH2;
        Context context;
        String content = ((InterfaceC747760TUw) xBaseParamModel).getContent();
        if (content != null && content.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "content is empty", null, 4);
            return;
        }
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                objH2 = C786410Ut5.H2(context, "clipboard");
            } else {
                objH2 = null;
            }
            C20145713s7.LIZJ((ClipboardManager) objH2, ClipData.newPlainText(content, content), CertProviderManagerKt.findCert("bpea-593", 1476399128));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC747770TUx.class, null), "");
    }
}
