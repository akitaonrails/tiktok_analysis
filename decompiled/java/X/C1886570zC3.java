package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zC3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886570zC3 extends AbstractC1886590zC5 {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(795));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC1886580zC4 interfaceC1886580zC4 = (InterfaceC1886580zC4) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            ((ICredentialManagerService) this.LLILLL.getValue()).LJIJ(activityLIZLLL, interfaceC1886580zC4.getPasskeyData(), !interfaceC1886580zC4.getAllowQRCodeFallback(), new C1886600zC6(completionBlock));
        }
    }
}
