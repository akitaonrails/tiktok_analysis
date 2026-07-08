package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876330yvX implements InterfaceC1876380yvc {
    public final /* synthetic */ CompletionBlock<InterfaceC1876360yva> LIZ;
    public final /* synthetic */ C1876310yvV LIZIZ;

    @Override // X.InterfaceC1876380yvc
    public final void onSuccess() {
        this.LIZ.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1876360yva.class, null), "");
    }

    @Override // X.InterfaceC1876380yvc
    public final void LJIIJ(String str) {
        C2382909Vj.LIZ(this.LIZ, 0, str, null, 4);
        C1876760ywE.LIZ(this.LIZIZ, 0, str);
    }

    public C1876330yvX(CompletionBlock<InterfaceC1876360yva> completionBlock, C1876310yvV c1876310yvV) {
        this.LIZ = completionBlock;
        this.LIZIZ = c1876310yvV;
    }
}
