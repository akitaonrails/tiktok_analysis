package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;

/* JADX INFO: renamed from: X.06fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1667606fy extends AbstractC1667806g0 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1667706fz.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
        InterfaceC1667706fz interfaceC1667706fz = (InterfaceC1667706fz) xBaseModelLIZJ;
        int i = C1667406fw.LIZ[C19212010Ec.LIZJ.LIZJ().ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                i2 = 0;
            } else {
                i2 = 3;
            }
        }
        interfaceC1667706fz.setInboxMode(Integer.valueOf(i2));
        interfaceC1667706fz.setAccountType(C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIILJJIL().LIZIZ(C461720I8s.LIZJ()));
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
