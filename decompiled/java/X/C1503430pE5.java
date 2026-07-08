package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0pE5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1503430pE5 extends AbstractC1503410pE3 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws Throwable {
        String containerID;
        InterfaceC1503420pE4 interfaceC1503420pE4 = (InterfaceC1503420pE4) xBaseParamModel;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1503440pE6.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
        InterfaceC1503440pE6 interfaceC1503440pE6 = (InterfaceC1503440pE6) xBaseModelLIZJ;
        String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), interfaceC1503420pE4.getUrl(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLl4C581ld/gqDkq/bS3WfSFnrLGvQ8L4VycxAQz1v2kU5API9RF6nbkV2k=", null));
        if (strLLIZ == null) {
            strLLIZ = "";
        }
        interfaceC1503440pE6.setCookie(strLLIZ);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
