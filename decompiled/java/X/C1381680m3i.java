package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.internalshare.impl.sharetouser.ShareToUserSheet;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: renamed from: X.0m3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381680m3i extends AbstractC1381690m3j {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1381700m3k interfaceC1381700m3k = (InterfaceC1381700m3k) xBaseParamModel;
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                C1752206tc c1752206tc = ShareToUserSheet.LLJJIJIIJIL;
                String uid = interfaceC1381700m3k.getUid();
                String contentPb = interfaceC1381700m3k.getContentPb();
                String scene = interfaceC1381700m3k.getScene();
                AwS387S0200000_21 awS387S0200000_21 = new AwS387S0200000_21(completionBlock, (CompletionBlock<InterfaceC1381710m3l>) this, (C1381680m3i) 91);
                c1752206tc.getClass();
                C1752206tc.LIZ(uid, context, contentPb, scene, null, awS387S0200000_21);
                return;
            }
            throw new Exception("No context");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
