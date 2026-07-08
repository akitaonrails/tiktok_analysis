package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ywz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877230ywz extends AbstractC1877190ywv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1877240yx0 interfaceC1877240yx0;
        InterfaceC1877250yx1 interfaceC1877250yx1LIZ;
        InterfaceC1877250yx1 interfaceC1877250yx1LIZ2;
        InterfaceC1877200yww interfaceC1877200yww = (InterfaceC1877200yww) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            interfaceC1877240yx0 = (InterfaceC1877240yx0) interfaceC634840OvC.LIZIZ(InterfaceC1877240yx0.class);
        } else {
            interfaceC1877240yx0 = null;
        }
        String event = interfaceC1877200yww.getEvent();
        if (Intrinsics.LJFF(event, "hideVConsole")) {
            if (interfaceC1877240yx0 != null && (interfaceC1877250yx1LIZ2 = interfaceC1877240yx0.LIZ()) != null) {
                interfaceC1877250yx1LIZ2.LIZIZ();
            }
        } else if (Intrinsics.LJFF(event, "onVConsoleReady") && interfaceC1877240yx0 != null && (interfaceC1877250yx1LIZ = interfaceC1877240yx0.LIZ()) != null) {
            interfaceC1877250yx1LIZ.LJIIIIZZ();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1877210ywx.class, null), "");
    }
}
