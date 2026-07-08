package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0wux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799090wux extends AbstractC1799050wut {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        long jLIZ;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1799060wuu interfaceC1799060wuu = (InterfaceC1799060wuu) C1909107dp.LIZJ(InterfaceC1799060wuu.class, containerID);
        C2431609fu.LIZ.getClass();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            jLIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getRegisterTime() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        } else {
            jLIZ = C1514430pVp.LIZ();
        }
        interfaceC1799060wuu.setInstallOrRegisterTime(Long.valueOf(jLIZ));
        completionBlock.onSuccess(interfaceC1799060wuu, "");
    }
}
