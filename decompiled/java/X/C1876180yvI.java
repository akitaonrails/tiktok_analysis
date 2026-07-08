package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876180yvI implements InterfaceC1876240yvO<InterfaceC1876200yvK> {
    public final /* synthetic */ CompletionBlock<InterfaceC1876200yvK> LIZ;
    public final /* synthetic */ C1876150yvF LIZIZ;

    @Override // X.InterfaceC1876240yvO
    public final void onSuccess(InterfaceC1876200yvK interfaceC1876200yvK) {
        String containerID;
        CompletionBlock<InterfaceC1876200yvK> completionBlock = this.LIZ;
        InterfaceC634840OvC interfaceC634840OvC = this.LIZIZ.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1876200yvK.class, containerID), "");
    }

    public C1876180yvI(CompletionBlock<InterfaceC1876200yvK> completionBlock, C1876150yvF c1876150yvF) {
        this.LIZ = completionBlock;
        this.LIZIZ = c1876150yvF;
    }

    @Override // X.InterfaceC1876240yvO
    public final void onFail(int i, String str) {
        C2382909Vj.LIZ(this.LIZ, i, str, null, 4);
    }
}
