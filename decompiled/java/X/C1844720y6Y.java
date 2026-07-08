package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* JADX INFO: renamed from: X.0y6Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844720y6Y implements InterfaceC1848330yCN {
    public CompletionBlock<InterfaceC1801630wz3> LIZ;
    public final /* synthetic */ C1844710y6X LIZIZ;

    @Override // X.InterfaceC1848330yCN
    public final void LIZ() {
    }

    public C1844720y6Y(C1844710y6X c1844710y6X) {
        this.LIZIZ = c1844710y6X;
    }

    @Override // X.InterfaceC1848330yCN
    public final void LIZIZ(InterfaceC1553650qX5 interfaceC1553650qX5) {
        CompletionBlock<InterfaceC1801630wz3> completionBlock = this.LIZ;
        if (completionBlock != null) {
            this.LIZIZ.getClass();
            completionBlock.onSuccess(C1844710y6X.LIZJ(interfaceC1553650qX5), "");
        }
    }
}
