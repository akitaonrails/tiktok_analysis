package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS277S0300000_33;

/* JADX INFO: renamed from: X.1AG0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AG0 extends AbstractC2176491AFz {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        InterfaceC2176481AFy interfaceC2176481AFy = (InterfaceC2176481AFy) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        C2419209du.LIZ(view, getHybridUrl(enumC1063300dmC), enumC1063300dmC, completionBlock, "TtlsLocationPermissionPreCheckMethod", new AwS277S0300000_33(this, (C1AG0) interfaceC2176481AFy, (InterfaceC2176481AFy) completionBlock, (CompletionBlock<C1AG1>) 5));
    }
}
