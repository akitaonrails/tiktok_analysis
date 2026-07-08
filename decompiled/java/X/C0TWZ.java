package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TWZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TWZ extends C0TWY {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC748060TWa interfaceC748060TWa = (InterfaceC748060TWa) xBaseParamModel;
        C1544050qHb c1544050qHb = C1544050qHb.LIZ;
        String jsbSecureDataflowId = interfaceC748060TWa.getJsbSecureDataflowId();
        String name = getName();
        c1544050qHb.getClass();
        C443120HZe c443120HZeLIZ = C1544050qHb.LIZ(jsbSecureDataflowId, name);
        if (c443120HZeLIZ.getSecond() == null) {
            C2382909Vj.LIZ(completionBlock, 0, (String) c443120HZeLIZ.getThird(), null, 4);
            return;
        }
        String content = interfaceC748060TWa.getContent();
        if (content != null && content.length() != 0) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                try {
                    Cert certFindCert = CertProviderManagerKt.findCert("bpea-jsb_clipboard", 1476399152);
                    certFindCert.attachCustomInfo("x-tt-hybrid-referer", getHybridUrl(enumC1063300dmC));
                    C20145813s8.LIZ(content, content, context, certFindCert);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2344809Gs.LIZ(e);
                    C2382909Vj.LIZ(completionBlock, 0, "copy to clipboard error occur!", null, 4);
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0TWX.class, null);
                ((C0TWX) xBaseModelLIZJ).setCode(1);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "content or toastMsg is empty", null, 4);
    }
}
