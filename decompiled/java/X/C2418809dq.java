package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS404S0200000_3;

/* JADX INFO: renamed from: X.09dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2418809dq extends AbstractC2418709dp {
    public C11JF LLILLL;

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        C2419209du.LIZ(view, getHybridUrl(enumC1063300dmC), enumC1063300dmC, completionBlock, "TtlsJumpSystemSettingsMethod", new AwS404S0200000_3(this, (C2418809dq) completionBlock, (CompletionBlock<InterfaceC2419009ds>) 60));
    }
}
