package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nhv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C601130Nhv extends AbstractC601140Nhw {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Number playAction = ((InterfaceC601150Nhx) xBaseParamModel).getPlayAction();
        if (Intrinsics.LJFF(playAction, 2)) {
            C1483410ohn.LJLJJI().LJFF();
        } else if (Intrinsics.LJFF(playAction, 1)) {
            C1483410ohn.LJLJJI().LJIILLIIL();
        } else if (Intrinsics.LJFF(playAction, 0)) {
            C1483410ohn.LJLJJI().LIZ();
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC601160Nhy.class, containerID), "");
    }
}
