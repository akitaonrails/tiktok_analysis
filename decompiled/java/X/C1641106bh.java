package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1641106bh extends AbstractC1641006bg {
    public final C054G LLILLL = C2296808zG.LIZ(C0PEM.LIZJ);

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1641206bi interfaceC1641206bi = (InterfaceC1641206bi) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
            if (Intrinsics.LJFF(interfaceC1641206bi.getScenario(), "followUser")) {
                C23250099c.LIZLLL(this.LLILLL, null, null, new C1640906bf(this, interfaceC1641206bi, null), 3);
            } else {
                C1440005kM.LIZ(new C1641406bk(getName(), containerID, interfaceC1641206bi));
            }
        }
    }
}
